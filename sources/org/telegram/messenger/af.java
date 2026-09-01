package org.telegram.messenger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ af(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.a = 4;
        this.b = messagesStorage;
        this.d = j10;
        this.c = i10;
        this.e = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.b.lambda$deleteAllReactionsFromChat$84(this.c, j10, j11);
                break;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.b.lambda$updateMessageTopicId$214(this.c, j12, j13);
                break;
            case 2:
                long j14 = this.e;
                int i10 = this.c;
                this.b.lambda$markMessagePollVotesAsRead$263(this.d, j14, i10);
                break;
            case 3:
                long j15 = this.e;
                int i11 = this.c;
                this.b.lambda$markMessageReactionsAsRead$262(this.d, j15, i11);
                break;
            case 4:
                int i12 = this.c;
                long j16 = this.e;
                this.b.lambda$loadPendingTasks$13(this.d, i12, j16);
                break;
            case 5:
                long j17 = this.e;
                int i13 = this.c;
                this.b.lambda$loadPendingTasks$32(this.d, j17, i13);
                break;
            case 6:
                long j18 = this.d;
                long j19 = this.e;
                this.b.lambda$markMentionMessageAsRead$112(this.c, j18, j19);
                break;
            default:
                long j20 = this.e;
                int i14 = this.c;
                this.b.lambda$resetMentionsCount$114(this.d, j20, i14);
                break;
        }
    }

    public /* synthetic */ af(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.c = i10;
        this.d = j10;
        this.e = j11;
    }

    public /* synthetic */ af(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.c = i10;
    }
}
