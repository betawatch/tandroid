package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class c80 extends s4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public c80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.im0 im0Var = languageSelectActivity.b;
        int i10 = im0Var.C1;
        if (i10 == -1 || (view = im0Var.D1) == null) {
            return;
        }
        im0Var.i1(i10, view);
        im0Var.invalidate();
    }
}
