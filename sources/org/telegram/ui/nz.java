package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements org.telegram.ui.Components.zl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;

    public /* synthetic */ nz(n00 n00Var, int i10) {
        this.a = i10;
        this.b = n00Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        n00 n00Var = this.b;
        e00 e00Var = (e00) n00Var.P.get(i10);
        if (e00Var == null || !(view instanceof org.telegram.ui.Cells.va)) {
            return false;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        n00Var.v0(e00Var, vaVar.getName(), vaVar.getCurrentObject(), e00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                n00 n00Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (n00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(n00Var.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = n00Var.r.id;
                n00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new vc(27, n00Var, b2Var2));
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
