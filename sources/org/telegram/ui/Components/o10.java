package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p10 b;

    public /* synthetic */ o10(p10 p10Var, int i9) {
        this.a = i9;
        this.b = p10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p10 p10Var = this.b;
                NotificationCenter.getInstance(p10Var.r.a).onAnimationFinish(p10Var.f);
                p10Var.requestLayout();
                break;
            default:
                p10 p10Var2 = this.b;
                p10Var2.d = null;
                p10Var2.a = null;
                p10Var2.b = false;
                break;
        }
    }
}
