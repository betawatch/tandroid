package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
