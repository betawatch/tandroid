// default package

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a9c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ a9c(UserInfoActivity userInfoActivity, byte b) {
        this.a = b;
        this.b = userInfoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (b) {
            case 0:
                userInfoActivity.presentFragment(new PrivacyControlActivity(9, true));
                break;
            case 1:
                va vaVar = userInfoActivity.y;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    break;
                }
                break;
            case 2:
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                break;
            default:
                userInfoActivity.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                break;
        }
    }
}
