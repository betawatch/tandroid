package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ud0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd0 b;

    public /* synthetic */ ud0(vd0 vd0Var, int i10) {
        this.a = i10;
        this.b = vd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                ae0 ae0Var = this.b.d;
                ae0Var.P = 1.0f;
                ae0Var.f(1.0f);
                break;
            default:
                vd0 vd0Var = this.b;
                Runnable runnable = vd0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && vd0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = vd0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(vd0Var.d.r);
                    break;
                }
                break;
        }
    }
}
