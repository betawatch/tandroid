// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cj9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dj9 b;

    public /* synthetic */ cj9(dj9 dj9Var, byte b) {
        this.a = b;
        this.b = dj9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dj9 dj9Var = this.b;
        switch (b) {
            case 0:
                if (dj9Var.h != null) {
                    dj9Var.h = null;
                    dj9Var.e = 0.0f;
                    dj9Var.g();
                    dj9Var.n.e();
                    yh3 yh3Var = dj9Var.a;
                    if (yh3Var != null) {
                        yh3Var.onPause();
                        dj9Var.a.onFragmentDestroy();
                        dj9Var.removeAllViews();
                        dj9Var.a = null;
                        kk7.e().k(kk7.t4, new Object[0]);
                    }
                    dj9Var.d(false);
                    break;
                }
                break;
            default:
                if (dj9Var.h != null) {
                    dj9Var.h = null;
                    dj9Var.d(true);
                    break;
                }
                break;
        }
    }
}
