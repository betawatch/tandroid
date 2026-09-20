package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e8 extends AnimatorListenerAdapter {
    public final /* synthetic */ h8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ f8 h;

    public e8(f8 f8Var, h8 h8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = f8Var;
        this.a = h8Var;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = i10;
        this.f = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.b;
        h8 h8Var = this.a;
        h8Var.a = f7;
        h8Var.b = this.c;
        h8Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (this.f) {
            return;
        }
        f8Var.w.remove(i10);
    }
}
