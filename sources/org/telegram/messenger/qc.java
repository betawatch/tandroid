package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class qc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ qc(int i10, long j3, long j10, MessagesController messagesController) {
        this.a = 2;
        this.b = messagesController;
        this.d = j3;
        this.e = j10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.d;
                long j10 = this.e;
                this.b.lambda$sendTyping$173(this.c, j3, j10);
                break;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.b.lambda$sendTyping$171(this.c, j11, j12);
                break;
            default:
                long j13 = this.e;
                int i10 = this.c;
                this.b.lambda$checkDeletingTask$84(this.d, j13, i10);
                break;
        }
    }

    public /* synthetic */ qc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
        this.d = j3;
        this.e = j10;
    }
}
