package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class wd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ wd0(xd0 xd0Var, int i10) {
        this.a = i10;
        this.b = xd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                ce0 ce0Var = this.b.d;
                ce0Var.P = 1.0f;
                ce0Var.f(1.0f);
                break;
            default:
                xd0 xd0Var = this.b;
                Runnable runnable = xd0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && xd0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = xd0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(xd0Var.d.r);
                    break;
                }
                break;
        }
    }
}
