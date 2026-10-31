package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h70 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public h70(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.tk0 tk0Var = languageSelectActivity.b;
        int i10 = tk0Var.C1;
        if (i10 == -1 || (view = tk0Var.D1) == null) {
            return;
        }
        tk0Var.k1(i10, view);
        tk0Var.invalidate();
    }
}
