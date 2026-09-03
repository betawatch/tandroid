package mh;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Runnable {
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

    public /* synthetic */ f7(t7 t7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z4, long j10, int i10, MessageObject messageObject, long j11) {
        this.f = t7Var;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.c = z4;
        this.b = j10;
        this.e = i10;
        this.s = messageObject;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t7 t7Var = (t7) this.f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.r;
                boolean z4 = this.c;
                long j10 = this.b;
                int i10 = this.e;
                MessageObject messageObject = (MessageObject) this.s;
                long j11 = this.d;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z4) {
                        TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                        tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t7Var.a).getInputPeer(j10);
                        tL_messages_getScheduledMessages.id.add(Integer.valueOf(i10));
                        ConnectionsManager.getInstance(t7Var.a).sendRequest(tL_messages_getScheduledMessages, new u(t7Var, messageObject, j11, runnable, 2));
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new r6(t7Var, tLObject, 5));
                    runnable.run();
                    break;
                }
                break;
            default:
                ((MessagesStorage) this.f).lambda$updateUnreadReactionsCountInternal$261(this.b, this.c, (String) this.h, this.d, this.e, (String) this.n, (String) this.r, (String) this.s);
                break;
        }
    }

    public /* synthetic */ f7(MessagesStorage messagesStorage, long j10, boolean z4, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f = messagesStorage;
        this.b = j10;
        this.c = z4;
        this.h = str;
        this.d = j11;
        this.e = i10;
        this.n = str2;
        this.r = str3;
        this.s = str4;
    }
}
