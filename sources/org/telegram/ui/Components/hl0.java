package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hl0 implements View.OnClickListener {
    public final /* synthetic */ di.i4 a;

    public hl0(di.i4 i4Var) {
        this.a = i4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        il0 il0Var = (il0) this.a.d;
        for (int i7 = 0; i7 < il0Var.e.size(); i7++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) il0Var.e.get(i7);
            if (il0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.t0).a).f(gjVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.t0).a).W(gjVar.F0(), gjVar, 0, 0);
                org.telegram.messenger.z5.q(il0Var.d).y();
            }
        }
        il0Var.d(true);
    }
}
