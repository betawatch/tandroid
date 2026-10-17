package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class a00 extends pg.b {
    public final /* synthetic */ c00 d;

    public a00(c00 c00Var) {
        this.d = c00Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 8 || i10 == 7;
    }

    public final s4.g0 F() {
        return this.d.d.getAdapter();
    }

    @Override // s4.g0
    public final int h() {
        return this.d.d0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((g00) this.d.d0.get(i10)).a;
    }

    @Override // s4.g0
    public final void l() {
        F().l();
    }

    @Override // s4.g0
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override // s4.g0
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12 = b1Var.f;
        View view = b1Var.a;
        ArrayList arrayList = this.d.d0;
        g00 g00Var = (g00) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z10 = (i13 >= arrayList.size() || (i11 = ((g00) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((i00) view).e(g00Var.m, z10);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i12 == 6) {
                d9Var.setFixedSize(0);
                d9Var.setText(g00Var.d);
                return;
            } else {
                d9Var.setFixedSize(12);
                d9Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            xz xzVar = (xz) view;
            xzVar.a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (xzVar.c != z10) {
                xzVar.c = z10;
                xzVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View d9Var;
        int i11;
        c00 c00Var = this.d;
        if (i10 == 8) {
            d9Var = new xz(c00Var.getContext());
            d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
        } else if (i10 == 7) {
            Context context = c00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.f3) c00Var).currentAccount;
            d9Var = new zz(this, context, i11, c00Var.X.id);
            d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
        } else if (i10 == 6 || i10 == 3) {
            d9Var = new org.telegram.ui.Cells.d9(c00Var.getContext());
            d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        } else {
            d9Var = new b00(c00Var, c00Var.getContext());
        }
        return new org.telegram.ui.Components.sl0(d9Var);
    }
}
