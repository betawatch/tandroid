package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ ne(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i9) {
        this.a = i9;
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

    public /* synthetic */ ne(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i9) {
        this.a = i9;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = j10;
    }
}
