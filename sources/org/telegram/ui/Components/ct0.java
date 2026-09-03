package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ct0 extends su0 {
    public final /* synthetic */ yu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct0(yu0 yu0Var, Context context) {
        super(yu0Var, context);
        this.h = yu0Var;
    }

    @Override // f2.o0
    public final void l() {
        super.l();
        yu0 yu0Var = this.h;
        qt0 W = yu0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        yu0Var.F.l();
    }
}
