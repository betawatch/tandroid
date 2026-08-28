package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ ve(MessagesStorage messagesStorage, int i9, boolean z10, long j10) {
        this.b = messagesStorage;
        this.d = i9;
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

    public /* synthetic */ ve(MessagesStorage messagesStorage, long j10, int i9, boolean z10) {
        this.b = messagesStorage;
        this.e = j10;
        this.d = i9;
        this.c = z10;
    }

    public /* synthetic */ ve(MessagesStorage messagesStorage, boolean z10, int i9, long j10) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = i9;
        this.e = j10;
    }
}
