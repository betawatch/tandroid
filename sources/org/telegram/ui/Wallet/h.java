package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.i80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.en0;
import org.telegram.ui.ex;
import org.telegram.ui.l80;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.b;
                Exception exc = (Exception) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                if (importedWalletProof != null) {
                    m0.F("proof done");
                    callback2.run(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    m0.j(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    callback2.run(null, str);
                    break;
                }
            case 1:
                m0 m0Var = (m0) this.b;
                String str2 = (String) this.c;
                d0 d0Var = (d0) this.d;
                if (m0Var.N.get(str2) == d0Var) {
                    d0Var.e = true;
                    ArrayList arrayList = d0Var.f;
                    m0Var.h0(d0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(d0Var);
                    }
                    arrayList.clear();
                    m0Var.J();
                    break;
                }
                break;
            case 2:
                ex exVar = (ex) this.b;
                b2 b2Var = (b2) this.c;
                ei.d dVar = (ei.d) this.d;
                if (!exVar.canScrollVertically(1)) {
                    b2Var.p = true;
                }
                dVar.setEnabled((!b2Var.p || b2Var.m || b2Var.n) ? false : true);
                break;
            case 3:
                f2 f2Var = (f2) this.b;
                a2 a2Var = (a2) this.c;
                l80 l80Var = (l80) this.d;
                f2Var.getClass();
                l lVar = new l(l80Var, 2);
                TL_wallet.tonConnectSession tonconnectsession = a2Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (!a2Var.f) {
                        a2Var.f = true;
                        f2Var.b.j0(new w6(f2Var, a2Var, lVar, tonconnectsession, 6));
                        break;
                    } else {
                        lVar.run("A TON Connect operation is already in progress");
                        break;
                    }
                } else {
                    lVar.run("The dApp manifest is unavailable or the session is closed");
                    break;
                }
                break;
            case 4:
                f2 f2Var2 = (f2) this.b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                f2Var2.getClass();
                l lVar2 = new l(callback, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!f2Var2.c.add(Long.valueOf(tonconnectsession2.id))) {
                        lVar2.run("A TON Connect operation is already in progress");
                        break;
                    } else {
                        p pVar = new p(f2Var2, tonconnectsession2, lVar2, 3);
                        if (!tonconnectsession2.closed) {
                            f2Var2.b.j0(new h(f2Var2, pVar, tonconnectsession2, 6));
                            break;
                        } else {
                            pVar.run(null);
                            break;
                        }
                    }
                } else {
                    lVar2.run("Missing TON Connect session data");
                    break;
                }
            case 5:
                ((s1) this.b).run((TL_wallet.inputTonConnectOauthSession) this.c, (String) this.d);
                break;
            case 6:
                f2 f2Var3 = (f2) this.b;
                p pVar2 = (p) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                m0 m0Var2 = f2Var3.b;
                String s10 = m0Var2.s();
                byte[] x10 = m0Var2.x();
                byte[] bArr = x10 == null ? null : (byte[]) x10.clone();
                if (s10 != null && bArr != null) {
                    m0Var2.y(new ai.x3(f2Var3, pVar2, tonconnectsession3, s10, bArr, 7), true, false);
                    break;
                } else {
                    pVar2.run("Wallet is not ready");
                    break;
                }
            case 7:
                a2 a2Var2 = (a2) this.b;
                l lVar3 = (l) this.c;
                String str3 = (String) this.d;
                a2Var2.f = false;
                lVar3.run(str3);
                break;
            case 8:
                w6 w6Var = (w6) this.b;
                i80 i80Var = (i80) this.c;
                i80 i80Var2 = (i80) this.d;
                w6Var.run();
                i80Var.K(i80Var2);
                break;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.b;
                k2[] k2VarArr = (k2[]) this.c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    k2 k2Var = k2VarArr[0];
                    if (k2Var != null) {
                        k2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(qn.W9(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 10:
                k2[] k2VarArr2 = (k2[]) this.b;
                k2VarArr2[0].setOnDismissListener(new ai.z3(15, (TLRPC.User) this.c, (TL_wallet.walletTransactionPeerUser) this.d));
                k2VarArr2[0].dismiss();
                break;
            case 11:
                Utilities.Callback3 callback32 = (Utilities.Callback3) this.b;
                k2[] k2VarArr3 = (k2[]) this.c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (callback32 == null) {
                    k2 k2Var2 = k2VarArr3[0];
                    if (k2Var2 != null) {
                        k2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        U2.presentFragment(qn.W9(-walletTransactionPeer.channel_id));
                        break;
                    }
                }
                break;
            case 12:
                ((Utilities.Callback2) this.d).run(((String[]) this.b)[0], Boolean.valueOf(((boolean[]) this.c)[0]));
                break;
            case 13:
                s5 s5Var = (s5) this.b;
                p5 p5Var = (p5) this.c;
                q5 q5Var = (q5) this.d;
                s5Var.b = p5Var;
                p5Var.j(s5Var.c);
                s5Var.g0 = Float.NaN;
                s5Var.b(s5Var.c0, s5Var.f0);
                s5Var.e.setVisibility(0);
                q5Var.run();
                v2 v2Var = s5Var.d;
                if (v2Var != null) {
                    s5Var.d = null;
                    v2Var.run();
                    break;
                }
                break;
            case 14:
                ((Utilities.Callback2) this.d).run((String) this.b, (String) this.c);
                break;
            case 15:
                ((WalletEngine2) this.b).lambda$previewSignMessage$8((e2) this.c, (Utilities.Callback) this.d);
                break;
            case 16:
                ((Utilities.Callback2) this.d).run((Long) this.b, (String) this.c);
                break;
            case 17:
                ((WalletEngine2) this.b).lambda$previewTonConnect$2((e2) this.c, (Utilities.Callback2) this.d);
                break;
            case 18:
                s7 s7Var = (s7) this.b;
                int[] iArr = (int[]) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                s7Var.C = false;
                t7 t7Var = s7Var.d0;
                boolean z10 = t7Var.a1;
                x5 x5Var = t7Var.c;
                if (!z10) {
                    if (s7Var.u == null) {
                        s7Var.u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (x5Var.isShown() && x5Var.getAlpha() > 0.0f) {
                            r7 r7Var = s7Var.r;
                            r7Var.a(0.0f);
                            r7Var.b = 1.0f;
                        }
                    }
                    s7Var.u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && s7Var.w == null) {
                        s7Var.w = bitmap;
                    }
                    if (s7Var.D) {
                        s7Var.c();
                    }
                    t7Var.f0();
                    break;
                }
                break;
            case 19:
                h8 h8Var = (h8) this.b;
                m0 m0Var3 = (m0) this.c;
                h0 h0Var = (h0) this.d;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var.getParentActivity(), 0, h8Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new b8(h8Var, m0Var3, h0Var));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            default:
                h8 h8Var2 = (h8) this.b;
                Boolean bool = (Boolean) this.c;
                m0 m0Var4 = (m0) this.d;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h8Var2.getParentActivity(), 0, h8Var2.getResourceProvider());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new b8(h8Var2, bool, m0Var4, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new en0(26, h8Var2, bool));
                alertDialog$Builder2.o();
                break;
        }
    }

    public /* synthetic */ h(Utilities.Callback2 callback2, Serializable serializable, Serializable serializable2, int i10) {
        this.a = i10;
        this.d = callback2;
        this.b = serializable;
        this.c = serializable2;
    }

    public /* synthetic */ h(m0 m0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.a = 0;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = callback2;
    }
}
