package org.telegram.messenger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ dg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
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
