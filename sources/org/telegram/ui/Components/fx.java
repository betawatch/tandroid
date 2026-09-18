package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kz c;

    public /* synthetic */ fx(kz kzVar, boolean z10, int i10) {
        this.a = i10;
        this.c = kzVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.c.x.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!this.b) {
                    this.c.y.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
