// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ar4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er4 b;

    public /* synthetic */ ar4(er4 er4Var, byte b) {
        this.a = b;
        this.b = er4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        byte b = this.a;
        er4 er4Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = er4Var.e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = er4Var.d0) != null && valueAnimator.isRunning())) {
                    er4Var.j(er4Var.M);
                    break;
                } else {
                    er4Var.n();
                    break;
                }
                break;
            default:
                er4Var.l();
                break;
        }
    }
}
