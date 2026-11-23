package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class go extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ ho c;

    public go(ho hoVar) {
        this.c = hoVar;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 1;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.i3.O.size() + 2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return i7 <= this.c.i3.O.size() ? 1 : 2;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        ho hoVar = this.c;
        io ioVar = hoVar.i3;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, hoVar.o2);
            o4Var.setText(org.telegram.messenger.gd.N0(2131743397, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.gd.N0(2131743396, null));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) ioVar.O.get(i7 - 1);
        ia iaVar = (ia) view;
        if (iaVar.I) {
            ioVar.P = null;
        }
        iaVar.a(tL_username, i7 < ioVar.O.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        ioVar.P = iaVar;
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ho hoVar = this.c;
        org.telegram.ui.ActionBar.i6 i6Var = hoVar.o2;
        if (i7 == 0) {
            return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.o4(hoVar.getContext(), i6Var));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.mj0(new da(this, hoVar.getContext(), i6Var));
        }
        if (i7 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.z8(12, hoVar.getContext(), i6Var));
    }
}
