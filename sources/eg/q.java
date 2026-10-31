package eg;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.messenger.v2;
import org.telegram.messenger.v20;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.k61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class q extends FrameLayout implements a {
    public float D;
    public float E;
    public boolean F;
    public final c G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public int K;
    public o L;
    public p M;
    public final RectF N;
    public final RectF O;
    public final CropAreaView a;
    public final ImageView b;
    public final Matrix c;
    public k61 d;
    public g e;
    public final RectF f;
    public final RectF h;
    public float n;
    public final boolean r;
    public final za.c s;
    public final Matrix w;
    public Bitmap x;
    public boolean y;

    public q(Context context) {
        super(context);
        this.H = new float[9];
        this.N = new RectF();
        this.O = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.r = z10;
        this.f = new RectF();
        this.h = new RectF();
        this.c = new Matrix();
        za.c cVar = new za.c(18, false);
        cVar.b = new float[8];
        this.s = cVar;
        this.w = new Matrix();
        this.F = false;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        c cVar2 = new c(context);
        this.G = cVar2;
        cVar2.b = this;
        CropAreaView cropAreaView = new CropAreaView(context);
        cropAreaView.d = new RectF();
        cropAreaView.e = new RectF();
        cropAreaView.f = new RectF();
        cropAreaView.h = new RectF();
        cropAreaView.n = new RectF();
        cropAreaView.r = new RectF();
        cropAreaView.s = new RectF();
        cropAreaView.w = new RectF();
        cropAreaView.y = new RectF();
        cropAreaView.D = new RectF();
        cropAreaView.K = -1.0f;
        cropAreaView.L = 1.0f;
        cropAreaView.M = -1.0f;
        cropAreaView.U = new AccelerateDecelerateInterpolator();
        cropAreaView.f0 = true;
        cropAreaView.l0 = new RectF();
        cropAreaView.n0 = 0.0f;
        cropAreaView.o0 = 1.0f;
        cropAreaView.p0 = 0.0f;
        cropAreaView.q0 = 0.0f;
        cropAreaView.a0 = z10;
        cropAreaView.J = true;
        cropAreaView.I = true;
        cropAreaView.V = i0.L(16.0f);
        cropAreaView.W = i0.L(32.0f);
        cropAreaView.t0 = 1;
        Paint paint = new Paint();
        cropAreaView.O = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        cropAreaView.P = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(i0.L(2.0f));
        Paint paint3 = new Paint();
        cropAreaView.Q = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(i0.L(1.0f));
        Paint paint4 = new Paint();
        cropAreaView.R = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        cropAreaView.S = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        cropAreaView.h0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        cropAreaView.T = paint7;
        paint7.setColor(-1);
        cropAreaView.setWillNotDraw(false);
        this.a = cropAreaView;
        cropAreaView.setListener(this);
        addView(cropAreaView);
    }

    public static void a(q qVar, Integer[][] numArr, int i10) {
        qVar.I = false;
        if (i10 == 0) {
            o oVar = qVar.L;
            float f7 = oVar.g % 180.0f;
            qVar.setLockedAspectRatio((f7 != 0.0f ? oVar.b : oVar.a) / (f7 != 0.0f ? oVar.a : oVar.b));
        } else {
            if (i10 == 1) {
                qVar.setLockedAspectRatio(1.0f);
                return;
            }
            Integer[] numArr2 = numArr[i10 - 2];
            if (qVar.a.getAspectRatio() > 1.0f) {
                qVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
            } else {
                qVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
            }
        }
    }

    public static void c(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i10, int i11, float f7, float f10, float f11, float f12, ArrayList arrayList) {
        int i12 = i10;
        int i13 = i11;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix2 = new Matrix();
            char c10 = 2;
            matrix2.postTranslate((-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2);
            float max = 1.0f / (Math.max(decodeFile.getWidth(), decodeFile.getHeight()) / Math.max(i10, i11));
            matrix2.postScale(max, max);
            matrix2.postRotate(f11);
            matrix2.postConcat(matrix);
            matrix2.postScale(f12, f12);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(decodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    v20 v20Var = (v20) arrayList.get(i14);
                    float width = ((v20Var.f / 2.0f) + v20Var.c) * decodeFile.getWidth();
                    float height = ((v20Var.g / 2.0f) + v20Var.d) * decodeFile.getHeight();
                    char c11 = c10;
                    float width2 = v20Var.y * decodeFile.getWidth();
                    float height2 = v20Var.z * decodeFile.getHeight();
                    float[] fArr = new float[4];
                    fArr[0] = width;
                    fArr[1] = height;
                    fArr[c11] = width2;
                    fArr[3] = height2;
                    matrix2.mapPoints(fArr);
                    int width3 = decodeFile.getWidth();
                    int height3 = decodeFile.getHeight();
                    if (f11 == 90.0f || f11 == 270.0f) {
                        width3 = decodeFile.getHeight();
                        height3 = decodeFile.getWidth();
                    }
                    if (v20Var.a == 1) {
                        v20Var.f = ((v20Var.f * i12) / bitmap.getWidth()) * f12 * f7;
                        v20Var.g = ((v20Var.g * i13) / bitmap.getHeight()) * f12 * f7;
                    } else {
                        float f13 = i12;
                        float f14 = width3;
                        v20Var.q = (int) ((v20Var.q / f13) * f14);
                        float f15 = i13;
                        float f16 = height3;
                        v20Var.r = (int) ((v20Var.r / f15) * f16);
                        v20Var.f = ((v20Var.f * f13) / f14) * f12 * f7;
                        v20Var.g = ((v20Var.g * f15) / f16) * f12 * f7;
                    }
                    v20Var.c = (fArr[0] / bitmap.getWidth()) - (v20Var.f / 2.0f);
                    v20Var.d = (fArr[1] / bitmap.getHeight()) - (v20Var.g / 2.0f);
                    v20Var.y = fArr[c11] / bitmap.getWidth();
                    v20Var.z = fArr[3] / bitmap.getHeight();
                    v20Var.e = (float) (v20Var.e - ((f10 + f11) * 0.017453292519943295d));
                    i14++;
                    i12 = i10;
                    i13 = i11;
                    c10 = c11;
                }
            }
            decodeFile.recycle();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    public static float f(RectF rectF, float f7, float f10) {
        float width = rectF.width() * f10;
        float height = rectF.height() * f10;
        float width2 = (rectF.width() - width) / 2.0f;
        float height2 = (rectF.height() - height) / 2.0f;
        float f11 = rectF.left + width2;
        float f12 = rectF.top + height2;
        rectF.set(f11, f12, width + f11, height + f12);
        return f7 * f10;
    }

    public static void g(RectF rectF, RectF rectF2, PointF pointF, float f7) {
        float f10 = rectF2.left;
        float f11 = rectF2.top;
        float f12 = rectF2.right;
        float f13 = rectF2.bottom;
        float f14 = rectF.left;
        if (f14 > f10) {
            f12 += f14 - f10;
            f10 = f14;
        }
        float f15 = rectF.top;
        if (f15 > f11) {
            f13 += f15 - f11;
            f11 = f15;
        }
        float f16 = rectF.right;
        if (f16 < f12) {
            f10 += f16 - f12;
        }
        float f17 = rectF.bottom;
        if (f17 < f13) {
            f11 += f17 - f13;
        }
        float centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f10);
        float centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f11);
        double d = f7;
        double d10 = 1.5707963267948966d - d;
        double d11 = centerX;
        float sin = (float) (Math.sin(d10) * d11);
        float cos = (float) (Math.cos(d10) * d11);
        double d12 = d + 1.5707963267948966d;
        double d13 = centerY;
        pointF.set(pointF.x + sin + ((float) (Math.cos(d12) * d13)), pointF.y + cos + ((float) (Math.sin(d12) * d13)));
    }

    public static String h(String str) {
        File file = new File(b8.z(4), tz.p() + "_temp.jpg");
        try {
            i0.E(new File(str), file);
        } catch (Exception e) {
            f8.g(e, true);
        }
        return file.getAbsolutePath();
    }

    public static float n(RectF rectF, RectF rectF2) {
        float width = rectF2.width();
        if (((float) Math.floor((rectF.height() * width) / rectF.width())) <= rectF2.height()) {
            return width;
        }
        return (float) Math.floor((rectF.width() * rectF2.height()) / rectF.height());
    }

    private void setLockedAspectRatio(float f7) {
        CropAreaView cropAreaView = this.a;
        cropAreaView.setLockedAspectRatio(f7);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f7);
        d(rectF);
        p pVar = this.M;
        if (pVar != null) {
            pVar.l(false);
            this.M.g(true);
        }
    }

    public final void b(ye yeVar) {
        int i10;
        int i11;
        float f7;
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.N);
        int ceil = (int) Math.ceil(n(r1, this.O));
        int ceil2 = (int) Math.ceil(r2 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.L.k;
        float[] fArr = this.H;
        matrix.getValues(fArr);
        o oVar = this.L;
        float f10 = oVar.f * cropWidth;
        yeVar.k = (int) oVar.h;
        if (v2.a) {
            i0.a.p(yeVar.k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i10 = yeVar.k;
            if (i10 >= 0) {
                break;
            } else {
                yeVar.k = i10 + 360;
            }
        }
        if (i10 == 90 || i10 == 270) {
            o oVar2 = this.L;
            i11 = (int) oVar2.b;
            f7 = oVar2.a;
        } else {
            o oVar3 = this.L;
            i11 = (int) oVar3.a;
            f7 = oVar3.b;
        }
        int i12 = (int) f7;
        float f11 = i11;
        yeVar.e = (float) (ceil / Math.ceil(f11 * f10));
        float f12 = i12;
        float ceil3 = (float) (ceil2 / Math.ceil(f10 * f12));
        yeVar.f = ceil3;
        float f13 = yeVar.e;
        if (f13 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f13, ceil3);
            yeVar.e /= max;
            yeVar.f /= max;
        }
        yeVar.c = Math.min(f11 / cropAreaView.getCropWidth(), f12 / cropAreaView.getCropHeight()) * this.L.e;
        float f14 = fArr[2] / f11;
        o oVar4 = this.L;
        float f15 = oVar4.e;
        yeVar.a = f14 / f15;
        yeVar.b = (fArr[5] / f12) / f15;
        yeVar.d = oVar4.i;
        yeVar.m = f15;
        yeVar.l = oVar4.j;
        yeVar.o = cropWidth;
        yeVar.r = oVar4.k;
        yeVar.s = ceil;
        yeVar.t = ceil2;
        yeVar.u = this.y;
        yeVar.v = cropAreaView.getLockAspectRatio();
        yeVar.C = true;
    }

    public final void d(RectF rectF) {
        boolean z10;
        if (this.L == null) {
            return;
        }
        int i10 = 0;
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f7 = this.L.e;
        if (f7 * max > 30.0f) {
            max = 30.0f / f7;
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = max;
        int i11 = !this.r ? i0.m : 0;
        float centerX = rectF.centerX();
        ImageView imageView = this.b;
        float a2 = o.a(this.L) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = o.b(this.L) * ((rectF.centerY() - ((((imageView.getHeight() - this.D) + i11) + this.E) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h(this, f10, fArr, a2, b10, 0));
        ofFloat.addListener(new m(i10, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.U;
        AnimatorSet animatorSet = cropAreaView.k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.k0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.k0 = animatorSet2;
        animatorSet2.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cropAreaView, "cropLeft", rectF.left);
        ofFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cropAreaView, "cropTop", rectF.top);
        ofFloat3.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cropAreaView, "cropRight", rectF.right);
        ofFloat4.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cropAreaView, "cropBottom", rectF.bottom);
        ofFloat5.setInterpolator(accelerateDecelerateInterpolator);
        ofFloat.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat);
        animatorSet2.addListener(new bg.f(3, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f7;
        if (this.L == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        float cropWidth = cropAreaView.getCropWidth();
        float cropHeight = cropAreaView.getCropHeight();
        float a2 = o.a(this.L);
        float b10 = o.b(this.L);
        float f10 = this.L.i;
        float radians = (float) Math.toRadians(f10);
        RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
        Matrix matrix = new Matrix();
        matrix.postRotate(f10, cropWidth / 2.0f, cropHeight / 2.0f);
        matrix.mapRect(rectF);
        RectF rectF2 = new RectF(0.0f, 0.0f, a2, b10);
        float f11 = (cropWidth - a2) / 2.0f;
        o oVar = this.L;
        float f12 = oVar.e;
        za.c cVar = this.s;
        float[] fArr = (float[]) cVar.b;
        float[] fArr2 = (float[]) cVar.b;
        float f13 = rectF2.left;
        fArr[0] = f13;
        float f14 = rectF2.top;
        fArr[1] = f14;
        float f15 = rectF2.right;
        fArr[2] = f15;
        fArr[3] = f14;
        fArr[4] = f15;
        float f16 = rectF2.bottom;
        fArr[5] = f16;
        fArr[6] = f13;
        fArr[7] = f16;
        Matrix matrix2 = new Matrix();
        matrix2.set(oVar.k);
        matrix2.preTranslate(f11 / f12, ((cropHeight - b10) / 2.0f) / f12);
        Matrix matrix3 = this.w;
        matrix3.reset();
        matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
        matrix3.setConcat(matrix3, matrix2);
        matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix3.mapPoints(fArr2);
        matrix3.reset();
        matrix3.preRotate(-f10, a2 / 2.0f, b10 / 2.0f);
        matrix3.mapPoints(fArr2);
        rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
        o oVar2 = this.L;
        PointF pointF = new PointF(oVar2.c, oVar2.d);
        if (!rectF2.contains(rectF)) {
            f7 = (!z10 || (rectF.width() <= rectF2.width() && rectF.height() <= rectF2.height())) ? f12 : f(rectF2, f12, rectF.width() / n(rectF, rectF2));
            g(rectF2, rectF, pointF, radians);
        } else if (!z11 || this.n <= 0.0f) {
            f7 = f12;
        } else {
            float width = rectF.width() / n(rectF, rectF2);
            if (this.L.e * width < this.n) {
                width = 1.0f;
            }
            f7 = f(rectF2, f12, width);
            g(rectF2, rectF, pointF, radians);
        }
        float f17 = pointF.x;
        o oVar3 = this.L;
        float f18 = f17 - oVar3.c;
        float f19 = pointF.y - oVar3.d;
        if (!z12) {
            o.f(oVar3, f18, f19);
            o.g(this.L, f7 / f12, 0.0f, 0.0f);
            r(false);
            return;
        }
        float f20 = f7 / f12;
        if (Math.abs(f20 - 1.0f) >= 1.0E-5f || Math.abs(f18) >= 1.0E-5f || Math.abs(f19) >= 1.0E-5f) {
            this.F = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h(this, f18, new float[]{1.0f, 0.0f, 0.0f}, f19, f20, 1));
            ofFloat.addListener(new n(this, z13, z10, z11, z12));
            ofFloat.setInterpolator(cropAreaView.getInterpolator());
            ofFloat.setDuration(z13 ? 100L : 200L);
            ofFloat.start();
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.a;
        RectF rectF = this.N;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.a.getCropHeight();
    }

    public float getCropLeft() {
        return this.a.getCropLeft();
    }

    public float getCropTop() {
        return this.a.getCropTop();
    }

    public float getCropWidth() {
        return this.a.getCropWidth();
    }

    public int getCurrentHeight() {
        k61 k61Var = this.d;
        if (k61Var != null) {
            return k61Var.getVideoHeight();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.K;
        return (i10 == 90 || i10 == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public int getCurrentWidth() {
        k61 k61Var = this.d;
        if (k61Var != null) {
            return k61Var.getVideoWidth();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.K;
        return (i10 == 90 || i10 == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public float getStateFullOrientation() {
        o oVar = this.L;
        if (oVar == null) {
            return 0.0f;
        }
        return oVar.g + oVar.h;
    }

    public boolean getStateMirror() {
        o oVar = this.L;
        return oVar != null && oVar.j;
    }

    public float getStateOrientation() {
        o oVar = this.L;
        if (oVar == null) {
            return 0.0f;
        }
        return oVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        o oVar = this.L;
        if (oVar == null) {
            return;
        }
        final float f7 = oVar.f;
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.k0 = null;
        }
        o oVar2 = this.L;
        if ((oVar2.h + oVar2.g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f10 = currentWidth / currentHeight;
        if (!this.y) {
            f10 = 1.0f;
        }
        cropAreaView.a(this.h, f10);
        cropAreaView.setLockedAspectRatio(this.y ? 0.0f : 1.0f);
        this.n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.y);
        o oVar3 = this.L;
        final float f11 = oVar3.c;
        final float f12 = oVar3.d;
        final float f13 = oVar3.e;
        final float f14 = oVar3.i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eg.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q qVar = q.this;
                if (qVar.L == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = qVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                i0.Z1(rectF4, rectF3, floatValue, rectF5);
                qVar.a.setActualRect(rectF5);
                o oVar4 = qVar.L;
                float f15 = 1.0f - floatValue;
                float f16 = oVar4.c - (f11 * f15);
                float f17 = oVar4.d - (f12 * f15);
                float f18 = oVar4.i - (f14 * f15);
                float T1 = i0.T1(f13, f7, floatValue);
                o oVar5 = qVar.L;
                float f19 = T1 / oVar5.e;
                o.f(oVar5, -f16, -f17);
                o.g(qVar.L, f19, 0.0f, 0.0f);
                o.e(qVar.L, -f18);
                qVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        o oVar = this.L;
        boolean z10 = false;
        if (oVar == null) {
            return false;
        }
        oVar.j = !oVar.j;
        r(false);
        p pVar = this.M;
        if (pVar != null) {
            o oVar2 = this.L;
            float f7 = oVar2.h;
            float f10 = oVar2.g;
            float f11 = ((f7 + f10) - f10) % 360.0f;
            if (!o.c(oVar2) && f11 == 0.0f && this.a.getLockAspectRatio() == 0.0f && !this.L.j) {
                z10 = true;
            }
            pVar.l(z10);
        }
        return this.L.j;
    }

    public final void k() {
        this.a.g(2, false);
        if (this.n < 1.0E-5f) {
            this.n = this.L.e;
        }
    }

    public final void l(boolean z10) {
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.k0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        o oVar = this.L;
        cropAreaView.e(currentWidth, currentHeight, (oVar == null || oVar.g % 180.0f == 0.0f) ? false : true, this.y);
        cropAreaView.setLockedAspectRatio(this.y ? 0.0f : 1.0f);
        o oVar2 = this.L;
        if (oVar2 != null) {
            o.d(oVar2, 0.0f);
            this.L.j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.n = 0.0f;
        p pVar = this.M;
        if (pVar != null) {
            pVar.l(true);
            this.M.g(false);
        }
    }

    public final boolean m(float f7) {
        if (this.L != null) {
            CropAreaView cropAreaView = this.a;
            AnimatorSet animatorSet = cropAreaView.k0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.k0 = null;
            }
            this.n = 0.0f;
            o oVar = this.L;
            float f10 = oVar.h;
            float f11 = oVar.g;
            float f12 = (((f10 + f11) - f11) + f7) % 360.0f;
            if (!this.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(getCurrentWidth(), getCurrentHeight(), (this.L.g + f12) % 180.0f != 0.0f, this.y);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            o.d(this.L, f12);
            r(false);
            e(true, false, false, false);
            p pVar = this.M;
            if (pVar != null) {
                pVar.l(f12 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.L.j);
            }
            if (((int) this.L.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.L == null || this.I) {
            return;
        }
        this.I = true;
        String[] strArr = new String[8];
        int i10 = 0;
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = cd.L0(2131751698, null);
        strArr[1] = cd.L0(2131751696, null);
        int i11 = 2;
        for (int i12 = 0; i12 < 6; i12++) {
            Integer[] numArr2 = numArr[i12];
            if (this.a.getAspectRatio() > 1.0f) {
                strArr[i11] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i11] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i11++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new j(i10, this, numArr));
        x1 x1Var = alertDialog$Builder.a;
        x1Var.setCanceledOnTouchOutside(true);
        x1Var.setOnCancelListener(new k(this, i10));
        x1Var.show();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.F) {
            CropAreaView cropAreaView = this.a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.F) {
                    cropAreaView.g(3, true);
                    this.n = 0.0f;
                    p pVar = this.M;
                    if (pVar != null) {
                        pVar.l(false);
                    }
                }
                try {
                    this.G.a(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p(int i10, g gVar, ye yeVar) {
        this.y = true;
        this.d = null;
        this.e = gVar;
        this.K = i10;
        this.x = null;
        CropAreaView cropAreaView = this.a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.L = new o(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new l(this, yeVar, currentHeight, currentWidth, 0));
    }

    public final void q() {
        int i10;
        float f7;
        if (this.e == null || this.L == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.N);
        int ceil = (int) Math.ceil(n(r2, this.O));
        int ceil2 = (int) Math.ceil(r3 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.L.k;
        float[] fArr = this.H;
        matrix.getValues(fArr);
        o oVar = this.L;
        float f10 = oVar.f * cropWidth;
        int i11 = (int) oVar.h;
        while (i11 < 0) {
            i11 += 360;
        }
        if (i11 == 90 || i11 == 270) {
            o oVar2 = this.L;
            i10 = (int) oVar2.b;
            f7 = oVar2.a;
        } else {
            o oVar3 = this.L;
            i10 = (int) oVar3.a;
            f7 = oVar3.b;
        }
        int i12 = (int) f7;
        double d = ceil;
        float f11 = i10;
        float ceil3 = (float) (d / Math.ceil(f11 * f10));
        float f12 = i12;
        float ceil4 = (float) (ceil2 / Math.ceil(f10 * f12));
        if (ceil3 > 1.0f || ceil4 > 1.0f) {
            float max = Math.max(ceil3, ceil4);
            ceil3 /= max;
            ceil4 /= max;
        }
        float f13 = ceil4;
        float f14 = ceil3;
        RectF rectF = cropAreaView.l0;
        cropAreaView.a(rectF, f11 / f12);
        float width = this.y ? rectF.width() / f11 : Math.max(rectF.width() / f11, rectF.height() / f12);
        o oVar4 = this.L;
        float f15 = oVar4.e;
        float f16 = f15 / width;
        float f17 = f15 / oVar4.f;
        float f18 = (fArr[2] / f11) / f15;
        float f19 = (fArr[5] / f12) / f15;
        float f20 = oVar4.i;
        RectF targetRectToFill = cropAreaView.getTargetRectToFill();
        float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
        float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
        g gVar = this.e;
        o oVar5 = this.L;
        boolean z10 = oVar5.j || o.c(oVar5) || this.L.g >= 1.0E-5f;
        o oVar6 = this.L;
        gVar.e(z10, f18, f19, f20, (int) oVar6.h, f16, f17, oVar6.f / width, f14, f13, cropCenterX, cropCenterY, oVar6.j);
    }

    public final void r(boolean z10) {
        if (this.L == null) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        o oVar = this.L;
        float f7 = oVar.g;
        if (f7 == 90.0f || f7 == 270.0f) {
            matrix.postTranslate((-oVar.b) / 2.0f, (-oVar.a) / 2.0f);
        } else {
            matrix.postTranslate((-oVar.a) / 2.0f, (-oVar.b) / 2.0f);
        }
        matrix.postRotate((int) this.L.h);
        matrix.postConcat(this.L.k);
        CropAreaView cropAreaView = this.a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.y || this.J || z10) {
            q();
            this.M.d();
        }
        invalidate();
    }

    public void setAspectRatio(float f7) {
        this.a.setActualRect(f7);
    }

    public void setBottomPadding(float f7) {
        this.D = f7;
        this.a.setBottomPadding(f7);
    }

    public void setFreeform(boolean z10) {
        this.a.setFreeform(z10);
        this.y = z10;
    }

    public void setListener(p pVar) {
        this.M = pVar;
    }

    @Override // android.view.View
    public void setRotation(float f7) {
        o oVar = this.L;
        o.e(oVar, f7 - oVar.i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.a.setSubtitle(str);
    }

    public void setTopPadding(float f7) {
        this.E = f7;
        this.a.setTopPadding(f7);
    }
}
