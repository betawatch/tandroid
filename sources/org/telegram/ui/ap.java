package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ap extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ bp c;

    public ap(bp bpVar) {
        this.c = bpVar;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.i3.N.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.i3.N.size() ? 1 : 2;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        bp bpVar = this.c;
        cp cpVar = bpVar.i3;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, bpVar.n2);
            q4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) cpVar.N.get(i10 - 1);
        qa qaVar = (qa) view;
        if (qaVar.H) {
            cpVar.O = null;
        }
        qaVar.a(tL_username, i10 < cpVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        cpVar.O = qaVar;
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        bp bpVar = this.c;
        org.telegram.ui.ActionBar.u6 u6Var = bpVar.n2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.q4(bpVar.getContext(), u6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.wl0(new ja(this, bpVar.getContext(), u6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.i9(bpVar.getContext(), 12, u6Var));
    }
}
