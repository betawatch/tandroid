package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fp extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ gp c;

    public fp(gp gpVar) {
        this.c = gpVar;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.h3.N.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.h3.N.size() ? 1 : 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        gp gpVar = this.c;
        hp hpVar = gpVar.h3;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, gpVar.p2));
            m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            e9Var.setBackground(org.telegram.ui.ActionBar.i6.V0(gpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) hpVar.N.get(i10 - 1);
        pa paVar = (pa) view;
        if (paVar.H) {
            hpVar.O = null;
        }
        paVar.a(tL_username, i10 < hpVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        hpVar.O = paVar;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gp gpVar = this.c;
        org.telegram.ui.ActionBar.d6 d6Var = gpVar.p2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.il0(new org.telegram.ui.Cells.m4(gpVar.getContext(), d6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.il0(new ia(this, gpVar.getContext(), d6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.il0(new org.telegram.ui.Cells.e9(gpVar.getContext(), 12, d6Var));
    }
}
