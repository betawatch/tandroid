package ai;

import android.animation.ValueAnimator;
import android.view.View;
import ci.ad;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                f6 f6Var = z4Var.a;
                f6Var.v3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                f6Var.invalidate();
                if (f6Var.v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    f6Var.q3 = true;
                    try {
                        f6Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                ci.r6 r6Var = (ci.r6) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                r6Var.a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.W0.invalidate();
                r6Var.T0.invalidate();
                r6Var.U0.invalidate();
                int i10 = 0;
                while (i10 < r6Var.W0.getChildCount()) {
                    r6Var.W0.getChildAt(i10).setAlpha(((i10 == r6Var.Z0 ? r6Var.a1 : i10 == r6Var.Y0 ? 1.0f - r6Var.a1 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = qr.f.getInterpolation(r6Var.a1);
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
                ad adVar = (ad) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                ci.u uVar = (ci.u) this.d;
                adVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    adVar.setDrawable(uVar);
                    break;
                }
                break;
            case 3:
                ji.m mVar = (ji.m) this.b;
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
                qg.n0 n0Var = (qg.n0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                n0Var.i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f1.invalidate();
                n0Var.c1.invalidate();
                n0Var.d1.invalidate();
                int i11 = 0;
                while (i11 < n0Var.f1.getChildCount()) {
                    n0Var.f1.getChildAt(i11).setAlpha(((i11 == n0Var.h1 ? n0Var.i1 : i11 == n0Var.g1 ? 1.0f - n0Var.i1 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = qr.f.getInterpolation(n0Var.i1);
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
