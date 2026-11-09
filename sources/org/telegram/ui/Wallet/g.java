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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cn;
import org.telegram.ui.v60;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                    l0.H("proof done");
                    v10Var.a(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    l0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    v10Var.a(null, str);
                    break;
                }
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
                        ((c20) obj4).a(c0Var);
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
                fi.d dVar = (fi.d) obj;
                if (!((i60) obj3).canScrollVertically(1)) {
                    z1Var.p = true;
                }
                dVar.setEnabled((!z1Var.p || z1Var.m || z1Var.n) ? false : true);
                break;
            case 4:
                d2 d2Var = (d2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                d2Var.getClass();
                k kVar = new k((c20) obj, 2);
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
                break;
            case 5:
                ((bi.p5) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                break;
            case 6:
                d2 d2Var2 = (d2) obj3;
                y1 y1Var = (y1) obj2;
                d2Var2.getClass();
                k kVar2 = new k((v60) obj, i10);
                TL_wallet.tonConnectSession tonconnectsession2 = y1Var.e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (!y1Var.f) {
                        y1Var.f = true;
                        d2Var2.b.m0(new e7(d2Var2, y1Var, kVar2, tonconnectsession2, 8));
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
                    l0Var2.z(new bi.t3(d2Var3, mVar2, tonconnectsession3, t6, bArr, 7), true, false);
                    break;
                } else {
                    mVar2.a("Wallet is not ready");
                    break;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                q2 q2Var = (q2) obj;
                t2.a.remove((jg.c1) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    hc.b0(id.M0(2131742959, null));
                    q2Var.a();
                    break;
                }
                break;
            case 9:
                s2 s2Var = (s2) obj3;
                fi.d dVar2 = (fi.d) obj2;
                fi.d dVar3 = (fi.d) obj;
                boolean a10 = s2Var.a();
                dVar2.setEnabled((a10 || s2Var.d) ? false : true);
                dVar3.setEnabled((a10 || s2Var.d) ? false : true);
                break;
            case 10:
                ((e7) obj3).run();
                ((l60) obj2).K((l60) obj);
                break;
            case 11:
                y2[] y2VarArr = (y2[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((x10) obj3) == null) {
                    y2 y2Var = y2VarArr[0];
                    if (y2Var != null) {
                        y2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(cn.ta(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 12:
                y2[] y2VarArr2 = (y2[]) obj3;
                y2VarArr2[0].setOnDismissListener(new bi.u3(15, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                y2VarArr2[0].dismiss();
                break;
            case 13:
                y2[] y2VarArr3 = (y2[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((x10) obj3) == null) {
                    y2 y2Var2 = y2VarArr3[0];
                    if (y2Var2 != null) {
                        y2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(cn.ta(-walletTransactionPeer.channel_id));
                        break;
                    }
                }
                break;
            case 14:
                ((v10) obj).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj2)[0]));
                break;
            case 15:
                a6 a6Var = (a6) obj3;
                x5 x5Var = (x5) obj2;
                a6Var.b = x5Var;
                x5Var.j(a6Var.c);
                a6Var.g0 = Float.NaN;
                a6Var.b(a6Var.c0, a6Var.f0);
                a6Var.e.setVisibility(0);
                ((y5) obj).run();
                j3 j3Var = a6Var.d;
                if (j3Var != null) {
                    a6Var.d = null;
                    j3Var.run();
                    break;
                }
                break;
            case 16:
                ((v10) obj).a((String) obj3, (String) obj2);
                break;
            case 17:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((c2) obj2, (c20) obj);
                break;
            case 18:
                ((v10) obj).a((Long) obj3, (String) obj2);
                break;
            case 19:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((c2) obj2, (v10) obj);
                break;
            case 20:
                z7 z7Var = (z7) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                z7Var.C = false;
                a8 a8Var = z7Var.d0;
                boolean z9 = a8Var.a1;
                f6 f6Var = a8Var.c;
                if (!z9) {
                    if (z7Var.u == null) {
                        z7Var.u = Bitmap.createBitmap(qs.L4, qs.L4, Bitmap.Config.ARGB_8888);
                        if (f6Var.isShown() && f6Var.getAlpha() > 0.0f) {
                            y7 y7Var = z7Var.r;
                            y7Var.a(0.0f);
                            y7Var.b = 1.0f;
                        }
                    }
                    z7Var.u.setPixels(iArr, 0, qs.L4, 0, 0, qs.L4, qs.L4);
                    if (bitmap != null && z7Var.w == null) {
                        z7Var.w = bitmap;
                    }
                    if (z7Var.D) {
                        z7Var.c();
                    }
                    a8Var.f0();
                    break;
                }
                break;
            default:
                m8 m8Var = (m8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m8Var.getParentActivity(), m8Var.getResourceProvider());
                String M0 = id.M0(2131743131, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743134, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131743136, null), new h8(m8Var, (l0) obj2, (g0) obj));
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

    public /* synthetic */ g(l0 l0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, v10 v10Var) {
        this.a = 0;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = v10Var;
    }
}
