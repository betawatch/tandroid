package org.telegram.messenger;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class x9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ x9(int i10, long j3, long j10, MessagesController messagesController) {
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
                this.b.lambda$sendTyping$170(this.c, j3, j10);
                break;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.b.lambda$sendTyping$172(this.c, j11, j12);
                break;
            default:
                long j13 = this.e;
                int i10 = this.c;
                this.b.lambda$checkDeletingTask$83(this.d, j13, i10);
                break;
        }
    }

    public /* synthetic */ x9(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
        this.d = j3;
        this.e = j10;
    }
}
