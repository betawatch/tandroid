package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ l2(n2 n2Var, int i7) {
        this.a = i7;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                n2 n2Var = this.b;
                s2 s2Var = n2Var.d;
                toggleuseremojistatuspermission.bot = mp.u1(s2Var.I).q1(s2Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(s2Var.I).sendRequest(toggleuseremojistatuspermission, new m2(n2Var, 1));
                break;
            case 1:
                s2 s2Var2 = this.b.d;
                r0.e(s2Var2.getContext(), s2Var2.I, s2Var2.J).l(false, null);
                break;
            default:
                s2 s2Var3 = this.b.d;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    r4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(s2Var3.J));
                    org.telegram.messenger.g0.j3(parentLayout, "botPermissionLocation");
                    s2Var3.o(true);
                    break;
                }
                break;
        }
    }
}
