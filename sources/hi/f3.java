package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ f3(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                h3 h3Var = this.b;
                m3 m3Var = h3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(m3Var.H).getInputUser(m3Var.I);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(m3Var.H).sendRequest(toggleuseremojistatuspermission, new g3(h3Var, 1));
                break;
            case 1:
                m3 m3Var2 = this.b.d;
                b1.e(m3Var2.getContext(), m3Var2.H, m3Var2.I).l(false, null);
                break;
            default:
                m3 m3Var3 = this.b.d;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    j5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.t4(m3Var3.I));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    m3Var3.k(true);
                    break;
                }
                break;
        }
    }
}
