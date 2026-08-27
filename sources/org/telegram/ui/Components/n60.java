package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ n60(o60 o60Var, int i10) {
        this.a = i10;
        this.b = o60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o60 o60Var = this.b;
                o60Var.e.Z = null;
                o60Var.requestLayout();
                break;
            default:
                o60 o60Var2 = this.b;
                o60Var2.e.Z = null;
                o60Var2.a = false;
                break;
        }
    }
}
