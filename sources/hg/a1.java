package hg;

import ai.k2;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ MessagesStorage d;
    public final /* synthetic */ j1 e;

    public a1(j1 j1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = j1Var;
        this.a = str;
        this.b = str2;
        this.c = messagesController;
        this.d = messagesStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.e;
        if (j1Var.y0 != this) {
            return;
        }
        j1Var.y0 = null;
        TLRPC.User user = j1Var.w0;
        if (user != null || j1Var.v0) {
            if (j1Var.v0) {
                return;
            }
            j1Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        j1Var.q0 = str;
        MessagesController messagesController = this.c;
        TLObject userOrChat = messagesController.getUserOrChat(str);
        if (userOrChat instanceof TLRPC.User) {
            j1Var.R((TLRPC.User) userOrChat);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = j1Var.q0;
        j1Var.t0 = ConnectionsManager.getInstance(j1Var.f).sendRequest(tL_contacts_resolveUsername, new k2(this, str, messagesController, this.d, 7));
    }
}
