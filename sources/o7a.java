// default package

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o7a implements View.OnClickListener {
    public final /* synthetic */ e9a a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ p7a d;

    public o7a(p7a p7aVar, e9a e9aVar, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = p7aVar;
        this.a = e9aVar;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.m1.getParentActivity());
        String M0 = jb6.M0(2131743889, null);
        he heVar = alertDialog$Builder.a;
        heVar.U = M0;
        heVar.S = jb6.M0(2131754038, null);
        alertDialog$Builder.j(jb6.M0(2131743894, null), new jq9(this, this.a, this.b, (byte) 3));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        this.c.showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }
}
