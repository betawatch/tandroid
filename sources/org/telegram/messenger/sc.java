package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class sc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ sc(int i10, long j10, long j11, MessagesController messagesController) {
        this.a = 2;
        this.b = messagesController;
        this.d = j10;
        this.e = j11;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.b.lambda$sendTyping$173(this.c, j10, j11);
                break;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.b.lambda$sendTyping$171(this.c, j12, j13);
                break;
            default:
                long j14 = this.e;
                int i10 = this.c;
                this.b.lambda$checkDeletingTask$84(this.d, j14, i10);
                break;
        }
    }

    public /* synthetic */ sc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
        this.d = j10;
        this.e = j11;
    }
}
