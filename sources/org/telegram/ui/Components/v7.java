package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class v7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ v7(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.C0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.m0 = false;
                break;
            case 1:
                i8 i8Var = this.b;
                i8Var.i0.setVisibility(4);
                i8Var.j0.setImageBitmap(null);
                i8Var.m0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
