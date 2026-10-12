package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var;
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
                j0 j0Var = (j0) this.b;
                g0 g0Var = (g0) this.d;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.e;
                i0 i0Var = (i0) this.c;
                g0Var.close();
                j0.E("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                i0Var.h();
                i0Var.f();
                i0Var.d();
                j0Var.P();
                break;
            case 4:
                j0 j0Var2 = (j0) this.b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                i0 i0Var2 = (i0) this.c;
                j0Var2.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    if (nftitem != null && (b0Var = j0Var2.o) != null) {
                        b0.a(b0Var, wallettransaction2);
                    }
                    i0Var2.h();
                    i0Var2.f();
                    i0Var2.d();
                    j0Var2.P();
                    break;
                }
                break;
            case 5:
                d2 d2Var = (d2) this.b;
                y1 y1Var = (y1) this.d;
                j jVar = (j) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                j0 j0Var3 = d2Var.b;
                String r10 = j0Var3.r();
                byte[] w9 = j0Var3.w();
                byte[] bArr = w9 == null ? null : (byte[]) w9.clone();
                mt mtVar = new mt(27, y1Var, jVar);
                if (r10 != null && bArr != null) {
                    j0Var3.x(new g1(d2Var, mtVar, tonconnectsession, r10, bArr, y1Var, 3), true, false);
                    break;
                } else {
                    mtVar.run("Wallet is not ready");
                    break;
                }
            case 6:
                d2.a((d2) this.b, (TL_wallet.tonConnectSession) this.d, (String) this.c, (j) this.e);
                break;
            case 7:
                byte[] bArr2 = (byte[]) this.b;
                mt mtVar2 = (mt) this.d;
                String str = (String) this.c;
                s1 s1Var = (s1) this.e;
                if (bArr2 != null) {
                    s1Var.run(bArr2);
                    break;
                } else {
                    mtVar2.run(str);
                    break;
                }
            case 8:
                d2 d2Var2 = (d2) this.b;
                g0 g0Var2 = (g0) this.d;
                z1 z1Var = (z1) this.e;
                mt mtVar3 = (mt) this.c;
                try {
                    jSONObject = WalletEngine2.signData(g0Var2, z1Var.a, z1Var.h, z1Var.g, new JSONObject(z1Var.k), d2.l(z1Var.a.manifest.url), d2Var2.f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = d2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new bi.k8(d2Var2, z1Var, g0Var2, mtVar3, jSONObject, h, 16));
                break;
            case 9:
                z4.d0((z4) this.b, (LinearLayout) this.d, (j0) this.e, (m80) this.c);
                break;
            case 10:
                j0 j0Var4 = (j0) this.b;
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                l6 l6Var = (l6) this.c;
                f fVar = j0Var4.h;
                if (fVar.f() != null && !zArr[0]) {
                    e1Var.setSubtext(fVar.i());
                    l6Var.run();
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

    public /* synthetic */ l6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ l6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.a = 11;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public /* synthetic */ l6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.a = 13;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = callback4;
    }
}
