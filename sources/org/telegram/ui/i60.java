package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i60 extends v4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public i60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // v4.k
    public final void P(v4.e1 e1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.uj0 uj0Var = languageSelectActivity.b;
        int i7 = uj0Var.D1;
        if (i7 == -1 || (view = uj0Var.E1) == null) {
            return;
        }
        uj0Var.k1(i7, view);
        uj0Var.invalidate();
    }
}
