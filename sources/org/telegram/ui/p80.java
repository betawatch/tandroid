package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class p80 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public p80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.ml0 ml0Var = languageSelectActivity.b;
        int i10 = ml0Var.E1;
        if (i10 == -1 || (view = ml0Var.F1) == null) {
            return;
        }
        ml0Var.i1(i10, view);
        ml0Var.invalidate();
    }
}
