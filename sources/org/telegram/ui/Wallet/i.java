package org.telegram.ui.Wallet;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bz0;
import org.telegram.ui.kf;
import org.telegram.ui.l90;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i10 = this.a;
        int i11 = 8;
        str = "NULL_ERROR";
        TL_toncenter.onrampProviderInfo onrampproviderinfo = null;
        int i12 = 0;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) obj3;
                String str4 = (String) obj5;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i13 = j0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    MessagesController.getInstance(i13).putUsers(useraddresses.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j10 = walletuseraddress.user_id;
                    if (j10 != 0) {
                        j0Var.H.put(Long.valueOf(j10), walletuseraddress);
                    }
                    j0Var.I.put(walletuseraddress.address, walletuseraddress);
                    callback2.run(walletuseraddress, tL_error != null ? tL_error.text : null);
                    break;
                } else {
                    j0Var.X(str4, new o(j0Var, callback2, str4, i12));
                    break;
                }
                break;
            case 1:
                j0 j0Var2 = (j0) obj3;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                j0Var2.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    MessagesController.getInstance(j0Var2.a).putUsers(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j11 = walletuseraddress2.user_id;
                    if (j11 != 0) {
                        long j12 = user.id;
                        if (j11 == j12) {
                            j0Var2.H.put(Long.valueOf(j12), walletuseraddress2);
                            j0Var2.I.put(walletuseraddress2.address, walletuseraddress2);
                            callback22.run(walletuseraddress2, null);
                            break;
                        }
                    }
                    callback22.run(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                } else {
                    callback22.run(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                }
                break;
            case 2:
                j0 j0Var3 = (j0) obj3;
                o oVar = (o) obj4;
                String str5 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    j0Var3.G.put(str5, wallettransaction);
                    oVar.run(wallettransaction);
                    break;
                } else {
                    oVar.run(null);
                    break;
                }
            case 3:
                j0 j0Var4 = (j0) obj3;
                g7 g7Var = (g7) obj5;
                e0 e0Var = (e0) obj4;
                g0 g0Var = (g0) obj;
                String str6 = (String) obj2;
                int i14 = j0Var4.a;
                if (g0Var == null) {
                    j0.i("disable backup: no current phrase ".concat(str6 == null ? "NULL_ERROR" : str6));
                    g7Var.run(str6 != null ? str6 : "NULL_ERROR");
                    break;
                } else {
                    j0.E("disable backup: ready!");
                    if (j0Var4.b == null) {
                        j0.i("disable backup: no engine");
                        g7Var.run("NULL_ENGINE");
                        break;
                    } else {
                        String r10 = j0Var4.r();
                        byte[] w9 = j0Var4.w();
                        if (TextUtils.isEmpty(r10)) {
                            j0.i("disable backup: empty address");
                            g7Var.run("NULL_ADDRESS");
                            break;
                        } else if (w9 == null || w9.length <= 0) {
                            j0.i("disable backup: no public key");
                            g7Var.run("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                g0 b10 = e0Var.b.b();
                                i0 z10 = j0Var4.z();
                                TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                                wallettransaction2.key_change = true;
                                wallettransaction2.incoming = false;
                                wallettransaction2.pending = true;
                                wallettransaction2.comment = null;
                                wallettransaction2.comment_encrypted = false;
                                wallettransaction2.date = ConnectionsManager.getInstance(i14).getCurrentTime();
                                wallettransaction2.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = r10;
                                wallettransaction2.peer = wallettransactionpeeraddress;
                                l6 l6Var = new l6(j0Var4, b10, wallettransaction2, z10, 3);
                                boolean z11 = true;
                                TL_wallet.sendTransfer sendtransfer = e0Var.a;
                                if (sendtransfer.data_gasless == null) {
                                    z11 = false;
                                }
                                wallettransaction2.gasless = z11;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                j0Var4.p.add(0, wallettransaction2);
                                z10.h();
                                z10.f();
                                j0Var4.P();
                                g7Var.run(null);
                                j0.E("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i14).sendRequestTyped(e0Var.a, new org.telegram.messenger.a(), new kf(j0Var4, l6Var, e0Var, b10, wallettransaction2, 3));
                                break;
                            } catch (IllegalStateException unused) {
                                g7Var.run("CANCELLED");
                                return;
                            }
                        }
                    }
                }
            case 4:
                j0 j0Var5 = (j0) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                g0 g0Var2 = (g0) obj;
                String str7 = (String) obj2;
                if (str7 == null && g0Var2 != null) {
                    o0 o0Var = j0Var5.c;
                    if (o0Var != null) {
                        if (!TextUtils.equals(o0Var.c, tL_walletState.address)) {
                            callback.run("STORAGE_CHANGED");
                            break;
                        } else {
                            j0Var5.c.p(UserConfig.getInstance(j0Var5.a).getClientUserId(), tL_walletState.public_key, g0Var2, new mt(21, g0Var2.b(), callback));
                            break;
                        }
                    } else {
                        callback.run("STORAGE_NULL");
                        break;
                    }
                } else {
                    if (str7 == null) {
                        str7 = "LOCAL_STORAGE_ERROR";
                    }
                    callback.run(str7);
                    break;
                }
            case 5:
                n nVar = (n) obj3;
                String str8 = (String) obj5;
                String str9 = (String) obj4;
                g0 g0Var3 = (g0) obj;
                String str10 = (String) obj2;
                if (g0Var3 == null) {
                    j0.i("decrypting transaction comment, failed to get secret phrase");
                    nVar.run(null, str10 != null ? str10 : "NULL_ERROR");
                    break;
                } else {
                    try {
                        nVar.run(WalletEngine2.decryptComment(g0Var3, str8, str9), null);
                        break;
                    } catch (Exception e) {
                        j0.j("failed to decrypt comment", e);
                        nVar.run(null, e.getMessage() != null ? e.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new l90((j0) obj3, (g0) obj, (org.telegram.ui.ActionBar.a2) obj5, (d) obj4, (String) obj2, 25));
                break;
            case 7:
                j0 j0Var6 = (j0) obj3;
                mt mtVar = (mt) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(j0Var6.a).sendRequestTyped(enablebackup, new org.telegram.messenger.a(), new bi.f0(22, j0Var6, mtVar));
                    break;
                } else {
                    mtVar.run(str11 != null ? str11 : "NULL_ERROR");
                    break;
                }
            case 8:
                d2 d2Var = (d2) obj3;
                mt mtVar2 = (mt) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                Arrays.fill(((a2) obj5).b, (byte) 0);
                mtVar2.run((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : d2.x(tL_error3, "submitConnectResult"));
                if (d2Var.e < 0) {
                    d2Var.e = d2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new org.telegram.messenger.a(), new d(d2Var, r3));
                    break;
                }
                break;
            case 9:
                d2 d2Var2 = (d2) obj3;
                z1 z1Var = (z1) obj5;
                ji.c cVar = (ji.c) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                d2Var2.getClass();
                z1Var.p = (z1Var.n || d2Var2.i(z1Var) || !d2Var2.y(z1Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                cVar.run(wallettransaction3, obj6);
                break;
            case 10:
                Utilities.Callback callback3 = (Utilities.Callback) obj5;
                j0 j0Var7 = (j0) obj3;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj4;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error4 == null || (str2 = tL_error4.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    callback3.run(str2);
                    if (tL_error4 != null && (str3 = tL_error4.text) != null) {
                        str = str3;
                    }
                    zc.b0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    callback3.run("NO_PROVIDERS");
                    zc.b0("NO_PROVIDERS");
                    break;
                } else {
                    ArrayList<T> arrayList = vector.objects;
                    int size = arrayList.size();
                    while (i12 < size) {
                        Object obj7 = arrayList.get(i12);
                        i12++;
                        TL_toncenter.onrampProviderInfo onrampproviderinfo2 = (TL_toncenter.onrampProviderInfo) obj7;
                        if (onrampproviderinfo2.supports_base_currencies && (onrampproviderinfo2.crypto_currencies.contains("GRAM") || onrampproviderinfo2.crypto_currencies.contains("gram"))) {
                            onrampproviderinfo = onrampproviderinfo2;
                            if (onrampproviderinfo == null) {
                                TL_toncenter.createOnrampSession createonrampsession = new TL_toncenter.createOnrampSession();
                                createonrampsession.address = j0Var7.r();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = j0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new org.telegram.messenger.a(), new d(callback3, i11));
                                break;
                            } else {
                                callback3.run("NO_SUITABLE_PROVIDER");
                                zc.b0("NO_SUITABLE_PROVIDER");
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo == null) {
                    }
                }
                break;
            default:
                final k7 k7Var = (k7) obj5;
                final j0 j0Var8 = (j0) obj3;
                final Long l4 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.a2) obj4).dismiss();
                if (l4 != null) {
                    Activity parentActivity = k7Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(parentActivity, 1, k7Var.getResourceProvider());
                        a2Var.setBackground(org.telegram.ui.ActionBar.g6.g0(k7Var.getThemedColor(org.telegram.ui.ActionBar.g6.i6), 7, AndroidUtilities.dp(12.0f)));
                        a2Var.e(LocaleController.getString(R.string.WalletUpdateSecretPhrase), "", false, false, false);
                        a2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                        a2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(k7Var.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
                        textView.setGravity(17);
                        textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), k7Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7)));
                        textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                        textView.setText(l4.longValue() > 0 ? LocaleController.formatSpannable(R.string.WalletUpdateSecretPhraseInfoWithFee, j0.m(l4.longValue(), false), j0Var8.l(l4.longValue(), true)) : LocaleController.getString(R.string.WalletUpdateSecretPhraseInfo));
                        textView.setVisibility(8);
                        a2Var.setOnClickListener(new bz0(16, a2Var, textView));
                        LinearLayout f7 = org.telegram.messenger.q.f(parentActivity, 1);
                        f7.addView(a2Var, w7.a6.t(-1, -2, 83, 8, 0, 8, 0));
                        f7.addView(textView, w7.a6.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, k7Var.getResourceProvider());
                        String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
                        a2Var2.R = string;
                        a2Var2.T = LocaleController.getString(R.string.WalletDisableBackupInfo);
                        a2Var2.G = 6;
                        alertDialog$Builder.n(f7);
                        a2Var2.a = AndroidUtilities.dp(312.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.Wallet.h7
                            @Override // org.telegram.ui.ActionBar.z1
                            public final void g(org.telegram.ui.ActionBar.a2 a2Var3, int i15) {
                                org.telegram.ui.Cells.a2 a2Var4 = a2Var;
                                if (a2Var4.isEnabled()) {
                                    boolean b11 = a2Var4.b();
                                    a2Var4.setEnabled(false);
                                    pf.c g10 = a2Var3.g(i15, true, true);
                                    g10.d();
                                    k7 k7Var2 = k7.this;
                                    j0 j0Var9 = j0Var8;
                                    if (!b11) {
                                        j0Var9.x(new c7(k7Var2, g10, j0Var9, 0), false, true);
                                        return;
                                    }
                                    long t10 = j0Var9.t();
                                    Long l10 = l4;
                                    if (t10 >= l10.longValue()) {
                                        c7 c7Var = new c7(k7Var2, g10, j0Var9, 1);
                                        j0.E("prepare disable backup");
                                        j0Var9.x(new bi.f0(21, j0Var9, c7Var), true, false);
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k7Var2.getParentActivity(), 0, k7Var2.getResourceProvider());
                                    String string2 = LocaleController.getString(R.string.WalletNotEnoughGram);
                                    org.telegram.ui.ActionBar.a2 a2Var5 = alertDialog$Builder2.a;
                                    a2Var5.R = string2;
                                    a2Var5.T = LocaleController.formatSpannable(R.string.WalletUpdateSecretPhraseInsufficientFunds, j0.m(l10.longValue(), false), j0Var9.l(l10.longValue(), true));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.WalletNotNow), new t0.a(8));
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.WalletTopUp), new m2(1, k7Var2));
                                    alertDialog$Builder2.o();
                                }
                            }
                        });
                        k7Var.showDialog(a2Var2);
                        TextView textView2 = (TextView) a2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(a2Var2.e(org.telegram.ui.ActionBar.g6.q7));
                            break;
                        }
                    }
                } else {
                    zc.a0(k7Var).e0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i(Utilities.Callback callback, j0 j0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.d = callback;
        this.b = j0Var;
        this.c = connectionsManager;
    }

    public /* synthetic */ i(j0 j0Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = j0Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ i(j0 j0Var, n nVar, String str, String str2) {
        this.a = 5;
        this.b = nVar;
        this.d = str;
        this.c = str2;
    }

    public /* synthetic */ i(k7 k7Var, org.telegram.ui.ActionBar.a2 a2Var, j0 j0Var) {
        this.a = 11;
        this.d = k7Var;
        this.c = a2Var;
        this.b = j0Var;
    }
}
