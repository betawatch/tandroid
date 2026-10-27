package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class gb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ gb(MessagesController messagesController, long j10, int i10, long j11, ArrayList arrayList, int i11) {
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
                long j10 = this.d;
                ArrayList arrayList = this.f;
                int i10 = this.e;
                this.b.lambda$checkUnreadReactionsInternal2$428(this.c, i10, j10, arrayList);
                break;
            case 1:
                int i11 = this.e;
                ArrayList arrayList2 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$441(this.c, this.d, i11, arrayList2);
                break;
            case 2:
                int i12 = this.e;
                ArrayList arrayList3 = this.f;
                this.b.lambda$checkUnreadPollVotesInternal2$439(this.c, this.d, i12, arrayList3);
                break;
            case 3:
                int i13 = this.e;
                ArrayList arrayList4 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$430(this.c, this.d, i13, arrayList4);
                break;
            case 4:
                int i14 = this.e;
                ArrayList arrayList5 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$432(this.c, this.d, i14, arrayList5);
                break;
            case 5:
                int i15 = this.e;
                ArrayList arrayList6 = this.f;
                this.b.lambda$checkUnreadReactionsInternal2$434(this.c, this.d, i15, arrayList6);
                break;
            default:
                long j11 = this.d;
                ArrayList arrayList7 = this.f;
                int i16 = this.e;
                this.b.lambda$checkUnreadPollVotesInternal2$435(this.c, i16, j11, arrayList7);
                break;
        }
    }

    public /* synthetic */ gb(MessagesController messagesController, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = arrayList;
    }
}
