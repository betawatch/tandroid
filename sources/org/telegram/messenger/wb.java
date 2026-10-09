package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;

    public /* synthetic */ wb(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.b = messagesController;
        this.c = j3;
        this.e = j10;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkUnreadPollVotesInternal2$434(this.c, this.e, 0, this.d);
                break;
            case 1:
                this.b.lambda$processUpdateArray$422(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$deleteMessagesByPush$369(this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ wb(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.b = messagesController;
        this.c = j3;
        this.d = arrayList;
        this.e = j10;
    }

    public /* synthetic */ wb(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.b = messagesController;
        this.d = arrayList;
        this.c = j3;
        this.e = j10;
    }
}
