package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class gb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ gb(MessagesController messagesController, long j10, int i9, long j11, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
        this.e = i9;
        this.d = j11;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i9 = this.e;
                ArrayList arrayList = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$424(this.c, this.d, i9, arrayList);
                break;
            case 1:
                int i10 = this.e;
                ArrayList arrayList2 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$435(this.c, this.d, i10, arrayList2);
                break;
            case 2:
                int i11 = this.e;
                ArrayList arrayList3 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$426(this.c, this.d, i11, arrayList3);
                break;
            case 3:
                int i12 = this.e;
                ArrayList arrayList4 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$433(this.c, this.d, i12, arrayList4);
                break;
            case 4:
                int i13 = this.e;
                ArrayList arrayList5 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$428(this.c, this.d, i13, arrayList5);
                break;
            case 5:
                long j10 = this.d;
                ArrayList arrayList6 = this.f;
                int i14 = this.e;
                this.b.lambda$checkUnreadReactionsInternal2$422(this.c, i14, j10, arrayList6);
                break;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f;
                int i15 = this.e;
                this.b.lambda$checkUnreadPollVotesInternal2$429(this.c, i15, j11, arrayList7);
                break;
        }
    }

    public /* synthetic */ gb(MessagesController messagesController, long j10, long j11, int i9, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
        this.d = j11;
        this.e = i9;
        this.f = arrayList;
    }
}
