package org.telegram.messenger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ af(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.b = messagesStorage;
        this.d = i10;
        this.c = z10;
        this.e = j3;
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

    public /* synthetic */ af(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.b = messagesStorage;
        this.e = j3;
        this.d = i10;
        this.c = z10;
    }

    public /* synthetic */ af(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = i10;
        this.e = j3;
    }
}
