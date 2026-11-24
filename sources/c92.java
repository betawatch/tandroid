// default package

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c92 implements c39 {
    public final /* synthetic */ e92 a;

    public c92(e92 e92Var) {
        this.a = e92Var;
    }

    @Override // c39
    public final void d(int i, View view) {
        TLRPC.TL_username tL_username;
        e92 e92Var = this.a;
        f92 f92Var = e92Var.i3;
        if (!(view instanceof ie1) || (tL_username = ((ie1) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (f92Var.fragmentView instanceof ScrollView) {
                f92Var.a.smoothScrollTo(0, f92Var.E.getTop() - gl.L(128.0f));
            }
            f92Var.b.requestFocus();
            gl.E3(f92Var.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f92Var.getResourceProvider(), e92Var.getContext());
        String M0 = k96.M0(tL_username.active ? 2131743425 : 2131743432, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(tL_username.active ? 2131743424 : 2131743431, null);
        alertDialog$Builder.j(k96.M0(tL_username.active ? 2131749133 : 2131745161, null), new ie((Object) this, (Object) tL_username, (Object) view, (byte) 27));
        alertDialog$Builder.g(k96.M0(2131752577, null), new k32((byte) 2));
        alertDialog$Builder.o();
    }
}
