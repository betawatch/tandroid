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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h6;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.lf;
import org.telegram.messenger.v20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.w0;
import org.telegram.messenger.w20;
import org.telegram.messenger.y20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<w20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<w20> arrayList = new ArrayList<>();
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
                w20 w20Var = this.mediaEntities.get(i12);
                byte b10 = w20Var.a;
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(w20Var);
                } else if (b10 == 1) {
                    initTextEntity(w20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(w20 w20Var, Bitmap bitmap, int i10) {
            if (bitmap == null || w20Var == null) {
                return;
            }
            if (w20Var.s == 0.0f && i10 == 0) {
                return;
            }
            if (w20Var.L == null) {
                w20Var.L = new Canvas(bitmap);
            }
            if (w20Var.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * w20Var.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                w20Var.L.drawPath(this.path, this.xRefPaint);
            }
            if (i10 != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i10);
                w20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, w20 w20Var, int i10, long j10) {
            w20 w20Var2;
            Canvas canvas2;
            long j11;
            RLottieNative rLottieNative = w20Var.D;
            int i11 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = w20Var.G;
                if (bitmap == null || w20Var.U <= 0 || w20Var.V <= 0) {
                    return;
                }
                rLottieNative.c((int) w20Var.E, bitmap, true);
                Bitmap bitmap2 = w20Var.G;
                if ((w20Var.b & 8) == 0) {
                    i10 = 0;
                }
                applyRoundRadius(w20Var, bitmap2, i10);
                canvas.drawBitmap(w20Var.G, w20Var.H, this.bitmapPaint);
                float f7 = w20Var.E + w20Var.F;
                w20Var.E = f7;
                if (f7 >= w20Var.D.a[0]) {
                    w20Var.E = 0.0f;
                    return;
                }
                return;
            }
            if (w20Var.J != null) {
                float f10 = w20Var.E;
                int i12 = (int) f10;
                float f11 = f10 + w20Var.F;
                w20Var.E = f11;
                for (int i13 = (int) f11; i12 != i13; i13--) {
                    w20Var.J.r(true);
                }
                p5 p5Var = w20Var.J.w;
                Bitmap bitmap3 = p5Var != null ? p5Var.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, w20Var.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(w20Var.G, w20Var.H, this.bitmapPaint);
            ArrayList arrayList = w20Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i11 < w20Var.k.size()) {
                v20 v20Var = (v20) w20Var.k.get(i11);
                if (v20Var == null || (w20Var2 = v20Var.b) == null) {
                    canvas2 = canvas;
                    j11 = j10;
                } else {
                    canvas2 = canvas;
                    j11 = j10;
                    drawEntity(canvas2, w20Var2, w20Var.l, j11);
                }
                i11++;
                canvas = canvas2;
                j10 = j11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(w20 w20Var) {
            int i10;
            int i11 = (int) (w20Var.f * this.W);
            w20Var.U = i11;
            int i12 = (int) (w20Var.g * this.H);
            w20Var.V = i12;
            if (i11 > 512) {
                w20Var.V = (int) ((i12 / i11) * 512.0f);
                w20Var.U = 512;
            }
            int i13 = w20Var.V;
            if (i13 > 512) {
                w20Var.U = (int) ((w20Var.U / i13) * 512.0f);
                w20Var.V = 512;
            }
            byte b10 = w20Var.b;
            if ((b10 & 1) != 0) {
                int i14 = w20Var.U;
                if (i14 <= 0 || (i10 = w20Var.V) <= 0) {
                    return;
                }
                w20Var.G = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                RLottieNative a2 = RLottieNative.a(w20Var.j, null, null, null, 0, null);
                w20Var.D = a2;
                w20Var.F = a2 != null ? a2.a[1] / this.fps : 0.0f;
            } else if ((b10 & 4) != 0) {
                w20Var.K = false;
                s5 s5Var = new s5(new File(w20Var.j), true, 0L, 0, null, null, null, 0L, e20.s0, true, 512, 512, null, 0, true);
                w20Var.J = s5Var;
                w20Var.F = s5Var.d[5] / this.fps;
                w20Var.E = 1.0f;
                s5Var.r(true);
            } else {
                String str = w20Var.j;
                if (!TextUtils.isEmpty(w20Var.t) && (w20Var.b & 16) != 0) {
                    str = w20Var.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (w20Var.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                w20Var.G = decodeFile;
                if (w20Var.a == 2 && decodeFile != null) {
                    w20Var.s = i0.L(12.0f) / Math.min(w20Var.q, w20Var.r);
                    Pair N0 = i0.N0(w20Var.j);
                    w20Var.e = (float) (w20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f7 = w20Var.c;
                        float f10 = w20Var.f;
                        float f11 = (f10 / 2.0f) + f7;
                        float f12 = w20Var.d;
                        float f13 = w20Var.g;
                        float f14 = (f13 / 2.0f) + f12;
                        float f15 = this.W;
                        float f16 = this.H;
                        float f17 = (f10 * f15) / f16;
                        float f18 = (f13 * f16) / f15;
                        w20Var.f = f18;
                        w20Var.g = f17;
                        w20Var.c = f11 - (f18 / 2.0f);
                        w20Var.d = f14 - (f17 / 2.0f);
                    }
                    applyRoundRadius(w20Var, w20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / w20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f19 = w20Var.g;
                        float f20 = f19 / width;
                        w20Var.d = c3.i0.B(f19, f20, 2.0f, w20Var.d);
                        w20Var.g = f20;
                    } else if (width < 1.0f) {
                        float f21 = w20Var.f;
                        float f22 = width * f21;
                        w20Var.c = c3.i0.B(f21, f22, 2.0f, w20Var.c);
                        w20Var.f = f22;
                    }
                }
            }
            setupMatrix(w20Var);
        }

        private void initTextEntity(final w20 w20Var) {
            h6[] h6VarArr;
            Typeface d;
            final jg.b bVar = new jg.b(w0.b);
            bVar.getPaint().setAntiAlias(true);
            bVar.G = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(i0.L(7.0f), i0.L(7.0f), i0.L(7.0f), i0.L(7.0f));
            h0 h0Var = w20Var.n;
            if (h0Var != null && (d = h0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, w20Var.m);
            SpannableString spannableString = new SpannableString(w20Var.j);
            ArrayList arrayList = w20Var.k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                final v20 v20Var = (v20) arrayList.get(i10);
                if (v20Var.a != null) {
                    w20 w20Var2 = new w20();
                    v20Var.b = w20Var2;
                    w20Var2.j = v20Var.a;
                    w20Var2.b = v20Var.c;
                    o5 o5Var = new o5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // org.telegram.ui.Components.o5, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i12, int i13, float f7, int i14, int i15, int i16, Paint paint) {
                            super.draw(canvas, charSequence, i12, i13, f7, i14, i15, i16, paint);
                            w20 w20Var3 = w20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f7)) / w20Var3.q) * w20Var3.f) + w20Var.c;
                            float f10 = w20Var3.d;
                            w20 w20Var4 = w20Var;
                            float f11 = w20Var4.g;
                            float paddingTop = (((((i16 - i14) / 2.0f) + (bVar.getPaddingTop() + i14)) / w20Var4.r) * f11) + f10;
                            if (w20Var4.e != 0.0f) {
                                float f12 = (w20Var4.f / 2.0f) + w20Var4.c;
                                float f13 = (f11 / 2.0f) + w20Var4.d;
                                float f14 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f12;
                                double d11 = (paddingTop - f13) / f14;
                                paddingLeft = ((float) ((Math.cos(-w20Var.e) * d10) - (Math.sin(-w20Var.e) * d11))) + f12;
                                paddingTop = (((float) i0.a.c(-w20Var.e, d11, Math.sin(-w20Var.e) * d10)) * f14) + f13;
                            }
                            w20 w20Var5 = v20Var.b;
                            int i17 = this.measuredSize;
                            w20 w20Var6 = w20Var;
                            float f15 = (i17 / w20Var6.q) * w20Var6.f;
                            w20Var5.f = f15;
                            float f16 = (i17 / w20Var6.r) * w20Var6.g;
                            w20Var5.g = f16;
                            w20Var5.c = paddingLeft - (f15 / 2.0f);
                            w20Var5.d = paddingTop - (f16 / 2.0f);
                            w20Var5.e = w20Var6.e;
                            if (w20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(w20Var5);
                            }
                        }
                    };
                    int i12 = v20Var.offset;
                    spannableString.setSpan(o5Var, i12, v20Var.length + i12, 33);
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
            bVar.setTextColor(w20Var.l);
            int i13 = w20Var.p;
            bVar.setGravity(i13 != 1 ? i13 != 2 ? 19 : 21 : 17);
            int i14 = w20Var.p;
            bVar.setTextAlignment(i14 != 1 ? (i14 == 2 ? !dd.X : dd.X) ? 3 : 2 : 4);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(TLObject.FLAG_28);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(bVar);
            byte b10 = w20Var.b;
            if (b10 == 0) {
                bVar.setFrameColor(w20Var.l);
                bVar.setTextColor(i0.B(w20Var.l) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                bVar.setFrameColor(i0.B(w20Var.l) >= 0.25f ? -1728053248 : -1711276033);
                bVar.setTextColor(w20Var.l);
            } else if (b10 == 2) {
                bVar.setFrameColor(i0.B(w20Var.l) >= 0.25f ? -16777216 : -1);
                bVar.setTextColor(w20Var.l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(w20Var.l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(w20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(w20Var.r, TLObject.FLAG_30));
            bVar.layout(0, 0, w20Var.q, w20Var.r);
            w20Var.G = Bitmap.createBitmap(w20Var.q, w20Var.r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(w20Var.G));
            setupMatrix(w20Var);
        }

        private void setupMatrix(w20 w20Var) {
            s5 s5Var;
            Matrix matrix = new Matrix();
            w20Var.H = matrix;
            Bitmap bitmap = w20Var.G;
            if (bitmap == null && (s5Var = w20Var.J) != null) {
                p5 p5Var = s5Var.w;
                bitmap = p5Var != null ? p5Var.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (w20Var.a != 1 && (w20Var.b & 2) != 0) {
                w20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            w20Var.H.postScale(w20Var.f * this.W, w20Var.g * this.H);
            w20Var.H.postTranslate(w20Var.c * this.W, w20Var.d * this.H);
            w20Var.H.postRotate((float) (((-w20Var.e) / 3.141592653589793d) * 180.0d), ((w20Var.f / 2.0f) + w20Var.c) * this.W, ((w20Var.g / 2.0f) + w20Var.d) * this.H);
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
                w20 w20Var = this.mediaEntities.get(i11);
                drawEntity(canvas, w20Var, w20Var.l, j10);
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
        lf lfVar;
        int i11;
        int i12;
        lf lfVar2;
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
                            lfVar = convertVideoParams.callback;
                            if (lfVar != null) {
                            }
                            f8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
                            return z10;
                        }
                    }
                    lf lfVar3 = convertVideoParams.callback;
                    if (lfVar3 != null) {
                        i11 = i13;
                        j10 = createEncoder;
                        i12 = i14;
                        try {
                            try {
                                ((n0) lfVar3).k(Math.min(261120L, convertVideoParams.cacheFile.length()), i15 / ceil);
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
                                lfVar = convertVideoParams.callback;
                                if (lfVar != null) {
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
                    if (i15 % 3 == 0 && (lfVar2 = convertVideoParams.callback) != null) {
                        boolean z12 = ((y20) ((n0) lfVar2).a).W;
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
            lfVar = convertVideoParams.callback;
            if (lfVar != null) {
                ((n0) lfVar).k(length, 1.0f);
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
