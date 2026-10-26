package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class qf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ qf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
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
                this.b.lambda$markMessageAsMention$116(this.c, this.d);
                break;
            case 2:
                this.b.lambda$setDialogPinned$254(this.c, this.d);
                break;
            case 3:
                this.b.lambda$setDialogTtl$63(this.c, this.d);
                break;
            case 4:
                this.b.lambda$deleteDialog$93(this.c, this.d);
                break;
            case 5:
                this.b.lambda$updateChatOnlineCount$138(this.c, this.d);
                break;
            default:
                this.b.lambda$saveChatLinksCount$136(this.c, this.d);
                break;
        }
    }
}
