// default package

import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class dac implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoAds b;

    public /* synthetic */ dac(VideoAds videoAds, byte b) {
        this.a = b;
        this.b = videoAds;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VideoAds videoAds = this.b;
        switch (b) {
            case 0:
                videoAds.showPremium();
                break;
            default:
                videoAds.show();
                break;
        }
    }
}
