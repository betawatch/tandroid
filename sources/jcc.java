// default package

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class jcc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoCapturerDevice b;

    public /* synthetic */ jcc(VideoCapturerDevice videoCapturerDevice, byte b) {
        this.a = b;
        this.b = videoCapturerDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VideoCapturerDevice videoCapturerDevice = this.b;
        switch (b) {
            case 0:
                videoCapturerDevice.lambda$onDestroy$8();
                break;
            default:
                videoCapturerDevice.lambda$onDestroy$9();
                break;
        }
    }
}
