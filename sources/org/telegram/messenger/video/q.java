package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
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
