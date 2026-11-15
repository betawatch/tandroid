package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.an;
import org.telegram.ui.r60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                s10 s10Var = (s10) obj;
                if (importedWalletProof != null) {
                    l0.H("proof done");
                    s10Var.a(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    l0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    s10Var.a(null, str);
                    break;
                }
                break;
            case 1:
                l0 l0Var = (l0) obj3;
                c0 c0Var = (c0) obj;
                if (l0Var.N.get((String) obj2) == c0Var) {
                    c0Var.e = true;
                    ArrayList arrayList = c0Var.f;
                    l0Var.k0(c0Var);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj4 = arrayList.get(i11);
                        i11++;
                        ((z10) obj4).a(c0Var);
                    }
                    arrayList.clear();
                    l0Var.L();
                    break;
                }
                break;
            case 2:
                ((y1) obj3).f = false;
                ((k) obj2).a((String) obj);
                break;
            case 3:
                z1 z1Var = (z1) obj2;
                hi.d dVar = (hi.d) obj;
                if (!((bi.z3) obj3).canScrollVertically(1)) {
                    z1Var.p = true;
                }
                dVar.setEnabled((!z1Var.p || z1Var.m || z1Var.n) ? false : true);
                break;
            case 4:
                d2 d2Var = (d2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                d2Var.getClass();
                k kVar = new k((z10) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!d2Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        break;
                    } else {
                        m mVar = new m(d2Var, tonconnectsession, kVar, i10);
                        if (!tonconnectsession.closed) {
                            d2Var.b.m0(new g(d2Var, mVar, tonconnectsession, 7));
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
            case 5:
                ((t1) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                break;
            case 6:
                d2 d2Var2 = (d2) obj3;
                y1 y1Var = (y1) obj2;
                d2Var2.getClass();
                k kVar2 = new k((r60) obj, i10);
                TL_wallet.tonConnectSession tonconnectsession2 = y1Var.e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (!y1Var.f) {
                        y1Var.f = true;
                        d2Var2.b.m0(new g7(d2Var2, y1Var, kVar2, tonconnectsession2, 8));
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
                d2 d2Var3 = (d2) obj3;
                m mVar2 = (m) obj2;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj;
                l0 l0Var2 = d2Var3.b;
                String t6 = l0Var2.t();
                byte[] y10 = l0Var2.y();
                byte[] bArr = y10 != null ? (byte[]) y10.clone() : null;
                if (t6 != null && bArr != null) {
                    l0Var2.z(new di.z2(d2Var3, mVar2, tonconnectsession3, t6, bArr, 7), true, false);
                    break;
                } else {
                    mVar2.a("Wallet is not ready");
                    break;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                p2 p2Var = (p2) obj;
                s2.a.remove((bi.u2) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    cc.b0(hd.M0(2131742959, null));
                    p2Var.a();
                    break;
                }
                break;
            case 9:
                r2 r2Var = (r2) obj3;
                hi.d dVar2 = (hi.d) obj2;
                hi.d dVar3 = (hi.d) obj;
                boolean a10 = r2Var.a();
                dVar2.setEnabled((a10 || r2Var.d) ? false : true);
                dVar3.setEnabled((a10 || r2Var.d) ? false : true);
                break;
            case 10:
                o3 o3Var = (o3) obj3;
                o3Var.V = new j3((org.telegram.ui.ActionBar.e2) obj2, (TL_wallet.card) obj, i11);
                o3Var.dismiss();
                break;
            case 11:
                ((g7) obj3).run();
                ((m60) obj2).K((m60) obj);
                break;
            case 12:
                x2[] x2VarArr = (x2[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((u10) obj3) == null) {
                    x2 x2Var = x2VarArr[0];
                    if (x2Var != null) {
                        x2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(an.ua(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 13:
                x2[] x2VarArr2 = (x2[]) obj3;
                x2VarArr2[0].setOnDismissListener(new di.a3(15, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                x2VarArr2[0].dismiss();
                break;
            case 14:
                x2[] x2VarArr3 = (x2[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((u10) obj3) == null) {
                    x2 x2Var2 = x2VarArr3[0];
                    if (x2Var2 != null) {
                        x2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(an.ua(-walletTransactionPeer.channel_id));
                        break;
                    }
                }
                break;
            case 15:
                ((s10) obj).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj2)[0]));
                break;
            case 16:
                c6 c6Var = (c6) obj3;
                z5 z5Var = (z5) obj2;
                c6Var.b = z5Var;
                z5Var.j(c6Var.c);
                c6Var.h0 = Float.NaN;
                c6Var.b(c6Var.d0, c6Var.g0);
                c6Var.e.setVisibility(0);
                ((a6) obj).run();
                i3 i3Var = c6Var.d;
                if (i3Var != null) {
                    c6Var.d = null;
                    i3Var.run();
                    break;
                }
                break;
            case 17:
                ((s10) obj).a((String) obj3, (String) obj2);
                break;
            case 18:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((c2) obj2, (z10) obj);
                break;
            case 19:
                ((s10) obj).a((Long) obj3, (String) obj2);
                break;
            case 20:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((c2) obj2, (s10) obj);
                break;
            case 21:
                b8 b8Var = (b8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                b8Var.C = false;
                c8 c8Var = b8Var.d0;
                boolean z10 = c8Var.b1;
                h6 h6Var = c8Var.c;
                if (!z10) {
                    if (b8Var.u == null) {
                        b8Var.u = Bitmap.createBitmap(ns.L4, ns.L4, Bitmap.Config.ARGB_8888);
                        if (h6Var.isShown() && h6Var.getAlpha() > 0.0f) {
                            a8 a8Var = b8Var.r;
                            a8Var.a(0.0f);
                            a8Var.b = 1.0f;
                        }
                    }
                    b8Var.u.setPixels(iArr, 0, ns.L4, 0, 0, ns.L4, ns.L4);
                    if (bitmap != null && b8Var.w == null) {
                        b8Var.w = bitmap;
                    }
                    if (b8Var.D) {
                        b8Var.c();
                    }
                    c8Var.f0();
                    break;
                }
                break;
            default:
                p8 p8Var = (p8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p8Var.getParentActivity(), p8Var.getResourceProvider());
                String M0 = hd.M0(2131743131, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131743134, null);
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.k(hd.M0(2131743136, null), new j8(p8Var, (l0) obj2, (g0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ g(s10 s10Var, Serializable serializable, Serializable serializable2, int i7) {
        this.a = i7;
        this.d = s10Var;
        this.b = serializable;
        this.c = serializable2;
    }

    public /* synthetic */ g(l0 l0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, s10 s10Var) {
        this.a = 0;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = s10Var;
    }
}
