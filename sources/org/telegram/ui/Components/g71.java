package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g71 extends s4.d0 {
    public final /* synthetic */ k71 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(k71 k71Var, int i10) {
        super(i10, false);
        this.I = k71Var;
    }

    @Override // s4.d0
    public final int W0(s4.a1 a1Var) {
        return this.I.Y2 ? AndroidUtilities.displaySize.y : super.W0(a1Var);
    }
}
