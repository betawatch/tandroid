// default package

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nu4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu4 b;

    public /* synthetic */ nu4(xu4 xu4Var, byte b) {
        this.a = b;
        this.b = xu4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xu4 xu4Var = this.b;
        switch (b) {
            case 0:
                String str = xu4Var.k2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    xu4Var.l2 = ConnectionsManager.getInstance(xu4Var.a).sendRequest(tL_contacts_search, new rv3(xu4Var, str, (byte) 8));
                    break;
                }
                break;
            case 1:
                xu4Var.dismiss();
                break;
            case 2:
                xu4Var.i2.O(false);
                break;
            default:
                d dVar = xu4Var.r1;
                if (dVar != null) {
                    ag0 ag0Var = new ag0();
                    ag0Var.a = true;
                    dVar.showAsSheet(new PrivacyControlActivity(11, false), ag0Var);
                    break;
                }
                break;
        }
    }
}
