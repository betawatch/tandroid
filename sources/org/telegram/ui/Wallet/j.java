package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.o01;
import org.telegram.ui.xd0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228  */
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
                l0 l0Var = (l0) obj3;
                String str4 = (String) obj5;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i13 = l0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    MessagesController.getInstance(i13).putUsers(useraddresses.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j10 = walletuseraddress.user_id;
                    if (j10 != 0) {
                        l0Var.L.put(Long.valueOf(j10), walletuseraddress);
                    }
                    l0Var.M.put(walletuseraddress.address, walletuseraddress);
                    callback2.run(walletuseraddress, tL_error != null ? tL_error.text : null);
                    break;
                } else {
                    l0Var.Z(str4, new o(l0Var, callback2, str4, i12));
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = (l0) obj3;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0Var2.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    MessagesController.getInstance(l0Var2.a).putUsers(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j11 = walletuseraddress2.user_id;
                    if (j11 != 0) {
                        long j12 = user.id;
                        if (j11 == j12) {
                            l0Var2.L.put(Long.valueOf(j12), walletuseraddress2);
                            l0Var2.M.put(walletuseraddress2.address, walletuseraddress2);
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
                l0 l0Var3 = (l0) obj3;
                o oVar = (o) obj4;
                String str5 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    l0Var3.K.put(str5, wallettransaction);
                    oVar.run(wallettransaction);
                    break;
                } else {
                    oVar.run(null);
                    break;
                }
            case 3:
                p pVar = (p) obj3;
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                i0 i0Var = (i0) obj;
                String str8 = (String) obj2;
                if (i0Var == null) {
                    l0.i("decrypting transaction comment, failed to get secret phrase");
                    pVar.run(null, str8 != null ? str8 : "NULL_ERROR");
                    break;
                } else {
                    try {
                        pVar.run(WalletEngine2.decryptComment(i0Var, str6, str7), null);
                        break;
                    } catch (Exception e) {
                        l0.j("failed to decrypt comment", e);
                        pVar.run(null, e.getMessage() != null ? e.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 4:
                l0 l0Var4 = (l0) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                i0 i0Var2 = (i0) obj;
                String str9 = (String) obj2;
                if (str9 == null && i0Var2 != null) {
                    p0 p0Var = l0Var4.c;
                    if (p0Var != null) {
                        if (!TextUtils.equals(p0Var.c, tL_walletState.address)) {
                            callback.run("STORAGE_CHANGED");
                            break;
                        } else {
                            l0Var4.c.p(UserConfig.getInstance(l0Var4.a).getClientUserId(), tL_walletState.public_key, i0Var2, new oy(29, i0Var2.b(), callback));
                            break;
                        }
                    } else {
                        callback.run("STORAGE_NULL");
                        break;
                    }
                } else {
                    if (str9 == null) {
                        str9 = "LOCAL_STORAGE_ERROR";
                    }
                    callback.run(str9);
                    break;
                }
            case 5:
                l0 l0Var5 = (l0) obj3;
                d8 d8Var = (d8) obj5;
                g0 g0Var = (g0) obj4;
                i0 i0Var3 = (i0) obj;
                String str10 = (String) obj2;
                int i14 = l0Var5.a;
                if (i0Var3 == null) {
                    l0.i("disable backup: no current phrase ".concat(str10 == null ? "NULL_ERROR" : str10));
                    d8Var.run(str10 != null ? str10 : "NULL_ERROR");
                    break;
                } else {
                    l0.F("disable backup: ready!");
                    if (l0Var5.b == null) {
                        l0.i("disable backup: no engine");
                        d8Var.run("NULL_ENGINE");
                        break;
                    } else {
                        String s10 = l0Var5.s();
                        byte[] x9 = l0Var5.x();
                        if (TextUtils.isEmpty(s10)) {
                            l0.i("disable backup: empty address");
                            d8Var.run("NULL_ADDRESS");
                            break;
                        } else if (x9 == null || x9.length <= 0) {
                            l0.i("disable backup: no public key");
                            d8Var.run("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                i0 b10 = g0Var.b.b();
                                k0 A = l0Var5.A();
                                TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                                wallettransaction2.key_change = true;
                                wallettransaction2.incoming = false;
                                wallettransaction2.pending = true;
                                wallettransaction2.comment = null;
                                wallettransaction2.comment_encrypted = false;
                                wallettransaction2.date = ConnectionsManager.getInstance(i14).getCurrentTime();
                                wallettransaction2.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = s10;
                                wallettransaction2.peer = wallettransactionpeeraddress;
                                w6 w6Var = new w6(l0Var5, b10, wallettransaction2, A, 5);
                                TL_wallet.sendTransfer sendtransfer = g0Var.a;
                                wallettransaction2.gasless = sendtransfer.data_gasless != null;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                l0Var5.p.add(0, wallettransaction2);
                                A.k();
                                A.i();
                                l0Var5.Q();
                                d8Var.run(null);
                                l0.F("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i14).sendRequestTyped(g0Var.a, new org.telegram.messenger.a(), new bi.t3(l0Var5, w6Var, g0Var, b10, wallettransaction2, 4));
                                break;
                            } catch (IllegalStateException unused) {
                                d8Var.run("CANCELLED");
                                return;
                            }
                        }
                    }
                }
            case 6:
                AndroidUtilities.runOnUIThread(new o01(obj3, obj, obj5, obj4, (String) obj2, 3));
                break;
            case 7:
                l0 l0Var6 = (l0) obj3;
                s sVar = (s) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(l0Var6.a).sendRequestTyped(enablebackup, new org.telegram.messenger.a(), new bi.m5(26, l0Var6, sVar));
                    break;
                } else {
                    sVar.run(str11 != null ? str11 : "NULL_ERROR");
                    break;
                }
            case 8:
                e2 e2Var = (e2) obj3;
                s sVar2 = (s) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                Arrays.fill(((b2) obj5).b, (byte) 0);
                sVar2.run((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : e2.x(tL_error3, "submitConnectResult"));
                if (e2Var.e < 0) {
                    e2Var.e = e2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new org.telegram.messenger.a(), new d(e2Var, 4));
                    break;
                }
                break;
            case 9:
                e2 e2Var2 = (e2) obj3;
                a2 a2Var = (a2) obj5;
                li.c cVar = (li.c) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                e2Var2.getClass();
                a2Var.p = (a2Var.n || e2Var2.i(a2Var) || !e2Var2.y(a2Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                cVar.run(wallettransaction3, obj6);
                break;
            case 10:
                Utilities.Callback callback3 = (Utilities.Callback) obj5;
                l0 l0Var7 = (l0) obj3;
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
                    wc.c0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    callback3.run("NO_PROVIDERS");
                    wc.c0("NO_PROVIDERS");
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
                                createonrampsession.address = l0Var7.s();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = l0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new org.telegram.messenger.a(), new d(callback3, i11));
                                break;
                            } else {
                                callback3.run("NO_SUITABLE_PROVIDER");
                                wc.c0("NO_SUITABLE_PROVIDER");
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo == null) {
                    }
                }
                break;
            default:
                final h8 h8Var = (h8) obj5;
                final l0 l0Var8 = (l0) obj3;
                final Long l4 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.e2) obj4).dismiss();
                if (l4 != null) {
                    Activity parentActivity = h8Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, h8Var.getResourceProvider());
                        int i15 = org.telegram.ui.ActionBar.y6.i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(h8Var.getThemedColor(i15), 7, AndroidUtilities.dp(12.0f));
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
                        org.telegram.ui.ActionBar.u6 resourceProvider = h8Var.getResourceProvider();
                        y1Var.setBackground(g02);
                        org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, resourceProvider);
                        y1Var.e(LocaleController.getString(R.string.WalletUpdateSecretPhrase), "", false, false, false);
                        y1Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                        y1Var.getCheckBoxView().setLayoutParams(layoutParams);
                        y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, h8Var.getResourceProvider());
                        textView.setGravity(17);
                        int dp = AndroidUtilities.dp(10.0f);
                        int i16 = org.telegram.ui.ActionBar.y6.a7;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, h8Var.getThemedColor(i16));
                        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i16);
                        org.telegram.ui.ActionBar.u6 resourceProvider2 = h8Var.getResourceProvider();
                        textView.setBackground(c02);
                        org.telegram.ui.ActionBar.f7.k(textView, c02, N2, null, resourceProvider2);
                        textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                        textView.setText(l4.longValue() > 0 ? LocaleController.formatSpannable(R.string.WalletUpdateSecretPhraseInfoWithFee, l0.m(l4.longValue(), false), l0Var8.l(l4.longValue(), true)) : LocaleController.getString(R.string.WalletUpdateSecretPhraseInfo));
                        textView.setVisibility(8);
                        y1Var.setOnClickListener(new xd0(28, y1Var, textView));
                        LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
                        f7.addView(y1Var, gb1.x(-1, -2, 83, 8, 0, 8, 0));
                        f7.addView(textView, gb1.o(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, h8Var.getResourceProvider());
                        String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                        org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder.a;
                        e2Var3.R = string;
                        e2Var3.T = LocaleController.getString(R.string.WalletDisableBackupInfo);
                        e2Var3.G = 6;
                        alertDialog$Builder.o(f7);
                        e2Var3.a = AndroidUtilities.dp(312.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.Wallet.e8
                            @Override // org.telegram.ui.ActionBar.b2
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i17) {
                                org.telegram.ui.Cells.y1 y1Var2 = y1Var;
                                if (y1Var2.isEnabled()) {
                                    boolean b11 = y1Var2.b();
                                    y1Var2.setEnabled(false);
                                    qf.c h = e2Var4.h(i17, true, true);
                                    h.d();
                                    h8 h8Var2 = h8.this;
                                    l0 l0Var9 = l0Var8;
                                    if (!b11) {
                                        l0Var9.y(new z7(h8Var2, h, l0Var9, 0), false, true);
                                        return;
                                    }
                                    long u10 = l0Var9.u();
                                    Long l10 = l4;
                                    if (u10 >= l10.longValue()) {
                                        z7 z7Var = new z7(h8Var2, h, l0Var9, 1);
                                        l0.F("prepare disable backup");
                                        l0Var9.y(new bi.m5(25, l0Var9, z7Var), true, false);
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h8Var2.getParentActivity(), 0, h8Var2.getResourceProvider());
                                    String string2 = LocaleController.getString(R.string.WalletNotEnoughGram);
                                    org.telegram.ui.ActionBar.e2 e2Var5 = alertDialog$Builder2.a;
                                    e2Var5.R = string2;
                                    e2Var5.T = LocaleController.formatSpannable(R.string.WalletUpdateSecretPhraseInsufficientFunds, l0.m(l10.longValue(), false), l0Var9.l(l10.longValue(), true));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.WalletNotNow), new vg.d(0));
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.WalletTopUp), new n2(h8Var2, 6));
                                    alertDialog$Builder2.p();
                                }
                            }
                        });
                        h8Var.showDialog(e2Var3);
                        TextView textView2 = (TextView) e2Var3.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, e2Var3.k1);
                            break;
                        }
                    }
                } else {
                    wc.b0(h8Var).f0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(Utilities.Callback callback, l0 l0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.d = callback;
        this.b = l0Var;
        this.c = connectionsManager;
    }

    public /* synthetic */ j(l0 l0Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = l0Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ j(l0 l0Var, p pVar, String str, String str2) {
        this.a = 3;
        this.b = pVar;
        this.d = str;
        this.c = str2;
    }

    public /* synthetic */ j(h8 h8Var, org.telegram.ui.ActionBar.e2 e2Var, l0 l0Var) {
        this.a = 11;
        this.d = h8Var;
        this.c = e2Var;
        this.b = l0Var;
    }
}
