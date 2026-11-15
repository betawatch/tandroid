package kg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ k0(q0 q0Var, int i7) {
        this.a = i7;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.K.manage_stories = !r2.manage_stories;
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                break;
            case 1:
                q0 q0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = q0Var2.K;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                q0Var2.c.g3.O(true);
                q0Var2.d0(true);
                break;
            case 2:
                q0 q0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var3.K;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                q0Var3.c.g3.O(true);
                q0Var3.d0(true);
                break;
            case 3:
                q0 q0Var4 = this.b;
                q0Var4.c.g3.O(true);
                q0Var4.d0(true);
                break;
            default:
                q0 q0Var5 = this.b;
                String obj = q0Var5.f.getText().toString();
                String str = q0Var5.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    q0Var5.y = false;
                    if (!TextUtils.isEmpty(obj)) {
                        jg.z1 z1Var = q0Var5.d;
                        q0Var5.E = obj;
                        int i7 = q0Var5.F;
                        q0Var5.F = i7 + 1;
                        z1Var.h(obj, true, false, true, false, false, 0L, false, 0, i7, 0L, null);
                        break;
                    } else {
                        q0Var5.E = null;
                        q0Var5.d.b();
                        q0Var5.c.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
