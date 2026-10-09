package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gu0 extends vv0 {
    public final /* synthetic */ bw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu0(bw0 bw0Var, Context context) {
        super(bw0Var, context);
        this.h = bw0Var;
    }

    @Override // s4.i0
    public final void l() {
        super.l();
        bw0 bw0Var = this.h;
        uu0 W = bw0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        bw0Var.I.l();
    }
}
