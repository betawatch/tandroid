package hg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ o0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                v0Var.J.manage_stories = !r2.manage_stories;
                v0Var.c.Y2.N(true);
                v0Var.Y(true);
                break;
            case 1:
                v0 v0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = v0Var2.J;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                v0Var2.c.Y2.N(true);
                v0Var2.Y(true);
                break;
            case 2:
                v0 v0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = v0Var3.J;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                v0Var3.c.Y2.N(true);
                v0Var3.Y(true);
                break;
            case 3:
                v0 v0Var4 = this.b;
                v0Var4.c.Y2.N(true);
                v0Var4.Y(true);
                break;
            default:
                v0 v0Var5 = this.b;
                String obj = v0Var5.f.getText().toString();
                String str = v0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    v0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        gg.c2 c2Var = v0Var5.d;
                        v0Var5.y = obj;
                        int i10 = v0Var5.E;
                        v0Var5.E = i10 + 1;
                        c2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        v0Var5.y = null;
                        v0Var5.d.b();
                        v0Var5.c.Y2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
