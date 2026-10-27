package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ye(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateChannelUsers$129(this.c, this.d);
                break;
            case 1:
                this.b.lambda$deleteSavedDialog$57(this.c, this.d);
                break;
            case 2:
                this.b.lambda$createTaskForSecretChat$121(this.c, this.d);
                break;
            case 3:
                this.b.lambda$markVoiceMessageContentAsRead$221(this.d, this.c);
                break;
            case 4:
                this.b.lambda$markMessagesAsDeletedInternal$230(this.d, this.c);
                break;
            case 5:
                this.b.lambda$deleteUserChatHistory$89(this.d, this.c);
                break;
            case 6:
                this.b.lambda$removeTopics$61(this.d, this.c);
                break;
            default:
                this.b.lambda$emptyMessagesMedia$102(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ ye(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.d = arrayList;
        this.c = j10;
    }
}
