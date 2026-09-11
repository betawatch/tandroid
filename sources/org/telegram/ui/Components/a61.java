package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class a61 extends nz {
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
