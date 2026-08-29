package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ d2(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                DialogInterface.OnShowListener onShowListener = g2Var.e1;
                if (onShowListener != null) {
                    onShowListener.onShow(g2Var);
                    break;
                }
                break;
            default:
                g2 g2Var2 = this.b;
                g2Var2.s().removeView(g2Var2.b1);
                DialogInterface.OnDismissListener onDismissListener = g2Var2.f1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(g2Var2);
                    break;
                }
                break;
        }
    }
}
