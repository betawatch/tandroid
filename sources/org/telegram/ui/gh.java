package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gh extends AnimatorListenerAdapter {
    public final /* synthetic */ vm a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ lm e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ wm h;

    public gh(wm wmVar, vm vmVar, boolean z10, org.telegram.ui.ActionBar.k5 k5Var, boolean z11, lm lmVar, boolean z12) {
        this.h = wmVar;
        this.a = vmVar;
        this.b = z10;
        this.c = k5Var;
        this.d = z11;
        this.e = lmVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wm wmVar = this.h;
        if (wmVar.U2.getTag() != null) {
            wmVar.U2.setVisibility(4);
            int a92 = wmVar.a9();
            wmVar.U2.a(Math.min(a92 - 1, Math.max(1, a92 - wmVar.Z4[0])), false);
        } else {
            wmVar.U2.setAlpha(1.0f);
        }
        wmVar.U2.setTranslationY(0.0f);
        wmVar.S2[0].setTranslationX(0.0f);
        wmVar.S2[1].setTranslationX(0.0f);
        wmVar.U2.setTranslationX(wmVar.V2 + 0.0f);
        vm vmVar = this.a;
        vmVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            vmVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (!z10) {
            k5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        lm lmVar = this.e;
        if (!z11) {
            lmVar.setTranslationY(0.0f);
        }
        wmVar.R2[0].setTranslationX(0.0f);
        wmVar.R2[1].setTranslationX(0.0f);
        wmVar.Q2[1].setAlpha(1.0f);
        wmVar.Q2[1].setScaleX(1.0f);
        wmVar.Q2[1].setScaleY(1.0f);
        wmVar.Q2[0].setAlpha(1.0f);
        wmVar.Q2[0].setScaleX(1.0f);
        wmVar.Q2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.k5[] k5VarArr = wmVar.S2;
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[0];
        k5VarArr[1] = k5Var2;
        k5VarArr[0] = k5Var;
        k5Var2.setVisibility(4);
        lm[] lmVarArr = wmVar.T2;
        lm lmVar2 = lmVarArr[0];
        lmVarArr[1] = lmVar2;
        lmVarArr[0] = lmVar;
        lmVar2.setVisibility(4);
        vm[] vmVarArr = wmVar.R2;
        vm vmVar2 = vmVarArr[0];
        if (vmVar != vmVar2) {
            vmVarArr[1] = vmVar2;
            vmVarArr[0] = vmVar;
            vmVar2.setVisibility(4);
        }
        if (this.f) {
            wmVar.Q2[1].setImageBitmap(null);
            wmVar.Q2[1].setVisibility(4);
        }
        org.telegram.ui.Components.k9[] k9VarArr = wmVar.Q2;
        org.telegram.ui.Components.k9 k9Var = k9VarArr[1];
        org.telegram.ui.Components.k9 k9Var2 = k9VarArr[0];
        k9VarArr[1] = k9Var2;
        k9VarArr[0] = k9Var;
        k9Var2.setAlpha(1.0f);
        wmVar.Q2[1].setScaleX(1.0f);
        wmVar.Q2[1].setScaleY(1.0f);
        wmVar.Q2[1].setVisibility(4);
        wmVar.W2[0] = null;
        wmVar.P2 = false;
    }
}
