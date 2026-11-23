package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class my implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;

    public /* synthetic */ my(jz jzVar, int i7) {
        this.a = i7;
        this.b = jzVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        jz jzVar = this.b;
        bz bzVar = (bz) jzVar.Q.get(i7);
        if (bzVar == null || !(view instanceof org.telegram.ui.Cells.sa)) {
            return false;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        jzVar.B0(bzVar, saVar.getName(), saVar.getCurrentObject(), bzVar.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                jz jzVar = this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = null;
                if (jzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, jzVar.getParentActivity(), null);
                    t1Var3.j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = jzVar.r.a;
                jzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new v7(28, jzVar, t1Var2));
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
