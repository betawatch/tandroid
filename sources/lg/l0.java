package lg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ l0(r0 r0Var, int i3) {
        this.a = i3;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                r0Var.K.manage_stories = !r2.manage_stories;
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                break;
            case 1:
                r0 r0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = r0Var2.K;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                r0Var2.c.g3.O(true);
                r0Var2.d0(true);
                break;
            case 2:
                r0 r0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = r0Var3.K;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                r0Var3.c.g3.O(true);
                r0Var3.d0(true);
                break;
            case 3:
                r0 r0Var4 = this.b;
                r0Var4.c.g3.O(true);
                r0Var4.d0(true);
                break;
            default:
                r0 r0Var5 = this.b;
                String obj = r0Var5.f.getText().toString();
                String str = r0Var5.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    r0Var5.y = false;
                    if (!TextUtils.isEmpty(obj)) {
                        kg.v1 v1Var = r0Var5.d;
                        r0Var5.E = obj;
                        int i3 = r0Var5.F;
                        r0Var5.F = i3 + 1;
                        v1Var.h(obj, true, false, true, false, false, 0L, false, 0, i3, 0L, null);
                        break;
                    } else {
                        r0Var5.E = null;
                        r0Var5.d.b();
                        r0Var5.c.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
