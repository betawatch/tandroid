package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fm0 implements View.OnClickListener {
    public final /* synthetic */ kg.f a;

    public fm0(kg.f fVar) {
        this.a = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gm0 gm0Var = (gm0) this.a.d;
        for (int i10 = 0; i10 < gm0Var.e.size(); i10++) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) gm0Var.e.get(i10);
            if (gm0Var.H) {
                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.s0).a).f(jjVar.F0());
            } else {
                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.s0).a).X(jjVar.F0(), jjVar, 0, 0);
                org.telegram.messenger.b6.q(gm0Var.d).y();
            }
        }
        gm0Var.d(true);
    }
}
