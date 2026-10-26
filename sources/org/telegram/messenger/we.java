package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ we(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateChannelUsers$128(this.c, this.d);
                break;
            case 1:
                this.b.lambda$deleteSavedDialog$57(this.c, this.d);
                break;
            case 2:
                this.b.lambda$markVoiceMessageContentAsRead$220(this.d, this.c);
                break;
            case 3:
                this.b.lambda$markMessagesAsDeletedInternal$229(this.d, this.c);
                break;
            case 4:
                this.b.lambda$createTaskForSecretChat$120(this.c, this.d);
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

    public /* synthetic */ we(MessagesStorage messagesStorage, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.d = arrayList;
        this.c = j10;
    }
}
