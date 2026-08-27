package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h51 extends bz {
    public final /* synthetic */ k51 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h51(k51 k51Var, int i10) {
        super(i10, false);
        this.X = k51Var;
    }

    @Override // f2.k0
    public final int W0(f2.l1 l1Var) {
        return this.X.W2 ? AndroidUtilities.displaySize.y : super.W0(l1Var);
    }
}
