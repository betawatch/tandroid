package org.telegram.messenger;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ bf(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.b = messagesStorage;
        this.d = i10;
        this.c = z10;
        this.e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.c);
                break;
            case 1:
                this.b.lambda$removeFromDownloadQueue$182(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$loadPendingTasks$31(this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ bf(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.c = z10;
    }

    public /* synthetic */ bf(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = i10;
        this.e = j10;
    }
}
