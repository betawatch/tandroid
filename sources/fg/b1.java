package fg;

import bi.l9;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ MessagesStorage d;
    public final /* synthetic */ l1 e;

    public b1(l1 l1Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = l1Var;
        this.a = str;
        this.b = str2;
        this.c = messagesController;
        this.d = messagesStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = this.e;
        if (l1Var.y0 != this) {
            return;
        }
        l1Var.y0 = null;
        TLRPC.User user = l1Var.w0;
        if (user != null || l1Var.v0) {
            if (l1Var.v0) {
                return;
            }
            l1Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        l1Var.q0 = str;
        MessagesController messagesController = this.c;
        TLObject userOrChat = messagesController.getUserOrChat(str);
        if (userOrChat instanceof TLRPC.User) {
            l1Var.R((TLRPC.User) userOrChat);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = l1Var.q0;
        l1Var.t0 = ConnectionsManager.getInstance(l1Var.f).sendRequest(tL_contacts_resolveUsername, new l9(this, str, messagesController, this.d, 1));
    }
}
