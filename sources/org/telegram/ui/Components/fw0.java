package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gw0 b;

    public /* synthetic */ fw0(gw0 gw0Var, int i9) {
        this.a = i9;
        this.b = gw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.s.setVisibility(8);
                break;
            case 1:
                this.b.s.setVisibility(8);
                break;
            default:
                this.b.s.setVisibility(8);
                break;
        }
    }
}
