package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ox0 extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ sx0 d;

    public ox0(sx0 sx0Var, Context context) {
        this.d = sx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 3 || i3 == 2;
    }

    @Override // u4.h0
    public final int b() {
        sx0 sx0Var = this.d;
        return sx0Var.f + (sx0Var.e < 0 ? sx0Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        sx0 sx0Var = this.d;
        if (i3 == sx0Var.c) {
            return 2;
        }
        if (i3 == sx0Var.e) {
            return 3;
        }
        return i3 == b() - 1 ? 4 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        if (d(i3) != 1) {
            return;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) d1Var.a;
        sx0 sx0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) sx0Var.getMediaDataController().h.get(i3 - sx0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.li.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i11);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.q4 q4Var;
        View view;
        sx0 sx0Var = this.d;
        Context context = this.c;
        if (i3 == 0) {
            q4Var = ((org.telegram.ui.ActionBar.d2) sx0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.x = sx0Var;
            view = z9Var;
        } else if (i3 == 2) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(org.telegram.messenger.bd.M0(2131751353, null));
            view = y8Var;
        } else if (i3 == 3) {
            rx0 rx0Var = new rx0(sx0Var, context);
            rx0Var.a(false);
            view = rx0Var;
        } else if (i3 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View smVar = new org.telegram.ui.Components.sm(context, 23);
            smVar.setTag(-33024);
            view = smVar;
        }
        return new org.telegram.ui.Components.bj0(view);
    }
}
