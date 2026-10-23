package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.lp0;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                bd bdVar = (bd) this.c;
                bdVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.b && bdVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                lp0 lp0Var = (lp0) this.c;
                lp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lp0Var.X.invalidate();
                if (!this.b && lp0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                qc1 qc1Var = (qc1) this.c;
                qc1Var.j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var.i2.invalidate();
                if (!this.b && qc1Var.j2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
