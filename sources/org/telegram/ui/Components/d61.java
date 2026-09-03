package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d61 extends pz {
    public final /* synthetic */ h61 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(h61 h61Var, int i10) {
        super(i10, false);
        this.X = h61Var;
    }

    @Override // f2.j0
    public final int W0(f2.j1 j1Var) {
        return this.X.X2 ? AndroidUtilities.displaySize.y : super.W0(j1Var);
    }
}
