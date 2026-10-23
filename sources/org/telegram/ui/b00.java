package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class b00 extends pg.b {
    public final /* synthetic */ d00 d;

    public b00(d00 d00Var) {
        this.d = d00Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 8 || i10 == 7;
    }

    public final s4.g0 F() {
        return this.d.d.getAdapter();
    }

    @Override // s4.g0
    public final int h() {
        return this.d.e0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((h00) this.d.e0.get(i10)).a;
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
        ArrayList arrayList = this.d.e0;
        h00 h00Var = (h00) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z10 = (i13 >= arrayList.size() || (i11 = ((h00) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((j00) view).e(h00Var.m, z10);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i12 == 6) {
                e9Var.setFixedSize(0);
                e9Var.setText(h00Var.d);
                return;
            } else {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            yz yzVar = (yz) view;
            yzVar.a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (yzVar.c != z10) {
                yzVar.c = z10;
                yzVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        int i11;
        d00 d00Var = this.d;
        if (i10 == 8) {
            e9Var = new yz(d00Var.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, e9Var, null);
        } else if (i10 == 7) {
            Context context = d00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.h3) d00Var).currentAccount;
            e9Var = new a00(this, context, i11, d00Var.Y.id);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, e9Var, null);
        } else if (i10 == 6 || i10 == 3) {
            e9Var = new org.telegram.ui.Cells.e9(d00Var.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, e9Var, null);
        } else {
            e9Var = new c00(d00Var, d00Var.getContext());
        }
        return new org.telegram.ui.Components.wl0(e9Var);
    }
}
