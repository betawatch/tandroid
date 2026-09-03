package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ nb(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = j10;
        this.e = i10;
        this.d = j11;
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
                long j10 = this.d;
                ArrayList arrayList6 = this.f;
                int i15 = this.e;
                this.b.lambda$checkUnreadReactionsInternal2$422(this.c, i15, j10, arrayList6);
                break;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f;
                int i16 = this.e;
                this.b.lambda$checkUnreadPollVotesInternal2$429(this.c, i16, j11, arrayList7);
                break;
        }
    }

    public /* synthetic */ nb(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = arrayList;
    }
}
