package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ ka(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$416(this.c);
                break;
            case 1:
                this.b.lambda$processLoadedDialogs$217(this.c);
                break;
            case 2:
                this.b.lambda$addOrRemoveActiveVoiceChat$60(this.c);
                break;
            case 3:
                this.b.lambda$putChat$57(this.c);
                break;
            case 4:
                this.b.lambda$putChat$58(this.c);
                break;
            default:
                this.b.lambda$putChat$59(this.c);
                break;
        }
    }
}
