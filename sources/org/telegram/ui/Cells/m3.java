package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
