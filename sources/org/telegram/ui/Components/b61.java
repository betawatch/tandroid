package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b61 extends s4.c0 {
    public final /* synthetic */ f61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b61(f61 f61Var, int i10) {
        super(i10, false);
        this.I = f61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
