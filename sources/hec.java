// default package

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class hec implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoCapturerDevice b;

    public /* synthetic */ hec(VideoCapturerDevice videoCapturerDevice, byte b) {
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
