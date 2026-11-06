package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ g2(h2 h2Var, int i7) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.setVisibility(8);
                break;
            default:
                this.b.c.setVisibility(8);
                break;
        }
    }
}
