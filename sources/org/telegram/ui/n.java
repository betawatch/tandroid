package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public final /* synthetic */ o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 0;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.H;
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        View view = f1Var.a;
        o oVar = this.d;
        a0.h hVar = oVar.a;
        ArrayList arrayList = oVar.h;
        if (d(i7) != 0) {
            if (d(i7) == 2) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == oVar.x) {
                    z8Var.setTopPadding(17);
                    z8Var.setBottomPadding(10);
                    z8Var.setText(org.telegram.messenger.gd.M0(oVar.I == 5 ? 2131754133 : 2131754122, null));
                    return;
                } else {
                    z8Var.setTopPadding(10);
                    z8Var.setBottomPadding(17);
                    z8Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i11 = i7 - oVar.y;
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
        vVar.b(stickerSetCovered, i11 != arrayList.size() - 1);
        org.telegram.ui.Components.ng0 ng0Var = vVar.f;
        i10 = ((org.telegram.ui.ActionBar.h2) oVar).currentAccount;
        boolean E0 = org.telegram.messenger.ri.d0(i10).E0(stickerSetCovered.set.id, true);
        vVar.a(E0, false, false);
        if (E0) {
            hVar.l(stickerSetCovered.set.id);
            if (ng0Var != null) {
                ng0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (ng0Var != null) {
                ng0Var.a(z10, false);
            }
        }
        vVar.setOnCheckedChangeListener(new oi.e0(3, this, stickerSetCovered));
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        View view = null;
        if (i7 == 0) {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, vVar, null);
            view = vVar;
        } else if (i7 == 1) {
            view = new org.telegram.ui.Cells.t4(context);
        } else if (i7 == 2) {
            view = new org.telegram.ui.Cells.z8(context);
        }
        view.setLayoutParams(new v4.q0(-1, -2));
        return new org.telegram.ui.Components.kj0(view);
    }
}
