package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ea implements org.telegram.ui.Components.gk0 {
    public final /* synthetic */ oa a;

    public ea(oa oaVar) {
        this.a = oaVar;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        boolean z10 = view instanceof la;
        oa oaVar = this.a;
        if (!z10) {
            if (view instanceof ia) {
                oaVar.i0(true);
                return;
            }
            return;
        }
        la laVar = (la) view;
        TLRPC.TL_username tL_username = laVar.w;
        if (tL_username == null || laVar.r) {
            return;
        }
        if (tL_username.editable && oaVar.y == 0) {
            oaVar.b.y0(0);
            oaVar.i0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, oaVar.getParentActivity(), oaVar.getResourceProvider());
        String L0 = org.telegram.messenger.cd.L0(tL_username.active ? 2131743690 : 2131743697, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(tL_username.active ? 2131743688 : 2131743695, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(tL_username.active ? 2131749334 : 2131745371, null), new mg.i0(this, tL_username, i10, view, 1));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Cells.m5(2));
        alertDialog$Builder.p();
    }
}
