package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, long j3, int i10) {
        this.a = i10;
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
