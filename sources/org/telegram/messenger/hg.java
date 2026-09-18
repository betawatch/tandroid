package org.telegram.messenger;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setDialogUnread$248(this.c, this.d);
                break;
            default:
                this.b.lambda$setDialogViewThreadAsMessages$249(this.c, this.d);
                break;
        }
    }
}
