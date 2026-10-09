package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v20 b;

    public /* synthetic */ u20(v20 v20Var, int i10) {
        this.a = i10;
        this.b = v20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v20 v20Var = this.b;
                NotificationCenter.getInstance(v20Var.r.a).onAnimationFinish(v20Var.f);
                v20Var.requestLayout();
                break;
            default:
                v20 v20Var2 = this.b;
                v20Var2.d = null;
                v20Var2.a = null;
                v20Var2.b = false;
                break;
        }
    }
}
