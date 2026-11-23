package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k60 extends v4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public k60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // v4.k
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
