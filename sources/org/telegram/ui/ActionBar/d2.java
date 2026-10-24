package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                DialogInterface.OnShowListener onShowListener = g2Var.r1;
                if (onShowListener != null) {
                    onShowListener.onShow(g2Var);
                    break;
                }
                break;
            default:
                g2 g2Var2 = this.b;
                g2Var2.u().removeView(g2Var2.o1);
                DialogInterface.OnDismissListener onDismissListener = g2Var2.s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(g2Var2);
                    break;
                }
                break;
        }
    }
}
