package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o61 extends uz {
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
