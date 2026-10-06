package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ci extends AnimatorListenerAdapter {
    public final /* synthetic */ xn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ai.p4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ yn h;

    public ci(yn ynVar, xn xnVar, boolean z10, org.telegram.ui.ActionBar.i5 i5Var, boolean z11, ai.p4 p4Var, boolean z12) {
        this.h = ynVar;
        this.a = xnVar;
        this.b = z10;
        this.c = i5Var;
        this.d = z11;
        this.e = p4Var;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yn ynVar = this.h;
        if (ynVar.D2.getTag() != null) {
            ynVar.D2.setVisibility(4);
            int H8 = ynVar.H8();
            ynVar.D2.a(Math.min(H8 - 1, Math.max(1, H8 - ynVar.K4[0])), false);
        } else {
            ynVar.D2.setAlpha(1.0f);
        }
        ynVar.D2.setTranslationY(0.0f);
        ynVar.B2[0].setTranslationX(0.0f);
        ynVar.B2[1].setTranslationX(0.0f);
        ynVar.D2.setTranslationX(ynVar.E2 + 0.0f);
        xn xnVar = this.a;
        xnVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            xnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.c;
        if (!z10) {
            i5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.p4 p4Var = this.e;
        if (!z11) {
            p4Var.setTranslationY(0.0f);
        }
        ynVar.A2[0].setTranslationX(0.0f);
        ynVar.A2[1].setTranslationX(0.0f);
        ynVar.z2[1].setAlpha(1.0f);
        ynVar.z2[1].setScaleX(1.0f);
        ynVar.z2[1].setScaleY(1.0f);
        ynVar.z2[0].setAlpha(1.0f);
        ynVar.z2[0].setScaleX(1.0f);
        ynVar.z2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.i5[] i5VarArr = ynVar.B2;
        org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[0];
        i5VarArr[1] = i5Var2;
        i5VarArr[0] = i5Var;
        i5Var2.setVisibility(4);
        ai.p4[] p4VarArr = ynVar.C2;
        ai.p4 p4Var2 = p4VarArr[0];
        p4VarArr[1] = p4Var2;
        p4VarArr[0] = p4Var;
        p4Var2.setVisibility(4);
        xn[] xnVarArr = ynVar.A2;
        xn xnVar2 = xnVarArr[0];
        if (xnVar != xnVar2) {
            xnVarArr[1] = xnVar2;
            xnVarArr[0] = xnVar;
            xnVar2.setVisibility(4);
        }
        if (this.f) {
            ynVar.z2[1].setImageBitmap(null);
            ynVar.z2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = ynVar.z2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        ynVar.z2[1].setScaleX(1.0f);
        ynVar.z2[1].setScaleY(1.0f);
        ynVar.z2[1].setVisibility(4);
        ynVar.F2[0] = null;
        ynVar.y2 = false;
    }
}
