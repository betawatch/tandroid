package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a80 extends f2.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public a80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // f2.l
    public final void P(f2.n1 n1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.jl0 jl0Var = languageSelectActivity.b;
        int i10 = jl0Var.A1;
        if (i10 == -1 || (view = jl0Var.B1) == null) {
            return;
        }
        jl0Var.i1(i10, view);
        jl0Var.invalidate();
    }
}
