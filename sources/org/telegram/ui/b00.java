package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;

    public /* synthetic */ b00(c10 c10Var, int i10) {
        this.a = i10;
        this.b = c10Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        c10 c10Var = this.b;
        t00 t00Var = (t00) c10Var.P.get(i10);
        if (t00Var == null || !(view instanceof org.telegram.ui.Cells.bb)) {
            return false;
        }
        org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
        c10Var.v0(t00Var, bbVar.getName(), bbVar.getCurrentObject(), t00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                c10 c10Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (c10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(c10Var.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = c10Var.r.id;
                c10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new mo(20, c10Var, b2Var2));
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
