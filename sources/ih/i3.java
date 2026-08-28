package ih;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.hc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i3(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                i4 i4Var = k3Var.a;
                i4Var.r3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                if (i4Var.r3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    i4Var.m3 = true;
                    try {
                        i4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                kh.g6 g6Var = (kh.g6) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                g6Var.W0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.S0.invalidate();
                g6Var.P0.invalidate();
                g6Var.Q0.invalidate();
                int i9 = 0;
                while (i9 < g6Var.S0.getChildCount()) {
                    g6Var.S0.getChildAt(i9).setAlpha(((i9 == g6Var.V0 ? g6Var.W0 : i9 == g6Var.U0 ? 1.0f - g6Var.W0 : 0.0f) * 0.4f) + 0.6f);
                    i9++;
                }
                float interpolation = gr.f.getInterpolation(g6Var.W0);
                if (view != null && view2 != null) {
                    float f10 = 1.0f - interpolation;
                    float f11 = (f10 * 0.4f) + 0.6f;
                    view.setScaleX(f11);
                    view.setScaleY(f11);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f12 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f12);
                    view2.setScaleY(f12);
                    view2.setTranslationY((Math.min(f10, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f10, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 2:
                hc hcVar = (hc) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                kh.v vVar = (kh.v) this.d;
                hcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    hcVar.setDrawable(vVar);
                    break;
                }
                break;
            case 3:
                rh.l lVar = (rh.l) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.l) {
                    s1Var.g0 = (-lVar.s) * floatValue2;
                    s1Var.h0 = (-lVar.t) * floatValue2;
                    s1Var.j0 = (-lVar.u) * floatValue2;
                    s1Var.i0 = (-lVar.v) * floatValue2;
                } else {
                    s1Var.g0 = ((-lVar.s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.h0 = ((-lVar.t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.j0 = ((-lVar.u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.i0 = ((-lVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                break;
            default:
                yf.l0 l0Var = (yf.l0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                l0Var.e1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.b1.invalidate();
                l0Var.Y0.invalidate();
                l0Var.Z0.invalidate();
                int i10 = 0;
                while (i10 < l0Var.b1.getChildCount()) {
                    l0Var.b1.getChildAt(i10).setAlpha(((i10 == l0Var.d1 ? l0Var.e1 : i10 == l0Var.c1 ? 1.0f - l0Var.e1 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation2 = gr.f.getInterpolation(l0Var.e1);
                if (view3 != null && view4 != null) {
                    float f13 = 1.0f - interpolation2;
                    float f14 = (f13 * 0.4f) + 0.6f;
                    view3.setScaleX(f14);
                    view3.setScaleY(f14);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f15 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f15);
                    view4.setScaleY(f15);
                    view4.setTranslationY((Math.min(f13, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f13, 0.25f) / 0.25f));
                    break;
                }
                break;
        }
    }
}
