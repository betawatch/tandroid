package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dp extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ ep c;

    public dp(ep epVar) {
        this.c = epVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 1;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.X2.K.size() + 2;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.X2.K.size() ? 1 : 2;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ep epVar = this.c;
        fp fpVar = epVar.X2;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, epVar.m2));
            l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            z8Var.setBackground(org.telegram.ui.ActionBar.j6.V0(epVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) fpVar.K.get(i10 - 1);
        oa oaVar = (oa) view;
        if (oaVar.E) {
            fpVar.L = null;
        }
        oaVar.a(tL_username, i10 < fpVar.K.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        fpVar.L = oaVar;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ep epVar = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = epVar.m2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.dl0(new org.telegram.ui.Cells.l4(epVar.getContext(), f6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.dl0(new ha(this, epVar.getContext(), f6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.dl0(new org.telegram.ui.Cells.z8(epVar.getContext(), 12, f6Var));
    }
}
