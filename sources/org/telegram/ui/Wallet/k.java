package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.df;
import org.telegram.ui.e90;
import org.telegram.ui.ls0;
import org.telegram.ui.vx;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                vx vxVar = (vx) this.b;
                z1 z1Var = (z1) this.c;
                ci.d dVar = (ci.d) this.d;
                if (!vxVar.canScrollVertically(1)) {
                    z1Var.p = true;
                }
                dVar.setEnabled((!z1Var.p || z1Var.m || z1Var.n) ? false : true);
                break;
            case 3:
                d2 d2Var = (d2) this.b;
                y1 y1Var = (y1) this.c;
                e90 e90Var = (e90) this.d;
                d2Var.getClass();
                j jVar = new j(e90Var, 2);
                TL_wallet.tonConnectSession tonconnectsession = y1Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (!y1Var.f) {
                        y1Var.f = true;
                        d2Var.b.h0(new m6(d2Var, y1Var, jVar, tonconnectsession, 5));
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
                ((ai.m0) this.b).run((TL_wallet.inputTonConnectOauthSession) this.d, (String) this.c);
                break;
            case 6:
                d2 d2Var3 = (d2) this.b;
                o oVar2 = (o) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                k0 k0Var2 = d2Var3.b;
                String r10 = k0Var2.r();
                byte[] w10 = k0Var2.w();
                byte[] bArr = w10 == null ? null : (byte[]) w10.clone();
                if (r10 != null && bArr != null) {
                    k0Var2.x(new df(d2Var3, oVar2, tonconnectsession3, r10, bArr, 6), true, false);
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
                m6 m6Var = (m6) this.b;
                p80 p80Var = (p80) this.c;
                p80 p80Var2 = (p80) this.d;
                m6Var.run();
                p80Var.K(p80Var2);
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
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(zn.W9(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 10:
                i2[] i2VarArr2 = (i2[]) this.b;
                i2VarArr2[0].setOnDismissListener(new ei.e0(13, (TLRPC.User) this.c, (TL_wallet.walletTransactionPeerUser) this.d));
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
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new ls0(22, l7Var2, bool));
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

    public /* synthetic */ k(k0 k0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.a = 1;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = callback2;
    }

    public /* synthetic */ k(l7 l7Var, Boolean bool, k0 k0Var) {
        this.a = 17;
        this.c = l7Var;
        this.d = bool;
        this.b = k0Var;
    }

    public /* synthetic */ k(l7 l7Var, k0 k0Var, f0 f0Var) {
        this.a = 16;
        this.c = l7Var;
        this.b = k0Var;
        this.d = f0Var;
    }
}
