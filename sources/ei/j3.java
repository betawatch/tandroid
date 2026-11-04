package ei;

import android.animation.ValueAnimator;
import android.view.View;
import gi.gb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j3(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l3 l3Var = (l3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                j4 j4Var = l3Var.a;
                j4Var.f3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                j4Var.invalidate();
                if (j4Var.f3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    j4Var.a3 = true;
                    try {
                        j4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                gi.m5 m5Var = (gi.m5) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                m5Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.G0.invalidate();
                m5Var.D0.invalidate();
                m5Var.E0.invalidate();
                int i3 = 0;
                while (i3 < m5Var.G0.getChildCount()) {
                    m5Var.G0.getChildAt(i3).setAlpha(((i3 == m5Var.J0 ? m5Var.K0 : i3 == m5Var.I0 ? 1.0f - m5Var.K0 : 0.0f) * 0.4f) + 0.6f);
                    i3++;
                }
                float interpolation = xq.f.getInterpolation(m5Var.K0);
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
                gi.u uVar = (gi.u) this.d;
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
                ni.k kVar = (ni.k) this.b;
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
                ug.f0 f0Var = (ug.f0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                f0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.P0.invalidate();
                f0Var.M0.invalidate();
                f0Var.N0.invalidate();
                int i10 = 0;
                while (i10 < f0Var.P0.getChildCount()) {
                    f0Var.P0.getChildAt(i10).setAlpha(((i10 == f0Var.R0 ? f0Var.S0 : i10 == f0Var.Q0 ? 1.0f - f0Var.S0 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation2 = xq.f.getInterpolation(f0Var.S0);
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
