// default package

import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class dec implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoAds b;

    public /* synthetic */ dec(VideoAds videoAds, byte b) {
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
