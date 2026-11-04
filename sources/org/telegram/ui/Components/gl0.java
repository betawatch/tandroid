package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gl0 implements View.OnClickListener {
    public final /* synthetic */ ci.r4 a;

    public gl0(ci.r4 r4Var) {
        this.a = r4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hl0 hl0Var = (hl0) this.a.d;
        for (int i3 = 0; i3 < hl0Var.e.size(); i3++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) hl0Var.e.get(i3);
            if (hl0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.t0).a).f(ziVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.t0).a).X(ziVar.F0(), ziVar, 0, 0);
                org.telegram.messenger.z5.q(hl0Var.d).y();
            }
        }
        hl0Var.d(true);
    }
}
