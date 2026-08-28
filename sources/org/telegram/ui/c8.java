package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c8 extends AnimatorListenerAdapter {
    public final /* synthetic */ f8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ d8 h;

    public c8(d8 d8Var, f8 f8Var, float f10, float f11, float f12, int i9, boolean z10) {
        this.h = d8Var;
        this.a = f8Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = i9;
        this.f = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.b;
        f8 f8Var = this.a;
        f8Var.a = f10;
        f8Var.b = this.c;
        f8Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d8 d8Var = this.h;
        SparseArray sparseArray = d8Var.v;
        int i9 = this.e;
        sparseArray.remove(i9);
        if (this.f) {
            return;
        }
        d8Var.w.remove(i9);
    }
}
