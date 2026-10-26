package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class zf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ zf(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.a = 2;
        this.b = messagesStorage;
        this.c = j10;
        this.e = i10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                long j11 = this.d;
                this.b.lambda$updateMessageTopicId$217(this.e, j10, j11);
                break;
            case 1:
                long j12 = this.d;
                int i10 = this.e;
                this.b.lambda$markMessagePollVotesAsRead$266(this.c, j12, i10);
                break;
            case 2:
                int i11 = this.e;
                long j13 = this.d;
                this.b.lambda$loadPendingTasks$13(this.c, i11, j13);
                break;
            case 3:
                long j14 = this.d;
                int i12 = this.e;
                this.b.lambda$loadPendingTasks$32(this.c, j14, i12);
                break;
            case 4:
                long j15 = this.d;
                int i13 = this.e;
                this.b.lambda$markMessageReactionsAsRead$265(this.c, j15, i13);
                break;
            case 5:
                long j16 = this.c;
                long j17 = this.d;
                this.b.lambda$markMentionMessageAsRead$115(this.e, j16, j17);
                break;
            case 6:
                long j18 = this.d;
                int i14 = this.e;
                this.b.lambda$resetMentionsCount$117(this.c, j18, i14);
                break;
            default:
                long j19 = this.c;
                long j20 = this.d;
                this.b.lambda$deleteAllReactionsFromChat$87(this.e, j19, j20);
                break;
        }
    }

    public /* synthetic */ zf(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.e = i10;
        this.c = j10;
        this.d = j11;
    }

    public /* synthetic */ zf(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.c = j10;
        this.d = j11;
        this.e = i10;
    }
}
