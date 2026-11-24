// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ah2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hh2 b;

    public /* synthetic */ ah2(hh2 hh2Var, byte b) {
        this.a = b;
        this.b = hh2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hh2 hh2Var = this.b;
        switch (b) {
            case 0:
                hh2Var.K.manage_stories = !r1.manage_stories;
                hh2Var.c.g3.O(true);
                hh2Var.a0(true);
                break;
            case 1:
                TL_account.TL_businessBotRights tL_businessBotRights = hh2Var.K;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                hh2Var.c.g3.O(true);
                hh2Var.a0(true);
                break;
            case 2:
                TL_account.TL_businessBotRights tL_businessBotRights2 = hh2Var.K;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                hh2Var.c.g3.O(true);
                hh2Var.a0(true);
                break;
            case 3:
                hh2Var.c.g3.O(true);
                hh2Var.a0(true);
                break;
            default:
                String obj = hh2Var.f.getText().toString();
                String str = hh2Var.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    hh2Var.y = false;
                    if (!TextUtils.isEmpty(obj)) {
                        bu9 bu9Var = hh2Var.d;
                        hh2Var.E = obj;
                        int i = hh2Var.F;
                        hh2Var.F = i + 1;
                        bu9Var.h(obj, true, false, true, false, false, 0L, false, 0, i, 0L, null);
                        break;
                    } else {
                        hh2Var.E = null;
                        hh2Var.d.b();
                        hh2Var.c.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
