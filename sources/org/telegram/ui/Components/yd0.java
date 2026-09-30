package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class yd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd0 b;

    public /* synthetic */ yd0(zd0 zd0Var, int i10) {
        this.a = i10;
        this.b = zd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                ee0 ee0Var = this.b.d;
                ee0Var.P = 1.0f;
                ee0Var.f(1.0f);
                break;
            default:
                zd0 zd0Var = this.b;
                Runnable runnable = zd0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && zd0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = zd0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(zd0Var.d.r);
                    break;
                }
                break;
        }
    }
}
