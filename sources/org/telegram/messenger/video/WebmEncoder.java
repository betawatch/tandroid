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
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.g20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.j20;
import org.telegram.messenger.mf;
import org.telegram.messenger.p10;
import org.telegram.messenger.re;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.v5;
import sg.b0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<h20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<h20> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i7 = convertVideoParams.resultWidth;
            this.W = i7;
            int i10 = convertVideoParams.resultHeight;
            this.H = i10;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i7, i10), i7 * 0.125f, i10 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                h20 h20Var = this.mediaEntities.get(i11);
                byte b10 = h20Var.a;
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(h20Var);
                } else if (b10 == 1) {
                    initTextEntity(h20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(h20 h20Var, Bitmap bitmap, int i7) {
            if (bitmap == null || h20Var == null) {
                return;
            }
            if (h20Var.s == 0.0f && i7 == 0) {
                return;
            }
            if (h20Var.L == null) {
                h20Var.L = new Canvas(bitmap);
            }
            if (h20Var.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * h20Var.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                h20Var.L.drawPath(this.path, this.xRefPaint);
            }
            if (i7 != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i7);
                h20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, h20 h20Var, int i7, long j3) {
            h20 h20Var2;
            Canvas canvas2;
            long j10;
            RLottieNative rLottieNative = h20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = h20Var.G;
                if (bitmap == null || h20Var.U <= 0 || h20Var.V <= 0) {
                    return;
                }
                rLottieNative.c((int) h20Var.E, bitmap, true);
                Bitmap bitmap2 = h20Var.G;
                if ((h20Var.b & 8) == 0) {
                    i7 = 0;
                }
                applyRoundRadius(h20Var, bitmap2, i7);
                canvas.drawBitmap(h20Var.G, h20Var.H, this.bitmapPaint);
                float f10 = h20Var.E + h20Var.F;
                h20Var.E = f10;
                if (f10 >= h20Var.D.a[0]) {
                    h20Var.E = 0.0f;
                    return;
                }
                return;
            }
            if (h20Var.J != null) {
                float f11 = h20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + h20Var.F;
                h20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    h20Var.J.r(true);
                }
                s5 s5Var = h20Var.J.w;
                Bitmap bitmap3 = s5Var != null ? s5Var.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, h20Var.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(h20Var.G, h20Var.H, this.bitmapPaint);
            ArrayList arrayList = h20Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i10 < h20Var.k.size()) {
                g20 g20Var = (g20) h20Var.k.get(i10);
                if (g20Var == null || (h20Var2 = g20Var.b) == null) {
                    canvas2 = canvas;
                    j10 = j3;
                } else {
                    canvas2 = canvas;
                    j10 = j3;
                    drawEntity(canvas2, h20Var2, h20Var.l, j10);
                }
                i10++;
                canvas = canvas2;
                j3 = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(h20 h20Var) {
            int i7;
            int i10 = (int) (h20Var.f * this.W);
            h20Var.U = i10;
            int i11 = (int) (h20Var.g * this.H);
            h20Var.V = i11;
            if (i10 > 512) {
                h20Var.V = (int) ((i11 / i10) * 512.0f);
                h20Var.U = 512;
            }
            int i12 = h20Var.V;
            if (i12 > 512) {
                h20Var.U = (int) ((h20Var.U / i12) * 512.0f);
                h20Var.V = 512;
            }
            byte b10 = h20Var.b;
            if ((b10 & 1) != 0) {
                int i13 = h20Var.U;
                if (i13 <= 0 || (i7 = h20Var.V) <= 0) {
                    return;
                }
                h20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(h20Var.j, null, null, null, 0, null);
                h20Var.D = a10;
                h20Var.F = a10 != null ? a10.a[1] / this.fps : 0.0f;
            } else if ((b10 & 4) != 0) {
                h20Var.K = false;
                v5 v5Var = new v5(new File(h20Var.j), true, 0L, 0, null, null, null, 0L, p10.s0, true, 512, 512, null, 0, true);
                h20Var.J = v5Var;
                h20Var.F = v5Var.d[5] / this.fps;
                h20Var.E = 1.0f;
                v5Var.r(true);
            } else {
                String str = h20Var.j;
                if (!TextUtils.isEmpty(h20Var.t) && (h20Var.b & 16) != 0) {
                    str = h20Var.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (h20Var.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                h20Var.G = decodeFile;
                if (h20Var.a == 2 && decodeFile != null) {
                    h20Var.s = g0.L(12.0f) / Math.min(h20Var.q, h20Var.r);
                    Pair N0 = g0.N0(h20Var.j);
                    h20Var.e = (float) (h20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f10 = h20Var.c;
                        float f11 = h20Var.f;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = h20Var.d;
                        float f14 = h20Var.g;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        h20Var.f = f19;
                        h20Var.g = f18;
                        h20Var.c = f12 - (f19 / 2.0f);
                        h20Var.d = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(h20Var, h20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / h20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f20 = h20Var.g;
                        float f21 = f20 / width;
                        h20Var.d = com.google.android.recaptcha.internal.a.A(f20, f21, 2.0f, h20Var.d);
                        h20Var.g = f21;
                    } else if (width < 1.0f) {
                        float f22 = h20Var.f;
                        float f23 = width * f22;
                        h20Var.c = com.google.android.recaptcha.internal.a.A(f22, f23, 2.0f, h20Var.c);
                        h20Var.f = f23;
                    }
                }
            }
            setupMatrix(h20Var);
        }

        private void initTextEntity(final h20 h20Var) {
            f6[] f6VarArr;
            Typeface d;
            final tg.b bVar = new tg.b(t0.b);
            bVar.getPaint().setAntiAlias(true);
            bVar.G = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            b0 b0Var = h20Var.n;
            if (b0Var != null && (d = b0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, h20Var.m);
            SpannableString spannableString = new SpannableString(h20Var.j);
            ArrayList arrayList = h20Var.k;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i10 = i7 + 1;
                final g20 g20Var = (g20) arrayList.get(i7);
                if (g20Var.a != null) {
                    h20 h20Var2 = new h20();
                    g20Var.b = h20Var2;
                    h20Var2.j = g20Var.a;
                    h20Var2.b = g20Var.c;
                    r5 r5Var = new r5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // org.telegram.ui.Components.r5, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f10, int i13, int i14, int i15, Paint paint) {
                            super.draw(canvas, charSequence, i11, i12, f10, i13, i14, i15, paint);
                            h20 h20Var3 = h20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / h20Var3.q) * h20Var3.f) + h20Var.c;
                            float f11 = h20Var3.d;
                            h20 h20Var4 = h20Var;
                            float f12 = h20Var4.g;
                            float paddingTop = (((((i15 - i13) / 2.0f) + (bVar.getPaddingTop() + i13)) / h20Var4.r) * f12) + f11;
                            if (h20Var4.e != 0.0f) {
                                float f13 = (h20Var4.f / 2.0f) + h20Var4.c;
                                float f14 = (f12 / 2.0f) + h20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-h20Var.e) * d2) - (Math.sin(-h20Var.e) * d10))) + f13;
                                paddingTop = (((float) jg.g.d(-h20Var.e, d10, Math.sin(-h20Var.e) * d2)) * f15) + f14;
                            }
                            h20 h20Var5 = g20Var.b;
                            int i16 = this.measuredSize;
                            h20 h20Var6 = h20Var;
                            float f16 = (i16 / h20Var6.q) * h20Var6.f;
                            h20Var5.f = f16;
                            float f17 = (i16 / h20Var6.r) * h20Var6.g;
                            h20Var5.g = f17;
                            h20Var5.c = paddingLeft - (f16 / 2.0f);
                            h20Var5.d = paddingTop - (f17 / 2.0f);
                            h20Var5.e = h20Var6.e;
                            if (h20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(h20Var5);
                            }
                        }
                    };
                    int i11 = g20Var.offset;
                    spannableString.setSpan(r5Var, i11, g20Var.length + i11, 33);
                }
                i7 = i10;
            }
            CharSequence m10 = i6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (f6VarArr = (f6[]) ((Spanned) m10).getSpans(0, m10.length(), f6.class)) != null) {
                for (f6 f6Var : f6VarArr) {
                    f6Var.b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(h20Var.l);
            int i12 = h20Var.p;
            bVar.setGravity(i12 != 1 ? i12 != 2 ? 19 : 21 : 17);
            int i13 = h20Var.p;
            bVar.setTextAlignment(i13 != 1 ? (i13 == 2 ? !id.a0 : id.a0) ? 3 : 2 : 4);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(TLObject.FLAG_28);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(bVar);
            byte b10 = h20Var.b;
            if (b10 == 0) {
                bVar.setFrameColor(h20Var.l);
                bVar.setTextColor(g0.B(h20Var.l) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                bVar.setFrameColor(g0.B(h20Var.l) >= 0.25f ? -1728053248 : -1711276033);
                bVar.setTextColor(h20Var.l);
            } else if (b10 == 2) {
                bVar.setFrameColor(g0.B(h20Var.l) >= 0.25f ? -16777216 : -1);
                bVar.setTextColor(h20Var.l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(h20Var.l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(h20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(h20Var.r, TLObject.FLAG_30));
            bVar.layout(0, 0, h20Var.q, h20Var.r);
            h20Var.G = Bitmap.createBitmap(h20Var.q, h20Var.r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(h20Var.G));
            setupMatrix(h20Var);
        }

        private void setupMatrix(h20 h20Var) {
            v5 v5Var;
            Matrix matrix = new Matrix();
            h20Var.H = matrix;
            Bitmap bitmap = h20Var.G;
            if (bitmap == null && (v5Var = h20Var.J) != null) {
                s5 s5Var = v5Var.w;
                bitmap = s5Var != null ? s5Var.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (h20Var.a != 1 && (h20Var.b & 2) != 0) {
                h20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            h20Var.H.postScale(h20Var.f * this.W, h20Var.g * this.H);
            h20Var.H.postTranslate(h20Var.c * this.W, h20Var.d * this.H);
            h20Var.H.postRotate((float) (((-h20Var.e) / 3.141592653589793d) * 180.0d), ((h20Var.f / 2.0f) + h20Var.c) * this.W, ((h20Var.g / 2.0f) + h20Var.d) * this.H);
        }

        public void draw(Canvas canvas, int i7) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j3 = (1000000000 / this.fps) * i7;
            int size = this.mediaEntities.size();
            for (int i10 = 0; i10 < size; i10++) {
                h20 h20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, h20Var, h20Var.l, j3);
            }
            canvas.restore();
        }

        public void setBreakStrategy(tg.b bVar) {
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
    public static boolean convert(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams, int i7) {
        long j3;
        boolean z9;
        long length;
        mf mfVar;
        int i10;
        int i11;
        mf mfVar2;
        int i12 = convertVideoParams.resultWidth;
        int i13 = convertVideoParams.resultHeight;
        long createEncoder = createEncoder(convertVideoParams.cacheFile.getAbsolutePath(), i12, i13, convertVideoParams.framerate, convertVideoParams.bitrate);
        boolean z10 = true;
        if (createEncoder == 0) {
            return true;
        }
        Bitmap bitmap = null;
        try {
            try {
                bitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getByteCount());
                Canvas canvas = new Canvas(bitmap);
                FrameDrawer frameDrawer = new FrameDrawer(convertVideoParams);
                int ceil = (int) Math.ceil((convertVideoParams.duration / 1000.0d) * convertVideoParams.framerate);
                int i14 = 0;
                while (i14 < ceil) {
                    frameDrawer.draw(canvas, i14);
                    bitmap.copyPixelsToBuffer(allocateDirect);
                    allocateDirect.flip();
                    if (!writeFrame(createEncoder, allocateDirect, i12, i13)) {
                        try {
                            a8.b("webm writeFile error at " + i14 + "/" + ceil);
                            stop(createEncoder);
                            bitmap.recycle();
                            return z10;
                        } catch (Exception e10) {
                            e = e10;
                            j3 = createEncoder;
                            a8.g(e, z10);
                            stop(j3);
                            if (bitmap != null) {
                            }
                            z9 = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i7 > 0) {
                            }
                            mfVar = convertVideoParams.callback;
                            if (mfVar != null) {
                            }
                            a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i7);
                            return z9;
                        }
                    }
                    mf mfVar3 = convertVideoParams.callback;
                    if (mfVar3 != null) {
                        i10 = i12;
                        j3 = createEncoder;
                        i11 = i13;
                        try {
                            try {
                                ((re) mfVar3).l(Math.min(261120L, convertVideoParams.cacheFile.length()), i14 / ceil);
                            } catch (Exception e11) {
                                e = e11;
                                z10 = true;
                                a8.g(e, z10);
                                stop(j3);
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                z9 = true;
                                length = convertVideoParams.cacheFile.length();
                                if (i7 > 0) {
                                }
                                mfVar = convertVideoParams.callback;
                                if (mfVar != null) {
                                }
                                a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i7);
                                return z9;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            stop(j3);
                            if (bitmap != null) {
                            }
                            throw th;
                        }
                    } else {
                        i10 = i12;
                        j3 = createEncoder;
                        i11 = i13;
                    }
                    if (i14 % 3 == 0 && (mfVar2 = convertVideoParams.callback) != null) {
                        boolean z11 = ((j20) ((re) mfVar2).b).W;
                    }
                    i14++;
                    i13 = i11;
                    i12 = i10;
                    createEncoder = j3;
                    z10 = true;
                }
                stop(createEncoder);
                bitmap.recycle();
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                j3 = createEncoder;
                stop(j3);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            j3 = createEncoder;
        }
        length = convertVideoParams.cacheFile.length();
        if (i7 > 0 || length <= 261120) {
            mfVar = convertVideoParams.callback;
            if (mfVar != null) {
                ((re) mfVar).l(length, 1.0f);
            }
            a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i7);
            return z9;
        }
        int i15 = convertVideoParams.bitrate;
        convertVideoParams.bitrate = (int) ((261120.0f / length) * 0.9f * i15);
        convertVideoParams.cacheFile.delete();
        a8.b("webm encoded too much, got " + length + ", old bitrate = " + i15 + " new bitrate = " + convertVideoParams.bitrate);
        return convert(convertVideoParams, i7 - 1);
    }

    private static native long createEncoder(String str, int i7, int i10, int i11, long j3);

    public static native void stop(long j3);

    private static native boolean writeFrame(long j3, ByteBuffer byteBuffer, int i7, int i10);
}
