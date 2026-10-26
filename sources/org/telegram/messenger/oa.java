package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ oa(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = j10;
        this.d = i10;
        this.e = j11;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                ArrayList arrayList = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$438(this.c, this.e, i10, arrayList);
                break;
            case 1:
                long j10 = this.e;
                ArrayList arrayList2 = this.f;
                int i11 = this.d;
                this.b.lambda$checkUnreadReactionsInternal2$427(this.c, i11, j10, arrayList2);
                break;
            case 2:
                int i12 = this.d;
                ArrayList arrayList3 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$431(this.c, this.e, i12, arrayList3);
                break;
            case 3:
                long j11 = this.e;
                ArrayList arrayList4 = this.f;
                int i13 = this.d;
                this.b.lambda$checkUnreadPollVotesInternal2$434(this.c, i13, j11, arrayList4);
                break;
            case 4:
                int i14 = this.d;
                ArrayList arrayList5 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$440(this.c, this.e, i14, arrayList5);
                break;
            case 5:
                int i15 = this.d;
                ArrayList arrayList6 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$433(this.c, this.e, i15, arrayList6);
                break;
            default:
                int i16 = this.d;
                ArrayList arrayList7 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$429(this.c, this.e, i16, arrayList7);
                break;
        }
    }

    public /* synthetic */ oa(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = j10;
        this.e = j11;
        this.d = i10;
        this.f = arrayList;
    }
}
