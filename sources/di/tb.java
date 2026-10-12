package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ce1;
import org.telegram.ui.gq0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class tb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                kc kcVar = (kc) this.c;
                kcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = kcVar.C2;
                if (sbVar != null) {
                    sbVar.invalidate();
                }
                if (!this.b && kcVar.D2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.hd hdVar = (org.telegram.ui.hd) this.c;
                hdVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hdVar.m0.invalidate();
                if (!this.b && hdVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                gq0 gq0Var = (gq0) this.c;
                gq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gq0Var.X.invalidate();
                if (!this.b && gq0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                ce1 ce1Var = (ce1) this.c;
                ce1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce1Var.h2.invalidate();
                if (!this.b && ce1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
