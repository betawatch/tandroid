package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n61 extends s4.c0 {
    public final /* synthetic */ r61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(r61 r61Var, int i10) {
        super(i10, false);
        this.I = r61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
