package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class ad implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ad(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.a = 1;
        this.b = messagesController;
        this.f = arrayList;
        this.c = j10;
        this.h = updates_channeldifference;
        this.n = chat;
        this.r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$ensureMessagesLoaded$463((boolean[]) this.f, (MessagesStorage) this.h, this.c, (Runnable[]) this.n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.r);
                break;
            case 1:
                ((MessagesController) this.b).lambda$getChannelDifference$346((ArrayList) this.f, this.c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.n, (a0.h) this.r, this.d, this.e);
                break;
            case 2:
                ((WearReplyReceiver) this.b).lambda$onReceive$0((AccountInstance) this.f, (TLRPC.User) this.h, (CharSequence) this.n, this.c, this.e, this.d, (int[]) this.r);
                break;
            default:
                ((WearReplyReceiver) this.b).lambda$onReceive$2((AccountInstance) this.f, (TLRPC.Chat) this.h, (CharSequence) this.n, this.c, this.e, this.d, (int[]) this.r);
                break;
        }
    }

    public /* synthetic */ ad(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.a = 0;
        this.b = messagesController;
        this.f = zArr;
        this.h = messagesStorage;
        this.c = j10;
        this.n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.r = messagesLoadedCallback;
    }

    public /* synthetic */ ad(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.a = i11;
        this.b = wearReplyReceiver;
        this.f = accountInstance;
        this.h = tLObject;
        this.n = charSequence;
        this.c = j10;
        this.e = j11;
        this.d = i10;
        this.r = iArr;
    }
}
