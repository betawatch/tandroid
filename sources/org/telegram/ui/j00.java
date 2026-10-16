package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j00 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k10 b;

    public /* synthetic */ j00(k10 k10Var, int i10) {
        this.a = i10;
        this.b = k10Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        k10 k10Var = this.b;
        b10 b10Var = (b10) k10Var.P.get(i10);
        if (b10Var == null || !(view instanceof org.telegram.ui.Cells.xa)) {
            return false;
        }
        org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
        k10Var.v0(b10Var, xaVar.getName(), xaVar.getCurrentObject(), b10Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                k10 k10Var = this.b;
                org.telegram.ui.ActionBar.a2 a2Var2 = null;
                if (k10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(k10Var.getParentActivity(), 3, null);
                    a2Var3.g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = k10Var.r.id;
                k10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new to(20, k10Var, a2Var2));
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
