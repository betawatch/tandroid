package org.telegram.messenger;

import java.util.function.Consumer;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Consumer d;

    public /* synthetic */ qg(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
        this.a = i10;
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
