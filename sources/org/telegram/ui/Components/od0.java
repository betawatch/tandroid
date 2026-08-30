package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class od0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd0 b;

    public /* synthetic */ od0(pd0 pd0Var, int i10) {
        this.a = i10;
        this.b = pd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                vd0 vd0Var = this.b.d;
                vd0Var.M = 1.0f;
                vd0Var.f(1.0f);
                break;
            default:
                pd0 pd0Var = this.b;
                Runnable runnable = pd0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && pd0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = pd0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(pd0Var.d.r);
                    break;
                }
                break;
        }
    }
}
