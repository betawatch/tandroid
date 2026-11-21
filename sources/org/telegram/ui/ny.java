package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ ny(kz kzVar, int i7) {
        this.a = i7;
        this.b = kzVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        kz kzVar = this.b;
        cz czVar = (cz) kzVar.Q.get(i7);
        if (czVar == null || !(view instanceof org.telegram.ui.Cells.ra)) {
            return false;
        }
        org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
        kzVar.B0(czVar, raVar.getName(), raVar.getCurrentObject(), czVar.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                kz kzVar = this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = null;
                if (kzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, kzVar.getParentActivity(), null);
                    t1Var3.j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = kzVar.r.a;
                kzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new u7(28, kzVar, t1Var2));
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
