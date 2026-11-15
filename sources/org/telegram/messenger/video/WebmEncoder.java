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
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g20;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.lf;
import org.telegram.messenger.m10;
import org.telegram.messenger.qe;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.t5;
import sg.a0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<e20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<e20> arrayList = new ArrayList<>();
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
                e20 e20Var = this.mediaEntities.get(i11);
                byte b10 = e20Var.a;
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(e20Var);
                } else if (b10 == 1) {
                    initTextEntity(e20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(e20 e20Var, Bitmap bitmap, int i7) {
            if (bitmap == null || e20Var == null) {
                return;
            }
            if (e20Var.s == 0.0f && i7 == 0) {
                return;
            }
            if (e20Var.L == null) {
                e20Var.L = new Canvas(bitmap);
            }
            if (e20Var.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * e20Var.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                e20Var.L.drawPath(this.path, this.xRefPaint);
            }
            if (i7 != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i7);
                e20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, e20 e20Var, int i7, long j3) {
            e20 e20Var2;
            Canvas canvas2;
            long j10;
            RLottieNative rLottieNative = e20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = e20Var.G;
                if (bitmap == null || e20Var.U <= 0 || e20Var.V <= 0) {
                    return;
                }
                rLottieNative.c((int) e20Var.E, bitmap, true);
                Bitmap bitmap2 = e20Var.G;
                if ((e20Var.b & 8) == 0) {
                    i7 = 0;
                }
                applyRoundRadius(e20Var, bitmap2, i7);
                canvas.drawBitmap(e20Var.G, e20Var.H, this.bitmapPaint);
                float f10 = e20Var.E + e20Var.F;
                e20Var.E = f10;
                if (f10 >= e20Var.D.a[0]) {
                    e20Var.E = 0.0f;
                    return;
                }
                return;
            }
            if (e20Var.J != null) {
                float f11 = e20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + e20Var.F;
                e20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    e20Var.J.r(true);
                }
                q5 q5Var = e20Var.J.w;
                Bitmap bitmap3 = q5Var != null ? q5Var.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, e20Var.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(e20Var.G, e20Var.H, this.bitmapPaint);
            ArrayList arrayList = e20Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i10 < e20Var.k.size()) {
                d20 d20Var = (d20) e20Var.k.get(i10);
                if (d20Var == null || (e20Var2 = d20Var.b) == null) {
                    canvas2 = canvas;
                    j10 = j3;
                } else {
                    canvas2 = canvas;
                    j10 = j3;
                    drawEntity(canvas2, e20Var2, e20Var.l, j10);
                }
                i10++;
                canvas = canvas2;
                j3 = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(e20 e20Var) {
            int i7;
            int i10 = (int) (e20Var.f * this.W);
            e20Var.U = i10;
            int i11 = (int) (e20Var.g * this.H);
            e20Var.V = i11;
            if (i10 > 512) {
                e20Var.V = (int) ((i11 / i10) * 512.0f);
                e20Var.U = 512;
            }
            int i12 = e20Var.V;
            if (i12 > 512) {
                e20Var.U = (int) ((e20Var.U / i12) * 512.0f);
                e20Var.V = 512;
            }
            byte b10 = e20Var.b;
            if ((b10 & 1) != 0) {
                int i13 = e20Var.U;
                if (i13 <= 0 || (i7 = e20Var.V) <= 0) {
                    return;
                }
                e20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(e20Var.j, null, null, null, 0, null);
                e20Var.D = a10;
                e20Var.F = a10 != null ? a10.a[1] / this.fps : 0.0f;
            } else if ((b10 & 4) != 0) {
                e20Var.K = false;
                t5 t5Var = new t5(new File(e20Var.j), true, 0L, 0, null, null, null, 0L, m10.t0, true, 512, 512, null, 0, true);
                e20Var.J = t5Var;
                e20Var.F = t5Var.d[5] / this.fps;
                e20Var.E = 1.0f;
                t5Var.r(true);
            } else {
                String str = e20Var.j;
                if (!TextUtils.isEmpty(e20Var.t) && (e20Var.b & 16) != 0) {
                    str = e20Var.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (e20Var.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                e20Var.G = decodeFile;
                if (e20Var.a == 2 && decodeFile != null) {
                    e20Var.s = g0.L(12.0f) / Math.min(e20Var.q, e20Var.r);
                    Pair N0 = g0.N0(e20Var.j);
                    e20Var.e = (float) (e20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f10 = e20Var.c;
                        float f11 = e20Var.f;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = e20Var.d;
                        float f14 = e20Var.g;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        e20Var.f = f19;
                        e20Var.g = f18;
                        e20Var.c = f12 - (f19 / 2.0f);
                        e20Var.d = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(e20Var, e20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / e20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f20 = e20Var.g;
                        float f21 = f20 / width;
                        e20Var.d = e2.A(f20, f21, 2.0f, e20Var.d);
                        e20Var.g = f21;
                    } else if (width < 1.0f) {
                        float f22 = e20Var.f;
                        float f23 = width * f22;
                        e20Var.c = e2.A(f22, f23, 2.0f, e20Var.c);
                        e20Var.f = f23;
                    }
                }
            }
            setupMatrix(e20Var);
        }

        private void initTextEntity(final e20 e20Var) {
            g6[] g6VarArr;
            Typeface d;
            final tg.b bVar = new tg.b(t0.b);
            bVar.getPaint().setAntiAlias(true);
            bVar.H = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            a0 a0Var = e20Var.n;
            if (a0Var != null && (d = a0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, e20Var.m);
            SpannableString spannableString = new SpannableString(e20Var.j);
            ArrayList arrayList = e20Var.k;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i10 = i7 + 1;
                final d20 d20Var = (d20) arrayList.get(i7);
                if (d20Var.a != null) {
                    e20 e20Var2 = new e20();
                    d20Var.b = e20Var2;
                    e20Var2.j = d20Var.a;
                    e20Var2.b = d20Var.c;
                    p5 p5Var = new p5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // org.telegram.ui.Components.p5, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f10, int i13, int i14, int i15, Paint paint) {
                            super.draw(canvas, charSequence, i11, i12, f10, i13, i14, i15, paint);
                            e20 e20Var3 = e20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / e20Var3.q) * e20Var3.f) + e20Var.c;
                            float f11 = e20Var3.d;
                            e20 e20Var4 = e20Var;
                            float f12 = e20Var4.g;
                            float paddingTop = (((((i15 - i13) / 2.0f) + (bVar.getPaddingTop() + i13)) / e20Var4.r) * f12) + f11;
                            if (e20Var4.e != 0.0f) {
                                float f13 = (e20Var4.f / 2.0f) + e20Var4.c;
                                float f14 = (f12 / 2.0f) + e20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-e20Var.e) * d2) - (Math.sin(-e20Var.e) * d10))) + f13;
                                paddingTop = (((float) i5.c.c(-e20Var.e, d10, Math.sin(-e20Var.e) * d2)) * f15) + f14;
                            }
                            e20 e20Var5 = d20Var.b;
                            int i16 = this.measuredSize;
                            e20 e20Var6 = e20Var;
                            float f16 = (i16 / e20Var6.q) * e20Var6.f;
                            e20Var5.f = f16;
                            float f17 = (i16 / e20Var6.r) * e20Var6.g;
                            e20Var5.g = f17;
                            e20Var5.c = paddingLeft - (f16 / 2.0f);
                            e20Var5.d = paddingTop - (f17 / 2.0f);
                            e20Var5.e = e20Var6.e;
                            if (e20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(e20Var5);
                            }
                        }
                    };
                    int i11 = d20Var.offset;
                    spannableString.setSpan(p5Var, i11, d20Var.length + i11, 33);
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
            bVar.setTextColor(e20Var.l);
            int i12 = e20Var.p;
            bVar.setGravity(i12 != 1 ? i12 != 2 ? 19 : 21 : 17);
            int i13 = e20Var.p;
            bVar.setTextAlignment(i13 != 1 ? (i13 == 2 ? !hd.a0 : hd.a0) ? 3 : 2 : 4);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(TLObject.FLAG_28);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(bVar);
            byte b10 = e20Var.b;
            if (b10 == 0) {
                bVar.setFrameColor(e20Var.l);
                bVar.setTextColor(g0.B(e20Var.l) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                bVar.setFrameColor(g0.B(e20Var.l) >= 0.25f ? -1728053248 : -1711276033);
                bVar.setTextColor(e20Var.l);
            } else if (b10 == 2) {
                bVar.setFrameColor(g0.B(e20Var.l) >= 0.25f ? -16777216 : -1);
                bVar.setTextColor(e20Var.l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(e20Var.l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(e20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(e20Var.r, TLObject.FLAG_30));
            bVar.layout(0, 0, e20Var.q, e20Var.r);
            e20Var.G = Bitmap.createBitmap(e20Var.q, e20Var.r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(e20Var.G));
            setupMatrix(e20Var);
        }

        private void setupMatrix(e20 e20Var) {
            t5 t5Var;
            Matrix matrix = new Matrix();
            e20Var.H = matrix;
            Bitmap bitmap = e20Var.G;
            if (bitmap == null && (t5Var = e20Var.J) != null) {
                q5 q5Var = t5Var.w;
                bitmap = q5Var != null ? q5Var.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (e20Var.a != 1 && (e20Var.b & 2) != 0) {
                e20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            e20Var.H.postScale(e20Var.f * this.W, e20Var.g * this.H);
            e20Var.H.postTranslate(e20Var.c * this.W, e20Var.d * this.H);
            e20Var.H.postRotate((float) (((-e20Var.e) / 3.141592653589793d) * 180.0d), ((e20Var.f / 2.0f) + e20Var.c) * this.W, ((e20Var.g / 2.0f) + e20Var.d) * this.H);
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
                e20 e20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, e20Var, e20Var.l, j3);
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
                        boolean z12 = ((g20) ((qe) lfVar2).b).W;
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
