package gh;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ h7(v7 v7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i9, MessageObject messageObject, long j11) {
        this.f = v7Var;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.c = z10;
        this.b = j10;
        this.e = i9;
        this.s = messageObject;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = (v7) this.f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.r;
                boolean z10 = this.c;
                long j10 = this.b;
                int i9 = this.e;
                MessageObject messageObject = (MessageObject) this.s;
                long j11 = this.d;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                        TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                        tL_messages_getScheduledMessages.peer = MessagesController.getInstance(v7Var.a).getInputPeer(j10);
                        tL_messages_getScheduledMessages.id.add(Integer.valueOf(i9));
                        ConnectionsManager.getInstance(v7Var.a).sendRequest(tL_messages_getScheduledMessages, new w(v7Var, messageObject, j11, runnable, 2));
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new t6(v7Var, tLObject, 5));
                    runnable.run();
                    break;
                }
                break;
            default:
                ((MessagesStorage) this.f).lambda$updateUnreadReactionsCountInternal$261(this.b, this.c, (String) this.h, this.d, this.e, (String) this.n, (String) this.r, (String) this.s);
                break;
        }
    }

    public /* synthetic */ h7(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i9, String str2, String str3, String str4) {
        this.f = messagesStorage;
        this.b = j10;
        this.c = z10;
        this.h = str;
        this.d = j11;
        this.e = i9;
        this.n = str2;
        this.r = str3;
        this.s = str4;
    }
}
