package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
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

    public /* synthetic */ ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.b = messagesStorage;
        this.e = j3;
        this.d = i10;
        this.c = z10;
    }

    public /* synthetic */ ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = i10;
        this.e = j3;
    }
}
