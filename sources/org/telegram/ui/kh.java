package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kh extends AnimatorListenerAdapter {
    public final /* synthetic */ zm a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ pm e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ an h;

    public kh(an anVar, zm zmVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, pm pmVar, boolean z12) {
        this.h = anVar;
        this.a = zmVar;
        this.b = z10;
        this.c = j5Var;
        this.d = z11;
        this.e = pmVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        an anVar = this.h;
        if (anVar.U2.getTag() != null) {
            anVar.U2.setVisibility(4);
            int c92 = anVar.c9();
            anVar.U2.a(Math.min(c92 - 1, Math.max(1, c92 - anVar.Z4[0])), false);
        } else {
            anVar.U2.setAlpha(1.0f);
        }
        anVar.U2.setTranslationY(0.0f);
        anVar.S2[0].setTranslationX(0.0f);
        anVar.S2[1].setTranslationX(0.0f);
        anVar.U2.setTranslationX(anVar.V2 + 0.0f);
        zm zmVar = this.a;
        zmVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            zmVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        pm pmVar = this.e;
        if (!z11) {
            pmVar.setTranslationY(0.0f);
        }
        anVar.R2[0].setTranslationX(0.0f);
        anVar.R2[1].setTranslationX(0.0f);
        anVar.Q2[1].setAlpha(1.0f);
        anVar.Q2[1].setScaleX(1.0f);
        anVar.Q2[1].setScaleY(1.0f);
        anVar.Q2[0].setAlpha(1.0f);
        anVar.Q2[0].setScaleX(1.0f);
        anVar.Q2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = anVar.S2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        pm[] pmVarArr = anVar.T2;
        pm pmVar2 = pmVarArr[0];
        pmVarArr[1] = pmVar2;
        pmVarArr[0] = pmVar;
        pmVar2.setVisibility(4);
        zm[] zmVarArr = anVar.R2;
        zm zmVar2 = zmVarArr[0];
        if (zmVar != zmVar2) {
            zmVarArr[1] = zmVar2;
            zmVarArr[0] = zmVar;
            zmVar2.setVisibility(4);
        }
        if (this.f) {
            anVar.Q2[1].setImageBitmap(null);
            anVar.Q2[1].setVisibility(4);
        }
        org.telegram.ui.Components.i9[] i9VarArr = anVar.Q2;
        org.telegram.ui.Components.i9 i9Var = i9VarArr[1];
        org.telegram.ui.Components.i9 i9Var2 = i9VarArr[0];
        i9VarArr[1] = i9Var2;
        i9VarArr[0] = i9Var;
        i9Var2.setAlpha(1.0f);
        anVar.Q2[1].setScaleX(1.0f);
        anVar.Q2[1].setScaleY(1.0f);
        anVar.Q2[1].setVisibility(4);
        anVar.W2[0] = null;
        anVar.P2 = false;
    }
}
