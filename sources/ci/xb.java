package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.aq0;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class xb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ xb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                oc ocVar = (oc) this.c;
                ocVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb wbVar = ocVar.C2;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                if (!this.b && ocVar.D2 > 0.5f) {
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
                aq0 aq0Var = (aq0) this.c;
                aq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aq0Var.X.invalidate();
                if (!this.b && aq0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                wd1 wd1Var = (wd1) this.c;
                wd1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.h2.invalidate();
                if (!this.b && wd1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
