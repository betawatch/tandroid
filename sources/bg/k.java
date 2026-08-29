package bg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.z5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class k extends FrameLayout {
    public static final List l0 = Arrays.asList(-90, 0, 90, 180);
    public boolean A;
    public i B;
    public PointF C;
    public j D;
    public final e E;
    public final UUID F;
    public boolean G;
    public int H;
    public int I;
    public f J;
    public float K;
    public ValueAnimator L;
    public ValueAnimator M;
    public int N;
    public int O;
    public final e P;
    public final e Q;
    public int R;
    public int S;
    public ValueAnimator T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;
    public final uc a;
    public final float[] a0;
    public float b;
    public final float[] b0;
    public float c;
    public final float[] c0;
    public float d;
    public float d0;
    public float e;
    public float e0;
    public float f;
    public float f0;
    public ValueAnimator g0;
    public float h;
    public boolean h0;
    public ViewGroup i0;
    public float j0;
    public ValueAnimator k0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [bg.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bg.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bg.e] */
    public k(Context context, PointF pointF) {
        super(context);
        this.a = new uc(this);
        this.n = false;
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.A = false;
        final int i10 = 0;
        this.E = new Runnable(this) { // from class: bg.e
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        k kVar = this.b;
                        kVar.A = true;
                        if (kVar.B != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.B.b(kVar);
                            break;
                        }
                        break;
                    case 1:
                        this.b.n();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        this.G = true;
        this.H = 0;
        this.I = -1;
        this.N = 0;
        this.O = 0;
        final int i11 = 1;
        this.P = new Runnable(this) { // from class: bg.e
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        k kVar = this.b;
                        kVar.A = true;
                        if (kVar.B != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.B.b(kVar);
                            break;
                        }
                        break;
                    case 1:
                        this.b.n();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        final int i12 = 2;
        this.Q = new Runnable(this) { // from class: bg.e
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        k kVar = this.b;
                        kVar.A = true;
                        if (kVar.B != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.B.b(kVar);
                            break;
                        }
                        break;
                    case 1:
                        this.b.n();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        this.a0 = new float[2];
        this.b0 = new float[2];
        this.c0 = new float[2];
        this.d0 = 1.0f;
        this.h0 = false;
        this.j0 = 1.0f;
        this.F = UUID.randomUUID();
        this.C = pointF;
    }

    public abstract j a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f9, float f10, boolean z10, float f11, float f12) {
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            float f13 = z10 ? (f9 + f11) / 2.0f : f9;
            float f14 = z10 ? (f10 + f12) / 2.0f : f10;
            float f15 = (f13 - this.f) / scaleX;
            float f16 = (f14 - this.h) / scaleX;
            if (((float) Math.hypot(f15, f16)) > (this.n ? 6.0f : 16.0f) || z10) {
                AndroidUtilities.cancelRunOnUIThread(this.E);
                e(f15, f16);
                if (z10) {
                    float a2 = z5.a(f9, f10, f11, f12);
                    float a10 = z5.a(this.b, this.c, this.d, this.e);
                    if (a10 > 0.0f) {
                        j(a2 / a10);
                    }
                    f(this.e0 + ((float) Math.toDegrees(Math.atan2(f10 - f12, f9 - f11) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f9;
                this.c = f10;
                this.f = f13;
                this.h = f14;
                if (z10) {
                    this.d = f11;
                    this.e = f12;
                }
                int i10 = 1;
                this.n = true;
                if ((getParent() instanceof d) && (this.N != 0 || this.O != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (iVar4 = this.B) != null) {
                    this.v = true;
                    iVar4.C();
                }
                if (!this.w && z10 && (iVar3 = this.B) != null) {
                    this.w = true;
                    iVar3.k();
                }
                if (this.w && !z10 && (iVar2 = this.B) != null) {
                    this.w = false;
                    iVar2.j();
                }
                if (!this.h0 && !this.x && (iVar = this.B) != null) {
                    iVar.y(this);
                    this.x = true;
                }
                i iVar5 = this.B;
                if (iVar5 != null) {
                    iVar5.B(org.telegram.messenger.x3.A((float) getHeight(), 2.0f, scaleX, this.C.y) < ((float) AndroidUtilities.dp(66.0f)));
                    this.B.g(u3.c.c((float) getHeight(), 2.0f, scaleX, this.C.y) > ((float) (((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f))));
                }
                i iVar6 = this.B;
                boolean z11 = (iVar6 == null || iVar6.p()) && !z10 && z5.a(f13, f14, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f))) < ((float) AndroidUtilities.dp(32.0f));
                if (this.y != z11) {
                    ValueAnimator valueAnimator = this.k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.k0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j0, z11 ? 0.5f : 1.0f);
                    this.k0 = ofFloat;
                    ofFloat.addUpdateListener(new g(this, i10));
                    this.k0.setInterpolator(jr.h);
                    this.k0.setDuration(280L);
                    this.k0.start();
                    this.y = z11;
                    i iVar7 = this.B;
                    if (iVar7 != null) {
                        iVar7.m(z11);
                    }
                }
                this.a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        i iVar;
        i iVar2;
        if (this.v) {
            this.B.h(this.y);
            this.v = false;
        }
        this.w = false;
        if (!z10 && !this.A && !this.n && !this.s && !this.x && (iVar2 = this.B) != null) {
            iVar2.y(this);
        }
        if (this.n && (iVar = this.B) != null) {
            iVar.B(false);
            this.B.g(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.E);
        this.A = false;
        this.n = false;
        this.s = false;
        this.r = true;
        this.x = false;
        this.I = this.H;
        f fVar = this.J;
        if (fVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
            this.J = null;
        }
        this.R = this.N;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.S = this.O;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float a2 = this.a.a(getBounceScale());
        canvas.save();
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof f3) {
                float f9 = this.j0;
                canvas.scale(f9, f9, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f10 = this.j0;
                canvas.scale(f10, f10, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0132, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.C.y) - (r10.getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(64.0f))) <= org.telegram.messenger.AndroidUtilities.dp(12.0f)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f9, float f10) {
        int i10;
        PointF pointF = this.C;
        pointF.x += f9;
        pointF.y += f10;
        if (((View) getParent()) != null) {
            int i11 = 3;
            if (!this.V) {
                if (Math.abs(this.C.x - (r10.getMeasuredWidth() / 2.0f)) > AndroidUtilities.dp(12.0f) || this.C.y >= r10.getMeasuredHeight() - AndroidUtilities.dp(112.0f)) {
                    if (Math.abs((this.C.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - AndroidUtilities.dp(8.0f)) <= AndroidUtilities.dp(12.0f)) {
                        i10 = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.C.x) - (r10.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) <= AndroidUtilities.dp(12.0f)) {
                            i10 = 3;
                        }
                    }
                } else {
                    i10 = 2;
                }
                if (this.R != i10) {
                    this.R = i10;
                    if (i10 == 0) {
                        n();
                    } else {
                        AndroidUtilities.runOnUIThread(this.P, 250L);
                    }
                }
                if (!this.V) {
                    if (Math.abs(this.C.y - (r10.getMeasuredHeight() / 2.0f)) <= AndroidUtilities.dp(12.0f)) {
                        i11 = 2;
                    } else {
                        if (Math.abs((this.C.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - AndroidUtilities.dp(64.0f)) <= AndroidUtilities.dp(12.0f)) {
                            i11 = 1;
                        }
                    }
                    if (this.S != i11) {
                        this.S = i11;
                        if (i11 == 0) {
                            o();
                        } else {
                            AndroidUtilities.runOnUIThread(this.Q, 250L);
                        }
                    }
                }
                i11 = 0;
                if (this.S != i11) {
                }
            }
            i10 = 0;
            if (this.R != i10) {
            }
            if (!this.V) {
            }
            i11 = 0;
            if (this.S != i11) {
            }
        }
        k();
    }

    public final void f(float f9) {
        int i10 = 0;
        if (this.N != 0) {
            this.R = 0;
            n();
        }
        if (this.O != 0) {
            this.S = 0;
            o();
        }
        this.e0 = f9;
        boolean z10 = this.G;
        if (!z10 && !this.V) {
            Iterator it = l0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f9) < 4.0f) {
                    if (this.I != intValue) {
                        this.I = intValue;
                        f fVar = this.J;
                        if (fVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(fVar);
                        }
                        f fVar2 = new f(this, intValue, i10);
                        this.J = fVar2;
                        AndroidUtilities.runOnUIThread(fVar2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.H - f9) >= 12.0f || this.V) {
                this.I = -1;
                f fVar3 = this.J;
                if (fVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(fVar3);
                    this.J = null;
                }
                ValueAnimator valueAnimator = this.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.M = duration;
                duration.setInterpolator(jr.f);
                this.M.addUpdateListener(new g(this, i10));
                this.M.addListener(new h(this, 3));
                this.M.start();
                this.G = false;
            } else {
                f9 = this.L != null ? this.K : this.H;
            }
        }
        ValueAnimator valueAnimator3 = this.M;
        if (valueAnimator3 != null) {
            f9 = AndroidUtilities.lerpAngle(0.0f, f9, valueAnimator3.getAnimatedFraction());
        }
        g(f9);
    }

    public final void g(float f9) {
        setRotation(f9);
        if (this.N != 0 || this.O != 0) {
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
        return this.C;
    }

    public float getPositionX() {
        float f9;
        float f10 = this.C.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.N;
            if (i10 == 1) {
                f9 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i10 == 2) {
                f9 = view.getMeasuredWidth() / 2.0f;
            } else if (i10 == 3) {
                f9 = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f9 = f10;
            }
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, f9, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f9 != 0.0f) {
                return f9;
            }
        }
        return f10;
    }

    public float getPositionY() {
        float f9;
        float f10 = this.C.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.O;
            if (i10 == 1) {
                f9 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i10 == 2) {
                f9 = view.getMeasuredHeight() / 2.0f;
            } else if (i10 == 3) {
                f9 = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f9 = f10;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, f9, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f9 != 0.0f) {
                return f9;
            }
        }
        return f10;
    }

    public float getScale() {
        return getScaleX();
    }

    public hk0 getSelectionBounds() {
        return new hk0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.N;
    }

    public final int getStickyY() {
        return this.O;
    }

    public UUID getUUID() {
        return this.F;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.T = duration;
        duration.setInterpolator(jr.f);
        this.T.addUpdateListener(new g(this, 3));
        this.T.addListener(new h(this, 0));
        this.T.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.U = duration;
        duration.setInterpolator(jr.f);
        this.U.addUpdateListener(new g(this, 4));
        this.U.addListener(new h(this, 1));
        this.U.start();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.h0;
    }

    public final void j(float f9) {
        float f10 = this.d0;
        float f11 = f9 * f10;
        this.d0 = f11;
        float clamp = Utilities.clamp(Math.max(f11, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof e3)) {
            if ((clamp >= getMaxScale() || clamp <= getMinScale()) != (f10 >= getMaxScale() || f10 <= getMinScale())) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(clamp);
        setScaleY(clamp);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.h0 != z10) {
            this.h0 = z10;
            ValueAnimator valueAnimator = this.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.g0 = null;
            }
            if (this.D == null) {
                if (!z10 && viewGroup == null) {
                    return;
                }
                j a2 = a();
                this.D = a2;
                a2.f = !this.V;
                a2.invalidate();
                viewGroup.addView(this.D);
                this.f0 = 0.0f;
            }
            this.D.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f0, z10 ? 1.0f : 0.0f);
            this.g0 = ofFloat;
            ofFloat.addUpdateListener(new g(this, 2));
            this.g0.addListener(new h(this, 4));
            this.g0.setDuration(280L);
            this.g0.setInterpolator(jr.h);
            this.g0.start();
        }
    }

    public final void m() {
        j jVar = this.D;
        if (jVar != null) {
            jVar.b();
        }
    }

    public final void n() {
        AndroidUtilities.cancelRunOnUIThread(this.P);
        int i10 = this.N;
        int i11 = this.R;
        if (i10 == i11) {
            return;
        }
        this.N = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.R == 0) {
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
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        int i10 = this.O;
        int i11 = this.S;
        if (i10 == i11) {
            return;
        }
        this.O = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.S == 0) {
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
        return this.B.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked;
        k kVar;
        boolean z11;
        if (this.B.r()) {
            i iVar = this.B;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.a0;
            iVar.v(rawX, rawY, fArr);
            boolean z12 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.b0;
            if (z12) {
                if (Build.VERSION.SDK_INT < 29) {
                    z10 = false;
                    float[] fArr3 = this.c0;
                    if (z10) {
                        fArr3[0] = fArr[0];
                        fArr3[1] = fArr[1];
                    } else {
                        fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                        fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    }
                    if (this.V != z10) {
                        this.b = fArr[0];
                        this.c = fArr[1];
                        this.d = fArr2[0];
                        this.e = fArr2[1];
                        this.f = fArr3[0];
                        this.h = fArr3[1];
                        j jVar = this.D;
                        if (jVar != null) {
                            jVar.f = !z10;
                            jVar.invalidate();
                        }
                    }
                    this.V = z10;
                    float f9 = fArr3[0];
                    float f10 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    uc ucVar = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                kVar = this;
                                z11 = kVar.c(fArr[0], fArr[1], z10, fArr2[0], fArr2[1]);
                            } else if (actionMasked != 3) {
                                z11 = false;
                                kVar = this;
                            }
                            kVar.W = z10;
                            if (!super.onTouchEvent(motionEvent) || z11) {
                                return true;
                            }
                        }
                        kVar = this;
                        d(actionMasked == 3);
                        ucVar.c(false);
                        j jVar2 = kVar.D;
                        if (jVar2 != null) {
                            jVar2.f = true;
                            jVar2.invalidate();
                        }
                    } else {
                        kVar = this;
                        kVar.W = false;
                        kVar.b = fArr[0];
                        kVar.c = fArr[1];
                        kVar.f = f9;
                        kVar.h = f10;
                        kVar.r = false;
                        if ((getParent() instanceof d) && (kVar.N != 0 || kVar.O != 0)) {
                            ((d) getParent()).invalidate();
                        }
                        ucVar.c(true);
                        e eVar = kVar.E;
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        if (!z10) {
                            AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z11 = true;
                    kVar.W = z10;
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                    return true;
                }
                this.B.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            }
            z10 = z12;
            float[] fArr32 = this.c0;
            if (z10) {
            }
            if (this.V != z10) {
            }
            this.V = z10;
            float f92 = fArr32[0];
            float f102 = fArr32[1];
            actionMasked = motionEvent.getActionMasked();
            uc ucVar2 = this.a;
            if (actionMasked == 0) {
            }
            z11 = true;
            kVar.W = z10;
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(i iVar) {
        this.B = iVar;
    }

    public void setPosition(PointF pointF) {
        this.C = pointF;
        k();
    }

    public void setScale(float f9) {
        this.d0 = f9;
        setScaleX(f9);
        setScaleY(f9);
    }

    public void setSelectionVisibility(boolean z10) {
        j jVar = this.D;
        if (jVar == null) {
            return;
        }
        jVar.setVisibility(z10 ? 0 : 8);
    }

    public void setStickyX(int i10) {
        this.R = i10;
        this.N = i10;
    }

    public void setStickyY(int i10) {
        this.S = i10;
        this.O = i10;
    }

    public void setIsVideo(boolean z10) {
    }
}
