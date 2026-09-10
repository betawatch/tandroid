package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g00 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h10 b;

    public /* synthetic */ g00(h10 h10Var, int i10) {
        this.a = i10;
        this.b = h10Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        h10 h10Var = this.b;
        y00 y00Var = (y00) h10Var.P.get(i10);
        if (y00Var == null || !(view instanceof org.telegram.ui.Cells.bb)) {
            return false;
        }
        org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
        h10Var.v0(y00Var, bbVar.getName(), bbVar.getCurrentObject(), y00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                h10 h10Var = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = null;
                if (h10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(h10Var.getParentActivity(), 3, null);
                    d2Var3.g0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = h10Var.r.id;
                h10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new org.telegram.ui.Components.th(15, h10Var, d2Var2));
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
