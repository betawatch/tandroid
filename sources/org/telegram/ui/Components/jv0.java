package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jv0 extends ha {
    public gs P1;

    public jv0(Context context) {
        super(context, null, true, false, null);
        O();
        this.v1 = true;
        this.u1 = true;
        Y0();
        tk0 tk0Var = this.k1;
        int i10 = this.t0;
        tk0Var.setPadding(i10, 0, i10, 0);
        this.k1.j(new bu0(this, 2));
        this.k1.setOnItemClickListener(new k(this, 14));
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        gs gsVar = new gs(tk0Var, getContext(), this.a, 0, true, this.I0);
        this.P1 = gsVar;
        gsVar.r = false;
        return gsVar;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return org.telegram.messenger.cd.L0(2131745838, null);
    }
}
