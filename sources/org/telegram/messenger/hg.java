package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ hg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setDialogUnread$252(this.c, this.d);
                break;
            default:
                this.b.lambda$setDialogViewThreadAsMessages$253(this.c, this.d);
                break;
        }
    }
}
