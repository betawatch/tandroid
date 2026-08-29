package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q51 extends f2.j0 {
    public final /* synthetic */ u51 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(u51 u51Var, int i10) {
        super(i10, false);
        this.I = u51Var;
    }

    @Override // f2.j0
    public final int W0(f2.k1 k1Var) {
        return this.I.W2 ? AndroidUtilities.displaySize.y : super.W0(k1Var);
    }
}
