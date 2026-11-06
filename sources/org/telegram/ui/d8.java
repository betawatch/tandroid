package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d8 extends AnimatorListenerAdapter {
    public final /* synthetic */ g8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ e8 h;

    public d8(e8 e8Var, g8 g8Var, float f10, float f11, float f12, int i7, boolean z9) {
        this.h = e8Var;
        this.a = g8Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = i7;
        this.f = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.b;
        g8 g8Var = this.a;
        g8Var.a = f10;
        g8Var.b = this.c;
        g8Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.w;
        int i7 = this.e;
        sparseArray.remove(i7);
        if (this.f) {
            return;
        }
        e8Var.x.remove(i7);
    }
}
