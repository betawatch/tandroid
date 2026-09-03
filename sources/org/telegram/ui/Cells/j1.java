package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ j1(int i10, t1 t1Var) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t1 t1Var = this.b;
                t1Var.v7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                break;
            default:
                this.b.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
