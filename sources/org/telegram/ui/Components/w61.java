package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
