// default package

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
