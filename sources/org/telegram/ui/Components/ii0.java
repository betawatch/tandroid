package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ii0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;

    public /* synthetic */ ii0(vi0 vi0Var, int i7) {
        this.a = i7;
        this.b = vi0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.M0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                vi0 vi0Var = this.b;
                vi0Var.R = null;
                vi0Var.o0 = 0.0f;
                vi0Var.m0 = null;
                vi0Var.invalidate();
                break;
        }
    }
}
