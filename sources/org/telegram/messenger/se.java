package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ se(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.b = messagesStorage;
        this.d = i10;
        this.c = z10;
        this.e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$markMessagesAsDeleted$234(this.e, this.d, this.c);
                break;
            case 1:
                this.b.lambda$removeFromDownloadQueue$185(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$loadPendingTasks$31(this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ se(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.c = z10;
    }

    public /* synthetic */ se(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = i10;
        this.e = j10;
    }
}
