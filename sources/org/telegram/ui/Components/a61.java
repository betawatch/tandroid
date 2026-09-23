package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a61 extends oz {
    public final /* synthetic */ d61 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(d61 d61Var, int i10) {
        super(i10, false);
        this.X = d61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.X.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
