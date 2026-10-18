package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class nx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tz c;

    public /* synthetic */ nx(tz tzVar, boolean z10, int i10) {
        this.a = i10;
        this.c = tzVar;
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
