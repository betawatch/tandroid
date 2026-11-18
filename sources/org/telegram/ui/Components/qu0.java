package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qu0 extends sa {
    public is T1;

    public qu0(Context context) {
        super(context, null, true, false, null);
        O();
        this.z1 = true;
        this.y1 = true;
        Z0();
        ck0 ck0Var = this.o1;
        int i7 = this.u0;
        ck0Var.setPadding(i7, 0, i7, 0);
        this.o1.j(new oa(this, 20));
        this.o1.setOnItemClickListener(new n(this, 14));
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        is isVar = new is(ck0Var, getContext(), this.a, 0, true, this.J0);
        this.T1 = isVar;
        isVar.r = false;
        return isVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return org.telegram.messenger.gd.M0(2131745626, null);
    }
}
