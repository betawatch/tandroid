package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase.2 b;

    public /* synthetic */ p(VideoPlayerHolderBase.2 r12, int i9) {
        this.a = i9;
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
