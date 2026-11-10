package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class et0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ et0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.a = i7;
        this.b = privacyControlActivity;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.K0();
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
