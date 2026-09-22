package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class xd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd0 b;

    public /* synthetic */ xd0(yd0 yd0Var, int i10) {
        this.a = i10;
        this.b = yd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                de0 de0Var = this.b.d;
                de0Var.P = 1.0f;
                de0Var.f(1.0f);
                break;
            default:
                yd0 yd0Var = this.b;
                Runnable runnable = yd0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && yd0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = yd0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(yd0Var.d.r);
                    break;
                }
                break;
        }
    }
}
