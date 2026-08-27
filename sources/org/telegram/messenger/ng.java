package org.telegram.messenger;

import java.util.function.Consumer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Consumer d;

    public /* synthetic */ ng(MessagesStorage messagesStorage, long j10, Consumer consumer, int i10) {
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
