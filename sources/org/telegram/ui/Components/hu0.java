package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hu0 extends na {
    public vr P1;

    public hu0(Context context) {
        super(context, null, true, false, null);
        N();
        this.v1 = true;
        this.u1 = true;
        Y0();
        pj0 pj0Var = this.k1;
        int i7 = this.t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.k1.j(new ui(this, 17));
        this.k1.setOnItemClickListener(new k(this, 14));
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        vr vrVar = new vr(pj0Var, getContext(), this.a, 0, true, this.I0);
        this.P1 = vrVar;
        vrVar.r = false;
        return vrVar;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131745824, null);
    }
}
