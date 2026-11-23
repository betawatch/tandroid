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
import com.google.android.gms.internal.vision.e2;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.f20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.lf;
import org.telegram.messenger.qe;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z5;
import sg.a0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<d20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<d20> arrayList = new ArrayList<>();
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
                d20 d20Var = this.mediaEntities.get(i11);
                byte b10 = d20Var.a;
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(d20Var);
                } else if (b10 == 1) {
                    initTextEntity(d20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(d20 d20Var, Bitmap bitmap, int i7) {
            if (bitmap == null || d20Var == null) {
                return;
            }
            if (d20Var.s == 0.0f && i7 == 0) {
                return;
            }
            if (d20Var.L == null) {
                d20Var.L = new Canvas(bitmap);
            }
            if (d20Var.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * d20Var.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                d20Var.L.drawPath(this.path, this.xRefPaint);
            }
            if (i7 != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i7);
                d20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, d20 d20Var, int i7, long j3) {
            d20 d20Var2;
            Canvas canvas2;
            long j10;
            RLottieNative rLottieNative = d20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = d20Var.G;
                if (bitmap == null || d20Var.U <= 0 || d20Var.V <= 0) {
                    return;
                }
                rLottieNative.c((int) d20Var.E, bitmap, true);
                Bitmap bitmap2 = d20Var.G;
                if ((d20Var.b & 8) == 0) {
                    i7 = 0;
                }
                applyRoundRadius(d20Var, bitmap2, i7);
                canvas.drawBitmap(d20Var.G, d20Var.H, this.bitmapPaint);
                float f10 = d20Var.E + d20Var.F;
                d20Var.E = f10;
                if (f10 >= d20Var.D.a[0]) {
                    d20Var.E = 0.0f;
                    return;
                }
                return;
            }
            if (d20Var.J != null) {
                float f11 = d20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + d20Var.F;
                d20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    d20Var.J.r(true);
                }
                z5 z5Var = d20Var.J.w;
                Bitmap bitmap3 = z5Var != null ? z5Var.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, d20Var.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(d20Var.G, d20Var.H, this.bitmapPaint);
            ArrayList arrayList = d20Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i10 < d20Var.k.size()) {
                c20 c20Var = (c20) d20Var.k.get(i10);
                if (c20Var == null || (d20Var2 = c20Var.b) == null) {
                    canvas2 = canvas;
                    j10 = j3;
                } else {
                    canvas2 = canvas;
                    j10 = j3;
                    drawEntity(canvas2, d20Var2, d20Var.l, j10);
                }
                i10++;
                canvas = canvas2;
                j3 = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(d20 d20Var) {
            int i7;
            int i10 = (int) (d20Var.f * this.W);
            d20Var.U = i10;
            int i11 = (int) (d20Var.g * this.H);
            d20Var.V = i11;
            if (i10 > 512) {
                d20Var.V = (int) ((i11 / i10) * 512.0f);
                d20Var.U = 512;
            }
            int i12 = d20Var.V;
            if (i12 > 512) {
                d20Var.U = (int) ((d20Var.U / i12) * 512.0f);
                d20Var.V = 512;
            }
            byte b10 = d20Var.b;
            if ((b10 & 1) != 0) {
                int i13 = d20Var.U;
                if (i13 <= 0 || (i7 = d20Var.V) <= 0) {
                    return;
                }
                d20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(d20Var.j, null, null, null, 0, null);
                d20Var.D = a10;
                d20Var.F = a10 != null ? a10.a[1] / this.fps : 0.0f;
            } else if ((b10 & 4) != 0) {
                d20Var.K = false;
                c6 c6Var = new c6(new File(d20Var.j), true, 0L, 0, null, null, null, 0L, k10.t0, true, 512, 512, null, 0, true);
                d20Var.J = c6Var;
                d20Var.F = c6Var.d[5] / this.fps;
                d20Var.E = 1.0f;
                c6Var.r(true);
            } else {
                String str = d20Var.j;
                if (!TextUtils.isEmpty(d20Var.t) && (d20Var.b & 16) != 0) {
                    str = d20Var.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (d20Var.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                d20Var.G = decodeFile;
                if (d20Var.a == 2 && decodeFile != null) {
                    d20Var.s = g0.L(12.0f) / Math.min(d20Var.q, d20Var.r);
                    Pair N0 = g0.N0(d20Var.j);
                    d20Var.e = (float) (d20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f10 = d20Var.c;
                        float f11 = d20Var.f;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = d20Var.d;
                        float f14 = d20Var.g;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        d20Var.f = f19;
                        d20Var.g = f18;
                        d20Var.c = f12 - (f19 / 2.0f);
                        d20Var.d = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(d20Var, d20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / d20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f20 = d20Var.g;
                        float f21 = f20 / width;
                        d20Var.d = e2.A(f20, f21, 2.0f, d20Var.d);
                        d20Var.g = f21;
                    } else if (width < 1.0f) {
                        float f22 = d20Var.f;
                        float f23 = width * f22;
                        d20Var.c = e2.A(f22, f23, 2.0f, d20Var.c);
                        d20Var.f = f23;
                    }
                }
            }
            setupMatrix(d20Var);
        }

        private void initTextEntity(final d20 d20Var) {
            g6[] g6VarArr;
            Typeface d;
            final tg.b bVar = new tg.b(t0.b);
            bVar.getPaint().setAntiAlias(true);
            bVar.H = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            a0 a0Var = d20Var.n;
            if (a0Var != null && (d = a0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, d20Var.m);
            SpannableString spannableString = new SpannableString(d20Var.j);
            ArrayList arrayList = d20Var.k;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i10 = i7 + 1;
                final c20 c20Var = (c20) arrayList.get(i7);
                if (c20Var.a != null) {
                    d20 d20Var2 = new d20();
                    c20Var.b = d20Var2;
                    d20Var2.j = c20Var.a;
                    d20Var2.b = c20Var.c;
                    y5 y5Var = new y5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // org.telegram.ui.Components.y5, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f10, int i13, int i14, int i15, Paint paint) {
                            super.draw(canvas, charSequence, i11, i12, f10, i13, i14, i15, paint);
                            d20 d20Var3 = d20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / d20Var3.q) * d20Var3.f) + d20Var.c;
                            float f11 = d20Var3.d;
                            d20 d20Var4 = d20Var;
                            float f12 = d20Var4.g;
                            float paddingTop = (((((i15 - i13) / 2.0f) + (bVar.getPaddingTop() + i13)) / d20Var4.r) * f12) + f11;
                            if (d20Var4.e != 0.0f) {
                                float f13 = (d20Var4.f / 2.0f) + d20Var4.c;
                                float f14 = (f12 / 2.0f) + d20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-d20Var.e) * d2) - (Math.sin(-d20Var.e) * d10))) + f13;
                                paddingTop = (((float) i5.c.c(-d20Var.e, d10, Math.sin(-d20Var.e) * d2)) * f15) + f14;
                            }
                            d20 d20Var5 = c20Var.b;
                            int i16 = this.measuredSize;
                            d20 d20Var6 = d20Var;
                            float f16 = (i16 / d20Var6.q) * d20Var6.f;
                            d20Var5.f = f16;
                            float f17 = (i16 / d20Var6.r) * d20Var6.g;
                            d20Var5.g = f17;
                            d20Var5.c = paddingLeft - (f16 / 2.0f);
                            d20Var5.d = paddingTop - (f17 / 2.0f);
                            d20Var5.e = d20Var6.e;
                            if (d20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(d20Var5);
                            }
                        }
                    };
                    int i11 = c20Var.offset;
                    spannableString.setSpan(y5Var, i11, c20Var.length + i11, 33);
                }
                i7 = i10;
            }
            CharSequence m10 = j6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                for (g6 g6Var : g6VarArr) {
                    g6Var.b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(d20Var.l);
            int i12 = d20Var.p;
            bVar.setGravity(i12 != 1 ? i12 != 2 ? 19 : 21 : 17);
            int i13 = d20Var.p;
            bVar.setTextAlignment(i13 != 1 ? (i13 == 2 ? !hd.a0 : hd.a0) ? 3 : 2 : 4);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(TLObject.FLAG_28);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(bVar);
            byte b10 = d20Var.b;
            if (b10 == 0) {
                bVar.setFrameColor(d20Var.l);
                bVar.setTextColor(g0.B(d20Var.l) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                bVar.setFrameColor(g0.B(d20Var.l) >= 0.25f ? -1728053248 : -1711276033);
                bVar.setTextColor(d20Var.l);
            } else if (b10 == 2) {
                bVar.setFrameColor(g0.B(d20Var.l) >= 0.25f ? -16777216 : -1);
                bVar.setTextColor(d20Var.l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(d20Var.l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(d20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(d20Var.r, TLObject.FLAG_30));
            bVar.layout(0, 0, d20Var.q, d20Var.r);
            d20Var.G = Bitmap.createBitmap(d20Var.q, d20Var.r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(d20Var.G));
            setupMatrix(d20Var);
        }

        private void setupMatrix(d20 d20Var) {
            c6 c6Var;
            Matrix matrix = new Matrix();
            d20Var.H = matrix;
            Bitmap bitmap = d20Var.G;
            if (bitmap == null && (c6Var = d20Var.J) != null) {
                z5 z5Var = c6Var.w;
                bitmap = z5Var != null ? z5Var.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (d20Var.a != 1 && (d20Var.b & 2) != 0) {
                d20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            d20Var.H.postScale(d20Var.f * this.W, d20Var.g * this.H);
            d20Var.H.postTranslate(d20Var.c * this.W, d20Var.d * this.H);
            d20Var.H.postRotate((float) (((-d20Var.e) / 3.141592653589793d) * 180.0d), ((d20Var.f / 2.0f) + d20Var.c) * this.W, ((d20Var.g / 2.0f) + d20Var.d) * this.H);
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
                d20 d20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, d20Var, d20Var.l, j3);
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
        boolean z10;
        long length;
        lf lfVar;
        int i10;
        int i11;
        lf lfVar2;
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
                            j3 = createEncoder;
                            a8.g(e, z11);
                            stop(j3);
                            if (bitmap != null) {
                            }
                            z10 = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i7 > 0) {
                            }
                            lfVar = convertVideoParams.callback;
                            if (lfVar != null) {
                            }
                            a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i7);
                            return z10;
                        }
                    }
                    lf lfVar3 = convertVideoParams.callback;
                    if (lfVar3 != null) {
                        i10 = i12;
                        j3 = createEncoder;
                        i11 = i13;
                        try {
                            try {
                                ((qe) lfVar3).l(Math.min(261120L, convertVideoParams.cacheFile.length()), i14 / ceil);
                            } catch (Exception e11) {
                                e = e11;
                                z11 = true;
                                a8.g(e, z11);
                                stop(j3);
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                z10 = true;
                                length = convertVideoParams.cacheFile.length();
                                if (i7 > 0) {
                                }
                                lfVar = convertVideoParams.callback;
                                if (lfVar != null) {
                                }
                                a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i7);
                                return z10;
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
                    if (i14 % 3 == 0 && (lfVar2 = convertVideoParams.callback) != null) {
                        boolean z12 = ((f20) ((qe) lfVar2).b).W;
                    }
                    i14++;
                    i13 = i11;
                    i12 = i10;
                    createEncoder = j3;
                    z11 = true;
                }
                stop(createEncoder);
                bitmap.recycle();
                z10 = false;
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
            lfVar = convertVideoParams.callback;
            if (lfVar != null) {
                ((qe) lfVar).l(length, 1.0f);
            }
            a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i7);
            return z10;
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
