package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ g0(r0 r0Var, int i7) {
        this.a = i7;
        this.b = r0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                r0Var.s.setVisibility(4);
                r0Var.w = null;
                break;
            default:
                this.b.w = null;
                break;
        }
    }
}
