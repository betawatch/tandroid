package eg;

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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k7.o6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class j extends FrameLayout {
    public static final List m0 = Arrays.asList(-90, 0, 90, 180);
    public boolean B;
    public h C;
    public PointF D;
    public i E;
    public final e F;
    public final UUID G;
    public boolean H;
    public int I;
    public int J;
    public af.b K;
    public float L;
    public ValueAnimator M;
    public ValueAnimator N;
    public int O;
    public int P;
    public final e Q;
    public final e R;
    public int S;
    public int T;
    public ValueAnimator U;
    public ValueAnimator V;
    public boolean W;
    public final rc a;
    public boolean a0;
    public float b;
    public final float[] b0;
    public float c;
    public final float[] c0;
    public float d;
    public final float[] d0;
    public float e;
    public float e0;
    public float f;
    public float f0;
    public float g0;
    public float h;
    public ValueAnimator h0;
    public boolean i0;
    public ViewGroup j0;
    public float k0;
    public ValueAnimator l0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [eg.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [eg.e] */
    public j(Context context, PointF pointF) {
        super(context);
        this.a = new rc(this);
        this.n = false;
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.B = false;
        final int i10 = 0;
        this.F = new Runnable(this) { // from class: eg.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        j jVar = this.b;
                        jVar.B = true;
                        if (jVar.C != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.C.t(jVar);
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
        this.H = true;
        this.I = 0;
        this.J = -1;
        this.O = 0;
        this.P = 0;
        final int i11 = 1;
        this.Q = new Runnable(this) { // from class: eg.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j jVar = this.b;
                        jVar.B = true;
                        if (jVar.C != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.C.t(jVar);
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
        this.R = new Runnable(this) { // from class: eg.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        j jVar = this.b;
                        jVar.B = true;
                        if (jVar.C != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.C.t(jVar);
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
        this.b0 = new float[2];
        this.c0 = new float[2];
        this.d0 = new float[2];
        this.e0 = 1.0f;
        this.i0 = false;
        this.k0 = 1.0f;
        this.G = UUID.randomUUID();
        this.D = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, boolean z4, float f12, float f13) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            float f14 = z4 ? (f10 + f12) / 2.0f : f10;
            float f15 = z4 ? (f11 + f13) / 2.0f : f11;
            float f16 = (f14 - this.f) / scaleX;
            float f17 = (f15 - this.h) / scaleX;
            if (((float) Math.hypot(f16, f17)) > (this.n ? 6.0f : 16.0f) || z4) {
                AndroidUtilities.cancelRunOnUIThread(this.F);
                e(f16, f17);
                if (z4) {
                    float a2 = o6.a(f10, f11, f12, f13);
                    float a10 = o6.a(this.b, this.c, this.d, this.e);
                    if (a10 > 0.0f) {
                        j(a2 / a10);
                    }
                    f(this.f0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f10;
                this.c = f11;
                this.f = f14;
                this.h = f15;
                if (z4) {
                    this.d = f12;
                    this.e = f13;
                }
                int i10 = 1;
                this.n = true;
                if ((getParent() instanceof d) && (this.O != 0 || this.P != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (hVar4 = this.C) != null) {
                    this.v = true;
                    hVar4.C();
                }
                if (!this.w && z4 && (hVar3 = this.C) != null) {
                    this.w = true;
                    hVar3.l();
                }
                if (this.w && !z4 && (hVar2 = this.C) != null) {
                    this.w = false;
                    hVar2.k();
                }
                if (!this.i0 && !this.x && (hVar = this.C) != null) {
                    hVar.x(this);
                    this.x = true;
                }
                h hVar5 = this.C;
                if (hVar5 != null) {
                    hVar5.B(org.telegram.messenger.y3.A((float) getHeight(), 2.0f, scaleX, this.D.y) < ((float) AndroidUtilities.dp(66.0f)));
                    this.C.h(w.c.c((float) getHeight(), 2.0f, scaleX, this.D.y) > ((float) (((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f))));
                }
                h hVar6 = this.C;
                boolean z10 = (hVar6 == null || hVar6.q()) && !z4 && o6.a(f14, f15, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f))) < ((float) AndroidUtilities.dp(32.0f));
                if (this.y != z10) {
                    ValueAnimator valueAnimator = this.l0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.l0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k0, z10 ? 0.5f : 1.0f);
                    this.l0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, i10));
                    this.l0.setInterpolator(pr.h);
                    this.l0.setDuration(280L);
                    this.l0.start();
                    this.y = z10;
                    h hVar7 = this.C;
                    if (hVar7 != null) {
                        hVar7.n(z10);
                    }
                }
                this.a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z4) {
        h hVar;
        h hVar2;
        if (this.v) {
            this.C.i(this.y);
            this.v = false;
        }
        this.w = false;
        if (!z4 && !this.B && !this.n && !this.s && !this.x && (hVar2 = this.C) != null) {
            hVar2.x(this);
        }
        if (this.n && (hVar = this.C) != null) {
            hVar.B(false);
            this.C.h(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.F);
        this.B = false;
        this.n = false;
        this.s = false;
        this.r = true;
        this.x = false;
        this.J = this.I;
        af.b bVar = this.K;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.K = null;
        }
        this.S = this.O;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        this.T = this.P;
        AndroidUtilities.cancelRunOnUIThread(this.R);
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
            if (this instanceof z2) {
                float f10 = this.k0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f11 = this.k0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0132, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.D.y) - (r10.getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(64.0f))) <= org.telegram.messenger.AndroidUtilities.dp(12.0f)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11) {
        int i10;
        PointF pointF = this.D;
        pointF.x += f10;
        pointF.y += f11;
        if (((View) getParent()) != null) {
            int i11 = 3;
            if (!this.W) {
                if (Math.abs(this.D.x - (r10.getMeasuredWidth() / 2.0f)) > AndroidUtilities.dp(12.0f) || this.D.y >= r10.getMeasuredHeight() - AndroidUtilities.dp(112.0f)) {
                    if (Math.abs((this.D.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - AndroidUtilities.dp(8.0f)) <= AndroidUtilities.dp(12.0f)) {
                        i10 = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.D.x) - (r10.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) <= AndroidUtilities.dp(12.0f)) {
                            i10 = 3;
                        }
                    }
                } else {
                    i10 = 2;
                }
                if (this.S != i10) {
                    this.S = i10;
                    if (i10 == 0) {
                        n();
                    } else {
                        AndroidUtilities.runOnUIThread(this.Q, 250L);
                    }
                }
                if (!this.W) {
                    if (Math.abs(this.D.y - (r10.getMeasuredHeight() / 2.0f)) <= AndroidUtilities.dp(12.0f)) {
                        i11 = 2;
                    } else {
                        if (Math.abs((this.D.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - AndroidUtilities.dp(64.0f)) <= AndroidUtilities.dp(12.0f)) {
                            i11 = 1;
                        }
                    }
                    if (this.T != i11) {
                        this.T = i11;
                        if (i11 == 0) {
                            o();
                        } else {
                            AndroidUtilities.runOnUIThread(this.R, 250L);
                        }
                    }
                }
                i11 = 0;
                if (this.T != i11) {
                }
            }
            i10 = 0;
            if (this.S != i10) {
            }
            if (!this.W) {
            }
            i11 = 0;
            if (this.T != i11) {
            }
        }
        k();
    }

    public final void f(float f10) {
        int i10 = 0;
        if (this.O != 0) {
            this.S = 0;
            n();
        }
        if (this.P != 0) {
            this.T = 0;
            o();
        }
        this.f0 = f10;
        boolean z4 = this.H;
        int i11 = 2;
        if (!z4 && !this.W) {
            Iterator it = m0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.J != intValue) {
                        this.J = intValue;
                        af.b bVar = this.K;
                        if (bVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(bVar);
                        }
                        af.b bVar2 = new af.b(this, intValue, i11);
                        this.K = bVar2;
                        AndroidUtilities.runOnUIThread(bVar2, 250L);
                    }
                }
            }
        } else if (z4) {
            if (Math.abs(this.I - f10) >= 12.0f || this.W) {
                this.J = -1;
                af.b bVar3 = this.K;
                if (bVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bVar3);
                    this.K = null;
                }
                ValueAnimator valueAnimator = this.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.N;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.N = duration;
                duration.setInterpolator(pr.f);
                this.N.addUpdateListener(new f(this, i10));
                this.N.addListener(new g(this, 3));
                this.N.start();
                this.H = false;
            } else {
                f10 = this.M != null ? this.L : this.I;
            }
        }
        ValueAnimator valueAnimator3 = this.N;
        if (valueAnimator3 != null) {
            f10 = AndroidUtilities.lerpAngle(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.O != 0 || this.P != 0) {
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
        return this.D;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.D.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.O;
            if (i10 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i10 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i10 == 3) {
                f10 = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getPositionY() {
        float f10;
        float f11 = this.D.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.P;
            if (i10 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i10 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i10 == 3) {
                f10 = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getScale() {
        return getScaleX();
    }

    public tk0 getSelectionBounds() {
        return new tk0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.O;
    }

    public final int getStickyY() {
        return this.P;
    }

    public UUID getUUID() {
        return this.G;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.U = duration;
        duration.setInterpolator(pr.f);
        this.U.addUpdateListener(new f(this, 3));
        this.U.addListener(new g(this, 0));
        this.U.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.V = duration;
        duration.setInterpolator(pr.f);
        this.V.addUpdateListener(new f(this, 4));
        this.V.addListener(new g(this, 1));
        this.V.start();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.i0;
    }

    public final void j(float f10) {
        float f11 = this.e0;
        float f12 = f10 * f11;
        this.e0 = f12;
        float clamp = Utilities.clamp(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof y2)) {
            if ((clamp >= getMaxScale() || clamp <= getMinScale()) != (f11 >= getMaxScale() || f11 <= getMinScale())) {
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

    public final void l(ViewGroup viewGroup, boolean z4) {
        if (this.i0 != z4) {
            this.i0 = z4;
            ValueAnimator valueAnimator = this.h0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h0 = null;
            }
            if (this.E == null) {
                if (!z4 && viewGroup == null) {
                    return;
                }
                i a2 = a();
                this.E = a2;
                a2.f = !this.W;
                a2.invalidate();
                viewGroup.addView(this.E);
                this.g0 = 0.0f;
            }
            this.E.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g0, z4 ? 1.0f : 0.0f);
            this.h0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.h0.addListener(new g(this, 4));
            this.h0.setDuration(280L);
            this.h0.setInterpolator(pr.h);
            this.h0.start();
        }
    }

    public final void m() {
        i iVar = this.E;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
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
        AndroidUtilities.cancelRunOnUIThread(this.R);
        int i10 = this.P;
        int i11 = this.T;
        if (i10 == i11) {
            return;
        }
        this.P = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.T == 0) {
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
        return this.C.r();
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
        boolean z4;
        int actionMasked;
        j jVar;
        boolean z10;
        if (this.C.r()) {
            h hVar = this.C;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.b0;
            hVar.v(rawX, rawY, fArr);
            boolean z11 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.c0;
            if (z11) {
                if (Build.VERSION.SDK_INT < 29) {
                    z4 = false;
                    float[] fArr3 = this.d0;
                    if (z4) {
                        fArr3[0] = fArr[0];
                        fArr3[1] = fArr[1];
                    } else {
                        fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                        fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    }
                    if (this.W != z4) {
                        this.b = fArr[0];
                        this.c = fArr[1];
                        this.d = fArr2[0];
                        this.e = fArr2[1];
                        this.f = fArr3[0];
                        this.h = fArr3[1];
                        i iVar = this.E;
                        if (iVar != null) {
                            iVar.f = !z4;
                            iVar.invalidate();
                        }
                    }
                    this.W = z4;
                    float f10 = fArr3[0];
                    float f11 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    rc rcVar = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                jVar = this;
                                z10 = jVar.c(fArr[0], fArr[1], z4, fArr2[0], fArr2[1]);
                            } else if (actionMasked != 3) {
                                z10 = false;
                                jVar = this;
                            }
                            jVar.a0 = z4;
                            if (!super.onTouchEvent(motionEvent) || z10) {
                                return true;
                            }
                        }
                        jVar = this;
                        d(actionMasked == 3);
                        rcVar.c(false);
                        i iVar2 = jVar.E;
                        if (iVar2 != null) {
                            iVar2.f = true;
                            iVar2.invalidate();
                        }
                    } else {
                        jVar = this;
                        jVar.a0 = false;
                        jVar.b = fArr[0];
                        jVar.c = fArr[1];
                        jVar.f = f10;
                        jVar.h = f11;
                        jVar.r = false;
                        if ((getParent() instanceof d) && (jVar.O != 0 || jVar.P != 0)) {
                            ((d) getParent()).invalidate();
                        }
                        rcVar.c(true);
                        e eVar = jVar.F;
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        if (!z4) {
                            AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z10 = true;
                    jVar.a0 = z4;
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                    return true;
                }
                this.C.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            }
            z4 = z11;
            float[] fArr32 = this.d0;
            if (z4) {
            }
            if (this.W != z4) {
            }
            this.W = z4;
            float f102 = fArr32[0];
            float f112 = fArr32[1];
            actionMasked = motionEvent.getActionMasked();
            rc rcVar2 = this.a;
            if (actionMasked == 0) {
            }
            z10 = true;
            jVar.a0 = z4;
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(h hVar) {
        this.C = hVar;
    }

    public void setPosition(PointF pointF) {
        this.D = pointF;
        k();
    }

    public void setScale(float f10) {
        this.e0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z4) {
        i iVar = this.E;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(z4 ? 0 : 8);
    }

    public void setStickyX(int i10) {
        this.S = i10;
        this.O = i10;
    }

    public void setStickyY(int i10) {
        this.T = i10;
        this.P = i10;
    }

    public void setIsVideo(boolean z4) {
    }
}
