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
import k2.p1;
import o4.m0;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.df;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.i6;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.y10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.t5;
import tg.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<z10> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<z10> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i3 = convertVideoParams.resultWidth;
            this.W = i3;
            int i10 = convertVideoParams.resultHeight;
            this.H = i10;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i3, i10), i3 * 0.125f, i10 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                z10 z10Var = this.mediaEntities.get(i11);
                byte b10 = z10Var.a;
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(z10Var);
                } else if (b10 == 1) {
                    initTextEntity(z10Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(z10 z10Var, Bitmap bitmap, int i3) {
            if (bitmap == null || z10Var == null) {
                return;
            }
            if (z10Var.s == 0.0f && i3 == 0) {
                return;
            }
            if (z10Var.L == null) {
                z10Var.L = new Canvas(bitmap);
            }
            if (z10Var.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * z10Var.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                z10Var.L.drawPath(this.path, this.xRefPaint);
            }
            if (i3 != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i3);
                z10Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, z10 z10Var, int i3, long j10) {
            z10 z10Var2;
            Canvas canvas2;
            long j11;
            RLottieNative rLottieNative = z10Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = z10Var.G;
                if (bitmap == null || z10Var.U <= 0 || z10Var.V <= 0) {
                    return;
                }
                rLottieNative.c((int) z10Var.E, bitmap, true);
                Bitmap bitmap2 = z10Var.G;
                if ((z10Var.b & 8) == 0) {
                    i3 = 0;
                }
                applyRoundRadius(z10Var, bitmap2, i3);
                canvas.drawBitmap(z10Var.G, z10Var.H, this.bitmapPaint);
                float f10 = z10Var.E + z10Var.F;
                z10Var.E = f10;
                if (f10 >= z10Var.D.a[0]) {
                    z10Var.E = 0.0f;
                    return;
                }
                return;
            }
            if (z10Var.J != null) {
                float f11 = z10Var.E;
                int i11 = (int) f11;
                float f12 = f11 + z10Var.F;
                z10Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    z10Var.J.r(true);
                }
                q5 q5Var = z10Var.J.w;
                Bitmap bitmap3 = q5Var != null ? q5Var.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, z10Var.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(z10Var.G, z10Var.H, this.bitmapPaint);
            ArrayList arrayList = z10Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i10 < z10Var.k.size()) {
                y10 y10Var = (y10) z10Var.k.get(i10);
                if (y10Var == null || (z10Var2 = y10Var.b) == null) {
                    canvas2 = canvas;
                    j11 = j10;
                } else {
                    canvas2 = canvas;
                    j11 = j10;
                    drawEntity(canvas2, z10Var2, z10Var.l, j11);
                }
                i10++;
                canvas = canvas2;
                j10 = j11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(z10 z10Var) {
            int i3;
            int i10 = (int) (z10Var.f * this.W);
            z10Var.U = i10;
            int i11 = (int) (z10Var.g * this.H);
            z10Var.V = i11;
            if (i10 > 512) {
                z10Var.V = (int) ((i11 / i10) * 512.0f);
                z10Var.U = 512;
            }
            int i12 = z10Var.V;
            if (i12 > 512) {
                z10Var.U = (int) ((z10Var.U / i12) * 512.0f);
                z10Var.V = 512;
            }
            byte b10 = z10Var.b;
            if ((b10 & 1) != 0) {
                int i13 = z10Var.U;
                if (i13 <= 0 || (i3 = z10Var.V) <= 0) {
                    return;
                }
                z10Var.G = Bitmap.createBitmap(i13, i3, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(z10Var.j, null, null, null, 0, null);
                z10Var.D = a10;
                z10Var.F = a10 != null ? a10.a[1] / this.fps : 0.0f;
            } else if ((b10 & 4) != 0) {
                z10Var.K = false;
                t5 t5Var = new t5(new File(z10Var.j), true, 0L, 0, null, null, null, 0L, h10.t0, true, 512, 512, null, 0, true);
                z10Var.J = t5Var;
                z10Var.F = t5Var.d[5] / this.fps;
                z10Var.E = 1.0f;
                t5Var.r(true);
            } else {
                String str = z10Var.j;
                if (!TextUtils.isEmpty(z10Var.t) && (z10Var.b & 16) != 0) {
                    str = z10Var.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (z10Var.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                z10Var.G = decodeFile;
                if (z10Var.a == 2 && decodeFile != null) {
                    z10Var.s = g0.L(12.0f) / Math.min(z10Var.q, z10Var.r);
                    Pair N0 = g0.N0(z10Var.j);
                    z10Var.e = (float) (z10Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f10 = z10Var.c;
                        float f11 = z10Var.f;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = z10Var.d;
                        float f14 = z10Var.g;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        z10Var.f = f19;
                        z10Var.g = f18;
                        z10Var.c = f12 - (f19 / 2.0f);
                        z10Var.d = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(z10Var, z10Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / z10Var.G.getHeight();
                    if (width > 1.0f) {
                        float f20 = z10Var.g;
                        float f21 = f20 / width;
                        z10Var.d = com.google.android.recaptcha.internal.a.z(f20, f21, 2.0f, z10Var.d);
                        z10Var.g = f21;
                    } else if (width < 1.0f) {
                        float f22 = z10Var.f;
                        float f23 = width * f22;
                        z10Var.c = com.google.android.recaptcha.internal.a.z(f22, f23, 2.0f, z10Var.c);
                        z10Var.f = f23;
                    }
                }
            }
            setupMatrix(z10Var);
        }

        private void initTextEntity(final z10 z10Var) {
            f6[] f6VarArr;
            Typeface d;
            final ug.b bVar = new ug.b(t0.b);
            bVar.getPaint().setAntiAlias(true);
            bVar.H = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            b0 b0Var = z10Var.n;
            if (b0Var != null && (d = b0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, z10Var.m);
            SpannableString spannableString = new SpannableString(z10Var.j);
            ArrayList arrayList = z10Var.k;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                int i10 = i3 + 1;
                final y10 y10Var = (y10) arrayList.get(i3);
                if (y10Var.a != null) {
                    z10 z10Var2 = new z10();
                    y10Var.b = z10Var2;
                    z10Var2.j = y10Var.a;
                    z10Var2.b = y10Var.c;
                    p5 p5Var = new p5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // org.telegram.ui.Components.p5, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f10, int i13, int i14, int i15, Paint paint) {
                            super.draw(canvas, charSequence, i11, i12, f10, i13, i14, i15, paint);
                            z10 z10Var3 = z10Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / z10Var3.q) * z10Var3.f) + z10Var.c;
                            float f11 = z10Var3.d;
                            z10 z10Var4 = z10Var;
                            float f12 = z10Var4.g;
                            float paddingTop = (((((i15 - i13) / 2.0f) + (bVar.getPaddingTop() + i13)) / z10Var4.r) * f12) + f11;
                            if (z10Var4.e != 0.0f) {
                                float f13 = (z10Var4.f / 2.0f) + z10Var4.c;
                                float f14 = (f12 / 2.0f) + z10Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f13;
                                double d11 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-z10Var.e) * d10) - (Math.sin(-z10Var.e) * d11))) + f13;
                                paddingTop = (((float) p1.c(-z10Var.e, d11, Math.sin(-z10Var.e) * d10)) * f15) + f14;
                            }
                            z10 z10Var5 = y10Var.b;
                            int i16 = this.measuredSize;
                            z10 z10Var6 = z10Var;
                            float f16 = (i16 / z10Var6.q) * z10Var6.f;
                            z10Var5.f = f16;
                            float f17 = (i16 / z10Var6.r) * z10Var6.g;
                            z10Var5.g = f17;
                            z10Var5.c = paddingLeft - (f16 / 2.0f);
                            z10Var5.d = paddingTop - (f17 / 2.0f);
                            z10Var5.e = z10Var6.e;
                            if (z10Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(z10Var5);
                            }
                        }
                    };
                    int i11 = y10Var.offset;
                    spannableString.setSpan(p5Var, i11, y10Var.length + i11, 33);
                }
                i3 = i10;
            }
            CharSequence m10 = i6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (f6VarArr = (f6[]) ((Spanned) m10).getSpans(0, m10.length(), f6.class)) != null) {
                for (f6 f6Var : f6VarArr) {
                    f6Var.b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(z10Var.l);
            int i12 = z10Var.p;
            bVar.setGravity(i12 != 1 ? i12 != 2 ? 19 : 21 : 17);
            int i13 = z10Var.p;
            bVar.setTextAlignment(i13 != 1 ? (i13 == 2 ? !bd.a0 : bd.a0) ? 3 : 2 : 4);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(TLObject.FLAG_28);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(bVar);
            byte b10 = z10Var.b;
            if (b10 == 0) {
                bVar.setFrameColor(z10Var.l);
                bVar.setTextColor(g0.B(z10Var.l) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                bVar.setFrameColor(g0.B(z10Var.l) >= 0.25f ? -1728053248 : -1711276033);
                bVar.setTextColor(z10Var.l);
            } else if (b10 == 2) {
                bVar.setFrameColor(g0.B(z10Var.l) >= 0.25f ? -16777216 : -1);
                bVar.setTextColor(z10Var.l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(z10Var.l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(z10Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(z10Var.r, TLObject.FLAG_30));
            bVar.layout(0, 0, z10Var.q, z10Var.r);
            z10Var.G = Bitmap.createBitmap(z10Var.q, z10Var.r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(z10Var.G));
            setupMatrix(z10Var);
        }

        private void setupMatrix(z10 z10Var) {
            t5 t5Var;
            Matrix matrix = new Matrix();
            z10Var.H = matrix;
            Bitmap bitmap = z10Var.G;
            if (bitmap == null && (t5Var = z10Var.J) != null) {
                q5 q5Var = t5Var.w;
                bitmap = q5Var != null ? q5Var.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (z10Var.a != 1 && (z10Var.b & 2) != 0) {
                z10Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            z10Var.H.postScale(z10Var.f * this.W, z10Var.g * this.H);
            z10Var.H.postTranslate(z10Var.c * this.W, z10Var.d * this.H);
            z10Var.H.postRotate((float) (((-z10Var.e) / 3.141592653589793d) * 180.0d), ((z10Var.f / 2.0f) + z10Var.c) * this.W, ((z10Var.g / 2.0f) + z10Var.d) * this.H);
        }

        public void draw(Canvas canvas, int i3) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j10 = (1000000000 / this.fps) * i3;
            int size = this.mediaEntities.size();
            for (int i10 = 0; i10 < size; i10++) {
                z10 z10Var = this.mediaEntities.get(i10);
                drawEntity(canvas, z10Var, z10Var.l, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(ug.b bVar) {
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
    public static boolean convert(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams, int i3) {
        long j10;
        boolean z10;
        long length;
        df dfVar;
        int i10;
        int i11;
        df dfVar2;
        int i12 = convertVideoParams.resultWidth;
        int i13 = convertVideoParams.resultHeight;
        long createEncoder = createEncoder(convertVideoParams.cacheFile.getAbsolutePath(), i12, i13, convertVideoParams.framerate, convertVideoParams.bitrate);
        boolean z11 = true;
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
                            return z11;
                        } catch (Exception e10) {
                            e = e10;
                            j10 = createEncoder;
                            a8.g(e, z11);
                            stop(j10);
                            if (bitmap != null) {
                            }
                            z10 = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i3 > 0) {
                            }
                            dfVar = convertVideoParams.callback;
                            if (dfVar != null) {
                            }
                            a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i3);
                            return z10;
                        }
                    }
                    df dfVar3 = convertVideoParams.callback;
                    if (dfVar3 != null) {
                        i10 = i12;
                        j10 = createEncoder;
                        i11 = i13;
                        try {
                            try {
                                ((m0) dfVar3).k(Math.min(261120L, convertVideoParams.cacheFile.length()), i14 / ceil);
                            } catch (Exception e11) {
                                e = e11;
                                z11 = true;
                                a8.g(e, z11);
                                stop(j10);
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                z10 = true;
                                length = convertVideoParams.cacheFile.length();
                                if (i3 > 0) {
                                }
                                dfVar = convertVideoParams.callback;
                                if (dfVar != null) {
                                }
                                a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i3);
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
                        i10 = i12;
                        j10 = createEncoder;
                        i11 = i13;
                    }
                    if (i14 % 3 == 0 && (dfVar2 = convertVideoParams.callback) != null) {
                        boolean z12 = ((b20) ((m0) dfVar2).a).W;
                    }
                    i14++;
                    i13 = i11;
                    i12 = i10;
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
        } catch (Exception e12) {
            e = e12;
            j10 = createEncoder;
        }
        length = convertVideoParams.cacheFile.length();
        if (i3 > 0 || length <= 261120) {
            dfVar = convertVideoParams.callback;
            if (dfVar != null) {
                ((m0) dfVar).k(length, 1.0f);
            }
            a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i3);
            return z10;
        }
        int i15 = convertVideoParams.bitrate;
        convertVideoParams.bitrate = (int) ((261120.0f / length) * 0.9f * i15);
        convertVideoParams.cacheFile.delete();
        a8.b("webm encoded too much, got " + length + ", old bitrate = " + i15 + " new bitrate = " + convertVideoParams.bitrate);
        return convert(convertVideoParams, i3 - 1);
    }

    private static native long createEncoder(String str, int i3, int i10, int i11, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i3, int i10);
}
