package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.G;
    }

    @Override // v4.g0
    public final int d(int i7) {
        o oVar = this.d;
        if (i7 >= oVar.y && i7 < oVar.D) {
            return 0;
        }
        if (i7 == oVar.E) {
            return 1;
        }
        return (i7 == oVar.F || i7 == oVar.x) ? 2 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        View view = d1Var.a;
        o oVar = this.d;
        a0.h hVar = oVar.a;
        ArrayList arrayList = oVar.h;
        if (d(i7) != 0) {
            if (d(i7) == 2) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == oVar.x) {
                    z8Var.setTopPadding(17);
                    z8Var.setBottomPadding(10);
                    z8Var.setText(org.telegram.messenger.hd.M0(oVar.H == 5 ? 2131754135 : 2131754124, null));
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
        int i12 = 1;
        vVar.b(stickerSetCovered, i11 != arrayList.size() - 1);
        org.telegram.ui.Components.ag0 ag0Var = vVar.f;
        i10 = ((org.telegram.ui.ActionBar.f2) oVar).currentAccount;
        boolean B0 = org.telegram.messenger.ui.b0(i10).B0(stickerSetCovered.set.id, true);
        vVar.a(B0, false, false);
        if (B0) {
            hVar.l(stickerSetCovered.set.id);
            if (ag0Var != null) {
                ag0Var.a(false, false);
            }
        } else {
            boolean z9 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (ag0Var != null) {
                ag0Var.a(z9, false);
            }
        }
        vVar.setOnCheckedChangeListener(new ni.c(i12, this, stickerSetCovered));
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        View view = null;
        if (i7 == 0) {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, vVar, null);
            view = vVar;
        } else if (i7 == 1) {
            view = new org.telegram.ui.Cells.t4(context);
        } else if (i7 == 2) {
            view = new org.telegram.ui.Cells.z8(context);
        }
        view.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(view);
    }
}
