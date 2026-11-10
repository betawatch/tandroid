package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ at0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.a = i7;
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
                PrivacyControlActivity.Z(this.b);
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
