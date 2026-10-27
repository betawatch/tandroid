package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class pc implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ pc(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.b = messagesController;
        this.c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$425(this.c, this.e, this.d);
                break;
            case 1:
                this.b.lambda$checkUnreadPollVotesInternal2$437(this.c, this.d, 0, this.e);
                break;
            default:
                this.b.lambda$deleteMessagesByPush$371(this.e, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ pc(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.b = messagesController;
        this.c = j10;
        this.e = arrayList;
        this.d = j11;
    }

    public /* synthetic */ pc(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.b = messagesController;
        this.e = arrayList;
        this.c = j10;
        this.d = j11;
    }
}
