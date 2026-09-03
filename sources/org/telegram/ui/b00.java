package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b10 b;

    public /* synthetic */ b00(b10 b10Var, int i10) {
        this.a = i10;
        this.b = b10Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        b10 b10Var = this.b;
        s00 s00Var = (s00) b10Var.M.get(i10);
        if (s00Var == null || !(view instanceof org.telegram.ui.Cells.va)) {
            return false;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        b10Var.v0(s00Var, vaVar.getName(), vaVar.getCurrentObject(), s00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                b10 b10Var = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = null;
                if (b10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(b10Var.getParentActivity(), 3, null);
                    d2Var3.d0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = b10Var.r.id;
                b10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new lo(20, b10Var, d2Var2));
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
