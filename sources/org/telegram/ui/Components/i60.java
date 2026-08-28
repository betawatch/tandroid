package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ i60(j60 j60Var, int i9) {
        this.a = i9;
        this.b = j60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j60 j60Var = this.b;
                j60Var.e.Z = null;
                j60Var.requestLayout();
                break;
            default:
                j60 j60Var2 = this.b;
                j60Var2.e.Z = null;
                j60Var2.a = false;
                break;
        }
    }
}
