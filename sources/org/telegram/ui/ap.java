package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ap extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ bp c;

    public ap(bp bpVar) {
        this.c = bpVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.h3.N.size() + 2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.h3.N.size() ? 1 : 2;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        bp bpVar = this.c;
        cp cpVar = bpVar.h3;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, bpVar.n2);
            p4Var.setText(org.telegram.messenger.cd.L0(2131743670, null));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.cd.L0(2131743669, null));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) cpVar.N.get(i10 - 1);
        la laVar = (la) view;
        if (laVar.H) {
            cpVar.O = null;
        }
        laVar.a(tL_username, i10 < cpVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        cpVar.O = laVar;
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        bp bpVar = this.c;
        org.telegram.ui.ActionBar.p6 p6Var = bpVar.n2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.ck0(new org.telegram.ui.Cells.p4(bpVar.getContext(), p6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.ck0(new fa(this, bpVar.getContext(), p6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.ck0(new org.telegram.ui.Cells.b9(12, bpVar.getContext(), p6Var));
    }
}
