package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.dd;
import org.telegram.ui.kp0;
import org.telegram.ui.mc1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class eb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ eb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vb vbVar = (vb) this.c;
                vbVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db dbVar = vbVar.C2;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                if (!this.b && vbVar.D2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                dd ddVar = (dd) this.c;
                ddVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ddVar.m0.invalidate();
                if (!this.b && ddVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                kp0 kp0Var = (kp0) this.c;
                kp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kp0Var.X.invalidate();
                if (!this.b && kp0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                mc1 mc1Var = (mc1) this.c;
                mc1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc1Var.h2.invalidate();
                if (!this.b && mc1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
