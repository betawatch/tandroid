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
import org.telegram.ui.Components.j80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.gx;
import org.telegram.ui.ql0;
import org.telegram.ui.r80;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                    l0.F("proof done");
                    callback2.run(importedWalletProof, null);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str = "PROOF_ERROR";
                    sb2.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    l0.j(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str = exc.getMessage();
                    }
                    callback2.run(null, str);
                    break;
                }
            case 1:
                l0 l0Var = (l0) this.b;
                String str2 = (String) this.c;
                c0 c0Var = (c0) this.d;
                if (l0Var.N.get(str2) == c0Var) {
                    c0Var.e = true;
                    ArrayList arrayList = c0Var.f;
                    l0Var.h0(c0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(c0Var);
                    }
                    arrayList.clear();
                    l0Var.J();
                    break;
                }
                break;
            case 2:
                gx gxVar = (gx) this.b;
                a2 a2Var = (a2) this.c;
                ei.d dVar = (ei.d) this.d;
                if (!gxVar.canScrollVertically(1)) {
                    a2Var.p = true;
                }
                dVar.setEnabled((!a2Var.p || a2Var.m || a2Var.n) ? false : true);
                break;
            case 3:
                e2 e2Var = (e2) this.b;
                z1 z1Var = (z1) this.c;
                r80 r80Var = (r80) this.d;
                e2Var.getClass();
                k kVar = new k(r80Var, 2);
                TL_wallet.tonConnectSession tonconnectsession = z1Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (!z1Var.f) {
                        z1Var.f = true;
                        e2Var.b.j0(new w6(e2Var, z1Var, kVar, tonconnectsession, 6));
                        break;
                    } else {
                        kVar.run("A TON Connect operation is already in progress");
                        break;
                    }
                } else {
                    kVar.run("The dApp manifest is unavailable or the session is closed");
                    break;
                }
                break;
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
                        o oVar = new o(e2Var2, tonconnectsession2, kVar2, 3);
                        if (!tonconnectsession2.closed) {
                            e2Var2.b.j0(new h(e2Var2, oVar, tonconnectsession2, 6));
                            break;
                        } else {
                            oVar.run(null);
                            break;
                        }
                    }
                } else {
                    kVar2.run("Missing TON Connect session data");
                    break;
                }
            case 5:
                ((r1) this.b).run((TL_wallet.inputTonConnectOauthSession) this.c, (String) this.d);
                break;
            case 6:
                e2 e2Var3 = (e2) this.b;
                o oVar2 = (o) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                l0 l0Var2 = e2Var3.b;
                String s10 = l0Var2.s();
                byte[] x10 = l0Var2.x();
                byte[] bArr = x10 == null ? null : (byte[]) x10.clone();
                if (s10 != null && bArr != null) {
                    l0Var2.y(new ai.x3(e2Var3, oVar2, tonconnectsession3, s10, bArr, 7), true, false);
                    break;
                } else {
                    oVar2.run("Wallet is not ready");
                    break;
                }
            case 7:
                z1 z1Var2 = (z1) this.b;
                k kVar3 = (k) this.c;
                String str3 = (String) this.d;
                z1Var2.f = false;
                kVar3.run(str3);
                break;
            case 8:
                w6 w6Var = (w6) this.b;
                j80 j80Var = (j80) this.c;
                j80 j80Var2 = (j80) this.d;
                w6Var.run();
                j80Var.K(j80Var2);
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
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(sn.W9(wallettransactionpeeruser.user_id));
                        break;
                    }
                }
                break;
            case 10:
                j2[] j2VarArr2 = (j2[]) this.b;
                j2VarArr2[0].setOnDismissListener(new ai.z3(15, (TLRPC.User) this.c, (TL_wallet.walletTransactionPeerUser) this.d));
                j2VarArr2[0].dismiss();
                break;
            case 11:
                Utilities.Callback3 callback32 = (Utilities.Callback3) this.b;
                j2[] j2VarArr3 = (j2[]) this.c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (callback32 == null) {
                    j2 j2Var2 = j2VarArr3[0];
                    if (j2Var2 != null) {
                        j2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        U2.presentFragment(sn.W9(-walletTransactionPeer.channel_id));
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
                u2 u2Var = s5Var.d;
                if (u2Var != null) {
                    s5Var.d = null;
                    u2Var.run();
                    break;
                }
                break;
            case 14:
                ((Utilities.Callback2) this.d).run((String) this.b, (String) this.c);
                break;
            case 15:
                ((WalletEngine2) this.b).lambda$previewSignMessage$8((d2) this.c, (Utilities.Callback) this.d);
                break;
            case 16:
                ((Utilities.Callback2) this.d).run((Long) this.b, (String) this.c);
                break;
            case 17:
                ((WalletEngine2) this.b).lambda$previewTonConnect$2((d2) this.c, (Utilities.Callback2) this.d);
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
                i8 i8Var = (i8) this.b;
                l0 l0Var3 = (l0) this.c;
                g0 g0Var = (g0) this.d;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i8Var.getParentActivity(), 0, i8Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new b8(i8Var, l0Var3, g0Var));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            default:
                i8 i8Var2 = (i8) this.b;
                Boolean bool = (Boolean) this.c;
                l0 l0Var4 = (l0) this.d;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(i8Var2.getParentActivity(), 0, i8Var2.getResourceProvider());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new b8(i8Var2, bool, l0Var4, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new ql0(28, i8Var2, bool));
                alertDialog$Builder2.p();
                break;
        }
    }

    public /* synthetic */ h(Utilities.Callback2 callback2, Serializable serializable, Serializable serializable2, int i10) {
        this.a = i10;
        this.d = callback2;
        this.b = serializable;
        this.c = serializable2;
    }

    public /* synthetic */ h(l0 l0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.a = 0;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = callback2;
    }
}
