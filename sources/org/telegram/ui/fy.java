package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;

    public /* synthetic */ fy(ez ezVar, int i3) {
        this.a = i3;
        this.b = ezVar;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        ez ezVar = this.b;
        vy vyVar = (vy) ezVar.Q.get(i3);
        if (vyVar == null || !(view instanceof org.telegram.ui.Cells.pa)) {
            return false;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        ezVar.B0(vyVar, paVar.getName(), paVar.getCurrentObject(), vyVar.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                ez ezVar = this.b;
                org.telegram.ui.ActionBar.s1 s1Var2 = null;
                if (ezVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, ezVar.getParentActivity(), null);
                    s1Var3.j0 = false;
                    s1Var3.show();
                    s1Var2 = s1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = ezVar.r.a;
                ezVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new org.telegram.ui.ActionBar.h6(29, ezVar, s1Var2));
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
