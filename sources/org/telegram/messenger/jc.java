package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class jc implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ jc(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.b = messagesController;
        this.c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$419(this.c, this.e, this.d);
                break;
            case 1:
                this.b.lambda$checkUnreadPollVotesInternal2$431(this.c, this.d, 0, this.e);
                break;
            default:
                this.b.lambda$deleteMessagesByPush$370(this.e, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ jc(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.b = messagesController;
        this.c = j10;
        this.e = arrayList;
        this.d = j11;
    }

    public /* synthetic */ jc(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.b = messagesController;
        this.e = arrayList;
        this.c = j10;
        this.d = j11;
    }
}
