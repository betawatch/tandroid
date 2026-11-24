// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class hrc implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rrc b;

    public /* synthetic */ hrc(rrc rrcVar, byte b) {
        this.a = b;
        this.b = rrcVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        rrc rrcVar = this.b;
        switch (b) {
            case 0:
                rrcVar.q0((TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (wallettransaction != null) {
                    rrcVar.f0 = wallettransaction.fee;
                    rrcVar.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                rrcVar.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    rrcVar.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        rrcVar.h = walletuseraddress.address;
                    }
                    va vaVar = rrcVar.a;
                    if (vaVar != null) {
                        vaVar.g3.O(true);
                    }
                    rrcVar.C0();
                    rrcVar.s0();
                    zqc zqcVar = rrcVar.w;
                    if (zqcVar != null) {
                        zqcVar.a(rrcVar.h, rrcVar.f);
                        break;
                    }
                } else {
                    rrcVar.finishFragment();
                    break;
                }
                break;
            case 3:
                rrcVar.h0 = (String) obj;
                rrcVar.i0 = ((Boolean) obj2).booleanValue();
                rrcVar.Q.setText(rrcVar.h0);
                rrcVar.Q.setVisibility(TextUtils.isEmpty(rrcVar.h0) ? 8 : 0);
                rrcVar.E0();
                break;
            default:
                rrcVar.h0 = (String) obj;
                rrcVar.i0 = ((Boolean) obj2).booleanValue();
                rrcVar.Q.setText(rrcVar.h0);
                rrcVar.Q.setVisibility(TextUtils.isEmpty(rrcVar.h0) ? 8 : 0);
                rrcVar.E0();
                break;
        }
    }
}
