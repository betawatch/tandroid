package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                s1Var.y7.isMediaSpoilersRevealed = true;
                s1Var.invalidate();
                break;
            default:
                this.b.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
