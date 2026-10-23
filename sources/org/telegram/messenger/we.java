package org.telegram.messenger;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ we(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = j11;
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
