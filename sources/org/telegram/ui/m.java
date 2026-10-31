package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ n d;

    public m(n nVar, Context context) {
        this.d = nVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.G;
    }

    @Override // s4.g0
    public final int d(int i10) {
        n nVar = this.d;
        if (i10 >= nVar.y && i10 < nVar.D) {
            return 0;
        }
        if (i10 == nVar.E) {
            return 1;
        }
        return (i10 == nVar.F || i10 == nVar.x) ? 2 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        n nVar = this.d;
        a0.h hVar = nVar.a;
        ArrayList arrayList = nVar.h;
        if (d(i10) != 0) {
            if (d(i10) == 2) {
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i10 == nVar.x) {
                    b9Var.setTopPadding(17);
                    b9Var.setBottomPadding(10);
                    b9Var.setText(org.telegram.messenger.cd.L0(nVar.H == 5 ? 2131754135 : 2131754124, null));
                    return;
                } else {
                    b9Var.setTopPadding(10);
                    b9Var.setBottomPadding(17);
                    b9Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i12 = i10 - nVar.y;
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        int i13 = 1;
        vVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.ch0 ch0Var = vVar.f;
        i11 = ((org.telegram.ui.ActionBar.k2) nVar).currentAccount;
        boolean B0 = org.telegram.messenger.ui.b0(i11).B0(stickerSetCovered.set.id, true);
        vVar.a(B0, false, false);
        if (B0) {
            hVar.l(stickerSetCovered.set.id);
            if (ch0Var != null) {
                ch0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (ch0Var != null) {
                ch0Var.a(z10, false);
            }
        }
        vVar.setOnCheckedChangeListener(new ng.d(i13, this, stickerSetCovered));
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View view = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, vVar, null);
            view = vVar;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.v4(context);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.b9(context);
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.ck0(view);
    }
}
