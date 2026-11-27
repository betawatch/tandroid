// default package

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m7c extends d6 {
    public final /* synthetic */ o7c a;

    public m7c(o7c o7cVar) {
        this.a = o7cVar;
    }

    @Override // d6
    public final void b(int i) {
        wk5 wk5Var;
        o7c o7cVar = this.a;
        if (i == -1) {
            if (o7cVar.H >= 0) {
                wk5Var = ((e) o7cVar).parentLayout;
                if (wk5Var.getFragmentStack().size() == 1) {
                    o7cVar.N0();
                    return;
                }
            }
            o7cVar.finishFragment();
            return;
        }
        if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
            TL_account.Password password = o7cVar.V;
            String M0 = (password == null || !password.has_password) ? ob6.M0(2131752559, null) : ob6.M0(2131752567, null);
            String M02 = ob6.M0(2131752566, null);
            String M03 = ob6.M0(2131754946, null);
            id idVar = alertDialog$Builder.a;
            idVar.U = M0;
            idVar.S = M02;
            alertDialog$Builder.j(M03, new ftb(this, (byte) 3));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            o7cVar.showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        }
    }
}
