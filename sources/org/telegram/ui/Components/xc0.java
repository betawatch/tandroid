package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc0 b;

    public /* synthetic */ xc0(yc0 yc0Var, int i10) {
        this.a = i10;
        this.b = yc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                dd0 dd0Var = this.b.d;
                dd0Var.L = 1.0f;
                dd0Var.f(1.0f);
                break;
            default:
                yc0 yc0Var = this.b;
                Runnable runnable = yc0Var.c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && yc0Var.d.x.getVisibility() != 0 && (editTextBoldCursor = yc0Var.d.r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(yc0Var.d.r);
                    break;
                }
                break;
        }
    }
}
