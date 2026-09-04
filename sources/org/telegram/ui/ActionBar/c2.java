package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class c2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ c2(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                DialogInterface.OnShowListener onShowListener = f2Var.i1;
                if (onShowListener != null) {
                    onShowListener.onShow(f2Var);
                    break;
                }
                break;
            default:
                f2 f2Var2 = this.b;
                f2Var2.s().removeView(f2Var2.f1);
                DialogInterface.OnDismissListener onDismissListener = f2Var2.j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(f2Var2);
                    break;
                }
                break;
        }
    }
}
