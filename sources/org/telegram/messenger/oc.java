package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class oc implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ oc(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.b = messagesController;
        this.c = j3;
        this.d = j10;
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

    public /* synthetic */ oc(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.b = messagesController;
        this.c = j3;
        this.e = arrayList;
        this.d = j10;
    }

    public /* synthetic */ oc(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.b = messagesController;
        this.e = arrayList;
        this.c = j3;
        this.d = j10;
    }
}
