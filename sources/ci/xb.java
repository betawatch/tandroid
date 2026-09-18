package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.cq0;
import org.telegram.ui.xd1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) this.c;
                cdVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cdVar.m0.invalidate();
                if (!this.b && cdVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                cq0 cq0Var = (cq0) this.c;
                cq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cq0Var.X.invalidate();
                if (!this.b && cq0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                xd1 xd1Var = (xd1) this.c;
                xd1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.h2.invalidate();
                if (!this.b && xd1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
