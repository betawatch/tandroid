package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class lb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ lb(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = j3;
        this.e = i10;
        this.d = j10;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.e;
                ArrayList arrayList = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$424(this.c, this.d, i10, arrayList);
                break;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$435(this.c, this.d, i11, arrayList2);
                break;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$426(this.c, this.d, i12, arrayList3);
                break;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$433(this.c, this.d, i13, arrayList4);
                break;
            case 4:
                int i14 = this.e;
                ArrayList arrayList5 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$428(this.c, this.d, i14, arrayList5);
                break;
            case 5:
                long j3 = this.d;
                ArrayList arrayList6 = this.f;
                int i15 = this.e;
                this.b.lambda$checkUnreadReactionsInternal2$422(this.c, i15, j3, arrayList6);
                break;
            default:
                long j10 = this.d;
                ArrayList arrayList7 = this.f;
                int i16 = this.e;
                this.b.lambda$checkUnreadPollVotesInternal2$429(this.c, i16, j10, arrayList7);
                break;
        }
    }

    public /* synthetic */ lb(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = j3;
        this.d = j10;
        this.e = i10;
        this.f = arrayList;
    }
}
