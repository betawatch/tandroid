package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ g60(i60 i60Var, int i7) {
        this.a = i7;
        this.b = i60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i60 i60Var = this.b;
                i60Var.e.Y1 = null;
                i60Var.requestLayout();
                break;
            default:
                i60 i60Var2 = this.b;
                i60Var2.e.Y1 = null;
                i60Var2.a = false;
                break;
        }
    }
}
