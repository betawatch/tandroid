// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k17 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ uc7 c;
    public final /* synthetic */ jf7 d;
    public final /* synthetic */ r17 e;

    public k17(r17 r17Var, String str, String str2, uc7 uc7Var, jf7 jf7Var) {
        this.e = r17Var;
        this.a = str;
        this.b = str2;
        this.c = uc7Var;
        this.d = jf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r17 r17Var = this.e;
        if (r17Var.z0 == this) {
            r17Var.z0 = null;
            TLRPC.User user = r17Var.x0;
            if (user != null || r17Var.w0) {
                if (r17Var.w0) {
                    return;
                }
                r17Var.T(true, user, this.a, "");
                return;
            }
            String str = this.b;
            r17Var.r0 = str;
            uc7 uc7Var = this.c;
            TLObject c2 = uc7Var.c2(str);
            if (c2 instanceof TLRPC.User) {
                r17Var.R((TLRPC.User) c2);
                return;
            }
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = r17Var.r0;
            r17Var.u0 = ConnectionsManager.getInstance(r17Var.f).sendRequest(tL_contacts_resolveUsername, new au0((Object) this, str, (Object) uc7Var, (Object) this.d, (byte) 9));
        }
    }
}
