package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
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
                l0 l0Var = (l0) obj4;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                k0 k0Var = (k0) obj;
                l0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    c20 c20Var = (c20) l0Var.q.remove(wallettransaction);
                    if (c20Var != null) {
                        c20Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (d0Var = l0Var.o) != null) {
                        d0.a(d0Var, wallettransaction);
                    }
                    k0Var.k();
                    k0Var.i();
                    k0Var.g();
                    l0Var.S();
                    break;
                }
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                k0 k0Var2 = (k0) obj;
                ((i0) obj3).close();
                l0.H("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                k0Var2.k();
                k0Var2.i();
                k0Var2.g();
                ((l0) obj4).S();
                break;
            case 5:
                l0 l0Var2 = (l0) obj4;
                boolean[] zArr = (boolean[]) obj3;
                ai.e eVar = (ai.e) obj2;
                c2 c2Var = (c2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = l0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(c2Var, new bi.p5(25, zArr, eVar));
                        break;
                    } else {
                        eVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            case 6:
                d2.a((d2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                break;
            case 7:
                byte[] bArr = (byte[]) obj4;
                s sVar = (s) obj3;
                String str = (String) obj;
                bi.n3 n3Var = (bi.n3) obj2;
                if (bArr != null) {
                    n3Var.a(bArr);
                    break;
                } else {
                    sVar.a(str);
                    break;
                }
            case 8:
                d2 d2Var = (d2) obj4;
                y1 y1Var = (y1) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                l0 l0Var3 = d2Var.b;
                String t6 = l0Var3.t();
                byte[] y10 = l0Var3.y();
                byte[] bArr2 = y10 != null ? (byte[]) y10.clone() : null;
                s sVar2 = new s(4, y1Var, kVar);
                if (t6 != null && bArr2 != null) {
                    l0Var3.z(new d1(d2Var, (Object) sVar2, (TLObject) tonconnectsession, t6, bArr2, (Object) y1Var, 1), true, false);
                    break;
                } else {
                    sVar2.a("Wallet is not ready");
                    break;
                }
            case 9:
                d2 d2Var2 = (d2) obj4;
                i0 i0Var = (i0) obj3;
                z1 z1Var = (z1) obj2;
                s sVar3 = (s) obj;
                try {
                    jSONObject = WalletEngine2.signData(i0Var, z1Var.a, z1Var.h, z1Var.g, new JSONObject(z1Var.k), d2.n(z1Var.a.manifest.url), d2Var2.f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = d2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.h3(new bi.a3(d2Var2, z1Var, i0Var, sVar3, jSONObject, i7, 19));
                break;
            case 10:
                s2 s2Var = (s2) obj4;
                fi.d dVar = (fi.d) obj3;
                int[] iArr = (int[]) obj2;
                fi.d dVar2 = (fi.d) obj;
                boolean a10 = s2Var.a();
                dVar.setText(id.M0(iArr[0] == 2 ? 2131742990 : 2131743168, null));
                dVar.setEnabled((a10 || s2Var.d || ((i10 = iArr[0]) != 1 && i10 != 2)) ? false : true);
                dVar2.setEnabled((a10 || s2Var.d) ? false : true);
                break;
            case 11:
                z5.k0((z5) obj4, (LinearLayout) obj3, (l0) obj2, (k60) obj);
                break;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                h7 h7Var = (h7) obj;
                f fVar = ((l0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    z0Var.setSubtext(fVar.i());
                    h7Var.run();
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

    public /* synthetic */ h7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ h7(WalletEngine2 walletEngine2, String str, byte[] bArr, v10 v10Var) {
        this.a = 13;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = v10Var;
    }

    public /* synthetic */ h7(WalletEngine2 walletEngine2, byte[] bArr, String str, z10 z10Var) {
        this.a = 15;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = z10Var;
    }
}
