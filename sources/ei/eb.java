package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.ip0;
import org.telegram.ui.kc1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                ip0 ip0Var = (ip0) this.c;
                ip0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ip0Var.X.invalidate();
                if (!this.b && ip0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                kc1 kc1Var = (kc1) this.c;
                kc1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc1Var.h2.invalidate();
                if (!this.b && kc1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
