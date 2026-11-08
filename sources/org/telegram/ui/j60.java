package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j60 extends v4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public j60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // v4.k
    public final void P(v4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.pj0 pj0Var = languageSelectActivity.b;
        int i7 = pj0Var.C1;
        if (i7 == -1 || (view = pj0Var.D1) == null) {
            return;
        }
        pj0Var.k1(i7, view);
        pj0Var.invalidate();
    }
}
