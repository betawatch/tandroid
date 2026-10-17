package ig;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ n0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                r0Var.J.manage_stories = !r2.manage_stories;
                r0Var.c.W2.N(true);
                r0Var.Y(true);
                break;
            case 1:
                r0 r0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = r0Var2.J;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                r0Var2.c.W2.N(true);
                r0Var2.Y(true);
                break;
            case 2:
                r0 r0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = r0Var3.J;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                r0Var3.c.W2.N(true);
                r0Var3.Y(true);
                break;
            case 3:
                r0 r0Var4 = this.b;
                r0Var4.c.W2.N(true);
                r0Var4.Y(true);
                break;
            default:
                r0 r0Var5 = this.b;
                String obj = r0Var5.f.getText().toString();
                String str = r0Var5.y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    r0Var5.x = false;
                    if (!TextUtils.isEmpty(obj)) {
                        hg.a2 a2Var = r0Var5.d;
                        r0Var5.y = obj;
                        int i10 = r0Var5.E;
                        r0Var5.E = i10 + 1;
                        a2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        r0Var5.y = null;
                        r0Var5.d.b();
                        r0Var5.c.W2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
