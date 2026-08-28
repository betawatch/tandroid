package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;

    public /* synthetic */ nz(n00 n00Var, int i9) {
        this.a = i9;
        this.b = n00Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        n00 n00Var = this.b;
        e00 e00Var = (e00) n00Var.L.get(i9);
        if (e00Var == null || !(view instanceof org.telegram.ui.Cells.va)) {
            return false;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        n00Var.u0(e00Var, vaVar.getName(), vaVar.getCurrentObject(), e00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                n00 n00Var = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (n00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(n00Var.getParentActivity(), 3, null);
                    c2Var3.c0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = n00Var.r.id;
                n00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new rc(27, n00Var, c2Var2));
                break;
            case 2:
                this.b.p0();
                break;
            case 3:
                this.b.p0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
