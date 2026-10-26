package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ve(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$markVoiceMessageContentAsRead$219(this.c);
                break;
            case 1:
                this.b.lambda$deleteDialog$91(this.c);
                break;
            case 2:
                this.b.lambda$loadUserInfo$131(this.c);
                break;
            case 3:
                this.b.lambda$deleteFromDownloadQueue$186(this.c);
                break;
            case 4:
                this.b.lambda$deleteContacts$150(this.c);
                break;
            case 5:
                this.b.lambda$updateMessageVerifyFlags$198(this.c);
                break;
            case 6:
                this.b.lambda$replaceMessageIfExists$236(this.c);
                break;
            case 7:
                this.b.lambda$putWebPages$190(this.c);
                break;
            case 8:
                this.b.lambda$emptyMessagesMedia$99(this.c);
                break;
            case 9:
                this.b.lambda$emptyMessagesMedia$100(this.c);
                break;
            case 10:
                this.b.lambda$putMessagesInternal$201(this.c);
                break;
            case 11:
                this.b.lambda$putMessagesInternal$200(this.c);
                break;
            case 12:
                this.b.lambda$markMessagesAsDeletedByRandoms$224(this.c);
                break;
            case 13:
                this.b.lambda$markMessagesAsDeletedInternal$227(this.c);
                break;
            case 14:
                this.b.lambda$markMessagesAsDeletedInternal$230(this.c);
                break;
            case 15:
                this.b.lambda$markMessagesAsDeletedByRandoms$223(this.c);
                break;
            case 16:
                this.b.lambda$onReactionsUpdate$108(this.c);
                break;
            case 17:
                this.b.lambda$saveDialogFiltersOrder$78(this.c);
                break;
            case 18:
                this.b.lambda$putMessages$239(this.c);
                break;
            case 19:
                this.b.lambda$putMessages$240(this.c);
                break;
            default:
                this.b.lambda$markMessagesAsDeletedInternal$233(this.c);
                break;
        }
    }
}
