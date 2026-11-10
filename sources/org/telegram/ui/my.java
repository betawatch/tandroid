package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class my implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;

    public /* synthetic */ my(jz jzVar, int i7) {
        this.a = i7;
        this.b = jzVar;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        jz jzVar = this.b;
        bz bzVar = (bz) jzVar.P.get(i7);
        if (bzVar == null || !(view instanceof org.telegram.ui.Cells.pa)) {
            return false;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        jzVar.B0(bzVar, paVar.getName(), paVar.getCurrentObject(), bzVar.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                jz jzVar = this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = null;
                if (jzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, jzVar.getParentActivity(), null);
                    u1Var3.i0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = jzVar.r.a;
                jzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ld(26, jzVar, u1Var2));
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
