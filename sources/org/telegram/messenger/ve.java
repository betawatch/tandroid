package org.telegram.messenger;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ve(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$clearUserPhoto$93(this.c, this.d);
                break;
            case 1:
                this.b.lambda$saveChatInviter$132(this.c, this.d);
                break;
            case 2:
                this.b.lambda$setDialogFlags$37(this.c, this.d);
                break;
            case 3:
                this.b.lambda$removeTopic$57(this.c, this.d);
                break;
            default:
                this.b.lambda$deleteUserChatHistory$87(this.c, this.d);
                break;
        }
    }
}
