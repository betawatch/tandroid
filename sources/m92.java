// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m92 extends d6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ v92 b;

    public m92(v92 v92Var, Context context) {
        this.b = v92Var;
        this.a = context;
    }

    @Override // d6
    public final void b(int i) {
        v92 v92Var = this.b;
        if (i == -1) {
            v92Var.finishFragment();
            return;
        }
        if (i == 1) {
            nla nlaVar = v92Var.r;
            if (nlaVar == null || !nlaVar.y.f) {
                String K = xc2.K(v92Var.Y, false);
                if (!v92Var.W || TextUtils.isEmpty(K)) {
                    v92Var.d0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v92Var.getResourceProvider(), this.a);
                String M0 = ob6.M0(v92Var.b0 ? 2131748456 : 2131748454, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = hl.S2(ob6.a0(null, null, v92Var.b0 ? 2131748457 : 2131748455, qu6.o(v92Var.getMessagesController().N2, "/", K, new StringBuilder())));
                alertDialog$Builder.j(ob6.M0(2131751736, null), new rd1(this, (byte) 22));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                v92Var.showDialog(idVar);
            }
        }
    }
}
