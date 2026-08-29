package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;

    public /* synthetic */ hd0(id0 id0Var, int i10) {
        this.a = i10;
        this.b = id0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                nd0 nd0Var = this.b.d;
                nd0Var.L = 1.0f;
                nd0Var.f(1.0f);
                break;
            default:
                id0 id0Var = this.b;
                Runnable runnable = id0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && id0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = id0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(id0Var.d.r);
                    break;
                }
                break;
        }
    }
}
