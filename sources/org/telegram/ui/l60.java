package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l60 extends v4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public l60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // v4.k
    public final void P(v4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.qj0 qj0Var = languageSelectActivity.b;
        int i7 = qj0Var.C1;
        if (i7 == -1 || (view = qj0Var.D1) == null) {
            return;
        }
        qj0Var.k1(i7, view);
        qj0Var.invalidate();
    }
}
