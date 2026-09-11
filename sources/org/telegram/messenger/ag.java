package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class ag implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f = messagesStorage;
        this.c = j3;
        this.b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.n = str2;
        this.r = str3;
        this.s = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesStorage) this.f).lambda$updateUnreadReactionsCountInternal$261(this.c, this.b, (String) this.h, this.e, this.d, (String) this.n, (String) this.r, (String) this.s);
                break;
            default:
                zh.s5 s5Var = (zh.s5) this.f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.r;
                boolean z10 = this.b;
                long j3 = this.c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.s;
                long j10 = this.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                        TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                        tL_messages_getScheduledMessages.peer = MessagesController.getInstance(s5Var.a).getInputPeer(j3);
                        tL_messages_getScheduledMessages.id.add(Integer.valueOf(i10));
                        ConnectionsManager.getInstance(s5Var.a).sendRequest(tL_messages_getScheduledMessages, new ia(s5Var, messageObject, j10, runnable, 8));
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new zh.y4(s5Var, tLObject, 5));
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ag(zh.s5 s5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f = s5Var;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.b = z10;
        this.c = j3;
        this.d = i10;
        this.s = messageObject;
        this.e = j10;
    }
}
