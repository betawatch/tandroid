package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ ch1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new PrivacyControlActivity(9, true));
                break;
            case 1:
                org.telegram.ui.Components.n61 n61Var = this.b.x;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
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
