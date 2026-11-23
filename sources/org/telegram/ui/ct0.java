package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct0 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ ct0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.a = i7;
        this.b = privacyControlActivity;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
