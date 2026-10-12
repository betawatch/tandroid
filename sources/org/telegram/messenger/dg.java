package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements Runnable {
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

    public /* synthetic */ dg(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f = messagesStorage;
        this.c = j10;
        this.b = z10;
        this.h = str;
        this.e = j11;
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
                zh.n5 n5Var = (zh.n5) this.f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.r;
                boolean z10 = this.b;
                long j10 = this.c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.s;
                long j11 = this.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                        TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                        tL_messages_getScheduledMessages.peer = MessagesController.getInstance(n5Var.a).getInputPeer(j10);
                        tL_messages_getScheduledMessages.id.add(Integer.valueOf(i10));
                        ConnectionsManager.getInstance(n5Var.a).sendRequest(tL_messages_getScheduledMessages, new p80(n5Var, messageObject, j11, runnable));
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new zh.u4(n5Var, tLObject, 5));
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dg(zh.n5 n5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f = n5Var;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.b = z10;
        this.c = j10;
        this.d = i10;
        this.s = messageObject;
        this.e = j11;
    }
}
