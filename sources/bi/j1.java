package bi;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;

    public /* synthetic */ j1(a2 a2Var, int i7) {
        this.a = i7;
        this.b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a2 a2Var = this.b;
                String str = a2Var.l2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    a2Var.m2 = ConnectionsManager.getInstance(a2Var.a).sendRequest(tL_contacts_search, new k1(0, a2Var, str));
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.j2.O(false);
                break;
            default:
                org.telegram.ui.ActionBar.h2 h2Var = this.b.s1;
                if (h2Var != null) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                    f2Var.a = true;
                    h2Var.showAsSheet(new PrivacyControlActivity(11, false), f2Var);
                    break;
                }
                break;
        }
    }
}
