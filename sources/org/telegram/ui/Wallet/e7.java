package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.r10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e7(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        String i3;
        JSONObject jSONObject;
        int i10;
        int i11 = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i11) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$34((r10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
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
                    u10 u10Var = (u10) k0Var.q.remove(wallettransaction);
                    if (u10Var != null) {
                        u10Var.a(Boolean.FALSE);
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
                ai.c cVar = (ai.c) obj2;
                b2 b2Var = (b2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = k0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(b2Var, new ai.q4(26, zArr, cVar));
                        break;
                    } else {
                        cVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            case 6:
                c2.a((c2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                break;
            case 7:
                byte[] bArr = (byte[]) obj4;
                e51 e51Var = (e51) obj3;
                String str = (String) obj;
                ci.a3 a3Var = (ci.a3) obj2;
                if (bArr != null) {
                    a3Var.a(bArr);
                    break;
                } else {
                    e51Var.a(str);
                    break;
                }
            case 8:
                c2 c2Var = (c2) obj4;
                x1 x1Var = (x1) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                k0 k0Var3 = c2Var.b;
                String t10 = k0Var3.t();
                byte[] y9 = k0Var3.y();
                byte[] bArr2 = y9 != null ? (byte[]) y9.clone() : null;
                e51 e51Var2 = new e51(7, x1Var, kVar);
                if (t10 != null && bArr2 != null) {
                    k0Var3.z(new c1(c2Var, (Object) e51Var2, (TLObject) tonconnectsession, t10, bArr2, (Object) x1Var, 1), true, false);
                    break;
                } else {
                    e51Var2.a("Wallet is not ready");
                    break;
                }
            case 9:
                c2 c2Var2 = (c2) obj4;
                h0 h0Var = (h0) obj3;
                y1 y1Var = (y1) obj2;
                e51 e51Var3 = (e51) obj;
                try {
                    jSONObject = WalletEngine2.signData(h0Var, y1Var.a, y1Var.h, y1Var.g, new JSONObject(y1Var.k), c2.n(y1Var.a.manifest.url), c2Var2.f.getCurrentTime());
                    i3 = null;
                } catch (Exception e10) {
                    i3 = c2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.h3(new ai.w1(c2Var2, y1Var, h0Var, e51Var3, jSONObject, i3, 20));
                break;
            case 10:
                s2 s2Var = (s2) obj4;
                gi.d dVar = (gi.d) obj3;
                int[] iArr = (int[]) obj2;
                gi.d dVar2 = (gi.d) obj;
                boolean a10 = s2Var.a();
                dVar.setText(bd.M0(iArr[0] == 2 ? 2131743000 : 2131743178, null));
                dVar.setEnabled((a10 || s2Var.d || ((i10 = iArr[0]) != 1 && i10 != 2)) ? false : true);
                dVar2.setEnabled((a10 || s2Var.d) ? false : true);
                break;
            case 11:
                w5.k0((w5) obj4, (LinearLayout) obj3, (k0) obj2, (f60) obj);
                break;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                e7 e7Var = (e7) obj;
                f fVar = ((k0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    y0Var.setSubtext(fVar.i());
                    e7Var.run();
                    zArr2[0] = true;
                    break;
                }
                break;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$45((String) obj, (byte[]) obj3, (n10) obj2);
                break;
            case 14:
                ((WalletEngine2) obj4).lambda$signMessage$10((n10) obj3, (String) obj, (String) obj2);
                break;
            case 15:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$35((byte[]) obj2, (String) obj, (r10) obj3);
                break;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) obj4, (n10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ e7(Object obj, Object obj2, String str, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ e7(WalletEngine2 walletEngine2, String str, byte[] bArr, n10 n10Var) {
        this.a = 13;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = n10Var;
    }

    public /* synthetic */ e7(WalletEngine2 walletEngine2, byte[] bArr, String str, r10 r10Var) {
        this.a = 15;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = r10Var;
    }
}
