package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s71 b;

    public /* synthetic */ r71(s71 s71Var, int i7) {
        this.a = i7;
        this.b = s71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.E = null;
                break;
            default:
                this.b.E = null;
                break;
        }
    }
}
