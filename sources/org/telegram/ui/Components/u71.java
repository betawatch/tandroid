package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ u71(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
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
