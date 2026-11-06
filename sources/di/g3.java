package di;

import android.animation.ValueAnimator;
import android.view.View;
import fi.gb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i3 i3Var = (i3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                i4 i4Var = i3Var.a;
                i4Var.e3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                if (i4Var.e3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    i4Var.Z2 = true;
                    try {
                        i4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                fi.o5 o5Var = (fi.o5) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                o5Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.F0.invalidate();
                o5Var.C0.invalidate();
                o5Var.D0.invalidate();
                int i7 = 0;
                while (i7 < o5Var.F0.getChildCount()) {
                    o5Var.F0.getChildAt(i7).setAlpha(((i7 == o5Var.I0 ? o5Var.J0 : i7 == o5Var.H0 ? 1.0f - o5Var.J0 : 0.0f) * 0.4f) + 0.6f);
                    i7++;
                }
                float interpolation = xq.f.getInterpolation(o5Var.J0);
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
                gb gbVar = (gb) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                fi.u uVar = (fi.u) this.d;
                gbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    gbVar.setDrawable(uVar);
                    break;
                }
                break;
            case 3:
                mi.k kVar = (mi.k) this.b;
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kVar.l) {
                    x1Var.h0 = (-kVar.s) * floatValue2;
                    x1Var.i0 = (-kVar.t) * floatValue2;
                    x1Var.k0 = (-kVar.u) * floatValue2;
                    x1Var.j0 = (-kVar.v) * floatValue2;
                } else {
                    x1Var.h0 = ((-kVar.s) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.i0 = ((-kVar.t) * floatValue2) - q1Var.getAnimationOffsetX();
                    x1Var.k0 = ((-kVar.u) * floatValue2) - q1Var.getTranslationY();
                    x1Var.j0 = ((-kVar.v) * floatValue2) - q1Var.getTranslationY();
                }
                q1Var.invalidate();
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                g0Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.O0.invalidate();
                g0Var.L0.invalidate();
                g0Var.M0.invalidate();
                int i10 = 0;
                while (i10 < g0Var.O0.getChildCount()) {
                    g0Var.O0.getChildAt(i10).setAlpha(((i10 == g0Var.Q0 ? g0Var.R0 : i10 == g0Var.P0 ? 1.0f - g0Var.R0 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation2 = xq.f.getInterpolation(g0Var.R0);
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
