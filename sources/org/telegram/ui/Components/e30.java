package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j30 b;

    public /* synthetic */ e30(j30 j30Var, int i10) {
        this.a = i10;
        this.b = j30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j30 j30Var = this.b;
                j30Var.b.setVisibility(8);
                j30Var.y = false;
                j30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
