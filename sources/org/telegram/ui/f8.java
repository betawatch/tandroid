package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ i8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ g8 h;

    public f8(g8 g8Var, i8 i8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = g8Var;
        this.a = i8Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = i7;
        this.f = z10;
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
        SparseArray sparseArray = g8Var.w;
        int i7 = this.e;
        sparseArray.remove(i7);
        if (this.f) {
            return;
        }
        g8Var.x.remove(i7);
    }
}
