package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ c1(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                d1Var.K = null;
                d1Var.f.f(new ag.d(this, 12));
                break;
            default:
                this.b.f.f(new ag.d(this, 13));
                break;
        }
    }
}
