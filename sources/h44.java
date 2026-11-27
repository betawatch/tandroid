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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class h44 extends FrameLayout {
    public static final List r0 = Arrays.asList(-90, 0, 90, Integer.valueOf(jn7.J2));
    public boolean E;
    public boolean F;
    public boolean G;
    public f44 H;
    public PointF I;
    public g44 J;
    public final c44 K;
    public final UUID L;
    public boolean M;
    public int N;
    public int O;
    public hl3 P;
    public float Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public int T;
    public int U;
    public final c44 V;
    public final c44 W;
    public final v41 a;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [c44] */
    /* JADX WARN: Type inference failed for: r0v2, types: [c44] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c44] */
    public h44(Context context, PointF pointF) {
        super(context);
        this.a = new v41(this);
        final byte b = 0;
        this.n = false;
        this.r = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.K = new Runnable(this) { // from class: c44
            public final /* synthetic */ h44 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                h44 h44Var = this.b;
                switch (b2) {
                    case 0:
                        h44Var.G = true;
                        if (h44Var.H != null) {
                            try {
                                h44Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            h44Var.H.A(h44Var);
                            break;
                        }
                        break;
                    case 1:
                        h44Var.n();
                        break;
                    default:
                        h44Var.o();
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
        this.V = new Runnable(this) { // from class: c44
            public final /* synthetic */ h44 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                h44 h44Var = this.b;
                switch (b22) {
                    case 0:
                        h44Var.G = true;
                        if (h44Var.H != null) {
                            try {
                                h44Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            h44Var.H.A(h44Var);
                            break;
                        }
                        break;
                    case 1:
                        h44Var.n();
                        break;
                    default:
                        h44Var.o();
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.W = new Runnable(this) { // from class: c44
            public final /* synthetic */ h44 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                h44 h44Var = this.b;
                switch (b22) {
                    case 0:
                        h44Var.G = true;
                        if (h44Var.H != null) {
                            try {
                                h44Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            h44Var.H.A(h44Var);
                            break;
                        }
                        break;
                    case 1:
                        h44Var.n();
                        break;
                    default:
                        h44Var.o();
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

    public g44 a() {
        r39 r39Var = new r39(this, getContext(), (byte) 0);
        r39Var.r = new RectF();
        return r39Var;
    }

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        f44 f44Var;
        f44 f44Var2;
        f44 f44Var3;
        f44 f44Var4;
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
                hl.r(this.K);
                e(f7, f8);
                if (z) {
                    float a = dte.a(f, f2, f3, f4);
                    float a2 = dte.a(this.b, this.c, this.d, this.e);
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
                if ((getParent() instanceof a44) && (this.T != 0 || this.U != 0)) {
                    ((a44) getParent()).invalidate();
                }
                if (!this.x && (f44Var4 = this.H) != null) {
                    this.x = true;
                    f44Var4.C();
                }
                if (!this.y && z && (f44Var3 = this.H) != null) {
                    this.y = true;
                    f44Var3.g();
                }
                if (this.y && !z && (f44Var2 = this.H) != null) {
                    this.y = false;
                    f44Var2.f();
                }
                if (!this.n0 && !this.E && (f44Var = this.H) != null) {
                    f44Var.i(this);
                    this.E = true;
                }
                f44 f44Var5 = this.H;
                if (f44Var5 != null) {
                    f44Var5.B(uh9.x((float) getHeight(), 2.0f, scaleX, this.I.y) < ((float) hl.L(66.0f)));
                    this.H.d(c00.B((float) getHeight(), 2.0f, scaleX, this.I.y) > ((float) (((View) getParent()).getHeight() - hl.L(114.0f))));
                }
                f44 f44Var6 = this.H;
                boolean z2 = (f44Var6 == null || f44Var6.o()) && !z && dte.a(f5, f6, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - hl.L(76.0f))) < ((float) hl.L(32.0f));
                if (this.F != z2) {
                    ValueAnimator valueAnimator = this.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.q0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p0, z2 ? 0.5f : 1.0f);
                    this.q0 = ofFloat;
                    ofFloat.addUpdateListener(new d44(this, b));
                    this.q0.setInterpolator(k43.h);
                    this.q0.setDuration(280L);
                    this.q0.start();
                    this.F = z2;
                    f44 f44Var7 = this.H;
                    if (f44Var7 != null) {
                        f44Var7.j(z2);
                    }
                }
                this.a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z) {
        f44 f44Var;
        f44 f44Var2;
        if (this.x) {
            this.H.e(this.F);
            this.x = false;
        }
        this.y = false;
        if (!z && !this.G && !this.n && !this.w && !this.E && (f44Var2 = this.H) != null) {
            f44Var2.i(this);
        }
        if (this.n && (f44Var = this.H) != null) {
            f44Var.B(false);
            this.H.d(false);
        }
        hl.r(this.K);
        this.G = false;
        this.n = false;
        this.w = false;
        this.r = true;
        this.s = false;
        this.E = false;
        this.O = this.N;
        hl3 hl3Var = this.P;
        if (hl3Var != null) {
            hl.r(hl3Var);
            this.P = null;
        }
        this.a0 = this.T;
        hl.r(this.V);
        this.b0 = this.U;
        hl.r(this.W);
        if (getParent() instanceof a44) {
            ((a44) getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float a = this.a.a(getBounceScale());
        canvas.save();
        canvas.scale(a, a, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof pp9) {
                float f = this.p0;
                canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - hl.L(76.0f)) - getY();
                float f2 = this.p0;
                canvas.scale(f2, f2, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.I.y) - (r10.getMeasuredHeight() - hl.L(64.0f))) > hl.L(12.0f)) goto L34;
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
                if (Math.abs(this.I.x - (r10.getMeasuredWidth() / 2.0f)) > hl.L(12.0f) || this.I.y >= r10.getMeasuredHeight() - hl.L(112.0f)) {
                    if (Math.abs((this.I.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - hl.L(8.0f)) <= hl.L(12.0f)) {
                        i = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.I.x) - (r10.getMeasuredWidth() - hl.L(8.0f))) <= hl.L(12.0f)) {
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
                        hl.d3(this.V, 250L);
                    }
                }
                if (!this.e0) {
                    if (Math.abs(this.I.y - (r10.getMeasuredHeight() / 2.0f)) <= hl.L(12.0f)) {
                        i2 = 2;
                    } else {
                        if (Math.abs((this.I.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - hl.L(64.0f)) <= hl.L(12.0f)) {
                            i2 = 1;
                        }
                    }
                    if (this.b0 != i2) {
                        this.b0 = i2;
                        if (i2 == 0) {
                            o();
                        } else {
                            hl.d3(this.W, 250L);
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
                hl3 hl3Var = this.P;
                if (hl3Var != null) {
                    hl.r(hl3Var);
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
                duration.setInterpolator(k43.f);
                this.S.addUpdateListener(new d44(this, b));
                this.S.addListener(new e44(this, (byte) 3));
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
                        hl3 hl3Var2 = this.P;
                        if (hl3Var2 != null) {
                            hl.r(hl3Var2);
                        }
                        hl3 hl3Var3 = new hl3((Object) this, intValue, (byte) 5);
                        this.P = hl3Var3;
                        hl.d3(hl3Var3, 250L);
                    }
                }
            }
        }
        ValueAnimator valueAnimator3 = this.S;
        if (valueAnimator3 != null) {
            f = hl.Z1(0.0f, f, valueAnimator3.getAnimatedFraction());
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
                f = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + hl.L(8.0f);
            } else if (i == 2) {
                f = view.getMeasuredWidth() / 2.0f;
            } else if (i == 3) {
                f = (view.getMeasuredWidth() - hl.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f = f2;
            }
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                return hl.R1(f2, f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                f = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + hl.L(64.0f);
            } else if (i == 2) {
                f = view.getMeasuredHeight() / 2.0f;
            } else if (i == 3) {
                f = (view.getMeasuredHeight() - hl.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f = f2;
            }
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                return hl.R1(f2, f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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

    public a69 getSelectionBounds() {
        return new a69(0.0f, 0.0f, 0.0f, 0.0f);
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
        duration.setInterpolator(k43.f);
        this.c0.addUpdateListener(new d44(this, (byte) 3));
        this.c0.addListener(new e44(this, (byte) 0));
        this.c0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.d0 = duration;
        duration.setInterpolator(k43.f);
        this.d0.addUpdateListener(new d44(this, (byte) 4));
        this.d0.addListener(new e44(this, (byte) 1));
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
        if (!(this instanceof s39)) {
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
                g44 a = a();
                this.J = a;
                a.f = !this.e0;
                a.invalidate();
                frameLayout.addView(this.J);
                this.l0 = 0.0f;
            }
            this.J.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, z ? 1.0f : 0.0f);
            this.m0 = ofFloat;
            ofFloat.addUpdateListener(new d44(this, (byte) 2));
            this.m0.addListener(new e44(this, (byte) 4));
            this.m0.setDuration(280L);
            this.m0.setInterpolator(k43.h);
            this.m0.start();
        }
    }

    public final void m() {
        g44 g44Var = this.J;
        if (g44Var != null) {
            g44Var.b();
        }
    }

    public final void n() {
        hl.r(this.V);
        int i = this.T;
        int i2 = this.a0;
        if (i == i2) {
            return;
        }
        this.T = i2;
        if (getParent() instanceof a44) {
            ((a44) getParent()).invalidate();
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
        hl.r(this.W);
        int i = this.U;
        int i2 = this.b0;
        if (i == i2) {
            return;
        }
        this.U = i2;
        if (getParent() instanceof a44) {
            ((a44) getParent()).invalidate();
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
        h44 h44Var;
        boolean z2;
        if (this.H.p()) {
            f44 f44Var = this.H;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.g0;
            f44Var.u(rawX, rawY, fArr);
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
                        g44 g44Var = this.J;
                        if (g44Var != null) {
                            g44Var.f = !z;
                            g44Var.invalidate();
                        }
                    }
                    this.e0 = z;
                    float f = fArr3[0];
                    float f2 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    v41 v41Var = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                h44Var = this;
                                z2 = h44Var.c(fArr[0], fArr[1], fArr2[0], fArr2[1], z);
                            } else if (actionMasked != 3) {
                                h44Var = this;
                                z2 = false;
                            }
                            h44Var.f0 = z;
                            if (!super.onTouchEvent(motionEvent) || z2) {
                                return true;
                            }
                        }
                        h44Var = this;
                        h44Var.d(actionMasked == 3);
                        v41Var.c(false);
                        g44 g44Var2 = h44Var.J;
                        if (g44Var2 != null) {
                            g44Var2.f = true;
                            g44Var2.invalidate();
                        }
                    } else {
                        h44Var = this;
                        h44Var.f0 = false;
                        h44Var.b = fArr[0];
                        h44Var.c = fArr[1];
                        h44Var.f = f;
                        h44Var.h = f2;
                        h44Var.r = false;
                        h44Var.s = true;
                        if ((h44Var.getParent() instanceof a44) && (h44Var.T != 0 || h44Var.U != 0)) {
                            ((a44) h44Var.getParent()).invalidate();
                        }
                        v41Var.c(true);
                        c44 c44Var = h44Var.K;
                        hl.r(c44Var);
                        if (!z) {
                            hl.d3(c44Var, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z2 = true;
                    h44Var.f0 = z;
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
            v41 v41Var2 = this.a;
            if (actionMasked == 0) {
            }
            z2 = true;
            h44Var.f0 = z;
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(f44 f44Var) {
        this.H = f44Var;
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
        g44 g44Var = this.J;
        if (g44Var == null) {
            return;
        }
        g44Var.setVisibility(z ? 0 : 8);
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
