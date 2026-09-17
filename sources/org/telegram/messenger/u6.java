package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ MessagesStorage.TopicKey d;

    public /* synthetic */ u6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
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

    public /* synthetic */ u6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.b = mediaDataController;
        this.c = message;
        this.d = topicKey;
    }
}
