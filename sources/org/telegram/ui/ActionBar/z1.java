package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ z1(b2 b2Var, int i10) {
        this.a = i10;
        this.b = b2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b2 b2Var = this.b;
                DialogInterface.OnShowListener onShowListener = b2Var.r1;
                if (onShowListener != null) {
                    onShowListener.onShow(b2Var);
                    break;
                }
                break;
            default:
                b2 b2Var2 = this.b;
                b2Var2.u().removeView(b2Var2.o1);
                DialogInterface.OnDismissListener onDismissListener = b2Var2.s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(b2Var2);
                    break;
                }
                break;
        }
    }
}
