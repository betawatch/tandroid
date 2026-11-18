package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ho extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ io c;

    public ho(io ioVar) {
        this.c = ioVar;
    }

    @Override // org.telegram.ui.Components.bk0
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
        io ioVar = this.c;
        jo joVar = ioVar.i3;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n4Var, ioVar.o2);
            n4Var.setText(org.telegram.messenger.gd.M0(2131743407, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.gd.M0(2131743406, null));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) joVar.O.get(i7 - 1);
        ia iaVar = (ia) view;
        if (iaVar.I) {
            joVar.P = null;
        }
        iaVar.a(tL_username, i7 < joVar.O.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        joVar.P = iaVar;
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        io ioVar = this.c;
        org.telegram.ui.ActionBar.i6 i6Var = ioVar.o2;
        if (i7 == 0) {
            return new org.telegram.ui.Components.kj0(new org.telegram.ui.Cells.n4(ioVar.getContext(), i6Var));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.kj0(new da(this, ioVar.getContext(), i6Var));
        }
        if (i7 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.kj0(new org.telegram.ui.Cells.z8(12, ioVar.getContext(), i6Var));
    }
}
