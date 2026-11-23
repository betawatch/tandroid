package kg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ m0(s0 s0Var, int i7) {
        this.a = i7;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                s0Var.K.manage_stories = !r2.manage_stories;
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                break;
            case 1:
                s0 s0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = s0Var2.K;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                s0Var2.c.g3.O(true);
                s0Var2.d0(true);
                break;
            case 2:
                s0 s0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var3.K;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                s0Var3.c.g3.O(true);
                s0Var3.d0(true);
                break;
            case 3:
                s0 s0Var4 = this.b;
                s0Var4.c.g3.O(true);
                s0Var4.d0(true);
                break;
            default:
                s0 s0Var5 = this.b;
                String obj = s0Var5.f.getText().toString();
                String str = s0Var5.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    s0Var5.y = false;
                    if (!TextUtils.isEmpty(obj)) {
                        jg.z1 z1Var = s0Var5.d;
                        s0Var5.E = obj;
                        int i7 = s0Var5.F;
                        s0Var5.F = i7 + 1;
                        z1Var.h(obj, true, false, true, false, false, 0L, false, 0, i7, 0L, null);
                        break;
                    } else {
                        s0Var5.E = null;
                        s0Var5.d.b();
                        s0Var5.c.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
