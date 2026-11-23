package fi;

import android.animation.ValueAnimator;
import android.view.View;
import hi.yb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                z3 z3Var = b3Var.a;
                z3Var.f3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                z3Var.invalidate();
                if (z3Var.f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    z3Var.a3 = true;
                    try {
                        z3Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                hi.v5 v5Var = (hi.v5) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                v5Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.G0.invalidate();
                v5Var.D0.invalidate();
                v5Var.E0.invalidate();
                int i7 = 0;
                while (i7 < v5Var.G0.getChildCount()) {
                    v5Var.G0.getChildAt(i7).setAlpha(((i7 == v5Var.J0 ? v5Var.K0 : i7 == v5Var.I0 ? 1.0f - v5Var.K0 : 0.0f) * 0.4f) + 0.6f);
                    i7++;
                }
                float interpolation = kr.f.getInterpolation(v5Var.K0);
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
                yb ybVar = (yb) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                hi.d0 d0Var = (hi.d0) this.d;
                ybVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    ybVar.setDrawable(d0Var);
                    break;
                }
                break;
            case 3:
                pi.j jVar = (pi.j) this.b;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.c;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jVar.l) {
                    y1Var.h0 = (-jVar.s) * floatValue2;
                    y1Var.i0 = (-jVar.t) * floatValue2;
                    y1Var.k0 = (-jVar.u) * floatValue2;
                    y1Var.j0 = (-jVar.v) * floatValue2;
                } else {
                    y1Var.h0 = ((-jVar.s) * floatValue2) - r1Var.getAnimationOffsetX();
                    y1Var.i0 = ((-jVar.t) * floatValue2) - r1Var.getAnimationOffsetX();
                    y1Var.k0 = ((-jVar.u) * floatValue2) - r1Var.getTranslationY();
                    y1Var.j0 = ((-jVar.v) * floatValue2) - r1Var.getTranslationY();
                }
                r1Var.invalidate();
                break;
            default:
                tg.l0 l0Var = (tg.l0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                l0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.P0.invalidate();
                l0Var.M0.invalidate();
                l0Var.N0.invalidate();
                int i10 = 0;
                while (i10 < l0Var.P0.getChildCount()) {
                    l0Var.P0.getChildAt(i10).setAlpha(((i10 == l0Var.R0 ? l0Var.S0 : i10 == l0Var.Q0 ? 1.0f - l0Var.S0 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation2 = kr.f.getInterpolation(l0Var.S0);
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
