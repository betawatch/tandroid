package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
