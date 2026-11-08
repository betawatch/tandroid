package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cl0 implements View.OnClickListener {
    public final /* synthetic */ bi.k5 a;

    public cl0(bi.k5 k5Var) {
        this.a = k5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dl0 dl0Var = (dl0) this.a.d;
        for (int i7 = 0; i7 < dl0Var.e.size(); i7++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) dl0Var.e.get(i7);
            if (dl0Var.H) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.s0).a).f(ijVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.s0).a).W(ijVar.F0(), ijVar, 0, 0);
                org.telegram.messenger.z5.q(dl0Var.d).y();
            }
        }
        dl0Var.d(true);
    }
}
