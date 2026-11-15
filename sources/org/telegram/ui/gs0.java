package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PremiumPreviewFragment b;

    public /* synthetic */ gs0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
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
                premiumPreviewFragment.a.postOnAnimation(new gs0(premiumPreviewFragment, 0));
                break;
            default:
                this.b.getMediaDataController().R0(false);
                break;
        }
    }
}
