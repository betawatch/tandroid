package lh;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ap0;
import org.telegram.ui.nc1;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class cb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ cb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sb sbVar = (sb) this.c;
                sbVar.z2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bb bbVar = sbVar.y2;
                if (bbVar != null) {
                    bbVar.invalidate();
                }
                if (!this.b && sbVar.z2 > 0.5f) {
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
                ap0 ap0Var = (ap0) this.c;
                ap0Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ap0Var.K.invalidate();
                if (!this.b && ap0Var.L > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                nc1 nc1Var = (nc1) this.c;
                nc1Var.e2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc1Var.d2.invalidate();
                if (!this.b && nc1Var.e2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
