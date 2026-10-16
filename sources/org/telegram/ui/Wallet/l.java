package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ay;
import org.telegram.ui.bs0;
import org.telegram.ui.fo;
import org.telegram.ui.j90;
import org.telegram.ui.kf;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(int i10, Object obj, Object obj2, String str) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.b;
                String str = (String) this.c;
                b0 b0Var = (b0) this.d;
                if (k0Var.J.get(str) == b0Var) {
                    b0Var.e = true;
                    ArrayList arrayList = b0Var.f;
                    k0Var.f0(b0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(b0Var);
                    }
                    arrayList.clear();
                    k0Var.I();
                    break;
                }
                break;
            case 1:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.b;
                Exception exc = (Exception) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                if (importedWalletProof != null) {
                    k0.E("proof done");
                    callback2.run(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str2 = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    k0.j(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    callback2.run(null, str2);
                    break;
                }
                break;
            case 2:
                ay ayVar = (ay) this.b;
                a2 a2Var = (a2) this.c;
                di.d dVar = (di.d) this.d;
                if (!ayVar.canScrollVertically(1)) {
                    a2Var.p = true;
                }
                dVar.setEnabled((!a2Var.p || a2Var.m || a2Var.n) ? false : true);
                break;
            case 3:
                e2 e2Var = (e2) this.b;
                z1 z1Var = (z1) this.c;
                j90 j90Var = (j90) this.d;
                e2Var.getClass();
                k kVar = new k(j90Var, 2);
                TL_wallet.tonConnectSession tonconnectsession = z1Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (!z1Var.f) {
                        z1Var.f = true;
                        e2Var.b.h0(new m6(e2Var, z1Var, kVar, tonconnectsession, 5));
                        break;
                    } else {
                        kVar.run("A TON Connect operation is already in progress");
                        break;
                    }
                } else {
                    kVar.run("The dApp manifest is unavailable or the session is closed");
                    break;
                }
            case 4:
                e2 e2Var2 = (e2) this.b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                e2Var2.getClass();
                k kVar2 = new k(callback, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!e2Var2.c.add(Long.valueOf(tonconnectsession2.id))) {
                        kVar2.run("A TON Connect operation is already in progress");
                        break;
                    } else {
                        p pVar = new p(e2Var2, tonconnectsession2, kVar2, 3);
                        if (!tonconnectsession2.closed) {
                            e2Var2.b.h0(new l(e2Var2, pVar, tonconnectsession2, 6));
                            break;
                        } else {
                            pVar.run(null);
                            break;
                        }
                    }
                } else {
                    kVar2.run("Missing TON Connect session data");
                    break;
                }
                break;
            case 5:
                ((bi.f0) this.b).run((TL_wallet.inputTonConnectOauthSession) this.d, (String) this.c);
                break;
            case 6:
                e2 e2Var3 = (e2) this.b;
                p pVar2 = (p) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                k0 k0Var2 = e2Var3.b;
                String r10 = k0Var2.r();
                byte[] w9 = k0Var2.w();
                byte[] bArr = w9 == null ? null : (byte[]) w9.clone();
                if (r10 != null && bArr != null) {
                    k0Var2.x(new kf(e2Var3, pVar2, tonconnectsession3, r10, bArr, 6), true, false);
                    break;
                } else {
                    pVar2.run("Wallet is not ready");
                    break;
                }
            case 7:
                z1 z1Var2 = (z1) this.b;
                k kVar3 = (k) this.d;
                String str3 = (String) this.c;
                z1Var2.f = false;
                kVar3.run(str3);
                break;
            case 8:
                m6 m6Var = (m6) this.b;
                l80 l80Var = (l80) this.c;
                l80 l80Var2 = (l80) this.d;
                m6Var.run();
                l80Var.K(l80Var2);
                break;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.b;
                j2[] j2VarArr = (j2[]) this.c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    j2 j2Var = j2VarArr[0];
                    if (j2Var != null) {
                        j2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(fo.W9(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 10:
                j2[] j2VarArr2 = (j2[]) this.b;
                j2VarArr2[0].setOnDismissListener(new fi.d0(13, (TLRPC.User) this.c, (TL_wallet.walletTransactionPeerUser) this.d));
                j2VarArr2[0].dismiss();
                break;
            case 11:
                ((Utilities.Callback2) this.b).run(((String[]) this.c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                break;
            case 12:
                ((Utilities.Callback2) this.b).run((String) this.c, (String) this.d);
                break;
            case 13:
                ((WalletEngine2) this.b).lambda$previewSignMessage$8((d2) this.c, (Utilities.Callback) this.d);
                break;
            case 14:
                ((Utilities.Callback2) this.b).run((Long) this.d, (String) this.c);
                break;
            case 15:
                ((WalletEngine2) this.b).lambda$previewTonConnect$2((d2) this.c, (Utilities.Callback2) this.d);
                break;
            case 16:
                l7 l7Var = (l7) this.c;
                k0 k0Var3 = (k0) this.b;
                f0 f0Var = (f0) this.d;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getParentActivity(), 0, l7Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new f7(l7Var, k0Var3, f0Var));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            default:
                l7 l7Var2 = (l7) this.c;
                Boolean bool = (Boolean) this.d;
                k0 k0Var4 = (k0) this.b;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l7Var2.getParentActivity(), 0, l7Var2.getResourceProvider());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new f7(l7Var2, bool, k0Var4, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new bs0(24, l7Var2, bool));
                alertDialog$Builder2.o();
                break;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ l(k0 k0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.a = 1;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = callback2;
    }

    public /* synthetic */ l(l7 l7Var, Boolean bool, k0 k0Var) {
        this.a = 17;
        this.c = l7Var;
        this.d = bool;
        this.b = k0Var;
    }

    public /* synthetic */ l(l7 l7Var, k0 k0Var, f0 f0Var) {
        this.a = 16;
        this.c = l7Var;
        this.b = k0Var;
        this.d = f0Var;
    }
}
