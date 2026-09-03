package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bp extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ dp c;

    public bp(dp dpVar) {
        this.c = dpVar;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 1;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.X2.K.size() + 2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.X2.K.size() ? 1 : 2;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        dp dpVar = this.c;
        ep epVar = dpVar.X2;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, dpVar.m2));
            m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(dpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) epVar.K.get(i10 - 1);
        ma maVar = (ma) view;
        if (maVar.E) {
            epVar.L = null;
        }
        maVar.a(tL_username, i10 < epVar.K.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        epVar.L = maVar;
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        dp dpVar = this.c;
        org.telegram.ui.ActionBar.g6 g6Var = dpVar.m2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.m4(dpVar.getContext(), g6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.el0(new fa(this, dpVar.getContext(), g6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.a9(dpVar.getContext(), 12, g6Var));
    }
}
