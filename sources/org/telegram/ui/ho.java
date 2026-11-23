package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ho extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ io c;

    public ho(io ioVar) {
        this.c = ioVar;
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
        io ioVar = this.c;
        jo joVar = ioVar.i3;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, ioVar.o2);
            o4Var.setText(org.telegram.messenger.hd.N0(2131743399, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.hd.N0(2131743398, null));
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
        org.telegram.ui.ActionBar.h6 h6Var = ioVar.o2;
        if (i7 == 0) {
            return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.o4(ioVar.getContext(), h6Var));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.mj0(new da(this, ioVar.getContext(), h6Var));
        }
        if (i7 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.a9(12, ioVar.getContext(), h6Var));
    }
}
