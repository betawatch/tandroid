package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
