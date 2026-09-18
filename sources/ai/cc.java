package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class cc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ cc(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.b.b;
                p9 p9Var = jcVar.u1;
                if (p9Var != null) {
                    p9Var.b();
                    jcVar.v.removeView(jcVar.u1);
                }
                jcVar.u1 = null;
                jcVar.P();
                break;
            default:
                super.onAnimationEnd(animator);
                p9 p9Var2 = this.b.b.u1;
                if (p9Var2 != null) {
                    p9Var2.a(true);
                    break;
                }
                break;
        }
    }
}
