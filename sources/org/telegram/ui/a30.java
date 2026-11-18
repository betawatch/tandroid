package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ a30(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f40 f40Var = this.b;
                f40Var.Q1.setVisibility(4);
                f40Var.R1.setVisibility(4);
                f40Var.P1.setVisibility(4);
                break;
            case 1:
                this.b.c2 = null;
                break;
            default:
                f40 f40Var2 = this.b;
                f40Var2.c3 = null;
                f40Var2.b3.setColor(f40Var2.S3 == 3 ? -1163700 : -12761513);
                f40Var2.a3.invalidate();
                break;
        }
    }
}
