package org.telegram.messenger.video;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoAds b;

    public /* synthetic */ d(VideoAds videoAds, int i10) {
        this.a = i10;
        this.b = videoAds;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.showPremium();
                break;
            default:
                this.b.show();
                break;
        }
    }
}
