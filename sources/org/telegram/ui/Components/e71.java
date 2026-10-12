package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e71 extends zz {
    public final /* synthetic */ h71 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e71(h71 h71Var, int i10) {
        super(i10, false);
        this.X = h71Var;
    }

    @Override // s4.b0
    public final int W0(s4.y0 y0Var) {
        return this.X.Y2 ? AndroidUtilities.displaySize.y : super.W0(y0Var);
    }
}
