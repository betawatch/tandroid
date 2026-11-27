// default package

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class e9a implements View.OnClickListener {
    public final /* synthetic */ uaa a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ SessionsActivity c;
    public final /* synthetic */ f9a d;

    public e9a(f9a f9aVar, uaa uaaVar, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = f9aVar;
        this.a = uaaVar;
        this.b = tL_authorization;
        this.c = sessionsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.m1.getParentActivity());
        String M0 = ob6.M0(2131743857, null);
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(2131754066, null);
        alertDialog$Builder.j(ob6.M0(2131743862, null), new o48((Object) this, (Object) this.a, (Object) this.b, (byte) 12));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        this.c.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }
}
