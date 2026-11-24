// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ha2 extends c6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qa2 b;

    public ha2(qa2 qa2Var, Context context) {
        this.b = qa2Var;
        this.a = context;
    }

    @Override // c6
    public final void b(int i) {
        qa2 qa2Var = this.b;
        if (i == -1) {
            qa2Var.finishFragment();
            return;
        }
        if (i == 1) {
            uja ujaVar = qa2Var.r;
            if (ujaVar == null || !ujaVar.y.f) {
                String K = sd2.K(qa2Var.Y, false);
                if (!qa2Var.W || TextUtils.isEmpty(K)) {
                    qa2Var.e0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qa2Var.getResourceProvider(), this.a);
                String M0 = jb6.M0(qa2Var.b0 ? 2131748459 : 2131748457, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = gm.S2(jb6.a0(null, null, qa2Var.b0 ? 2131748460 : 2131748458, kt6.p(qa2Var.getMessagesController().N2, "/", K, new StringBuilder())));
                alertDialog$Builder.j(jb6.M0(2131751708, null), new cd1(this, (byte) 23));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                qa2Var.showDialog(heVar);
            }
        }
    }
}
