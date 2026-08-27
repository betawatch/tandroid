package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ g3(i3 i3Var, int i10) {
        this.a = i10;
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
