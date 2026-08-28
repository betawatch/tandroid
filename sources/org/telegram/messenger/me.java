package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    public /* synthetic */ me(MessagesStorage messagesStorage, long j10, long j11, String str, int i9) {
        this.a = i9;
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
