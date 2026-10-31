package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import ig.h0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m4.n0;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h6;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.kf;
import org.telegram.messenger.u20;
import org.telegram.messenger.v20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.w0;
import org.telegram.messenger.x20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<v20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<v20> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i10 = convertVideoParams.resultWidth;
            this.W = i10;
            int i11 = convertVideoParams.resultHeight;
            this.H = i11;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i10 * 0.125f, i11 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                v20 v20Var = this.mediaEntities.get(i12);
                byte b10 = v20Var.a;
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(v20Var);
                } else if (b10 == 1) {
                    initTextEntity(v20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(v20 v20Var, Bitmap bitmap, int i10) {
            if (bitmap == null || v20Var == null) {
                return;
            }
            if (v20Var.s == 0.0f && i10 == 0) {
                return;
            }
            if (v20Var.L == null) {
                v20Var.L = new Canvas(bitmap);
            }
            if (v20Var.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * v20Var.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                v20Var.L.drawPath(this.path, this.xRefPaint);
            }
            if (i10 != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i10);
                v20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, v20 v20Var, int i10, long j10) {
            v20 v20Var2;
            Canvas canvas2;
            long j11;
            RLottieNative rLottieNative = v20Var.D;
            int i11 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = v20Var.G;
                if (bitmap == null || v20Var.U <= 0 || v20Var.V <= 0) {
                    return;
                }
                rLottieNative.c((int) v20Var.E, bitmap, true);
                Bitmap bitmap2 = v20Var.G;
                if ((v20Var.b & 8) == 0) {
                    i10 = 0;
                }
                applyRoundRadius(v20Var, bitmap2, i10);
                canvas.drawBitmap(v20Var.G, v20Var.H, this.bitmapPaint);
                float f7 = v20Var.E + v20Var.F;
                v20Var.E = f7;
                if (f7 >= v20Var.D.a[0]) {
                    v20Var.E = 0.0f;
                    return;
                }
                return;
            }
            if (v20Var.J != null) {
                float f10 = v20Var.E;
                int i12 = (int) f10;
                float f11 = f10 + v20Var.F;
                v20Var.E = f11;
                for (int i13 = (int) f11; i12 != i13; i13--) {
                    v20Var.J.r(true);
                }
                p5 p5Var = v20Var.J.w;
                Bitmap bitmap3 = p5Var != null ? p5Var.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, v20Var.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(v20Var.G, v20Var.H, this.bitmapPaint);
            ArrayList arrayList = v20Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i11 < v20Var.k.size()) {
                u20 u20Var = (u20) v20Var.k.get(i11);
                if (u20Var == null || (v20Var2 = u20Var.b) == null) {
                    canvas2 = canvas;
                    j11 = j10;
                } else {
                    canvas2 = canvas;
                    j11 = j10;
                    drawEntity(canvas2, v20Var2, v20Var.l, j11);
                }
                i11++;
                canvas = canvas2;
                j10 = j11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(v20 v20Var) {
            int i10;
            int i11 = (int) (v20Var.f * this.W);
            v20Var.U = i11;
            int i12 = (int) (v20Var.g * this.H);
            v20Var.V = i12;
            if (i11 > 512) {
                v20Var.V = (int) ((i12 / i11) * 512.0f);
                v20Var.U = 512;
            }
            int i13 = v20Var.V;
            if (i13 > 512) {
                v20Var.U = (int) ((v20Var.U / i13) * 512.0f);
                v20Var.V = 512;
            }
            byte b10 = v20Var.b;
            if ((b10 & 1) != 0) {
                int i14 = v20Var.U;
                if (i14 <= 0 || (i10 = v20Var.V) <= 0) {
                    return;
                }
                v20Var.G = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                RLottieNative a2 = RLottieNative.a(v20Var.j, null, null, null, 0, null);
                v20Var.D = a2;
                v20Var.F = a2 != null ? a2.a[1] / this.fps : 0.0f;
            } else if ((b10 & 4) != 0) {
                v20Var.K = false;
                s5 s5Var = new s5(new File(v20Var.j), true, 0L, 0, null, null, null, 0L, d20.s0, true, 512, 512, null, 0, true);
                v20Var.J = s5Var;
                v20Var.F = s5Var.d[5] / this.fps;
                v20Var.E = 1.0f;
                s5Var.r(true);
            } else {
                String str = v20Var.j;
                if (!TextUtils.isEmpty(v20Var.t) && (v20Var.b & 16) != 0) {
                    str = v20Var.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (v20Var.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                v20Var.G = decodeFile;
                if (v20Var.a == 2 && decodeFile != null) {
                    v20Var.s = i0.L(12.0f) / Math.min(v20Var.q, v20Var.r);
                    Pair N0 = i0.N0(v20Var.j);
                    v20Var.e = (float) (v20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f7 = v20Var.c;
                        float f10 = v20Var.f;
                        float f11 = (f10 / 2.0f) + f7;
                        float f12 = v20Var.d;
                        float f13 = v20Var.g;
                        float f14 = (f13 / 2.0f) + f12;
                        float f15 = this.W;
                        float f16 = this.H;
                        float f17 = (f10 * f15) / f16;
                        float f18 = (f13 * f16) / f15;
                        v20Var.f = f18;
                        v20Var.g = f17;
                        v20Var.c = f11 - (f18 / 2.0f);
                        v20Var.d = f14 - (f17 / 2.0f);
                    }
                    applyRoundRadius(v20Var, v20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / v20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f19 = v20Var.g;
                        float f20 = f19 / width;
                        v20Var.d = c3.i0.B(f19, f20, 2.0f, v20Var.d);
                        v20Var.g = f20;
                    } else if (width < 1.0f) {
                        float f21 = v20Var.f;
                        float f22 = width * f21;
                        v20Var.c = c3.i0.B(f21, f22, 2.0f, v20Var.c);
                        v20Var.f = f22;
                    }
                }
            }
            setupMatrix(v20Var);
        }

        private void initTextEntity(final v20 v20Var) {
            h6[] h6VarArr;
            Typeface d;
            final jg.b bVar = new jg.b(w0.b);
            bVar.getPaint().setAntiAlias(true);
            bVar.G = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(i0.L(7.0f), i0.L(7.0f), i0.L(7.0f), i0.L(7.0f));
            h0 h0Var = v20Var.n;
            if (h0Var != null && (d = h0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, v20Var.m);
            SpannableString spannableString = new SpannableString(v20Var.j);
            ArrayList arrayList = v20Var.k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                final u20 u20Var = (u20) arrayList.get(i10);
                if (u20Var.a != null) {
                    v20 v20Var2 = new v20();
                    u20Var.b = v20Var2;
                    v20Var2.j = u20Var.a;
                    v20Var2.b = u20Var.c;
                    o5 o5Var = new o5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // org.telegram.ui.Components.o5, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i12, int i13, float f7, int i14, int i15, int i16, Paint paint) {
                            super.draw(canvas, charSequence, i12, i13, f7, i14, i15, i16, paint);
                            v20 v20Var3 = v20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f7)) / v20Var3.q) * v20Var3.f) + v20Var.c;
                            float f10 = v20Var3.d;
                            v20 v20Var4 = v20Var;
                            float f11 = v20Var4.g;
                            float paddingTop = (((((i16 - i14) / 2.0f) + (bVar.getPaddingTop() + i14)) / v20Var4.r) * f11) + f10;
                            if (v20Var4.e != 0.0f) {
                                float f12 = (v20Var4.f / 2.0f) + v20Var4.c;
                                float f13 = (f11 / 2.0f) + v20Var4.d;
                                float f14 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f12;
                                double d11 = (paddingTop - f13) / f14;
                                paddingLeft = ((float) ((Math.cos(-v20Var.e) * d10) - (Math.sin(-v20Var.e) * d11))) + f12;
                                paddingTop = (((float) i0.a.c(-v20Var.e, d11, Math.sin(-v20Var.e) * d10)) * f14) + f13;
                            }
                            v20 v20Var5 = u20Var.b;
                            int i17 = this.measuredSize;
                            v20 v20Var6 = v20Var;
                            float f15 = (i17 / v20Var6.q) * v20Var6.f;
                            v20Var5.f = f15;
                            float f16 = (i17 / v20Var6.r) * v20Var6.g;
                            v20Var5.g = f16;
                            v20Var5.c = paddingLeft - (f15 / 2.0f);
                            v20Var5.d = paddingTop - (f16 / 2.0f);
                            v20Var5.e = v20Var6.e;
                            if (v20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(v20Var5);
                            }
                        }
                    };
                    int i12 = u20Var.offset;
                    spannableString.setSpan(o5Var, i12, u20Var.length + i12, 33);
                }
                i10 = i11;
            }
            CharSequence m10 = k6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (h6VarArr = (h6[]) ((Spanned) m10).getSpans(0, m10.length(), h6.class)) != null) {
                for (h6 h6Var : h6VarArr) {
                    h6Var.b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(v20Var.l);
            int i13 = v20Var.p;
            bVar.setGravity(i13 != 1 ? i13 != 2 ? 19 : 21 : 17);
            int i14 = v20Var.p;
            bVar.setTextAlignment(i14 != 1 ? (i14 == 2 ? !cd.X : cd.X) ? 3 : 2 : 4);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(TLObject.FLAG_28);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(bVar);
            byte b10 = v20Var.b;
            if (b10 == 0) {
                bVar.setFrameColor(v20Var.l);
                bVar.setTextColor(i0.B(v20Var.l) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                bVar.setFrameColor(i0.B(v20Var.l) >= 0.25f ? -1728053248 : -1711276033);
                bVar.setTextColor(v20Var.l);
            } else if (b10 == 2) {
                bVar.setFrameColor(i0.B(v20Var.l) >= 0.25f ? -16777216 : -1);
                bVar.setTextColor(v20Var.l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(v20Var.l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(v20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(v20Var.r, TLObject.FLAG_30));
            bVar.layout(0, 0, v20Var.q, v20Var.r);
            v20Var.G = Bitmap.createBitmap(v20Var.q, v20Var.r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(v20Var.G));
            setupMatrix(v20Var);
        }

        private void setupMatrix(v20 v20Var) {
            s5 s5Var;
            Matrix matrix = new Matrix();
            v20Var.H = matrix;
            Bitmap bitmap = v20Var.G;
            if (bitmap == null && (s5Var = v20Var.J) != null) {
                p5 p5Var = s5Var.w;
                bitmap = p5Var != null ? p5Var.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (v20Var.a != 1 && (v20Var.b & 2) != 0) {
                v20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            v20Var.H.postScale(v20Var.f * this.W, v20Var.g * this.H);
            v20Var.H.postTranslate(v20Var.c * this.W, v20Var.d * this.H);
            v20Var.H.postRotate((float) (((-v20Var.e) / 3.141592653589793d) * 180.0d), ((v20Var.f / 2.0f) + v20Var.c) * this.W, ((v20Var.g / 2.0f) + v20Var.d) * this.H);
        }

        public void draw(Canvas canvas, int i10) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j10 = (1000000000 / this.fps) * i10;
            int size = this.mediaEntities.size();
            for (int i11 = 0; i11 < size; i11++) {
                v20 v20Var = this.mediaEntities.get(i11);
                drawEntity(canvas, v20Var, v20Var.l, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(jg.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean convert(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams, int i10) {
        long j10;
        boolean z10;
        long length;
        kf kfVar;
        int i11;
        int i12;
        kf kfVar2;
        int i13 = convertVideoParams.resultWidth;
        int i14 = convertVideoParams.resultHeight;
        long createEncoder = createEncoder(convertVideoParams.cacheFile.getAbsolutePath(), i13, i14, convertVideoParams.framerate, convertVideoParams.bitrate);
        boolean z11 = true;
        if (createEncoder == 0) {
            return true;
        }
        Bitmap bitmap = null;
        try {
            try {
                bitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getByteCount());
                Canvas canvas = new Canvas(bitmap);
                FrameDrawer frameDrawer = new FrameDrawer(convertVideoParams);
                int ceil = (int) Math.ceil((convertVideoParams.duration / 1000.0d) * convertVideoParams.framerate);
                int i15 = 0;
                while (i15 < ceil) {
                    frameDrawer.draw(canvas, i15);
                    bitmap.copyPixelsToBuffer(allocateDirect);
                    allocateDirect.flip();
                    if (!writeFrame(createEncoder, allocateDirect, i13, i14)) {
                        try {
                            f8.b("webm writeFile error at " + i15 + "/" + ceil);
                            stop(createEncoder);
                            bitmap.recycle();
                            return z11;
                        } catch (Exception e) {
                            e = e;
                            j10 = createEncoder;
                            f8.g(e, z11);
                            stop(j10);
                            if (bitmap != null) {
                            }
                            z10 = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i10 > 0) {
                            }
                            kfVar = convertVideoParams.callback;
                            if (kfVar != null) {
                            }
                            f8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
                            return z10;
                        }
                    }
                    kf kfVar3 = convertVideoParams.callback;
                    if (kfVar3 != null) {
                        i11 = i13;
                        j10 = createEncoder;
                        i12 = i14;
                        try {
                            try {
                                ((n0) kfVar3).k(Math.min(261120L, convertVideoParams.cacheFile.length()), i15 / ceil);
                            } catch (Exception e7) {
                                e = e7;
                                z11 = true;
                                f8.g(e, z11);
                                stop(j10);
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                z10 = true;
                                length = convertVideoParams.cacheFile.length();
                                if (i10 > 0) {
                                }
                                kfVar = convertVideoParams.callback;
                                if (kfVar != null) {
                                }
                                f8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
                                return z10;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            stop(j10);
                            if (bitmap != null) {
                            }
                            throw th;
                        }
                    } else {
                        i11 = i13;
                        j10 = createEncoder;
                        i12 = i14;
                    }
                    if (i15 % 3 == 0 && (kfVar2 = convertVideoParams.callback) != null) {
                        boolean z12 = ((x20) ((n0) kfVar2).a).W;
                    }
                    i15++;
                    i14 = i12;
                    i13 = i11;
                    createEncoder = j10;
                    z11 = true;
                }
                stop(createEncoder);
                bitmap.recycle();
                z10 = false;
            } catch (Throwable th3) {
                th = th3;
                j10 = createEncoder;
                stop(j10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            j10 = createEncoder;
        }
        length = convertVideoParams.cacheFile.length();
        if (i10 > 0 || length <= 261120) {
            kfVar = convertVideoParams.callback;
            if (kfVar != null) {
                ((n0) kfVar).k(length, 1.0f);
            }
            f8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
            return z10;
        }
        int i16 = convertVideoParams.bitrate;
        convertVideoParams.bitrate = (int) ((261120.0f / length) * 0.9f * i16);
        convertVideoParams.cacheFile.delete();
        f8.b("webm encoded too much, got " + length + ", old bitrate = " + i16 + " new bitrate = " + convertVideoParams.bitrate);
        return convert(convertVideoParams, i10 - 1);
    }

    private static native long createEncoder(String str, int i10, int i11, int i12, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i10, int i11);
}
