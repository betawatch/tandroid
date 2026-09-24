package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class o61 extends oz {
    public final /* synthetic */ r61 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(r61 r61Var, int i10) {
        super(i10, false);
        this.X = r61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.X.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
