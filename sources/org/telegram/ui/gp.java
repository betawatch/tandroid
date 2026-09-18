package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ hp c;

    public gp(hp hpVar) {
        this.c = hpVar;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.a3.N.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.a3.N.size() ? 1 : 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        hp hpVar = this.c;
        ip ipVar = hpVar.a3;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, hpVar.p2));
            m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(hpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) ipVar.N.get(i10 - 1);
        oa oaVar = (oa) view;
        if (oaVar.H) {
            ipVar.O = null;
        }
        oaVar.a(tL_username, i10 < ipVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        ipVar.O = oaVar;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hp hpVar = this.c;
        org.telegram.ui.ActionBar.e6 e6Var = hpVar.p2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.gl0(new org.telegram.ui.Cells.m4(hpVar.getContext(), e6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.gl0(new ha(this, hpVar.getContext(), e6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.gl0(new org.telegram.ui.Cells.e9(hpVar.getContext(), 12, e6Var));
    }
}
