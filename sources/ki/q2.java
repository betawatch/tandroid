package ki;

import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ q2(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                s2 s2Var = this.b;
                x2 x2Var = s2Var.d;
                toggleuseremojistatuspermission.bot = np.s1(x2Var.I).o1(x2Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(x2Var.I).sendRequest(toggleuseremojistatuspermission, new r2(s2Var, 1));
                break;
            case 1:
                x2 x2Var2 = this.b.d;
                s0.e(x2Var2.getContext(), x2Var2.I, x2Var2.J).l(false, null);
                break;
            default:
                x2 x2Var3 = this.b.d;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    o4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.C4(x2Var3.J));
                    org.telegram.messenger.g0.k3(parentLayout, "botPermissionLocation");
                    x2Var3.o(true);
                    break;
                }
                break;
        }
    }
}
