package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
