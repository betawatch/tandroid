package org.telegram.messenger.video;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
