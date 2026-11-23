package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bn;
import org.telegram.ui.ne;
import org.telegram.ui.u60;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                u0 u0Var = (u0) obj2;
                j0 j0Var = (j0) obj;
                if (u0Var.Q.get((String) obj3) == j0Var) {
                    j0Var.e = true;
                    ArrayList arrayList = j0Var.f;
                    u0Var.v0(j0Var);
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj4 = arrayList.get(i10);
                        i10++;
                        ((y10) obj4).a(j0Var);
                    }
                    arrayList.clear();
                    u0Var.T();
                    break;
                }
                break;
            case 1:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj2;
                Exception exc = (Exception) obj3;
                r10 r10Var = (r10) obj;
                if (importedWalletProof != null) {
                    u0.P("proof done");
                    r10Var.a(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    u0.o(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    r10Var.a(null, str);
                    break;
                }
            case 2:
                ((g2) obj2).f = false;
                ((k) obj).a((String) obj3);
                break;
            case 3:
                ((e0) obj2).a((TL_wallet.inputTonConnectOauthSession) obj, (String) obj3);
                break;
            case 4:
                h2 h2Var = (h2) obj3;
                hi.e eVar = (hi.e) obj;
                if (!((bi.j6) obj2).canScrollVertically(1)) {
                    h2Var.p = true;
                }
                eVar.setEnabled((!h2Var.p || h2Var.m || h2Var.n) ? false : true);
                break;
            case 5:
                l2 l2Var = (l2) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj3;
                l2Var.getClass();
                k kVar = new k((y10) obj, r4 ? 1 : 0);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!l2Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        break;
                    } else {
                        o oVar = new o(l2Var, tonconnectsession, kVar, 4);
                        if (!tonconnectsession.closed) {
                            l2Var.b.x0(new p(l2Var, oVar, tonconnectsession, 6));
                            break;
                        } else {
                            oVar.a(null);
                            break;
                        }
                    }
                } else {
                    kVar.a("Missing TON Connect session data");
                    break;
                }
            case 6:
                l2 l2Var2 = (l2) obj2;
                o oVar2 = (o) obj3;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                u0 u0Var2 = l2Var2.b;
                String y10 = u0Var2.y();
                byte[] E = u0Var2.E();
                byte[] bArr = E != null ? (byte[]) E.clone() : null;
                if (y10 != null && bArr != null) {
                    u0Var2.F(true, false, false, new ne(l2Var2, oVar2, tonconnectsession2, y10, bArr, 5));
                    break;
                } else {
                    oVar2.a("Wallet is not ready");
                    break;
                }
            case 7:
                l2 l2Var3 = (l2) obj2;
                g2 g2Var = (g2) obj3;
                l2Var3.getClass();
                k kVar2 = new k((u60) obj, 2);
                TL_wallet.tonConnectSession tonconnectsession3 = g2Var.e;
                if (!tonconnectsession3.closed && !tonconnectsession3.closing && tonconnectsession3.manifest_error == null && tonconnectsession3.manifest != null) {
                    if (!g2Var.f) {
                        g2Var.f = true;
                        l2Var3.b.x0(new v7(l2Var3, g2Var, kVar2, tonconnectsession3, 7));
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
            case 8:
                boolean[] zArr = (boolean[]) obj3;
                w2 w2Var = (w2) obj;
                z2.a.remove((bi.f5) obj2);
                if (!zArr[0]) {
                    zArr[0] = true;
                    lc.c0(hd.N0(2131742693, null));
                    w2Var.a();
                    break;
                }
                break;
            case 9:
                y2 y2Var = (y2) obj2;
                hi.e eVar2 = (hi.e) obj3;
                hi.e eVar3 = (hi.e) obj;
                boolean a10 = y2Var.a();
                eVar2.setEnabled((a10 || y2Var.d) ? false : true);
                eVar3.setEnabled((a10 || y2Var.d) ? false : true);
                break;
            case 10:
                w3 w3Var = (w3) obj2;
                w3Var.V = new r3((org.telegram.ui.ActionBar.g2) obj3, (TL_wallet.card) obj, i10);
                w3Var.dismiss();
                break;
            case 11:
                ((v7) obj2).run();
                ((a70) obj3).L((a70) obj);
                break;
            case 12:
                e3[] e3VarArr = (e3[]) obj3;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((t10) obj2) == null) {
                    e3 e3Var = e3VarArr[0];
                    if (e3Var != null) {
                        e3Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(bn.ua(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 13:
                e3[] e3VarArr2 = (e3[]) obj2;
                e3VarArr2[0].setOnDismissListener(new di.u1(13, (TLRPC.User) obj3, (TL_wallet.walletTransactionPeerUser) obj));
                e3VarArr2[0].dismiss();
                break;
            case 14:
                e3[] e3VarArr3 = (e3[]) obj3;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((t10) obj2) == null) {
                    e3 e3Var2 = e3VarArr3[0];
                    if (e3Var2 != null) {
                        e3Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(bn.ua(-walletTransactionPeer.channel_id));
                        break;
                    }
                }
                break;
            case 15:
                ((r10) obj2).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj)[0]));
                break;
            case 16:
                s6 s6Var = (s6) obj2;
                p6 p6Var = (p6) obj3;
                s6Var.b = p6Var;
                p6Var.j(s6Var.c);
                s6Var.h0 = Float.NaN;
                s6Var.b(s6Var.d0, s6Var.g0);
                s6Var.e.setVisibility(0);
                ((q6) obj).run();
                q3 q3Var = s6Var.d;
                if (q3Var != null) {
                    s6Var.d = null;
                    q3Var.run();
                    break;
                }
                break;
            case 17:
                ((WalletEngine2) obj2).lambda$previewSignMessage$11((k2) obj3, (y10) obj);
                break;
            case 18:
                ((r10) obj2).a((Long) obj, (String) obj3);
                break;
            case 19:
                ((r10) obj2).a((String) obj3, (String) obj);
                break;
            case 20:
                ((WalletEngine2) obj2).lambda$previewTonConnect$2((k2) obj3, (r10) obj);
                break;
            case 21:
                q8 q8Var = (q8) obj2;
                int[] iArr = (int[]) obj3;
                Bitmap bitmap = (Bitmap) obj;
                q8Var.C = false;
                r8 r8Var = q8Var.d0;
                boolean z10 = r8Var.b1;
                x6 x6Var = r8Var.c;
                if (!z10) {
                    if (q8Var.u == null) {
                        q8Var.u = Bitmap.createBitmap(ls.L4, ls.L4, Bitmap.Config.ARGB_8888);
                        if (x6Var.isShown() && x6Var.getAlpha() > 0.0f) {
                            p8 p8Var = q8Var.r;
                            p8Var.a(0.0f);
                            p8Var.b = 1.0f;
                        }
                    }
                    q8Var.u.setPixels(iArr, 0, ls.L4, 0, 0, ls.L4, ls.L4);
                    if (bitmap != null && q8Var.w == null) {
                        q8Var.w = bitmap;
                    }
                    if (q8Var.D) {
                        q8Var.c();
                    }
                    r8Var.f0();
                    break;
                }
                break;
            default:
                d9 d9Var = (d9) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d9Var.getParentActivity(), d9Var.getResourceProvider());
                String N0 = hd.N0(2131742885, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131742888, null);
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                alertDialog$Builder.k(hd.N0(2131742890, null), new x8(d9Var, (u0) obj2, (o0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, String str, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }

    public /* synthetic */ p(u0 u0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, r10 r10Var) {
        this.a = 1;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = r10Var;
    }

    public /* synthetic */ p(d9 d9Var, u0 u0Var, o0 o0Var) {
        this.a = 22;
        this.c = d9Var;
        this.b = u0Var;
        this.d = o0Var;
    }
}
