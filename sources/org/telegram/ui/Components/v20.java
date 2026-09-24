package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class v20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a30 b;

    public /* synthetic */ v20(a30 a30Var, int i10) {
        this.a = i10;
        this.b = a30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a30 a30Var = this.b;
                a30Var.b.setVisibility(8);
                a30Var.y = false;
                a30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
