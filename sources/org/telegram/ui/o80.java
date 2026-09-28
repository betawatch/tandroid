package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class o80 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public o80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.yl0 yl0Var = languageSelectActivity.b;
        int i10 = yl0Var.E1;
        if (i10 == -1 || (view = yl0Var.F1) == null) {
            return;
        }
        yl0Var.i1(i10, view);
        yl0Var.invalidate();
    }
}
