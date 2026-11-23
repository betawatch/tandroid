package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
        m0 m0Var;
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
                ((WalletEngine2) obj4).lambda$prepareRotateKey$37((t10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                break;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$55((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                break;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                break;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                u0 u0Var = (u0) obj;
                ((s0) obj3).close();
                v0.P("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                u0Var.k();
                u0Var.i();
                u0Var.g();
                ((v0) obj4).a0();
                break;
            case 4:
                v0 v0Var = (v0) obj4;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                u0 u0Var2 = (u0) obj;
                v0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    v0Var.r.remove(wallettransaction2);
                    w10 w10Var = (w10) v0Var.q.remove(wallettransaction2);
                    if (w10Var != null) {
                        w10Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (m0Var = v0Var.o) != null) {
                        m0.a(m0Var, wallettransaction2);
                    }
                    u0Var2.k();
                    u0Var2.i();
                    u0Var2.g();
                    v0Var.a0();
                    break;
                }
                break;
            case 5:
                m2.a((m2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                break;
            case 6:
                byte[] bArr = (byte[]) obj4;
                a31 a31Var = (a31) obj3;
                String str = (String) obj;
                di.x2 x2Var = (di.x2) obj2;
                if (bArr != null) {
                    x2Var.a(bArr);
                    break;
                } else {
                    a31Var.a(str);
                    break;
                }
            case 7:
                m2 m2Var = (m2) obj4;
                h2 h2Var = (h2) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                v0 v0Var2 = m2Var.b;
                String y10 = v0Var2.y();
                byte[] E = v0Var2.E();
                ?? r11 = E != null ? (byte[]) E.clone() : null;
                a31 a31Var2 = new a31(8, h2Var, kVar);
                if (y10 != null && r11 != 0) {
                    v0Var2.F(true, false, false, new di.s1(m2Var, a31Var2, tonconnectsession, y10, r11, h2Var, 2));
                    break;
                } else {
                    a31Var2.a("Wallet is not ready");
                    break;
                }
            case 8:
                m2 m2Var2 = (m2) obj4;
                s0 s0Var = (s0) obj3;
                i2 i2Var = (i2) obj2;
                a31 a31Var3 = (a31) obj;
                try {
                    jSONObject = WalletEngine2.signData(s0Var, i2Var.a, i2Var.h, i2Var.g, new JSONObject(i2Var.k), m2.n(i2Var.a.manifest.url), m2Var2.f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = m2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.g3(new bi.n2(m2Var2, i2Var, s0Var, a31Var3, jSONObject, i7, 24));
                break;
            case 9:
                z2 z2Var = (z2) obj4;
                hi.e eVar = (hi.e) obj3;
                int[] iArr = (int[]) obj2;
                hi.e eVar2 = (hi.e) obj;
                boolean a10 = z2Var.a();
                eVar.setText(gd.N0(iArr[0] == 2 ? 2131742719 : 2131742917, null));
                eVar.setEnabled((a10 || z2Var.d || ((i10 = iArr[0]) != 1 && i10 != 2)) ? false : true);
                eVar2.setEnabled((a10 || z2Var.d) ? false : true);
                break;
            case 10:
                o6.i0((o6) obj4, (LinearLayout) obj3, (v0) obj2, (x60) obj);
                break;
            case 11:
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                w7 w7Var = (w7) obj;
                g gVar = ((v0) obj4).h;
                if (gVar.f() != null && !zArr[0]) {
                    y0Var.setSubtext(gVar.i());
                    w7Var.run();
                    zArr[0] = true;
                    break;
                }
                break;
            case 12:
                ((WalletEngine2) obj4).lambda$signMessage$13((p10) obj3, (String) obj, (String) obj2);
                break;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$48((String) obj, (byte[]) obj3, (p10) obj2);
                break;
            case 14:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$38((byte[]) obj2, (String) obj, (t10) obj3);
                break;
            default:
                WalletEngine2.lambda$emulateSend$18((AtomicBoolean) obj4, (p10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ w7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ w7(WalletEngine2 walletEngine2, String str, byte[] bArr, p10 p10Var) {
        this.a = 13;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = p10Var;
    }

    public /* synthetic */ w7(WalletEngine2 walletEngine2, byte[] bArr, String str, t10 t10Var) {
        this.a = 14;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = t10Var;
    }
}
