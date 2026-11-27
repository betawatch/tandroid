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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class kl2 extends FrameLayout implements eu5 {
    public final int E;
    public final LinearGradient F;
    public final Matrix G;
    public final tl0 H;
    public final gl2 I;
    public final mm J;
    public final mm[] K;
    public final mm L;
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
    public final x53 b;
    public float b0;
    public final ny8 c;
    public float c0;
    public CameraView d;
    public float d0;
    public Object e;
    public float e0;
    public al2 f;
    public boolean f0;
    public boolean g0;
    public final ArrayList h;
    public jl2 h0;
    public jl2 i0;
    public gl2 j0;
    public jl2 k0;
    public boolean l0;
    public Runnable m0;
    public final ArrayList n;
    public Runnable n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public jl2 r;
    public boolean r0;
    public jl2 s;
    public ksb s0;
    public mm8 t0;
    public boolean u0;
    public long v0;
    public final Paint w;
    public boolean w0;
    public final Path x;
    public final gl2 x0;
    public final float[] y;

    public kl2(Activity activity, tl0 tl0Var, FrameLayout frameLayout, x53 x53Var) {
        super(activity);
        this.c = new ny8(new gl2(this, (byte) 1));
        this.f = new al2(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.I = new gl2(this, (byte) 2);
        k43 k43Var = k43.h;
        this.J = new mm(this, 0L, 320L, k43Var);
        this.K = new mm[]{new mm(this, 0L, 320L, k43Var), new mm(this, 0L, 320L, k43Var), new mm(this, 0L, 320L, k43Var), new mm(this, 0L, 320L, k43Var), new mm(this, 0L, 320L, k43Var)};
        this.L = new mm(this, 0L, 320L, k43Var);
        this.M = new float[5];
        this.N = new float[5];
        this.Q = new RectF();
        this.R = new Path();
        this.T = true;
        this.r0 = true;
        this.u0 = true;
        this.x0 = new gl2(this, (byte) 3);
        this.H = tl0Var;
        this.a = frameLayout;
        this.b = x53Var;
        setBackgroundColor(-14737633);
        jl2 jl2Var = new jl2(this);
        jl2Var.b((zk2) this.f.e.get(0), false);
        jl2Var.m = true;
        if (this.l0) {
            jl2Var.c.I();
        }
        arrayList.add(jl2Var);
        this.r = jl2Var;
        this.s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(hl.L(8.0f));
        int L = hl.L(300.0f);
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
            canvas.drawColor(aob.p1(drawable.getAlpha() * f, -16777216));
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
        gl2 gl2Var = this.j0;
        if (gl2Var == null) {
            return true;
        }
        hl.r(gl2Var);
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
            ((jl2) obj).a(null);
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
    public final void d(Canvas canvas, RectF rectF, jl2 jl2Var) {
        boolean z;
        ImageView imageView;
        CameraView cameraView;
        if (hl.m0 && jl2Var == this.k0) {
            return;
        }
        if (jl2Var == this.i0) {
            mm mmVar = this.L;
            if (mmVar.c > 0.0f) {
                canvas.save();
                Path path = this.R;
                path.rewind();
                RectF rectF2 = hl.P;
                rectF2.set(rectF);
                rectF2.inset(hl.L(10.0f) * mmVar.c, hl.L(10.0f) * mmVar.c);
                float L = hl.L(12.0f) * mmVar.c;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.clipPath(path);
                z = true;
                if (jl2Var != null) {
                    ImageReceiver imageReceiver = jl2Var.c;
                    if (jl2Var.n != null) {
                        TextureView textureView = jl2Var.e;
                        if (textureView == null || !jl2Var.f) {
                            imageReceiver.i0(rectF.left, rectF.top, rectF.width(), rectF.height());
                            if (!imageReceiver.h(canvas, null)) {
                                CameraView cameraView2 = this.d;
                                if (cameraView2 == null && this.T) {
                                    c(canvas, this.S, rectF, 0.0f);
                                } else {
                                    g(0.0f, canvas, rectF, cameraView2);
                                }
                            }
                        } else {
                            g(0.0f, canvas, rectF, textureView);
                        }
                        if (z) {
                            return;
                        }
                        canvas.restore();
                        return;
                    }
                }
                if (!hl.m0) {
                    setCameraNeedsBlur(!this.o0);
                    if (this.e == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
                        g(0.75f, canvas, rectF, this.d);
                    } else {
                        RenderNode g = rm0.g(this.e);
                        float max = Math.max(rectF.width() / g.getWidth(), rectF.height() / g.getHeight());
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                        canvas.scale(max, max);
                        canvas.drawRenderNode(g);
                        canvas.drawColor(1677721600);
                        canvas.restore();
                    }
                    CameraView cameraView3 = this.d;
                    if (cameraView3 != null && (imageView = cameraView3.blurredStubView) != null && imageView.getVisibility() == 0 && this.d.blurredStubView.getAlpha() > 0.0f) {
                        g(0.4f, canvas, rectF, this.d.blurredStubView);
                    }
                    if (z) {
                    }
                }
                cameraView = this.d;
                if (cameraView == null || !this.T) {
                    g((jl2Var == null && jl2Var.m) ? 0.0f : 0.4f, canvas, rectF, cameraView);
                } else {
                    c(canvas, this.S, rectF, (jl2Var == null || !jl2Var.m) ? 0.4f : 0.0f);
                }
                if (z) {
                }
            }
        }
        z = false;
        if (jl2Var != null) {
        }
        if (!hl.m0) {
        }
        cameraView = this.d;
        if (cameraView == null) {
        }
        g((jl2Var == null && jl2Var.m) ? 0.0f : 0.4f, canvas, rectF, cameraView);
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
        tl0 tl0Var;
        jl2 jl2Var;
        int i;
        if (this.O == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvas2 = canvas;
        } else {
            RenderNode g = rm0.g(this.O);
            g.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = g.beginRecording();
        }
        super.dispatchDraw(canvas2);
        boolean i2 = i();
        mm mmVar = this.J;
        mm[] mmVarArr = this.K;
        float f5 = 0.0f;
        if (!i2 && !this.g0 && !this.f0) {
            float f6 = mmVar.c;
            al2 al2Var = this.f;
            if (f6 == al2Var.c && mmVarArr[0].c == al2Var.d[0]) {
                ny8 ny8Var = this.c;
                if (!ny8Var.a && ((mm) ny8Var.d).c <= 0.0f) {
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
        float e = mmVar.e(false, this.f.c);
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
            if (i4 >= mmVarArr.length) {
                break;
            }
            mmVarArr[i4].e(false, 1.0f);
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
            jl2 jl2Var2 = (jl2) arrayList.get(i5);
            zk2 zk2Var = jl2Var2.h;
            int i6 = zk2Var.c;
            float f8 = d2;
            int i7 = zk2Var.b;
            float f9 = e;
            mm[] mmVarArr2 = mmVarArr;
            float e2 = mmVarArr[i6].e(false, zk2Var.a.d[i6]);
            if (this.g0 || this.f0) {
                i = i6;
                hl.X1(jl2Var2.j, jl2Var2.k, jl2Var2.l, rectF);
            } else {
                i = i6;
                rectF.set((getMeasuredWidth() / e2) * i7, (getMeasuredHeight() / f9) * i6, (getMeasuredWidth() / e2) * (i7 + 1), (getMeasuredHeight() / f9) * (i + 1));
            }
            fArr2[i] = Math.min(fArr2[i], rectF.left);
            fArr[i] = Math.max(fArr[i], rectF.right);
            f7 = Math.max(f7, rectF.bottom);
            if (f8 <= f3 || jl2Var2 != this.i0) {
                if (this.o0 && jl2Var2.d != null) {
                    z = true;
                }
                d(canvas2, rectF, jl2Var2);
            }
            i5++;
            f = f2;
            f5 = f3;
            d2 = f8;
            e = f9;
            mmVarArr = mmVarArr2;
        }
        float f10 = d2;
        float f11 = e;
        mm[] mmVarArr3 = mmVarArr;
        int i8 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i8 >= arrayList2.size()) {
                break;
            }
            jl2 jl2Var3 = (jl2) arrayList2.get(i8);
            zk2 zk2Var2 = jl2Var3.h;
            int i9 = zk2Var2.c;
            int i10 = zk2Var2.b;
            int i11 = i8;
            float e3 = mmVarArr3[i9].e(false, i9 >= this.f.d.length ? f2 : r13[i9]);
            rectF.set((getMeasuredWidth() / e3) * i10, (getMeasuredHeight() / f11) * i9, (getMeasuredWidth() / e3) * (i10 + 1), (i9 + 1) * (getMeasuredHeight() / f11));
            fArr2[i9] = Math.min(fArr2[i9], rectF.left);
            fArr[i9] = Math.max(fArr[i9], rectF.right);
            f7 = Math.max(f7, rectF.bottom);
            if (this.o0 && jl2Var3.d != null) {
                z = true;
            }
            d(canvas2, rectF, jl2Var3);
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
        if (f10 > f4 && (jl2Var = this.i0) != null) {
            zk2 zk2Var3 = jl2Var.h;
            int i13 = zk2Var3.c;
            int i14 = zk2Var3.b;
            float e4 = mmVarArr3[i13].e(false, this.f.d[i13]);
            if (this.f0) {
                hl.X1(jl2Var.j, jl2Var.k, jl2Var.l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e4) * i14, (getMeasuredHeight() / f11) * i13, (getMeasuredWidth() / e4) * (i14 + 1), (getMeasuredHeight() / f11) * (i13 + 1));
            }
            canvas2.save();
            canvas2.translate(hl.R1(this.b0, this.d0, jl2Var.l) * f10, hl.R1(this.c0, this.e0, jl2Var.l) * f10);
            d(canvas2, rectF, jl2Var);
            canvas2.restore();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            jl2 jl2Var4 = (jl2) arrayList.get(i15);
            zk2 zk2Var4 = jl2Var4.h;
            float e5 = jl2Var4.b.e(false, 0.0f);
            if (e5 > 0.0f) {
                int i16 = zk2Var4.c;
                int i17 = zk2Var4.c;
                int i18 = zk2Var4.b;
                float e6 = mmVarArr3[i16].e(false, zk2Var4.a.d[i16]);
                if (this.g0 || this.f0) {
                    hl.X1(jl2Var4.j, jl2Var4.k, jl2Var4.l, rectF);
                } else {
                    rectF.set((getMeasuredWidth() / e6) * i18, (getMeasuredHeight() / f11) * i17, (getMeasuredWidth() / e6) * (i18 + 1), (getMeasuredHeight() / f11) * (i17 + 1));
                }
                RectF rectF2 = hl.P;
                rectF2.set(rectF);
                rectF2.inset(hl.L(4.0f), hl.L(4.0f));
                Matrix matrix = this.G;
                matrix.reset();
                float f12 = rectF.left;
                int i19 = this.E;
                matrix.postTranslate(hl.R1(((float) Math.sqrt((i19 * i19) << 1)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f2 - e5) + f12, 0.0f);
                matrix.postRotate(-25.0f);
                this.F.setLocalMatrix(matrix);
                Paint paint = this.w;
                paint.setAlpha(jn7.d4);
                Path path = this.x;
                path.rewind();
                zk2 zk2Var5 = jl2Var4.h;
                float L = (zk2Var5.b == 0 && zk2Var5.c == 0) ? hl.L(8.0f) : 0.0f;
                float[] fArr3 = this.y;
                fArr3[1] = L;
                fArr3[0] = L;
                zk2 zk2Var6 = jl2Var4.h;
                float L2 = (zk2Var6.b == zk2Var6.a.b + (-1) && zk2Var6.c == 0) ? hl.L(8.0f) : 0.0f;
                fArr3[2] = L2;
                fArr3[1] = L2;
                zk2 zk2Var7 = jl2Var4.h;
                int i20 = zk2Var7.b;
                al2 al2Var2 = zk2Var7.a;
                float L3 = (i20 == al2Var2.b + (-1) && zk2Var7.c == al2Var2.c + (-1)) ? hl.L(8.0f) : 0.0f;
                fArr3[4] = L3;
                fArr3[3] = L3;
                zk2 zk2Var8 = jl2Var4.h;
                float L4 = (zk2Var8.b == 0 && zk2Var8.c == zk2Var8.a.c + (-1)) ? hl.L(8.0f) : 0.0f;
                fArr3[6] = L4;
                fArr3[5] = L4;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                canvas2.drawPath(path, paint);
            }
        }
        if (z && (tl0Var = this.H) != null) {
            tl0Var.d();
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
        mm[] mmVarArr;
        RectF rectF;
        boolean z;
        jl2 jl2Var;
        gl2 gl2Var;
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
        mm mmVar = this.J;
        float f = mmVar.c;
        int i = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            mmVarArr = this.K;
            rectF = this.Q;
            if (i >= size) {
                z = z2;
                jl2Var = null;
                break;
            }
            jl2Var = (jl2) arrayList.get(i);
            zk2 zk2Var = jl2Var.h;
            int i2 = zk2Var.c;
            int i3 = zk2Var.b;
            float f2 = mmVarArr[i2].c;
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
            this.h0 = jl2Var;
            if (jl2Var != null) {
                gl2 gl2Var2 = new gl2(this, b);
                this.j0 = gl2Var2;
                hl.d3(gl2Var2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (dte.a(motionEvent.getX(), motionEvent.getY(), this.W, this.a0) > hl.e * 1.2f && (gl2Var = this.j0) != null) {
                hl.r(gl2Var);
                this.j0 = null;
            }
            if (!this.f0 && getFilledProgress() >= 1.0f && this.h0 != null && jl2Var != null && dte.a(motionEvent.getX(), motionEvent.getY(), this.W, this.a0) > hl.e * 1.2f) {
                this.f0 = z;
                this.i0 = this.h0;
                this.d0 = 0.0f;
                this.b0 = 0.0f;
                this.e0 = 0.0f;
                this.c0 = 0.0f;
                invalidate();
                gl2 gl2Var3 = this.j0;
                if (gl2Var3 != null) {
                    hl.r(gl2Var3);
                    this.j0 = null;
                }
            } else if (this.f0 && this.i0 != null) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f3 = mmVar.c;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    }
                    zk2 zk2Var2 = ((jl2) arrayList.get(i4)).h;
                    int i5 = zk2Var2.c;
                    int i6 = zk2Var2.b;
                    float f4 = mmVarArr[i5].c;
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
                    zk2 zk2Var3 = this.i0.h;
                    int i7 = zk2Var3.c;
                    int i8 = zk2Var3.b;
                    float f6 = mmVarArr[i7].c;
                    rectF.set((getMeasuredWidth() / f6) * i8, (getMeasuredHeight() / f5) * i7, (getMeasuredWidth() / f6) * (i8 + 1), (getMeasuredHeight() / f5) * (i7 + 1));
                    this.b0 = this.d0;
                    this.c0 = this.e0;
                    this.W = rectF.centerX();
                    this.a0 = rectF.centerY();
                }
                this.d0 = motionEvent.getX() - this.W;
                this.e0 = motionEvent.getY() - this.a0;
                invalidate();
            } else if (this.h0 != jl2Var) {
                this.h0 = null;
                gl2 gl2Var4 = this.j0;
                if (gl2Var4 != null) {
                    hl.r(gl2Var4);
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
                    gl2 gl2Var5 = this.j0;
                    if (gl2Var5 == null) {
                        return z3;
                    }
                    hl.r(gl2Var5);
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
        if (view == this.d && hl.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // eu5
    public final void e(RectF rectF) {
        jl2 jl2Var = this.k0;
        if (jl2Var == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        zk2 zk2Var = jl2Var.h;
        al2 al2Var = zk2Var.a;
        int i = zk2Var.b;
        int i2 = zk2Var.c;
        float f = al2Var.c;
        float e = this.K[i2].e(false, al2Var.d[i2]);
        rectF.set((getMeasuredWidth() / e) * i, (getMeasuredHeight() / f) * i2, (getMeasuredWidth() / e) * (i + 1), (getMeasuredHeight() / f) * (i2 + 1));
    }

    @Override // eu5
    public final void f(Canvas canvas, float f) {
        jl2 jl2Var = this.k0;
        if (jl2Var != null) {
            zk2 zk2Var = jl2Var.h;
            al2 al2Var = zk2Var.a;
            int i = zk2Var.b;
            int i2 = zk2Var.c;
            float f2 = al2Var.c;
            float e = this.K[i2].e(false, al2Var.d[i2]);
            float measuredWidth = (getMeasuredWidth() / e) * i;
            float measuredHeight = (getMeasuredHeight() / f2) * i2;
            float measuredWidth2 = (getMeasuredWidth() / e) * (i + 1);
            float measuredHeight2 = (getMeasuredHeight() / f2) * (i2 + 1);
            RectF rectF = this.Q;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            d(canvas, rectF, this.k0);
        }
    }

    public final void g(float f, Canvas canvas, RectF rectF, View view) {
        ny8 ny8Var;
        Bitmap bitmap;
        if (view != null) {
            float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            canvas.scale(max, max);
            canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
            if (hl.m0) {
                TextureView textureView = view instanceof TextureView ? (TextureView) view : view instanceof CameraView ? ((CameraView) view).getTextureView() : null;
                if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                    canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
            } else {
                view.draw(canvas);
            }
            if (f > 0.0f) {
                canvas.drawColor(aob.p1(view.getAlpha() * f, -16777216));
            }
            canvas.restore();
            if (view != this.d || (ny8Var = this.c) == null) {
                return;
            }
            Paint paint = (Paint) ny8Var.i;
            mm[] mmVarArr = (mm[]) ny8Var.h;
            mm[] mmVarArr2 = (mm[]) ny8Var.g;
            Path path = (Path) ny8Var.j;
            my8 my8Var = (my8) ny8Var.c;
            if (my8Var == null || my8Var.b.length <= 0) {
                return;
            }
            float d = ((mm) ny8Var.d).d(ny8Var.a);
            int i = 0;
            float e = ((mm) ny8Var.e).e(false, ((my8) ny8Var.c).c);
            float width = (rectF.width() * e) + rectF.left;
            float e2 = ((mm) ny8Var.f).e(false, ((my8) ny8Var.c).d);
            float height = (rectF.height() * e2) + rectF.top;
            float R1 = hl.R1(0.5f, 1.1f, d);
            canvas.save();
            canvas.scale(R1, R1, width, height);
            if (d > 0.0f) {
                path.rewind();
                int min = Math.min(4, ((my8) ny8Var.c).b.length);
                int i2 = 0;
                while (i2 < min) {
                    int i3 = i2 - 1;
                    if (i3 < 0) {
                        i3 = min - 1;
                    }
                    int i4 = i2 + 1;
                    int i5 = i4 >= min ? i : i4;
                    my8 my8Var2 = (my8) ny8Var.c;
                    mm[] mmVarArr3 = mmVarArr;
                    PointF[] pointFArr = my8Var2.b;
                    PointF pointF = pointFArr[i3];
                    int i6 = min;
                    PointF pointF2 = pointFArr[i2];
                    mm[] mmVarArr4 = mmVarArr2;
                    PointF pointF3 = pointFArr[i5];
                    float f2 = e;
                    float width2 = (rectF.width() * (mmVarArr4[i3].e(false, pointF.x - my8Var2.c) + f2)) + rectF.left;
                    float height2 = (rectF.height() * (mmVarArr3[i3].e(false, pointF.y - ((my8) ny8Var.c).d) + e2)) + rectF.top;
                    float width3 = (rectF.width() * (mmVarArr4[i2].e(false, pointF2.x - ((my8) ny8Var.c).c) + f2)) + rectF.left;
                    float height3 = (rectF.height() * (mmVarArr3[i2].e(false, pointF2.y - ((my8) ny8Var.c).d) + e2)) + rectF.top;
                    float width4 = (rectF.width() * (mmVarArr4[i5].e(false, pointF3.x - ((my8) ny8Var.c).c) + f2)) + rectF.left;
                    float height4 = ((rectF.height() * (mmVarArr3[i5].e(false, pointF3.y - ((my8) ny8Var.c).d) + e2)) + rectF.top) - height3;
                    path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                    path.lineTo(width3, height3);
                    path.lineTo(((width4 - width3) * 0.18f) + width3, (height4 * 0.18f) + height3);
                    mmVarArr = mmVarArr3;
                    d = d;
                    i2 = i4;
                    i = 0;
                    min = i6;
                    mmVarArr2 = mmVarArr4;
                    e = f2;
                }
                paint.setAlpha((int) (d * 255.0f));
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.O == null && Build.VERSION.SDK_INT >= 31) {
            this.O = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.P = renderNode;
            float L = hl.L(32.0f);
            float L2 = hl.L(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(L, L2, tileMode));
        }
        return this.P;
    }

    public ArrayList<c8b> getContent() {
        ArrayList<c8b> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            c8b c8bVar = ((jl2) obj).n;
            if (c8bVar != null) {
                arrayList.add(c8bVar);
            }
        }
        return arrayList;
    }

    public jl2 getCurrent() {
        return this.r;
    }

    public long getDuration() {
        jl2 mainPart;
        c8b c8bVar;
        if (!this.o0 || (mainPart = getMainPart()) == null || (c8bVar = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((c8bVar.W - c8bVar.V) * c8bVar.h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return i2;
            }
            if (((jl2) arrayList.get(i)).n != null) {
                i2++;
            }
            i++;
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public al2 getLayout() {
        return this.f;
    }

    public jl2 getMainPart() {
        jl2 jl2Var = null;
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
            jl2 jl2Var2 = (jl2) obj;
            c8b c8bVar = jl2Var2.n;
            if (c8bVar != null && c8bVar.K) {
                long j2 = c8bVar.h0;
                il2 il2Var = jl2Var2.d;
                if (il2Var != null && il2Var.getDuration() > 0) {
                    j2 = jl2Var2.d.getDuration();
                }
                if (j2 > j) {
                    jl2Var = jl2Var2;
                    j = j2;
                }
            }
        }
        return jl2Var;
    }

    public jl2 getNext() {
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
            i = qd4.g(((jl2) arrayList2.get(i)).a, i, 1, arrayList);
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
        jl2 mainPart = getMainPart();
        if (mainPart != null) {
            c8b c8bVar = mainPart.n;
            j = c8bVar.X + ((long) (c8bVar.V * c8bVar.h0));
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
        RenderNode g = rm0.g(this.O);
        g.endRecording();
        canvas.drawRenderNode(g);
        Object obj = this.P;
        if (obj != null) {
            RenderNode g2 = rm0.g(obj);
            g2.setPosition(0, 0, getWidth(), getHeight());
            g2.beginRecording().drawRenderNode(g);
            g2.endRecording();
        }
    }

    public final boolean i() {
        return this.f.e.size() > 1;
    }

    public final void j(RectF rectF, zk2 zk2Var) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = hl.q;
            measuredWidth = point.x;
            measuredHeight = point.y;
        }
        int[] iArr = zk2Var.a.d;
        int i = zk2Var.c;
        float f = measuredWidth / iArr[i];
        float f2 = measuredHeight / r1.c;
        rectF.set(zk2Var.b * f, i * f2, f * (r6 + 1), f2 * (i + 1));
    }

    public final void k(RectF rectF, zk2 zk2Var) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = hl.q;
            int i = point.x;
            measuredHeight = point.y;
            measuredWidth = i;
        }
        j(rectF, zk2Var);
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

    public final boolean l(c8b c8bVar) {
        if (c8bVar.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                c8b c8bVar2 = ((jl2) obj).n;
                if (c8bVar2 != null && c8bVar2.K && c8bVar2.P > 0.0f) {
                    c8bVar.P = 0.0f;
                    break;
                }
            }
        }
        jl2 jl2Var = this.r;
        if (jl2Var != null) {
            jl2Var.a(c8bVar);
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
                gl2 gl2Var = this.x0;
                hl.r(gl2Var);
                gl2Var.run();
            }
        }
    }

    public final void n(c8b c8bVar) {
        if (c8bVar == null || c8bVar.T == null) {
            b();
            return;
        }
        o(c8bVar.S);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return;
            }
            ((jl2) arrayList.get(i)).a((c8b) c8bVar.T.get(i));
            i++;
        }
    }

    public final void o(al2 al2Var) {
        if (al2Var == null) {
            al2Var = new al2(".");
        }
        ArrayList arrayList = al2Var.e;
        this.f = al2Var;
        gl2 gl2Var = this.I;
        hl.r(gl2Var);
        int i = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i >= Math.max(size, arrayList2.size())) {
                q();
                invalidate();
                hl.d3(gl2Var, 360L);
                return;
            }
            zk2 zk2Var = i < arrayList.size() ? (zk2) arrayList.get(i) : null;
            jl2 jl2Var = i < arrayList2.size() ? (jl2) arrayList2.get(i) : null;
            if (jl2Var == null && zk2Var != null) {
                jl2 jl2Var2 = new jl2(this);
                if (this.l0) {
                    jl2Var2.c.I();
                }
                jl2Var2.b(zk2Var, true);
                arrayList2.add(jl2Var2);
            } else if (zk2Var != null) {
                jl2Var.b(zk2Var, true);
            } else if (jl2Var != null) {
                this.n.add(jl2Var);
                arrayList2.remove(jl2Var);
                jl2Var.b(null, true);
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
                ((jl2) arrayList.get(i)).c.I();
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
                hl.r(this.x0);
                return;
            } else {
                ((jl2) arrayList.get(i)).c.K();
                i++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        jl2 jl2Var;
        c8b c8bVar;
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
                        jl2Var = null;
                        break;
                    } else {
                        if (childAt == ((jl2) arrayList.get(i6)).e) {
                            jl2Var = (jl2) arrayList.get(i6);
                            break;
                        }
                        i6++;
                    }
                }
                if (jl2Var == null || (c8bVar = jl2Var.n) == null || (i3 = c8bVar.k0) <= 0 || (i4 = c8bVar.l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                } else {
                    if (c8bVar.Q % 90 == 1) {
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
            jl2 jl2Var = (jl2) arrayList.get(i);
            if (jl2Var.n == null) {
                if (this.r != null) {
                    this.s = jl2Var;
                    break;
                }
                this.r = jl2Var;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jl2 jl2Var2 = (jl2) arrayList.get(i2);
            jl2Var2.m = jl2Var2 == this.r;
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
            cameraView2.unlistenDraw(new gl2(this, b));
            hl.B2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, tre.e(-1, -1, jn7.D1));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new gl2(this, b));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new gl2(this, b));
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
                gl2 gl2Var = this.x0;
                hl.r(gl2Var);
                gl2Var.run();
            }
        }
    }

    public void setPreview(boolean z) {
        if (this.o0 != z) {
            this.o0 = z;
            ArrayList arrayList = this.h;
            int i = 0;
            if (z) {
                tl0 tl0Var = this.H;
                if (tl0Var != null) {
                    tl0Var.d();
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((jl2) arrayList.get(i2)).a = i2;
                }
            }
            this.q0 = false;
            this.v0 = 0L;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jl2 jl2Var = (jl2) obj;
                il2 il2Var = jl2Var.d;
                if (il2Var != null) {
                    il2Var.setAudioEnabled(z, true);
                    if (!z || this.r0) {
                        jl2Var.d.play();
                    } else {
                        jl2Var.d.pause();
                    }
                }
            }
            gl2 gl2Var = this.x0;
            hl.r(gl2Var);
            if (z) {
                this.p0 = System.currentTimeMillis();
                hl.d3(gl2Var, (long) (1000.0f / hl.r));
            }
        }
    }

    public void setPreviewView(mm8 mm8Var) {
        this.t0 = mm8Var;
    }

    public void setResetState(Runnable runnable) {
        this.n0 = runnable;
    }

    @Override // eu5
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z) {
        qd4.a(this, z);
    }

    public void setTimelineView(ksb ksbVar) {
        this.s0 = ksbVar;
    }
}
