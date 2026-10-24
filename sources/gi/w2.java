package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ w2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                y2 y2Var = this.b;
                d3 d3Var = y2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(d3Var.H).getInputUser(d3Var.I);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(d3Var.H).sendRequest(toggleuseremojistatuspermission, new x2(y2Var, 1));
                break;
            case 1:
                d3 d3Var2 = this.b.d;
                u0.e(d3Var2.getContext(), d3Var2.H, d3Var2.I).l(false, null);
                break;
            default:
                d3 d3Var3 = this.b.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    h5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.o4(d3Var3.I));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    d3Var3.k(true);
                    break;
                }
                break;
        }
    }
}
