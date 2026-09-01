package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd0 b;

    public /* synthetic */ qd0(rd0 rd0Var, int i10) {
        this.a = i10;
        this.b = rd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                xd0 xd0Var = this.b.d;
                xd0Var.M = 1.0f;
                xd0Var.f(1.0f);
                break;
            default:
                rd0 rd0Var = this.b;
                Runnable runnable = rd0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && rd0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = rd0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(rd0Var.d.r);
                    break;
                }
                break;
        }
    }
}
