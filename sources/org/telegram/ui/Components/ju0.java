package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ju0 extends na {
    public vr P1;

    public ju0(Context context) {
        super(context, null, true, false, null);
        N();
        this.v1 = true;
        this.u1 = true;
        Y0();
        qj0 qj0Var = this.k1;
        int i7 = this.t0;
        qj0Var.setPadding(i7, 0, i7, 0);
        this.k1.j(new ui(this, 17));
        this.k1.setOnItemClickListener(new k(this, 14));
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        vr vrVar = new vr(qj0Var, getContext(), this.a, 0, true, this.I0);
        this.P1 = vrVar;
        vrVar.r = false;
        return vrVar;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131745821, null);
    }
}
