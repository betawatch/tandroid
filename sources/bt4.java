// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ft4 b;

    public /* synthetic */ bt4(ft4 ft4Var, byte b) {
        this.a = b;
        this.b = ft4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        byte b = this.a;
        ft4 ft4Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = ft4Var.e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = ft4Var.d0) != null && valueAnimator.isRunning())) {
                    ft4Var.j(ft4Var.M);
                    break;
                } else {
                    ft4Var.n();
                    break;
                }
                break;
            default:
                ft4Var.l();
                break;
        }
    }
}
