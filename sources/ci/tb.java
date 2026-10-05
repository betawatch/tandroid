package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.pd1;
import org.telegram.ui.wp0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class tb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                kc kcVar = (kc) this.c;
                kcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = kcVar.C2;
                if (sbVar != null) {
                    sbVar.invalidate();
                }
                if (!this.b && kcVar.D2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) this.c;
                cdVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cdVar.m0.invalidate();
                if (!this.b && cdVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                wp0 wp0Var = (wp0) this.c;
                wp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wp0Var.X.invalidate();
                if (!this.b && wp0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                pd1 pd1Var = (pd1) this.c;
                pd1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var.h2.invalidate();
                if (!this.b && pd1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
