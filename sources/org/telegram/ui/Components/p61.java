package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class p61 extends s4.c0 {
    public final /* synthetic */ t61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(t61 t61Var, int i10) {
        super(i10, false);
        this.I = t61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
