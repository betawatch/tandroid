package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                DialogInterface.OnShowListener onShowListener = x1Var.p1;
                if (onShowListener != null) {
                    onShowListener.onShow(x1Var);
                    break;
                }
                break;
            default:
                x1 x1Var2 = this.b;
                x1Var2.u().removeView(x1Var2.m1);
                DialogInterface.OnDismissListener onDismissListener = x1Var2.q1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(x1Var2);
                    break;
                }
                break;
        }
    }
}
