package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                    n0.H("proof done");
                    v10Var.a(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    n0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    v10Var.a(null, str);
                    break;
                }
            case 1:
                n0 n0Var = (n0) obj3;
                e0 e0Var = (e0) obj;
                if (n0Var.N.get((String) obj2) == e0Var) {
                    e0Var.e = true;
                    ArrayList arrayList = e0Var.f;
                    n0Var.k0(e0Var);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj4 = arrayList.get(i11);
                        i11++;
                        ((c20) obj4).a(e0Var);
                    }
                    arrayList.clear();
                    n0Var.L();
                    break;
                }
                break;
            case 2:
                ((a2) obj3).f = false;
                ((k) obj2).a((String) obj);
                break;
            case 3:
                b2 b2Var = (b2) obj2;
                fi.d dVar = (fi.d) obj;
                if (!((h60) obj3).canScrollVertically(1)) {
                    b2Var.p = true;
                }
                dVar.setEnabled((!b2Var.p || b2Var.m || b2Var.n) ? false : true);
                break;
            case 4:
                f2 f2Var = (f2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                f2Var.getClass();
                k kVar = new k((c20) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!f2Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        break;
                    } else {
                        m mVar = new m(f2Var, tonconnectsession, kVar, i10);
                        if (!tonconnectsession.closed) {
                            f2Var.b.m0(new g(f2Var, mVar, tonconnectsession, 7));
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
                f2 f2Var2 = (f2) obj3;
                a2 a2Var = (a2) obj2;
                f2Var2.getClass();
                k kVar2 = new k((t60) obj, i10);
                TL_wallet.tonConnectSession tonconnectsession2 = a2Var.e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (!a2Var.f) {
                        a2Var.f = true;
                        f2Var2.b.m0(new g7(f2Var2, a2Var, kVar2, tonconnectsession2, 8));
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
                f2 f2Var3 = (f2) obj3;
                m mVar2 = (m) obj2;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj;
                n0 n0Var2 = f2Var3.b;
                String t6 = n0Var2.t();
                byte[] y10 = n0Var2.y();
                byte[] bArr = y10 != null ? (byte[]) y10.clone() : null;
                if (t6 != null && bArr != null) {
                    n0Var2.z(new bi.t3(f2Var3, mVar2, tonconnectsession3, t6, bArr, 7), true, false);
                    break;
                } else {
                    mVar2.a("Wallet is not ready");
                    break;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                s2 s2Var = (s2) obj;
                v2.a.remove((jg.c1) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    hc.b0(hd.M0(2131742960, null));
                    s2Var.a();
                    break;
                }
                break;
            case 9:
                u2 u2Var = (u2) obj3;
                fi.d dVar2 = (fi.d) obj2;
                fi.d dVar3 = (fi.d) obj;
                boolean a10 = u2Var.a();
                dVar2.setEnabled((a10 || u2Var.d) ? false : true);
                dVar3.setEnabled((a10 || u2Var.d) ? false : true);
                break;
            case 10:
                ((g7) obj3).run();
                ((k60) obj2).K((k60) obj);
                break;
            case 11:
                a3[] a3VarArr = (a3[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((x10) obj3) == null) {
                    a3 a3Var = a3VarArr[0];
                    if (a3Var != null) {
                        a3Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(an.ra(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 12:
                a3[] a3VarArr2 = (a3[]) obj3;
                a3VarArr2[0].setOnDismissListener(new bi.u3(15, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                a3VarArr2[0].dismiss();
                break;
            case 13:
                a3[] a3VarArr3 = (a3[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((x10) obj3) == null) {
                    a3 a3Var2 = a3VarArr3[0];
                    if (a3Var2 != null) {
                        a3Var2.dismiss();
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
                c6 c6Var = (c6) obj3;
                z5 z5Var = (z5) obj2;
                c6Var.b = z5Var;
                z5Var.j(c6Var.c);
                c6Var.g0 = Float.NaN;
                c6Var.b(c6Var.c0, c6Var.f0);
                c6Var.e.setVisibility(0);
                ((a6) obj).run();
                l3 l3Var = c6Var.d;
                if (l3Var != null) {
                    c6Var.d = null;
                    l3Var.run();
                    break;
                }
                break;
            case 16:
                ((v10) obj).a((String) obj3, (String) obj2);
                break;
            case 17:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((e2) obj2, (c20) obj);
                break;
            case 18:
                ((v10) obj).a((Long) obj3, (String) obj2);
                break;
            case 19:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((e2) obj2, (v10) obj);
                break;
            case 20:
                b8 b8Var = (b8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                b8Var.C = false;
                c8 c8Var = b8Var.d0;
                boolean z9 = c8Var.a1;
                h6 h6Var = c8Var.c;
                if (!z9) {
                    if (b8Var.u == null) {
                        b8Var.u = Bitmap.createBitmap(qs.L4, qs.L4, Bitmap.Config.ARGB_8888);
                        if (h6Var.isShown() && h6Var.getAlpha() > 0.0f) {
                            a8 a8Var = b8Var.r;
                            a8Var.a(0.0f);
                            a8Var.b = 1.0f;
                        }
                    }
                    b8Var.u.setPixels(iArr, 0, qs.L4, 0, 0, qs.L4, qs.L4);
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
                o8 o8Var = (o8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, o8Var.getParentActivity(), o8Var.getResourceProvider());
                String M0 = hd.M0(2131743132, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131743135, null);
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.k(hd.M0(2131743137, null), new j8(o8Var, (n0) obj2, (i0) obj));
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

    public /* synthetic */ g(n0 n0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, v10 v10Var) {
        this.a = 0;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = v10Var;
    }
}
