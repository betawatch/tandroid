// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class mrc extends AnimatorListenerAdapter {
    public final /* synthetic */ n12 a;
    public final /* synthetic */ yrc b;
    public final /* synthetic */ nrc c;

    public mrc(nrc nrcVar, n12 n12Var, yrc yrcVar) {
        this.c = nrcVar;
        this.a = n12Var;
        this.b = yrcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            hl.t1(this.b);
        }
    }
}
