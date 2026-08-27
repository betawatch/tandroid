package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e81 b;

    public /* synthetic */ d81(e81 e81Var, int i10) {
        this.a = i10;
        this.b = e81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.y = null;
                break;
            default:
                this.b.y = null;
                break;
        }
    }
}
