package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h8 extends AnimatorListenerAdapter {
    public final /* synthetic */ k8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ i8 h;

    public h8(i8 i8Var, k8 k8Var, float f10, float f11, float f12, int i10, boolean z4) {
        this.h = i8Var;
        this.a = k8Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = i10;
        this.f = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.b;
        k8 k8Var = this.a;
        k8Var.a = f10;
        k8Var.b = this.c;
        k8Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i8 i8Var = this.h;
        SparseArray sparseArray = i8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (this.f) {
            return;
        }
        i8Var.w.remove(i10);
    }
}
