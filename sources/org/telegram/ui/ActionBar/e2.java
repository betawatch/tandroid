package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ e2(h2 h2Var, int i10) {
        this.a = i10;
        this.b = h2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h2 h2Var = this.b;
                DialogInterface.OnShowListener onShowListener = h2Var.f1;
                if (onShowListener != null) {
                    onShowListener.onShow(h2Var);
                    break;
                }
                break;
            default:
                h2 h2Var2 = this.b;
                h2Var2.s().removeView(h2Var2.c1);
                DialogInterface.OnDismissListener onDismissListener = h2Var2.g1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(h2Var2);
                    break;
                }
                break;
        }
    }
}
