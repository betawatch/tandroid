package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c61 extends f2.i0 {
    public final /* synthetic */ g61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(g61 g61Var, int i10) {
        super(i10, false);
        this.I = g61Var;
    }

    @Override // f2.i0
    public final int W0(f2.i1 i1Var) {
        return this.I.X2 ? AndroidUtilities.displaySize.y : super.W0(i1Var);
    }
}
