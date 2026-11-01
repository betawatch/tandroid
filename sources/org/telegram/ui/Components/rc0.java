package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc0 b;

    public /* synthetic */ rc0(sc0 sc0Var, int i10) {
        this.a = i10;
        this.b = sc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                zc0 zc0Var = this.b.d;
                if (!zc0Var.P) {
                    zc0Var.a0 = 1.0f;
                    zc0Var.h(1.0f);
                    break;
                }
                break;
            default:
                sc0 sc0Var = this.b;
                zc0 zc0Var2 = sc0Var.d;
                if (!zc0Var2.P) {
                    Runnable runnable = sc0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.uz.r == 1 && zc0Var2.y.getVisibility() != 0 && (editTextBoldCursor = zc0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.i0.J3(zc0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
