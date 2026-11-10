package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class by0 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ fy0 d;

    public by0(fy0 fy0Var, Context context) {
        this.d = fy0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.g0
    public final int b() {
        fy0 fy0Var = this.d;
        return fy0Var.f + (fy0Var.e < 0 ? fy0Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        fy0 fy0Var = this.d;
        if (i7 == fy0Var.c) {
            return 2;
        }
        if (i7 == fy0Var.e) {
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
        fy0 fy0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) fy0Var.getMediaDataController().h.get(i7 - fy0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.f2) fy0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ui.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.f2) fy0Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i11);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        View view;
        fy0 fy0Var = this.d;
        Context context = this.c;
        if (i7 == 0) {
            r4Var = ((org.telegram.ui.ActionBar.f2) fy0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, r4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.x = fy0Var;
            view = z9Var;
        } else if (i7 == 2) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.id.M0(2131751352, null));
            view = z8Var;
        } else if (i7 == 3) {
            ey0 ey0Var = new ey0(fy0Var, context);
            ey0Var.a(false);
            view = ey0Var;
        } else if (i7 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View smVar = new org.telegram.ui.Components.sm(context, 22);
            smVar.setTag(-33024);
            view = smVar;
        }
        return new org.telegram.ui.Components.xi0(view);
    }
}
