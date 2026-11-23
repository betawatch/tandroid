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
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.d20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.kf;
import org.telegram.messenger.pe;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.y5;
import sg.a0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<b20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<b20> arrayList = new ArrayList<>();
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
                b20 b20Var = this.mediaEntities.get(i11);
                byte b10 = b20Var.a;
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(b20Var);
                } else if (b10 == 1) {
                    initTextEntity(b20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(b20 b20Var, Bitmap bitmap, int i7) {
            if (bitmap == null || b20Var == null) {
                return;
            }
            if (b20Var.s == 0.0f && i7 == 0) {
                return;
            }
            if (b20Var.M == null) {
                b20Var.M = new Canvas(bitmap);
            }
            if (b20Var.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * b20Var.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                b20Var.M.drawPath(this.path, this.xRefPaint);
            }
            if (i7 != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i7);
                b20Var.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, b20 b20Var, int i7, long j3) {
            b20 b20Var2;
            Canvas canvas2;
            long j10;
            RLottieNative rLottieNative = b20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = b20Var.G;
                if (bitmap == null || b20Var.Y <= 0 || b20Var.Z <= 0) {
                    return;
                }
                rLottieNative.c((int) b20Var.E, bitmap, true);
                Bitmap bitmap2 = b20Var.G;
                if ((b20Var.b & 8) == 0) {
                    i7 = 0;
                }
                applyRoundRadius(b20Var, bitmap2, i7);
                canvas.drawBitmap(b20Var.G, b20Var.H, this.bitmapPaint);
                float f10 = b20Var.E + b20Var.F;
                b20Var.E = f10;
                if (f10 >= b20Var.D.a[0]) {
                    b20Var.E = 0.0f;
                    return;
                }
                return;
            }
            if (b20Var.K != null) {
                float f11 = b20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + b20Var.F;
                b20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    b20Var.K.r(true);
                }
                y5 y5Var = b20Var.K.w;
                Bitmap bitmap3 = y5Var != null ? y5Var.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, b20Var.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(b20Var.G, b20Var.H, this.bitmapPaint);
            ArrayList arrayList = b20Var.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i10 < b20Var.k.size()) {
                a20 a20Var = (a20) b20Var.k.get(i10);
                if (a20Var == null || (b20Var2 = a20Var.b) == null) {
                    canvas2 = canvas;
                    j10 = j3;
                } else {
                    canvas2 = canvas;
                    j10 = j3;
                    drawEntity(canvas2, b20Var2, b20Var.l, j10);
                }
                i10++;
                canvas = canvas2;
                j3 = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(b20 b20Var) {
            int i7;
            int i10 = (int) (b20Var.f * this.W);
            b20Var.Y = i10;
            int i11 = (int) (b20Var.g * this.H);
            b20Var.Z = i11;
            if (i10 > 512) {
                b20Var.Z = (int) ((i11 / i10) * 512.0f);
                b20Var.Y = 512;
            }
            int i12 = b20Var.Z;
            if (i12 > 512) {
                b20Var.Y = (int) ((b20Var.Y / i12) * 512.0f);
                b20Var.Z = 512;
            }
            byte b10 = b20Var.b;
            if ((b10 & 1) != 0) {
                int i13 = b20Var.Y;
                if (i13 <= 0 || (i7 = b20Var.Z) <= 0) {
                    return;
                }
                b20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(b20Var.j, null, null, null, 0, null);
                b20Var.D = a10;
                b20Var.F = a10 != null ? a10.a[1] / this.fps : 0.0f;
            } else if ((b10 & 4) != 0) {
                b20Var.L = false;
                b6 b6Var = new b6(new File(b20Var.j), true, 0L, 0, null, null, null, 0L, i10.t0, true, 512, 512, null, 0, true);
                b20Var.K = b6Var;
                b20Var.F = b6Var.d[5] / this.fps;
                b20Var.E = 1.0f;
                b6Var.r(true);
            } else {
                String str = b20Var.j;
                if (!TextUtils.isEmpty(b20Var.t) && (b20Var.b & 16) != 0) {
                    str = b20Var.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (b20Var.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                b20Var.G = decodeFile;
                if (b20Var.a == 2 && decodeFile != null) {
                    b20Var.s = g0.L(12.0f) / Math.min(b20Var.q, b20Var.r);
                    Pair N0 = g0.N0(b20Var.j);
                    b20Var.e = (float) (b20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f10 = b20Var.c;
                        float f11 = b20Var.f;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = b20Var.d;
                        float f14 = b20Var.g;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        b20Var.f = f19;
                        b20Var.g = f18;
                        b20Var.c = f12 - (f19 / 2.0f);
                        b20Var.d = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(b20Var, b20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / b20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f20 = b20Var.g;
                        float f21 = f20 / width;
                        b20Var.d = e2.A(f20, f21, 2.0f, b20Var.d);
                        b20Var.g = f21;
                    } else if (width < 1.0f) {
                        float f22 = b20Var.f;
                        float f23 = width * f22;
                        b20Var.c = e2.A(f22, f23, 2.0f, b20Var.c);
                        b20Var.f = f23;
                    }
                }
            }
            setupMatrix(b20Var);
        }

        private void initTextEntity(final b20 b20Var) {
            g6[] g6VarArr;
            Typeface d;
            final tg.f fVar = new tg.f(t0.b);
            fVar.getPaint().setAntiAlias(true);
            fVar.H = false;
            fVar.setBackgroundColor(0);
            fVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            a0 a0Var = b20Var.n;
            if (a0Var != null && (d = a0Var.d()) != null) {
                fVar.setTypeface(d);
            }
            fVar.setTextSize(0, b20Var.m);
            SpannableString spannableString = new SpannableString(b20Var.j);
            ArrayList arrayList = b20Var.k;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i10 = i7 + 1;
                final a20 a20Var = (a20) arrayList.get(i7);
                if (a20Var.a != null) {
                    b20 b20Var2 = new b20();
                    a20Var.b = b20Var2;
                    b20Var2.j = a20Var.a;
                    b20Var2.b = a20Var.c;
                    x5 x5Var = new x5(0L, 1.0f, fVar.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // org.telegram.ui.Components.x5, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f10, int i13, int i14, int i15, Paint paint) {
                            super.draw(canvas, charSequence, i11, i12, f10, i13, i14, i15, paint);
                            b20 b20Var3 = b20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (fVar.getPaddingLeft() + f10)) / b20Var3.q) * b20Var3.f) + b20Var.c;
                            float f11 = b20Var3.d;
                            b20 b20Var4 = b20Var;
                            float f12 = b20Var4.g;
                            float paddingTop = (((((i15 - i13) / 2.0f) + (fVar.getPaddingTop() + i13)) / b20Var4.r) * f12) + f11;
                            if (b20Var4.e != 0.0f) {
                                float f13 = (b20Var4.f / 2.0f) + b20Var4.c;
                                float f14 = (f12 / 2.0f) + b20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-b20Var.e) * d2) - (Math.sin(-b20Var.e) * d10))) + f13;
                                paddingTop = (((float) i5.c.c(-b20Var.e, d10, Math.sin(-b20Var.e) * d2)) * f15) + f14;
                            }
                            b20 b20Var5 = a20Var.b;
                            int i16 = this.measuredSize;
                            b20 b20Var6 = b20Var;
                            float f16 = (i16 / b20Var6.q) * b20Var6.f;
                            b20Var5.f = f16;
                            float f17 = (i16 / b20Var6.r) * b20Var6.g;
                            b20Var5.g = f17;
                            b20Var5.c = paddingLeft - (f16 / 2.0f);
                            b20Var5.d = paddingTop - (f17 / 2.0f);
                            b20Var5.e = b20Var6.e;
                            if (b20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(b20Var5);
                            }
                        }
                    };
                    int i11 = a20Var.offset;
                    spannableString.setSpan(x5Var, i11, a20Var.length + i11, 33);
                }
                i7 = i10;
            }
            CharSequence m10 = j6.m(spannableString, fVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                for (g6 g6Var : g6VarArr) {
                    g6Var.b = 0.85f;
                }
            }
            fVar.setText(m10);
            fVar.setTextColor(b20Var.l);
            int i12 = b20Var.p;
            fVar.setGravity(i12 != 1 ? i12 != 2 ? 19 : 21 : 17);
            int i13 = b20Var.p;
            fVar.setTextAlignment(i13 != 1 ? (i13 == 2 ? !gd.a0 : gd.a0) ? 3 : 2 : 4);
            fVar.setHorizontallyScrolling(false);
            fVar.setImeOptions(TLObject.FLAG_28);
            fVar.setFocusableInTouchMode(true);
            fVar.setInputType(fVar.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(fVar);
            byte b10 = b20Var.b;
            if (b10 == 0) {
                fVar.setFrameColor(b20Var.l);
                fVar.setTextColor(g0.B(b20Var.l) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                fVar.setFrameColor(g0.B(b20Var.l) >= 0.25f ? -1728053248 : -1711276033);
                fVar.setTextColor(b20Var.l);
            } else if (b10 == 2) {
                fVar.setFrameColor(g0.B(b20Var.l) >= 0.25f ? -16777216 : -1);
                fVar.setTextColor(b20Var.l);
            } else if (b10 == 3) {
                fVar.setFrameColor(0);
                fVar.setTextColor(b20Var.l);
            }
            fVar.measure(View.MeasureSpec.makeMeasureSpec(b20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b20Var.r, TLObject.FLAG_30));
            fVar.layout(0, 0, b20Var.q, b20Var.r);
            b20Var.G = Bitmap.createBitmap(b20Var.q, b20Var.r, Bitmap.Config.ARGB_8888);
            fVar.draw(new Canvas(b20Var.G));
            setupMatrix(b20Var);
        }

        private void setupMatrix(b20 b20Var) {
            b6 b6Var;
            Matrix matrix = new Matrix();
            b20Var.H = matrix;
            Bitmap bitmap = b20Var.G;
            if (bitmap == null && (b6Var = b20Var.K) != null) {
                y5 y5Var = b6Var.w;
                bitmap = y5Var != null ? y5Var.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (b20Var.a != 1 && (b20Var.b & 2) != 0) {
                b20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            b20Var.H.postScale(b20Var.f * this.W, b20Var.g * this.H);
            b20Var.H.postTranslate(b20Var.c * this.W, b20Var.d * this.H);
            b20Var.H.postRotate((float) (((-b20Var.e) / 3.141592653589793d) * 180.0d), ((b20Var.f / 2.0f) + b20Var.c) * this.W, ((b20Var.g / 2.0f) + b20Var.d) * this.H);
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
                b20 b20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, b20Var, b20Var.l, j3);
            }
            canvas.restore();
        }

        public void setBreakStrategy(tg.f fVar) {
            fVar.setBreakStrategy(0);
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
        kf kfVar;
        int i10;
        int i11;
        kf kfVar2;
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
                            kfVar = convertVideoParams.callback;
                            if (kfVar != null) {
                            }
                            a8.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i7);
                            return z10;
                        }
                    }
                    kf kfVar3 = convertVideoParams.callback;
                    if (kfVar3 != null) {
                        i10 = i12;
                        j3 = createEncoder;
                        i11 = i13;
                        try {
                            try {
                                ((pe) kfVar3).l(Math.min(261120L, convertVideoParams.cacheFile.length()), i14 / ceil);
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
                                kfVar = convertVideoParams.callback;
                                if (kfVar != null) {
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
                    if (i14 % 3 == 0 && (kfVar2 = convertVideoParams.callback) != null) {
                        boolean z12 = ((d20) ((pe) kfVar2).b).W;
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
            kfVar = convertVideoParams.callback;
            if (kfVar != null) {
                ((pe) kfVar).l(length, 1.0f);
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
