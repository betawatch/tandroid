package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kv0 extends ha {
    public gs P1;

    public kv0(Context context) {
        super(context, null, true, false, null);
        O();
        this.v1 = true;
        this.u1 = true;
        Y0();
        uk0 uk0Var = this.k1;
        int i10 = this.t0;
        uk0Var.setPadding(i10, 0, i10, 0);
        this.k1.j(new cu0(this, 2));
        this.k1.setOnItemClickListener(new k(this, 14));
    }

    @Override // org.telegram.ui.Components.ha
    public final tk0 L0(uk0 uk0Var) {
        gs gsVar = new gs(uk0Var, getContext(), this.a, 0, true, this.I0);
        this.P1 = gsVar;
        gsVar.r = false;
        return gsVar;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return org.telegram.messenger.dd.L0(2131745838, null);
    }
}
