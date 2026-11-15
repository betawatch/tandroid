package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky implements org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz b;

    public /* synthetic */ ky(hz hzVar, int i7) {
        this.a = i7;
        this.b = hzVar;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        hz hzVar = this.b;
        zy zyVar = (zy) hzVar.Q.get(i7);
        if (zyVar == null || !(view instanceof org.telegram.ui.Cells.pa)) {
            return false;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        hzVar.B0(zyVar, paVar.getName(), paVar.getCurrentObject(), zyVar.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                hz hzVar = this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = null;
                if (hzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, hzVar.getParentActivity(), null);
                    t1Var3.j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = hzVar.r.a;
                hzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new v7(28, hzVar, t1Var2));
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
