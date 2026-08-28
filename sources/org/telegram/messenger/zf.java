package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ zf(MessagesStorage messagesStorage, int i9, boolean z10, long j10) {
        this.a = i9;
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
