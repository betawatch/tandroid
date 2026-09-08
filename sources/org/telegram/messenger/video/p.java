package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, long j3, int i10) {
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
