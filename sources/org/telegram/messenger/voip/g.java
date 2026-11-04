package org.telegram.messenger.voip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ VideoCapturerDevice b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ g(VideoCapturerDevice videoCapturerDevice, int i3, long j10) {
        this.b = videoCapturerDevice;
        this.d = i3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onStateChanged$6(this.d, this.c);
                break;
            default:
                this.b.lambda$onStateChanged$7(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ g(VideoCapturerDevice videoCapturerDevice, long j10, int i3) {
        this.b = videoCapturerDevice;
        this.c = j10;
        this.d = i3;
    }
}
