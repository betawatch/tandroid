package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ mc(int i9, long j10, long j11, MessagesController messagesController) {
        this.a = 2;
        this.b = messagesController;
        this.d = j10;
        this.e = j11;
        this.c = i9;
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
                int i9 = this.c;
                this.b.lambda$checkDeletingTask$84(this.d, j14, i9);
                break;
        }
    }

    public /* synthetic */ mc(MessagesController messagesController, int i9, long j10, long j11, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = i9;
        this.d = j10;
        this.e = j11;
    }
}
