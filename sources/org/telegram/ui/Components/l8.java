package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ l8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                w8 w8Var = this.b;
                w8Var.i0(w8Var.C ? 1.0f : 0.0f, false);
                w8Var.C = false;
                break;
        }
    }
}
