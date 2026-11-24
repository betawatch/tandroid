// default package

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n5c extends c6 {
    public final /* synthetic */ p5c a;

    public n5c(p5c p5cVar) {
        this.a = p5cVar;
    }

    @Override // c6
    public final void b(int i) {
        tk5 tk5Var;
        p5c p5cVar = this.a;
        if (i == -1) {
            if (p5cVar.H >= 0) {
                tk5Var = ((d) p5cVar).parentLayout;
                if (tk5Var.getFragmentStack().size() == 1) {
                    p5cVar.N0();
                    return;
                }
            }
            p5cVar.finishFragment();
            return;
        }
        if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
            TL_account.Password password = p5cVar.V;
            String M0 = (password == null || !password.has_password) ? jb6.M0(2131752531, null) : jb6.M0(2131752539, null);
            String M02 = jb6.M0(2131752538, null);
            String M03 = jb6.M0(2131754950, null);
            he heVar = alertDialog$Builder.a;
            heVar.U = M0;
            heVar.S = M02;
            alertDialog$Builder.j(M03, new wta(this, (byte) 24));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            p5cVar.showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }
}
