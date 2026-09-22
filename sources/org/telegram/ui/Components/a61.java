package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a61 extends s4.c0 {
    public final /* synthetic */ e61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(e61 e61Var, int i10) {
        super(i10, false);
        this.I = e61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
