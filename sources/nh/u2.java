package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ u2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                w2 w2Var = this.b;
                b3 b3Var = w2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(b3Var.C).getInputUser(b3Var.D);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(b3Var.C).sendRequest(toggleuseremojistatuspermission, new v2(w2Var, 1));
                break;
            case 1:
                b3 b3Var2 = this.b.d;
                t0.e(b3Var2.getContext(), b3Var2.C, b3Var2.D).m(false, null);
                break;
            default:
                b3 b3Var3 = this.b.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    b5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(b3Var3.D));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    b3Var3.k(true);
                    break;
                }
                break;
        }
    }
}
