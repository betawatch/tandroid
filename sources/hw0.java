// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hw0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jw0 b;

    public /* synthetic */ hw0(jw0 jw0Var, byte b) {
        this.a = b;
        this.b = jw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jw0 jw0Var = this.b;
        switch (b) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                ow0 ow0Var = jw0Var.d;
                toggleuseremojistatuspermission.bot = na7.q1(ow0Var.I).m1(ow0Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(ow0Var.I).sendRequest(toggleuseremojistatuspermission, new iw0(jw0Var, (byte) 1));
                break;
            case 1:
                ow0 ow0Var2 = jw0Var.d;
                tq0.d(ow0Var2.getContext(), ow0Var2.I, ow0Var2.J).k(false, null);
                break;
            default:
                ow0 ow0Var3 = jw0Var.d;
                d S = LaunchActivity.S();
                if (S != null && S.getParentLayout() != null) {
                    ui5 parentLayout = S.getParentLayout();
                    S.presentFragment(ProfileActivity.P2(ow0Var3.J));
                    gl.g3(parentLayout, "botPermissionLocation");
                    ow0Var3.m(true);
                    break;
                }
                break;
        }
    }
}
