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
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<pcc> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<pcc> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i = convertVideoParams.resultWidth;
            this.W = i;
            int i2 = convertVideoParams.resultHeight;
            this.H = i2;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i * 0.125f, i2 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                pcc pccVar = this.mediaEntities.get(i3);
                byte b = pccVar.a;
                if (b == 0 || b == 2 || b == 5) {
                    initStickerEntity(pccVar);
                } else if (b == 1) {
                    initTextEntity(pccVar);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(pcc pccVar, Bitmap bitmap, int i) {
            if (bitmap == null || pccVar == null) {
                return;
            }
            if (pccVar.s == 0.0f && i == 0) {
                return;
            }
            if (pccVar.M == null) {
                pccVar.M = new Canvas(bitmap);
            }
            if (pccVar.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * pccVar.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                pccVar.M.drawPath(this.path, this.xRefPaint);
            }
            if (i != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i);
                pccVar.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, pcc pccVar, int i, long j) {
            FrameDrawer frameDrawer;
            Canvas canvas2;
            long j2;
            pcc pccVar2;
            kn knVar;
            RLottieNative rLottieNative = pccVar.D;
            int i2 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = pccVar.G;
                if (bitmap == null || pccVar.Y <= 0 || pccVar.Z <= 0) {
                    return;
                }
                rLottieNative.c((int) pccVar.E, bitmap, true);
                Bitmap bitmap2 = pccVar.G;
                if ((pccVar.b & 8) == 0) {
                    i = 0;
                }
                applyRoundRadius(pccVar, bitmap2, i);
                canvas.drawBitmap(pccVar.G, pccVar.H, this.bitmapPaint);
                float f = pccVar.E + pccVar.F;
                pccVar.E = f;
                if (f >= pccVar.D.a[0]) {
                    pccVar.E = 0.0f;
                    return;
                }
                return;
            }
            if (pccVar.K != null) {
                float f2 = pccVar.E;
                int i3 = (int) f2;
                float f3 = f2 + pccVar.F;
                pccVar.E = f3;
                int i4 = (int) f3;
                while (true) {
                    knVar = pccVar.K;
                    if (i3 == i4) {
                        break;
                    }
                    knVar.r(true);
                    i4--;
                }
                hn hnVar = knVar.w;
                Bitmap bitmap3 = hnVar != null ? hnVar.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, pccVar.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(pccVar.G, pccVar.H, this.bitmapPaint);
            ArrayList arrayList = pccVar.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i2 < pccVar.k.size()) {
                occ occVar = (occ) pccVar.k.get(i2);
                if (occVar == null || (pccVar2 = occVar.b) == null) {
                    frameDrawer = this;
                    canvas2 = canvas;
                    j2 = j;
                } else {
                    frameDrawer = this;
                    canvas2 = canvas;
                    j2 = j;
                    frameDrawer.drawEntity(canvas2, pccVar2, pccVar.l, j2);
                }
                i2++;
                this = frameDrawer;
                canvas = canvas2;
                j = j2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(pcc pccVar) {
            int i = (int) (pccVar.f * this.W);
            pccVar.Y = i;
            int i2 = (int) (pccVar.g * this.H);
            pccVar.Z = i2;
            int i3 = 512;
            if (i > 512) {
                i2 = (int) ((i2 / i) * 512.0f);
                pccVar.Z = i2;
                pccVar.Y = 512;
                i = 512;
            }
            if (i2 > 512) {
                i = (int) ((i / i2) * 512.0f);
                pccVar.Y = i;
                pccVar.Z = 512;
            } else {
                i3 = i2;
            }
            byte b = pccVar.b;
            if ((b & 1) != 0) {
                if (i <= 0 || i3 <= 0) {
                    return;
                }
                pccVar.G = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                RLottieNative a = RLottieNative.a(pccVar.j, null, null, null, 0, null);
                pccVar.D = a;
                pccVar.F = a != null ? a.a[1] / this.fps : 0.0f;
            } else if ((b & 4) != 0) {
                pccVar.L = false;
                kn knVar = new kn(new File(pccVar.j), true, 0L, 0, null, null, null, 0L, z8c.t0, true, 512, 512, null, 0, true);
                pccVar.K = knVar;
                pccVar.F = knVar.d[5] / this.fps;
                pccVar.E = 1.0f;
                knVar.r(true);
            } else {
                String str = pccVar.j;
                if (!TextUtils.isEmpty(pccVar.t) && (pccVar.b & 16) != 0) {
                    str = pccVar.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (pccVar.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                pccVar.G = decodeFile;
                if (pccVar.a == 2 && decodeFile != null) {
                    pccVar.s = gm.L(12.0f) / Math.min(pccVar.q, pccVar.r);
                    Pair N0 = gm.N0(pccVar.j);
                    pccVar.e = (float) (pccVar.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f = pccVar.c;
                        float f2 = pccVar.f;
                        float f3 = (f2 / 2.0f) + f;
                        float f4 = pccVar.d;
                        float f5 = pccVar.g;
                        float f6 = (f5 / 2.0f) + f4;
                        float f7 = this.W;
                        float f8 = this.H;
                        float f9 = (f2 * f7) / f8;
                        float f10 = (f5 * f8) / f7;
                        pccVar.f = f10;
                        pccVar.g = f9;
                        pccVar.c = f3 - (f10 / 2.0f);
                        pccVar.d = f6 - (f9 / 2.0f);
                    }
                    applyRoundRadius(pccVar, pccVar.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / pccVar.G.getHeight();
                    if (width > 1.0f) {
                        float f11 = pccVar.g;
                        float f12 = f11 / width;
                        pccVar.d = aq1.z(f11, f12, 2.0f, pccVar.d);
                        pccVar.g = f12;
                    } else if (width < 1.0f) {
                        float f13 = pccVar.f;
                        float f14 = width * f13;
                        pccVar.c = aq1.z(f13, f14, 2.0f, pccVar.c);
                        pccVar.f = f14;
                    }
                }
            }
            setupMatrix(pccVar);
        }

        private void initTextEntity(final pcc pccVar) {
            int i;
            dw3[] dw3VarArr;
            Typeface b;
            final dv3 dv3Var = new dv3(org.telegram.messenger.a.b);
            dv3Var.getPaint().setAntiAlias(true);
            dv3Var.H = false;
            dv3Var.setBackgroundColor(0);
            dv3Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
            ru7 ru7Var = pccVar.n;
            if (ru7Var != null && (b = ru7Var.b()) != null) {
                dv3Var.setTypeface(b);
            }
            dv3Var.setTextSize(0, pccVar.m);
            SpannableString spannableString = new SpannableString(pccVar.j);
            ArrayList arrayList = pccVar.k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                final occ occVar = (occ) arrayList.get(i2);
                if (occVar.a != null) {
                    pcc pccVar2 = new pcc();
                    occVar.b = pccVar2;
                    pccVar2.j = occVar.a;
                    pccVar2.b = occVar.c;
                    gn gnVar = new gn(0L, 1.0f, dv3Var.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // gn, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                            super.draw(canvas, charSequence, i4, i5, f, i6, i7, i8, paint);
                            pcc pccVar3 = pccVar;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (dv3Var.getPaddingLeft() + f)) / pccVar3.q) * pccVar3.f) + pccVar.c;
                            float f2 = pccVar3.d;
                            pcc pccVar4 = pccVar;
                            float paddingTop = (((i8 - i6) / 2.0f) + (dv3Var.getPaddingTop() + i6)) / pccVar4.r;
                            float f3 = pccVar4.g;
                            float f4 = (paddingTop * f3) + f2;
                            if (pccVar4.e != 0.0f) {
                                float f5 = (pccVar4.f / 2.0f) + pccVar4.c;
                                float f6 = (f3 / 2.0f) + pccVar4.d;
                                float f7 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d = paddingLeft - f5;
                                double d2 = (f4 - f6) / f7;
                                paddingLeft = ((float) ((Math.cos(-pccVar.e) * d) - (Math.sin(-pccVar.e) * d2))) + f5;
                                f4 = (((float) wi8.d(-pccVar.e, d2, Math.sin(-pccVar.e) * d)) * f7) + f6;
                            }
                            pcc pccVar5 = occVar.b;
                            int i9 = this.measuredSize;
                            pcc pccVar6 = pccVar;
                            float f8 = (i9 / pccVar6.q) * pccVar6.f;
                            pccVar5.f = f8;
                            float f9 = (i9 / pccVar6.r) * pccVar6.g;
                            pccVar5.g = f9;
                            pccVar5.c = paddingLeft - (f8 / 2.0f);
                            pccVar5.d = f4 - (f9 / 2.0f);
                            pccVar5.e = pccVar6.e;
                            if (pccVar5.G == null) {
                                FrameDrawer.this.initStickerEntity(pccVar5);
                            }
                        }
                    };
                    int i4 = occVar.offset;
                    spannableString.setSpan(gnVar, i4, occVar.length + i4, 33);
                }
                i2 = i3;
            }
            CharSequence m = gw3.m(spannableString, dv3Var.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m instanceof Spanned) && (dw3VarArr = (dw3[]) ((Spanned) m).getSpans(0, m.length(), dw3.class)) != null) {
                for (dw3 dw3Var : dw3VarArr) {
                    dw3Var.b = 0.85f;
                }
            }
            dv3Var.setText(m);
            dv3Var.setTextColor(pccVar.l);
            int i5 = pccVar.p;
            dv3Var.setGravity(i5 != 1 ? i5 != 2 ? 19 : 21 : 17);
            int i6 = pccVar.p;
            if (i6 != 1) {
                boolean z = jb6.a0;
                i = (i6 == 2 ? !z : z) ? 3 : 2;
            } else {
                i = 4;
            }
            dv3Var.setTextAlignment(i);
            dv3Var.setHorizontallyScrolling(false);
            dv3Var.setImeOptions(TLObject.FLAG_28);
            dv3Var.setFocusableInTouchMode(true);
            dv3Var.setInputType(dv3Var.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(dv3Var);
            byte b2 = pccVar.b;
            if (b2 == 0) {
                dv3Var.setFrameColor(pccVar.l);
                dv3Var.setTextColor(gm.B(pccVar.l) >= 0.721f ? -16777216 : -1);
            } else if (b2 == 1) {
                dv3Var.setFrameColor(gm.B(pccVar.l) >= 0.25f ? -1728053248 : -1711276033);
                dv3Var.setTextColor(pccVar.l);
            } else if (b2 == 2) {
                dv3Var.setFrameColor(gm.B(pccVar.l) >= 0.25f ? -16777216 : -1);
                dv3Var.setTextColor(pccVar.l);
            } else if (b2 == 3) {
                dv3Var.setFrameColor(0);
                dv3Var.setTextColor(pccVar.l);
            }
            dv3Var.measure(View.MeasureSpec.makeMeasureSpec(pccVar.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(pccVar.r, TLObject.FLAG_30));
            dv3Var.layout(0, 0, pccVar.q, pccVar.r);
            pccVar.G = Bitmap.createBitmap(pccVar.q, pccVar.r, Bitmap.Config.ARGB_8888);
            dv3Var.draw(new Canvas(pccVar.G));
            setupMatrix(pccVar);
        }

        private void setupMatrix(pcc pccVar) {
            kn knVar;
            Matrix matrix = new Matrix();
            pccVar.H = matrix;
            Bitmap bitmap = pccVar.G;
            if (bitmap == null && (knVar = pccVar.K) != null) {
                hn hnVar = knVar.w;
                bitmap = hnVar != null ? hnVar.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (pccVar.a != 1 && (pccVar.b & 2) != 0) {
                pccVar.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            pccVar.H.postScale(pccVar.f * this.W, pccVar.g * this.H);
            pccVar.H.postTranslate(pccVar.c * this.W, pccVar.d * this.H);
            pccVar.H.postRotate((float) (((-pccVar.e) / 3.141592653589793d) * 180.0d), ((pccVar.f / 2.0f) + pccVar.c) * this.W, ((pccVar.g / 2.0f) + pccVar.d) * this.H);
        }

        public void draw(Canvas canvas, int i) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j = (1000000000 / this.fps) * i;
            int size = this.mediaEntities.size();
            for (int i2 = 0; i2 < size; i2++) {
                pcc pccVar = this.mediaEntities.get(i2);
                drawEntity(canvas, pccVar, pccVar.l, j);
            }
            canvas.restore();
        }

        public void setBreakStrategy(dv3 dv3Var) {
            dv3Var.setBreakStrategy(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean convert(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams, int i) {
        long j;
        boolean z;
        long length;
        po6 po6Var;
        int i2;
        int i3;
        po6 po6Var2;
        int i4 = convertVideoParams.resultWidth;
        int i5 = convertVideoParams.resultHeight;
        long createEncoder = createEncoder(convertVideoParams.cacheFile.getAbsolutePath(), i4, i5, convertVideoParams.framerate, convertVideoParams.bitrate);
        boolean z2 = true;
        if (createEncoder == 0) {
            return true;
        }
        Bitmap bitmap = null;
        try {
            try {
                bitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getByteCount());
                Canvas canvas = new Canvas(bitmap);
                FrameDrawer frameDrawer = new FrameDrawer(convertVideoParams);
                int ceil = (int) Math.ceil((convertVideoParams.duration / 1000.0d) * convertVideoParams.framerate);
                int i6 = 0;
                while (i6 < ceil) {
                    frameDrawer.draw(canvas, i6);
                    bitmap.copyPixelsToBuffer(allocateDirect);
                    allocateDirect.flip();
                    if (!writeFrame(createEncoder, allocateDirect, i4, i5)) {
                        try {
                            fc4.b("webm writeFile error at " + i6 + "/" + ceil);
                            stop(createEncoder);
                            bitmap.recycle();
                            return z2;
                        } catch (Exception e) {
                            e = e;
                            j = createEncoder;
                            fc4.g(e, z2);
                            stop(j);
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            z = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i > 0) {
                            }
                            po6Var = convertVideoParams.callback;
                            if (po6Var != null) {
                            }
                            fc4.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
                            return z;
                        }
                    }
                    po6 po6Var3 = convertVideoParams.callback;
                    if (po6Var3 != null) {
                        i2 = i4;
                        j = createEncoder;
                        i3 = i5;
                        try {
                            try {
                                ((trc) po6Var3).n(Math.min(261120L, convertVideoParams.cacheFile.length()), i6 / ceil);
                            } catch (Throwable th) {
                                th = th;
                                stop(j);
                                if (bitmap != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z2 = true;
                            fc4.g(e, z2);
                            stop(j);
                            if (bitmap != null) {
                            }
                            z = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i > 0) {
                            }
                            po6Var = convertVideoParams.callback;
                            if (po6Var != null) {
                            }
                            fc4.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
                            return z;
                        }
                    } else {
                        i2 = i4;
                        j = createEncoder;
                        i3 = i5;
                    }
                    if (i6 % 3 == 0 && (po6Var2 = convertVideoParams.callback) != null) {
                        boolean z3 = ((rcc) ((trc) po6Var2).b).V;
                    }
                    i6++;
                    i5 = i3;
                    i4 = i2;
                    createEncoder = j;
                    z2 = true;
                }
                stop(createEncoder);
                bitmap.recycle();
                z = false;
            } catch (Throwable th2) {
                th = th2;
                j = createEncoder;
                stop(j);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            j = createEncoder;
        }
        length = convertVideoParams.cacheFile.length();
        if (i > 0 || length <= 261120) {
            po6Var = convertVideoParams.callback;
            if (po6Var != null) {
                ((trc) po6Var).n(length, 1.0f);
            }
            fc4.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
            return z;
        }
        int i7 = convertVideoParams.bitrate;
        convertVideoParams.bitrate = (int) ((261120.0f / length) * 0.9f * i7);
        convertVideoParams.cacheFile.delete();
        fc4.b("webm encoded too much, got " + length + ", old bitrate = " + i7 + " new bitrate = " + convertVideoParams.bitrate);
        return convert(convertVideoParams, i - 1);
    }

    private static native long createEncoder(String str, int i, int i2, int i3, long j);

    public static native void stop(long j);

    private static native boolean writeFrame(long j, ByteBuffer byteBuffer, int i, int i2);
}
