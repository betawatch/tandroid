package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.H;
    }

    @Override // v4.h0
    public final int d(int i7) {
        o oVar = this.d;
        if (i7 >= oVar.y && i7 < oVar.E) {
            return 0;
        }
        if (i7 == oVar.F) {
            return 1;
        }
        return (i7 == oVar.G || i7 == oVar.x) ? 2 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        View view = e1Var.a;
        o oVar = this.d;
        a0.h hVar = oVar.a;
        ArrayList arrayList = oVar.h;
        int i11 = 5;
        if (d(i7) != 0) {
            if (d(i7) == 2) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i7 == oVar.x) {
                    y8Var.setTopPadding(17);
                    y8Var.setBottomPadding(10);
                    y8Var.setText(org.telegram.messenger.hd.M0(oVar.I == 5 ? 2131754135 : 2131754124, null));
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
        int i12 = i7 - oVar.y;
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        vVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.dg0 dg0Var = vVar.f;
        i10 = ((org.telegram.ui.ActionBar.e2) oVar).currentAccount;
        boolean B0 = org.telegram.messenger.si.b0(i10).B0(stickerSetCovered.set.id, true);
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
        vVar.setOnCheckedChangeListener(new m2.d(i11, this, stickerSetCovered));
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        View view = null;
        if (i7 == 0) {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, vVar, null);
            view = vVar;
        } else if (i7 == 1) {
            view = new org.telegram.ui.Cells.t4(context);
        } else if (i7 == 2) {
            view = new org.telegram.ui.Cells.y8(context);
        }
        view.setLayoutParams(new v4.p0(-1, -2));
        return new org.telegram.ui.Components.cj0(view);
    }
}
