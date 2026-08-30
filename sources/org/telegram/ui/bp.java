package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bp extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ cp c;

    public bp(cp cpVar) {
        this.c = cpVar;
    }

    @Override // org.telegram.ui.Components.rl0
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
        cp cpVar = this.c;
        dp dpVar = cpVar.X2;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, cpVar.m2));
            m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(cpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) dpVar.K.get(i10 - 1);
        ma maVar = (ma) view;
        if (maVar.E) {
            dpVar.L = null;
        }
        maVar.a(tL_username, i10 < dpVar.K.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        dpVar.L = maVar;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        cp cpVar = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = cpVar.m2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.m4(cpVar.getContext(), f6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.el0(new fa(this, cpVar.getContext(), f6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.a9(cpVar.getContext(), 12, f6Var));
    }
}
