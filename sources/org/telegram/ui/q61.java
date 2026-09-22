package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s61 b;

    public /* synthetic */ q61(s61 s61Var, int i10) {
        this.a = i10;
        this.b = s61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                s61 s61Var = this.b;
                s61Var.N = 0.0f;
                s61Var.I = null;
                s61Var.M = false;
                s61Var.d(true, false);
                break;
        }
    }
}
