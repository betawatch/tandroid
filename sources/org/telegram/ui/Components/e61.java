package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e61 extends pz {
    public final /* synthetic */ i61 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(i61 i61Var, int i10) {
        super(i10, false);
        this.X = i61Var;
    }

    @Override // f2.j0
    public final int W0(f2.j1 j1Var) {
        return this.X.X2 ? AndroidUtilities.displaySize.y : super.W0(j1Var);
    }
}
