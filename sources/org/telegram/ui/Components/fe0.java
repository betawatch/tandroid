package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class fe0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;

    public /* synthetic */ fe0(ge0 ge0Var, int i10) {
        this.a = i10;
        this.b = ge0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                le0 le0Var = this.b.d;
                if (!le0Var.P) {
                    le0Var.a0 = 1.0f;
                    le0Var.g(1.0f);
                    break;
                }
                break;
            default:
                ge0 ge0Var = this.b;
                le0 le0Var2 = ge0Var.d;
                if (!le0Var2.P) {
                    Runnable runnable = ge0Var.c;
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
