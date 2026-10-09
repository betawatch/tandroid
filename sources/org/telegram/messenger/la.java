package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class la implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ la(MessagesController messagesController, long j3, int i10, long j10, ArrayList arrayList, int i11) {
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
                long j3 = this.d;
                ArrayList arrayList = this.f;
                int i10 = this.e;
                this.b.lambda$checkUnreadReactionsInternal2$425(this.c, i10, j3, arrayList);
                break;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$436(this.c, this.d, i11, arrayList2);
                break;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$427(this.c, this.d, i12, arrayList3);
                break;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$438(this.c, this.d, i13, arrayList4);
                break;
            case 4:
                long j10 = this.d;
                ArrayList arrayList5 = this.f;
                int i14 = this.e;
                this.b.lambda$checkUnreadPollVotesInternal2$432(this.c, i14, j10, arrayList5);
                break;
            case 5:
                int i15 = this.e;
                ArrayList arrayList6 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$431(this.c, this.d, i15, arrayList6);
                break;
            default:
                int i16 = this.e;
                ArrayList arrayList7 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$429(this.c, this.d, i16, arrayList7);
                break;
        }
    }

    public /* synthetic */ la(MessagesController messagesController, long j3, long j10, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = j3;
        this.d = j10;
        this.e = i10;
        this.f = arrayList;
    }
}
