// default package

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class na2 implements f59 {
    public final /* synthetic */ pa2 a;

    public na2(pa2 pa2Var) {
        this.a = pa2Var;
    }

    @Override // f59
    public final void g(int i, View view) {
        TLRPC.TL_username tL_username;
        pa2 pa2Var = this.a;
        qa2 qa2Var = pa2Var.i3;
        if (!(view instanceof qf1) || (tL_username = ((qf1) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (qa2Var.fragmentView instanceof ScrollView) {
                qa2Var.a.smoothScrollTo(0, qa2Var.E.getTop() - gm.L(128.0f));
            }
            qa2Var.b.requestFocus();
            gm.E3(qa2Var.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qa2Var.getResourceProvider(), pa2Var.getContext());
        String M0 = jb6.M0(tL_username.active ? 2131743351 : 2131743358, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(tL_username.active ? 2131743350 : 2131743357, null);
        alertDialog$Builder.j(jb6.M0(tL_username.active ? 2131749082 : 2131745087, null), new jf((Object) this, (Object) tL_username, (Object) view, (byte) 27));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new a32((byte) 3));
        alertDialog$Builder.o();
    }
}
