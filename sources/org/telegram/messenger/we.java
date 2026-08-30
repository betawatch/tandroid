package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ we(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.d = j10;
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

    public /* synthetic */ we(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = j10;
    }
}
