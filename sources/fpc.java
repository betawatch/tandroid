// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fpc implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qpc b;

    public /* synthetic */ fpc(qpc qpcVar, byte b) {
        this.a = b;
        this.b = qpcVar;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        qpc qpcVar = this.b;
        switch (b) {
            case 0:
                qpcVar.p0((TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (wallettransaction != null) {
                    qpcVar.f0 = wallettransaction.fee;
                    qpcVar.C0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                qpcVar.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    qpcVar.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        qpcVar.h = walletuseraddress.address;
                    }
                    va vaVar = qpcVar.a;
                    if (vaVar != null) {
                        vaVar.g3.O(true);
                    }
                    qpcVar.B0();
                    qpcVar.r0();
                    xoc xocVar = qpcVar.w;
                    if (xocVar != null) {
                        xocVar.a(qpcVar.h, qpcVar.f);
                        break;
                    }
                } else {
                    qpcVar.finishFragment();
                    break;
                }
                break;
            case 3:
                qpcVar.h0 = (String) obj;
                qpcVar.i0 = ((Boolean) obj2).booleanValue();
                qpcVar.Q.setText(qpcVar.h0);
                qpcVar.Q.setVisibility(TextUtils.isEmpty(qpcVar.h0) ? 8 : 0);
                qpcVar.D0();
                break;
            default:
                qpcVar.h0 = (String) obj;
                qpcVar.i0 = ((Boolean) obj2).booleanValue();
                qpcVar.Q.setText(qpcVar.h0);
                qpcVar.Q.setVisibility(TextUtils.isEmpty(qpcVar.h0) ? 8 : 0);
                qpcVar.D0();
                break;
        }
    }
}
