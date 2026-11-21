package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ay0 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ey0 d;

    public ay0(ey0 ey0Var, Context context) {
        this.d = ey0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.i0
    public final int b() {
        ey0 ey0Var = this.d;
        return ey0Var.f + (ey0Var.e < 0 ? ey0Var.getMediaDataController().h.size() : 0) + 1;
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) f1Var.a;
        ey0 ey0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ey0Var.getMediaDataController().h.get(i7 - ey0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ri.d0(i10).S());
        i11 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i11);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        View view;
        ey0 ey0Var = this.d;
        Context context = this.c;
        if (i7 == 0) {
            r4Var = ((org.telegram.ui.ActionBar.g2) ey0Var).parentLayout;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, r4Var, 2);
            baVar.setImportantForAccessibility(4);
            baVar.x = ey0Var;
            view = baVar;
        } else if (i7 == 2) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(org.telegram.messenger.gd.N0(2131751340, null));
            view = a9Var;
        } else if (i7 == 3) {
            dy0 dy0Var = new dy0(ey0Var, context);
            dy0Var.a(false);
            view = dy0Var;
        } else if (i7 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View lnVar = new org.telegram.ui.Components.ln(context, 22);
            lnVar.setTag(-33024);
            view = lnVar;
        }
        return new org.telegram.ui.Components.mj0(view);
    }
}
