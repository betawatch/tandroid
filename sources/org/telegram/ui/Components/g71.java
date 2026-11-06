package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h71 b;

    public /* synthetic */ g71(h71 h71Var, int i7) {
        this.a = i7;
        this.b = h71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.D = null;
                break;
            default:
                this.b.D = null;
                break;
        }
    }
}
