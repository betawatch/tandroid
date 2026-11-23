package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class rl0 implements View.OnClickListener {
    public final /* synthetic */ di.l4 a;

    public rl0(di.l4 l4Var) {
        this.a = l4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sl0 sl0Var = (sl0) this.a.d;
        for (int i7 = 0; i7 < sl0Var.e.size(); i7++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sl0Var.e.get(i7);
            if (sl0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.k10.t0).a).f(gjVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.k10.t0).a).W(gjVar.F0(), gjVar, 0, 0);
                org.telegram.messenger.a6.q(sl0Var.d).y();
            }
        }
        sl0Var.d(true);
    }
}
