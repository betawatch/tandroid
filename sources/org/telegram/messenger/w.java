package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w(int i10, int i11, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = 4;
        this.b = messagesStorage;
        this.d = j10;
        this.f = arrayList;
        this.c = i10;
        this.e = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$0((AccountInstance) this.b, (TLRPC.User) this.f, this.c, this.d, this.e);
                break;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$2((AccountInstance) this.b, (TLRPC.Chat) this.f, this.c, this.d, this.e);
                break;
            case 2:
                ((MediaDataController) this.b).lambda$putStickersToCache$102((ArrayList) this.f, this.c, this.e, this.d);
                break;
            case 3:
                ((MessagesStorage) this.b).lambda$updateTopicData$52(this.c, (TLRPC.TL_forumTopic) this.f, this.d, this.e);
                break;
            default:
                ((MessagesStorage) this.b).lambda$markMessagesContentAsRead$222(this.d, (ArrayList) this.f, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ w(AccountInstance accountInstance, TLObject tLObject, int i10, long j10, int i11, int i12) {
        this.a = i12;
        this.b = accountInstance;
        this.f = tLObject;
        this.c = i10;
        this.d = j10;
        this.e = i11;
    }

    public /* synthetic */ w(MediaDataController mediaDataController, ArrayList arrayList, int i10, int i11, long j10) {
        this.a = 2;
        this.b = mediaDataController;
        this.f = arrayList;
        this.c = i10;
        this.e = i11;
        this.d = j10;
    }

    public /* synthetic */ w(MessagesStorage messagesStorage, int i10, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11) {
        this.a = 3;
        this.b = messagesStorage;
        this.c = i10;
        this.f = tL_forumTopic;
        this.d = j10;
        this.e = i11;
    }
}
