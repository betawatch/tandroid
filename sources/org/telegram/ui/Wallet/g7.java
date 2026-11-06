package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var;
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
                ((WalletEngine2) obj4).lambda$prepareRotateKey$34((z10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                break;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                break;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                break;
            case 3:
                n0 n0Var = (n0) obj4;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                m0 m0Var = (m0) obj;
                n0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    c20 c20Var = (c20) n0Var.q.remove(wallettransaction);
                    if (c20Var != null) {
                        c20Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (f0Var = n0Var.o) != null) {
                        f0.a(f0Var, wallettransaction);
                    }
                    m0Var.k();
                    m0Var.i();
                    m0Var.g();
                    n0Var.S();
                    break;
                }
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                m0 m0Var2 = (m0) obj;
                ((k0) obj3).close();
                n0.H("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                m0Var2.k();
                m0Var2.i();
                m0Var2.g();
                ((n0) obj4).S();
                break;
            case 5:
                n0 n0Var2 = (n0) obj4;
                boolean[] zArr = (boolean[]) obj3;
                ai.e eVar = (ai.e) obj2;
                e2 e2Var = (e2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = n0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(e2Var, new bi.p5(25, zArr, eVar));
                        break;
                    } else {
                        eVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            case 6:
                f2.a((f2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                break;
            case 7:
                byte[] bArr = (byte[]) obj4;
                t tVar = (t) obj3;
                String str = (String) obj;
                bi.n3 n3Var = (bi.n3) obj2;
                if (bArr != null) {
                    n3Var.a(bArr);
                    break;
                } else {
                    tVar.a(str);
                    break;
                }
            case 8:
                f2 f2Var = (f2) obj4;
                a2 a2Var = (a2) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                n0 n0Var3 = f2Var.b;
                String t6 = n0Var3.t();
                byte[] y10 = n0Var3.y();
                byte[] bArr2 = y10 != null ? (byte[]) y10.clone() : null;
                t tVar2 = new t(4, a2Var, kVar);
                if (t6 != null && bArr2 != null) {
                    n0Var3.z(new f1(f2Var, (Object) tVar2, (TLObject) tonconnectsession, t6, bArr2, (Object) a2Var, 1), true, false);
                    break;
                } else {
                    tVar2.a("Wallet is not ready");
                    break;
                }
            case 9:
                f2 f2Var2 = (f2) obj4;
                k0 k0Var = (k0) obj3;
                b2 b2Var = (b2) obj2;
                t tVar3 = (t) obj;
                try {
                    jSONObject = WalletEngine2.signData(k0Var, b2Var.a, b2Var.h, b2Var.g, new JSONObject(b2Var.k), f2.n(b2Var.a.manifest.url), f2Var2.f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = f2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.h3(new bi.a3(f2Var2, b2Var, k0Var, tVar3, jSONObject, i7, 19));
                break;
            case 10:
                u2 u2Var = (u2) obj4;
                fi.d dVar = (fi.d) obj3;
                int[] iArr = (int[]) obj2;
                fi.d dVar2 = (fi.d) obj;
                boolean a10 = u2Var.a();
                dVar.setText(hd.M0(iArr[0] == 2 ? 2131742991 : 2131743169, null));
                dVar.setEnabled((a10 || u2Var.d || ((i10 = iArr[0]) != 1 && i10 != 2)) ? false : true);
                dVar2.setEnabled((a10 || u2Var.d) ? false : true);
                break;
            case 11:
                y5.k0((y5) obj4, (LinearLayout) obj3, (n0) obj2, (k60) obj);
                break;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                g7 g7Var = (g7) obj;
                f fVar = ((n0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    z0Var.setSubtext(fVar.i());
                    g7Var.run();
                    zArr2[0] = true;
                    break;
                }
                break;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$45((String) obj, (byte[]) obj3, (v10) obj2);
                break;
            case 14:
                ((WalletEngine2) obj4).lambda$signMessage$10((v10) obj3, (String) obj, (String) obj2);
                break;
            case 15:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$35((byte[]) obj2, (String) obj, (z10) obj3);
                break;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) obj4, (v10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ g7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ g7(WalletEngine2 walletEngine2, String str, byte[] bArr, v10 v10Var) {
        this.a = 13;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = v10Var;
    }

    public /* synthetic */ g7(WalletEngine2 walletEngine2, byte[] bArr, String str, z10 z10Var) {
        this.a = 15;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = z10Var;
    }
}
