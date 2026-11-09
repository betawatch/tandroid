package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mh extends AnimatorListenerAdapter {
    public final /* synthetic */ bn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.l5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ rm e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ cn h;

    public mh(cn cnVar, bn bnVar, boolean z9, org.telegram.ui.ActionBar.l5 l5Var, boolean z10, rm rmVar, boolean z11) {
        this.h = cnVar;
        this.a = bnVar;
        this.b = z9;
        this.c = l5Var;
        this.d = z10;
        this.e = rmVar;
        this.f = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cn cnVar = this.h;
        if (cnVar.T2.getTag() != null) {
            cnVar.T2.setVisibility(4);
            int b92 = cnVar.b9();
            cnVar.T2.a(Math.min(b92 - 1, Math.max(1, b92 - cnVar.Y4[0])), false);
        } else {
            cnVar.T2.setAlpha(1.0f);
        }
        cnVar.T2.setTranslationY(0.0f);
        cnVar.R2[0].setTranslationX(0.0f);
        cnVar.R2[1].setTranslationX(0.0f);
        cnVar.T2.setTranslationX(cnVar.U2 + 0.0f);
        bn bnVar = this.a;
        bnVar.setTranslationY(0.0f);
        boolean z9 = this.b;
        if (!z9) {
            bnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        if (!z9) {
            l5Var.setTranslationY(0.0f);
        }
        boolean z10 = this.d;
        rm rmVar = this.e;
        if (!z10) {
            rmVar.setTranslationY(0.0f);
        }
        cnVar.Q2[0].setTranslationX(0.0f);
        cnVar.Q2[1].setTranslationX(0.0f);
        cnVar.P2[1].setAlpha(1.0f);
        cnVar.P2[1].setScaleX(1.0f);
        cnVar.P2[1].setScaleY(1.0f);
        cnVar.P2[0].setAlpha(1.0f);
        cnVar.P2[0].setScaleX(1.0f);
        cnVar.P2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.l5[] l5VarArr = cnVar.R2;
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[0];
        l5VarArr[1] = l5Var2;
        l5VarArr[0] = l5Var;
        l5Var2.setVisibility(4);
        rm[] rmVarArr = cnVar.S2;
        rm rmVar2 = rmVarArr[0];
        rmVarArr[1] = rmVar2;
        rmVarArr[0] = rmVar;
        rmVar2.setVisibility(4);
        bn[] bnVarArr = cnVar.Q2;
        bn bnVar2 = bnVarArr[0];
        if (bnVar != bnVar2) {
            bnVarArr[1] = bnVar2;
            bnVarArr[0] = bnVar;
            bnVar2.setVisibility(4);
        }
        if (this.f) {
            cnVar.P2[1].setImageBitmap(null);
            cnVar.P2[1].setVisibility(4);
        }
        org.telegram.ui.Components.l9[] l9VarArr = cnVar.P2;
        org.telegram.ui.Components.l9 l9Var = l9VarArr[1];
        org.telegram.ui.Components.l9 l9Var2 = l9VarArr[0];
        l9VarArr[1] = l9Var2;
        l9VarArr[0] = l9Var;
        l9Var2.setAlpha(1.0f);
        cnVar.P2[1].setScaleX(1.0f);
        cnVar.P2[1].setScaleY(1.0f);
        cnVar.P2[1].setVisibility(4);
        cnVar.V2[0] = null;
        cnVar.O2 = false;
    }
}
