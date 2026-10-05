package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class xe0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf0 b;

    public /* synthetic */ xe0(bf0 bf0Var, int i10) {
        this.a = i10;
        this.b = bf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.x = null;
                break;
            default:
                this.b.y = null;
                break;
        }
    }
}
