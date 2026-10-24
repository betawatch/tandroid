package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class na implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ na(MessagesController messagesController, TLRPC.Chat chat, int i10) {
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
