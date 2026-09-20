package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a60 b;

    public /* synthetic */ e50(a60 a60Var, int i10) {
        this.a = i10;
        this.b = a60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a60 a60Var = this.b;
                if (animator.equals(a60Var.J)) {
                    a60Var.J = null;
                    break;
                }
                break;
            case 1:
                a60 a60Var2 = this.b;
                if (a60Var2.e1 != null) {
                    a60Var2.e1 = null;
                    break;
                }
                break;
            default:
                a60 a60Var3 = this.b;
                if (animator.equals(a60Var3.c0)) {
                    a60Var3.c(true);
                    a60Var3.Z0 = false;
                    a60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
