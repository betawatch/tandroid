package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j00 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l10 b;

    public /* synthetic */ j00(l10 l10Var, int i10) {
        this.a = i10;
        this.b = l10Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        l10 l10Var = this.b;
        c10 c10Var = (c10) l10Var.P.get(i10);
        if (c10Var == null || !(view instanceof org.telegram.ui.Cells.xa)) {
            return false;
        }
        org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
        l10Var.v0(c10Var, xaVar.getName(), xaVar.getCurrentObject(), c10Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                l10 l10Var = this.b;
                org.telegram.ui.ActionBar.a2 a2Var2 = null;
                if (l10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(l10Var.getParentActivity(), 3, null);
                    a2Var3.g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = l10Var.r.id;
                l10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new to(20, l10Var, a2Var2));
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                this.b.q0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
