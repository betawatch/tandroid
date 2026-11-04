package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.H;
    }

    @Override // u4.h0
    public final int d(int i3) {
        o oVar = this.d;
        if (i3 >= oVar.y && i3 < oVar.E) {
            return 0;
        }
        if (i3 == oVar.F) {
            return 1;
        }
        return (i3 == oVar.G || i3 == oVar.x) ? 2 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        View view = d1Var.a;
        o oVar = this.d;
        a0.h hVar = oVar.a;
        ArrayList arrayList = oVar.h;
        if (d(i3) != 0) {
            if (d(i3) == 2) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i3 == oVar.x) {
                    y8Var.setTopPadding(17);
                    y8Var.setBottomPadding(10);
                    y8Var.setText(org.telegram.messenger.bd.M0(oVar.I == 5 ? 2131754135 : 2131754124, null));
                    return;
                } else {
                    y8Var.setTopPadding(10);
                    y8Var.setBottomPadding(17);
                    y8Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i11 = i3 - oVar.y;
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
        vVar.b(stickerSetCovered, i11 != arrayList.size() - 1);
        org.telegram.ui.Components.dg0 dg0Var = vVar.f;
        i10 = ((org.telegram.ui.ActionBar.d2) oVar).currentAccount;
        boolean B0 = org.telegram.messenger.li.b0(i10).B0(stickerSetCovered.set.id, true);
        vVar.a(B0, false, false);
        if (B0) {
            hVar.l(stickerSetCovered.set.id);
            if (dg0Var != null) {
                dg0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (dg0Var != null) {
                dg0Var.a(z10, false);
            }
        }
        vVar.setOnCheckedChangeListener(new mi.d4(11, this, stickerSetCovered));
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.c;
        View view = null;
        if (i3 == 0) {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, vVar, null);
            view = vVar;
        } else if (i3 == 1) {
            view = new org.telegram.ui.Cells.t4(context);
        } else if (i3 == 2) {
            view = new org.telegram.ui.Cells.y8(context);
        }
        view.setLayoutParams(new u4.p0(-1, -2));
        return new org.telegram.ui.Components.bj0(view);
    }
}
