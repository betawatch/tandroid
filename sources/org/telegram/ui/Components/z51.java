package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class z51 extends s4.c0 {
    public final /* synthetic */ d61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(d61 d61Var, int i10) {
        super(i10, false);
        this.I = d61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
