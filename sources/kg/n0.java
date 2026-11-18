package kg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ n0(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                t0Var.K.manage_stories = !r2.manage_stories;
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                break;
            case 1:
                t0 t0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var2.K;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                t0Var2.c.g3.O(true);
                t0Var2.d0(true);
                break;
            case 2:
                t0 t0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var3.K;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                t0Var3.c.g3.O(true);
                t0Var3.d0(true);
                break;
            case 3:
                t0 t0Var4 = this.b;
                t0Var4.c.g3.O(true);
                t0Var4.d0(true);
                break;
            default:
                t0 t0Var5 = this.b;
                String obj = t0Var5.f.getText().toString();
                String str = t0Var5.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    t0Var5.y = false;
                    if (!TextUtils.isEmpty(obj)) {
                        jg.z1 z1Var = t0Var5.d;
                        t0Var5.E = obj;
                        int i7 = t0Var5.F;
                        t0Var5.F = i7 + 1;
                        z1Var.h(obj, true, false, true, false, false, 0L, false, 0, i7, 0L, null);
                        break;
                    } else {
                        t0Var5.E = null;
                        t0Var5.d.b();
                        t0Var5.c.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
