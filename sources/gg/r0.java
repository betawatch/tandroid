package gg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ r0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y0 y0Var = this.b;
                y0Var.J.manage_stories = !r2.manage_stories;
                y0Var.c.Y2.N(true);
                y0Var.Y(true);
                break;
            case 1:
                y0 y0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = y0Var2.J;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                y0Var2.c.Y2.N(true);
                y0Var2.Y(true);
                break;
            case 2:
                y0 y0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = y0Var3.J;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                y0Var3.c.Y2.N(true);
                y0Var3.Y(true);
                break;
            case 3:
                y0 y0Var4 = this.b;
                y0Var4.c.Y2.N(true);
                y0Var4.Y(true);
                break;
            default:
                y0 y0Var5 = this.b;
                String obj = y0Var5.f.getText().toString();
                String str = y0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    y0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        fg.d2 d2Var = y0Var5.d;
                        y0Var5.y = obj;
                        int i10 = y0Var5.E;
                        y0Var5.E = i10 + 1;
                        d2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        y0Var5.y = null;
                        y0Var5.d.b();
                        y0Var5.c.Y2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
