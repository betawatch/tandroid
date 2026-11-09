package hi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ t2(v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                v2 v2Var = this.b;
                a3 a3Var = v2Var.d;
                toggleuseremojistatuspermission.bot = qp.s1(a3Var.H).o1(a3Var.I);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(a3Var.H).sendRequest(toggleuseremojistatuspermission, new u2(v2Var, 1));
                break;
            case 1:
                a3 a3Var2 = this.b.d;
                r0.e(a3Var2.getContext(), a3Var2.H, a3Var2.I).l(false, null);
                break;
            default:
                a3 a3Var3 = this.b.d;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.q4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(a3Var3.I));
                    org.telegram.messenger.g0.k3(parentLayout, "botPermissionLocation");
                    a3Var3.o(true);
                    break;
                }
                break;
        }
    }
}
