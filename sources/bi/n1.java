package bi;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ n1(e2 e2Var, int i7) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                String str = e2Var.l2;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    e2Var.m2 = ConnectionsManager.getInstance(e2Var.a).sendRequest(tL_contacts_search, new o1(0, e2Var, str));
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
                org.telegram.ui.ActionBar.g2 g2Var = this.b.s1;
                if (g2Var != null) {
                    org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                    e2Var2.a = true;
                    g2Var.showAsSheet(new PrivacyControlActivity(11, false), e2Var2);
                    break;
                }
                break;
        }
    }
}
