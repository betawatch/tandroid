package org.telegram.messenger;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ ye(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
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

    public /* synthetic */ ye(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.c = z10;
    }

    public /* synthetic */ ye(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = i10;
        this.e = j10;
    }
}
