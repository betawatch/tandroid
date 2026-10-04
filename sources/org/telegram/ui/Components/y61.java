package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class y61 extends s4.c0 {
    public final /* synthetic */ c71 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(c71 c71Var, int i10) {
        super(i10, false);
        this.I = c71Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.h3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
