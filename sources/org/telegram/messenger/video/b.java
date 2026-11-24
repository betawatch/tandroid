package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
