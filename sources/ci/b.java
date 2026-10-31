package ci;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.r0;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ob0;
import th.f2;
import th.z2;
import vh.a9;
import vh.b4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n nVar = (n) this.b;
                x1 x1Var = (x1) this.c;
                q1 q1Var = (q1) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (nVar.l) {
                    x1Var.h0 = (-nVar.s) * floatValue;
                    x1Var.i0 = (-nVar.t) * floatValue;
                    x1Var.k0 = (-nVar.u) * floatValue;
                    x1Var.j0 = (-nVar.v) * floatValue;
                } else {
                    x1Var.h0 = ((-nVar.s) * floatValue) - q1Var.getAnimationOffsetX();
                    x1Var.i0 = ((-nVar.t) * floatValue) - q1Var.getAnimationOffsetX();
                    x1Var.k0 = ((-nVar.u) * floatValue) - q1Var.getTranslationY();
                    x1Var.j0 = ((-nVar.v) * floatValue) - q1Var.getTranslationY();
                }
                q1Var.invalidate();
                break;
            case 1:
                r0 r0Var = (r0) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                r0Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.O0.invalidate();
                r0Var.L0.invalidate();
                r0Var.M0.invalidate();
                int i10 = 0;
                while (i10 < r0Var.O0.getChildCount()) {
                    r0Var.O0.getChildAt(i10).setAlpha(((i10 == r0Var.Q0 ? r0Var.R0 : i10 == r0Var.P0 ? 1.0f - r0Var.R0 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = gr.f.getInterpolation(r0Var.R0);
                if (view != null && view2 != null) {
                    float f7 = 1.0f - interpolation;
                    float f10 = (f7 * 0.4f) + 0.6f;
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * i0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f11 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f11);
                    view2.setScaleY(f11);
                    view2.setTranslationY((Math.min(f7, 0.25f) * (-i0.L(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f7, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 2:
                f2 f2Var = (f2) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                z2 z2Var = f2Var.a;
                z2Var.e3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                z2Var.invalidate();
                if (z2Var.e3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    z2Var.Z2 = true;
                    try {
                        z2Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 3:
                b4 b4Var = (b4) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                b4Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.F0.invalidate();
                b4Var.C0.invalidate();
                b4Var.D0.invalidate();
                int i11 = 0;
                while (i11 < b4Var.F0.getChildCount()) {
                    b4Var.F0.getChildAt(i11).setAlpha(((i11 == b4Var.I0 ? b4Var.J0 : i11 == b4Var.H0 ? 1.0f - b4Var.J0 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = gr.f.getInterpolation(b4Var.J0);
                if (view3 != null && view4 != null) {
                    float f12 = 1.0f - interpolation2;
                    float f13 = (f12 * 0.4f) + 0.6f;
                    view3.setScaleX(f13);
                    view3.setScaleY(f13);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * i0.L(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f14 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f14);
                    view4.setScaleY(f14);
                    view4.setTranslationY((Math.min(f12, 0.25f) * (-i0.L(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f12, 0.25f) / 0.25f));
                    break;
                }
                break;
            default:
                a9 a9Var = (a9) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                ob0 ob0Var = (ob0) this.d;
                a9Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue2 - 0.5f);
                if (floatValue2 >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    a9Var.setDrawable(ob0Var);
                    break;
                }
                break;
        }
    }
}
