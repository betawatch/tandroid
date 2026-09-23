package ai;

import android.animation.ValueAnimator;
import android.view.View;
import ci.xc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z4 z4Var = (z4) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                e6 e6Var = z4Var.a;
                e6Var.v3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                e6Var.invalidate();
                if (e6Var.v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    e6Var.q3 = true;
                    try {
                        e6Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                ci.q6 q6Var = (ci.q6) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                q6Var.a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.W0.invalidate();
                q6Var.T0.invalidate();
                q6Var.U0.invalidate();
                int i10 = 0;
                while (i10 < q6Var.W0.getChildCount()) {
                    q6Var.W0.getChildAt(i10).setAlpha(((i10 == q6Var.Z0 ? q6Var.a1 : i10 == q6Var.Y0 ? 1.0f - q6Var.a1 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = rr.f.getInterpolation(q6Var.a1);
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
                xc xcVar = (xc) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                ci.u uVar = (ci.u) this.d;
                xcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    xcVar.setDrawable(uVar);
                    break;
                }
                break;
            case 3:
                ji.m mVar = (ji.m) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.l) {
                    s1Var.g0 = (-mVar.s) * floatValue2;
                    s1Var.h0 = (-mVar.t) * floatValue2;
                    s1Var.j0 = (-mVar.u) * floatValue2;
                    s1Var.i0 = (-mVar.v) * floatValue2;
                } else {
                    s1Var.g0 = ((-mVar.s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.h0 = ((-mVar.t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.j0 = ((-mVar.u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.i0 = ((-mVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                break;
            default:
                qg.p0 p0Var = (qg.p0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                p0Var.i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.f1.invalidate();
                p0Var.c1.invalidate();
                p0Var.d1.invalidate();
                int i11 = 0;
                while (i11 < p0Var.f1.getChildCount()) {
                    p0Var.f1.getChildAt(i11).setAlpha(((i11 == p0Var.h1 ? p0Var.i1 : i11 == p0Var.g1 ? 1.0f - p0Var.i1 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = rr.f.getInterpolation(p0Var.i1);
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
