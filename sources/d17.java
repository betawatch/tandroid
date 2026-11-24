// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d17 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ oc7 c;
    public final /* synthetic */ cf7 d;
    public final /* synthetic */ k17 e;

    public d17(k17 k17Var, String str, String str2, oc7 oc7Var, cf7 cf7Var) {
        this.e = k17Var;
        this.a = str;
        this.b = str2;
        this.c = oc7Var;
        this.d = cf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k17 k17Var = this.e;
        if (k17Var.z0 == this) {
            k17Var.z0 = null;
            TLRPC.User user = k17Var.x0;
            if (user != null || k17Var.w0) {
                if (k17Var.w0) {
                    return;
                }
                k17Var.T(true, user, this.a, "");
                return;
            }
            String str = this.b;
            k17Var.r0 = str;
            oc7 oc7Var = this.c;
            TLObject b2 = oc7Var.b2(str);
            if (b2 instanceof TLRPC.User) {
                k17Var.R((TLRPC.User) b2);
                return;
            }
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = k17Var.r0;
            k17Var.u0 = ConnectionsManager.getInstance(k17Var.f).sendRequest(tL_contacts_resolveUsername, new av0((Object) this, str, (Object) oc7Var, (Object) this.d, (byte) 9));
        }
    }
}
