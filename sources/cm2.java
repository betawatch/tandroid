// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class cm2 extends FrameLayout implements au5 {
    public final int E;
    public final LinearGradient F;
    public final Matrix G;
    public final sm0 H;
    public final yl2 I;
    public final ln J;
    public final ln[] K;
    public final ln L;
    public final float[] M;
    public final float[] N;
    public Object O;
    public Object P;
    public final RectF Q;
    public final Path R;
    public Drawable S;
    public boolean T;
    public Runnable U;
    public boolean V;
    public float W;
    public final FrameLayout a;
    public float a0;
    public final r63 b;
    public float b0;
    public final dx8 c;
    public float c0;
    public CameraView d;
    public float d0;
    public Object e;
    public float e0;
    public sl2 f;
    public boolean f0;
    public boolean g0;
    public final ArrayList h;
    public bm2 h0;
    public bm2 i0;
    public yl2 j0;
    public bm2 k0;
    public boolean l0;
    public Runnable m0;
    public final ArrayList n;
    public Runnable n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public bm2 r;
    public boolean r0;
    public bm2 s;
    public lqb s0;
    public cl8 t0;
    public boolean u0;
    public long v0;
    public final Paint w;
    public boolean w0;
    public final Path x;
    public final yl2 x0;
    public final float[] y;

    public cm2(Activity activity, sm0 sm0Var, FrameLayout frameLayout, r63 r63Var) {
        super(activity);
        this.c = new dx8(new yl2(this, (byte) 1));
        this.f = new sl2(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.I = new yl2(this, (byte) 2);
        d53 d53Var = d53.h;
        this.J = new ln(this, 0L, 320L, d53Var);
        this.K = new ln[]{new ln(this, 0L, 320L, d53Var), new ln(this, 0L, 320L, d53Var), new ln(this, 0L, 320L, d53Var), new ln(this, 0L, 320L, d53Var), new ln(this, 0L, 320L, d53Var)};
        this.L = new ln(this, 0L, 320L, d53Var);
        this.M = new float[5];
        this.N = new float[5];
        this.Q = new RectF();
        this.R = new Path();
        this.T = true;
        this.r0 = true;
        this.u0 = true;
        this.x0 = new yl2(this, (byte) 3);
        this.H = sm0Var;
        this.a = frameLayout;
        this.b = r63Var;
        setBackgroundColor(-14737633);
        bm2 bm2Var = new bm2(this);
        bm2Var.b((rl2) this.f.e.get(0), false);
        bm2Var.m = true;
        if (this.l0) {
            bm2Var.c.I();
        }
        arrayList.add(bm2Var);
        this.r = bm2Var;
        this.s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(gm.L(8.0f));
        int L = gm.L(300.0f);
        this.E = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(Canvas canvas, Drawable drawable, RectF rectF, float f) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float max = Math.max(rectF.width() / intrinsicWidth, rectF.height() / intrinsicHeight);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(max, max);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        if (f > 0.0f) {
            canvas.drawColor(cmb.p1(drawable.getAlpha() * f, -16777216));
        }
        canvas.restore();
    }

    public final boolean a() {
        if (this.h0 == null) {
            return false;
        }
        this.h0 = null;
        this.f0 = false;
        invalidate();
        yl2 yl2Var = this.j0;
        if (yl2Var == null) {
            return true;
        }
        gm.r(yl2Var);
        this.j0 = null;
        return true;
    }

    public final void b() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bm2) obj).a(null);
        }
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r11.m == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RectF rectF, bm2 bm2Var) {
        boolean z;
        ImageView imageView;
        CameraView cameraView;
        if (gm.m0 && bm2Var == this.k0) {
            return;
        }
        if (bm2Var == this.i0) {
            ln lnVar = this.L;
            if (lnVar.c > 0.0f) {
                canvas.save();
                Path path = this.R;
                path.rewind();
                RectF rectF2 = gm.P;
                rectF2.set(rectF);
                rectF2.inset(gm.L(10.0f) * lnVar.c, gm.L(10.0f) * lnVar.c);
                float L = gm.L(12.0f) * lnVar.c;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.clipPath(path);
                z = true;
                if (bm2Var != null) {
                    ImageReceiver imageReceiver = bm2Var.c;
                    if (bm2Var.n != null) {
                        TextureView textureView = bm2Var.e;
                        if (textureView == null || !bm2Var.f) {
                            imageReceiver.i0(rectF.left, rectF.top, rectF.width(), rectF.height());
                            if (!imageReceiver.h(canvas, null)) {
                                CameraView cameraView2 = this.d;
                                if (cameraView2 == null && this.T) {
                                    c(canvas, this.S, rectF, 0.0f);
                                } else {
                                    f(0.0f, canvas, rectF, cameraView2);
                                }
                            }
                        } else {
                            f(0.0f, canvas, rectF, textureView);
                        }
                        if (z) {
                            return;
                        }
                        canvas.restore();
                        return;
                    }
                }
                if (!gm.m0) {
                    setCameraNeedsBlur(!this.o0);
                    if (this.e == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
                        f(0.75f, canvas, rectF, this.d);
                    } else {
                        RenderNode c = qn0.c(this.e);
                        float max = Math.max(rectF.width() / c.getWidth(), rectF.height() / c.getHeight());
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                        canvas.scale(max, max);
                        canvas.drawRenderNode(c);
                        canvas.drawColor(1677721600);
                        canvas.restore();
                    }
                    CameraView cameraView3 = this.d;
                    if (cameraView3 != null && (imageView = cameraView3.blurredStubView) != null && imageView.getVisibility() == 0 && this.d.blurredStubView.getAlpha() > 0.0f) {
                        f(0.4f, canvas, rectF, this.d.blurredStubView);
                    }
                    if (z) {
                    }
                }
                cameraView = this.d;
                if (cameraView == null || !this.T) {
                    f((bm2Var == null && bm2Var.m) ? 0.0f : 0.4f, canvas, rectF, cameraView);
                } else {
                    c(canvas, this.S, rectF, (bm2Var == null || !bm2Var.m) ? 0.4f : 0.0f);
                }
                if (z) {
                }
            }
        }
        z = false;
        if (bm2Var != null) {
        }
        if (!gm.m0) {
        }
        cameraView = this.d;
        if (cameraView == null) {
        }
        f((bm2Var == null && bm2Var.m) ? 0.0f : 0.4f, canvas, rectF, cameraView);
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        double d;
        float[] fArr;
        float[] fArr2;
        float f;
        ArrayList arrayList;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        sm0 sm0Var;
        bm2 bm2Var;
        int i;
        if (this.O == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvas2 = canvas;
        } else {
            RenderNode c = qn0.c(this.O);
            c.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c.beginRecording();
        }
        super.dispatchDraw(canvas2);
        boolean i2 = i();
        ln lnVar = this.J;
        ln[] lnVarArr = this.K;
        float f5 = 0.0f;
        if (!i2 && !this.g0 && !this.f0) {
            float f6 = lnVar.c;
            sl2 sl2Var = this.f;
            if (f6 == sl2Var.c && lnVarArr[0].c == sl2Var.d[0]) {
                dx8 dx8Var = this.c;
                if (!dx8Var.a && ((ln) dx8Var.d).c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    h(canvas);
                    return;
                }
            }
        }
        if (this.o0) {
            setCameraNeedsBlur(false);
        }
        canvas2.drawColor(-14737633);
        float d2 = this.L.d(this.f0);
        float e = lnVar.e(false, this.f.c);
        int i3 = 0;
        while (true) {
            double d3 = i3;
            d = e;
            double ceil = Math.ceil(d);
            fArr = this.N;
            fArr2 = this.M;
            if (d3 >= ceil) {
                break;
            }
            fArr2[i3] = getMeasuredWidth();
            fArr[i3] = 0.0f;
            i3++;
        }
        int i4 = this.f.c;
        while (true) {
            f = 1.0f;
            if (i4 >= lnVarArr.length) {
                break;
            }
            lnVarArr[i4].e(false, 1.0f);
            i4++;
        }
        int i5 = 0;
        boolean z = false;
        float f7 = 0.0f;
        while (true) {
            arrayList = this.h;
            f2 = f;
            int size = arrayList.size();
            f3 = f5;
            rectF = this.Q;
            if (i5 >= size) {
                break;
            }
            bm2 bm2Var2 = (bm2) arrayList.get(i5);
            rl2 rl2Var = bm2Var2.h;
            int i6 = rl2Var.c;
            float f8 = d2;
            int i7 = rl2Var.b;
            float f9 = e;
            ln[] lnVarArr2 = lnVarArr;
            float e2 = lnVarArr[i6].e(false, rl2Var.a.d[i6]);
            if (this.g0 || this.f0) {
                i = i6;
                gm.X1(bm2Var2.j, bm2Var2.k, bm2Var2.l, rectF);
            } else {
                i = i6;
                rectF.set((getMeasuredWidth() / e2) * i7, (getMeasuredHeight() / f9) * i6, (getMeasuredWidth() / e2) * (i7 + 1), (getMeasuredHeight() / f9) * (i + 1));
            }
            fArr2[i] = Math.min(fArr2[i], rectF.left);
            fArr[i] = Math.max(fArr[i], rectF.right);
            f7 = Math.max(f7, rectF.bottom);
            if (f8 <= f3 || bm2Var2 != this.i0) {
                if (this.o0 && bm2Var2.d != null) {
                    z = true;
                }
                d(canvas2, rectF, bm2Var2);
            }
            i5++;
            f = f2;
            f5 = f3;
            d2 = f8;
            e = f9;
            lnVarArr = lnVarArr2;
        }
        float f10 = d2;
        float f11 = e;
        ln[] lnVarArr3 = lnVarArr;
        int i8 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i8 >= arrayList2.size()) {
                break;
            }
            bm2 bm2Var3 = (bm2) arrayList2.get(i8);
            rl2 rl2Var2 = bm2Var3.h;
            int i9 = rl2Var2.c;
            int i10 = rl2Var2.b;
            int i11 = i8;
            float e3 = lnVarArr3[i9].e(false, i9 >= this.f.d.length ? f2 : r13[i9]);
            rectF.set((getMeasuredWidth() / e3) * i10, (getMeasuredHeight() / f11) * i9, (getMeasuredWidth() / e3) * (i10 + 1), (i9 + 1) * (getMeasuredHeight() / f11));
            fArr2[i9] = Math.min(fArr2[i9], rectF.left);
            fArr[i9] = Math.max(fArr[i9], rectF.right);
            f7 = Math.max(f7, rectF.bottom);
            if (this.o0 && bm2Var3.d != null) {
                z = true;
            }
            d(canvas2, rectF, bm2Var3);
            i8 = i11 + 1;
        }
        if (this.f0) {
            f4 = f3;
        } else {
            int i12 = 0;
            while (i12 < Math.ceil(d)) {
                if (fArr2[i12] >= f3) {
                    rectF.set(f3, (getMeasuredHeight() / f11) * i12, fArr2[i12], (getMeasuredHeight() / f11) * (i12 + 1));
                    d(canvas2, rectF, null);
                }
                if (fArr[i12] < getMeasuredWidth()) {
                    rectF.set(fArr[i12], (getMeasuredHeight() / f11) * i12, getMeasuredWidth(), (getMeasuredHeight() / f11) * (i12 + 1));
                    d(canvas2, rectF, null);
                }
                i12++;
                f3 = 0.0f;
            }
            if (f7 < getMeasuredHeight()) {
                f4 = 0.0f;
                rectF.set(0.0f, f7, getMeasuredWidth(), getMeasuredHeight());
                d(canvas2, rectF, null);
            } else {
                f4 = 0.0f;
            }
        }
        if (f10 > f4 && (bm2Var = this.i0) != null) {
            rl2 rl2Var3 = bm2Var.h;
            int i13 = rl2Var3.c;
            int i14 = rl2Var3.b;
            float e4 = lnVarArr3[i13].e(false, this.f.d[i13]);
            if (this.f0) {
                gm.X1(bm2Var.j, bm2Var.k, bm2Var.l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e4) * i14, (getMeasuredHeight() / f11) * i13, (getMeasuredWidth() / e4) * (i14 + 1), (getMeasuredHeight() / f11) * (i13 + 1));
            }
            canvas2.save();
            canvas2.translate(gm.R1(this.b0, this.d0, bm2Var.l) * f10, gm.R1(this.c0, this.e0, bm2Var.l) * f10);
            d(canvas2, rectF, bm2Var);
            canvas2.restore();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            bm2 bm2Var4 = (bm2) arrayList.get(i15);
            rl2 rl2Var4 = bm2Var4.h;
            float e5 = bm2Var4.b.e(false, 0.0f);
            if (e5 > 0.0f) {
                int i16 = rl2Var4.c;
                int i17 = rl2Var4.c;
                int i18 = rl2Var4.b;
                float e6 = lnVarArr3[i16].e(false, rl2Var4.a.d[i16]);
                if (this.g0 || this.f0) {
                    gm.X1(bm2Var4.j, bm2Var4.k, bm2Var4.l, rectF);
                } else {
                    rectF.set((getMeasuredWidth() / e6) * i18, (getMeasuredHeight() / f11) * i17, (getMeasuredWidth() / e6) * (i18 + 1), (getMeasuredHeight() / f11) * (i17 + 1));
                }
                RectF rectF2 = gm.P;
                rectF2.set(rectF);
                rectF2.inset(gm.L(4.0f), gm.L(4.0f));
                Matrix matrix = this.G;
                matrix.reset();
                float f12 = rectF.left;
                int i19 = this.E;
                matrix.postTranslate(gm.R1(((float) Math.sqrt((i19 * i19) << 1)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f2 - e5) + f12, 0.0f);
                matrix.postRotate(-25.0f);
                this.F.setLocalMatrix(matrix);
                Paint paint = this.w;
                paint.setAlpha(nm7.d4);
                Path path = this.x;
                path.rewind();
                rl2 rl2Var5 = bm2Var4.h;
                float L = (rl2Var5.b == 0 && rl2Var5.c == 0) ? gm.L(8.0f) : 0.0f;
                float[] fArr3 = this.y;
                fArr3[1] = L;
                fArr3[0] = L;
                rl2 rl2Var6 = bm2Var4.h;
                float L2 = (rl2Var6.b == rl2Var6.a.b + (-1) && rl2Var6.c == 0) ? gm.L(8.0f) : 0.0f;
                fArr3[2] = L2;
                fArr3[1] = L2;
                rl2 rl2Var7 = bm2Var4.h;
                int i20 = rl2Var7.b;
                sl2 sl2Var2 = rl2Var7.a;
                float L3 = (i20 == sl2Var2.b + (-1) && rl2Var7.c == sl2Var2.c + (-1)) ? gm.L(8.0f) : 0.0f;
                fArr3[4] = L3;
                fArr3[3] = L3;
                rl2 rl2Var8 = bm2Var4.h;
                float L4 = (rl2Var8.b == 0 && rl2Var8.c == rl2Var8.a.c + (-1)) ? gm.L(8.0f) : 0.0f;
                fArr3[6] = L4;
                fArr3[5] = L4;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                canvas2.drawPath(path, paint);
            }
        }
        if (z && (sm0Var = this.H) != null) {
            sm0Var.d();
        }
        h(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0239, code lost:
    
        if (a() != false) goto L83;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        ln[] lnVarArr;
        RectF rectF;
        boolean z;
        bm2 bm2Var;
        yl2 yl2Var;
        if (!i() || this.o0) {
            a();
            return false;
        }
        boolean z2 = true;
        if (motionEvent.getPointerCount() > 1) {
            a();
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ln lnVar = this.J;
        float f = lnVar.c;
        int i = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            lnVarArr = this.K;
            rectF = this.Q;
            if (i >= size) {
                z = z2;
                bm2Var = null;
                break;
            }
            bm2Var = (bm2) arrayList.get(i);
            rl2 rl2Var = bm2Var.h;
            int i2 = rl2Var.c;
            int i3 = rl2Var.b;
            float f2 = lnVarArr[i2].c;
            z = z2;
            rectF.set((getMeasuredWidth() / f2) * i3, (getMeasuredHeight() / f) * i2, (getMeasuredWidth() / f2) * (i3 + 1), (getMeasuredHeight() / f) * (i2 + 1));
            if (rectF.contains(x, y)) {
                break;
            }
            i++;
            z2 = z;
        }
        if (motionEvent.getAction() == 0) {
            this.W = motionEvent.getX();
            this.a0 = motionEvent.getY();
            byte b = 0;
            this.f0 = false;
            this.d0 = 0.0f;
            this.b0 = 0.0f;
            this.e0 = 0.0f;
            this.c0 = 0.0f;
            this.h0 = bm2Var;
            if (bm2Var != null) {
                yl2 yl2Var2 = new yl2(this, b);
                this.j0 = yl2Var2;
                gm.d3(yl2Var2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (oqe.a(motionEvent.getX(), motionEvent.getY(), this.W, this.a0) > gm.e * 1.2f && (yl2Var = this.j0) != null) {
                gm.r(yl2Var);
                this.j0 = null;
            }
            if (!this.f0 && getFilledProgress() >= 1.0f && this.h0 != null && bm2Var != null && oqe.a(motionEvent.getX(), motionEvent.getY(), this.W, this.a0) > gm.e * 1.2f) {
                this.f0 = z;
                this.i0 = this.h0;
                this.d0 = 0.0f;
                this.b0 = 0.0f;
                this.e0 = 0.0f;
                this.c0 = 0.0f;
                invalidate();
                yl2 yl2Var3 = this.j0;
                if (yl2Var3 != null) {
                    gm.r(yl2Var3);
                    this.j0 = null;
                }
            } else if (this.f0 && this.i0 != null) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f3 = lnVar.c;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    }
                    rl2 rl2Var2 = ((bm2) arrayList.get(i4)).h;
                    int i5 = rl2Var2.c;
                    int i6 = rl2Var2.b;
                    float f4 = lnVarArr[i5].c;
                    rectF.set((getMeasuredWidth() / f4) * i6, (getMeasuredHeight() / f3) * i5, (getMeasuredWidth() / f4) * (i6 + 1), (getMeasuredHeight() / f3) * (i5 + 1));
                    if (rectF.contains(x2, y2)) {
                        break;
                    }
                    i4++;
                }
                int indexOf = arrayList.indexOf(this.i0);
                if (i4 >= 0 && indexOf >= 0 && i4 != indexOf) {
                    Collections.swap(arrayList, indexOf, i4);
                    o(this.f);
                    this.g0 = true;
                    invalidate();
                    float f5 = this.f.c;
                    rl2 rl2Var3 = this.i0.h;
                    int i7 = rl2Var3.c;
                    int i8 = rl2Var3.b;
                    float f6 = lnVarArr[i7].c;
                    rectF.set((getMeasuredWidth() / f6) * i8, (getMeasuredHeight() / f5) * i7, (getMeasuredWidth() / f6) * (i8 + 1), (getMeasuredHeight() / f5) * (i7 + 1));
                    this.b0 = this.d0;
                    this.c0 = this.e0;
                    this.W = rectF.centerX();
                    this.a0 = rectF.centerY();
                }
                this.d0 = motionEvent.getX() - this.W;
                this.e0 = motionEvent.getY() - this.a0;
                invalidate();
            } else if (this.h0 != bm2Var) {
                this.h0 = null;
                yl2 yl2Var4 = this.j0;
                if (yl2Var4 != null) {
                    gm.r(yl2Var4);
                    this.j0 = null;
                    return true;
                }
            }
        } else {
            boolean z3 = z;
            if (motionEvent.getAction() == z3) {
                if (this.h0 != null) {
                    this.h0 = null;
                    this.f0 = false;
                    invalidate();
                    yl2 yl2Var5 = this.j0;
                    if (yl2Var5 == null) {
                        return z3;
                    }
                    gm.r(yl2Var5);
                    this.j0 = null;
                    return z3;
                }
            } else if (motionEvent.getAction() == 3) {
            }
        }
        return this.h0 != null || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.d && gm.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // au5
    public final void e(RectF rectF) {
        bm2 bm2Var = this.k0;
        if (bm2Var == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        rl2 rl2Var = bm2Var.h;
        sl2 sl2Var = rl2Var.a;
        int i = rl2Var.b;
        int i2 = rl2Var.c;
        float f = sl2Var.c;
        float e = this.K[i2].e(false, sl2Var.d[i2]);
        rectF.set((getMeasuredWidth() / e) * i, (getMeasuredHeight() / f) * i2, (getMeasuredWidth() / e) * (i + 1), (getMeasuredHeight() / f) * (i2 + 1));
    }

    public final void f(float f, Canvas canvas, RectF rectF, View view) {
        dx8 dx8Var;
        Bitmap bitmap;
        if (view != null) {
            float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            canvas.scale(max, max);
            canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
            if (gm.m0) {
                TextureView textureView = view instanceof TextureView ? (TextureView) view : view instanceof CameraView ? ((CameraView) view).getTextureView() : null;
                if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                    canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
            } else {
                view.draw(canvas);
            }
            if (f > 0.0f) {
                canvas.drawColor(cmb.p1(view.getAlpha() * f, -16777216));
            }
            canvas.restore();
            if (view != this.d || (dx8Var = this.c) == null) {
                return;
            }
            Paint paint = (Paint) dx8Var.i;
            ln[] lnVarArr = (ln[]) dx8Var.h;
            ln[] lnVarArr2 = (ln[]) dx8Var.g;
            Path path = (Path) dx8Var.j;
            cx8 cx8Var = (cx8) dx8Var.c;
            if (cx8Var == null || cx8Var.b.length <= 0) {
                return;
            }
            float d = ((ln) dx8Var.d).d(dx8Var.a);
            int i = 0;
            float e = ((ln) dx8Var.e).e(false, ((cx8) dx8Var.c).c);
            float width = (rectF.width() * e) + rectF.left;
            float e2 = ((ln) dx8Var.f).e(false, ((cx8) dx8Var.c).d);
            float height = (rectF.height() * e2) + rectF.top;
            float R1 = gm.R1(0.5f, 1.1f, d);
            canvas.save();
            canvas.scale(R1, R1, width, height);
            if (d > 0.0f) {
                path.rewind();
                int min = Math.min(4, ((cx8) dx8Var.c).b.length);
                int i2 = 0;
                while (i2 < min) {
                    int i3 = i2 - 1;
                    if (i3 < 0) {
                        i3 = min - 1;
                    }
                    int i4 = i2 + 1;
                    int i5 = i4 >= min ? i : i4;
                    cx8 cx8Var2 = (cx8) dx8Var.c;
                    ln[] lnVarArr3 = lnVarArr;
                    PointF[] pointFArr = cx8Var2.b;
                    PointF pointF = pointFArr[i3];
                    int i6 = min;
                    PointF pointF2 = pointFArr[i2];
                    ln[] lnVarArr4 = lnVarArr2;
                    PointF pointF3 = pointFArr[i5];
                    float f2 = e;
                    float width2 = (rectF.width() * (lnVarArr4[i3].e(false, pointF.x - cx8Var2.c) + f2)) + rectF.left;
                    float height2 = (rectF.height() * (lnVarArr3[i3].e(false, pointF.y - ((cx8) dx8Var.c).d) + e2)) + rectF.top;
                    float width3 = (rectF.width() * (lnVarArr4[i2].e(false, pointF2.x - ((cx8) dx8Var.c).c) + f2)) + rectF.left;
                    float height3 = (rectF.height() * (lnVarArr3[i2].e(false, pointF2.y - ((cx8) dx8Var.c).d) + e2)) + rectF.top;
                    float width4 = (rectF.width() * (lnVarArr4[i5].e(false, pointF3.x - ((cx8) dx8Var.c).c) + f2)) + rectF.left;
                    float height4 = ((rectF.height() * (lnVarArr3[i5].e(false, pointF3.y - ((cx8) dx8Var.c).d) + e2)) + rectF.top) - height3;
                    path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                    path.lineTo(width3, height3);
                    path.lineTo(((width4 - width3) * 0.18f) + width3, (height4 * 0.18f) + height3);
                    lnVarArr = lnVarArr3;
                    d = d;
                    i2 = i4;
                    i = 0;
                    min = i6;
                    lnVarArr2 = lnVarArr4;
                    e = f2;
                }
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
    }

    @Override // au5
    public final void g(Canvas canvas, float f) {
        bm2 bm2Var = this.k0;
        if (bm2Var != null) {
            rl2 rl2Var = bm2Var.h;
            sl2 sl2Var = rl2Var.a;
            int i = rl2Var.b;
            int i2 = rl2Var.c;
            float f2 = sl2Var.c;
            float e = this.K[i2].e(false, sl2Var.d[i2]);
            float measuredWidth = (getMeasuredWidth() / e) * i;
            float measuredHeight = (getMeasuredHeight() / f2) * i2;
            float measuredWidth2 = (getMeasuredWidth() / e) * (i + 1);
            float measuredHeight2 = (getMeasuredHeight() / f2) * (i2 + 1);
            RectF rectF = this.Q;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            d(canvas, rectF, this.k0);
        }
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.O == null && Build.VERSION.SDK_INT >= 31) {
            this.O = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.P = renderNode;
            float L = gm.L(32.0f);
            float L2 = gm.L(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(L, L2, tileMode));
        }
        return this.P;
    }

    public ArrayList<g6b> getContent() {
        ArrayList<g6b> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            g6b g6bVar = ((bm2) obj).n;
            if (g6bVar != null) {
                arrayList.add(g6bVar);
            }
        }
        return arrayList;
    }

    public bm2 getCurrent() {
        return this.r;
    }

    public long getDuration() {
        bm2 mainPart;
        g6b g6bVar;
        if (!this.o0 || (mainPart = getMainPart()) == null || (g6bVar = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((g6bVar.W - g6bVar.V) * g6bVar.h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return i2;
            }
            if (((bm2) arrayList.get(i)).n != null) {
                i2++;
            }
            i++;
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public sl2 getLayout() {
        return this.f;
    }

    public bm2 getMainPart() {
        bm2 bm2Var = null;
        if (!this.o0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        long j = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bm2 bm2Var2 = (bm2) obj;
            g6b g6bVar = bm2Var2.n;
            if (g6bVar != null && g6bVar.K) {
                long j2 = g6bVar.h0;
                am2 am2Var = bm2Var2.d;
                if (am2Var != null && am2Var.getDuration() > 0) {
                    j2 = bm2Var2.d.getDuration();
                }
                if (j2 > j) {
                    bm2Var = bm2Var2;
                    j = j2;
                }
            }
        }
        return bm2Var;
    }

    public bm2 getNext() {
        return this.s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            i = td4.g(((bm2) arrayList2.get(i)).a, i, 1, arrayList);
        }
    }

    public long getPosition() {
        if (!this.o0) {
            return 0L;
        }
        if (!this.r0) {
            return this.v0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.p0;
        if (j > getDuration()) {
            this.p0 = currentTimeMillis - (j % getDuration());
        }
        return j;
    }

    public long getPositionWithOffset() {
        long j = 0;
        if (!this.o0) {
            return 0L;
        }
        getPosition();
        bm2 mainPart = getMainPart();
        if (mainPart != null) {
            g6b g6bVar = mainPart.n;
            j = g6bVar.X + ((long) (g6bVar.V * g6bVar.h0));
        }
        return getPosition() + j;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(Canvas canvas) {
        if (this.O == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode c = qn0.c(this.O);
        c.endRecording();
        canvas.drawRenderNode(c);
        Object obj = this.P;
        if (obj != null) {
            RenderNode c2 = qn0.c(obj);
            c2.setPosition(0, 0, getWidth(), getHeight());
            c2.beginRecording().drawRenderNode(c);
            c2.endRecording();
        }
    }

    public final boolean i() {
        return this.f.e.size() > 1;
    }

    public final void j(RectF rectF, rl2 rl2Var) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = gm.q;
            measuredWidth = point.x;
            measuredHeight = point.y;
        }
        int[] iArr = rl2Var.a.d;
        int i = rl2Var.c;
        float f = measuredWidth / iArr[i];
        float f2 = measuredHeight / r1.c;
        rectF.set(rl2Var.b * f, i * f2, f * (r6 + 1), f2 * (i + 1));
    }

    public final void k(RectF rectF, rl2 rl2Var) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = gm.q;
            int i = point.x;
            measuredHeight = point.y;
            measuredWidth = i;
        }
        j(rectF, rl2Var);
        float f = rectF.left;
        boolean z = f <= 0.0f;
        float f2 = rectF.top;
        boolean z2 = f2 <= 0.0f;
        float f3 = measuredWidth;
        boolean z3 = rectF.right >= f3;
        float f4 = measuredHeight;
        boolean z4 = rectF.bottom >= f4;
        if (z && z3 && !z2 && !z4) {
            rectF.offset(0.0f, f4 - f2);
            return;
        }
        if (z2 && z4 && !z && !z3) {
            rectF.offset(0.0f, f3 - f);
            return;
        }
        if (z3 && !z) {
            rectF.offset(rectF.width(), 0.0f);
        }
        if (!z4 || z2) {
            return;
        }
        rectF.offset(0.0f, rectF.height());
    }

    public final boolean l(g6b g6bVar) {
        if (g6bVar.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                g6b g6bVar2 = ((bm2) obj).n;
                if (g6bVar2 != null && g6bVar2.K && g6bVar2.P > 0.0f) {
                    g6bVar.P = 0.0f;
                    break;
                }
            }
        }
        bm2 bm2Var = this.r;
        if (bm2Var != null) {
            bm2Var.a(g6bVar);
        }
        q();
        requestLayout();
        return this.r == null;
    }

    public final void m(long j, boolean z) {
        if (this.o0) {
            long k = Utilities.k(j, getDuration(), 0L);
            if (!this.r0) {
                this.v0 = k;
            }
            this.p0 = System.currentTimeMillis() - k;
            this.q0 = z;
            if (this.o0) {
                yl2 yl2Var = this.x0;
                gm.r(yl2Var);
                yl2Var.run();
            }
        }
    }

    public final void n(g6b g6bVar) {
        if (g6bVar == null || g6bVar.T == null) {
            b();
            return;
        }
        o(g6bVar.S);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return;
            }
            ((bm2) arrayList.get(i)).a((g6b) g6bVar.T.get(i));
            i++;
        }
    }

    public final void o(sl2 sl2Var) {
        if (sl2Var == null) {
            sl2Var = new sl2(".");
        }
        ArrayList arrayList = sl2Var.e;
        this.f = sl2Var;
        yl2 yl2Var = this.I;
        gm.r(yl2Var);
        int i = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i >= Math.max(size, arrayList2.size())) {
                q();
                invalidate();
                gm.d3(yl2Var, 360L);
                return;
            }
            rl2 rl2Var = i < arrayList.size() ? (rl2) arrayList.get(i) : null;
            bm2 bm2Var = i < arrayList2.size() ? (bm2) arrayList2.get(i) : null;
            if (bm2Var == null && rl2Var != null) {
                bm2 bm2Var2 = new bm2(this);
                if (this.l0) {
                    bm2Var2.c.I();
                }
                bm2Var2.b(rl2Var, true);
                arrayList2.add(bm2Var2);
            } else if (rl2Var != null) {
                bm2Var.b(rl2Var, true);
            } else if (bm2Var != null) {
                this.n.add(bm2Var);
                arrayList2.remove(bm2Var);
                bm2Var.b(null, true);
                i--;
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                this.l0 = true;
                return;
            } else {
                ((bm2) arrayList.get(i)).c.I();
                i++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                this.l0 = false;
                gm.r(this.x0);
                return;
            } else {
                ((bm2) arrayList.get(i)).c.K();
                i++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bm2 bm2Var;
        g6b g6bVar;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.d) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else {
                int i6 = 0;
                while (true) {
                    ArrayList arrayList = this.h;
                    if (i6 >= arrayList.size()) {
                        bm2Var = null;
                        break;
                    } else {
                        if (childAt == ((bm2) arrayList.get(i6)).e) {
                            bm2Var = (bm2) arrayList.get(i6);
                            break;
                        }
                        i6++;
                    }
                }
                if (bm2Var == null || (g6bVar = bm2Var.n) == null || (i3 = g6bVar.k0) <= 0 || (i4 = g6bVar.l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                } else {
                    if (g6bVar.Q % 90 == 1) {
                        i4 = i3;
                        i3 = i4;
                    }
                    float f = i3;
                    float f2 = i4;
                    float min = Math.min(1.0f, Math.max(f / size, f2 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * min), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (f2 * min), TLObject.FLAG_30));
                }
            }
        }
    }

    public final void p() {
        CameraView cameraView = this.d;
        boolean z = cameraView != null && this.V;
        if (z == (this.e != null)) {
            return;
        }
        if (z) {
            this.e = cameraView.getBlurRenderNode();
        } else {
            this.e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        this.r = null;
        this.s = null;
        int i = 0;
        while (true) {
            arrayList = this.h;
            if (i >= arrayList.size()) {
                break;
            }
            bm2 bm2Var = (bm2) arrayList.get(i);
            if (bm2Var.n == null) {
                if (this.r != null) {
                    this.s = bm2Var;
                    break;
                }
                this.r = bm2Var;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bm2 bm2Var2 = (bm2) arrayList.get(i2);
            bm2Var2.m = bm2Var2 == this.r;
        }
    }

    public void setCameraNeedsBlur(boolean z) {
        if (this.V == z) {
            return;
        }
        this.V = z;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.S = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z) {
        this.T = z;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        byte b = 1;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new yl2(this, b));
            gm.B2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, qoe.e(-1, -1, nm7.D1));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new yl2(this, b));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new yl2(this, b));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setMuted(boolean z) {
        if (this.w0 == z) {
            return;
        }
        this.w0 = z;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.U = runnable;
    }

    public void setPlaying(boolean z) {
        boolean z2 = this.u0;
        this.u0 = true;
        if (this.r0 != z) {
            this.r0 = z;
            if (!z) {
                this.v0 = getPosition();
            } else if (z2) {
                m(this.v0, false);
            } else {
                this.q0 = false;
            }
            if (this.o0) {
                yl2 yl2Var = this.x0;
                gm.r(yl2Var);
                yl2Var.run();
            }
        }
    }

    public void setPreview(boolean z) {
        if (this.o0 != z) {
            this.o0 = z;
            ArrayList arrayList = this.h;
            int i = 0;
            if (z) {
                sm0 sm0Var = this.H;
                if (sm0Var != null) {
                    sm0Var.d();
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((bm2) arrayList.get(i2)).a = i2;
                }
            }
            this.q0 = false;
            this.v0 = 0L;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bm2 bm2Var = (bm2) obj;
                am2 am2Var = bm2Var.d;
                if (am2Var != null) {
                    am2Var.setAudioEnabled(z, true);
                    if (!z || this.r0) {
                        bm2Var.d.play();
                    } else {
                        bm2Var.d.pause();
                    }
                }
            }
            yl2 yl2Var = this.x0;
            gm.r(yl2Var);
            if (z) {
                this.p0 = System.currentTimeMillis();
                gm.d3(yl2Var, (long) (1000.0f / gm.r));
            }
        }
    }

    public void setPreviewView(cl8 cl8Var) {
        this.t0 = cl8Var;
    }

    public void setResetState(Runnable runnable) {
        this.n0 = runnable;
    }

    @Override // au5
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z) {
        td4.a(this, z);
    }

    public void setTimelineView(lqb lqbVar) {
        this.s0 = lqbVar;
    }
}
