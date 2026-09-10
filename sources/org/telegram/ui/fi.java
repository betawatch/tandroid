package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fi extends AnimatorListenerAdapter {
    public final /* synthetic */ co a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.l5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ di.h e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ eo h;

    public fi(eo eoVar, co coVar, boolean z10, org.telegram.ui.ActionBar.l5 l5Var, boolean z11, di.h hVar, boolean z12) {
        this.h = eoVar;
        this.a = coVar;
        this.b = z10;
        this.c = l5Var;
        this.d = z11;
        this.e = hVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eo eoVar = this.h;
        if (eoVar.F2.getTag() != null) {
            eoVar.F2.setVisibility(4);
            int G8 = eoVar.G8();
            eoVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - eoVar.M4[0])), false);
        } else {
            eoVar.F2.setAlpha(1.0f);
        }
        eoVar.F2.setTranslationY(0.0f);
        eoVar.D2[0].setTranslationX(0.0f);
        eoVar.D2[1].setTranslationX(0.0f);
        eoVar.F2.setTranslationX(eoVar.G2 + 0.0f);
        co coVar = this.a;
        coVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            coVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        if (!z10) {
            l5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        di.h hVar = this.e;
        if (!z11) {
            hVar.setTranslationY(0.0f);
        }
        eoVar.C2[0].setTranslationX(0.0f);
        eoVar.C2[1].setTranslationX(0.0f);
        eoVar.B2[1].setAlpha(1.0f);
        eoVar.B2[1].setScaleX(1.0f);
        eoVar.B2[1].setScaleY(1.0f);
        eoVar.B2[0].setAlpha(1.0f);
        eoVar.B2[0].setScaleX(1.0f);
        eoVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.l5[] l5VarArr = eoVar.D2;
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[0];
        l5VarArr[1] = l5Var2;
        l5VarArr[0] = l5Var;
        l5Var2.setVisibility(4);
        di.h[] hVarArr = eoVar.E2;
        di.h hVar2 = hVarArr[0];
        hVarArr[1] = hVar2;
        hVarArr[0] = hVar;
        hVar2.setVisibility(4);
        co[] coVarArr = eoVar.C2;
        co coVar2 = coVarArr[0];
        if (coVar != coVar2) {
            coVarArr[1] = coVar2;
            coVarArr[0] = coVar;
            coVar2.setVisibility(4);
        }
        if (this.f) {
            eoVar.B2[1].setImageBitmap(null);
            eoVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = eoVar.B2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        eoVar.B2[1].setScaleX(1.0f);
        eoVar.B2[1].setScaleY(1.0f);
        eoVar.B2[1].setVisibility(4);
        eoVar.H2[0] = null;
        eoVar.A2 = false;
    }
}
