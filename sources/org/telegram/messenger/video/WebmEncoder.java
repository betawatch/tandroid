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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class WebmEncoder {

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<mac> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<mac> arrayList = new ArrayList<>();
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
                mac macVar = this.mediaEntities.get(i3);
                byte b = macVar.a;
                if (b == 0 || b == 2 || b == 5) {
                    initStickerEntity(macVar);
                } else if (b == 1) {
                    initTextEntity(macVar);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(mac macVar, Bitmap bitmap, int i) {
            if (bitmap == null || macVar == null) {
                return;
            }
            if (macVar.s == 0.0f && i == 0) {
                return;
            }
            if (macVar.M == null) {
                macVar.M = new Canvas(bitmap);
            }
            if (macVar.s != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * macVar.s;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                macVar.M.drawPath(this.path, this.xRefPaint);
            }
            if (i != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i);
                macVar.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }

        private void drawEntity(Canvas canvas, mac macVar, int i, long j) {
            FrameDrawer frameDrawer;
            Canvas canvas2;
            long j2;
            mac macVar2;
            km kmVar;
            RLottieNative rLottieNative = macVar.D;
            int i2 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = macVar.G;
                if (bitmap == null || macVar.Y <= 0 || macVar.Z <= 0) {
                    return;
                }
                rLottieNative.c((int) macVar.E, bitmap, true);
                Bitmap bitmap2 = macVar.G;
                if ((macVar.b & 8) == 0) {
                    i = 0;
                }
                applyRoundRadius(macVar, bitmap2, i);
                canvas.drawBitmap(macVar.G, macVar.H, this.bitmapPaint);
                float f = macVar.E + macVar.F;
                macVar.E = f;
                if (f >= macVar.D.a[0]) {
                    macVar.E = 0.0f;
                    return;
                }
                return;
            }
            if (macVar.K != null) {
                float f2 = macVar.E;
                int i3 = (int) f2;
                float f3 = f2 + macVar.F;
                macVar.E = f3;
                int i4 = (int) f3;
                while (true) {
                    kmVar = macVar.K;
                    if (i3 == i4) {
                        break;
                    }
                    kmVar.r(true);
                    i4--;
                }
                hm hmVar = kmVar.w;
                Bitmap bitmap3 = hmVar != null ? hmVar.b : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, macVar.H, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(macVar.G, macVar.H, this.bitmapPaint);
            ArrayList arrayList = macVar.k;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i2 < macVar.k.size()) {
                lac lacVar = (lac) macVar.k.get(i2);
                if (lacVar == null || (macVar2 = lacVar.b) == null) {
                    frameDrawer = this;
                    canvas2 = canvas;
                    j2 = j;
                } else {
                    frameDrawer = this;
                    canvas2 = canvas;
                    j2 = j;
                    frameDrawer.drawEntity(canvas2, macVar2, macVar.l, j2);
                }
                i2++;
                this = frameDrawer;
                canvas = canvas2;
                j = j2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initStickerEntity(mac macVar) {
            int i = (int) (macVar.f * this.W);
            macVar.Y = i;
            int i2 = (int) (macVar.g * this.H);
            macVar.Z = i2;
            int i3 = 512;
            if (i > 512) {
                i2 = (int) ((i2 / i) * 512.0f);
                macVar.Z = i2;
                macVar.Y = 512;
                i = 512;
            }
            if (i2 > 512) {
                i = (int) ((i / i2) * 512.0f);
                macVar.Y = i;
                macVar.Z = 512;
            } else {
                i3 = i2;
            }
            byte b = macVar.b;
            if ((b & 1) != 0) {
                if (i <= 0 || i3 <= 0) {
                    return;
                }
                macVar.G = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                RLottieNative a = RLottieNative.a(macVar.j, null, null, null, 0, null);
                macVar.D = a;
                macVar.F = a != null ? a.a[1] / this.fps : 0.0f;
            } else if ((b & 4) != 0) {
                macVar.L = false;
                km kmVar = new km(new File(macVar.j), true, 0L, 0, null, null, null, 0L, y6c.t0, true, 512, 512, null, 0, true);
                macVar.K = kmVar;
                macVar.F = kmVar.d[5] / this.fps;
                macVar.E = 1.0f;
                kmVar.r(true);
            } else {
                String str = macVar.j;
                if (!TextUtils.isEmpty(macVar.t) && (macVar.b & 16) != 0) {
                    str = macVar.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (macVar.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                macVar.G = decodeFile;
                if (macVar.a == 2 && decodeFile != null) {
                    macVar.s = gl.L(12.0f) / Math.min(macVar.q, macVar.r);
                    Pair N0 = gl.N0(macVar.j);
                    macVar.e = (float) (macVar.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f = macVar.c;
                        float f2 = macVar.f;
                        float f3 = (f2 / 2.0f) + f;
                        float f4 = macVar.d;
                        float f5 = macVar.g;
                        float f6 = (f5 / 2.0f) + f4;
                        float f7 = this.W;
                        float f8 = this.H;
                        float f9 = (f2 * f7) / f8;
                        float f10 = (f5 * f8) / f7;
                        macVar.f = f10;
                        macVar.g = f9;
                        macVar.c = f3 - (f10 / 2.0f);
                        macVar.d = f6 - (f9 / 2.0f);
                    }
                    applyRoundRadius(macVar, macVar.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / macVar.G.getHeight();
                    if (width > 1.0f) {
                        float f11 = macVar.g;
                        float f12 = f11 / width;
                        macVar.d = oo1.z(f11, f12, 2.0f, macVar.d);
                        macVar.g = f12;
                    } else if (width < 1.0f) {
                        float f13 = macVar.f;
                        float f14 = width * f13;
                        macVar.c = oo1.z(f13, f14, 2.0f, macVar.c);
                        macVar.f = f14;
                    }
                }
            }
            setupMatrix(macVar);
        }

        private void initTextEntity(final mac macVar) {
            int i;
            su3[] su3VarArr;
            Typeface b;
            final st3 st3Var = new st3(org.telegram.messenger.a.b);
            st3Var.getPaint().setAntiAlias(true);
            st3Var.H = false;
            st3Var.setBackgroundColor(0);
            st3Var.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
            qs7 qs7Var = macVar.n;
            if (qs7Var != null && (b = qs7Var.b()) != null) {
                st3Var.setTypeface(b);
            }
            st3Var.setTextSize(0, macVar.m);
            SpannableString spannableString = new SpannableString(macVar.j);
            ArrayList arrayList = macVar.k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                final lac lacVar = (lac) arrayList.get(i2);
                if (lacVar.a != null) {
                    mac macVar2 = new mac();
                    lacVar.b = macVar2;
                    macVar2.j = lacVar.a;
                    macVar2.b = lacVar.c;
                    gm gmVar = new gm(0L, 1.0f, st3Var.getPaint().getFontMetricsInt()) { // from class: org.telegram.messenger.video.WebmEncoder.FrameDrawer.1
                        @Override // gm, android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                            super.draw(canvas, charSequence, i4, i5, f, i6, i7, i8, paint);
                            mac macVar3 = macVar;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (st3Var.getPaddingLeft() + f)) / macVar3.q) * macVar3.f) + macVar.c;
                            float f2 = macVar3.d;
                            mac macVar4 = macVar;
                            float paddingTop = (((i8 - i6) / 2.0f) + (st3Var.getPaddingTop() + i6)) / macVar4.r;
                            float f3 = macVar4.g;
                            float f4 = (paddingTop * f3) + f2;
                            if (macVar4.e != 0.0f) {
                                float f5 = (macVar4.f / 2.0f) + macVar4.c;
                                float f6 = (f3 / 2.0f) + macVar4.d;
                                float f7 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d = paddingLeft - f5;
                                double d2 = (f4 - f6) / f7;
                                paddingLeft = ((float) ((Math.cos(-macVar.e) * d) - (Math.sin(-macVar.e) * d2))) + f5;
                                f4 = (((float) ug8.d(-macVar.e, d2, Math.sin(-macVar.e) * d)) * f7) + f6;
                            }
                            mac macVar5 = lacVar.b;
                            int i9 = this.measuredSize;
                            mac macVar6 = macVar;
                            float f8 = (i9 / macVar6.q) * macVar6.f;
                            macVar5.f = f8;
                            float f9 = (i9 / macVar6.r) * macVar6.g;
                            macVar5.g = f9;
                            macVar5.c = paddingLeft - (f8 / 2.0f);
                            macVar5.d = f4 - (f9 / 2.0f);
                            macVar5.e = macVar6.e;
                            if (macVar5.G == null) {
                                FrameDrawer.this.initStickerEntity(macVar5);
                            }
                        }
                    };
                    int i4 = lacVar.offset;
                    spannableString.setSpan(gmVar, i4, lacVar.length + i4, 33);
                }
                i2 = i3;
            }
            CharSequence m = vu3.m(spannableString, st3Var.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m instanceof Spanned) && (su3VarArr = (su3[]) ((Spanned) m).getSpans(0, m.length(), su3.class)) != null) {
                for (su3 su3Var : su3VarArr) {
                    su3Var.b = 0.85f;
                }
            }
            st3Var.setText(m);
            st3Var.setTextColor(macVar.l);
            int i5 = macVar.p;
            st3Var.setGravity(i5 != 1 ? i5 != 2 ? 19 : 21 : 17);
            int i6 = macVar.p;
            if (i6 != 1) {
                boolean z = k96.a0;
                i = (i6 == 2 ? !z : z) ? 3 : 2;
            } else {
                i = 4;
            }
            st3Var.setTextAlignment(i);
            st3Var.setHorizontallyScrolling(false);
            st3Var.setImeOptions(TLObject.FLAG_28);
            st3Var.setFocusableInTouchMode(true);
            st3Var.setInputType(st3Var.getInputType() | TLObject.FLAG_14);
            setBreakStrategy(st3Var);
            byte b2 = macVar.b;
            if (b2 == 0) {
                st3Var.setFrameColor(macVar.l);
                st3Var.setTextColor(gl.B(macVar.l) >= 0.721f ? -16777216 : -1);
            } else if (b2 == 1) {
                st3Var.setFrameColor(gl.B(macVar.l) >= 0.25f ? -1728053248 : -1711276033);
                st3Var.setTextColor(macVar.l);
            } else if (b2 == 2) {
                st3Var.setFrameColor(gl.B(macVar.l) >= 0.25f ? -16777216 : -1);
                st3Var.setTextColor(macVar.l);
            } else if (b2 == 3) {
                st3Var.setFrameColor(0);
                st3Var.setTextColor(macVar.l);
            }
            st3Var.measure(View.MeasureSpec.makeMeasureSpec(macVar.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(macVar.r, TLObject.FLAG_30));
            st3Var.layout(0, 0, macVar.q, macVar.r);
            macVar.G = Bitmap.createBitmap(macVar.q, macVar.r, Bitmap.Config.ARGB_8888);
            st3Var.draw(new Canvas(macVar.G));
            setupMatrix(macVar);
        }

        private void setupMatrix(mac macVar) {
            km kmVar;
            Matrix matrix = new Matrix();
            macVar.H = matrix;
            Bitmap bitmap = macVar.G;
            if (bitmap == null && (kmVar = macVar.K) != null) {
                hm hmVar = kmVar.w;
                bitmap = hmVar != null ? hmVar.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (macVar.a != 1 && (macVar.b & 2) != 0) {
                macVar.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            macVar.H.postScale(macVar.f * this.W, macVar.g * this.H);
            macVar.H.postTranslate(macVar.c * this.W, macVar.d * this.H);
            macVar.H.postRotate((float) (((-macVar.e) / 3.141592653589793d) * 180.0d), ((macVar.f / 2.0f) + macVar.c) * this.W, ((macVar.g / 2.0f) + macVar.d) * this.H);
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
                mac macVar = this.mediaEntities.get(i2);
                drawEntity(canvas, macVar, macVar.l, j);
            }
            canvas.restore();
        }

        public void setBreakStrategy(st3 st3Var) {
            st3Var.setBreakStrategy(0);
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
        pm6 pm6Var;
        int i2;
        int i3;
        pm6 pm6Var2;
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
                            fa4.b("webm writeFile error at " + i6 + "/" + ceil);
                            stop(createEncoder);
                            bitmap.recycle();
                            return z2;
                        } catch (Exception e) {
                            e = e;
                            j = createEncoder;
                            fa4.g(e, z2);
                            stop(j);
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            z = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i > 0) {
                            }
                            pm6Var = convertVideoParams.callback;
                            if (pm6Var != null) {
                            }
                            fa4.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
                            return z;
                        }
                    }
                    pm6 pm6Var3 = convertVideoParams.callback;
                    if (pm6Var3 != null) {
                        i2 = i4;
                        j = createEncoder;
                        i3 = i5;
                        try {
                            try {
                                ((spc) pm6Var3).n(Math.min(261120L, convertVideoParams.cacheFile.length()), i6 / ceil);
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
                            fa4.g(e, z2);
                            stop(j);
                            if (bitmap != null) {
                            }
                            z = true;
                            length = convertVideoParams.cacheFile.length();
                            if (i > 0) {
                            }
                            pm6Var = convertVideoParams.callback;
                            if (pm6Var != null) {
                            }
                            fa4.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
                            return z;
                        }
                    } else {
                        i2 = i4;
                        j = createEncoder;
                        i3 = i5;
                    }
                    if (i6 % 3 == 0 && (pm6Var2 = convertVideoParams.callback) != null) {
                        boolean z3 = ((oac) ((spc) pm6Var2).b).V;
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
            pm6Var = convertVideoParams.callback;
            if (pm6Var != null) {
                ((spc) pm6Var).n(length, 1.0f);
            }
            fa4.b("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
            return z;
        }
        int i7 = convertVideoParams.bitrate;
        convertVideoParams.bitrate = (int) ((261120.0f / length) * 0.9f * i7);
        convertVideoParams.cacheFile.delete();
        fa4.b("webm encoded too much, got " + length + ", old bitrate = " + i7 + " new bitrate = " + convertVideoParams.bitrate);
        return convert(convertVideoParams, i - 1);
    }

    private static native long createEncoder(String str, int i, int i2, int i3, long j);

    public static native void stop(long j);

    private static native boolean writeFrame(long j, ByteBuffer byteBuffer, int i, int i2);
}
