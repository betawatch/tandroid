package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c00 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;

    public /* synthetic */ c00(c10 c10Var, int i10) {
        this.a = i10;
        this.b = c10Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        c10 c10Var = this.b;
        t00 t00Var = (t00) c10Var.M.get(i10);
        if (t00Var == null || !(view instanceof org.telegram.ui.Cells.ua)) {
            return false;
        }
        org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
        c10Var.v0(t00Var, uaVar.getName(), uaVar.getCurrentObject(), t00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                c10 c10Var = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = null;
                if (c10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(c10Var.getParentActivity(), 3, null);
                    d2Var3.d0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = c10Var.r.id;
                c10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new no(20, c10Var, d2Var2));
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
