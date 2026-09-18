package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ i8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ g8 h;

    public f8(g8 g8Var, i8 i8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = g8Var;
        this.a = i8Var;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = i10;
        this.f = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.b;
        i8 i8Var = this.a;
        i8Var.a = f7;
        i8Var.b = this.c;
        i8Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (this.f) {
            return;
        }
        g8Var.w.remove(i10);
    }
}
