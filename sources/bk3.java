// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bk3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ck3 b;

    public /* synthetic */ bk3(ck3 ck3Var, byte b) {
        this.a = b;
        this.b = ck3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ck3 ck3Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = ck3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == ck3Var.e) {
                    ck3Var.e = null;
                    break;
                }
                break;
            default:
                Runnable runnable2 = ck3Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == ck3Var.e) {
                    ck3Var.e = null;
                    break;
                }
                break;
        }
    }
}
