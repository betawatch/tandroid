package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ v1(x1 x1Var, int i7) {
        this.a = i7;
        this.b = x1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x1 x1Var = this.b;
                DialogInterface.OnShowListener onShowListener = x1Var.q1;
                if (onShowListener != null) {
                    onShowListener.onShow(x1Var);
                    break;
                }
                break;
            default:
                x1 x1Var2 = this.b;
                x1Var2.u().removeView(x1Var2.n1);
                DialogInterface.OnDismissListener onDismissListener = x1Var2.r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(x1Var2);
                    break;
                }
                break;
        }
    }
}
