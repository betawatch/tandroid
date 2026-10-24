package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ vx0(wx0 wx0Var, int i10) {
        this.a = i10;
        this.b = wx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.s.setVisibility(8);
                break;
            case 1:
                this.b.s.setVisibility(8);
                break;
            default:
                this.b.s.setVisibility(8);
                break;
        }
    }
}
