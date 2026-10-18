package ig;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ n0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                t0Var.J.manage_stories = !r2.manage_stories;
                t0Var.c.W2.N(true);
                t0Var.Y(true);
                break;
            case 1:
                t0 t0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var2.J;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                t0Var2.c.W2.N(true);
                t0Var2.Y(true);
                break;
            case 2:
                t0 t0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var3.J;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                t0Var3.c.W2.N(true);
                t0Var3.Y(true);
                break;
            case 3:
                t0 t0Var4 = this.b;
                t0Var4.c.W2.N(true);
                t0Var4.Y(true);
                break;
            default:
                t0 t0Var5 = this.b;
                String obj = t0Var5.f.getText().toString();
                String str = t0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    t0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        hg.a2 a2Var = t0Var5.d;
                        t0Var5.y = obj;
                        int i10 = t0Var5.E;
                        t0Var5.E = i10 + 1;
                        a2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        t0Var5.y = null;
                        t0Var5.d.b();
                        t0Var5.c.W2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
