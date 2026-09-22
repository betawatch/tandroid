package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q61 extends s4.c0 {
    public final /* synthetic */ u61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q61(u61 u61Var, int i10) {
        super(i10, false);
        this.I = u61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
