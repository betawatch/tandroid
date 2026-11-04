package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ t1(v1 v1Var, int i3) {
        this.a = i3;
        this.b = v1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v1 v1Var = this.b;
                DialogInterface.OnShowListener onShowListener = v1Var.s1;
                if (onShowListener != null) {
                    onShowListener.onShow(v1Var);
                    break;
                }
                break;
            default:
                v1 v1Var2 = this.b;
                v1Var2.u().removeView(v1Var2.p1);
                DialogInterface.OnDismissListener onDismissListener = v1Var2.t1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(v1Var2);
                    break;
                }
                break;
        }
    }
}
