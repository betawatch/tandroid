package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m60 extends v4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public m60(LanguageSelectActivity languageSelectActivity) {
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
