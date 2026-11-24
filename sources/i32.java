// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i32 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r32 b;

    public /* synthetic */ i32(r32 r32Var, byte b) {
        this.a = b;
        this.b = r32Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        r32 r32Var = this.b;
        switch (b) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                TLRPC.User user = r32Var.r;
                if (!r32Var.L) {
                    r32Var.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        r32Var.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        r32Var.H = walletuseraddress.address;
                        r32Var.I = walletuseraddress.public_key;
                    }
                    r32Var.w.a(r32Var.H, user);
                    r32Var.i0();
                    r32Var.Y();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (!r32Var.L && wallettransaction != null) {
                    r32Var.h0 = wallettransaction.fee;
                    r32Var.j0();
                    break;
                }
                break;
        }
    }
}
