package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class a80 extends s4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public a80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.im0 im0Var = languageSelectActivity.b;
        int i10 = im0Var.C1;
        if (i10 == -1 || (view = im0Var.D1) == null) {
            return;
        }
        im0Var.i1(i10, view);
        im0Var.invalidate();
    }
}
