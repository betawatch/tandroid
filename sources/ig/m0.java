package ig;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ m0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                s0Var.L.manage_stories = !r2.manage_stories;
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                break;
            case 1:
                s0 s0Var2 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights = s0Var2.L;
                tL_businessBotRights.transfer_stars = true;
                tL_businessBotRights.transfer_and_upgrade_gifts = true;
                tL_businessBotRights.change_gift_settings = true;
                tL_businessBotRights.sell_gifts = true;
                tL_businessBotRights.view_gifts = true;
                s0Var2.e.Z2.N(true);
                s0Var2.Y(true);
                break;
            case 2:
                s0 s0Var3 = this.b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var3.L;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                s0Var3.e.Z2.N(true);
                s0Var3.Y(true);
                break;
            case 3:
                s0 s0Var4 = this.b;
                s0Var4.e.Z2.N(true);
                s0Var4.Y(true);
                break;
            default:
                s0 s0Var5 = this.b;
                String obj = s0Var5.n.getText().toString();
                String str = s0Var5.F;
                if (str == null || !TextUtils.equals(str, obj)) {
                    s0Var5.E = false;
                    if (!TextUtils.isEmpty(obj)) {
                        hg.a2 a2Var = s0Var5.f;
                        s0Var5.F = obj;
                        int i10 = s0Var5.G;
                        s0Var5.G = i10 + 1;
                        a2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                        break;
                    } else {
                        s0Var5.F = null;
                        s0Var5.f.b();
                        s0Var5.e.Z2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
