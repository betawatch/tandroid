package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ pe(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$markMessagesAsDeletedInternal$230(this.c);
                break;
            case 1:
                this.b.lambda$markVoiceMessageContentAsRead$216(this.c);
                break;
            case 2:
                this.b.lambda$emptyMessagesMedia$96(this.c);
                break;
            case 3:
                this.b.lambda$emptyMessagesMedia$97(this.c);
                break;
            case 4:
                this.b.lambda$loadUserInfo$128(this.c);
                break;
            case 5:
                this.b.lambda$replaceMessageIfExists$233(this.c);
                break;
            case 6:
                this.b.lambda$markMessagesAsDeletedByRandoms$220(this.c);
                break;
            case 7:
                this.b.lambda$deleteFromDownloadQueue$183(this.c);
                break;
            case 8:
                this.b.lambda$deleteContacts$147(this.c);
                break;
            case 9:
                this.b.lambda$updateMessageVerifyFlags$195(this.c);
                break;
            case 10:
                this.b.lambda$putMessagesInternal$198(this.c);
                break;
            case 11:
                this.b.lambda$putMessagesInternal$197(this.c);
                break;
            case 12:
                this.b.lambda$markMessagesAsDeletedByRandoms$221(this.c);
                break;
            case 13:
                this.b.lambda$markMessagesAsDeletedInternal$224(this.c);
                break;
            case 14:
                this.b.lambda$markMessagesAsDeletedInternal$227(this.c);
                break;
            case 15:
                this.b.lambda$onReactionsUpdate$105(this.c);
                break;
            case 16:
                this.b.lambda$deleteDialog$88(this.c);
                break;
            case 17:
                this.b.lambda$saveDialogFiltersOrder$75(this.c);
                break;
            case 18:
                this.b.lambda$putMessages$236(this.c);
                break;
            case 19:
                this.b.lambda$putMessages$237(this.c);
                break;
            default:
                this.b.lambda$putWebPages$187(this.c);
                break;
        }
    }
}
