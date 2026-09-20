package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class d20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e20 b;

    public /* synthetic */ d20(e20 e20Var, int i10) {
        this.a = i10;
        this.b = e20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e20 e20Var = this.b;
                NotificationCenter.getInstance(e20Var.r.a).onAnimationFinish(e20Var.f);
                e20Var.requestLayout();
                break;
            default:
                e20 e20Var2 = this.b;
                e20Var2.d = null;
                e20Var2.a = null;
                e20Var2.b = false;
                break;
        }
    }
}
