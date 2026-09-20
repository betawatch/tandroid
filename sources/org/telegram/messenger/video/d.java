package org.telegram.messenger.video;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
