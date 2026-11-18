package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny implements org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ ny(kz kzVar, int i7) {
        this.a = i7;
        this.b = kzVar;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        kz kzVar = this.b;
        cz czVar = (cz) kzVar.Q.get(i7);
        if (czVar == null || !(view instanceof org.telegram.ui.Cells.qa)) {
            return false;
        }
        org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
        kzVar.B0(czVar, qaVar.getName(), qaVar.getCurrentObject(), czVar.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                kz kzVar = this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = null;
                if (kzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, kzVar.getParentActivity(), null);
                    u1Var3.j0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = kzVar.r.a;
                kzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new u7(28, kzVar, u1Var2));
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
