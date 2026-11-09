package og;

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
import ch.y;
import fi.ob;
import g6.d0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.h20;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class o extends FrameLayout implements a {
    public float D;
    public float E;
    public boolean F;
    public final c G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public int K;
    public m L;
    public n M;
    public final RectF N;
    public final RectF O;
    public final CropAreaView a;
    public final ImageView b;
    public final Matrix c;
    public i51 d;
    public g e;
    public final RectF f;
    public final RectF h;
    public float n;
    public final boolean r;
    public final d0 s;
    public final Matrix w;
    public Bitmap x;
    public boolean y;

    public o(Context context) {
        super(context);
        this.H = new float[9];
        this.N = new RectF();
        this.O = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z9 = context instanceof BubbleActivity;
        this.r = z9;
        this.f = new RectF();
        this.h = new RectF();
        this.c = new Matrix();
        d0 d0Var = new d0(21, false);
        d0Var.b = new float[8];
        this.s = d0Var;
        this.w = new Matrix();
        this.F = false;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        c cVar = new c(context);
        this.G = cVar;
        cVar.b = this;
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
        cropAreaView.a0 = z9;
        cropAreaView.J = true;
        cropAreaView.I = true;
        cropAreaView.V = g0.L(16.0f);
        cropAreaView.W = g0.L(32.0f);
        cropAreaView.t0 = 1;
        Paint paint = new Paint();
        cropAreaView.O = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        cropAreaView.P = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(g0.L(2.0f));
        Paint paint3 = new Paint();
        cropAreaView.Q = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(g0.L(1.0f));
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

    public static void a(o oVar, Integer[][] numArr, int i7) {
        oVar.I = false;
        if (i7 == 0) {
            m mVar = oVar.L;
            float f10 = mVar.g % 180.0f;
            oVar.setLockedAspectRatio((f10 != 0.0f ? mVar.b : mVar.a) / (f10 != 0.0f ? mVar.a : mVar.b));
        } else {
            if (i7 == 1) {
                oVar.setLockedAspectRatio(1.0f);
                return;
            }
            Integer[] numArr2 = numArr[i7 - 2];
            if (oVar.a.getAspectRatio() > 1.0f) {
                oVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
            } else {
                oVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
            }
        }
    }

    public static void c(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i7, int i10, float f10, float f11, float f12, float f13, ArrayList arrayList) {
        int i11 = i7;
        int i12 = i10;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix2 = new Matrix();
            char c10 = 2;
            matrix2.postTranslate((-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2);
            float max = 1.0f / (Math.max(decodeFile.getWidth(), decodeFile.getHeight()) / Math.max(i7, i10));
            matrix2.postScale(max, max);
            matrix2.postRotate(f12);
            matrix2.postConcat(matrix);
            matrix2.postScale(f13, f13);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(decodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    h20 h20Var = (h20) arrayList.get(i13);
                    float width = ((h20Var.f / 2.0f) + h20Var.c) * decodeFile.getWidth();
                    float height = ((h20Var.g / 2.0f) + h20Var.d) * decodeFile.getHeight();
                    char c11 = c10;
                    float width2 = h20Var.y * decodeFile.getWidth();
                    float height2 = h20Var.z * decodeFile.getHeight();
                    float[] fArr = new float[4];
                    fArr[0] = width;
                    fArr[1] = height;
                    fArr[c11] = width2;
                    fArr[3] = height2;
                    matrix2.mapPoints(fArr);
                    int width3 = decodeFile.getWidth();
                    int height3 = decodeFile.getHeight();
                    if (f12 == 90.0f || f12 == 270.0f) {
                        width3 = decodeFile.getHeight();
                        height3 = decodeFile.getWidth();
                    }
                    if (h20Var.a == 1) {
                        h20Var.f = ((h20Var.f * i11) / bitmap.getWidth()) * f13 * f10;
                        h20Var.g = ((h20Var.g * i12) / bitmap.getHeight()) * f13 * f10;
                    } else {
                        float f14 = i11;
                        float f15 = width3;
                        h20Var.q = (int) ((h20Var.q / f14) * f15);
                        float f16 = i12;
                        float f17 = height3;
                        h20Var.r = (int) ((h20Var.r / f16) * f17);
                        h20Var.f = ((h20Var.f * f14) / f15) * f13 * f10;
                        h20Var.g = ((h20Var.g * f16) / f17) * f13 * f10;
                    }
                    h20Var.c = (fArr[0] / bitmap.getWidth()) - (h20Var.f / 2.0f);
                    h20Var.d = (fArr[1] / bitmap.getHeight()) - (h20Var.g / 2.0f);
                    h20Var.y = fArr[c11] / bitmap.getWidth();
                    h20Var.z = fArr[3] / bitmap.getHeight();
                    h20Var.e = (float) (h20Var.e - ((f11 + f12) * 0.017453292519943295d));
                    i13++;
                    i11 = i7;
                    i12 = i10;
                    c10 = c11;
                }
            }
            decodeFile.recycle();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public static float f(RectF rectF, float f10, float f11) {
        float width = rectF.width() * f11;
        float height = rectF.height() * f11;
        float width2 = (rectF.width() - width) / 2.0f;
        float height2 = (rectF.height() - height) / 2.0f;
        float f12 = rectF.left + width2;
        float f13 = rectF.top + height2;
        rectF.set(f12, f13, width + f12, height + f13);
        return f10 * f11;
    }

    public static void g(RectF rectF, RectF rectF2, PointF pointF, float f10) {
        float f11 = rectF2.left;
        float f12 = rectF2.top;
        float f13 = rectF2.right;
        float f14 = rectF2.bottom;
        float f15 = rectF.left;
        if (f15 > f11) {
            f13 += f15 - f11;
            f11 = f15;
        }
        float f16 = rectF.top;
        if (f16 > f12) {
            f14 += f16 - f12;
            f12 = f16;
        }
        float f17 = rectF.right;
        if (f17 < f13) {
            f11 += f17 - f13;
        }
        float f18 = rectF.bottom;
        if (f18 < f14) {
            f12 += f18 - f14;
        }
        float centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f11);
        float centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f12);
        double d = f10;
        double d2 = 1.5707963267948966d - d;
        double d10 = centerX;
        float sin = (float) (Math.sin(d2) * d10);
        float cos = (float) (Math.cos(d2) * d10);
        double d11 = d + 1.5707963267948966d;
        double d12 = centerY;
        pointF.set(pointF.x + sin + ((float) (Math.cos(d11) * d12)), pointF.y + cos + ((float) (Math.sin(d11) * d12)));
    }

    public static String h(String str) {
        File file = new File(w7.z(4), iz.p() + "_temp.jpg");
        try {
            g0.E(new File(str), file);
        } catch (Exception e10) {
            a8.g(e10, true);
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

    private void setLockedAspectRatio(float f10) {
        CropAreaView cropAreaView = this.a;
        cropAreaView.setLockedAspectRatio(f10);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f10);
        d(rectF);
        n nVar = this.M;
        if (nVar != null) {
            nVar.Z(false);
            this.M.H(true);
        }
    }

    public final void b(ye yeVar) {
        int i7;
        int i10;
        float f10;
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.N);
        int ceil = (int) Math.ceil(n(r1, this.O));
        int ceil2 = (int) Math.ceil(r2 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.L.k;
        float[] fArr = this.H;
        matrix.getValues(fArr);
        m mVar = this.L;
        float f11 = mVar.f * cropWidth;
        yeVar.k = (int) mVar.h;
        if (r2.a) {
            jg.g.s(yeVar.k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i7 = yeVar.k;
            if (i7 >= 0) {
                break;
            } else {
                yeVar.k = i7 + 360;
            }
        }
        if (i7 == 90 || i7 == 270) {
            m mVar2 = this.L;
            i10 = (int) mVar2.b;
            f10 = mVar2.a;
        } else {
            m mVar3 = this.L;
            i10 = (int) mVar3.a;
            f10 = mVar3.b;
        }
        int i11 = (int) f10;
        float f12 = i10;
        yeVar.e = (float) (ceil / Math.ceil(f12 * f11));
        float f13 = i11;
        float ceil3 = (float) (ceil2 / Math.ceil(f11 * f13));
        yeVar.f = ceil3;
        float f14 = yeVar.e;
        if (f14 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f14, ceil3);
            yeVar.e /= max;
            yeVar.f /= max;
        }
        yeVar.c = Math.min(f12 / cropAreaView.getCropWidth(), f13 / cropAreaView.getCropHeight()) * this.L.e;
        float f15 = fArr[2] / f12;
        m mVar4 = this.L;
        float f16 = mVar4.e;
        yeVar.a = f15 / f16;
        yeVar.b = (fArr[5] / f13) / f16;
        yeVar.d = mVar4.i;
        yeVar.m = f16;
        yeVar.l = mVar4.j;
        yeVar.o = cropWidth;
        yeVar.r = mVar4.k;
        yeVar.s = ceil;
        yeVar.t = ceil2;
        yeVar.u = this.y;
        yeVar.v = cropAreaView.getLockAspectRatio();
        yeVar.C = true;
    }

    public final void d(RectF rectF) {
        boolean z9;
        if (this.L == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.L.e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = max;
        int i7 = !this.r ? g0.m : 0;
        float centerX = rectF.centerX();
        ImageView imageView = this.b;
        float a10 = m.a(this.L) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = m.b(this.L) * ((rectF.centerY() - ((((imageView.getHeight() - this.D) + i7) + this.E) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h(this, f11, fArr, a10, b10, 0));
        ofFloat.addListener(new y(17, this, z9));
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
        animatorSet2.addListener(new ah.l(11, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z9, boolean z10, boolean z11, boolean z12) {
        float f10;
        if (this.L == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        float cropWidth = cropAreaView.getCropWidth();
        float cropHeight = cropAreaView.getCropHeight();
        float a10 = m.a(this.L);
        float b10 = m.b(this.L);
        float f11 = this.L.i;
        float radians = (float) Math.toRadians(f11);
        RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
        Matrix matrix = new Matrix();
        matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
        matrix.mapRect(rectF);
        RectF rectF2 = new RectF(0.0f, 0.0f, a10, b10);
        float f12 = (cropWidth - a10) / 2.0f;
        m mVar = this.L;
        float f13 = mVar.e;
        d0 d0Var = this.s;
        float[] fArr = (float[]) d0Var.b;
        float[] fArr2 = (float[]) d0Var.b;
        float f14 = rectF2.left;
        fArr[0] = f14;
        float f15 = rectF2.top;
        fArr[1] = f15;
        float f16 = rectF2.right;
        fArr[2] = f16;
        fArr[3] = f15;
        fArr[4] = f16;
        float f17 = rectF2.bottom;
        fArr[5] = f17;
        fArr[6] = f14;
        fArr[7] = f17;
        Matrix matrix2 = new Matrix();
        matrix2.set(mVar.k);
        matrix2.preTranslate(f12 / f13, ((cropHeight - b10) / 2.0f) / f13);
        Matrix matrix3 = this.w;
        matrix3.reset();
        matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
        matrix3.setConcat(matrix3, matrix2);
        matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix3.mapPoints(fArr2);
        matrix3.reset();
        matrix3.preRotate(-f11, a10 / 2.0f, b10 / 2.0f);
        matrix3.mapPoints(fArr2);
        rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
        m mVar2 = this.L;
        PointF pointF = new PointF(mVar2.c, mVar2.d);
        if (!rectF2.contains(rectF)) {
            f10 = (!z9 || (rectF.width() <= rectF2.width() && rectF.height() <= rectF2.height())) ? f13 : f(rectF2, f13, rectF.width() / n(rectF, rectF2));
            g(rectF2, rectF, pointF, radians);
        } else if (!z10 || this.n <= 0.0f) {
            f10 = f13;
        } else {
            float width = rectF.width() / n(rectF, rectF2);
            if (this.L.e * width < this.n) {
                width = 1.0f;
            }
            f10 = f(rectF2, f13, width);
            g(rectF2, rectF, pointF, radians);
        }
        float f18 = pointF.x;
        m mVar3 = this.L;
        float f19 = f18 - mVar3.c;
        float f20 = pointF.y - mVar3.d;
        if (!z11) {
            m.f(mVar3, f19, f20);
            m.g(this.L, f10 / f13, 0.0f, 0.0f);
            r(false);
            return;
        }
        float f21 = f10 / f13;
        if (Math.abs(f21 - 1.0f) >= 1.0E-5f || Math.abs(f19) >= 1.0E-5f || Math.abs(f20) >= 1.0E-5f) {
            this.F = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
            ofFloat.addListener(new l(this, z12, z9, z10, z11));
            ofFloat.setInterpolator(cropAreaView.getInterpolator());
            ofFloat.setDuration(z12 ? 100L : 200L);
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
        i51 i51Var = this.d;
        if (i51Var != null) {
            return i51Var.getVideoHeight();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i7 = this.K;
        return (i7 == 90 || i7 == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public int getCurrentWidth() {
        i51 i51Var = this.d;
        if (i51Var != null) {
            return i51Var.getVideoWidth();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i7 = this.K;
        return (i7 == 90 || i7 == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public float getStateFullOrientation() {
        m mVar = this.L;
        if (mVar == null) {
            return 0.0f;
        }
        return mVar.g + mVar.h;
    }

    public boolean getStateMirror() {
        m mVar = this.L;
        return mVar != null && mVar.j;
    }

    public float getStateOrientation() {
        m mVar = this.L;
        if (mVar == null) {
            return 0.0f;
        }
        return mVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        m mVar = this.L;
        if (mVar == null) {
            return;
        }
        final float f10 = mVar.f;
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.k0 = null;
        }
        m mVar2 = this.L;
        if ((mVar2.h + mVar2.g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        if (!this.y) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        cropAreaView.setLockedAspectRatio(this.y ? 0.0f : 1.0f);
        this.n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.y);
        m mVar3 = this.L;
        final float f12 = mVar3.c;
        final float f13 = mVar3.d;
        final float f14 = mVar3.e;
        final float f15 = mVar3.i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: og.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o oVar = o.this;
                if (oVar.L == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = oVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                g0.Z1(rectF4, rectF3, floatValue, rectF5);
                oVar.a.setActualRect(rectF5);
                m mVar4 = oVar.L;
                float f16 = 1.0f - floatValue;
                float f17 = mVar4.c - (f12 * f16);
                float f18 = mVar4.d - (f13 * f16);
                float f19 = mVar4.i - (f15 * f16);
                float T1 = g0.T1(f14, f10, floatValue);
                m mVar5 = oVar.L;
                float f20 = T1 / mVar5.e;
                m.f(mVar5, -f17, -f18);
                m.g(oVar.L, f20, 0.0f, 0.0f);
                m.e(oVar.L, -f19);
                oVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        m mVar = this.L;
        boolean z9 = false;
        if (mVar == null) {
            return false;
        }
        mVar.j = !mVar.j;
        r(false);
        n nVar = this.M;
        if (nVar != null) {
            m mVar2 = this.L;
            float f10 = mVar2.h;
            float f11 = mVar2.g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!m.c(mVar2) && f12 == 0.0f && this.a.getLockAspectRatio() == 0.0f && !this.L.j) {
                z9 = true;
            }
            nVar.Z(z9);
        }
        return this.L.j;
    }

    public final void k() {
        this.a.g(2, false);
        if (this.n < 1.0E-5f) {
            this.n = this.L.e;
        }
    }

    public final void l(boolean z9) {
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.k0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.k0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        m mVar = this.L;
        cropAreaView.e(currentWidth, currentHeight, (mVar == null || mVar.g % 180.0f == 0.0f) ? false : true, this.y);
        cropAreaView.setLockedAspectRatio(this.y ? 0.0f : 1.0f);
        m mVar2 = this.L;
        if (mVar2 != null) {
            m.d(mVar2, 0.0f);
            this.L.j = false;
        }
        cropAreaView.d(this.h);
        r(z9);
        this.n = 0.0f;
        n nVar = this.M;
        if (nVar != null) {
            nVar.Z(true);
            this.M.H(false);
        }
    }

    public final boolean m(float f10) {
        if (this.L != null) {
            CropAreaView cropAreaView = this.a;
            AnimatorSet animatorSet = cropAreaView.k0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.k0 = null;
            }
            this.n = 0.0f;
            m mVar = this.L;
            float f11 = mVar.h;
            float f12 = mVar.g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (!this.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(getCurrentWidth(), getCurrentHeight(), (this.L.g + f13) % 180.0f != 0.0f, this.y);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            m.d(this.L, f13);
            r(false);
            e(true, false, false, false);
            n nVar = this.M;
            if (nVar != null) {
                nVar.Z(f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.L.j);
            }
            if (((int) this.L.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        int i7 = 4;
        if (this.L == null || this.I) {
            return;
        }
        this.I = true;
        String[] strArr = new String[8];
        int i10 = 0;
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = id.M0(2131751697, null);
        strArr[1] = id.M0(2131751695, null);
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
        u1 u1Var = alertDialog$Builder.a;
        u1Var.setCanceledOnTouchOutside(true);
        u1Var.setOnCancelListener(new ob(this, i7));
        u1Var.show();
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
                    n nVar = this.M;
                    if (nVar != null) {
                        nVar.Z(false);
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

    public final void p(int i7, g gVar, ye yeVar) {
        this.y = true;
        this.d = null;
        this.e = gVar;
        this.K = i7;
        this.x = null;
        CropAreaView cropAreaView = this.a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.L = new m(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new k(this, yeVar, currentHeight, currentWidth, 0));
    }

    public final void q() {
        int i7;
        float f10;
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
        m mVar = this.L;
        float f11 = mVar.f * cropWidth;
        int i10 = (int) mVar.h;
        while (i10 < 0) {
            i10 += 360;
        }
        if (i10 == 90 || i10 == 270) {
            m mVar2 = this.L;
            i7 = (int) mVar2.b;
            f10 = mVar2.a;
        } else {
            m mVar3 = this.L;
            i7 = (int) mVar3.a;
            f10 = mVar3.b;
        }
        int i11 = (int) f10;
        double d = ceil;
        float f12 = i7;
        float ceil3 = (float) (d / Math.ceil(f12 * f11));
        float f13 = i11;
        float ceil4 = (float) (ceil2 / Math.ceil(f11 * f13));
        if (ceil3 > 1.0f || ceil4 > 1.0f) {
            float max = Math.max(ceil3, ceil4);
            ceil3 /= max;
            ceil4 /= max;
        }
        float f14 = ceil4;
        float f15 = ceil3;
        RectF rectF = cropAreaView.l0;
        cropAreaView.a(rectF, f12 / f13);
        float width = this.y ? rectF.width() / f12 : Math.max(rectF.width() / f12, rectF.height() / f13);
        m mVar4 = this.L;
        float f16 = mVar4.e;
        float f17 = f16 / width;
        float f18 = f16 / mVar4.f;
        float f19 = (fArr[2] / f12) / f16;
        float f20 = (fArr[5] / f13) / f16;
        float f21 = mVar4.i;
        RectF targetRectToFill = cropAreaView.getTargetRectToFill();
        float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
        float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
        g gVar = this.e;
        m mVar5 = this.L;
        boolean z9 = mVar5.j || m.c(mVar5) || this.L.g >= 1.0E-5f;
        m mVar6 = this.L;
        gVar.e(z9, f19, f20, f21, (int) mVar6.h, f17, f18, mVar6.f / width, f15, f14, cropCenterX, cropCenterY, mVar6.j);
    }

    public final void r(boolean z9) {
        if (this.L == null) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        m mVar = this.L;
        float f10 = mVar.g;
        if (f10 == 90.0f || f10 == 270.0f) {
            matrix.postTranslate((-mVar.b) / 2.0f, (-mVar.a) / 2.0f);
        } else {
            matrix.postTranslate((-mVar.a) / 2.0f, (-mVar.b) / 2.0f);
        }
        matrix.postRotate((int) this.L.h);
        matrix.postConcat(this.L.k);
        CropAreaView cropAreaView = this.a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.y || this.J || z9) {
            q();
            this.M.w();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.D = f10;
        this.a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z9) {
        this.a.setFreeform(z9);
        this.y = z9;
    }

    public void setListener(n nVar) {
        this.M = nVar;
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        m mVar = this.L;
        m.e(mVar, f10 - mVar.i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.E = f10;
        this.a.setTopPadding(f10);
    }
}
