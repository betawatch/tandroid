package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p00 b;

    public /* synthetic */ pz(p00 p00Var, int i10) {
        this.a = i10;
        this.b = p00Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        p00 p00Var = this.b;
        g00 g00Var = (g00) p00Var.L.get(i10);
        if (g00Var == null || !(view instanceof org.telegram.ui.Cells.sa)) {
            return false;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        p00Var.v0(g00Var, saVar.getName(), saVar.getCurrentObject(), g00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                p00 p00Var = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (p00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(p00Var.getParentActivity(), 3, null);
                    c2Var3.c0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = p00Var.r.id;
                p00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new zg(23, p00Var, c2Var2));
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
