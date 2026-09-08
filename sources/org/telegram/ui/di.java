package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class di extends AnimatorListenerAdapter {
    public final /* synthetic */ bo a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ bi.c4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ co h;

    public di(co coVar, bo boVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, bi.c4 c4Var, boolean z12) {
        this.h = coVar;
        this.a = boVar;
        this.b = z10;
        this.c = j5Var;
        this.d = z11;
        this.e = c4Var;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        co coVar = this.h;
        if (coVar.F2.getTag() != null) {
            coVar.F2.setVisibility(4);
            int G8 = coVar.G8();
            coVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - coVar.M4[0])), false);
        } else {
            coVar.F2.setAlpha(1.0f);
        }
        coVar.F2.setTranslationY(0.0f);
        coVar.D2[0].setTranslationX(0.0f);
        coVar.D2[1].setTranslationX(0.0f);
        coVar.F2.setTranslationX(coVar.G2 + 0.0f);
        bo boVar = this.a;
        boVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            boVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        bi.c4 c4Var = this.e;
        if (!z11) {
            c4Var.setTranslationY(0.0f);
        }
        coVar.C2[0].setTranslationX(0.0f);
        coVar.C2[1].setTranslationX(0.0f);
        coVar.B2[1].setAlpha(1.0f);
        coVar.B2[1].setScaleX(1.0f);
        coVar.B2[1].setScaleY(1.0f);
        coVar.B2[0].setAlpha(1.0f);
        coVar.B2[0].setScaleX(1.0f);
        coVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = coVar.D2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        bi.c4[] c4VarArr = coVar.E2;
        bi.c4 c4Var2 = c4VarArr[0];
        c4VarArr[1] = c4Var2;
        c4VarArr[0] = c4Var;
        c4Var2.setVisibility(4);
        bo[] boVarArr = coVar.C2;
        bo boVar2 = boVarArr[0];
        if (boVar != boVar2) {
            boVarArr[1] = boVar2;
            boVarArr[0] = boVar;
            boVar2.setVisibility(4);
        }
        if (this.f) {
            coVar.B2[1].setImageBitmap(null);
            coVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.x9[] x9VarArr = coVar.B2;
        org.telegram.ui.Components.x9 x9Var = x9VarArr[1];
        org.telegram.ui.Components.x9 x9Var2 = x9VarArr[0];
        x9VarArr[1] = x9Var2;
        x9VarArr[0] = x9Var;
        x9Var2.setAlpha(1.0f);
        coVar.B2[1].setScaleX(1.0f);
        coVar.B2[1].setScaleY(1.0f);
        coVar.B2[1].setVisibility(4);
        coVar.H2[0] = null;
        coVar.A2 = false;
    }
}
