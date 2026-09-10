package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ae1;
import org.telegram.ui.bq0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class hd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ hd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ce ceVar = (ce) this.c;
                ceVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gd gdVar = ceVar.C2;
                if (gdVar != null) {
                    gdVar.invalidate();
                }
                if (!this.b && ceVar.D2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) this.c;
                cdVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cdVar.m0.invalidate();
                if (!this.b && cdVar.n0 > 0.5f) {
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
                ae1 ae1Var = (ae1) this.c;
                ae1Var.i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae1Var.h2.invalidate();
                if (!this.b && ae1Var.i2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
