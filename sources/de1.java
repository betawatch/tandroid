// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class de1 implements c39 {
    public final /* synthetic */ me1 a;

    public de1(me1 me1Var) {
        this.a = me1Var;
    }

    @Override // c39
    public final void d(int i, View view) {
        boolean z = view instanceof ie1;
        me1 me1Var = this.a;
        if (!z) {
            if (view instanceof ge1) {
                me1Var.c0(true);
                return;
            }
            return;
        }
        ie1 ie1Var = (ie1) view;
        TLRPC.TL_username tL_username = ie1Var.w;
        if (tL_username == null || ie1Var.r) {
            return;
        }
        if (tL_username.editable && me1Var.y == 0) {
            me1Var.b.z0(0);
            me1Var.c0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, me1Var.getResourceProvider(), me1Var.getParentActivity());
        String M0 = k96.M0(tL_username.active ? 2131743425 : 2131743432, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(tL_username.active ? 2131743423 : 2131743430, null);
        alertDialog$Builder.j(k96.M0(tL_username.active ? 2131749133 : 2131745161, null), new zm((Object) this, (Object) tL_username, i, (Object) view, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), new qm0((byte) 17));
        alertDialog$Builder.o();
    }
}
