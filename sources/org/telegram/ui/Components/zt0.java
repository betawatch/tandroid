package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class zt0 extends ov0 {
    public final /* synthetic */ uv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt0(uv0 uv0Var, Context context) {
        super(uv0Var, context);
        this.h = uv0Var;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        uv0 uv0Var = this.h;
        nu0 W = uv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        uv0Var.I.l();
    }
}
