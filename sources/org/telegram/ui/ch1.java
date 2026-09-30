package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
