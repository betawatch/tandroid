package dg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mr;
import ph.c5;
import ph.pa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                e1Var.f1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.c1.invalidate();
                e1Var.Z0.invalidate();
                e1Var.a1.invalidate();
                int i10 = 0;
                while (i10 < e1Var.c1.getChildCount()) {
                    e1Var.c1.getChildAt(i10).setAlpha(((i10 == e1Var.e1 ? e1Var.f1 : i10 == e1Var.d1 ? 1.0f - e1Var.f1 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = mr.f.getInterpolation(e1Var.f1);
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
            case 1:
                nh.h3 h3Var = (nh.h3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                d4 d4Var = h3Var.a;
                d4Var.s3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                d4Var.invalidate();
                if (d4Var.s3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    d4Var.n3 = true;
                    try {
                        d4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                c5 c5Var = (c5) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                c5Var.X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.T0.invalidate();
                c5Var.Q0.invalidate();
                c5Var.R0.invalidate();
                int i11 = 0;
                while (i11 < c5Var.T0.getChildCount()) {
                    c5Var.T0.getChildAt(i11).setAlpha(((i11 == c5Var.W0 ? c5Var.X0 : i11 == c5Var.V0 ? 1.0f - c5Var.X0 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = mr.f.getInterpolation(c5Var.X0);
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
            case 3:
                pa paVar = (pa) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                kc0 kc0Var = (kc0) this.d;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    paVar.setDrawable(kc0Var);
                    break;
                }
                break;
            default:
                wh.m mVar = (wh.m) this.b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.c;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.l) {
                    r1Var.g0 = (-mVar.s) * floatValue2;
                    r1Var.h0 = (-mVar.t) * floatValue2;
                    r1Var.j0 = (-mVar.u) * floatValue2;
                    r1Var.i0 = (-mVar.v) * floatValue2;
                } else {
                    r1Var.g0 = ((-mVar.s) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.h0 = ((-mVar.t) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.j0 = ((-mVar.u) * floatValue2) - s1Var.getTranslationY();
                    r1Var.i0 = ((-mVar.v) * floatValue2) - s1Var.getTranslationY();
                }
                s1Var.invalidate();
                break;
        }
    }
}
