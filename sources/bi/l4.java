package bi;

import android.animation.ValueAnimator;
import android.view.View;
import di.vc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l4(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                q5 q5Var = n4Var.a;
                q5Var.v3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                if (q5Var.v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    q5Var.q3 = true;
                    try {
                        q5Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                di.o6 o6Var = (di.o6) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                o6Var.a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.W0.invalidate();
                o6Var.T0.invalidate();
                o6Var.U0.invalidate();
                int i10 = 0;
                while (i10 < o6Var.W0.getChildCount()) {
                    o6Var.W0.getChildAt(i10).setAlpha(((i10 == o6Var.Z0 ? o6Var.a1 : i10 == o6Var.Y0 ? 1.0f - o6Var.a1 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = es.f.getInterpolation(o6Var.a1);
                if (view != null && view2 != null) {
                    float f7 = 1.0f - interpolation;
                    float f10 = (f7 * 0.4f) + 0.6f;
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f11 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f11);
                    view2.setScaleY(f11);
                    view2.setTranslationY((Math.min(f7, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f7, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 2:
                vc vcVar = (vc) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                di.u uVar = (di.u) this.d;
                vcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    vcVar.setDrawable(uVar);
                    break;
                }
                break;
            case 3:
                ki.m mVar = (ki.m) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.l) {
                    t1Var.g0 = (-mVar.s) * floatValue2;
                    t1Var.h0 = (-mVar.t) * floatValue2;
                    t1Var.j0 = (-mVar.u) * floatValue2;
                    t1Var.i0 = (-mVar.v) * floatValue2;
                } else {
                    t1Var.g0 = ((-mVar.s) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.h0 = ((-mVar.t) * floatValue2) - u1Var.getAnimationOffsetX();
                    t1Var.j0 = ((-mVar.u) * floatValue2) - u1Var.getTranslationY();
                    t1Var.i0 = ((-mVar.v) * floatValue2) - u1Var.getTranslationY();
                }
                u1Var.invalidate();
                break;
            default:
                rg.o0 o0Var = (rg.o0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                o0Var.i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.f1.invalidate();
                o0Var.c1.invalidate();
                o0Var.d1.invalidate();
                int i11 = 0;
                while (i11 < o0Var.f1.getChildCount()) {
                    o0Var.f1.getChildAt(i11).setAlpha(((i11 == o0Var.h1 ? o0Var.i1 : i11 == o0Var.g1 ? 1.0f - o0Var.i1 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = es.f.getInterpolation(o0Var.i1);
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
        }
    }
}
