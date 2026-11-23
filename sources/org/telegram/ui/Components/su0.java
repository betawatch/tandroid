package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class su0 extends ra {
    public hs T1;

    public su0(Context context) {
        super(context, null, true, false, null);
        O();
        this.z1 = true;
        this.y1 = true;
        Z0();
        ek0 ek0Var = this.o1;
        int i7 = this.u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.o1.j(new na(this, 20));
        this.o1.setOnItemClickListener(new n(this, 14));
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        hs hsVar = new hs(ek0Var, getContext(), this.a, 0, true, this.J0);
        this.T1 = hsVar;
        hsVar.r = false;
        return hsVar;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131745625, null);
    }
}
