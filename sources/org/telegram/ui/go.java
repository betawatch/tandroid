package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class go extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ ho c;

    public go(ho hoVar) {
        this.c = hoVar;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.h3.N.size() + 2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return i7 <= this.c.h3.N.size() ? 1 : 2;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ho hoVar = this.c;
        io ioVar = hoVar.h3;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, hoVar.n2);
            n4Var.setText(org.telegram.messenger.id.M0(2131743644, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.id.M0(2131743643, null));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) ioVar.N.get(i7 - 1);
        ia iaVar = (ia) view;
        if (iaVar.H) {
            ioVar.O = null;
        }
        iaVar.a(tL_username, i7 < ioVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        ioVar.O = iaVar;
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ho hoVar = this.c;
        org.telegram.ui.ActionBar.g6 g6Var = hoVar.n2;
        if (i7 == 0) {
            return new org.telegram.ui.Components.yi0(new org.telegram.ui.Cells.n4(hoVar.getContext(), g6Var));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.yi0(new da(this, hoVar.getContext(), g6Var));
        }
        if (i7 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.yi0(new org.telegram.ui.Cells.z8(12, hoVar.getContext(), g6Var));
    }
}
