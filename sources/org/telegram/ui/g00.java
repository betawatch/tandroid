package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g00 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h10 b;

    public /* synthetic */ g00(h10 h10Var, int i10) {
        this.a = i10;
        this.b = h10Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        h10 h10Var = this.b;
        y00 y00Var = (y00) h10Var.P.get(i10);
        if (y00Var == null || !(view instanceof org.telegram.ui.Cells.ab)) {
            return false;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        h10Var.v0(y00Var, abVar.getName(), abVar.getCurrentObject(), y00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                h10 h10Var = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (h10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(h10Var.getParentActivity(), 3, null);
                    c2Var3.g0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = h10Var.r.id;
                h10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new qo(20, h10Var, c2Var2));
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
