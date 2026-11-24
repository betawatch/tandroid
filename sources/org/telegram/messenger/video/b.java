package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoPlayerHolderBase.2 b;

    public /* synthetic */ b(VideoPlayerHolderBase.2 r1, byte b) {
        this.a = b;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VideoPlayerHolderBase.2 r1 = this.b;
        switch (b) {
            case 0:
                r1.lambda$onRenderedFirstFrame$2();
                break;
            default:
                r1.lambda$onError$1();
                break;
        }
    }
}
