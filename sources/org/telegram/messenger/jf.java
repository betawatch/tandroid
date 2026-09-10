package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class jf implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ jf(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
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

    public /* synthetic */ jf(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.b = messagesStorage;
        this.e = j3;
        this.d = i10;
        this.c = z10;
    }

    public /* synthetic */ jf(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = i10;
        this.e = j3;
    }
}
