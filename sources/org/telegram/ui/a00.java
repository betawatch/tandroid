package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b10 b;

    public /* synthetic */ a00(b10 b10Var, int i10) {
        this.a = i10;
        this.b = b10Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        b10 b10Var = this.b;
        s00 s00Var = (s00) b10Var.P.get(i10);
        if (s00Var == null || !(view instanceof org.telegram.ui.Cells.za)) {
            return false;
        }
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        b10Var.v0(s00Var, zaVar.getName(), zaVar.getCurrentObject(), s00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                b10 b10Var = this.b;
                org.telegram.ui.ActionBar.a2 a2Var2 = null;
                if (b10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(b10Var.getParentActivity(), 3, null);
                    a2Var3.g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = b10Var.r.id;
                b10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new lo(20, b10Var, a2Var2));
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
