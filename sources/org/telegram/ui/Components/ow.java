package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ow extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ry c;

    public /* synthetic */ ow(ry ryVar, boolean z10, int i7) {
        this.a = i7;
        this.c = ryVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.c.y.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!this.b) {
                    this.c.E.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
