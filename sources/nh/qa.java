package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.qc1;
import org.telegram.ui.vc;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class qa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ qa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                gb gbVar = (gb) this.c;
                gbVar.z2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pa paVar = gbVar.y2;
                if (paVar != null) {
                    paVar.invalidate();
                }
                if (!this.b && gbVar.z2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                vc vcVar = (vc) this.c;
                vcVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vcVar.i0.invalidate();
                if (!this.b && vcVar.j0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                yo0 yo0Var = (yo0) this.c;
                yo0Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yo0Var.K.invalidate();
                if (!this.b && yo0Var.L > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                qc1 qc1Var = (qc1) this.c;
                qc1Var.e2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var.d2.invalidate();
                if (!this.b && qc1Var.e2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
