package hg;

import bi.c3;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class b1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ MessagesStorage d;
    public final /* synthetic */ k1 e;

    public b1(k1 k1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = k1Var;
        this.a = str;
        this.b = str2;
        this.c = messagesController;
        this.d = messagesStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k1 k1Var = this.e;
        if (k1Var.y0 != this) {
            return;
        }
        k1Var.y0 = null;
        TLRPC.User user = k1Var.w0;
        if (user != null || k1Var.v0) {
            if (k1Var.v0) {
                return;
            }
            k1Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        k1Var.q0 = str;
        MessagesController messagesController = this.c;
        TLObject userOrChat = messagesController.getUserOrChat(str);
        if (userOrChat instanceof TLRPC.User) {
            k1Var.R((TLRPC.User) userOrChat);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = k1Var.q0;
        k1Var.t0 = ConnectionsManager.getInstance(k1Var.f).sendRequest(tL_contacts_resolveUsername, new c3(this, str, messagesController, this.d, 2));
    }
}
