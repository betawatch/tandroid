package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.messenger.v10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.io.Serializable] */
    @Override // java.lang.Runnable
    public final void run() {
        l0 l0Var;
        String i7;
        JSONObject jSONObject;
        int i10;
        int i11 = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i11) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$37((v10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                break;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$55((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                break;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                break;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                t0 t0Var = (t0) obj;
                ((r0) obj3).close();
                u0.P("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                t0Var.k();
                t0Var.i();
                t0Var.g();
                ((u0) obj4).a0();
                break;
            case 4:
                u0 u0Var = (u0) obj4;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                t0 t0Var2 = (t0) obj;
                u0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    u0Var.r.remove(wallettransaction2);
                    y10 y10Var = (y10) u0Var.q.remove(wallettransaction2);
                    if (y10Var != null) {
                        y10Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (l0Var = u0Var.o) != null) {
                        l0.a(l0Var, wallettransaction2);
                    }
                    t0Var2.k();
                    t0Var2.i();
                    t0Var2.g();
                    u0Var.a0();
                    break;
                }
                break;
            case 5:
                l2.a((l2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                break;
            case 6:
                byte[] bArr = (byte[]) obj4;
                p51 p51Var = (p51) obj3;
                String str = (String) obj;
                di.x2 x2Var = (di.x2) obj2;
                if (bArr != null) {
                    x2Var.a(bArr);
                    break;
                } else {
                    p51Var.a(str);
                    break;
                }
            case 7:
                l2 l2Var = (l2) obj4;
                g2 g2Var = (g2) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                u0 u0Var2 = l2Var.b;
                String y10 = u0Var2.y();
                byte[] E = u0Var2.E();
                ?? r11 = E != null ? (byte[]) E.clone() : null;
                p51 p51Var2 = new p51(7, g2Var, kVar);
                if (y10 != null && r11 != 0) {
                    u0Var2.F(true, false, false, new di.s1(l2Var, p51Var2, tonconnectsession, y10, r11, g2Var, 2));
                    break;
                } else {
                    p51Var2.a("Wallet is not ready");
                    break;
                }
            case 8:
                l2 l2Var2 = (l2) obj4;
                r0 r0Var = (r0) obj3;
                h2 h2Var = (h2) obj2;
                p51 p51Var3 = (p51) obj;
                try {
                    jSONObject = WalletEngine2.signData(r0Var, h2Var.a, h2Var.h, h2Var.g, new JSONObject(h2Var.k), l2.n(h2Var.a.manifest.url), l2Var2.f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = l2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.g3(new bi.l2(l2Var2, h2Var, r0Var, p51Var3, jSONObject, i7, 24));
                break;
            case 9:
                y2 y2Var = (y2) obj4;
                hi.e eVar = (hi.e) obj3;
                int[] iArr = (int[]) obj2;
                hi.e eVar2 = (hi.e) obj;
                boolean a10 = y2Var.a();
                eVar.setText(hd.N0(iArr[0] == 2 ? 2131742724 : 2131742922, null));
                eVar.setEnabled((a10 || y2Var.d || ((i10 = iArr[0]) != 1 && i10 != 2)) ? false : true);
                eVar2.setEnabled((a10 || y2Var.d) ? false : true);
                break;
            case 10:
                n6.i0((n6) obj4, (LinearLayout) obj3, (u0) obj2, (a70) obj);
                break;
            case 11:
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                v7 v7Var = (v7) obj;
                g gVar = ((u0) obj4).h;
                if (gVar.f() != null && !zArr[0]) {
                    y0Var.setSubtext(gVar.i());
                    v7Var.run();
                    zArr[0] = true;
                    break;
                }
                break;
            case 12:
                ((WalletEngine2) obj4).lambda$signMessage$13((r10) obj3, (String) obj, (String) obj2);
                break;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$48((String) obj, (byte[]) obj3, (r10) obj2);
                break;
            case 14:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$38((byte[]) obj2, (String) obj, (v10) obj3);
                break;
            default:
                WalletEngine2.lambda$emulateSend$18((AtomicBoolean) obj4, (r10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ v7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ v7(WalletEngine2 walletEngine2, String str, byte[] bArr, r10 r10Var) {
        this.a = 13;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = r10Var;
    }

    public /* synthetic */ v7(WalletEngine2 walletEngine2, byte[] bArr, String str, v10 v10Var) {
        this.a = 14;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = v10Var;
    }
}
