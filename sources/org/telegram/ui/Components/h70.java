package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i70 b;

    public /* synthetic */ h70(i70 i70Var, int i10) {
        this.a = i10;
        this.b = i70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i70 i70Var = this.b;
                i70Var.e.d0 = null;
                i70Var.requestLayout();
                break;
            default:
                i70 i70Var2 = this.b;
                i70Var2.e.d0 = null;
                i70Var2.a = false;
                break;
        }
    }
}
