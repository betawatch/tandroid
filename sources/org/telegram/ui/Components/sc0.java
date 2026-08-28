package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc0 b;

    public /* synthetic */ sc0(tc0 tc0Var, int i9) {
        this.a = i9;
        this.b = tc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                yc0 yc0Var = this.b.d;
                yc0Var.L = 1.0f;
                yc0Var.f(1.0f);
                break;
            default:
                tc0 tc0Var = this.b;
                Runnable runnable = tc0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && tc0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = tc0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(tc0Var.d.r);
                    break;
                }
                break;
        }
    }
}
