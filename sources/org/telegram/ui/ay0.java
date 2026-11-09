package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ay0 extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ey0 d;

    public ay0(ey0 ey0Var, Context context) {
        this.d = ey0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.g0
    public final int b() {
        ey0 ey0Var = this.d;
        return ey0Var.f + (ey0Var.e < 0 ? ey0Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        ey0 ey0Var = this.d;
        if (i7 == ey0Var.c) {
            return 2;
        }
        if (i7 == ey0Var.e) {
            return 3;
        }
        return i7 == b() - 1 ? 4 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) d1Var.a;
        ey0 ey0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ey0Var.getMediaDataController().h.get(i7 - ey0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.f2) ey0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ui.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.f2) ey0Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i11);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.q4 q4Var;
        View view;
        ey0 ey0Var = this.d;
        Context context = this.c;
        if (i7 == 0) {
            q4Var = ((org.telegram.ui.ActionBar.f2) ey0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.x = ey0Var;
            view = z9Var;
        } else if (i7 == 2) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.id.M0(2131751352, null));
            view = z8Var;
        } else if (i7 == 3) {
            dy0 dy0Var = new dy0(ey0Var, context);
            dy0Var.a(false);
            view = dy0Var;
        } else if (i7 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View tmVar = new org.telegram.ui.Components.tm(context, 22);
            tmVar.setTag(-33024);
            view = tmVar;
        }
        return new org.telegram.ui.Components.yi0(view);
    }
}
