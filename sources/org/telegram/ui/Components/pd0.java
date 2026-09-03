package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd0 b;

    public /* synthetic */ pd0(qd0 qd0Var, int i10) {
        this.a = i10;
        this.b = qd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                wd0 wd0Var = this.b.d;
                wd0Var.M = 1.0f;
                wd0Var.f(1.0f);
                break;
            default:
                qd0 qd0Var = this.b;
                Runnable runnable = qd0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && qd0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = qd0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(qd0Var.d.r);
                    break;
                }
                break;
        }
    }
}
