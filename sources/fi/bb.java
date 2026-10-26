package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.rp0;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ bb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sb sbVar = (sb) this.c;
                sbVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ab abVar = sbVar.C2;
                if (abVar != null) {
                    abVar.invalidate();
                }
                if (!this.b && sbVar.D2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                bd bdVar = (bd) this.c;
                bdVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.b && bdVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                rp0 rp0Var = (rp0) this.c;
                rp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rp0Var.X.invalidate();
                if (!this.b && rp0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                tc1 tc1Var = (tc1) this.c;
                tc1Var.j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc1Var.i2.invalidate();
                if (!this.b && tc1Var.j2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
