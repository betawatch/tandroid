package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class l00 extends og.b {
    public final /* synthetic */ n00 d;

    public l00(n00 n00Var) {
        this.d = n00Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 8 || i10 == 7;
    }

    public final s4.h0 F() {
        return this.d.d.getAdapter();
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((s00) this.d.d0.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        F().l();
    }

    @Override // s4.h0
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override // s4.h0
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override // s4.h0
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override // s4.h0
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override // s4.h0
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override // s4.h0
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.d.d0;
        s00 s00Var = (s00) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z10 = (i13 >= arrayList.size() || (i11 = ((s00) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((u00) view).e(s00Var.m, z10);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i12 == 6) {
                e9Var.setFixedSize(0);
                e9Var.setText(s00Var.d);
                return;
            } else {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            i00 i00Var = (i00) view;
            i00Var.a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (i00Var.c != z10) {
                i00Var.c = z10;
                i00Var.setWillNotDraw(!z10);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        int i11;
        n00 n00Var = this.d;
        if (i10 == 8) {
            e9Var = new i00(n00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false));
        } else if (i10 == 7) {
            Context context = n00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.e3) n00Var).currentAccount;
            e9Var = new k00(this, context, i11, n00Var.X.id);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false));
        } else if (i10 == 6 || i10 == 3) {
            e9Var = new org.telegram.ui.Cells.e9(n00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
        } else {
            e9Var = new m00(n00Var, n00Var.getContext());
        }
        return new org.telegram.ui.Components.gl0(e9Var);
    }
}
