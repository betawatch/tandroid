package bg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.rb;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                g1Var.e1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.b1.invalidate();
                g1Var.Y0.invalidate();
                g1Var.Z0.invalidate();
                int i10 = 0;
                while (i10 < g1Var.b1.getChildCount()) {
                    g1Var.b1.getChildAt(i10).setAlpha(((i10 == g1Var.d1 ? g1Var.e1 : i10 == g1Var.c1 ? 1.0f - g1Var.e1 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = jr.f.getInterpolation(g1Var.e1);
                if (view != null && view2 != null) {
                    float f9 = 1.0f - interpolation;
                    float f10 = (f9 * 0.4f) + 0.6f;
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f11 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f11);
                    view2.setScaleY(f11);
                    view2.setTranslationY((Math.min(f9, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f9, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 1:
                lh.g3 g3Var = (lh.g3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                lh.d4 d4Var = g3Var.a;
                d4Var.r3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                d4Var.invalidate();
                if (d4Var.r3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    d4Var.m3 = true;
                    try {
                        d4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                t5 t5Var = (t5) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                t5Var.W0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.S0.invalidate();
                t5Var.P0.invalidate();
                t5Var.Q0.invalidate();
                int i11 = 0;
                while (i11 < t5Var.S0.getChildCount()) {
                    t5Var.S0.getChildAt(i11).setAlpha(((i11 == t5Var.V0 ? t5Var.W0 : i11 == t5Var.U0 ? 1.0f - t5Var.W0 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = jr.f.getInterpolation(t5Var.W0);
                if (view3 != null && view4 != null) {
                    float f12 = 1.0f - interpolation2;
                    float f13 = (f12 * 0.4f) + 0.6f;
                    view3.setScaleX(f13);
                    view3.setScaleY(f13);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f14 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f14);
                    view4.setScaleY(f14);
                    view4.setTranslationY((Math.min(f12, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f12, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 3:
                rb rbVar = (rb) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                nh.u uVar = (nh.u) this.d;
                rbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    rbVar.setDrawable(uVar);
                    break;
                }
                break;
            default:
                uh.l lVar = (uh.l) this.b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.c;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.l) {
                    r1Var.g0 = (-lVar.s) * floatValue2;
                    r1Var.h0 = (-lVar.t) * floatValue2;
                    r1Var.j0 = (-lVar.u) * floatValue2;
                    r1Var.i0 = (-lVar.v) * floatValue2;
                } else {
                    r1Var.g0 = ((-lVar.s) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.h0 = ((-lVar.t) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.j0 = ((-lVar.u) * floatValue2) - s1Var.getTranslationY();
                    r1Var.i0 = ((-lVar.v) * floatValue2) - s1Var.getTranslationY();
                }
                s1Var.invalidate();
                break;
        }
    }
}
