package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class za implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$addOrRemoveActiveVoiceChat$61(this.c);
                break;
            case 1:
                this.b.lambda$processLoadedDialogs$218(this.c);
                break;
            case 2:
                this.b.lambda$processUpdateArray$413(this.c);
                break;
            case 3:
                this.b.lambda$putChat$58(this.c);
                break;
            case 4:
                this.b.lambda$putChat$59(this.c);
                break;
            default:
                this.b.lambda$putChat$60(this.c);
                break;
        }
    }
}
