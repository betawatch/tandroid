package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h80 extends s4.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public h80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.l
    public final void P(s4.e1 e1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.nm0 nm0Var = languageSelectActivity.b;
        int i10 = nm0Var.C1;
        if (i10 == -1 || (view = nm0Var.D1) == null) {
            return;
        }
        nm0Var.l1(i10, view);
        nm0Var.invalidate();
    }
}
