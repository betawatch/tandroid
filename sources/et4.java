// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class et4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it4 b;

    public /* synthetic */ et4(it4 it4Var, byte b) {
        this.a = b;
        this.b = it4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        byte b = this.a;
        it4 it4Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = it4Var.e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = it4Var.d0) != null && valueAnimator.isRunning())) {
                    it4Var.j(it4Var.M);
                    break;
                } else {
                    it4Var.n();
                    break;
                }
                break;
            default:
                it4Var.l();
                break;
        }
    }
}
