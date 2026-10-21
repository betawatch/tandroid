package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class a80 extends s4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public a80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.jm0 jm0Var = languageSelectActivity.b;
        int i10 = jm0Var.C1;
        if (i10 == -1 || (view = jm0Var.D1) == null) {
            return;
        }
        jm0Var.i1(i10, view);
        jm0Var.invalidate();
    }
}
