package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ft;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                d2 d2Var = (d2) this.b;
                y1 y1Var = (y1) this.d;
                j jVar = (j) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                k0 k0Var3 = d2Var.b;
                String r10 = k0Var3.r();
                byte[] w10 = k0Var3.w();
                byte[] bArr = w10 == null ? null : (byte[]) w10.clone();
                ft ftVar = new ft(27, y1Var, jVar);
                if (r10 != null && bArr != null) {
                    k0Var3.x(new g1(d2Var, ftVar, tonconnectsession, r10, bArr, y1Var, 3), true, false);
                    break;
                } else {
                    ftVar.run("Wallet is not ready");
                    break;
                }
            case 6:
                d2.a((d2) this.b, (TL_wallet.tonConnectSession) this.d, (String) this.c, (j) this.e);
                break;
            case 7:
                byte[] bArr2 = (byte[]) this.b;
                ft ftVar2 = (ft) this.d;
                String str = (String) this.c;
                s1 s1Var = (s1) this.e;
                if (bArr2 != null) {
                    s1Var.run(bArr2);
                    break;
                } else {
                    ftVar2.run(str);
                    break;
                }
            case 8:
                d2 d2Var2 = (d2) this.b;
                h0 h0Var2 = (h0) this.d;
                z1 z1Var = (z1) this.e;
                ft ftVar3 = (ft) this.c;
                try {
                    jSONObject = WalletEngine2.signData(h0Var2, z1Var.a, z1Var.h, z1Var.g, new JSONObject(z1Var.k), d2.l(z1Var.a.manifest.url), d2Var2.f.getCurrentTime());
                    h = null;
                } catch (Exception e7) {
                    h = d2.h("sign data", e7);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new ai.a9(d2Var2, z1Var, h0Var2, ftVar3, jSONObject, h, 16));
                break;
            case 9:
                a5.d0((a5) this.b, (LinearLayout) this.d, (k0) this.e, (p80) this.c);
                break;
            case 10:
                k0 k0Var4 = (k0) this.b;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.e;
                m6 m6Var = (m6) this.c;
                f fVar = k0Var4.h;
                if (fVar.f() != null && !zArr[0]) {
                    f1Var.setSubtext(fVar.i());
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
