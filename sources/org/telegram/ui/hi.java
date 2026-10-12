package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hi extends AnimatorListenerAdapter {
    public final /* synthetic */ eo a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ bi.f4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ fo h;

    public hi(fo foVar, eo eoVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, bi.f4 f4Var, boolean z12) {
        this.h = foVar;
        this.a = eoVar;
        this.b = z10;
        this.c = h5Var;
        this.d = z11;
        this.e = f4Var;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fo foVar = this.h;
        if (foVar.F2.getTag() != null) {
            foVar.F2.setVisibility(4);
            int L8 = foVar.L8();
            foVar.F2.a(Math.min(L8 - 1, Math.max(1, L8 - foVar.M4[0])), false);
        } else {
            foVar.F2.setAlpha(1.0f);
        }
        foVar.F2.setTranslationY(0.0f);
        foVar.D2[0].setTranslationX(0.0f);
        foVar.D2[1].setTranslationX(0.0f);
        foVar.F2.setTranslationX(foVar.G2 + 0.0f);
        eo eoVar = this.a;
        eoVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            eoVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        bi.f4 f4Var = this.e;
        if (!z11) {
            f4Var.setTranslationY(0.0f);
        }
        foVar.C2[0].setTranslationX(0.0f);
        foVar.C2[1].setTranslationX(0.0f);
        foVar.B2[1].setAlpha(1.0f);
        foVar.B2[1].setScaleX(1.0f);
        foVar.B2[1].setScaleY(1.0f);
        foVar.B2[0].setAlpha(1.0f);
        foVar.B2[0].setScaleX(1.0f);
        foVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = foVar.D2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        bi.f4[] f4VarArr = foVar.E2;
        bi.f4 f4Var2 = f4VarArr[0];
        f4VarArr[1] = f4Var2;
        f4VarArr[0] = f4Var;
        f4Var2.setVisibility(4);
        eo[] eoVarArr = foVar.C2;
        eo eoVar2 = eoVarArr[0];
        if (eoVar != eoVar2) {
            eoVarArr[1] = eoVar2;
            eoVarArr[0] = eoVar;
            eoVar2.setVisibility(4);
        }
        if (this.f) {
            foVar.B2[1].setImageBitmap(null);
            foVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.z9[] z9VarArr = foVar.B2;
        org.telegram.ui.Components.z9 z9Var = z9VarArr[1];
        org.telegram.ui.Components.z9 z9Var2 = z9VarArr[0];
        z9VarArr[1] = z9Var2;
        z9VarArr[0] = z9Var;
        z9Var2.setAlpha(1.0f);
        foVar.B2[1].setScaleX(1.0f);
        foVar.B2[1].setScaleY(1.0f);
        foVar.B2[1].setVisibility(4);
        foVar.H2[0] = null;
        foVar.A2 = false;
    }
}
