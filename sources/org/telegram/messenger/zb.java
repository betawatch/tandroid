package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;

    public /* synthetic */ zb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
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

    public /* synthetic */ zb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.b = messagesController;
        this.c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public /* synthetic */ zb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.b = messagesController;
        this.d = arrayList;
        this.c = j10;
        this.e = j11;
    }
}
