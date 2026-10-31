package ag;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ l1(t1 t1Var, int i10) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t1 t1Var = this.b;
                t1Var.J.manage_stories = !r2.manage_stories;
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                break;
            case 1:
                t1 t1Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = t1Var2.J;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                t1Var2.c.f3.O(true);
                t1Var2.c0(true);
                break;
            case 2:
                t1 t1Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = t1Var3.J;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                t1Var3.c.f3.O(true);
                t1Var3.c0(true);
                break;
            case 3:
                t1 t1Var4 = this.b;
                t1Var4.c.f3.O(true);
                t1Var4.c0(true);
                break;
            default:
                t1 t1Var5 = this.b;
                String obj = t1Var5.f.getText().toString();
                String str = t1Var5.D;
                if (str == null || !TextUtils.equals(str, obj)) {
                    t1Var5.y = false;
                    if (!TextUtils.isEmpty(obj)) {
                        zf.m1 m1Var = t1Var5.d;
                        t1Var5.D = obj;
                        int i10 = t1Var5.E;
                        t1Var5.E = i10 + 1;
                        m1Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        t1Var5.D = null;
                        t1Var5.d.b();
                        t1Var5.c.f3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
