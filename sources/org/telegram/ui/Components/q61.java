package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class q61 extends pz {
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
