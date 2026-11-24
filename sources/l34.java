// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class l34 extends FrameLayout {
    public static final List r0 = Arrays.asList(-90, 0, 90, Integer.valueOf(kk7.J2));
    public boolean E;
    public boolean F;
    public boolean G;
    public j34 H;
    public PointF I;
    public k34 J;
    public final g34 K;
    public final UUID L;
    public boolean M;
    public int N;
    public int O;
    public sm3 P;
    public float Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public int T;
    public int U;
    public final g34 V;
    public final g34 W;
    public final n41 a;
    public int a0;
    public float b;
    public int b0;
    public float c;
    public ValueAnimator c0;
    public float d;
    public ValueAnimator d0;
    public float e;
    public boolean e0;
    public float f;
    public boolean f0;
    public final float[] g0;
    public float h;
    public final float[] h0;
    public final float[] i0;
    public float j0;
    public float k0;
    public float l0;
    public ValueAnimator m0;
    public boolean n;
    public boolean n0;
    public FrameLayout o0;
    public float p0;
    public ValueAnimator q0;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [g34] */
    /* JADX WARN: Type inference failed for: r0v2, types: [g34] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g34] */
    public l34(Context context, PointF pointF) {
        super(context);
        this.a = new n41(this);
        final byte b = 0;
        this.n = false;
        this.r = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.K = new Runnable(this) { // from class: g34
            public final /* synthetic */ l34 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                l34 l34Var = this.b;
                switch (b2) {
                    case 0:
                        l34Var.G = true;
                        if (l34Var.H != null) {
                            try {
                                l34Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            l34Var.H.A(l34Var);
                            break;
                        }
                        break;
                    case 1:
                        l34Var.n();
                        break;
                    default:
                        l34Var.o();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.M = true;
        this.N = 0;
        this.O = -1;
        this.T = 0;
        this.U = 0;
        this.V = new Runnable(this) { // from class: g34
            public final /* synthetic */ l34 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                l34 l34Var = this.b;
                switch (b22) {
                    case 0:
                        l34Var.G = true;
                        if (l34Var.H != null) {
                            try {
                                l34Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            l34Var.H.A(l34Var);
                            break;
                        }
                        break;
                    case 1:
                        l34Var.n();
                        break;
                    default:
                        l34Var.o();
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.W = new Runnable(this) { // from class: g34
            public final /* synthetic */ l34 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                l34 l34Var = this.b;
                switch (b22) {
                    case 0:
                        l34Var.G = true;
                        if (l34Var.H != null) {
                            try {
                                l34Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            l34Var.H.A(l34Var);
                            break;
                        }
                        break;
                    case 1:
                        l34Var.n();
                        break;
                    default:
                        l34Var.o();
                        break;
                }
            }
        };
        this.g0 = new float[2];
        this.h0 = new float[2];
        this.i0 = new float[2];
        this.j0 = 1.0f;
        this.n0 = false;
        this.p0 = 1.0f;
        this.L = UUID.randomUUID();
        this.I = pointF;
    }

    public k34 a() {
        d09 d09Var = new d09(this, getContext(), (byte) 0);
        d09Var.r = new RectF();
        return d09Var;
    }

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        j34 j34Var;
        j34 j34Var2;
        j34 j34Var3;
        j34 j34Var4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z) {
                f5 = (f + f3) / 2.0f;
                f6 = (f2 + f4) / 2.0f;
            } else {
                f5 = f;
                f6 = f2;
            }
            float f7 = (f5 - this.f) / scaleX;
            float f8 = (f6 - this.h) / scaleX;
            if (((float) Math.hypot(f7, f8)) > (this.n ? 6.0f : 16.0f) || z) {
                gl.r(this.K);
                e(f7, f8);
                if (z) {
                    float a = loe.a(f, f2, f3, f4);
                    float a2 = loe.a(this.b, this.c, this.d, this.e);
                    if (a2 > 0.0f) {
                        j(a / a2);
                    }
                    f(this.k0 + ((float) Math.toDegrees(Math.atan2(f2 - f4, f - f3) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f;
                this.c = f2;
                this.f = f5;
                this.h = f6;
                if (z) {
                    this.d = f3;
                    this.e = f4;
                }
                byte b = 1;
                this.n = true;
                if ((getParent() instanceof e34) && (this.T != 0 || this.U != 0)) {
                    ((e34) getParent()).invalidate();
                }
                if (!this.x && (j34Var4 = this.H) != null) {
                    this.x = true;
                    j34Var4.C();
                }
                if (!this.y && z && (j34Var3 = this.H) != null) {
                    this.y = true;
                    j34Var3.g();
                }
                if (this.y && !z && (j34Var2 = this.H) != null) {
                    this.y = false;
                    j34Var2.f();
                }
                if (!this.n0 && !this.E && (j34Var = this.H) != null) {
                    j34Var.i(this);
                    this.E = true;
                }
                j34 j34Var5 = this.H;
                if (j34Var5 != null) {
                    j34Var5.B(de9.x((float) getHeight(), 2.0f, scaleX, this.I.y) < ((float) gl.L(66.0f)));
                    this.H.d(b00.A((float) getHeight(), 2.0f, scaleX, this.I.y) > ((float) (((View) getParent()).getHeight() - gl.L(114.0f))));
                }
                j34 j34Var6 = this.H;
                boolean z2 = (j34Var6 == null || j34Var6.o()) && !z && loe.a(f5, f6, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - gl.L(76.0f))) < ((float) gl.L(32.0f));
                if (this.F != z2) {
                    ValueAnimator valueAnimator = this.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.q0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p0, z2 ? 0.5f : 1.0f);
                    this.q0 = ofFloat;
                    ofFloat.addUpdateListener(new h34(this, b));
                    this.q0.setInterpolator(s33.h);
                    this.q0.setDuration(280L);
                    this.q0.start();
                    this.F = z2;
                    j34 j34Var7 = this.H;
                    if (j34Var7 != null) {
                        j34Var7.j(z2);
                    }
                }
                this.a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z) {
        j34 j34Var;
        j34 j34Var2;
        if (this.x) {
            this.H.e(this.F);
            this.x = false;
        }
        this.y = false;
        if (!z && !this.G && !this.n && !this.w && !this.E && (j34Var2 = this.H) != null) {
            j34Var2.i(this);
        }
        if (this.n && (j34Var = this.H) != null) {
            j34Var.B(false);
            this.H.d(false);
        }
        gl.r(this.K);
        this.G = false;
        this.n = false;
        this.w = false;
        this.r = true;
        this.s = false;
        this.E = false;
        this.O = this.N;
        sm3 sm3Var = this.P;
        if (sm3Var != null) {
            gl.r(sm3Var);
            this.P = null;
        }
        this.a0 = this.T;
        gl.r(this.V);
        this.b0 = this.U;
        gl.r(this.W);
        if (getParent() instanceof e34) {
            ((e34) getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float a = this.a.a(getBounceScale());
        canvas.save();
        canvas.scale(a, a, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof am9) {
                float f = this.p0;
                canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - gl.L(76.0f)) - getY();
                float f2 = this.p0;
                canvas.scale(f2, f2, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.I.y) - (r10.getMeasuredHeight() - gl.L(64.0f))) > gl.L(12.0f)) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f, float f2) {
        int i;
        PointF pointF = this.I;
        pointF.x += f;
        pointF.y += f2;
        if (((View) getParent()) != null) {
            int i2 = 3;
            if (!this.e0) {
                if (Math.abs(this.I.x - (r10.getMeasuredWidth() / 2.0f)) > gl.L(12.0f) || this.I.y >= r10.getMeasuredHeight() - gl.L(112.0f)) {
                    if (Math.abs((this.I.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - gl.L(8.0f)) <= gl.L(12.0f)) {
                        i = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.I.x) - (r10.getMeasuredWidth() - gl.L(8.0f))) <= gl.L(12.0f)) {
                            i = 3;
                        }
                    }
                } else {
                    i = 2;
                }
                if (this.a0 != i) {
                    this.a0 = i;
                    if (i == 0) {
                        n();
                    } else {
                        gl.e3(this.V, 250L);
                    }
                }
                if (!this.e0) {
                    if (Math.abs(this.I.y - (r10.getMeasuredHeight() / 2.0f)) <= gl.L(12.0f)) {
                        i2 = 2;
                    } else {
                        if (Math.abs((this.I.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - gl.L(64.0f)) <= gl.L(12.0f)) {
                            i2 = 1;
                        }
                    }
                    if (this.b0 != i2) {
                        this.b0 = i2;
                        if (i2 == 0) {
                            o();
                        } else {
                            gl.e3(this.W, 250L);
                        }
                    }
                }
                i2 = 0;
                if (this.b0 != i2) {
                }
            }
            i = 0;
            if (this.a0 != i) {
            }
            if (!this.e0) {
            }
            i2 = 0;
            if (this.b0 != i2) {
            }
        }
        k();
    }

    public final void f(float f) {
        byte b = 0;
        if (this.T != 0) {
            this.a0 = 0;
            n();
        }
        if (this.U != 0) {
            this.b0 = 0;
            o();
        }
        this.k0 = f;
        if (this.M) {
            if (Math.abs(this.N - f) >= 12.0f || this.e0) {
                this.O = -1;
                sm3 sm3Var = this.P;
                if (sm3Var != null) {
                    gl.r(sm3Var);
                    this.P = null;
                }
                ValueAnimator valueAnimator = this.R;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.S;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.S = duration;
                duration.setInterpolator(s33.f);
                this.S.addUpdateListener(new h34(this, b));
                this.S.addListener(new i34(this, (byte) 3));
                this.S.start();
                this.M = false;
            } else {
                f = this.R != null ? this.Q : this.N;
            }
        } else if (!this.e0) {
            Iterator it = r0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f) < 4.0f) {
                    if (this.O != intValue) {
                        this.O = intValue;
                        sm3 sm3Var2 = this.P;
                        if (sm3Var2 != null) {
                            gl.r(sm3Var2);
                        }
                        sm3 sm3Var3 = new sm3((Object) this, intValue, (byte) 4);
                        this.P = sm3Var3;
                        gl.e3(sm3Var3, 250L);
                    }
                }
            }
        }
        ValueAnimator valueAnimator3 = this.S;
        if (valueAnimator3 != null) {
            f = gl.Z1(0.0f, f, valueAnimator3.getAnimatedFraction());
        }
        g(f);
    }

    public final void g(float f) {
        setRotation(f);
        if (this.T != 0 || this.U != 0) {
            k();
        }
        m();
    }

    public float getBounceScale() {
        return 0.04f;
    }

    public float getMaxScale() {
        return 100.0f;
    }

    public float getMinScale() {
        return 0.0f;
    }

    public PointF getPosition() {
        return this.I;
    }

    public float getPositionX() {
        float f;
        float f2 = this.I.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i = this.T;
            if (i == 1) {
                f = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + gl.L(8.0f);
            } else if (i == 2) {
                f = view.getMeasuredWidth() / 2.0f;
            } else if (i == 3) {
                f = (view.getMeasuredWidth() - gl.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f = f2;
            }
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                return gl.R1(f2, f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f != 0.0f) {
                return f;
            }
        }
        return f2;
    }

    public float getPositionY() {
        float f;
        float f2 = this.I.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i = this.U;
            if (i == 1) {
                f = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + gl.L(64.0f);
            } else if (i == 2) {
                f = view.getMeasuredHeight() / 2.0f;
            } else if (i == 3) {
                f = (view.getMeasuredHeight() - gl.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f = f2;
            }
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                return gl.R1(f2, f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f != 0.0f) {
                return f;
            }
        }
        return f2;
    }

    public float getScale() {
        return getScaleX();
    }

    public l29 getSelectionBounds() {
        return new l29(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getStickyPaddingBottom() {
        return 0.0f;
    }

    public float getStickyPaddingLeft() {
        return 0.0f;
    }

    public float getStickyPaddingRight() {
        return 0.0f;
    }

    public float getStickyPaddingTop() {
        return 0.0f;
    }

    public final int getStickyX() {
        return this.T;
    }

    public final int getStickyY() {
        return this.U;
    }

    public UUID getUUID() {
        return this.L;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.c0 = duration;
        duration.setInterpolator(s33.f);
        this.c0.addUpdateListener(new h34(this, (byte) 3));
        this.c0.addListener(new i34(this, (byte) 0));
        this.c0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.d0 = duration;
        duration.setInterpolator(s33.f);
        this.d0.addUpdateListener(new h34(this, (byte) 4));
        this.d0.addListener(new i34(this, (byte) 1));
        this.d0.start();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.n0;
    }

    public final void j(float f) {
        float f2 = this.j0;
        float f3 = f * f2;
        this.j0 = f3;
        float i = Utilities.i(Math.max(f3, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof e09)) {
            if ((i >= getMaxScale() || i <= getMinScale()) != (f2 >= getMaxScale() || f2 <= getMinScale())) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(i);
        setScaleY(i);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(FrameLayout frameLayout, boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            ValueAnimator valueAnimator = this.m0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.m0 = null;
            }
            if (this.J == null) {
                if (!z && frameLayout == null) {
                    return;
                }
                k34 a = a();
                this.J = a;
                a.f = !this.e0;
                a.invalidate();
                frameLayout.addView(this.J);
                this.l0 = 0.0f;
            }
            this.J.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, z ? 1.0f : 0.0f);
            this.m0 = ofFloat;
            ofFloat.addUpdateListener(new h34(this, (byte) 2));
            this.m0.addListener(new i34(this, (byte) 4));
            this.m0.setDuration(280L);
            this.m0.setInterpolator(s33.h);
            this.m0.start();
        }
    }

    public final void m() {
        k34 k34Var = this.J;
        if (k34Var != null) {
            k34Var.b();
        }
    }

    public final void n() {
        gl.r(this.V);
        int i = this.T;
        int i2 = this.a0;
        if (i == i2) {
            return;
        }
        this.T = i2;
        if (getParent() instanceof e34) {
            ((e34) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.a0 == 0) {
            h(1.0f, 0.0f);
        } else {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            h(0.0f, 1.0f);
        }
    }

    public final void o() {
        gl.r(this.W);
        int i = this.U;
        int i2 = this.b0;
        if (i == i2) {
            return;
        }
        this.U = i2;
        if (getParent() instanceof e34) {
            ((e34) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.b0 == 0) {
            i(1.0f, 0.0f);
        } else {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            i(0.0f, 1.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.H.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        l34 l34Var;
        boolean z2;
        if (this.H.p()) {
            j34 j34Var = this.H;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.g0;
            j34Var.u(rawX, rawY, fArr);
            boolean z3 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.h0;
            if (z3) {
                if (Build.VERSION.SDK_INT < 29) {
                    z = false;
                    float[] fArr3 = this.i0;
                    if (z) {
                        fArr3[0] = fArr[0];
                        fArr3[1] = fArr[1];
                    } else {
                        fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                        fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    }
                    if (this.e0 != z) {
                        this.b = fArr[0];
                        this.c = fArr[1];
                        this.d = fArr2[0];
                        this.e = fArr2[1];
                        this.f = fArr3[0];
                        this.h = fArr3[1];
                        k34 k34Var = this.J;
                        if (k34Var != null) {
                            k34Var.f = !z;
                            k34Var.invalidate();
                        }
                    }
                    this.e0 = z;
                    float f = fArr3[0];
                    float f2 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    n41 n41Var = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                l34Var = this;
                                z2 = l34Var.c(fArr[0], fArr[1], fArr2[0], fArr2[1], z);
                            } else if (actionMasked != 3) {
                                l34Var = this;
                                z2 = false;
                            }
                            l34Var.f0 = z;
                            if (!super.onTouchEvent(motionEvent) || z2) {
                                return true;
                            }
                        }
                        l34Var = this;
                        l34Var.d(actionMasked == 3);
                        n41Var.c(false);
                        k34 k34Var2 = l34Var.J;
                        if (k34Var2 != null) {
                            k34Var2.f = true;
                            k34Var2.invalidate();
                        }
                    } else {
                        l34Var = this;
                        l34Var.f0 = false;
                        l34Var.b = fArr[0];
                        l34Var.c = fArr[1];
                        l34Var.f = f;
                        l34Var.h = f2;
                        l34Var.r = false;
                        l34Var.s = true;
                        if ((l34Var.getParent() instanceof e34) && (l34Var.T != 0 || l34Var.U != 0)) {
                            ((e34) l34Var.getParent()).invalidate();
                        }
                        n41Var.c(true);
                        g34 g34Var = l34Var.K;
                        gl.r(g34Var);
                        if (!z) {
                            gl.e3(g34Var, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z2 = true;
                    l34Var.f0 = z;
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                    return true;
                }
                this.H.u(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            }
            z = z3;
            float[] fArr32 = this.i0;
            if (z) {
            }
            if (this.e0 != z) {
            }
            this.e0 = z;
            float f3 = fArr32[0];
            float f22 = fArr32[1];
            actionMasked = motionEvent.getActionMasked();
            n41 n41Var2 = this.a;
            if (actionMasked == 0) {
            }
            z2 = true;
            l34Var.f0 = z;
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(j34 j34Var) {
        this.H = j34Var;
    }

    public void setPosition(PointF pointF) {
        this.I = pointF;
        k();
    }

    public void setScale(float f) {
        this.j0 = f;
        setScaleX(f);
        setScaleY(f);
    }

    public void setSelectionVisibility(boolean z) {
        k34 k34Var = this.J;
        if (k34Var == null) {
            return;
        }
        k34Var.setVisibility(z ? 0 : 8);
    }

    public void setStickyX(int i) {
        this.a0 = i;
        this.T = i;
    }

    public void setStickyY(int i) {
        this.b0 = i;
        this.U = i;
    }

    public void setIsVideo(boolean z) {
    }
}
