package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                me0 me0Var = this.b.d;
                if (!me0Var.P) {
                    me0Var.a0 = 1.0f;
                    me0Var.h(1.0f);
                    break;
                }
                break;
            default:
                ge0 ge0Var = this.b;
                me0 me0Var2 = ge0Var.d;
                if (!me0Var2.P) {
                    Runnable runnable = ge0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && me0Var2.x.getVisibility() != 0 && (editTextBoldCursor = me0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(me0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
