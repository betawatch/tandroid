package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ g3(i3 i3Var, int i9) {
        this.a = i9;
        this.b = i3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i3 i3Var = this.b;
                i3Var.r = 0;
                i3Var.invalidate();
                break;
            default:
                i3 i3Var2 = this.b;
                i3Var2.s = 0;
                i3Var2.invalidate();
                break;
        }
    }
}
