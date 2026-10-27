package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ f2(i2 i2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i2 i2Var = this.b;
                DialogInterface.OnShowListener onShowListener = i2Var.r1;
                if (onShowListener != null) {
                    onShowListener.onShow(i2Var);
                    break;
                }
                break;
            default:
                i2 i2Var2 = this.b;
                i2Var2.u().removeView(i2Var2.o1);
                DialogInterface.OnDismissListener onDismissListener = i2Var2.s1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(i2Var2);
                    break;
                }
                break;
        }
    }
}
