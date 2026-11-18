package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
