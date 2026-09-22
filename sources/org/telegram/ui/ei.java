package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ei extends AnimatorListenerAdapter {
    public final /* synthetic */ yn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ai.p4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ zn h;

    public ei(zn znVar, yn ynVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, ai.p4 p4Var, boolean z12) {
        this.h = znVar;
        this.a = ynVar;
        this.b = z10;
        this.c = j5Var;
        this.d = z11;
        this.e = p4Var;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zn znVar = this.h;
        if (znVar.F2.getTag() != null) {
            znVar.F2.setVisibility(4);
            int G8 = znVar.G8();
            znVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - znVar.M4[0])), false);
        } else {
            znVar.F2.setAlpha(1.0f);
        }
        znVar.F2.setTranslationY(0.0f);
        znVar.D2[0].setTranslationX(0.0f);
        znVar.D2[1].setTranslationX(0.0f);
        znVar.F2.setTranslationX(znVar.G2 + 0.0f);
        yn ynVar = this.a;
        ynVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            ynVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.p4 p4Var = this.e;
        if (!z11) {
            p4Var.setTranslationY(0.0f);
        }
        znVar.C2[0].setTranslationX(0.0f);
        znVar.C2[1].setTranslationX(0.0f);
        znVar.B2[1].setAlpha(1.0f);
        znVar.B2[1].setScaleX(1.0f);
        znVar.B2[1].setScaleY(1.0f);
        znVar.B2[0].setAlpha(1.0f);
        znVar.B2[0].setScaleX(1.0f);
        znVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = znVar.D2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        ai.p4[] p4VarArr = znVar.E2;
        ai.p4 p4Var2 = p4VarArr[0];
        p4VarArr[1] = p4Var2;
        p4VarArr[0] = p4Var;
        p4Var2.setVisibility(4);
        yn[] ynVarArr = znVar.C2;
        yn ynVar2 = ynVarArr[0];
        if (ynVar != ynVar2) {
            ynVarArr[1] = ynVar2;
            ynVarArr[0] = ynVar;
            ynVar2.setVisibility(4);
        }
        if (this.f) {
            znVar.B2[1].setImageBitmap(null);
            znVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.v9[] v9VarArr = znVar.B2;
        org.telegram.ui.Components.v9 v9Var = v9VarArr[1];
        org.telegram.ui.Components.v9 v9Var2 = v9VarArr[0];
        v9VarArr[1] = v9Var2;
        v9VarArr[0] = v9Var;
        v9Var2.setAlpha(1.0f);
        znVar.B2[1].setScaleX(1.0f);
        znVar.B2[1].setScaleY(1.0f);
        znVar.B2[1].setVisibility(4);
        znVar.H2[0] = null;
        znVar.A2 = false;
    }
}
