package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                DialogInterface.OnShowListener onShowListener = h2Var.i1;
                if (onShowListener != null) {
                    onShowListener.onShow(h2Var);
                    break;
                }
                break;
            default:
                h2 h2Var2 = this.b;
                h2Var2.s().removeView(h2Var2.f1);
                DialogInterface.OnDismissListener onDismissListener = h2Var2.j1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(h2Var2);
                    break;
                }
                break;
        }
    }
}
