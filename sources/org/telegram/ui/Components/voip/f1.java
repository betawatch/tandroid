package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class f1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ f1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.L = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.a) {
            case 0:
                pf.e eVar = this.b.O;
                if (eVar != null && (view = eVar.j) != null) {
                    eVar.e(view);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator, z10);
                break;
        }
    }
}
