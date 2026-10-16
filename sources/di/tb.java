package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ce1;
import org.telegram.ui.eq0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                org.telegram.ui.gd gdVar = (org.telegram.ui.gd) this.c;
                gdVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gdVar.m0.invalidate();
                if (!this.b && gdVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                eq0 eq0Var = (eq0) this.c;
                eq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eq0Var.X.invalidate();
                if (!this.b && eq0Var.Y > 0.5f) {
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
