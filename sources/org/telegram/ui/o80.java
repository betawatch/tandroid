package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
