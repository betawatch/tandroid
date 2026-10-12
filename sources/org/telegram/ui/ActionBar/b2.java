package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ b2(e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                DialogInterface.OnShowListener onShowListener = e2Var.i1;
                if (onShowListener != null) {
                    onShowListener.onShow(e2Var);
                    break;
                }
                break;
            default:
                e2 e2Var2 = this.b;
                e2Var2.s().removeView(e2Var2.f1);
                DialogInterface.OnDismissListener onDismissListener = e2Var2.j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(e2Var2);
                    break;
                }
                break;
        }
    }
}
