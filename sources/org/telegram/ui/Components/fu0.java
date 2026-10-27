package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fu0 extends vv0 {
    public final /* synthetic */ bw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(bw0 bw0Var, Context context) {
        super(bw0Var, context);
        this.h = bw0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        bw0 bw0Var = this.h;
        uu0 d02 = bw0Var.d0(0);
        if (d02 == null || d02.n.getVisibility() != 0) {
            return;
        }
        bw0Var.K.l();
    }
}
