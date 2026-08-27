package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s10 b;

    public /* synthetic */ r10(s10 s10Var, int i10) {
        this.a = i10;
        this.b = s10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s10 s10Var = this.b;
                NotificationCenter.getInstance(s10Var.r.a).onAnimationFinish(s10Var.f);
                s10Var.requestLayout();
                break;
            default:
                s10 s10Var2 = this.b;
                s10Var2.d = null;
                s10Var2.a = null;
                s10Var2.b = false;
                break;
        }
    }
}
