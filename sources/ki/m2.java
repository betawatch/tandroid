package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    public /* synthetic */ m2(o2 o2Var, int i7) {
        this.a = i7;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                o2 o2Var = this.b;
                t2 t2Var = o2Var.d;
                toggleuseremojistatuspermission.bot = mp.u1(t2Var.I).q1(t2Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(t2Var.I).sendRequest(toggleuseremojistatuspermission, new n2(o2Var, 1));
                break;
            case 1:
                t2 t2Var2 = this.b.d;
                s0.e(t2Var2.getContext(), t2Var2.I, t2Var2.J).l(false, null);
                break;
            default:
                t2 t2Var3 = this.b.d;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    s4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.D4(t2Var3.J));
                    org.telegram.messenger.g0.j3(parentLayout, "botPermissionLocation");
                    t2Var3.o(true);
                    break;
                }
                break;
        }
    }
}
