package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j80 extends f2.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public j80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // f2.l
    public final void P(f2.l1 l1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.sl0 sl0Var = languageSelectActivity.b;
        int i10 = sl0Var.B1;
        if (i10 == -1 || (view = sl0Var.C1) == null) {
            return;
        }
        sl0Var.i1(i10, view);
        sl0Var.invalidate();
    }
}
