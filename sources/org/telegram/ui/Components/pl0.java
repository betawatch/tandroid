package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pl0 implements View.OnClickListener {
    public final /* synthetic */ di.l4 a;

    public pl0(di.l4 l4Var) {
        this.a = l4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ql0 ql0Var = (ql0) this.a.d;
        for (int i7 = 0; i7 < ql0Var.e.size(); i7++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) ql0Var.e.get(i7);
            if (ql0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.t0).a).f(fjVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.t0).a).W(fjVar.F0(), fjVar, 0, 0);
                org.telegram.messenger.a6.q(ql0Var.d).y();
            }
        }
        ql0Var.d(true);
    }
}
