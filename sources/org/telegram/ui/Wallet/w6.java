package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
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
                l0 l0Var = (l0) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                k0 k0Var = (k0) this.c;
                l0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    Utilities.Callback callback = (Utilities.Callback) l0Var.q.remove(wallettransaction);
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    if (nftitem != null && (d0Var = l0Var.o) != null) {
                        d0.a(d0Var, wallettransaction);
                    }
                    k0Var.k();
                    k0Var.i();
                    k0Var.g();
                    l0Var.Q();
                    break;
                }
                break;
            case 4:
                l0 l0Var2 = (l0) this.b;
                boolean[] zArr = (boolean[]) this.d;
                ai.q qVar = (ai.q) this.e;
                d2 d2Var = (d2) this.c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = l0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(d2Var, new ai.r5(27, zArr, qVar));
                        break;
                    } else {
                        qVar.run(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            case 5:
                l0 l0Var3 = (l0) this.b;
                i0 i0Var = (i0) this.d;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.e;
                k0 k0Var2 = (k0) this.c;
                i0Var.close();
                l0.F("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                k0Var2.k();
                k0Var2.i();
                k0Var2.g();
                l0Var3.Q();
                break;
            case 6:
                e2 e2Var = (e2) this.b;
                z1 z1Var = (z1) this.d;
                k kVar = (k) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                l0 l0Var4 = e2Var.b;
                String s10 = l0Var4.s();
                byte[] x10 = l0Var4.x();
                byte[] bArr = x10 == null ? null : (byte[]) x10.clone();
                w wVar = new w(4, z1Var, kVar);
                if (s10 != null && bArr != null) {
                    l0Var4.y(new h1(e2Var, wVar, tonconnectsession, s10, bArr, z1Var, 3), true, false);
                    break;
                } else {
                    wVar.run("Wallet is not ready");
                    break;
                }
            case 7:
                e2.a((e2) this.b, (TL_wallet.tonConnectSession) this.d, (String) this.c, (k) this.e);
                break;
            case 8:
                byte[] bArr2 = (byte[]) this.b;
                w wVar2 = (w) this.d;
                String str = (String) this.c;
                ai.r3 r3Var = (ai.r3) this.e;
                if (bArr2 != null) {
                    r3Var.run(bArr2);
                    break;
                } else {
                    wVar2.run(str);
                    break;
                }
            case 9:
                e2 e2Var2 = (e2) this.b;
                i0 i0Var2 = (i0) this.d;
                a2 a2Var = (a2) this.e;
                w wVar3 = (w) this.c;
                try {
                    jSONObject = WalletEngine2.signData(i0Var2, a2Var.a, a2Var.h, a2Var.g, new JSONObject(a2Var.k), e2.l(a2Var.a.manifest.url), e2Var2.f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = e2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new ai.g3(e2Var2, a2Var, i0Var2, wVar3, jSONObject, h, 23));
                break;
            case 10:
                o5.f0((o5) this.b, (LinearLayout) this.d, (l0) this.e, (j80) this.c);
                break;
            case 11:
                l0 l0Var5 = (l0) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                w6 w6Var = (w6) this.c;
                f fVar = l0Var5.h;
                if (fVar.f() != null && !zArr2[0]) {
                    e1Var.setSubtext(fVar.i());
                    w6Var.run();
                    zArr2[0] = true;
                    break;
                }
                break;
            case 12:
                ((WalletEngine2) this.b).lambda$decryptTransactionComment$45((String) this.c, (byte[]) this.d, (Utilities.Callback2) this.e);
                break;
            case 13:
                ((WalletEngine2) this.b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.c, (String) this.e);
                break;
            case 14:
                ((WalletEngine2) this.b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.c, (Utilities.Callback4) this.d);
                break;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.c);
                break;
        }
    }

    public /* synthetic */ w6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
    }

    public /* synthetic */ w6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.a = 12;
        this.b = walletEngine2;
        this.c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public /* synthetic */ w6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.a = 14;
        this.b = walletEngine2;
        this.e = bArr;
        this.c = str;
        this.d = callback4;
    }
}
