package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ MessagesStorage.TopicKey d;

    public /* synthetic */ b7(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
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

    public /* synthetic */ b7(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.b = mediaDataController;
        this.c = message;
        this.d = topicKey;
    }
}
