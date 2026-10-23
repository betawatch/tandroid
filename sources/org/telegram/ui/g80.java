package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
