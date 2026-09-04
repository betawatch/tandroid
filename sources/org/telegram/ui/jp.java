package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jp extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ kp c;

    public jp(kp kpVar) {
        this.c = kpVar;
    }

    @Override // org.telegram.ui.Components.kl0
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
        kp kpVar = this.c;
        lp lpVar = kpVar.a3;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, kpVar.p2));
            l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(kpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) lpVar.N.get(i10 - 1);
        na naVar = (na) view;
        if (naVar.H) {
            lpVar.O = null;
        }
        naVar.a(tL_username, i10 < lpVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        lpVar.O = naVar;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        kp kpVar = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = kpVar.p2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.l4(kpVar.getContext(), f6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.vk0(new ga(this, kpVar.getContext(), f6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.e9(kpVar.getContext(), 12, f6Var));
    }
}
