package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k80 extends f2.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public k80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // f2.l
    public final void P(f2.m1 m1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.tl0 tl0Var = languageSelectActivity.b;
        int i10 = tl0Var.B1;
        if (i10 == -1 || (view = tl0Var.C1) == null) {
            return;
        }
        tl0Var.i1(i10, view);
        tl0Var.invalidate();
    }
}
