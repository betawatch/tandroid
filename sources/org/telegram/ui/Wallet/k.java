package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ay;
import org.telegram.ui.cs0;
import org.telegram.ui.fo;
import org.telegram.ui.j90;
import org.telegram.ui.kf;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(int i10, Object obj, Object obj2, String str) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) this.b;
                String str = (String) this.c;
                a0 a0Var = (a0) this.d;
                if (j0Var.J.get(str) == a0Var) {
                    a0Var.e = true;
                    ArrayList arrayList = a0Var.f;
                    j0Var.f0(a0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(a0Var);
                    }
                    arrayList.clear();
                    j0Var.I();
                    break;
                }
                break;
            case 1:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.b;
                Exception exc = (Exception) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                if (importedWalletProof != null) {
                    j0.E("proof done");
                    callback2.run(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str2 = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    j0.j(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    callback2.run(null, str2);
                    break;
                }
                break;
            case 2:
                ay ayVar = (ay) this.b;
                z1 z1Var = (z1) this.c;
                di.d dVar = (di.d) this.d;
                if (!ayVar.canScrollVertically(1)) {
                    z1Var.p = true;
                }
                dVar.setEnabled((!z1Var.p || z1Var.m || z1Var.n) ? false : true);
                break;
            case 3:
                d2 d2Var = (d2) this.b;
                y1 y1Var = (y1) this.c;
                j90 j90Var = (j90) this.d;
                d2Var.getClass();
                j jVar = new j(j90Var, 2);
                TL_wallet.tonConnectSession tonconnectsession = y1Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (!y1Var.f) {
                        y1Var.f = true;
                        d2Var.b.h0(new l6(d2Var, y1Var, jVar, tonconnectsession, 5));
                        break;
                    } else {
                        jVar.run("A TON Connect operation is already in progress");
                        break;
                    }
                } else {
                    jVar.run("The dApp manifest is unavailable or the session is closed");
                    break;
                }
            case 4:
                d2 d2Var2 = (d2) this.b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                d2Var2.getClass();
                j jVar2 = new j(callback, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!d2Var2.c.add(Long.valueOf(tonconnectsession2.id))) {
                        jVar2.run("A TON Connect operation is already in progress");
                        break;
                    } else {
                        o oVar = new o(d2Var2, tonconnectsession2, jVar2, 3);
                        if (!tonconnectsession2.closed) {
                            d2Var2.b.h0(new k(d2Var2, oVar, tonconnectsession2, 6));
                            break;
                        } else {
                            oVar.run(null);
                            break;
                        }
                    }
                } else {
                    jVar2.run("Missing TON Connect session data");
                    break;
                }
                break;
            case 5:
                ((bi.f0) this.b).run((TL_wallet.inputTonConnectOauthSession) this.d, (String) this.c);
                break;
            case 6:
                d2 d2Var3 = (d2) this.b;
                o oVar2 = (o) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                j0 j0Var2 = d2Var3.b;
                String r10 = j0Var2.r();
                byte[] w9 = j0Var2.w();
                byte[] bArr = w9 == null ? null : (byte[]) w9.clone();
                if (r10 != null && bArr != null) {
                    j0Var2.x(new kf(d2Var3, oVar2, tonconnectsession3, r10, bArr, 6), true, false);
                    break;
                } else {
                    oVar2.run("Wallet is not ready");
                    break;
                }
            case 7:
                y1 y1Var2 = (y1) this.b;
                j jVar3 = (j) this.d;
                String str3 = (String) this.c;
                y1Var2.f = false;
                jVar3.run(str3);
                break;
            case 8:
                l6 l6Var = (l6) this.b;
                m80 m80Var = (m80) this.c;
                m80 m80Var2 = (m80) this.d;
                l6Var.run();
                m80Var.K(m80Var2);
                break;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.b;
                i2[] i2VarArr = (i2[]) this.c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    i2 i2Var = i2VarArr[0];
                    if (i2Var != null) {
                        i2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(fo.W9(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 10:
                i2[] i2VarArr2 = (i2[]) this.b;
                i2VarArr2[0].setOnDismissListener(new fi.d0(13, (TLRPC.User) this.c, (TL_wallet.walletTransactionPeerUser) this.d));
                i2VarArr2[0].dismiss();
                break;
            case 11:
                ((Utilities.Callback2) this.b).run(((String[]) this.c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                break;
            case 12:
                ((Utilities.Callback2) this.b).run((String) this.c, (String) this.d);
                break;
            case 13:
                ((WalletEngine2) this.b).lambda$previewSignMessage$8((c2) this.c, (Utilities.Callback) this.d);
                break;
            case 14:
                ((Utilities.Callback2) this.b).run((Long) this.d, (String) this.c);
                break;
            case 15:
                ((WalletEngine2) this.b).lambda$previewTonConnect$2((c2) this.c, (Utilities.Callback2) this.d);
                break;
            case 16:
                k7 k7Var = (k7) this.c;
                j0 j0Var3 = (j0) this.b;
                e0 e0Var = (e0) this.d;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getParentActivity(), 0, k7Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new e7(k7Var, j0Var3, e0Var));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            default:
                k7 k7Var2 = (k7) this.c;
                Boolean bool = (Boolean) this.d;
                j0 j0Var4 = (j0) this.b;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k7Var2.getParentActivity(), 0, k7Var2.getResourceProvider());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new e7(k7Var2, bool, j0Var4, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new cs0(25, k7Var2, bool));
                alertDialog$Builder2.o();
                break;
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ k(j0 j0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.a = 1;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = callback2;
    }

    public /* synthetic */ k(k7 k7Var, Boolean bool, j0 j0Var) {
        this.a = 17;
        this.c = k7Var;
        this.d = bool;
        this.b = j0Var;
    }

    public /* synthetic */ k(k7 k7Var, j0 j0Var, e0 e0Var) {
        this.a = 16;
        this.c = k7Var;
        this.b = j0Var;
        this.d = e0Var;
    }
}
