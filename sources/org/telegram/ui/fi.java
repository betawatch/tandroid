package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fi extends AnimatorListenerAdapter {
    public final /* synthetic */ tn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ jn e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ un h;

    public fi(un unVar, tn tnVar, boolean z10, org.telegram.ui.ActionBar.u5 u5Var, boolean z11, jn jnVar, boolean z12) {
        this.h = unVar;
        this.a = tnVar;
        this.b = z10;
        this.c = u5Var;
        this.d = z11;
        this.e = jnVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        un unVar = this.h;
        if (unVar.T2.getTag() != null) {
            unVar.T2.setVisibility(4);
            int T8 = unVar.T8();
            unVar.T2.a(Math.min(T8 - 1, Math.max(1, T8 - unVar.Y4[0])), false);
        } else {
            unVar.T2.setAlpha(1.0f);
        }
        unVar.T2.setTranslationY(0.0f);
        unVar.R2[0].setTranslationX(0.0f);
        unVar.R2[1].setTranslationX(0.0f);
        unVar.T2.setTranslationX(unVar.U2 + 0.0f);
        tn tnVar = this.a;
        tnVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            tnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        if (!z10) {
            u5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        jn jnVar = this.e;
        if (!z11) {
            jnVar.setTranslationY(0.0f);
        }
        unVar.Q2[0].setTranslationX(0.0f);
        unVar.Q2[1].setTranslationX(0.0f);
        unVar.P2[1].setAlpha(1.0f);
        unVar.P2[1].setScaleX(1.0f);
        unVar.P2[1].setScaleY(1.0f);
        unVar.P2[0].setAlpha(1.0f);
        unVar.P2[0].setScaleX(1.0f);
        unVar.P2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.u5[] u5VarArr = unVar.R2;
        org.telegram.ui.ActionBar.u5 u5Var2 = u5VarArr[0];
        u5VarArr[1] = u5Var2;
        u5VarArr[0] = u5Var;
        u5Var2.setVisibility(4);
        jn[] jnVarArr = unVar.S2;
        jn jnVar2 = jnVarArr[0];
        jnVarArr[1] = jnVar2;
        jnVarArr[0] = jnVar;
        jnVar2.setVisibility(4);
        tn[] tnVarArr = unVar.Q2;
        tn tnVar2 = tnVarArr[0];
        if (tnVar != tnVar2) {
            tnVarArr[1] = tnVar2;
            tnVarArr[0] = tnVar;
            tnVar2.setVisibility(4);
        }
        if (this.f) {
            unVar.P2[1].setImageBitmap(null);
            unVar.P2[1].setVisibility(4);
        }
        org.telegram.ui.Components.g9[] g9VarArr = unVar.P2;
        org.telegram.ui.Components.g9 g9Var = g9VarArr[1];
        org.telegram.ui.Components.g9 g9Var2 = g9VarArr[0];
        g9VarArr[1] = g9Var2;
        g9VarArr[0] = g9Var;
        g9Var2.setAlpha(1.0f);
        unVar.P2[1].setScaleX(1.0f);
        unVar.P2[1].setScaleY(1.0f);
        unVar.P2[1].setVisibility(4);
        unVar.V2[0] = null;
        unVar.O2 = false;
    }
}
