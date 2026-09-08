package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bq0;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class yb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ yb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pc pcVar = (pc) this.c;
                pcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xb xbVar = pcVar.C2;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                if (!this.b && pcVar.D2 > 0.5f) {
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
                bq0 bq0Var = (bq0) this.c;
                bq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bq0Var.X.invalidate();
                if (!this.b && bq0Var.Y > 0.5f) {
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
