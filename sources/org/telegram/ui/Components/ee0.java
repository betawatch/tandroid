package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ee0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;

    public /* synthetic */ ee0(fe0 fe0Var, int i10) {
        this.a = i10;
        this.b = fe0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                le0 le0Var = this.b.d;
                if (!le0Var.P) {
                    le0Var.a0 = 1.0f;
                    le0Var.h(1.0f);
                    break;
                }
                break;
            default:
                fe0 fe0Var = this.b;
                le0 le0Var2 = fe0Var.d;
                if (!le0Var2.P) {
                    Runnable runnable = fe0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && le0Var2.x.getVisibility() != 0 && (editTextBoldCursor = le0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(le0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
