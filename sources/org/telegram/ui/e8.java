package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e8 extends AnimatorListenerAdapter {
    public final /* synthetic */ h8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i3, boolean z10) {
        this.h = f8Var;
        this.a = h8Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = i3;
        this.f = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.b;
        h8 h8Var = this.a;
        h8Var.a = f10;
        h8Var.b = this.c;
        h8Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.w;
        int i3 = this.e;
        sparseArray.remove(i3);
        if (this.f) {
            return;
        }
        f8Var.x.remove(i3);
    }
}
