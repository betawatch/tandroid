package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ v2(x2 x2Var, int i9) {
        this.a = i9;
        this.b = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                x2 x2Var = this.b;
                c3 c3Var = x2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(c3Var.C).getInputUser(c3Var.D);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(c3Var.C).sendRequest(toggleuseremojistatuspermission, new w2(x2Var, 1));
                break;
            case 1:
                c3 c3Var2 = this.b.d;
                u0.e(c3Var2.getContext(), c3Var2.C, c3Var2.D).m(false, null);
                break;
            default:
                c3 c3Var3 = this.b.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    b5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(c3Var3.D));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    c3Var3.k(true);
                    break;
                }
                break;
        }
    }
}
