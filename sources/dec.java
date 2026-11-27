// default package

import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
