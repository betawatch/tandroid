// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n5a extends fx0 {
    public TLRPC.TL_authorization l1;
    public SessionsActivity m1;
    public ry8 n1;

    public final void D0(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.e(new CharSequence[]{k96.M0(2131751755, null)}, new fe((Object) this, (Object) str, (byte) 11));
        alertDialog$Builder.o();
    }

    public final void E0() {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = this.l1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(this.a).sendRequest(changeauthorizationsettings, new ce2((byte) 0));
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        this.n1.d();
    }
}
