package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ m0(w0 w0Var, int i9) {
        this.a = i9;
        this.b = w0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                w0Var.s.setVisibility(4);
                w0Var.v = null;
                break;
            default:
                this.b.v = null;
                break;
        }
    }
}
