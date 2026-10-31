package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lz0 extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ pz0 d;

    public lz0(pz0 pz0Var, Context context) {
        this.d = pz0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int b() {
        pz0 pz0Var = this.d;
        return pz0Var.f + (pz0Var.e < 0 ? pz0Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        pz0 pz0Var = this.d;
        if (i10 == pz0Var.c) {
            return 2;
        }
        if (i10 == pz0Var.e) {
            return 3;
        }
        return i10 == b() - 1 ? 4 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        if (d(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) c1Var.a;
        pz0 pz0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) pz0Var.getMediaDataController().h.get(i10 - pz0Var.d);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.k2) pz0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ui.b0(i11).Q());
        i12 = ((org.telegram.ui.ActionBar.k2) pz0Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        View view;
        pz0 pz0Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            z4Var = ((org.telegram.ui.ActionBar.k2) pz0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, z4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.x = pz0Var;
            view = z9Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setText(org.telegram.messenger.cd.L0(2131751353, null));
            view = b9Var;
        } else if (i10 == 3) {
            oz0 oz0Var = new oz0(pz0Var, context);
            oz0Var.a(false);
            view = oz0Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View bnVar = new org.telegram.ui.Components.bn(context, 19);
            bnVar.setTag(-33024);
            view = bnVar;
        }
        return new org.telegram.ui.Components.ck0(view);
    }
}
