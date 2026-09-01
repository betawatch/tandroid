package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ i8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ g8 h;

    public f8(g8 g8Var, i8 i8Var, float f10, float f11, float f12, int i10, boolean z4) {
        this.h = g8Var;
        this.a = i8Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = i10;
        this.f = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.b;
        i8 i8Var = this.a;
        i8Var.a = f10;
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
