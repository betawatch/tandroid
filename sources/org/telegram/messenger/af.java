package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ af(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$saveChatInviter$135(this.c, this.d);
                break;
            case 1:
                this.b.lambda$setDialogFlags$37(this.c, this.d);
                break;
            case 2:
                this.b.lambda$removeTopic$60(this.c, this.d);
                break;
            case 3:
                this.b.lambda$deleteUserChatHistory$90(this.c, this.d);
                break;
            default:
                this.b.lambda$clearUserPhoto$96(this.c, this.d);
                break;
        }
    }
}
