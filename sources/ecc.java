// default package

import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ecc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoAds b;

    public /* synthetic */ ecc(VideoAds videoAds, byte b) {
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
