package org.telegram.messenger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class ef implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ ef(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.b = messagesStorage;
        this.d = i10;
        this.c = z4;
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

    public /* synthetic */ ef(MessagesStorage messagesStorage, long j10, int i10, boolean z4) {
        this.b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.c = z4;
    }

    public /* synthetic */ ef(MessagesStorage messagesStorage, boolean z4, int i10, long j10) {
        this.b = messagesStorage;
        this.c = z4;
        this.d = i10;
        this.e = j10;
    }
}
