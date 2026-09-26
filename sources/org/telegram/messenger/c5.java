package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader.HttpFileTask b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ c5(ImageLoader.HttpFileTask httpFileTask, long j3, long j10, int i10) {
        this.a = i10;
        this.b = httpFileTask;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$reportProgress$0(this.c, this.d);
                break;
            default:
                this.b.lambda$reportProgress$1(this.c, this.d);
                break;
        }
    }
}
