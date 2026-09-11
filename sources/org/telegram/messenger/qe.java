package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    public /* synthetic */ qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
        this.d = j10;
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
