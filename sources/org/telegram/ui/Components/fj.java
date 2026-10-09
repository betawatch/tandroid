package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fj extends FragmentContextView {
    public final /* synthetic */ FrameLayout R0;
    public final /* synthetic */ kj S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(kj kjVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, FrameLayout frameLayout2) {
        super(context, n2Var, frameLayout, false, e6Var);
        this.S0 = kjVar;
        this.R0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        this.S0.x.i(this.R0, i10 == 0, true);
    }
}
