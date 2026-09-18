package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ip extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ jp c;

    public ip(jp jpVar) {
        this.c = jpVar;
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
        jp jpVar = this.c;
        kp kpVar = jpVar.a3;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, jpVar.p2));
            l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(jpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) kpVar.N.get(i10 - 1);
        pa paVar = (pa) view;
        if (paVar.H) {
            kpVar.O = null;
        }
        paVar.a(tL_username, i10 < kpVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        kpVar.O = paVar;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jp jpVar = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = jpVar.p2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wk0(new org.telegram.ui.Cells.l4(jpVar.getContext(), f6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.wk0(new ia(this, jpVar.getContext(), f6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.wk0(new org.telegram.ui.Cells.e9(jpVar.getContext(), 12, f6Var));
    }
}
