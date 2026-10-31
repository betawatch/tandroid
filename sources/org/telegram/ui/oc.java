package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oc extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ qc f;

    public oc(qc qcVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        this.f = qcVar;
        this.c = context;
        this.d = p6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(this.e).r4;
        if (lpVar == null) {
            return 0;
        }
        return lpVar.c.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        pc pcVar = (pc) c1Var.a;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, pcVar, this.d);
        boolean z10 = i10 == this.f.e;
        pcVar.s = z10;
        pcVar.w.f(z10, true);
        pcVar.invalidate();
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(this.e).r4;
        if (lpVar != null) {
            ArrayList arrayList = lpVar.c;
            if (i10 < 0 || i10 >= arrayList.size()) {
                return;
            }
            pcVar.a((org.telegram.messenger.kp) arrayList.get(i10));
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.ck0(new pc(this.f, this.c));
    }
}
