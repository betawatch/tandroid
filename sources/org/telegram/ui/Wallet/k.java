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
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ef0;
import org.telegram.ui.i01;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i10 = this.a;
        int i11 = 27;
        int i12 = 8;
        str = "NULL_ERROR";
        TL_toncenter.onrampProviderInfo onrampproviderinfo = null;
        int i13 = 0;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj3;
                String str4 = (String) obj5;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i14 = m0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    MessagesController.getInstance(i14).putUsers(useraddresses.users, false);
                    MessagesStorage.getInstance(i14).putUsersAndChats(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j10 = walletuseraddress.user_id;
                    if (j10 != 0) {
                        m0Var.L.put(Long.valueOf(j10), walletuseraddress);
                    }
                    m0Var.M.put(walletuseraddress.address, walletuseraddress);
                    callback2.run(walletuseraddress, tL_error != null ? tL_error.text : null);
                    break;
                } else {
                    m0Var.Z(str4, new p(m0Var, callback2, str4, i13));
                    break;
                }
                break;
            case 1:
                m0 m0Var2 = (m0) obj3;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m0Var2.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    MessagesController.getInstance(m0Var2.a).putUsers(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j11 = walletuseraddress2.user_id;
                    if (j11 != 0) {
                        long j12 = user.id;
                        if (j11 == j12) {
                            m0Var2.L.put(Long.valueOf(j12), walletuseraddress2);
                            m0Var2.M.put(walletuseraddress2.address, walletuseraddress2);
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
                m0 m0Var3 = (m0) obj3;
                p pVar = (p) obj4;
                String str5 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    m0Var3.K.put(str5, wallettransaction);
                    pVar.run(wallettransaction);
                    break;
                } else {
                    pVar.run(null);
                    break;
                }
            case 3:
                q qVar = (q) obj3;
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                j0 j0Var = (j0) obj;
                String str8 = (String) obj2;
                if (j0Var == null) {
                    m0.i("decrypting transaction comment, failed to get secret phrase");
                    qVar.run(null, str8 != null ? str8 : "NULL_ERROR");
                    break;
                } else {
                    try {
                        qVar.run(WalletEngine2.decryptComment(j0Var, str6, str7), null);
                        break;
                    } catch (Exception e) {
                        m0.j("failed to decrypt comment", e);
                        qVar.run(null, e.getMessage() != null ? e.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 4:
                m0 m0Var4 = (m0) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                j0 j0Var2 = (j0) obj;
                String str9 = (String) obj2;
                if (str9 == null && j0Var2 != null) {
                    q0 q0Var = m0Var4.c;
                    if (q0Var != null) {
                        if (!TextUtils.equals(q0Var.c, tL_walletState.address)) {
                            callback.run("STORAGE_CHANGED");
                            break;
                        } else {
                            m0Var4.c.p(UserConfig.getInstance(m0Var4.a).getClientUserId(), tL_walletState.public_key, j0Var2, new qy(i11, j0Var2.b(), callback));
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
                m0 m0Var5 = (m0) obj3;
                g8 g8Var = (g8) obj5;
                h0 h0Var = (h0) obj4;
                j0 j0Var3 = (j0) obj;
                String str10 = (String) obj2;
                int i15 = m0Var5.a;
                if (j0Var3 == null) {
                    m0.i("disable backup: no current phrase ".concat(str10 == null ? "NULL_ERROR" : str10));
                    g8Var.run(str10 != null ? str10 : "NULL_ERROR");
                    break;
                } else {
                    m0.F("disable backup: ready!");
                    if (m0Var5.b == null) {
                        m0.i("disable backup: no engine");
                        g8Var.run("NULL_ENGINE");
                        break;
                    } else {
                        String s10 = m0Var5.s();
                        byte[] x10 = m0Var5.x();
                        if (TextUtils.isEmpty(s10)) {
                            m0.i("disable backup: empty address");
                            g8Var.run("NULL_ADDRESS");
                            break;
                        } else if (x10 == null || x10.length <= 0) {
                            m0.i("disable backup: no public key");
                            g8Var.run("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                j0 b10 = h0Var.b.b();
                                l0 A = m0Var5.A();
                                TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                                wallettransaction2.key_change = true;
                                wallettransaction2.incoming = false;
                                wallettransaction2.pending = true;
                                wallettransaction2.comment = null;
                                wallettransaction2.comment_encrypted = false;
                                wallettransaction2.date = ConnectionsManager.getInstance(i15).getCurrentTime();
                                wallettransaction2.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = s10;
                                wallettransaction2.peer = wallettransactionpeeraddress;
                                z6 z6Var = new z6(m0Var5, b10, wallettransaction2, A, 5);
                                boolean z10 = true;
                                TL_wallet.sendTransfer sendtransfer = h0Var.a;
                                if (sendtransfer.data_gasless == null) {
                                    z10 = false;
                                }
                                wallettransaction2.gasless = z10;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                m0Var5.p.add(0, wallettransaction2);
                                A.j();
                                A.h();
                                m0Var5.Q();
                                g8Var.run(null);
                                m0.F("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i15).sendRequestTyped(h0Var.a, new org.telegram.messenger.a(), new ai.t3(m0Var5, z6Var, h0Var, b10, wallettransaction2, 4));
                                break;
                            } catch (IllegalStateException unused) {
                                g8Var.run("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new i01(obj3, obj, obj5, obj4, (String) obj2, 3));
                break;
            case 7:
                m0 m0Var6 = (m0) obj3;
                qy qyVar = (qy) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(m0Var6.a).sendRequestTyped(enablebackup, new org.telegram.messenger.a(), new ai.q5(26, m0Var6, qyVar));
                    break;
                } else {
                    qyVar.run(str11 != null ? str11 : "NULL_ERROR");
                    break;
                }
            case 8:
                f2 f2Var = (f2) obj3;
                x xVar = (x) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f2Var.getClass();
                Arrays.fill(((c2) obj5).b, (byte) 0);
                xVar.run((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : f2.x(tL_error3, "submitConnectResult"));
                if (f2Var.e < 0) {
                    f2Var.e = f2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new org.telegram.messenger.a(), new d(f2Var, 4));
                    break;
                }
                break;
            case 9:
                f2 f2Var2 = (f2) obj3;
                b2 b2Var = (b2) obj5;
                ki.c cVar = (ki.c) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                f2Var2.getClass();
                b2Var.p = (b2Var.n || f2Var2.i(b2Var) || !f2Var2.y(b2Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                cVar.run(wallettransaction3, obj6);
                break;
            case 10:
                Utilities.Callback callback3 = (Utilities.Callback) obj5;
                m0 m0Var7 = (m0) obj3;
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
                    xc.b0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    callback3.run("NO_PROVIDERS");
                    xc.b0("NO_PROVIDERS");
                    break;
                } else {
                    ArrayList<T> arrayList = vector.objects;
                    int size = arrayList.size();
                    while (i13 < size) {
                        Object obj7 = arrayList.get(i13);
                        i13++;
                        TL_toncenter.onrampProviderInfo onrampproviderinfo2 = (TL_toncenter.onrampProviderInfo) obj7;
                        if (onrampproviderinfo2.supports_base_currencies && (onrampproviderinfo2.crypto_currencies.contains("GRAM") || onrampproviderinfo2.crypto_currencies.contains("gram"))) {
                            onrampproviderinfo = onrampproviderinfo2;
                            if (onrampproviderinfo == null) {
                                TL_toncenter.createOnrampSession createonrampsession = new TL_toncenter.createOnrampSession();
                                createonrampsession.address = m0Var7.s();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = m0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new org.telegram.messenger.a(), new d(callback3, i12));
                                break;
                            } else {
                                callback3.run("NO_SUITABLE_PROVIDER");
                                xc.b0("NO_SUITABLE_PROVIDER");
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo == null) {
                    }
                }
                break;
            default:
                final k8 k8Var = (k8) obj5;
                final m0 m0Var8 = (m0) obj3;
                final Long l4 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (l4 != null) {
                    Activity parentActivity = k8Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(parentActivity, 1, k8Var.getResourceProvider());
                        a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.i6), 7, AndroidUtilities.dp(12.0f)));
                        a2Var.e(LocaleController.getString(R.string.WalletUpdateSecretPhrase), "", false, false, false);
                        a2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
                        a2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.j5));
                        textView.setGravity(17);
                        textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7)));
                        textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                        textView.setText(l4.longValue() > 0 ? LocaleController.formatSpannable(R.string.WalletUpdateSecretPhraseInfoWithFee, m0.m(l4.longValue(), false), m0Var8.l(l4.longValue(), true)) : LocaleController.getString(R.string.WalletUpdateSecretPhraseInfo));
                        textView.setVisibility(8);
                        a2Var.setOnClickListener(new ef0(i11, a2Var, textView));
                        LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
                        e7.addView(a2Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
                        e7.addView(textView, w7.z5.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, k8Var.getResourceProvider());
                        String string = LocaleController.getString(R.string.WalletDisableBackupTitle);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                        b2Var2.R = string;
                        b2Var2.T = LocaleController.getString(R.string.WalletDisableBackupInfo);
                        b2Var2.G = 6;
                        alertDialog$Builder.n(e7);
                        b2Var2.a = AndroidUtilities.dp(312.0f);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.Wallet.h8
                            @Override // org.telegram.ui.ActionBar.a2
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var3, int i16) {
                                org.telegram.ui.Cells.a2 a2Var2 = a2Var;
                                if (a2Var2.isEnabled()) {
                                    boolean b11 = a2Var2.b();
                                    a2Var2.setEnabled(false);
                                    pf.c g10 = b2Var3.g(i16, true, true);
                                    g10.d();
                                    k8 k8Var2 = k8.this;
                                    m0 m0Var9 = m0Var8;
                                    if (!b11) {
                                        m0Var9.y(new c8(k8Var2, g10, m0Var9, 0), false, true);
                                        return;
                                    }
                                    long u10 = m0Var9.u();
                                    Long l10 = l4;
                                    if (u10 >= l10.longValue()) {
                                        c8 c8Var = new c8(k8Var2, g10, m0Var9, 1);
                                        m0.F("prepare disable backup");
                                        m0Var9.y(new ai.q5(25, m0Var9, c8Var), true, false);
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k8Var2.getParentActivity(), 0, k8Var2.getResourceProvider());
                                    String string2 = LocaleController.getString(R.string.WalletNotEnoughGram);
                                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder2.a;
                                    b2Var4.R = string2;
                                    b2Var4.T = LocaleController.formatSpannable(R.string.WalletUpdateSecretPhraseInsufficientFunds, m0.m(l10.longValue(), false), m0Var9.l(l10.longValue(), true));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.WalletNotNow), new si.a(11));
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.WalletTopUp), new o2(k8Var2, 6));
                                    alertDialog$Builder2.o();
                                }
                            }
                        });
                        k8Var.showDialog(b2Var2);
                        TextView textView2 = (TextView) b2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(b2Var2.e(org.telegram.ui.ActionBar.h6.q7));
                            break;
                        }
                    }
                } else {
                    xc.a0(k8Var).e0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k(Utilities.Callback callback, m0 m0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.d = callback;
        this.b = m0Var;
        this.c = connectionsManager;
    }

    public /* synthetic */ k(m0 m0Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = m0Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ k(m0 m0Var, q qVar, String str, String str2) {
        this.a = 3;
        this.b = qVar;
        this.d = str;
        this.c = str2;
    }

    public /* synthetic */ k(k8 k8Var, org.telegram.ui.ActionBar.b2 b2Var, m0 m0Var) {
        this.a = 11;
        this.d = k8Var;
        this.c = b2Var;
        this.b = m0Var;
    }
}
