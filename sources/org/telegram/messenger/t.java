package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t(int i9, int i10, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = 4;
        this.b = messagesStorage;
        this.d = j10;
        this.f = arrayList;
        this.c = i9;
        this.e = i10;
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
                ((MessagesStorage) this.b).lambda$updateTopicData$49(this.c, (TLRPC.TL_forumTopic) this.f, this.d, this.e);
                break;
            default:
                ((MessagesStorage) this.b).lambda$markMessagesContentAsRead$218(this.d, (ArrayList) this.f, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ t(AccountInstance accountInstance, TLObject tLObject, int i9, long j10, int i10, int i11) {
        this.a = i11;
        this.b = accountInstance;
        this.f = tLObject;
        this.c = i9;
        this.d = j10;
        this.e = i10;
    }

    public /* synthetic */ t(MediaDataController mediaDataController, ArrayList arrayList, int i9, int i10, long j10) {
        this.a = 2;
        this.b = mediaDataController;
        this.f = arrayList;
        this.c = i9;
        this.e = i10;
        this.d = j10;
    }

    public /* synthetic */ t(MessagesStorage messagesStorage, int i9, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i10) {
        this.a = 3;
        this.b = messagesStorage;
        this.c = i9;
        this.f = tL_forumTopic;
        this.d = j10;
        this.e = i10;
    }
}
