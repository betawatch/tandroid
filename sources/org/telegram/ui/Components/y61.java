package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class y61 extends s4.b0 {
    public final /* synthetic */ c71 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(c71 c71Var, int i10) {
        super(i10, false);
        this.I = c71Var;
    }

    @Override // s4.b0
    public final int W0(s4.y0 y0Var) {
        return this.I.Y2 ? AndroidUtilities.displaySize.y : super.W0(y0Var);
    }
}
