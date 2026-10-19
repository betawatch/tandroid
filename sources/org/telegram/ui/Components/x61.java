package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x61 extends s4.b0 {
    public final /* synthetic */ b71 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(b71 b71Var, int i10) {
        super(i10, false);
        this.I = b71Var;
    }

    @Override // s4.b0
    public final int W0(s4.y0 y0Var) {
        return this.I.Y2 ? AndroidUtilities.displaySize.y : super.W0(y0Var);
    }
}
