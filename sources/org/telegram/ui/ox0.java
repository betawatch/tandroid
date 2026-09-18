package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ ox0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.a = i10;
        this.b = privacyControlActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            case 1:
                PrivacyControlActivity.U(this.b);
                break;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
        }
    }
}
