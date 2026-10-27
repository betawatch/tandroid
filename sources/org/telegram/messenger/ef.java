package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ef implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ef(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteDialog$91(this.c);
                break;
            case 1:
                this.b.lambda$replaceMessageIfExists$237(this.c);
                break;
            case 2:
                this.b.lambda$markVoiceMessageContentAsRead$220(this.c);
                break;
            case 3:
                this.b.lambda$deleteFromDownloadQueue$187(this.c);
                break;
            case 4:
                this.b.lambda$deleteContacts$151(this.c);
                break;
            case 5:
                this.b.lambda$updateMessageVerifyFlags$199(this.c);
                break;
            case 6:
                this.b.lambda$loadUserInfo$132(this.c);
                break;
            case 7:
                this.b.lambda$markMessagesAsDeletedByRandoms$224(this.c);
                break;
            case 8:
                this.b.lambda$emptyMessagesMedia$99(this.c);
                break;
            case 9:
                this.b.lambda$emptyMessagesMedia$100(this.c);
                break;
            case 10:
                this.b.lambda$putMessagesInternal$202(this.c);
                break;
            case 11:
                this.b.lambda$putMessagesInternal$201(this.c);
                break;
            case 12:
                this.b.lambda$markMessagesAsDeletedByRandoms$225(this.c);
                break;
            case 13:
                this.b.lambda$markMessagesAsDeletedInternal$228(this.c);
                break;
            case 14:
                this.b.lambda$markMessagesAsDeletedInternal$231(this.c);
                break;
            case 15:
                this.b.lambda$onReactionsUpdate$109(this.c);
                break;
            case 16:
                this.b.lambda$putMessages$240(this.c);
                break;
            case 17:
                this.b.lambda$putMessages$241(this.c);
                break;
            case 18:
                this.b.lambda$putWebPages$191(this.c);
                break;
            case 19:
                this.b.lambda$saveDialogFiltersOrder$78(this.c);
                break;
            default:
                this.b.lambda$markMessagesAsDeletedInternal$234(this.c);
                break;
        }
    }
}
