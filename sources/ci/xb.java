package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.cq0;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.c;
                bdVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.b && bdVar.n0 > 0.5f) {
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
                vd1 vd1Var = (vd1) this.c;
                vd1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd1Var.h2.invalidate();
                if (!this.b && vd1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
