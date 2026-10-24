package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class g80 extends s4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public g80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.mm0 mm0Var = languageSelectActivity.b;
        int i10 = mm0Var.C1;
        if (i10 == -1 || (view = mm0Var.D1) == null) {
            return;
        }
        mm0Var.k1(i10, view);
        mm0Var.invalidate();
    }
}
