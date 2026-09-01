package org.telegram.messenger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ze(int i10, long j10, long j11, MessagesStorage messagesStorage) {
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
