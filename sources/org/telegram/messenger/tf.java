package org.telegram.messenger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class tf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ tf(MessagesStorage messagesStorage, int i10, long j10, int i11) {
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
                this.b.lambda$markMessageAsMention$113(this.c, this.d);
                break;
            case 2:
                this.b.lambda$setDialogPinned$251(this.c, this.d);
                break;
            case 3:
                this.b.lambda$setDialogTtl$60(this.c, this.d);
                break;
            case 4:
                this.b.lambda$deleteDialog$90(this.c, this.d);
                break;
            case 5:
                this.b.lambda$updateChatOnlineCount$135(this.c, this.d);
                break;
            default:
                this.b.lambda$saveChatLinksCount$133(this.c, this.d);
                break;
        }
    }
}
