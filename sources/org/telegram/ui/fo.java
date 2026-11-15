package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fo extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ go c;

    public fo(go goVar) {
        this.c = goVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.i3.O.size() + 2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return i7 <= this.c.i3.O.size() ? 1 : 2;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        go goVar = this.c;
        ho hoVar = goVar.i3;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, goVar.o2);
            n4Var.setText(org.telegram.messenger.hd.M0(2131743644, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.hd.M0(2131743643, null));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) hoVar.O.get(i7 - 1);
        ia iaVar = (ia) view;
        if (iaVar.I) {
            hoVar.P = null;
        }
        iaVar.a(tL_username, i7 < hoVar.O.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        hoVar.P = iaVar;
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        go goVar = this.c;
        org.telegram.ui.ActionBar.e6 e6Var = goVar.o2;
        if (i7 == 0) {
            return new org.telegram.ui.Components.cj0(new org.telegram.ui.Cells.n4(goVar.getContext(), e6Var));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.cj0(new da(this, goVar.getContext(), e6Var));
        }
        if (i7 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.cj0(new org.telegram.ui.Cells.y8(12, goVar.getContext(), e6Var));
    }
}
