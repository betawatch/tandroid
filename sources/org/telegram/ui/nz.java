package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o00 b;

    public /* synthetic */ nz(o00 o00Var, int i10) {
        this.a = i10;
        this.b = o00Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        o00 o00Var = this.b;
        f00 f00Var = (f00) o00Var.P.get(i10);
        if (f00Var == null || !(view instanceof org.telegram.ui.Cells.ab)) {
            return false;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        o00Var.x0(f00Var, abVar.getName(), abVar.getCurrentObject(), f00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                o00 o00Var = this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = null;
                if (o00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(o00Var.getParentActivity(), 3, null);
                    e2Var3.i0 = false;
                    e2Var3.show();
                    e2Var2 = e2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = o00Var.r.id;
                o00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new z7(28, o00Var, e2Var2));
                break;
            case 2:
                this.b.s0();
                break;
            case 3:
                this.b.s0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
