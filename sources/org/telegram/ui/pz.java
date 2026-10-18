package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p00 b;

    public /* synthetic */ pz(p00 p00Var, int i10) {
        this.a = i10;
        this.b = p00Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        p00 p00Var = this.b;
        g00 g00Var = (g00) p00Var.P.get(i10);
        if (g00Var == null || !(view instanceof org.telegram.ui.Cells.va)) {
            return false;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        p00Var.v0(g00Var, vaVar.getName(), vaVar.getCurrentObject(), g00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                p00 p00Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (p00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(p00Var.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = p00Var.r.id;
                p00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new xc(27, p00Var, b2Var2));
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
