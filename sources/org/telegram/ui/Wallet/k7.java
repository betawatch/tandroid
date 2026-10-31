package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.n20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k7(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        String i10;
        JSONObject jSONObject;
        int i11;
        int i12 = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$34((n20) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                break;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                break;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                break;
            case 3:
                k0 k0Var = (k0) obj4;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                j0 j0Var = (j0) obj;
                k0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    q20 q20Var = (q20) k0Var.q.remove(wallettransaction);
                    if (q20Var != null) {
                        q20Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (c0Var = k0Var.o) != null) {
                        c0.a(c0Var, wallettransaction);
                    }
                    j0Var.k();
                    j0Var.i();
                    j0Var.g();
                    k0Var.S();
                    break;
                }
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                j0 j0Var2 = (j0) obj;
                ((h0) obj3).close();
                k0.H("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                j0Var2.k();
                j0Var2.i();
                j0Var2.g();
                ((k0) obj4).S();
                break;
            case 5:
                k0 k0Var2 = (k0) obj4;
                boolean[] zArr = (boolean[]) obj3;
                qh.d dVar = (qh.d) obj2;
                d2 d2Var = (d2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = k0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(d2Var, new ih.s(19, zArr, dVar));
                        break;
                    } else {
                        dVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            case 6:
                e2.a((e2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                break;
            case 7:
                byte[] bArr = (byte[]) obj4;
                f11 f11Var = (f11) obj3;
                String str = (String) obj;
                u1 u1Var = (u1) obj2;
                if (bArr != null) {
                    u1Var.a(bArr);
                    break;
                } else {
                    f11Var.a(str);
                    break;
                }
            case 8:
                e2 e2Var = (e2) obj4;
                z1 z1Var = (z1) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                k0 k0Var3 = e2Var.b;
                String t10 = k0Var3.t();
                byte[] y3 = k0Var3.y();
                byte[] bArr2 = y3 != null ? (byte[]) y3.clone() : null;
                f11 f11Var2 = new f11(10, z1Var, kVar);
                if (t10 != null && bArr2 != null) {
                    k0Var3.z(new e1(e2Var, (Object) f11Var2, (TLObject) tonconnectsession, t10, bArr2, (Object) z1Var, 1), true, false);
                    break;
                } else {
                    f11Var2.a("Wallet is not ready");
                    break;
                }
            case 9:
                e2 e2Var2 = (e2) obj4;
                h0 h0Var = (h0) obj3;
                a2 a2Var = (a2) obj2;
                f11 f11Var3 = (f11) obj;
                try {
                    jSONObject = WalletEngine2.signData(h0Var, a2Var.a, a2Var.h, a2Var.g, new JSONObject(a2Var.k), e2.n(a2Var.a.manifest.url), e2Var2.f.getCurrentTime());
                    i10 = null;
                } catch (Exception e) {
                    i10 = e2.i("sign data", e);
                    jSONObject = null;
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.v8(e2Var2, a2Var, h0Var, f11Var3, jSONObject, i10, 9));
                break;
            case 10:
                t2 t2Var = (t2) obj4;
                vh.d dVar2 = (vh.d) obj3;
                int[] iArr = (int[]) obj2;
                vh.d dVar3 = (vh.d) obj;
                boolean a2 = t2Var.a();
                dVar2.setText(cd.L0(iArr[0] == 2 ? 2131743016 : 2131743194, null));
                dVar2.setEnabled((a2 || t2Var.d || ((i11 = iArr[0]) != 1 && i11 != 2)) ? false : true);
                dVar3.setEnabled((a2 || t2Var.d) ? false : true);
                break;
            case 11:
                b6.j0((b6) obj4, (LinearLayout) obj3, (k0) obj2, (z60) obj);
                break;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) obj2;
                k7 k7Var = (k7) obj;
                f fVar = ((k0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    b1Var.setSubtext(fVar.i());
                    k7Var.run();
                    zArr2[0] = true;
                    break;
                }
                break;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$45((String) obj, (byte[]) obj3, (j20) obj2);
                break;
            case 14:
                ((WalletEngine2) obj4).lambda$signMessage$10((j20) obj3, (String) obj, (String) obj2);
                break;
            case 15:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$35((byte[]) obj2, (String) obj, (n20) obj3);
                break;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) obj4, (j20) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ k7(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ k7(WalletEngine2 walletEngine2, String str, byte[] bArr, j20 j20Var) {
        this.a = 13;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = j20Var;
    }

    public /* synthetic */ k7(WalletEngine2 walletEngine2, byte[] bArr, String str, n20 n20Var) {
        this.a = 15;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = n20Var;
    }
}
