package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n00 extends bg.c {
    public final /* synthetic */ p00 d;

    public n00(p00 p00Var) {
        this.d = p00Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 8 || i10 == 7;
    }

    public final f2.o0 F() {
        return this.d.d.getAdapter();
    }

    @Override // f2.o0
    public final int h() {
        return this.d.a0.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((t00) this.d.a0.get(i10)).a;
    }

    @Override // f2.o0
    public final void l() {
        F().l();
    }

    @Override // f2.o0
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override // f2.o0
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override // f2.o0
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override // f2.o0
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override // f2.o0
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override // f2.o0
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12 = l1Var.f;
        View view = l1Var.a;
        ArrayList arrayList = this.d.a0;
        t00 t00Var = (t00) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z4 = (i13 >= arrayList.size() || (i11 = ((t00) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((v00) view).e(t00Var.m, z4);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i12 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(t00Var.d);
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            k00 k00Var = (k00) view;
            k00Var.a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (k00Var.c != z4) {
                k00Var.c = z4;
                k00Var.setWillNotDraw(!z4);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        int i11;
        p00 p00Var = this.d;
        if (i10 == 8) {
            z8Var = new k00(p00Var.getContext());
            z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
        } else if (i10 == 7) {
            Context context = p00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.g3) p00Var).currentAccount;
            z8Var = new m00(this, context, i11, p00Var.U.id);
            z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
        } else if (i10 == 6 || i10 == 3) {
            z8Var = new org.telegram.ui.Cells.z8(p00Var.getContext());
            z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        } else {
            z8Var = new o00(p00Var, p00Var.getContext());
        }
        return new org.telegram.ui.Components.dl0(z8Var);
    }
}
