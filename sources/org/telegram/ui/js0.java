package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class js0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PremiumPreviewFragment b;

    public /* synthetic */ js0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.a = i7;
        this.b = premiumPreviewFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o0();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.b;
                premiumPreviewFragment.a.postOnAnimation(new js0(premiumPreviewFragment, 0));
                break;
            default:
                this.b.getMediaDataController().R0(false);
                break;
        }
    }
}
