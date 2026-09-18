package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ c3(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                f3 f3Var = this.b;
                k3 k3Var = f3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(k3Var.G).getInputUser(k3Var.H);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(k3Var.G).sendRequest(toggleuseremojistatuspermission, new d3(f3Var, 1));
                break;
            case 1:
                k3 k3Var2 = this.b.d;
                w0.e(k3Var2.getContext(), k3Var2.G, k3Var2.H).m(false, null);
                break;
            default:
                k3 k3Var3 = this.b.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.e5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(k3Var3.H));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    k3Var3.k(true);
                    break;
                }
                break;
        }
    }
}
