package of;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ MessagesStorage d;
    public final /* synthetic */ f1 e;

    public x0(f1 f1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = f1Var;
        this.a = str;
        this.b = str2;
        this.c = messagesController;
        this.d = messagesStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1 f1Var = this.e;
        if (f1Var.u0 != this) {
            return;
        }
        f1Var.u0 = null;
        TLRPC.User user = f1Var.s0;
        if (user != null || f1Var.r0) {
            if (f1Var.r0) {
                return;
            }
            f1Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        f1Var.m0 = str;
        MessagesController messagesController = this.c;
        TLObject userOrChat = messagesController.getUserOrChat(str);
        if (userOrChat instanceof TLRPC.User) {
            f1Var.R((TLRPC.User) userOrChat);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = f1Var.m0;
        f1Var.p0 = ConnectionsManager.getInstance(f1Var.f).sendRequest(tL_contacts_resolveUsername, new fh.h1(this, str, messagesController, this.d, 8));
    }
}
