package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.od1;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ ub(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                lc lcVar = (lc) this.c;
                lcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tb tbVar = lcVar.C2;
                if (tbVar != null) {
                    tbVar.invalidate();
                }
                if (!this.b && lcVar.D2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ad adVar = (org.telegram.ui.ad) this.c;
                adVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.m0.invalidate();
                if (!this.b && adVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                tp0 tp0Var = (tp0) this.c;
                tp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp0Var.X.invalidate();
                if (!this.b && tp0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                od1 od1Var = (od1) this.c;
                od1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var.h2.invalidate();
                if (!this.b && od1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
