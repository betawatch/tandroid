package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bi extends AnimatorListenerAdapter {
    public final /* synthetic */ yn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gg.q e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ zn h;

    public bi(zn znVar, yn ynVar, boolean z4, org.telegram.ui.ActionBar.k5 k5Var, boolean z10, gg.q qVar, boolean z11) {
        this.h = znVar;
        this.a = ynVar;
        this.b = z4;
        this.c = k5Var;
        this.d = z10;
        this.e = qVar;
        this.f = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zn znVar = this.h;
        if (znVar.C2.getTag() != null) {
            znVar.C2.setVisibility(4);
            int G8 = znVar.G8();
            znVar.C2.a(Math.min(G8 - 1, Math.max(1, G8 - znVar.J4[0])), false);
        } else {
            znVar.C2.setAlpha(1.0f);
        }
        znVar.C2.setTranslationY(0.0f);
        znVar.A2[0].setTranslationX(0.0f);
        znVar.A2[1].setTranslationX(0.0f);
        znVar.C2.setTranslationX(znVar.D2 + 0.0f);
        yn ynVar = this.a;
        ynVar.setTranslationY(0.0f);
        boolean z4 = this.b;
        if (!z4) {
            ynVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (!z4) {
            k5Var.setTranslationY(0.0f);
        }
        boolean z10 = this.d;
        gg.q qVar = this.e;
        if (!z10) {
            qVar.setTranslationY(0.0f);
        }
        znVar.z2[0].setTranslationX(0.0f);
        znVar.z2[1].setTranslationX(0.0f);
        znVar.y2[1].setAlpha(1.0f);
        znVar.y2[1].setScaleX(1.0f);
        znVar.y2[1].setScaleY(1.0f);
        znVar.y2[0].setAlpha(1.0f);
        znVar.y2[0].setScaleX(1.0f);
        znVar.y2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.k5[] k5VarArr = znVar.A2;
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[0];
        k5VarArr[1] = k5Var2;
        k5VarArr[0] = k5Var;
        k5Var2.setVisibility(4);
        gg.q[] qVarArr = znVar.B2;
        gg.q qVar2 = qVarArr[0];
        qVarArr[1] = qVar2;
        qVarArr[0] = qVar;
        qVar2.setVisibility(4);
        yn[] ynVarArr = znVar.z2;
        yn ynVar2 = ynVarArr[0];
        if (ynVar != ynVar2) {
            ynVarArr[1] = ynVar2;
            ynVarArr[0] = ynVar;
            ynVar2.setVisibility(4);
        }
        if (this.f) {
            znVar.y2[1].setImageBitmap(null);
            znVar.y2[1].setVisibility(4);
        }
        org.telegram.ui.Components.p9[] p9VarArr = znVar.y2;
        org.telegram.ui.Components.p9 p9Var = p9VarArr[1];
        org.telegram.ui.Components.p9 p9Var2 = p9VarArr[0];
        p9VarArr[1] = p9Var2;
        p9VarArr[0] = p9Var;
        p9Var2.setAlpha(1.0f);
        znVar.y2[1].setScaleX(1.0f);
        znVar.y2[1].setScaleY(1.0f);
        znVar.y2[1].setVisibility(4);
        znVar.E2[0] = null;
        znVar.x2 = false;
    }
}
