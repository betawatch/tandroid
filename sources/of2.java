// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class of2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uf2 b;

    public /* synthetic */ of2(uf2 uf2Var, byte b) {
        this.a = b;
        this.b = uf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uf2 uf2Var = this.b;
        switch (b) {
            case 0:
                uf2Var.K.manage_stories = !r1.manage_stories;
                uf2Var.c.g3.O(true);
                uf2Var.Z(true);
                break;
            case 1:
                TL_account.TL_businessBotRights tL_businessBotRights = uf2Var.K;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                uf2Var.c.g3.O(true);
                uf2Var.Z(true);
                break;
            case 2:
                TL_account.TL_businessBotRights tL_businessBotRights2 = uf2Var.K;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                uf2Var.c.g3.O(true);
                uf2Var.Z(true);
                break;
            case 3:
                uf2Var.c.g3.O(true);
                uf2Var.Z(true);
                break;
            default:
                String obj = uf2Var.f.getText().toString();
                String str = uf2Var.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    uf2Var.y = false;
                    if (!TextUtils.isEmpty(obj)) {
                        zr9 zr9Var = uf2Var.d;
                        uf2Var.E = obj;
                        int i = uf2Var.F;
                        uf2Var.F = i + 1;
                        zr9Var.h(obj, true, false, true, false, false, 0L, false, 0, i, 0L, null);
                        break;
                    } else {
                        uf2Var.E = null;
                        uf2Var.d.b();
                        uf2Var.c.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
