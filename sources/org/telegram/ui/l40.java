package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ l40(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                s50Var.R.setVisibility(4);
                s50Var.S.setVisibility(4);
                s50Var.Q.setVisibility(4);
                break;
            case 1:
                this.b.d0 = null;
                break;
            default:
                s50 s50Var2 = this.b;
                s50Var2.d1 = null;
                s50Var2.c1.setColor(s50Var2.P1 == 3 ? -1163700 : -12761513);
                s50Var2.b1.invalidate();
                break;
        }
    }
}
