package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class le0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ le0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                re0 re0Var = this.b.d;
                if (!re0Var.L) {
                    re0Var.T = 1.0f;
                    re0Var.g(1.0f);
                    break;
                }
                break;
            default:
                me0 me0Var = this.b;
                re0 re0Var2 = me0Var.d;
                if (!re0Var2.L) {
                    Runnable runnable = me0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && re0Var2.x.getVisibility() != 0 && (editTextBoldCursor = re0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(re0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
