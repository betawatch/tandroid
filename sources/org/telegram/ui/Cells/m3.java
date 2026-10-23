package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class m3 extends AnimatorListenerAdapter {
    public final /* synthetic */ o3 a;

    public m3(o3 o3Var) {
        this.a = o3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o3 o3Var = this.a;
        if (o3Var.v) {
            o3Var.e.setVisibility(4);
            o3Var.f.setVisibility(4);
            o3Var.h.setVisibility(0);
        } else {
            if (o3Var.s) {
                o3Var.e.setVisibility(4);
            } else {
                o3Var.f.setVisibility(4);
            }
            o3Var.h.setVisibility(8);
        }
    }
}
