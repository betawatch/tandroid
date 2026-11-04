package kg;

import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ hp c;
    public final /* synthetic */ qr d;
    public final /* synthetic */ e1 e;

    public w0(e1 e1Var, String str, String str2, hp hpVar, qr qrVar) {
        this.e = e1Var;
        this.a = str;
        this.b = str2;
        this.c = hpVar;
        this.d = qrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e1 e1Var = this.e;
        if (e1Var.z0 != this) {
            return;
        }
        e1Var.z0 = null;
        TLRPC.User user = e1Var.x0;
        if (user != null || e1Var.w0) {
            if (e1Var.w0) {
                return;
            }
            e1Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        e1Var.r0 = str;
        hp hpVar = this.c;
        TLObject f22 = hpVar.f2(str);
        if (f22 instanceof TLRPC.User) {
            e1Var.R((TLRPC.User) f22);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = e1Var.r0;
        e1Var.u0 = ConnectionsManager.getInstance(e1Var.f).sendRequest(tL_contacts_resolveUsername, new ai.q1(this, str, hpVar, this.d, 8));
    }
}
