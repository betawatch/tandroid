package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ we(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.a = 4;
        this.b = messagesStorage;
        this.d = j3;
        this.c = i10;
        this.e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.d;
                long j10 = this.e;
                this.b.lambda$deleteAllReactionsFromChat$84(this.c, j3, j10);
                break;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.b.lambda$updateMessageTopicId$214(this.c, j11, j12);
                break;
            case 2:
                long j13 = this.e;
                int i10 = this.c;
                this.b.lambda$markMessagePollVotesAsRead$263(this.d, j13, i10);
                break;
            case 3:
                long j14 = this.e;
                int i11 = this.c;
                this.b.lambda$markMessageReactionsAsRead$262(this.d, j14, i11);
                break;
            case 4:
                int i12 = this.c;
                long j15 = this.e;
                this.b.lambda$loadPendingTasks$13(this.d, i12, j15);
                break;
            case 5:
                long j16 = this.e;
                int i13 = this.c;
                this.b.lambda$loadPendingTasks$32(this.d, j16, i13);
                break;
            case 6:
                long j17 = this.d;
                long j18 = this.e;
                this.b.lambda$markMentionMessageAsRead$112(this.c, j17, j18);
                break;
            default:
                long j19 = this.e;
                int i14 = this.c;
                this.b.lambda$resetMentionsCount$114(this.d, j19, i14);
                break;
        }
    }

    public /* synthetic */ we(MessagesStorage messagesStorage, int i10, long j3, long j10, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.c = i10;
        this.d = j3;
        this.e = j10;
    }

    public /* synthetic */ we(MessagesStorage messagesStorage, long j3, long j10, int i10, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.c = i10;
    }
}
