package hi;

import android.content.Context;
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
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.w60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class n0 extends FrameLayout implements w60 {
    public static final /* synthetic */ int y0 = 0;
    public final int E;
    public final LinearGradient F;
    public final Matrix G;
    public final org.telegram.ui.Components.ba H;
    public final j0 I;
    public final org.telegram.ui.Components.c6 J;
    public final org.telegram.ui.Components.c6[] K;
    public final org.telegram.ui.Components.c6 L;
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
    public final fi.b b;
    public float b0;
    public final i6 c;
    public float c0;
    public CameraView d;
    public float d0;
    public Object e;
    public float e0;
    public c0 f;
    public boolean f0;
    public boolean g0;
    public final ArrayList h;
    public m0 h0;
    public m0 i0;
    public j0 j0;
    public m0 k0;
    public boolean l0;
    public Runnable m0;
    public final ArrayList n;
    public Runnable n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public m0 r;
    public boolean r0;
    public m0 s;
    public xb s0;
    public f6 t0;
    public boolean u0;
    public long v0;
    public final Paint w;
    public boolean w0;
    public final Path x;
    public final j0 x0;
    public final float[] y;

    public n0(Context context, org.telegram.ui.Components.ba baVar, FrameLayout frameLayout, fi.b bVar) {
        super(context);
        this.c = new i6(new j0(this, 1));
        this.f = new c0(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.I = new j0(this, 2);
        kr krVar = kr.h;
        this.J = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.K = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(this, 0L, 320L, krVar), new org.telegram.ui.Components.c6(this, 0L, 320L, krVar), new org.telegram.ui.Components.c6(this, 0L, 320L, krVar), new org.telegram.ui.Components.c6(this, 0L, 320L, krVar), new org.telegram.ui.Components.c6(this, 0L, 320L, krVar)};
        this.L = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.M = new float[5];
        this.N = new float[5];
        this.Q = new RectF();
        this.R = new Path();
        this.T = true;
        this.r0 = true;
        this.u0 = true;
        this.x0 = new j0(this, 3);
        this.H = baVar;
        this.a = frameLayout;
        this.b = bVar;
        setBackgroundColor(-14737633);
        m0 m0Var = new m0(this);
        m0Var.b((b0) this.f.e.get(0), false);
        m0Var.m = true;
        if (this.l0) {
            m0Var.c.Q();
        }
        arrayList.add(m0Var);
        this.r = m0Var;
        this.s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(8.0f));
        int L = org.telegram.messenger.g0.L(300.0f);
        this.E = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void a(n0 n0Var, RectF rectF, b0 b0Var) {
        int measuredWidth = n0Var.getMeasuredWidth();
        int measuredHeight = n0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        n0Var.k(rectF, b0Var);
        float f10 = rectF.left;
        boolean z10 = f10 <= 0.0f;
        float f11 = rectF.top;
        boolean z11 = f11 <= 0.0f;
        float f12 = measuredWidth;
        boolean z12 = rectF.right >= f12;
        float f13 = measuredHeight;
        boolean z13 = rectF.bottom >= f13;
        if (z10 && z12 && !z11 && !z13) {
            rectF.offset(0.0f, f13 - f11);
            return;
        }
        if (z11 && z13 && !z10 && !z12) {
            rectF.offset(0.0f, f12 - f10);
            return;
        }
        if (z12 && !z10) {
            rectF.offset(rectF.width(), 0.0f);
        }
        if (!z13 || z11) {
            return;
        }
        rectF.offset(0.0f, rectF.height());
    }

    public static void d(Canvas canvas, Drawable drawable, RectF rectF, float f10) {
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
        if (f10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.n6.r1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.h0 == null) {
            return false;
        }
        this.h0 = null;
        this.f0 = false;
        invalidate();
        j0 j0Var = this.j0;
        if (j0Var == null) {
            return true;
        }
        org.telegram.messenger.g0.r(j0Var);
        this.j0 = null;
        return true;
    }

    public final void c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m0) obj).a(null);
        }
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        double d;
        float[] fArr;
        float[] fArr2;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        org.telegram.ui.Components.ba baVar;
        m0 m0Var;
        int i7;
        if (this.O == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvas2 = canvas;
        } else {
            RenderNode d2 = n2.a0.d(this.O);
            d2.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = d2.beginRecording();
        }
        super.dispatchDraw(canvas2);
        boolean j3 = j();
        org.telegram.ui.Components.c6 c6Var = this.J;
        org.telegram.ui.Components.c6[] c6VarArr = this.K;
        float f14 = 0.0f;
        if (!j3 && !this.g0 && !this.f0) {
            float f15 = c6Var.c;
            c0 c0Var = this.f;
            if (f15 == c0Var.c && c6VarArr[0].c == c0Var.d[0]) {
                i6 i6Var = this.c;
                if (!i6Var.b && i6Var.d.c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.o0) {
            setCameraNeedsBlur(false);
        }
        canvas2.drawColor(-14737633);
        float d10 = this.L.d(this.f0);
        float e10 = c6Var.e(false, this.f.c);
        int i10 = 0;
        while (true) {
            double d11 = i10;
            d = e10;
            double ceil = Math.ceil(d);
            fArr = this.N;
            fArr2 = this.M;
            if (d11 >= ceil) {
                break;
            }
            fArr2[i10] = getMeasuredWidth();
            fArr[i10] = 0.0f;
            i10++;
        }
        int i11 = this.f.c;
        while (true) {
            f10 = 1.0f;
            if (i11 >= c6VarArr.length) {
                break;
            }
            c6VarArr[i11].e(false, 1.0f);
            i11++;
        }
        int i12 = 0;
        boolean z10 = false;
        float f16 = 0.0f;
        while (true) {
            arrayList = this.h;
            f11 = f10;
            int size = arrayList.size();
            f12 = f14;
            rectF = this.Q;
            if (i12 >= size) {
                break;
            }
            m0 m0Var2 = (m0) arrayList.get(i12);
            b0 b0Var = m0Var2.h;
            int i13 = b0Var.c;
            float f17 = d10;
            int i14 = b0Var.b;
            float f18 = e10;
            org.telegram.ui.Components.c6[] c6VarArr2 = c6VarArr;
            float e11 = c6VarArr[i13].e(false, b0Var.a.d[i13]);
            if (this.g0 || this.f0) {
                i7 = i13;
                org.telegram.messenger.g0.Z1(m0Var2.j, m0Var2.k, m0Var2.l, rectF);
            } else {
                i7 = i13;
                rectF.set((getMeasuredWidth() / e11) * i14, (getMeasuredHeight() / f18) * i13, (getMeasuredWidth() / e11) * (i14 + 1), (getMeasuredHeight() / f18) * (i7 + 1));
            }
            fArr2[i7] = Math.min(fArr2[i7], rectF.left);
            fArr[i7] = Math.max(fArr[i7], rectF.right);
            f16 = Math.max(f16, rectF.bottom);
            if (f17 <= f12 || m0Var2 != this.i0) {
                if (this.o0 && m0Var2.d != null) {
                    z10 = true;
                }
                e(canvas2, rectF, m0Var2);
            }
            i12++;
            f10 = f11;
            f14 = f12;
            d10 = f17;
            e10 = f18;
            c6VarArr = c6VarArr2;
        }
        float f19 = d10;
        float f20 = e10;
        org.telegram.ui.Components.c6[] c6VarArr3 = c6VarArr;
        int i15 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i15 >= arrayList2.size()) {
                break;
            }
            m0 m0Var3 = (m0) arrayList2.get(i15);
            b0 b0Var2 = m0Var3.h;
            int i16 = b0Var2.c;
            int i17 = b0Var2.b;
            int i18 = i15;
            float e12 = c6VarArr3[i16].e(false, i16 >= this.f.d.length ? f11 : r13[i16]);
            rectF.set((getMeasuredWidth() / e12) * i17, (getMeasuredHeight() / f20) * i16, (getMeasuredWidth() / e12) * (i17 + 1), (i16 + 1) * (getMeasuredHeight() / f20));
            fArr2[i16] = Math.min(fArr2[i16], rectF.left);
            fArr[i16] = Math.max(fArr[i16], rectF.right);
            f16 = Math.max(f16, rectF.bottom);
            if (this.o0 && m0Var3.d != null) {
                z10 = true;
            }
            e(canvas2, rectF, m0Var3);
            i15 = i18 + 1;
        }
        if (this.f0) {
            f13 = f12;
        } else {
            int i19 = 0;
            while (i19 < Math.ceil(d)) {
                if (fArr2[i19] >= f12) {
                    rectF.set(f12, (getMeasuredHeight() / f20) * i19, fArr2[i19], (getMeasuredHeight() / f20) * (i19 + 1));
                    e(canvas2, rectF, null);
                }
                if (fArr[i19] < getMeasuredWidth()) {
                    rectF.set(fArr[i19], (getMeasuredHeight() / f20) * i19, getMeasuredWidth(), (getMeasuredHeight() / f20) * (i19 + 1));
                    e(canvas2, rectF, null);
                }
                i19++;
                f12 = 0.0f;
            }
            if (f16 < getMeasuredHeight()) {
                f13 = 0.0f;
                rectF.set(0.0f, f16, getMeasuredWidth(), getMeasuredHeight());
                e(canvas2, rectF, null);
            } else {
                f13 = 0.0f;
            }
        }
        if (f19 > f13 && (m0Var = this.i0) != null) {
            b0 b0Var3 = m0Var.h;
            int i20 = b0Var3.c;
            int i21 = b0Var3.b;
            float e13 = c6VarArr3[i20].e(false, this.f.d[i20]);
            if (this.f0) {
                org.telegram.messenger.g0.Z1(m0Var.j, m0Var.k, m0Var.l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e13) * i21, (getMeasuredHeight() / f20) * i20, (getMeasuredWidth() / e13) * (i21 + 1), (getMeasuredHeight() / f20) * (i20 + 1));
            }
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.T1(this.b0, this.d0, m0Var.l) * f19, org.telegram.messenger.g0.T1(this.c0, this.e0, m0Var.l) * f19);
            e(canvas2, rectF, m0Var);
            canvas2.restore();
        }
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            m0 m0Var4 = (m0) arrayList.get(i22);
            b0 b0Var4 = m0Var4.h;
            float e14 = m0Var4.b.e(false, 0.0f);
            if (e14 > 0.0f) {
                int i23 = b0Var4.c;
                int i24 = b0Var4.c;
                int i25 = b0Var4.b;
                float e15 = c6VarArr3[i23].e(false, b0Var4.a.d[i23]);
                if (this.g0 || this.f0) {
                    org.telegram.messenger.g0.Z1(m0Var4.j, m0Var4.k, m0Var4.l, rectF);
                } else {
                    rectF.set((getMeasuredWidth() / e15) * i25, (getMeasuredHeight() / f20) * i24, (getMeasuredWidth() / e15) * (i25 + 1), (getMeasuredHeight() / f20) * (i24 + 1));
                }
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(rectF);
                rectF2.inset(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                Matrix matrix = this.G;
                matrix.reset();
                float f21 = rectF.left;
                int i26 = this.E;
                int i27 = i26 * i26;
                matrix.postTranslate(org.telegram.messenger.g0.T1(((float) Math.sqrt(i27 + i27)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f11 - e14) + f21, 0.0f);
                matrix.postRotate(-25.0f);
                this.F.setLocalMatrix(matrix);
                Paint paint = this.w;
                paint.setAlpha(ks.e4);
                Path path = this.x;
                path.rewind();
                b0 b0Var5 = m0Var4.h;
                float L = (b0Var5.b == 0 && b0Var5.c == 0) ? org.telegram.messenger.g0.L(8.0f) : 0.0f;
                float[] fArr3 = this.y;
                fArr3[1] = L;
                fArr3[0] = L;
                b0 b0Var6 = m0Var4.h;
                float L2 = (b0Var6.b == b0Var6.a.b + (-1) && b0Var6.c == 0) ? org.telegram.messenger.g0.L(8.0f) : 0.0f;
                fArr3[2] = L2;
                fArr3[1] = L2;
                b0 b0Var7 = m0Var4.h;
                int i28 = b0Var7.b;
                c0 c0Var2 = b0Var7.a;
                float L3 = (i28 == c0Var2.b + (-1) && b0Var7.c == c0Var2.c + (-1)) ? org.telegram.messenger.g0.L(8.0f) : 0.0f;
                fArr3[4] = L3;
                fArr3[3] = L3;
                b0 b0Var8 = m0Var4.h;
                float L4 = (b0Var8.b == 0 && b0Var8.c == b0Var8.a.c + (-1)) ? org.telegram.messenger.g0.L(8.0f) : 0.0f;
                fArr3[6] = L4;
                fArr3[5] = L4;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                canvas2.drawPath(path, paint);
            }
        }
        if (z10 && (baVar = this.H) != null) {
            baVar.d();
        }
        i(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0244, code lost:
    
        if (b() != false) goto L67;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.c6[] c6VarArr;
        RectF rectF;
        boolean z10;
        m0 m0Var;
        j0 j0Var;
        if (!j() || this.o0) {
            b();
            return false;
        }
        boolean z11 = true;
        if (motionEvent.getPointerCount() > 1) {
            b();
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Components.c6 c6Var = this.J;
        float f10 = c6Var.c;
        int i7 = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            c6VarArr = this.K;
            rectF = this.Q;
            if (i7 >= size) {
                z10 = z11;
                m0Var = null;
                break;
            }
            m0Var = (m0) arrayList.get(i7);
            b0 b0Var = m0Var.h;
            int i10 = b0Var.c;
            int i11 = b0Var.b;
            float f11 = c6VarArr[i10].c;
            z10 = z11;
            rectF.set((getMeasuredWidth() / f11) * i11, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / f11) * (i11 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
            if (rectF.contains(x10, y10)) {
                break;
            }
            i7++;
            z11 = z10;
        }
        if (motionEvent.getAction() == 0) {
            this.W = motionEvent.getX();
            this.a0 = motionEvent.getY();
            this.f0 = false;
            this.d0 = 0.0f;
            this.b0 = 0.0f;
            this.e0 = 0.0f;
            this.c0 = 0.0f;
            this.h0 = m0Var;
            if (m0Var != null) {
                j0 j0Var2 = new j0(this, 0);
                this.j0 = j0Var2;
                org.telegram.messenger.g0.h3(j0Var2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (a8.x9.a(motionEvent.getX(), motionEvent.getY(), this.W, this.a0) > org.telegram.messenger.g0.e * 1.2f && (j0Var = this.j0) != null) {
                org.telegram.messenger.g0.r(j0Var);
                this.j0 = null;
            }
            if (!this.f0 && getFilledProgress() >= 1.0f && this.h0 != null && m0Var != null && a8.x9.a(motionEvent.getX(), motionEvent.getY(), this.W, this.a0) > org.telegram.messenger.g0.e * 1.2f) {
                this.f0 = z10;
                this.i0 = this.h0;
                this.d0 = 0.0f;
                this.b0 = 0.0f;
                this.e0 = 0.0f;
                this.c0 = 0.0f;
                invalidate();
                j0 j0Var3 = this.j0;
                if (j0Var3 != null) {
                    org.telegram.messenger.g0.r(j0Var3);
                    this.j0 = null;
                }
            } else if (this.f0 && this.i0 != null) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                float f12 = c6Var.c;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    b0 b0Var2 = ((m0) arrayList.get(i12)).h;
                    int i13 = b0Var2.c;
                    int i14 = b0Var2.b;
                    float f13 = c6VarArr[i13].c;
                    rectF.set((getMeasuredWidth() / f13) * i14, (getMeasuredHeight() / f12) * i13, (getMeasuredWidth() / f13) * (i14 + 1), (getMeasuredHeight() / f12) * (i13 + 1));
                    if (rectF.contains(x11, y11)) {
                        break;
                    }
                    i12++;
                }
                int indexOf = arrayList.indexOf(this.i0);
                if (i12 >= 0 && indexOf >= 0 && i12 != indexOf) {
                    Collections.swap(arrayList, indexOf, i12);
                    o(this.f);
                    this.g0 = true;
                    invalidate();
                    float f14 = this.f.c;
                    b0 b0Var3 = this.i0.h;
                    int i15 = b0Var3.c;
                    int i16 = b0Var3.b;
                    float f15 = c6VarArr[i15].c;
                    rectF.set((getMeasuredWidth() / f15) * i16, (getMeasuredHeight() / f14) * i15, (getMeasuredWidth() / f15) * (i16 + 1), (getMeasuredHeight() / f14) * (i15 + 1));
                    this.b0 = this.d0;
                    this.c0 = this.e0;
                    this.W = rectF.centerX();
                    this.a0 = rectF.centerY();
                }
                this.d0 = motionEvent.getX() - this.W;
                this.e0 = motionEvent.getY() - this.a0;
                invalidate();
            } else if (this.h0 != m0Var) {
                this.h0 = null;
                j0 j0Var4 = this.j0;
                if (j0Var4 != null) {
                    org.telegram.messenger.g0.r(j0Var4);
                    this.j0 = null;
                    return true;
                }
            }
        } else {
            boolean z12 = z10;
            if (motionEvent.getAction() == z12) {
                if (this.h0 != null) {
                    this.h0 = null;
                    this.f0 = false;
                    invalidate();
                    j0 j0Var5 = this.j0;
                    if (j0Var5 == null) {
                        return z12;
                    }
                    org.telegram.messenger.g0.r(j0Var5);
                    this.j0 = null;
                    return z12;
                }
            } else if (motionEvent.getAction() == 3) {
            }
        }
        return this.h0 != null || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d && org.telegram.messenger.g0.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, RectF rectF, m0 m0Var) {
        boolean z10;
        CameraView cameraView;
        ImageView imageView;
        if (org.telegram.messenger.g0.m0 && m0Var == this.k0) {
            return;
        }
        if (m0Var == this.i0) {
            org.telegram.ui.Components.c6 c6Var = this.L;
            if (c6Var.c > 0.0f) {
                canvas.save();
                Path path = this.R;
                path.rewind();
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(rectF);
                rectF2.inset(org.telegram.messenger.g0.L(10.0f) * c6Var.c, org.telegram.messenger.g0.L(10.0f) * c6Var.c);
                float L = org.telegram.messenger.g0.L(12.0f) * c6Var.c;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.clipPath(path);
                z10 = true;
                if (m0Var != null) {
                    ImageReceiver imageReceiver = m0Var.c;
                    if (m0Var.n != null) {
                        TextureView textureView = m0Var.e;
                        if (textureView == null || !m0Var.f) {
                            imageReceiver.z0(rectF.left, rectF.top, rectF.width(), rectF.height());
                            if (!imageReceiver.h(canvas, null)) {
                                CameraView cameraView2 = this.d;
                                if (cameraView2 == null && this.T) {
                                    d(canvas, this.S, rectF, 0.0f);
                                } else {
                                    h(0.0f, canvas, rectF, cameraView2);
                                }
                            }
                        } else {
                            h(0.0f, canvas, rectF, textureView);
                        }
                        if (z10) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                }
                if ((m0Var == null && m0Var.m) || org.telegram.messenger.g0.m0) {
                    CameraView cameraView3 = this.d;
                    if (cameraView3 == null && this.T) {
                        d(canvas, this.S, rectF, (m0Var == null || !m0Var.m) ? 0.4f : 0.0f);
                    } else {
                        h((m0Var == null || !m0Var.m) ? 0.4f : 0.0f, canvas, rectF, cameraView3);
                    }
                } else {
                    setCameraNeedsBlur(!this.o0);
                    if (this.e == null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                        RenderNode d = n2.a0.d(this.e);
                        float max = Math.max(rectF.width() / d.getWidth(), rectF.height() / d.getHeight());
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                        canvas.scale(max, max);
                        canvas.drawRenderNode(d);
                        canvas.drawColor(1677721600);
                        canvas.restore();
                    } else {
                        h(0.75f, canvas, rectF, this.d);
                    }
                    cameraView = this.d;
                    if (cameraView != null && (imageView = cameraView.blurredStubView) != null && imageView.getVisibility() == 0 && this.d.blurredStubView.getAlpha() > 0.0f) {
                        h(0.4f, canvas, rectF, this.d.blurredStubView);
                    }
                }
                if (z10) {
                }
            }
        }
        z10 = false;
        if (m0Var != null) {
        }
        if (m0Var == null) {
        }
        setCameraNeedsBlur(!this.o0);
        if (this.e == null) {
        }
        h(0.75f, canvas, rectF, this.d);
        cameraView = this.d;
        if (cameraView != null) {
            h(0.4f, canvas, rectF, this.d.blurredStubView);
        }
        if (z10) {
        }
    }

    @Override // org.telegram.ui.Components.w60
    public final void f(RectF rectF) {
        m0 m0Var = this.k0;
        if (m0Var == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        b0 b0Var = m0Var.h;
        c0 c0Var = b0Var.a;
        int i7 = b0Var.b;
        int i10 = b0Var.c;
        float f10 = c0Var.c;
        float e10 = this.K[i10].e(false, c0Var.d[i10]);
        rectF.set((getMeasuredWidth() / e10) * i7, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / e10) * (i7 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
    }

    @Override // org.telegram.ui.Components.w60
    public final void g(Canvas canvas, float f10) {
        m0 m0Var = this.k0;
        if (m0Var != null) {
            b0 b0Var = m0Var.h;
            c0 c0Var = b0Var.a;
            int i7 = b0Var.b;
            int i10 = b0Var.c;
            float f11 = c0Var.c;
            float e10 = this.K[i10].e(false, c0Var.d[i10]);
            float measuredWidth = (getMeasuredWidth() / e10) * i7;
            float measuredHeight = (getMeasuredHeight() / f11) * i10;
            float measuredWidth2 = (getMeasuredWidth() / e10) * (i7 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i10 + 1);
            RectF rectF = this.Q;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            e(canvas, rectF, this.k0);
        }
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.O == null && Build.VERSION.SDK_INT >= 31) {
            this.O = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.P = renderNode;
            float L = org.telegram.messenger.g0.L(32.0f);
            float L2 = org.telegram.messenger.g0.L(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(L, L2, tileMode));
        }
        return this.P;
    }

    public ArrayList<x7> getContent() {
        ArrayList<x7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            x7 x7Var = ((m0) obj).n;
            if (x7Var != null) {
                arrayList.add(x7Var);
            }
        }
        return arrayList;
    }

    public m0 getCurrent() {
        return this.r;
    }

    public long getDuration() {
        m0 mainPart;
        x7 x7Var;
        if (!this.o0 || (mainPart = getMainPart()) == null || (x7Var = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((x7Var.W - x7Var.V) * x7Var.h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return i10;
            }
            if (((m0) arrayList.get(i7)).n != null) {
                i10++;
            }
            i7++;
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public c0 getLayout() {
        return this.f;
    }

    public m0 getMainPart() {
        m0 m0Var = null;
        if (!this.o0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            m0 m0Var2 = (m0) obj;
            x7 x7Var = m0Var2.n;
            if (x7Var != null && x7Var.K) {
                long j10 = x7Var.h0;
                l0 l0Var = m0Var2.d;
                if (l0Var != null && l0Var.getDuration() > 0) {
                    j10 = m0Var2.d.getDuration();
                }
                if (j10 > j3) {
                    m0Var = m0Var2;
                    j3 = j10;
                }
            }
        }
        return m0Var;
    }

    public m0 getNext() {
        return this.s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i7 >= arrayList2.size()) {
                return arrayList;
            }
            i7 = com.google.android.gms.internal.vision.e2.f(((m0) arrayList2.get(i7)).a, i7, 1, arrayList);
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
        long j3 = currentTimeMillis - this.p0;
        if (j3 > getDuration()) {
            this.p0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.o0) {
            return 0L;
        }
        getPosition();
        m0 mainPart = getMainPart();
        if (mainPart != null) {
            x7 x7Var = mainPart.n;
            j3 = x7Var.X + ((long) (x7Var.V * x7Var.h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f10, Canvas canvas, RectF rectF, View view) {
        i6 i6Var;
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(max, max);
        canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
        if (org.telegram.messenger.g0.m0) {
            TextureView textureView = view instanceof TextureView ? (TextureView) view : view instanceof CameraView ? ((CameraView) view).getTextureView() : null;
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            view.draw(canvas);
        }
        if (f10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.n6.r1(view.getAlpha() * f10, -16777216));
        }
        canvas.restore();
        if (view != this.d || (i6Var = this.c) == null) {
            return;
        }
        Paint paint = i6Var.i;
        org.telegram.ui.Components.c6[] c6VarArr = i6Var.h;
        org.telegram.ui.Components.c6[] c6VarArr2 = i6Var.g;
        Path path = i6Var.j;
        h6 h6Var = i6Var.c;
        if (h6Var == null || h6Var.b.length <= 0) {
            return;
        }
        float d = i6Var.d.d(i6Var.b);
        int i7 = 0;
        float e10 = i6Var.e.e(false, i6Var.c.c);
        float width = (rectF.width() * e10) + rectF.left;
        float e11 = i6Var.f.e(false, i6Var.c.d);
        float height = (rectF.height() * e11) + rectF.top;
        float T1 = org.telegram.messenger.g0.T1(0.5f, 1.1f, d);
        canvas.save();
        canvas.scale(T1, T1, width, height);
        if (d > 0.0f) {
            path.rewind();
            int min = Math.min(4, i6Var.c.b.length);
            int i10 = 0;
            while (i10 < min) {
                int i11 = i10 - 1;
                if (i11 < 0) {
                    i11 = min - 1;
                }
                int i12 = i10 + 1;
                int i13 = i12 >= min ? i7 : i12;
                h6 h6Var2 = i6Var.c;
                PointF[] pointFArr = h6Var2.b;
                PointF pointF = pointFArr[i11];
                int i14 = min;
                PointF pointF2 = pointFArr[i10];
                org.telegram.ui.Components.c6[] c6VarArr3 = c6VarArr;
                PointF pointF3 = pointFArr[i13];
                org.telegram.ui.Components.c6[] c6VarArr4 = c6VarArr2;
                float f11 = d;
                float width2 = (rectF.width() * (c6VarArr4[i11].e(false, pointF.x - h6Var2.c) + e10)) + rectF.left;
                float height2 = (rectF.height() * (c6VarArr3[i11].e(false, pointF.y - i6Var.c.d) + e11)) + rectF.top;
                float width3 = (rectF.width() * (c6VarArr4[i10].e(false, pointF2.x - i6Var.c.c) + e10)) + rectF.left;
                float height3 = (rectF.height() * (c6VarArr3[i10].e(false, pointF2.y - i6Var.c.d) + e11)) + rectF.top;
                float width4 = (rectF.width() * (c6VarArr4[i13].e(false, pointF3.x - i6Var.c.c) + e10)) + rectF.left;
                float height4 = ((rectF.height() * (c6VarArr3[i13].e(false, pointF3.y - i6Var.c.d) + e11)) + rectF.top) - height3;
                path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                path.lineTo(width3, height3);
                path.lineTo(((width4 - width3) * 0.18f) + width3, (height4 * 0.18f) + height3);
                c6VarArr2 = c6VarArr4;
                i7 = 0;
                i10 = i12;
                min = i14;
                c6VarArr = c6VarArr3;
                d = f11;
            }
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    public final void i(Canvas canvas) {
        if (this.O == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode d = n2.a0.d(this.O);
        d.endRecording();
        canvas.drawRenderNode(d);
        Object obj = this.P;
        if (obj != null) {
            RenderNode d2 = n2.a0.d(obj);
            d2.setPosition(0, 0, getWidth(), getHeight());
            d2.beginRecording().drawRenderNode(d);
            d2.endRecording();
        }
    }

    public final boolean j() {
        return this.f.e.size() > 1;
    }

    public final void k(RectF rectF, b0 b0Var) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        float f10 = measuredWidth;
        c0 c0Var = b0Var.a;
        int[] iArr = c0Var.d;
        int i10 = b0Var.c;
        int i11 = iArr[i10];
        int i12 = b0Var.b;
        float f11 = measuredHeight;
        int i13 = c0Var.c;
        rectF.set((f10 / i11) * i12, (f11 / i13) * i10, (f10 / i11) * (i12 + 1), (f11 / i13) * (i10 + 1));
    }

    public final boolean l(x7 x7Var) {
        if (x7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                x7 x7Var2 = ((m0) obj).n;
                if (x7Var2 != null && x7Var2.K && x7Var2.P > 0.0f) {
                    x7Var.P = 0.0f;
                    break;
                }
            }
        }
        m0 m0Var = this.r;
        if (m0Var != null) {
            m0Var.a(x7Var);
        }
        q();
        requestLayout();
        return this.r == null;
    }

    public final void m(long j3, boolean z10) {
        if (this.o0) {
            long k10 = Utilities.k(j3, getDuration(), 0L);
            if (!this.r0) {
                this.v0 = k10;
            }
            this.p0 = System.currentTimeMillis() - k10;
            this.q0 = z10;
            if (this.o0) {
                j0 j0Var = this.x0;
                org.telegram.messenger.g0.r(j0Var);
                j0Var.run();
            }
        }
    }

    public final void n(x7 x7Var) {
        if (x7Var == null || x7Var.T == null) {
            c();
            return;
        }
        o(x7Var.S);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((m0) arrayList.get(i7)).a((x7) x7Var.T.get(i7));
            i7++;
        }
    }

    public final void o(c0 c0Var) {
        if (c0Var == null) {
            c0Var = new c0(".");
        }
        ArrayList arrayList = c0Var.e;
        this.f = c0Var;
        j0 j0Var = this.I;
        org.telegram.messenger.g0.r(j0Var);
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i7 >= Math.max(size, arrayList2.size())) {
                q();
                invalidate();
                org.telegram.messenger.g0.h3(j0Var, 360L);
                return;
            }
            b0 b0Var = i7 < arrayList.size() ? (b0) arrayList.get(i7) : null;
            m0 m0Var = i7 < arrayList2.size() ? (m0) arrayList2.get(i7) : null;
            if (m0Var == null && b0Var != null) {
                m0 m0Var2 = new m0(this);
                if (this.l0) {
                    m0Var2.c.Q();
                }
                m0Var2.b(b0Var, true);
                arrayList2.add(m0Var2);
            } else if (b0Var != null) {
                m0Var.b(b0Var, true);
            } else if (m0Var != null) {
                this.n.add(m0Var);
                arrayList2.remove(m0Var);
                m0Var.b(null, true);
                i7--;
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                this.l0 = true;
                return;
            } else {
                ((m0) arrayList.get(i7)).c.Q();
                i7++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                this.l0 = false;
                org.telegram.messenger.g0.r(this.x0);
                return;
            } else {
                ((m0) arrayList.get(i7)).c.S();
                i7++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        m0 m0Var;
        x7 x7Var;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else {
                int i14 = 0;
                while (true) {
                    ArrayList arrayList = this.h;
                    if (i14 >= arrayList.size()) {
                        m0Var = null;
                        break;
                    } else {
                        if (childAt == ((m0) arrayList.get(i14)).e) {
                            m0Var = (m0) arrayList.get(i14);
                            break;
                        }
                        i14++;
                    }
                }
                if (m0Var == null || (x7Var = m0Var.n) == null || (i11 = x7Var.k0) <= 0 || (i12 = x7Var.l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                } else {
                    if (x7Var.Q % 90 == 1) {
                        i12 = i11;
                        i11 = i12;
                    }
                    float f10 = i11;
                    float f11 = i12;
                    float min = Math.min(1.0f, Math.max(f10 / size, f11 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * min), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (f11 * min), TLObject.FLAG_30));
                }
            }
        }
    }

    public final void p() {
        CameraView cameraView = this.d;
        boolean z10 = cameraView != null && this.V;
        if (z10 == (this.e != null)) {
            return;
        }
        if (z10) {
            this.e = cameraView.getBlurRenderNode();
        } else {
            this.e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        this.r = null;
        this.s = null;
        int i7 = 0;
        while (true) {
            arrayList = this.h;
            if (i7 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i7);
            if (m0Var.n == null) {
                if (this.r != null) {
                    this.s = m0Var;
                    break;
                }
                this.r = m0Var;
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m0 m0Var2 = (m0) arrayList.get(i10);
            m0Var2.m = m0Var2 == this.r;
        }
    }

    public void setCameraNeedsBlur(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.S = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z10) {
        this.T = z10;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new j0(this, 1));
            org.telegram.messenger.g0.E2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, c8.na.e(-1, -1, ks.E1));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new j0(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new j0(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.w0 == z10) {
            return;
        }
        this.w0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.U = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.u0;
        this.u0 = true;
        if (this.r0 == z10) {
            return;
        }
        this.r0 = z10;
        if (!z10) {
            this.v0 = getPosition();
        } else if (z11) {
            m(this.v0, false);
        } else {
            this.q0 = false;
        }
        if (this.o0) {
            j0 j0Var = this.x0;
            org.telegram.messenger.g0.r(j0Var);
            j0Var.run();
        }
    }

    public void setPreview(boolean z10) {
        if (this.o0 == z10) {
            return;
        }
        this.o0 = z10;
        ArrayList arrayList = this.h;
        int i7 = 0;
        if (z10) {
            org.telegram.ui.Components.ba baVar = this.H;
            if (baVar != null) {
                baVar.d();
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((m0) arrayList.get(i10)).a = i10;
            }
        }
        this.q0 = false;
        this.v0 = 0L;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            m0 m0Var = (m0) obj;
            l0 l0Var = m0Var.d;
            if (l0Var != null) {
                l0Var.setAudioEnabled(z10, true);
                if (!z10 || this.r0) {
                    m0Var.d.play();
                } else {
                    m0Var.d.pause();
                }
            }
        }
        j0 j0Var = this.x0;
        org.telegram.messenger.g0.r(j0Var);
        if (z10) {
            this.p0 = System.currentTimeMillis();
            org.telegram.messenger.g0.h3(j0Var, (long) (1000.0f / org.telegram.messenger.g0.r));
        }
    }

    public void setPreviewView(f6 f6Var) {
        this.t0 = f6Var;
    }

    public void setResetState(Runnable runnable) {
        this.n0 = runnable;
    }

    @Override // org.telegram.ui.Components.w60
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }

    public void setTimelineView(xb xbVar) {
        this.s0 = xbVar;
    }
}
