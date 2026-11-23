package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bn;
import org.telegram.ui.ne;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                v0 v0Var = (v0) obj2;
                k0 k0Var = (k0) obj;
                if (v0Var.Q.get((String) obj3) == k0Var) {
                    k0Var.e = true;
                    ArrayList arrayList = k0Var.f;
                    v0Var.v0(k0Var);
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj4 = arrayList.get(i10);
                        i10++;
                        ((w10) obj4).a(k0Var);
                    }
                    arrayList.clear();
                    v0Var.T();
                    break;
                }
                break;
            case 1:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj2;
                Exception exc = (Exception) obj3;
                p10 p10Var = (p10) obj;
                if (importedWalletProof != null) {
                    v0.P("proof done");
                    p10Var.a(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    v0.o(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    p10Var.a(null, str);
                    break;
                }
            case 2:
                ((h2) obj2).f = false;
                ((k) obj).a((String) obj3);
                break;
            case 3:
                ((f0) obj2).a((TL_wallet.inputTonConnectOauthSession) obj, (String) obj3);
                break;
            case 4:
                i2 i2Var = (i2) obj3;
                hi.e eVar = (hi.e) obj;
                if (!((bi.m6) obj2).canScrollVertically(1)) {
                    i2Var.p = true;
                }
                eVar.setEnabled((!i2Var.p || i2Var.m || i2Var.n) ? false : true);
                break;
            case 5:
                m2 m2Var = (m2) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj3;
                m2Var.getClass();
                k kVar = new k((w10) obj, r4 ? 1 : 0);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!m2Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        break;
                    } else {
                        o oVar = new o(m2Var, tonconnectsession, kVar, 4);
                        if (!tonconnectsession.closed) {
                            m2Var.b.x0(new p(m2Var, oVar, tonconnectsession, 6));
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
                m2 m2Var2 = (m2) obj2;
                o oVar2 = (o) obj3;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                v0 v0Var2 = m2Var2.b;
                String y10 = v0Var2.y();
                byte[] E = v0Var2.E();
                byte[] bArr = E != null ? (byte[]) E.clone() : null;
                if (y10 != null && bArr != null) {
                    v0Var2.F(true, false, false, new ne(m2Var2, oVar2, tonconnectsession2, y10, bArr, 5));
                    break;
                } else {
                    oVar2.a("Wallet is not ready");
                    break;
                }
            case 7:
                m2 m2Var3 = (m2) obj2;
                h2 h2Var = (h2) obj3;
                m2Var3.getClass();
                k kVar2 = new k((t60) obj, 2);
                TL_wallet.tonConnectSession tonconnectsession3 = h2Var.e;
                if (!tonconnectsession3.closed && !tonconnectsession3.closing && tonconnectsession3.manifest_error == null && tonconnectsession3.manifest != null) {
                    if (!h2Var.f) {
                        h2Var.f = true;
                        m2Var3.b.x0(new w7(m2Var3, h2Var, kVar2, tonconnectsession3, 7));
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
                x2 x2Var = (x2) obj;
                a3.a.remove((bi.i5) obj2);
                if (!zArr[0]) {
                    zArr[0] = true;
                    kc.c0(gd.N0(2131742688, null));
                    x2Var.a();
                    break;
                }
                break;
            case 9:
                z2 z2Var = (z2) obj2;
                hi.e eVar2 = (hi.e) obj3;
                hi.e eVar3 = (hi.e) obj;
                boolean a10 = z2Var.a();
                eVar2.setEnabled((a10 || z2Var.d) ? false : true);
                eVar3.setEnabled((a10 || z2Var.d) ? false : true);
                break;
            case 10:
                x3 x3Var = (x3) obj2;
                x3Var.V = new s3((org.telegram.ui.ActionBar.g2) obj3, (TL_wallet.card) obj, i10);
                x3Var.dismiss();
                break;
            case 11:
                ((w7) obj2).run();
                ((x60) obj3).L((x60) obj);
                break;
            case 12:
                f3[] f3VarArr = (f3[]) obj3;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((r10) obj2) == null) {
                    f3 f3Var = f3VarArr[0];
                    if (f3Var != null) {
                        f3Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(bn.ua(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 13:
                f3[] f3VarArr2 = (f3[]) obj2;
                f3VarArr2[0].setOnDismissListener(new di.u1(13, (TLRPC.User) obj3, (TL_wallet.walletTransactionPeerUser) obj));
                f3VarArr2[0].dismiss();
                break;
            case 14:
                f3[] f3VarArr3 = (f3[]) obj3;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((r10) obj2) == null) {
                    f3 f3Var2 = f3VarArr3[0];
                    if (f3Var2 != null) {
                        f3Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(bn.ua(-walletTransactionPeer.channel_id));
                        break;
                    }
                }
                break;
            case 15:
                ((p10) obj2).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj)[0]));
                break;
            case 16:
                t6 t6Var = (t6) obj2;
                q6 q6Var = (q6) obj3;
                t6Var.b = q6Var;
                q6Var.j(t6Var.c);
                t6Var.h0 = Float.NaN;
                t6Var.b(t6Var.d0, t6Var.g0);
                t6Var.e.setVisibility(0);
                ((r6) obj).run();
                r3 r3Var = t6Var.d;
                if (r3Var != null) {
                    t6Var.d = null;
                    r3Var.run();
                    break;
                }
                break;
            case 17:
                ((WalletEngine2) obj2).lambda$previewSignMessage$11((l2) obj3, (w10) obj);
                break;
            case 18:
                ((p10) obj2).a((Long) obj, (String) obj3);
                break;
            case 19:
                ((p10) obj2).a((String) obj3, (String) obj);
                break;
            case 20:
                ((WalletEngine2) obj2).lambda$previewTonConnect$2((l2) obj3, (p10) obj);
                break;
            case 21:
                r8 r8Var = (r8) obj2;
                int[] iArr = (int[]) obj3;
                Bitmap bitmap = (Bitmap) obj;
                r8Var.C = false;
                s8 s8Var = r8Var.d0;
                boolean z10 = s8Var.b1;
                y6 y6Var = s8Var.c;
                if (!z10) {
                    if (r8Var.u == null) {
                        r8Var.u = Bitmap.createBitmap(ks.L4, ks.L4, Bitmap.Config.ARGB_8888);
                        if (y6Var.isShown() && y6Var.getAlpha() > 0.0f) {
                            q8 q8Var = r8Var.r;
                            q8Var.a(0.0f);
                            q8Var.b = 1.0f;
                        }
                    }
                    r8Var.u.setPixels(iArr, 0, ks.L4, 0, 0, ks.L4, ks.L4);
                    if (bitmap != null && r8Var.w == null) {
                        r8Var.w = bitmap;
                    }
                    if (r8Var.D) {
                        r8Var.c();
                    }
                    s8Var.f0();
                    break;
                }
                break;
            default:
                e9 e9Var = (e9) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e9Var.getParentActivity(), e9Var.getResourceProvider());
                String N0 = gd.N0(2131742880, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131742883, null);
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.k(gd.N0(2131742885, null), new y8(e9Var, (v0) obj2, (p0) obj));
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

    public /* synthetic */ p(v0 v0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, p10 p10Var) {
        this.a = 1;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = p10Var;
    }

    public /* synthetic */ p(e9 e9Var, v0 v0Var, p0 p0Var) {
        this.a = 22;
        this.c = e9Var;
        this.b = v0Var;
        this.d = p0Var;
    }
}
