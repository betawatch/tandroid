package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ MessagesStorage.TopicKey d;

    public /* synthetic */ y6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
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

    public /* synthetic */ y6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.b = mediaDataController;
        this.c = message;
        this.d = topicKey;
    }
}
