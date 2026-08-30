package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d61 extends nz {
    public final /* synthetic */ g61 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(g61 g61Var, int i10) {
        super(i10, false);
        this.X = g61Var;
    }

    @Override // f2.i0
    public final int W0(f2.i1 i1Var) {
        return this.X.X2 ? AndroidUtilities.displaySize.y : super.W0(i1Var);
    }
}
