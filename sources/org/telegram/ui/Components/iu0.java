package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class iu0 extends ja {
    public bs T1;

    public iu0(Context context) {
        super(context, null, true, false, null);
        O();
        this.z1 = true;
        this.y1 = true;
        Y0();
        uj0 uj0Var = this.o1;
        int i7 = this.u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        this.o1.j(new ri(this, 19));
        this.o1.setOnItemClickListener(new j(this, 14));
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        bs bsVar = new bs(uj0Var, getContext(), this.a, 0, true, this.J0);
        this.T1 = bsVar;
        bsVar.r = false;
        return bsVar;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131745821, null);
    }
}
