package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ MessagesStorage.TopicKey c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ z8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.b = mediaDataController;
        this.c = topicKey;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadBotKeyboard$196(this.d, this.c);
                break;
            default:
                this.b.lambda$putBotKeyboard$201(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ z8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.b = mediaDataController;
        this.d = message;
        this.c = topicKey;
    }
}
