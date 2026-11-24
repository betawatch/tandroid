// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fg5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ig5 b;

    public /* synthetic */ fg5(ig5 ig5Var, byte b) {
        this.a = b;
        this.b = ig5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ig5 ig5Var = this.b;
        switch (b) {
            case 0:
                ig5Var.d = null;
                qn4 qn4Var = new qn4(this, (byte) 29);
                ig5Var.e = qn4Var;
                gm.d3(qn4Var, ig5Var.w);
                break;
            default:
                ig5Var.setVisibility(4);
                ig5Var.c = null;
                ig5Var.d = null;
                break;
        }
    }
}
