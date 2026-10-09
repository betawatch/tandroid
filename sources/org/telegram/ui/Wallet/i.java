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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.df;
import org.telegram.ui.ft;
import org.telegram.ui.g90;
import org.telegram.ui.vy0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                k0 k0Var = (k0) obj3;
                String str4 = (String) obj5;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i13 = k0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    MessagesController.getInstance(i13).putUsers(useraddresses.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j3 = walletuseraddress.user_id;
                    if (j3 != 0) {
                        k0Var.H.put(Long.valueOf(j3), walletuseraddress);
                    }
                    k0Var.I.put(walletuseraddress.address, walletuseraddress);
                    callback2.run(walletuseraddress, tL_error != null ? tL_error.text : null);
                    break;
                } else {
                    k0Var.X(str4, new o(k0Var, callback2, str4, i12));
                    break;
                }
                break;
            case 1:
                k0 k0Var2 = (k0) obj3;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0Var2.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    MessagesController.getInstance(k0Var2.a).putUsers(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j10 = walletuseraddress2.user_id;
                    if (j10 != 0) {
                        long j11 = user.id;
                        if (j10 == j11) {
                            k0Var2.H.put(Long.valueOf(j11), walletuseraddress2);
                            k0Var2.I.put(walletuseraddress2.address, walletuseraddress2);
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
                k0 k0Var3 = (k0) obj3;
                o oVar = (o) obj4;
                String str5 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    k0Var3.G.put(str5, wallettransaction);
                    oVar.run(wallettransaction);
                    break;
                } else {
                    oVar.run(null);
                    break;
                }
            case 3:
                k0 k0Var4 = (k0) obj3;
                h7 h7Var = (h7) obj5;
                f0 f0Var = (f0) obj4;
                h0 h0Var = (h0) obj;
                String str6 = (String) obj2;
                int i14 = k0Var4.a;
                if (h0Var == null) {
                    k0.i("disable backup: no current phrase ".concat(str6 == null ? "NULL_ERROR" : str6));
                    h7Var.run(str6 != null ? str6 : "NULL_ERROR");
                    break;
                } else {
                    k0.E("disable backup: ready!");
                    if (k0Var4.b == null) {
                        k0.i("disable backup: no engine");
                        h7Var.run("NULL_ENGINE");
                        break;
                    } else {
                        String r10 = k0Var4.r();
                        byte[] w10 = k0Var4.w();
                        if (TextUtils.isEmpty(r10)) {
                            k0.i("disable backup: empty address");
                            h7Var.run("NULL_ADDRESS");
                            break;
                        } else if (w10 == null || w10.length <= 0) {
                            k0.i("disable backup: no public key");
                            h7Var.run("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                h0 b10 = f0Var.b.b();
                                j0 z10 = k0Var4.z();
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
                                m6 m6Var = new m6(k0Var4, b10, wallettransaction2, z10, 3);
                                boolean z11 = true;
                                TL_wallet.sendTransfer sendtransfer = f0Var.a;
                                if (sendtransfer.data_gasless == null) {
                                    z11 = false;
                                }
                                wallettransaction2.gasless = z11;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                k0Var4.p.add(0, wallettransaction2);
                                z10.h();
                                z10.f();
                                k0Var4.P();
                                h7Var.run(null);
                                k0.E("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i14).sendRequestTyped(f0Var.a, new org.telegram.messenger.a(), new df(k0Var4, m6Var, f0Var, b10, wallettransaction2, 3));
                                break;
                            } catch (IllegalStateException unused) {
                                h7Var.run("CANCELLED");
                                return;
                            }
                        }
                    }
                }
            case 4:
                k0 k0Var5 = (k0) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                h0 h0Var2 = (h0) obj;
                String str7 = (String) obj2;
                if (str7 == null && h0Var2 != null) {
                    p0 p0Var = k0Var5.c;
                    if (p0Var != null) {
                        if (!TextUtils.equals(p0Var.c, tL_walletState.address)) {
                            callback.run("STORAGE_CHANGED");
                            break;
                        } else {
                            k0Var5.c.p(UserConfig.getInstance(k0Var5.a).getClientUserId(), tL_walletState.public_key, h0Var2, new ft(21, h0Var2.b(), callback));
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
                h0 h0Var3 = (h0) obj;
                String str10 = (String) obj2;
                if (h0Var3 == null) {
                    k0.i("decrypting transaction comment, failed to get secret phrase");
                    nVar.run(null, str10 != null ? str10 : "NULL_ERROR");
                    break;
                } else {
                    try {
                        nVar.run(WalletEngine2.decryptComment(h0Var3, str8, str9), null);
                        break;
                    } catch (Exception e7) {
                        k0.j("failed to decrypt comment", e7);
                        nVar.run(null, e7.getMessage() != null ? e7.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new g90((k0) obj3, (h0) obj, (org.telegram.ui.ActionBar.b2) obj5, (d) obj4, (String) obj2, 25));
                break;
            case 7:
                k0 k0Var6 = (k0) obj3;
                ft ftVar = (ft) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(k0Var6.a).sendRequestTyped(enablebackup, new org.telegram.messenger.a(), new ai.m0(22, k0Var6, ftVar));
                    break;
                } else {
                    ftVar.run(str11 != null ? str11 : "NULL_ERROR");
                    break;
                }
            case 8:
                d2 d2Var = (d2) obj3;
                ft ftVar2 = (ft) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                Arrays.fill(((a2) obj5).b, (byte) 0);
                ftVar2.run((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : d2.x(tL_error3, "submitConnectResult"));
                if (d2Var.e < 0) {
                    d2Var.e = d2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new org.telegram.messenger.a(), new d(d2Var, r3));
                    break;
                }
                break;
            case 9:
                d2 d2Var2 = (d2) obj3;
                z1 z1Var = (z1) obj5;
                ii.c cVar = (ii.c) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                d2Var2.getClass();
                z1Var.p = (z1Var.n || d2Var2.i(z1Var) || !d2Var2.y(z1Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                cVar.run(wallettransaction3, obj6);
                break;
            case 10:
                Utilities.Callback callback3 = (Utilities.Callback) obj5;
                k0 k0Var7 = (k0) obj3;
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
                    ad.b0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    callback3.run("NO_PROVIDERS");
                    ad.b0("NO_PROVIDERS");
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
                                createonrampsession.address = k0Var7.r();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = k0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new org.telegram.messenger.a(), new d(callback3, i11));
                                break;
                            } else {
                                callback3.run("NO_SUITABLE_PROVIDER");
                                ad.b0("NO_SUITABLE_PROVIDER");
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo == null) {
                    }
                }
                break;
            default:
                final l7 l7Var = (l7) obj5;
                final k0 k0Var8 = (k0) obj3;
                final Long l4 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (l4 != null) {
                    Activity parentActivity = l7Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(parentActivity, 1, l7Var.getResourceProvider());
                        a2Var.setBackground(org.telegram.ui.ActionBar.i6.g0(l7Var.getThemedColor(org.telegram.ui.ActionBar.i6.i6), 7, AndroidUtilities.dp(12.0f)));
                        a2Var.e(LocaleController.getString(R.string.WalletUpdateSecretPhrase), "", false, false, false);
                        a2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                        a2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(l7Var.getThemedColor(org.telegram.ui.ActionBar.i6.j5));
                        textView.setGravity(17);
                        textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), l7Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7)));
                        textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                        textView.setText(l4.longValue() > 0 ? LocaleController.formatSpannable(R.string.WalletUpdateSecretPhraseInfoWithFee, k0.m(l4.longValue(), false), k0Var8.l(l4.longValue(), true)) : LocaleController.getString(R.string.WalletUpdateSecretPhraseInfo));
                        textView.setVisibility(8);
                        a2Var.setOnClickListener(new vy0(16, a2Var, textView));
                        LinearLayout e10 = org.telegram.messenger.q.e(parentActivity, 1);
                        e10.addView(a2Var, w7.x5.t(-1, -2, 83, 8, 0, 8, 0));
                        e10.addView(textView, w7.x5.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, l7Var.getResourceProvider());
                        String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.WalletDisableBackupInfo);
                        b2Var.G = 6;
                        alertDialog$Builder.n(e10);
                        b2Var.a = AndroidUtilities.dp(312.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Wallet.i7
                            @Override // org.telegram.ui.ActionBar.a2
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i15) {
                                org.telegram.ui.Cells.a2 a2Var2 = a2Var;
                                if (a2Var2.isEnabled()) {
                                    boolean b11 = a2Var2.b();
                                    int i16 = 0;
                                    a2Var2.setEnabled(false);
                                    int i17 = 1;
                                    of.e g10 = b2Var2.g(i15, true, true);
                                    g10.d();
                                    l7 l7Var2 = l7.this;
                                    k0 k0Var9 = k0Var8;
                                    if (!b11) {
                                        k0Var9.x(new d7(l7Var2, g10, k0Var9, i16), false, true);
                                        return;
                                    }
                                    long t10 = k0Var9.t();
                                    Long l10 = l4;
                                    if (t10 >= l10.longValue()) {
                                        d7 d7Var = new d7(l7Var2, g10, k0Var9, i17);
                                        k0.E("prepare disable backup");
                                        k0Var9.x(new ai.m0(21, k0Var9, d7Var), true, false);
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l7Var2.getParentActivity(), 0, l7Var2.getResourceProvider());
                                    String string2 = LocaleController.getString(R.string.WalletNotEnoughGram);
                                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
                                    b2Var3.R = string2;
                                    b2Var3.T = LocaleController.formatSpannable(R.string.WalletUpdateSecretPhraseInsufficientFunds, k0.m(l10.longValue(), false), k0Var9.l(l10.longValue(), true));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.WalletNotNow), new s0.b(9));
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.WalletTopUp), new m2(1, l7Var2));
                                    alertDialog$Builder2.o();
                                }
                            }
                        });
                        l7Var.showDialog(b2Var);
                        TextView textView2 = (TextView) b2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(b2Var.e(org.telegram.ui.ActionBar.i6.q7));
                            break;
                        }
                    }
                } else {
                    ad.a0(l7Var).e0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i(Utilities.Callback callback, k0 k0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.d = callback;
        this.b = k0Var;
        this.c = connectionsManager;
    }

    public /* synthetic */ i(k0 k0Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = k0Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ i(k0 k0Var, n nVar, String str, String str2) {
        this.a = 5;
        this.b = nVar;
        this.d = str;
        this.c = str2;
    }

    public /* synthetic */ i(l7 l7Var, org.telegram.ui.ActionBar.b2 b2Var, k0 k0Var) {
        this.a = 11;
        this.d = l7Var;
        this.c = b2Var;
        this.b = k0Var;
    }
}
