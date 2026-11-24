// default package

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class icc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ VideoCapturerDevice b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ icc(VideoCapturerDevice videoCapturerDevice, int i, long j) {
        this.b = videoCapturerDevice;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        VideoCapturerDevice videoCapturerDevice = this.b;
        switch (b) {
            case 0:
                videoCapturerDevice.lambda$onStateChanged$6(i, j);
                break;
            default:
                videoCapturerDevice.lambda$onStateChanged$7(j, i);
                break;
        }
    }

    public /* synthetic */ icc(VideoCapturerDevice videoCapturerDevice, long j, int i) {
        this.b = videoCapturerDevice;
        this.c = j;
        this.d = i;
    }
}
