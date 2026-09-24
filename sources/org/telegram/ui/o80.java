package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class o80 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public o80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = languageSelectActivity.b;
        int i10 = wl0Var.E1;
        if (i10 == -1 || (view = wl0Var.F1) == null) {
            return;
        }
        wl0Var.i1(i10, view);
        wl0Var.invalidate();
    }
}
