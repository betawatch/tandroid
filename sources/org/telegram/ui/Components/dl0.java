package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dl0 implements View.OnClickListener {
    public final /* synthetic */ bi.k5 a;

    public dl0(bi.k5 k5Var) {
        this.a = k5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        el0 el0Var = (el0) this.a.d;
        for (int i7 = 0; i7 < el0Var.e.size(); i7++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) el0Var.e.get(i7);
            if (el0Var.H) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.s0).a).f(ijVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.s0).a).W(ijVar.F0(), ijVar, 0, 0);
                org.telegram.messenger.z5.q(el0Var.d).y();
            }
        }
        el0Var.d(true);
    }
}
