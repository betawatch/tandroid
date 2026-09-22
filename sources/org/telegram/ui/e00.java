package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;

    public /* synthetic */ e00(f10 f10Var, int i10) {
        this.a = i10;
        this.b = f10Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        f10 f10Var = this.b;
        w00 w00Var = (w00) f10Var.P.get(i10);
        if (w00Var == null || !(view instanceof org.telegram.ui.Cells.ab)) {
            return false;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        f10Var.v0(w00Var, abVar.getName(), abVar.getCurrentObject(), w00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                f10 f10Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (f10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(f10Var.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = f10Var.r.id;
                f10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new qo(20, f10Var, b2Var2));
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
