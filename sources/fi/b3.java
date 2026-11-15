package fi;

import android.animation.ValueAnimator;
import android.view.View;
import hi.db;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b3(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d3 d3Var = (d3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                b4 b4Var = d3Var.a;
                b4Var.f3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                if (b4Var.f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    b4Var.a3 = true;
                    try {
                        b4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                hi.m5 m5Var = (hi.m5) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                m5Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.G0.invalidate();
                m5Var.D0.invalidate();
                m5Var.E0.invalidate();
                int i7 = 0;
                while (i7 < m5Var.G0.getChildCount()) {
                    m5Var.G0.getChildAt(i7).setAlpha(((i7 == m5Var.J0 ? m5Var.K0 : i7 == m5Var.I0 ? 1.0f - m5Var.K0 : 0.0f) * 0.4f) + 0.6f);
                    i7++;
                }
                float interpolation = er.f.getInterpolation(m5Var.K0);
                if (view != null && view2 != null) {
                    float f10 = 1.0f - interpolation;
                    float f11 = (f10 * 0.4f) + 0.6f;
                    view.setScaleX(f11);
                    view.setScaleY(f11);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f12 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f12);
                    view2.setScaleY(f12);
                    view2.setTranslationY((Math.min(f10, 0.25f) * (-org.telegram.messenger.g0.L(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f10, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 2:
                db dbVar = (db) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                hi.u uVar = (hi.u) this.d;
                dbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    dbVar.setDrawable(uVar);
                    break;
                }
                break;
            case 3:
                pi.j jVar = (pi.j) this.b;
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jVar.l) {
                    x1Var.h0 = (-jVar.s) * floatValue2;
                    x1Var.i0 = (-jVar.t) * floatValue2;
                    x1Var.k0 = (-jVar.u) * floatValue2;
                    x1Var.j0 = (-jVar.v) * floatValue2;
                } else {
                    x1Var.h0 = ((-jVar.s) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.i0 = ((-jVar.t) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.k0 = ((-jVar.u) * floatValue2) - q1Var.getTranslationY();
                    x1Var.j0 = ((-jVar.v) * floatValue2) - q1Var.getTranslationY();
                }
                q1Var.invalidate();
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                g0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.P0.invalidate();
                g0Var.M0.invalidate();
                g0Var.N0.invalidate();
                int i10 = 0;
                while (i10 < g0Var.P0.getChildCount()) {
                    g0Var.P0.getChildAt(i10).setAlpha(((i10 == g0Var.R0 ? g0Var.S0 : i10 == g0Var.Q0 ? 1.0f - g0Var.S0 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation2 = er.f.getInterpolation(g0Var.S0);
                if (view3 != null && view4 != null) {
                    float f13 = 1.0f - interpolation2;
                    float f14 = (f13 * 0.4f) + 0.6f;
                    view3.setScaleX(f14);
                    view3.setScaleY(f14);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f15 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f15);
                    view4.setScaleY(f15);
                    view4.setTranslationY((Math.min(f13, 0.25f) * (-org.telegram.messenger.g0.L(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f13, 0.25f) / 0.25f));
                    break;
                }
                break;
        }
    }
}
