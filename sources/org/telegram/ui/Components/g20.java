package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class g20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h20 b;

    public /* synthetic */ g20(h20 h20Var, int i10) {
        this.a = i10;
        this.b = h20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h20 h20Var = this.b;
                NotificationCenter.getInstance(h20Var.r.a).onAnimationFinish(h20Var.f);
                h20Var.requestLayout();
                break;
            default:
                h20 h20Var2 = this.b;
                h20Var2.d = null;
                h20Var2.a = null;
                h20Var2.b = false;
                break;
        }
    }
}
