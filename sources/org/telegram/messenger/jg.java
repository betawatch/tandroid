package org.telegram.messenger;

import java.util.function.Consumer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Consumer d;

    public /* synthetic */ jg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i9) {
        this.a = i9;
        this.b = messagesStorage;
        this.c = j10;
        this.d = consumer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadStoryAlbumsCache$270(this.c, this.d);
                break;
            default:
                this.b.lambda$loadTopics$51(this.c, this.d);
                break;
        }
    }
}
