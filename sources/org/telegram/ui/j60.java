package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j60 extends v4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public j60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // v4.k
    public final void P(v4.f1 f1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.ck0 ck0Var = languageSelectActivity.b;
        int i7 = ck0Var.D1;
        if (i7 == -1 || (view = ck0Var.E1) == null) {
            return;
        }
        ck0Var.k1(i7, view);
        ck0Var.invalidate();
    }
}
