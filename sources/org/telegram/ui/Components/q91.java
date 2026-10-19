package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class q91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r91 b;

    public /* synthetic */ q91(r91 r91Var, int i10) {
        this.a = i10;
        this.b = r91Var;
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
