package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        return org.telegram.messenger.hd.M0(2131745822, null);
    }
}
