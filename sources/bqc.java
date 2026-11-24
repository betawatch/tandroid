// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class bqc extends AnimatorListenerAdapter {
    public final /* synthetic */ x02 a;
    public final /* synthetic */ lnc b;
    public final /* synthetic */ cqc c;

    public bqc(cqc cqcVar, x02 x02Var, lnc lncVar) {
        this.c = cqcVar;
        this.a = x02Var;
        this.b = lncVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            gl.t1(this.b);
        }
    }
}
