package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j81 b;

    public /* synthetic */ i81(j81 j81Var, int i7) {
        this.a = i7;
        this.b = j81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.s.setVisibility(8);
                break;
            default:
                this.b.b.a.setVisibility(8);
                break;
        }
    }
}
