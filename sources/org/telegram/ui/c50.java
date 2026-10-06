package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class c50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ c50(h60 h60Var, int i10) {
        this.a = i10;
        this.b = h60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h60 h60Var = this.b;
                h60Var.V.setVisibility(4);
                h60Var.W.setVisibility(4);
                h60Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                h60 h60Var2 = this.b;
                h60Var2.h1 = null;
                h60Var2.g1.setColor(h60Var2.T1 == 3 ? -1163700 : -12761513);
                h60Var2.f1.invalidate();
                break;
        }
    }
}
