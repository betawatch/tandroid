package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    public /* synthetic */ n2(o2 o2Var, int i9) {
        this.a = i9;
        this.b = o2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.setVisibility(8);
                break;
            default:
                this.b.c.setVisibility(8);
                break;
        }
    }
}
