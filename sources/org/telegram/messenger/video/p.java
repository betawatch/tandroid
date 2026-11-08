package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((VideoPlayerHolderBase.2) this.c).lambda$onError$0(this.b);
                break;
            default:
                ((VideoPlayerHolderBase) this.c).lambda$seekTo$11(this.b);
                break;
        }
    }
}
