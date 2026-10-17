package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class ub implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;

    public /* synthetic */ ub(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.b = messagesController;
        this.c = j10;
        this.e = j11;
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

    public /* synthetic */ ub(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.b = messagesController;
        this.c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public /* synthetic */ ub(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.b = messagesController;
        this.d = arrayList;
        this.c = j10;
        this.e = j11;
    }
}
