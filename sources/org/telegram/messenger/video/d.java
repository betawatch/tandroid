package org.telegram.messenger.video;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoAds b;

    public /* synthetic */ d(VideoAds videoAds, int i7) {
        this.a = i7;
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
