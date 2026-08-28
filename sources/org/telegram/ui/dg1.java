package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ dg1(UserInfoActivity userInfoActivity, int i9) {
        this.a = i9;
        this.b = userInfoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new PrivacyControlActivity(9, true));
                break;
            case 1:
                org.telegram.ui.Components.c51 c51Var = this.b.x;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    break;
                }
                break;
            case 2:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                break;
            default:
                UserInfoActivity userInfoActivity2 = this.b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                break;
        }
    }
}
