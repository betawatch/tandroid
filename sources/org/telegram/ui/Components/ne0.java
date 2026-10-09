package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ne0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ oe0 b;

    public /* synthetic */ ne0(oe0 oe0Var, int i10) {
        this.a = i10;
        this.b = oe0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                te0 te0Var = this.b.d;
                if (!te0Var.L) {
                    te0Var.T = 1.0f;
                    te0Var.g(1.0f);
                    break;
                }
                break;
            default:
                oe0 oe0Var = this.b;
                te0 te0Var2 = oe0Var.d;
                if (!te0Var2.L) {
                    Runnable runnable = oe0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && te0Var2.x.getVisibility() != 0 && (editTextBoldCursor = te0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(te0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
