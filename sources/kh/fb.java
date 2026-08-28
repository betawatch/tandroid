package kh;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.oc1;
import org.telegram.ui.xc;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class fb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ fb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.a = i9;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wb wbVar = (wb) this.c;
                wbVar.z2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eb ebVar = wbVar.y2;
                if (ebVar != null) {
                    ebVar.invalidate();
                }
                if (!this.b && wbVar.z2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                xc xcVar = (xc) this.c;
                xcVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xcVar.i0.invalidate();
                if (!this.b && xcVar.j0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                zo0 zo0Var = (zo0) this.c;
                zo0Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zo0Var.K.invalidate();
                if (!this.b && zo0Var.L > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                oc1 oc1Var = (oc1) this.c;
                oc1Var.e2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc1Var.d2.invalidate();
                if (!this.b && oc1Var.e2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
