package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class eo extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ fo c;

    public eo(fo foVar) {
        this.c = foVar;
    }

    @Override // org.telegram.ui.Components.oj0
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
        fo foVar = this.c;
        go goVar = foVar.h3;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, foVar.n2);
            n4Var.setText(org.telegram.messenger.hd.M0(2131743645, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.hd.M0(2131743644, null));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) goVar.N.get(i7 - 1);
        ia iaVar = (ia) view;
        if (iaVar.H) {
            goVar.O = null;
        }
        iaVar.a(tL_username, i7 < goVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        goVar.O = iaVar;
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        fo foVar = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = foVar.n2;
        if (i7 == 0) {
            return new org.telegram.ui.Components.xi0(new org.telegram.ui.Cells.n4(foVar.getContext(), f6Var));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.xi0(new da(this, foVar.getContext(), f6Var));
        }
        if (i7 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.xi0(new org.telegram.ui.Cells.z8(12, foVar.getContext(), f6Var));
    }
}
