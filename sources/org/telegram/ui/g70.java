package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g70 extends s4.j {
    public final /* synthetic */ LanguageSelectActivity F;

    public g70(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.uk0 uk0Var = languageSelectActivity.b;
        int i10 = uk0Var.C1;
        if (i10 == -1 || (view = uk0Var.D1) == null) {
            return;
        }
        uk0Var.k1(i10, view);
        uk0Var.invalidate();
    }
}
