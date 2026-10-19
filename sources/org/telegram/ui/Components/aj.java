package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class aj extends FragmentContextView {
    public final /* synthetic */ FrameLayout R0;
    public final /* synthetic */ fj S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(fj fjVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout2) {
        super(context, n2Var, frameLayout, false, d6Var);
        this.S0 = fjVar;
        this.R0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        this.S0.x.i(this.R0, i10 == 0, true);
    }
}
