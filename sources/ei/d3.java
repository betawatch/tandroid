package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ d3(g3 g3Var, int i10) {
        this.a = i10;
        this.b = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                g3 g3Var = this.b;
                l3 l3Var = g3Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(l3Var.G).getInputUser(l3Var.H);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(l3Var.G).sendRequest(toggleuseremojistatuspermission, new e3(g3Var, 1));
                break;
            case 1:
                l3 l3Var2 = this.b.d;
                x0.e(l3Var2.getContext(), l3Var2.G, l3Var2.H).m(false, null);
                break;
            default:
                l3 l3Var3 = this.b.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    org.telegram.ui.ActionBar.c5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(l3Var3.H));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    l3Var3.k(true);
                    break;
                }
                break;
        }
    }
}
