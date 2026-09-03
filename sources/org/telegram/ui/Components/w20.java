package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b30 b;

    public /* synthetic */ w20(b30 b30Var, int i10) {
        this.a = i10;
        this.b = b30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b30 b30Var = this.b;
                b30Var.b.setVisibility(8);
                b30Var.y = false;
                b30Var.B = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
