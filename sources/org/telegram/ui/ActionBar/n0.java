package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ n0(w0 w0Var, int i10) {
        this.a = i10;
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
