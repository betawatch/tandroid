package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j60 extends v4.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public j60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // v4.l
    public final void P(v4.f1 f1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.ek0 ek0Var = languageSelectActivity.b;
        int i7 = ek0Var.D1;
        if (i7 == -1 || (view = ek0Var.E1) == null) {
            return;
        }
        ek0Var.k1(i7, view);
        ek0Var.invalidate();
    }
}
