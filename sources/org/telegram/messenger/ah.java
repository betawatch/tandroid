package org.telegram.messenger;

import java.util.function.Consumer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Consumer d;

    public /* synthetic */ ah(MessagesStorage messagesStorage, long j3, Consumer consumer, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
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
