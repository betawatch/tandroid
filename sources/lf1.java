// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lf1 implements f59 {
    public final /* synthetic */ uf1 a;

    public lf1(uf1 uf1Var) {
        this.a = uf1Var;
    }

    @Override // f59
    public final void g(int i, View view) {
        boolean z = view instanceof qf1;
        uf1 uf1Var = this.a;
        if (!z) {
            if (view instanceof of1) {
                uf1Var.d0(true);
                return;
            }
            return;
        }
        qf1 qf1Var = (qf1) view;
        TLRPC.TL_username tL_username = qf1Var.w;
        if (tL_username == null || qf1Var.r) {
            return;
        }
        if (tL_username.editable && uf1Var.y == 0) {
            uf1Var.b.z0(0);
            uf1Var.d0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uf1Var.getResourceProvider(), uf1Var.getParentActivity());
        String M0 = jb6.M0(tL_username.active ? 2131743351 : 2131743358, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(tL_username.active ? 2131743349 : 2131743356, null);
        alertDialog$Builder.j(jb6.M0(tL_username.active ? 2131749082 : 2131745087, null), new zn((Object) this, (Object) tL_username, i, (Object) view, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new qn0((byte) 17));
        alertDialog$Builder.o();
    }
}
