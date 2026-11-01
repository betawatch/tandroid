package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gm0 implements View.OnClickListener {
    public final /* synthetic */ kg.f a;

    public gm0(kg.f fVar) {
        this.a = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hm0 hm0Var = (hm0) this.a.d;
        for (int i10 = 0; i10 < hm0Var.e.size(); i10++) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) hm0Var.e.get(i10);
            if (hm0Var.H) {
                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.s0).a).f(kjVar.F0());
            } else {
                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.s0).a).X(kjVar.F0(), kjVar, 0, 0);
                org.telegram.messenger.b6.q(hm0Var.d).y();
            }
        }
        hm0Var.d(true);
    }
}
