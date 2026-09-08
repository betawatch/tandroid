package ig;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ m0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                u0Var.J.manage_stories = !r2.manage_stories;
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                break;
            case 1:
                u0 u0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = u0Var2.J;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                u0Var2.c.Y2.N(true);
                u0Var2.Y(true);
                break;
            case 2:
                u0 u0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var3.J;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                u0Var3.c.Y2.N(true);
                u0Var3.Y(true);
                break;
            case 3:
                u0 u0Var4 = this.b;
                u0Var4.c.Y2.N(true);
                u0Var4.Y(true);
                break;
            default:
                u0 u0Var5 = this.b;
                String obj = u0Var5.f.getText().toString();
                String str = u0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    u0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        hg.b2 b2Var = u0Var5.d;
                        u0Var5.y = obj;
                        int i10 = u0Var5.E;
                        u0Var5.E = i10 + 1;
                        b2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        u0Var5.y = null;
                        u0Var5.d.b();
                        u0Var5.c.Y2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
