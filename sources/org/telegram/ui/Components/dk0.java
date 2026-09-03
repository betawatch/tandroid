package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;

    public /* synthetic */ dk0(qk0 qk0Var, int i10) {
        this.a = i10;
        this.b = qk0Var;
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
                qk0 qk0Var = this.b;
                qk0Var.N = null;
                qk0Var.k0 = 0.0f;
                qk0Var.i0 = null;
                qk0Var.invalidate();
                break;
            default:
                AndroidUtilities.removeFromParent(this.b);
                break;
        }
    }
}
