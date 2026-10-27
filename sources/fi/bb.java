package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.tp0;
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                tp0 tp0Var = (tp0) this.c;
                tp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp0Var.X.invalidate();
                if (!this.b && tp0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                vc1 vc1Var = (vc1) this.c;
                vc1Var.j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vc1Var.i2.invalidate();
                if (!this.b && vc1Var.j2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
