package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ g60(h60 h60Var, int i7) {
        this.a = i7;
        this.b = h60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h60 h60Var = this.b;
                h60Var.e.Y1 = null;
                h60Var.requestLayout();
                break;
            default:
                h60 h60Var2 = this.b;
                h60Var2.e.Y1 = null;
                h60Var2.a = false;
                break;
        }
    }
}
