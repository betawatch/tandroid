package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class tu0 extends sa {
    public ks T1;

    public tu0(Context context) {
        super(context, null, true, false, null);
        O();
        this.z1 = true;
        this.y1 = true;
        Z0();
        ek0 ek0Var = this.o1;
        int i7 = this.u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.o1.j(new oa(this, 20));
        this.o1.setOnItemClickListener(new o(this, 14));
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        ks ksVar = new ks(ek0Var, getContext(), this.a, 0, true, this.J0);
        this.T1 = ksVar;
        ksVar.r = false;
        return ksVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return org.telegram.messenger.hd.N0(2131745625, null);
    }
}
