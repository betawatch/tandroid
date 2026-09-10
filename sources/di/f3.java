package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ f3(i3 i3Var, int i10) {
        this.a = i10;
        this.b = i3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                i3 i3Var = this.b;
                n3 n3Var = i3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(n3Var.G).getInputUser(n3Var.H);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(n3Var.G).sendRequest(toggleuseremojistatuspermission, new g3(i3Var, 1));
                break;
            case 1:
                n3 n3Var2 = this.b.d;
                z0.e(n3Var2.getContext(), n3Var2.G, n3Var2.H).m(false, null);
                break;
            default:
                n3 n3Var3 = this.b.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.f5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(n3Var3.H));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    n3Var3.k(true);
                    break;
                }
                break;
        }
    }
}
