package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k30 b;

    public /* synthetic */ e30(k30 k30Var, int i10) {
        this.a = i10;
        this.b = k30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k30 k30Var = this.b;
                k30Var.b.setVisibility(8);
                k30Var.y = false;
                k30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
