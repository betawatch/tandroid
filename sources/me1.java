// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class me1 implements r69 {
    public final /* synthetic */ ve1 a;

    public me1(ve1 ve1Var) {
        this.a = ve1Var;
    }

    @Override // r69
    public final void e(int i, View view) {
        boolean z = view instanceof re1;
        ve1 ve1Var = this.a;
        if (!z) {
            if (view instanceof pe1) {
                ve1Var.c0(true);
                return;
            }
            return;
        }
        re1 re1Var = (re1) view;
        TLRPC.TL_username tL_username = re1Var.w;
        if (tL_username == null || re1Var.r) {
            return;
        }
        if (tL_username.editable && ve1Var.y == 0) {
            ve1Var.b.A0(0);
            ve1Var.c0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ve1Var.getResourceProvider(), ve1Var.getParentActivity());
        String M0 = ob6.M0(tL_username.active ? 2131743319 : 2131743326, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(tL_username.active ? 2131743317 : 2131743324, null);
        alertDialog$Builder.j(ob6.M0(tL_username.active ? 2131749079 : 2131745081, null), new an((Object) this, (Object) tL_username, i, (Object) view, (byte) 2));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new rm0((byte) 20));
        alertDialog$Builder.o();
    }
}
