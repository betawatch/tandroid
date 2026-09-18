package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class q61 extends nz {
    public final /* synthetic */ t61 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q61(t61 t61Var, int i10) {
        super(i10, false);
        this.X = t61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.X.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
