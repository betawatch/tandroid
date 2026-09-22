package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ MessagesStorage.TopicKey d;

    public /* synthetic */ v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.b = mediaDataController;
        this.d = topicKey;
        this.c = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$putBotKeyboard$200(this.d, this.c);
                break;
            default:
                this.b.lambda$loadBotKeyboard$195(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.b = mediaDataController;
        this.c = message;
        this.d = topicKey;
    }
}
