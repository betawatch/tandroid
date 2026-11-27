// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fg2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mg2 b;

    public /* synthetic */ fg2(mg2 mg2Var, byte b) {
        this.a = b;
        this.b = mg2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mg2 mg2Var = this.b;
        switch (b) {
            case 0:
                mg2Var.K.manage_stories = !r1.manage_stories;
                mg2Var.c.g3.O(true);
                mg2Var.Z(true);
                break;
            case 1:
                TL_account.TL_businessBotRights tL_businessBotRights = mg2Var.K;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                mg2Var.c.g3.O(true);
                mg2Var.Z(true);
                break;
            case 2:
                TL_account.TL_businessBotRights tL_businessBotRights2 = mg2Var.K;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                mg2Var.c.g3.O(true);
                mg2Var.Z(true);
                break;
            case 3:
                mg2Var.c.g3.O(true);
                mg2Var.Z(true);
                break;
            default:
                String obj = mg2Var.f.getText().toString();
                String str = mg2Var.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    mg2Var.y = false;
                    if (!TextUtils.isEmpty(obj)) {
                        sv9 sv9Var = mg2Var.d;
                        mg2Var.E = obj;
                        int i = mg2Var.F;
                        mg2Var.F = i + 1;
                        sv9Var.h(obj, true, false, true, false, false, 0L, false, 0, i, 0L, null);
                        break;
                    } else {
                        mg2Var.E = null;
                        mg2Var.d.b();
                        mg2Var.c.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
