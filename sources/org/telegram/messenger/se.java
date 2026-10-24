package org.telegram.messenger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    public /* synthetic */ se(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateRanksInLastMessages$45(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$updateRanksInLastMessages$46(this.c, this.d, this.e);
                break;
        }
    }
}
