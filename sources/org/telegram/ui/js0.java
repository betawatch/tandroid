package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
