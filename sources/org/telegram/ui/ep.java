package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ep extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ fp c;

    public ep(fp fpVar) {
        this.c = fpVar;
    }

    @Override // org.telegram.ui.Components.ll0
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
        fp fpVar = this.c;
        gp gpVar = fpVar.a3;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, fpVar.p2));
            m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            f9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(fpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) gpVar.N.get(i10 - 1);
        na naVar = (na) view;
        if (naVar.H) {
            gpVar.O = null;
        }
        naVar.a(tL_username, i10 < gpVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        gpVar.O = naVar;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        fp fpVar = this.c;
        org.telegram.ui.ActionBar.d6 d6Var = fpVar.p2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wk0(new org.telegram.ui.Cells.m4(fpVar.getContext(), d6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.wk0(new ga(this, fpVar.getContext(), d6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.wk0(new org.telegram.ui.Cells.f9(fpVar.getContext(), 12, d6Var));
    }
}
