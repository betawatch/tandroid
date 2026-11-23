package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w1 b;

    public /* synthetic */ u1(w1 w1Var, int i7) {
        this.a = i7;
        this.b = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w1 w1Var = this.b;
                DialogInterface.OnShowListener onShowListener = w1Var.q1;
                if (onShowListener != null) {
                    onShowListener.onShow(w1Var);
                    break;
                }
                break;
            default:
                w1 w1Var2 = this.b;
                w1Var2.u().removeView(w1Var2.n1);
                DialogInterface.OnDismissListener onDismissListener = w1Var2.r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(w1Var2);
                    break;
                }
                break;
        }
    }
}
