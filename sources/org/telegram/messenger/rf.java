package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class rf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ rf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.c = i10;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$saveChannelPts$34(this.c, this.d);
                break;
            case 1:
                this.b.lambda$markMessageAsMention$117(this.c, this.d);
                break;
            case 2:
                this.b.lambda$setDialogPinned$255(this.c, this.d);
                break;
            case 3:
                this.b.lambda$setDialogTtl$63(this.c, this.d);
                break;
            case 4:
                this.b.lambda$deleteDialog$93(this.c, this.d);
                break;
            case 5:
                this.b.lambda$updateChatOnlineCount$139(this.c, this.d);
                break;
            default:
                this.b.lambda$saveChatLinksCount$137(this.c, this.d);
                break;
        }
    }
}
