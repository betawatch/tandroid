package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class oc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ oc(MessagesController messagesController, ArrayList arrayList, long j3, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.a = 1;
        this.b = messagesController;
        this.f = arrayList;
        this.c = j3;
        this.h = updates_channeldifference;
        this.n = chat;
        this.r = iVar;
        this.d = i10;
        this.e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$ensureMessagesLoaded$460((boolean[]) this.f, (MessagesStorage) this.h, this.c, (Runnable[]) this.n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.r);
                break;
            case 1:
                ((MessagesController) this.b).lambda$getChannelDifference$347((ArrayList) this.f, this.c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.n, (a0.i) this.r, this.d, this.e);
                break;
            case 2:
                ((WearReplyReceiver) this.b).lambda$onReceive$0((AccountInstance) this.f, (TLRPC.User) this.h, (CharSequence) this.n, this.c, this.e, this.d, (int[]) this.r);
                break;
            default:
                ((WearReplyReceiver) this.b).lambda$onReceive$2((AccountInstance) this.f, (TLRPC.Chat) this.h, (CharSequence) this.n, this.c, this.e, this.d, (int[]) this.r);
                break;
        }
    }

    public /* synthetic */ oc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j3, Runnable[] runnableArr, long j10, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.a = 0;
        this.b = messagesController;
        this.f = zArr;
        this.h = messagesStorage;
        this.c = j3;
        this.n = runnableArr;
        this.e = j10;
        this.d = i10;
        this.r = messagesLoadedCallback;
    }

    public /* synthetic */ oc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j3, long j10, int i10, int[] iArr, int i11) {
        this.a = i11;
        this.b = wearReplyReceiver;
        this.f = accountInstance;
        this.h = tLObject;
        this.n = charSequence;
        this.c = j3;
        this.e = j10;
        this.d = i10;
        this.r = iArr;
    }
}
