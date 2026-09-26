package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ai extends AnimatorListenerAdapter {
    public final /* synthetic */ vn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ai.p4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ wn h;

    public ai(wn wnVar, vn vnVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, ai.p4 p4Var, boolean z12) {
        this.h = wnVar;
        this.a = vnVar;
        this.b = z10;
        this.c = h5Var;
        this.d = z11;
        this.e = p4Var;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wn wnVar = this.h;
        if (wnVar.F2.getTag() != null) {
            wnVar.F2.setVisibility(4);
            int G8 = wnVar.G8();
            wnVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - wnVar.M4[0])), false);
        } else {
            wnVar.F2.setAlpha(1.0f);
        }
        wnVar.F2.setTranslationY(0.0f);
        wnVar.D2[0].setTranslationX(0.0f);
        wnVar.D2[1].setTranslationX(0.0f);
        wnVar.F2.setTranslationX(wnVar.G2 + 0.0f);
        vn vnVar = this.a;
        vnVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            vnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.p4 p4Var = this.e;
        if (!z11) {
            p4Var.setTranslationY(0.0f);
        }
        wnVar.C2[0].setTranslationX(0.0f);
        wnVar.C2[1].setTranslationX(0.0f);
        wnVar.B2[1].setAlpha(1.0f);
        wnVar.B2[1].setScaleX(1.0f);
        wnVar.B2[1].setScaleY(1.0f);
        wnVar.B2[0].setAlpha(1.0f);
        wnVar.B2[0].setScaleX(1.0f);
        wnVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = wnVar.D2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        ai.p4[] p4VarArr = wnVar.E2;
        ai.p4 p4Var2 = p4VarArr[0];
        p4VarArr[1] = p4Var2;
        p4VarArr[0] = p4Var;
        p4Var2.setVisibility(4);
        vn[] vnVarArr = wnVar.C2;
        vn vnVar2 = vnVarArr[0];
        if (vnVar != vnVar2) {
            vnVarArr[1] = vnVar2;
            vnVarArr[0] = vnVar;
            vnVar2.setVisibility(4);
        }
        if (this.f) {
            wnVar.B2[1].setImageBitmap(null);
            wnVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = wnVar.B2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        wnVar.B2[1].setScaleX(1.0f);
        wnVar.B2[1].setScaleY(1.0f);
        wnVar.B2[1].setVisibility(4);
        wnVar.H2[0] = null;
        wnVar.A2 = false;
    }
}
