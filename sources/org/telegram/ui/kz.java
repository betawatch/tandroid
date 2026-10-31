package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz implements org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i00 b;

    public /* synthetic */ kz(i00 i00Var, int i10) {
        this.a = i10;
        this.b = i00Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        i00 i00Var = this.b;
        a00 a00Var = (a00) i00Var.P.get(i10);
        if (a00Var == null || !(view instanceof org.telegram.ui.Cells.pa)) {
            return false;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        i00Var.A0(a00Var, paVar.getName(), paVar.getCurrentObject(), a00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                i00 i00Var = this.b;
                org.telegram.ui.ActionBar.x1 x1Var2 = null;
                if (i00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, i00Var.getParentActivity(), null);
                    x1Var3.i0 = false;
                    x1Var3.show();
                    x1Var2 = x1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = i00Var.r.a;
                i00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new org.telegram.ui.Components.t20(10, i00Var, x1Var2));
                break;
            case 2:
                this.b.v0();
                break;
            case 3:
                this.b.v0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
