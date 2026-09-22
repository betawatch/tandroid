package org.telegram.messenger.voip;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoCapturerDevice b;

    public /* synthetic */ j(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.a = i10;
        this.b = videoCapturerDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onDestroy$8();
                break;
            default:
                this.b.lambda$onDestroy$9();
                break;
        }
    }
}
