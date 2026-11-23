package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kh extends AnimatorListenerAdapter {
    public final /* synthetic */ an a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qm e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ bn h;

    public kh(bn bnVar, an anVar, boolean z10, org.telegram.ui.ActionBar.n5 n5Var, boolean z11, qm qmVar, boolean z12) {
        this.h = bnVar;
        this.a = anVar;
        this.b = z10;
        this.c = n5Var;
        this.d = z11;
        this.e = qmVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bn bnVar = this.h;
        if (bnVar.U2.getTag() != null) {
            bnVar.U2.setVisibility(4);
            int c92 = bnVar.c9();
            bnVar.U2.a(Math.min(c92 - 1, Math.max(1, c92 - bnVar.a5[0])), false);
        } else {
            bnVar.U2.setAlpha(1.0f);
        }
        bnVar.U2.setTranslationY(0.0f);
        bnVar.S2[0].setTranslationX(0.0f);
        bnVar.S2[1].setTranslationX(0.0f);
        bnVar.U2.setTranslationX(bnVar.V2 + 0.0f);
        an anVar = this.a;
        anVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            anVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        if (!z10) {
            n5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        qm qmVar = this.e;
        if (!z11) {
            qmVar.setTranslationY(0.0f);
        }
        bnVar.R2[0].setTranslationX(0.0f);
        bnVar.R2[1].setTranslationX(0.0f);
        bnVar.Q2[1].setAlpha(1.0f);
        bnVar.Q2[1].setScaleX(1.0f);
        bnVar.Q2[1].setScaleY(1.0f);
        bnVar.Q2[0].setAlpha(1.0f);
        bnVar.Q2[0].setScaleX(1.0f);
        bnVar.Q2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.n5[] n5VarArr = bnVar.S2;
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[0];
        n5VarArr[1] = n5Var2;
        n5VarArr[0] = n5Var;
        n5Var2.setVisibility(4);
        qm[] qmVarArr = bnVar.T2;
        qm qmVar2 = qmVarArr[0];
        qmVarArr[1] = qmVar2;
        qmVarArr[0] = qmVar;
        qmVar2.setVisibility(4);
        an[] anVarArr = bnVar.R2;
        an anVar2 = anVarArr[0];
        if (anVar != anVar2) {
            anVarArr[1] = anVar2;
            anVarArr[0] = anVar;
            anVar2.setVisibility(4);
        }
        if (this.f) {
            bnVar.Q2[1].setImageBitmap(null);
            bnVar.Q2[1].setVisibility(4);
        }
        org.telegram.ui.Components.p9[] p9VarArr = bnVar.Q2;
        org.telegram.ui.Components.p9 p9Var = p9VarArr[1];
        org.telegram.ui.Components.p9 p9Var2 = p9VarArr[0];
        p9VarArr[1] = p9Var2;
        p9VarArr[0] = p9Var;
        p9Var2.setAlpha(1.0f);
        bnVar.Q2[1].setScaleX(1.0f);
        bnVar.Q2[1].setScaleY(1.0f);
        bnVar.Q2[1].setVisibility(4);
        bnVar.W2[0] = null;
        bnVar.P2 = false;
    }
}
