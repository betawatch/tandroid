package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kx0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ kx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.a = i10;
        this.b = privacyControlActivity;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.z0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
