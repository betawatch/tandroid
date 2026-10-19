package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class v extends s4.k {
    public final /* synthetic */ y F;

    public v(y yVar) {
        this.F = yVar;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
