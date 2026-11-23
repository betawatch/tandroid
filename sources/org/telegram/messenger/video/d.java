package org.telegram.messenger.video;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
