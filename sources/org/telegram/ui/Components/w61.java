package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class w61 extends s4.b0 {
    public final /* synthetic */ a71 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(a71 a71Var, int i10) {
        super(i10, false);
        this.I = a71Var;
    }

    @Override // s4.b0
    public final int W0(s4.y0 y0Var) {
        return this.I.Y2 ? AndroidUtilities.displaySize.y : super.W0(y0Var);
    }
}
