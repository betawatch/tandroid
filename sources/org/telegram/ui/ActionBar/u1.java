package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
