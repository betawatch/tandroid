package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PremiumPreviewFragment b;

    public /* synthetic */ ks0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
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
                premiumPreviewFragment.a.postOnAnimation(new ks0(premiumPreviewFragment, 0));
                break;
            default:
                this.b.getMediaDataController().U0(false);
                break;
        }
    }
}
