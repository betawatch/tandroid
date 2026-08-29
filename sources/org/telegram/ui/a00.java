package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a00 extends zf.b {
    public final /* synthetic */ c00 d;

    public a00(c00 c00Var) {
        this.d = c00Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 8 || i10 == 7;
    }

    public final f2.p0 F() {
        return this.d.d.getAdapter();
    }

    @Override // f2.p0
    public final int h() {
        return this.d.Z.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((g00) this.d.Z.get(i10)).a;
    }

    @Override // f2.p0
    public final void l() {
        F().l();
    }

    @Override // f2.p0
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override // f2.p0
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override // f2.p0
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override // f2.p0
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override // f2.p0
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override // f2.p0
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12 = n1Var.f;
        View view = n1Var.a;
        ArrayList arrayList = this.d.Z;
        g00 g00Var = (g00) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z10 = (i13 >= arrayList.size() || (i11 = ((g00) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((i00) view).e(g00Var.m, z10);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i12 == 6) {
                y8Var.setFixedSize(0);
                y8Var.setText(g00Var.d);
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
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

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View y8Var;
        int i11;
        c00 c00Var = this.d;
        if (i10 == 8) {
            y8Var = new xz(c00Var.getContext());
            y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
        } else if (i10 == 7) {
            Context context = c00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.f3) c00Var).currentAccount;
            y8Var = new zz(this, context, i11, c00Var.T.id);
            y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
        } else if (i10 == 6 || i10 == 3) {
            y8Var = new org.telegram.ui.Cells.y8(c00Var.getContext());
            y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        } else {
            y8Var = new b00(c00Var, c00Var.getContext());
        }
        return new org.telegram.ui.Components.vk0(y8Var);
    }
}
