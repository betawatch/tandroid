package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b8 extends AnimatorListenerAdapter {
    public final /* synthetic */ e8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c8 h;

    public b8(c8 c8Var, e8 e8Var, float f9, float f10, float f11, int i10, boolean z10) {
        this.h = c8Var;
        this.a = e8Var;
        this.b = f9;
        this.c = f10;
        this.d = f11;
        this.e = i10;
        this.f = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f9 = this.b;
        e8 e8Var = this.a;
        e8Var.a = f9;
        e8Var.b = this.c;
        e8Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c8 c8Var = this.h;
        SparseArray sparseArray = c8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (this.f) {
            return;
        }
        c8Var.w.remove(i10);
    }
}
