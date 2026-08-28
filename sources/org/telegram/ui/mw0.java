package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ mw0(PrivacyControlActivity privacyControlActivity, int i9) {
        this.a = i9;
        this.b = privacyControlActivity;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.y0();
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
