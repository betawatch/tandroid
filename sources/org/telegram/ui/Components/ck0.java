package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ck0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk0 b;

    public /* synthetic */ ck0(pk0 pk0Var, int i10) {
        this.a = i10;
        this.b = pk0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I0.unlock();
                break;
            case 1:
                super.onAnimationEnd(animator);
                pk0 pk0Var = this.b;
                pk0Var.N = null;
                pk0Var.k0 = 0.0f;
                pk0Var.i0 = null;
                pk0Var.invalidate();
                break;
            default:
                AndroidUtilities.removeFromParent(this.b);
                break;
        }
    }
}
