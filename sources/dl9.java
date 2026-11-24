// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dl9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    public /* synthetic */ dl9(el9 el9Var, byte b) {
        this.a = b;
        this.b = el9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                if (el9Var.h != null) {
                    el9Var.h = null;
                    el9Var.e = 0.0f;
                    el9Var.g();
                    el9Var.n.e();
                    kj3 kj3Var = el9Var.a;
                    if (kj3Var != null) {
                        kj3Var.onPause();
                        el9Var.a.onFragmentDestroy();
                        el9Var.removeAllViews();
                        el9Var.a = null;
                        nm7.e().k(nm7.v4, new Object[0]);
                    }
                    el9Var.d(false);
                    break;
                }
                break;
            default:
                if (el9Var.h != null) {
                    el9Var.h = null;
                    el9Var.d(true);
                    break;
                }
                break;
        }
    }
}
