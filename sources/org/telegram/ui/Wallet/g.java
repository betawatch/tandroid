package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.fe;
import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.af;
import org.telegram.ui.r70;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 3;
        int i12 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj3;
                Exception exc = (Exception) obj2;
                j20 j20Var = (j20) obj;
                if (importedWalletProof != null) {
                    k0.H("proof done");
                    j20Var.a(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    k0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    j20Var.a(null, str);
                    break;
                }
            case 1:
                k0 k0Var = (k0) obj3;
                b0 b0Var = (b0) obj;
                if (k0Var.N.get((String) obj2) == b0Var) {
                    b0Var.e = true;
                    ArrayList arrayList = b0Var.f;
                    k0Var.k0(b0Var);
                    int size = arrayList.size();
                    while (i12 < size) {
                        Object obj4 = arrayList.get(i12);
                        i12++;
                        ((q20) obj4).a(b0Var);
                    }
                    arrayList.clear();
                    k0Var.L();
                    break;
                }
                break;
            case 2:
                ((z1) obj3).f = false;
                ((k) obj2).a((String) obj);
                break;
            case 3:
                a2 a2Var = (a2) obj2;
                vh.d dVar = (vh.d) obj;
                if (!((w60) obj3).canScrollVertically(1)) {
                    a2Var.p = true;
                }
                dVar.setEnabled((!a2Var.p || a2Var.m || a2Var.n) ? false : true);
                break;
            case 4:
                e2 e2Var = (e2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                e2Var.getClass();
                k kVar = new k((q20) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!e2Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        break;
                    } else {
                        m mVar = new m(e2Var, tonconnectsession, kVar, i11);
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
                ((ih.s) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                break;
            case 6:
                e2 e2Var2 = (e2) obj3;
                z1 z1Var = (z1) obj2;
                e2Var2.getClass();
                k kVar2 = new k((r70) obj, i11);
                TL_wallet.tonConnectSession tonconnectsession2 = z1Var.e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (!z1Var.f) {
                        z1Var.f = true;
                        e2Var2.b.m0(new k7(e2Var2, z1Var, kVar2, tonconnectsession2, 8));
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
                k0 k0Var2 = e2Var3.b;
                String t10 = k0Var2.t();
                byte[] y3 = k0Var2.y();
                byte[] bArr = y3 != null ? (byte[]) y3.clone() : null;
                if (t10 != null && bArr != null) {
                    k0Var2.z(new af(e2Var3, mVar2, tonconnectsession3, t10, bArr, 6), true, false);
                    break;
                } else {
                    mVar2.a("Wallet is not ready");
                    break;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                r2 r2Var = (r2) obj;
                u2.a.remove((fe) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    cc.b0(cd.L0(2131742985, null));
                    r2Var.a();
                    break;
                }
                break;
            case 9:
                t2 t2Var = (t2) obj3;
                vh.d dVar2 = (vh.d) obj2;
                vh.d dVar3 = (vh.d) obj;
                boolean a2 = t2Var.a();
                dVar2.setEnabled((a2 || t2Var.d) ? false : true);
                dVar3.setEnabled((a2 || t2Var.d) ? false : true);
                break;
            case 10:
                ((k7) obj3).run();
                ((z60) obj2).K((z60) obj);
                break;
            case 11:
                z2[] z2VarArr = (z2[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((l20) obj3) == null) {
                    z2 z2Var = z2VarArr[0];
                    if (z2Var != null) {
                        z2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(un.ha(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 12:
                z2[] z2VarArr2 = (z2[]) obj3;
                z2VarArr2[0].setOnDismissListener(new mg.g(11, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                z2VarArr2[0].dismiss();
                break;
            case 13:
                z2[] z2VarArr3 = (z2[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((l20) obj3) == null) {
                    z2 z2Var2 = z2VarArr3[0];
                    if (z2Var2 != null) {
                        z2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(un.ha(-walletTransactionPeer.channel_id));
                        break;
                    }
                }
                break;
            case 14:
                ((j20) obj).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj2)[0]));
                break;
            case 15:
                g6 g6Var = (g6) obj3;
                c6 c6Var = (c6) obj2;
                g6Var.b = c6Var;
                c6Var.j(g6Var.c);
                g6Var.g0 = Float.NaN;
                g6Var.b(g6Var.c0, g6Var.f0);
                g6Var.e.setVisibility(0);
                ((d6) obj).run();
                l3 l3Var = g6Var.d;
                if (l3Var != null) {
                    g6Var.d = null;
                    l3Var.run();
                    break;
                }
                break;
            case 16:
                ((j20) obj).a((String) obj3, (String) obj2);
                break;
            case 17:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((d2) obj2, (q20) obj);
                break;
            case 18:
                ((j20) obj).a((Long) obj3, (String) obj2);
                break;
            case 19:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((d2) obj2, (j20) obj);
                break;
            case 20:
                g8 g8Var = (g8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                g8Var.C = false;
                h8 h8Var = g8Var.d0;
                boolean z10 = h8Var.a1;
                l6 l6Var = h8Var.c;
                if (!z10) {
                    if (g8Var.u == null) {
                        g8Var.u = Bitmap.createBitmap(zs.L4, zs.L4, Bitmap.Config.ARGB_8888);
                        if (l6Var.isShown() && l6Var.getAlpha() > 0.0f) {
                            f8 f8Var = g8Var.r;
                            f8Var.a(0.0f);
                            f8Var.b = 1.0f;
                        }
                    }
                    g8Var.u.setPixels(iArr, 0, zs.L4, 0, 0, zs.L4, zs.L4);
                    if (bitmap != null && g8Var.w == null) {
                        g8Var.w = bitmap;
                    }
                    if (g8Var.D) {
                        g8Var.c();
                    }
                    h8Var.f0();
                    break;
                }
                break;
            default:
                t8 t8Var = (t8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t8Var.getParentActivity(), t8Var.getResourceProvider());
                String L0 = cd.L0(2131743157, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131743160, null);
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.k(cd.L0(2131743162, null), new o8(t8Var, (k0) obj2, (f0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ g(j20 j20Var, Serializable serializable, Serializable serializable2, int i10) {
        this.a = i10;
        this.d = j20Var;
        this.b = serializable;
        this.c = serializable2;
    }

    public /* synthetic */ g(k0 k0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, j20 j20Var) {
        this.a = 0;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = j20Var;
    }
}
