// default package

import org.telegram.messenger.voip.VideoCapturerDevice;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hac implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoCapturerDevice b;

    public /* synthetic */ hac(VideoCapturerDevice videoCapturerDevice, byte b) {
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
