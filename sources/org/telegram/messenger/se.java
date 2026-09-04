package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ se(MessagesStorage messagesStorage, long j3, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.d = j3;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteUserChatHistory$86(this.c, this.d);
                break;
            case 1:
                this.b.lambda$emptyMessagesMedia$99(this.c, this.d);
                break;
            case 2:
                this.b.lambda$deleteSavedDialog$54(this.d, this.c);
                break;
            case 3:
                this.b.lambda$updateChannelUsers$125(this.d, this.c);
                break;
            case 4:
                this.b.lambda$markVoiceMessageContentAsRead$217(this.c, this.d);
                break;
            case 5:
                this.b.lambda$markMessagesAsDeletedInternal$226(this.c, this.d);
                break;
            case 6:
                this.b.lambda$removeTopics$58(this.c, this.d);
                break;
            default:
                this.b.lambda$createTaskForSecretChat$117(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ se(MessagesStorage messagesStorage, ArrayList arrayList, long j3, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = j3;
    }
}
