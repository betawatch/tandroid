package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;

    public /* synthetic */ jz(h00 h00Var, int i10) {
        this.a = i10;
        this.b = h00Var;
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        h00 h00Var = this.b;
        zz zzVar = (zz) h00Var.P.get(i10);
        if (zzVar == null || !(view instanceof org.telegram.ui.Cells.pa)) {
            return false;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        h00Var.B0(zzVar, paVar.getName(), paVar.getCurrentObject(), zzVar.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                h00 h00Var = this.b;
                org.telegram.ui.ActionBar.x1 x1Var2 = null;
                if (h00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, h00Var.getParentActivity(), null);
                    x1Var3.i0 = false;
                    x1Var3.show();
                    x1Var2 = x1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = h00Var.r.a;
                h00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new org.telegram.ui.Components.t20(10, h00Var, x1Var2));
                break;
            case 2:
                this.b.w0();
                break;
            case 3:
                this.b.w0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
