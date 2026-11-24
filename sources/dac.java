// default package

import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
