package org.telegram.messenger.voip;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ VideoCapturerDevice b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ h(VideoCapturerDevice videoCapturerDevice, int i10, long j10) {
        this.b = videoCapturerDevice;
        this.d = i10;
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

    public /* synthetic */ h(VideoCapturerDevice videoCapturerDevice, long j10, int i10) {
        this.b = videoCapturerDevice;
        this.c = j10;
        this.d = i10;
    }
}
