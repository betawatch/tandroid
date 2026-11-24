// default package

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ir1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ ir1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ez1 ez1Var;
        FrameLayout frameLayout;
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = mu1Var.sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    mu1Var.sa.start();
                    break;
                }
                break;
            default:
                if (mu1Var.d3 == this && (ez1Var = mu1Var.b1) != null && (frameLayout = mu1Var.c3) != null) {
                    ez1Var.j(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
