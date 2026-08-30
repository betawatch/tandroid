package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m00 extends bg.c {
    public final /* synthetic */ o00 d;

    public m00(o00 o00Var) {
        this.d = o00Var;
    }

    @Override // org.telegram.ui.Components.rl0
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
        return ((s00) this.d.a0.get(i10)).a;
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
        s00 s00Var = (s00) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z4 = (i13 >= arrayList.size() || (i11 = ((s00) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((u00) view).e(s00Var.m, z4);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i12 == 6) {
                a9Var.setFixedSize(0);
                a9Var.setText(s00Var.d);
                return;
            } else {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            j00 j00Var = (j00) view;
            j00Var.a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (j00Var.c != z4) {
                j00Var.c = z4;
                j00Var.setWillNotDraw(!z4);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        int i11;
        o00 o00Var = this.d;
        if (i10 == 8) {
            a9Var = new j00(o00Var.getContext());
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
        } else if (i10 == 7) {
            Context context = o00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.g3) o00Var).currentAccount;
            a9Var = new l00(this, context, i11, o00Var.U.id);
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
        } else if (i10 == 6 || i10 == 3) {
            a9Var = new org.telegram.ui.Cells.a9(o00Var.getContext());
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        } else {
            a9Var = new n00(o00Var, o00Var.getContext());
        }
        return new org.telegram.ui.Components.el0(a9Var);
    }
}
