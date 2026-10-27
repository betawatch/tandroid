package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p20 b;

    public /* synthetic */ o20(p20 p20Var, int i10) {
        this.a = i10;
        this.b = p20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p20 p20Var = this.b;
                NotificationCenter.getInstance(p20Var.r.a).onAnimationFinish(p20Var.f);
                p20Var.requestLayout();
                break;
            default:
                p20 p20Var2 = this.b;
                p20Var2.d = null;
                p20Var2.a = null;
                p20Var2.b = false;
                break;
        }
    }
}
