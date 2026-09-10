package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kp extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ lp c;

    public kp(lp lpVar) {
        this.c = lpVar;
    }

    @Override // org.telegram.ui.Components.ul0
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
        lp lpVar = this.c;
        mp mpVar = lpVar.a3;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, lpVar.p2));
            m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(lpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) mpVar.N.get(i10 - 1);
        oa oaVar = (oa) view;
        if (oaVar.H) {
            mpVar.O = null;
        }
        oaVar.a(tL_username, i10 < mpVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        mpVar.O = oaVar;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        lp lpVar = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = lpVar.p2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.m4(lpVar.getContext(), f6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.fl0(new ha(this, lpVar.getContext(), f6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.f9(lpVar.getContext(), 12, f6Var));
    }
}
