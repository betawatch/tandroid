package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        String h;
        JSONObject jSONObject;
        switch (this.a) {
            case 0:
                ((WalletEngine2) this.b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.e, (String) this.c);
                break;
            case 1:
                ((WalletEngine2) this.b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.e, (String) this.c);
                break;
            case 2:
                ((WalletEngine2.SendCallbacks) this.b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.c, (String) this.e);
                break;
            case 3:
                k0 k0Var = (k0) this.b;
                h0 h0Var = (h0) this.d;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.e;
                j0 j0Var = (j0) this.c;
                h0Var.close();
                k0.E("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                j0Var.h();
                j0Var.f();
                j0Var.d();
                k0Var.P();
                break;
            case 4:
                k0 k0Var2 = (k0) this.b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                j0 j0Var2 = (j0) this.c;
                k0Var2.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    if (nftitem != null && (c0Var = k0Var2.o) != null) {
                        c0.a(c0Var, wallettransaction2);
                    }
                    j0Var2.h();
                    j0Var2.f();
                    j0Var2.d();
                    k0Var2.P();
                    break;
                }
                break;
            case 5:
                e2 e2Var = (e2) this.b;
                z1 z1Var = (z1) this.d;
                k kVar = (k) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                k0 k0Var3 = e2Var.b;
                String r10 = k0Var3.r();
                byte[] w9 = k0Var3.w();
                byte[] bArr = w9 == null ? null : (byte[]) w9.clone();
                mt mtVar = new mt(27, z1Var, kVar);
                if (r10 != null && bArr != null) {
                    k0Var3.x(new h1(e2Var, mtVar, tonconnectsession, r10, bArr, z1Var, 3), true, false);
                    break;
                } else {
                    mtVar.run("Wallet is not ready");
                    break;
                }
            case 6:
                e2.a((e2) this.b, (TL_wallet.tonConnectSession) this.d, (String) this.c, (k) this.e);
                break;
            case 7:
                byte[] bArr2 = (byte[]) this.b;
                mt mtVar2 = (mt) this.d;
                String str = (String) this.c;
                t1 t1Var = (t1) this.e;
                if (bArr2 != null) {
                    t1Var.run(bArr2);
                    break;
                } else {
                    mtVar2.run(str);
                    break;
                }
            case 8:
                e2 e2Var2 = (e2) this.b;
                h0 h0Var2 = (h0) this.d;
                a2 a2Var = (a2) this.e;
                mt mtVar3 = (mt) this.c;
                try {
                    jSONObject = WalletEngine2.signData(h0Var2, a2Var.a, a2Var.h, a2Var.g, new JSONObject(a2Var.k), e2.l(a2Var.a.manifest.url), e2Var2.f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = e2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new bi.k8(e2Var2, a2Var, h0Var2, mtVar3, jSONObject, h, 16));
                break;
            case 9:
                a5.d0((a5) this.b, (LinearLayout) this.d, (k0) this.e, (l80) this.c);
                break;
            case 10:
                k0 k0Var4 = (k0) this.b;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                m6 m6Var = (m6) this.c;
                f fVar = k0Var4.h;
                if (fVar.f() != null && !zArr[0]) {
                    e1Var.setSubtext(fVar.i());
                    m6Var.run();
                    zArr[0] = true;
                    break;
                }
                break;
            case 11:
                ((WalletEngine2) this.b).lambda$decryptTransactionComment$45((String) this.c, (byte[]) this.d, (Utilities.Callback2) this.e);
                break;
            case 12:
                ((WalletEngine2) this.b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.c, (String) this.e);
                break;
            case 13:
                ((WalletEngine2) this.b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.c, (Utilities.Callback4) this.d);
                break;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.c);
                break;
        }
    }

    public /* synthetic */ m6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ m6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.a = 11;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public /* synthetic */ m6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.a = 13;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = callback4;
    }
}
