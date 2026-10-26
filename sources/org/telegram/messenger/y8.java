package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ MessagesStorage.TopicKey c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ y8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
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

    public /* synthetic */ y8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.b = mediaDataController;
        this.d = message;
        this.c = topicKey;
    }
}
