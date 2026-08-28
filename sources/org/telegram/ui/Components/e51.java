package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e51 extends f2.m0 {
    public final /* synthetic */ i51 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e51(i51 i51Var, int i9) {
        super(i9, false);
        this.I = i51Var;
    }

    @Override // f2.m0
    public final int W0(f2.n1 n1Var) {
        return this.I.W2 ? AndroidUtilities.displaySize.y : super.W0(n1Var);
    }
}
