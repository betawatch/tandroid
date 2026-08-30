package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a91 b;

    public /* synthetic */ z81(a91 a91Var, int i10) {
        this.a = i10;
        this.b = a91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.y = null;
                break;
            default:
                this.b.y = null;
                break;
        }
    }
}
