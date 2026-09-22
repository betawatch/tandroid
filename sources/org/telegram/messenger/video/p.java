package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase.2 b;

    public /* synthetic */ p(VideoPlayerHolderBase.2 r12, int i10) {
        this.a = i10;
        this.b = r12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onRenderedFirstFrame$2();
                break;
            default:
                this.b.lambda$onError$1();
                break;
        }
    }
}
