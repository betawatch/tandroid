package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class iw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ly c;

    public /* synthetic */ iw(ly lyVar, boolean z10, int i7) {
        this.a = i7;
        this.c = lyVar;
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
