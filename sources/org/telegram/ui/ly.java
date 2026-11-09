package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly implements org.telegram.ui.Components.ej0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz b;

    public /* synthetic */ ly(iz izVar, int i7) {
        this.a = i7;
        this.b = izVar;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        iz izVar = this.b;
        az azVar = (az) izVar.P.get(i7);
        if (azVar == null || !(view instanceof org.telegram.ui.Cells.pa)) {
            return false;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        izVar.B0(azVar, paVar.getName(), paVar.getCurrentObject(), azVar.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                iz izVar = this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = null;
                if (izVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, izVar.getParentActivity(), null);
                    u1Var3.i0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = izVar.r.a;
                izVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ld(26, izVar, u1Var2));
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
