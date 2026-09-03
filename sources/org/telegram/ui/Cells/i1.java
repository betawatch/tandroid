package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ i1(int i10, s1 s1Var) {
        this.a = i10;
        this.b = s1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s1 s1Var = this.b;
                s1Var.v7.isMediaSpoilersRevealed = true;
                s1Var.invalidate();
                break;
            default:
                this.b.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
