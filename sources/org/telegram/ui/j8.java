package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j8 extends AnimatorListenerAdapter {
    public final /* synthetic */ m8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ k8 h;

    public j8(k8 k8Var, m8 m8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = k8Var;
        this.a = m8Var;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = i10;
        this.f = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.b;
        m8 m8Var = this.a;
        m8Var.a = f7;
        m8Var.b = this.c;
        m8Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k8 k8Var = this.h;
        SparseArray sparseArray = k8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (this.f) {
            return;
        }
        k8Var.w.remove(i10);
    }
}
