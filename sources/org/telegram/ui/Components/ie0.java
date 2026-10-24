package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ie0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ je0 b;

    public /* synthetic */ ie0(je0 je0Var, int i10) {
        this.a = i10;
        this.b = je0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                pe0 pe0Var = this.b.d;
                if (!pe0Var.P) {
                    pe0Var.a0 = 1.0f;
                    pe0Var.h(1.0f);
                    break;
                }
                break;
            default:
                je0 je0Var = this.b;
                pe0 pe0Var2 = je0Var.d;
                if (!pe0Var2.P) {
                    Runnable runnable = je0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && pe0Var2.x.getVisibility() != 0 && (editTextBoldCursor = pe0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(pe0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
