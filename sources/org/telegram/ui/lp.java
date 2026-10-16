package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lp extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ mp c;

    public lp(mp mpVar) {
        this.c = mpVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.Y2.N.size() + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.Y2.N.size() ? 1 : 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        mp mpVar = this.c;
        np npVar = mpVar.Y2;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, mpVar.n2));
            m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            e9Var.setBackground(org.telegram.ui.ActionBar.g6.W0(mpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) npVar.N.get(i10 - 1);
        sa saVar = (sa) view;
        if (saVar.H) {
            npVar.O = null;
        }
        saVar.a(tL_username, i10 < npVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        npVar.O = saVar;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        mp mpVar = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = mpVar.n2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.m4(mpVar.getContext(), c6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.wl0(new la(this, mpVar.getContext(), c6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.e9(mpVar.getContext(), 12, c6Var));
    }
}
