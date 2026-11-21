package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sl0Var.e.get(i7);
            if (sl0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.t0).a).f(fjVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.t0).a).W(fjVar.F0(), fjVar, 0, 0);
                org.telegram.messenger.a6.q(sl0Var.d).y();
            }
        }
        sl0Var.d(true);
    }
}
