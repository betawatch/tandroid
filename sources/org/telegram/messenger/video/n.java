package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase.2 b;

    public /* synthetic */ n(VideoPlayerHolderBase.2 r12, int i7) {
        this.a = i7;
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
