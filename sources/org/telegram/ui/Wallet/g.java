package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.an;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 3;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj3;
                Exception exc = (Exception) obj2;
                v10 v10Var = (v10) obj;
                if (importedWalletProof != null) {
                    m0.H("proof done");
                    v10Var.a(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    m0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    v10Var.a(null, str);
                    break;
                }
            case 1:
                m0 m0Var = (m0) obj3;
                d0 d0Var = (d0) obj;
                if (m0Var.N.get((String) obj2) == d0Var) {
                    d0Var.e = true;
                    ArrayList arrayList = d0Var.f;
                    m0Var.k0(d0Var);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj4 = arrayList.get(i11);
                        i11++;
                        ((c20) obj4).a(d0Var);
                    }
                    arrayList.clear();
                    m0Var.L();
                    break;
                }
                break;
            case 2:
                ((z1) obj3).f = false;
                ((k) obj2).a((String) obj);
                break;
            case 3:
                a2 a2Var = (a2) obj2;
                fi.d dVar = (fi.d) obj;
                if (!((h60) obj3).canScrollVertically(1)) {
                    a2Var.p = true;
                }
                dVar.setEnabled((!a2Var.p || a2Var.m || a2Var.n) ? false : true);
                break;
            case 4:
                e2 e2Var = (e2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                e2Var.getClass();
                k kVar = new k((c20) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!e2Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        break;
                    } else {
                        m mVar = new m(e2Var, tonconnectsession, kVar, i10);
                        if (!tonconnectsession.closed) {
                            e2Var.b.m0(new g(e2Var, mVar, tonconnectsession, 7));
                            break;
                        } else {
                            mVar.a(null);
                            break;
                        }
                    }
                } else {
                    kVar.a("Missing TON Connect session data");
                    break;
                }
                break;
            case 5:
                ((bi.p5) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                break;
            case 6:
                e2 e2Var2 = (e2) obj3;
                z1 z1Var = (z1) obj2;
                e2Var2.getClass();
                k kVar2 = new k((t60) obj, i10);
                TL_wallet.tonConnectSession tonconnectsession2 = z1Var.e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (!z1Var.f) {
                        z1Var.f = true;
                        e2Var2.b.m0(new f7(e2Var2, z1Var, kVar2, tonconnectsession2, 8));
                        break;
                    } else {
                        kVar2.a("A TON Connect operation is already in progress");
                        break;
                    }
                } else {
                    kVar2.a("The dApp manifest is unavailable or the session is closed");
                    break;
                }
                break;
            case 7:
                e2 e2Var3 = (e2) obj3;
                m mVar2 = (m) obj2;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj;
                m0 m0Var2 = e2Var3.b;
                String t6 = m0Var2.t();
                byte[] y10 = m0Var2.y();
                byte[] bArr = y10 != null ? (byte[]) y10.clone() : null;
                if (t6 != null && bArr != null) {
                    m0Var2.z(new bi.t3(e2Var3, mVar2, tonconnectsession3, t6, bArr, 7), true, false);
                    break;
                } else {
                    mVar2.a("Wallet is not ready");
                    break;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                r2 r2Var = (r2) obj;
                u2.a.remove((jg.c1) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    hc.b0(id.M0(2131742962, null));
                    r2Var.a();
                    break;
                }
                break;
            case 9:
                t2 t2Var = (t2) obj3;
                fi.d dVar2 = (fi.d) obj2;
                fi.d dVar3 = (fi.d) obj;
                boolean a10 = t2Var.a();
                dVar2.setEnabled((a10 || t2Var.d) ? false : true);
                dVar3.setEnabled((a10 || t2Var.d) ? false : true);
                break;
            case 10:
                ((f7) obj3).run();
                ((k60) obj2).K((k60) obj);
                break;
            case 11:
                z2[] z2VarArr = (z2[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((x10) obj3) == null) {
                    z2 z2Var = z2VarArr[0];
                    if (z2Var != null) {
                        z2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(an.ra(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 12:
                z2[] z2VarArr2 = (z2[]) obj3;
                z2VarArr2[0].setOnDismissListener(new bi.u3(15, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                z2VarArr2[0].dismiss();
                break;
            case 13:
                z2[] z2VarArr3 = (z2[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((x10) obj3) == null) {
                    z2 z2Var2 = z2VarArr3[0];
                    if (z2Var2 != null) {
                        z2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(an.ra(-walletTransactionPeer.channel_id));
                        break;
                    }
                }
                break;
            case 14:
                ((v10) obj).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj2)[0]));
                break;
            case 15:
                b6 b6Var = (b6) obj3;
                y5 y5Var = (y5) obj2;
                b6Var.b = y5Var;
                y5Var.j(b6Var.c);
                b6Var.g0 = Float.NaN;
                b6Var.b(b6Var.c0, b6Var.f0);
                b6Var.e.setVisibility(0);
                ((z5) obj).run();
                k3 k3Var = b6Var.d;
                if (k3Var != null) {
                    b6Var.d = null;
                    k3Var.run();
                    break;
                }
                break;
            case 16:
                ((v10) obj).a((String) obj3, (String) obj2);
                break;
            case 17:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((d2) obj2, (c20) obj);
                break;
            case 18:
                ((v10) obj).a((Long) obj3, (String) obj2);
                break;
            case 19:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((d2) obj2, (v10) obj);
                break;
            case 20:
                a8 a8Var = (a8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                a8Var.C = false;
                b8 b8Var = a8Var.d0;
                boolean z9 = b8Var.a1;
                g6 g6Var = b8Var.c;
                if (!z9) {
                    if (a8Var.u == null) {
                        a8Var.u = Bitmap.createBitmap(qs.L4, qs.L4, Bitmap.Config.ARGB_8888);
                        if (g6Var.isShown() && g6Var.getAlpha() > 0.0f) {
                            z7 z7Var = a8Var.r;
                            z7Var.a(0.0f);
                            z7Var.b = 1.0f;
                        }
                    }
                    a8Var.u.setPixels(iArr, 0, qs.L4, 0, 0, qs.L4, qs.L4);
                    if (bitmap != null && a8Var.w == null) {
                        a8Var.w = bitmap;
                    }
                    if (a8Var.D) {
                        a8Var.c();
                    }
                    b8Var.f0();
                    break;
                }
                break;
            default:
                n8 n8Var = (n8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getParentActivity(), n8Var.getResourceProvider());
                String M0 = id.M0(2131743134, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743137, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131743139, null), new i8(n8Var, (m0) obj2, (h0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ g(v10 v10Var, Serializable serializable, Serializable serializable2, int i7) {
        this.a = i7;
        this.d = v10Var;
        this.b = serializable;
        this.c = serializable2;
    }

    public /* synthetic */ g(m0 m0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, v10 v10Var) {
        this.a = 0;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = v10Var;
    }
}
