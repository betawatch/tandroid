package ii;

import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ t2(v2 v2Var, int i3) {
        this.a = i3;
        this.b = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                v2 v2Var = this.b;
                a3 a3Var = v2Var.d;
                toggleuseremojistatuspermission.bot = hp.s1(a3Var.I).o1(a3Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(a3Var.I).sendRequest(toggleuseremojistatuspermission, new u2(v2Var, 1));
                break;
            case 1:
                a3 a3Var2 = this.b.d;
                s0.e(a3Var2.getContext(), a3Var2.I, a3Var2.J).l(false, null);
                break;
            default:
                a3 a3Var3 = this.b.d;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.q4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.A4(a3Var3.J));
                    org.telegram.messenger.g0.k3(parentLayout, "botPermissionLocation");
                    a3Var3.o(true);
                    break;
                }
                break;
        }
    }
}
