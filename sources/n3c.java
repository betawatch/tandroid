// default package

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n3c extends c6 {
    public final /* synthetic */ p3c a;

    public n3c(p3c p3cVar) {
        this.a = p3cVar;
    }

    @Override // c6
    public final void b(int i) {
        ui5 ui5Var;
        p3c p3cVar = this.a;
        if (i == -1) {
            if (p3cVar.H >= 0) {
                ui5Var = ((d) p3cVar).parentLayout;
                if (ui5Var.getFragmentStack().size() == 1) {
                    p3cVar.M0();
                    return;
                }
            }
            p3cVar.finishFragment();
            return;
        }
        if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
            TL_account.Password password = p3cVar.V;
            String M0 = (password == null || !password.has_password) ? k96.M0(2131752566, null) : k96.M0(2131752574, null);
            String M02 = k96.M0(2131752573, null);
            String M03 = k96.M0(2131754950, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.U = M0;
            hdVar.S = M02;
            alertDialog$Builder.j(M03, new hza(this, (byte) 20));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            p3cVar.showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }
}
