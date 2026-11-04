package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e51;
import org.telegram.ui.hb0;
import org.telegram.ui.xt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0230  */
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i3 = this.a;
        int i10 = 8;
        str = "NULL_ERROR";
        TL_toncenter.onrampProviderInfo onrampproviderinfo = null;
        boolean z10 = false;
        int i11 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        int i12 = 1;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                k0 k0Var = (k0) obj3;
                String str4 = (String) obj5;
                n10 n10Var = (n10) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i13 = k0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    hp.s1(i13).Y3(useraddresses.users, false);
                    qr.a0(i13).m1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j10 = walletuseraddress.user_id;
                    if (j10 != 0) {
                        k0Var.L.put(Long.valueOf(j10), walletuseraddress);
                    }
                    k0Var.M.put(walletuseraddress.address, walletuseraddress);
                    n10Var.a(walletuseraddress, tL_error != null ? tL_error.text : null);
                    break;
                } else {
                    k0Var.b0(str4, new m(k0Var, n10Var, str4, z10 ? 1 : 0));
                    break;
                }
                break;
            case 1:
                k0 k0Var2 = (k0) obj3;
                j8 j8Var = (j8) obj5;
                f0 f0Var = (f0) obj4;
                h0 h0Var = (h0) obj;
                String str5 = (String) obj2;
                int i14 = k0Var2.a;
                if (h0Var == null) {
                    k0.j("disable backup: no current phrase ".concat(str5 == null ? "NULL_ERROR" : str5));
                    j8Var.a(str5 != null ? str5 : "NULL_ERROR");
                    break;
                } else {
                    k0.H("disable backup: ready!");
                    if (k0Var2.b == null) {
                        k0.j("disable backup: no engine");
                        j8Var.a("NULL_ENGINE");
                        break;
                    } else {
                        String t10 = k0Var2.t();
                        byte[] y9 = k0Var2.y();
                        if (TextUtils.isEmpty(t10)) {
                            k0.j("disable backup: empty address");
                            j8Var.a("NULL_ADDRESS");
                            break;
                        } else if (y9 == null || y9.length <= 0) {
                            k0.j("disable backup: no public key");
                            j8Var.a("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                h0 b10 = f0Var.b.b();
                                j0 B = k0Var2.B();
                                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                                wallettransaction.key_change = true;
                                wallettransaction.incoming = false;
                                wallettransaction.pending = true;
                                wallettransaction.comment = null;
                                wallettransaction.comment_encrypted = false;
                                wallettransaction.date = ConnectionsManager.getInstance(i14).getCurrentTime();
                                wallettransaction.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = t10;
                                wallettransaction.peer = wallettransactionpeeraddress;
                                e7 e7Var = new e7(k0Var2, b10, wallettransaction, B, 4);
                                TL_wallet.sendTransfer sendtransfer = f0Var.a;
                                wallettransaction.gasless = sendtransfer.data_gasless != null;
                                wallettransaction.random_id = sendtransfer.random_id;
                                wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                k0Var2.p.add(0, wallettransaction);
                                B.k();
                                B.i();
                                k0Var2.S();
                                j8Var.a(null);
                                k0.H("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i14).sendRequestTyped(f0Var.a, new c3.b(i12), new ci.g3(k0Var2, e7Var, f0Var, b10, wallettransaction, 5));
                                break;
                            } catch (IllegalStateException unused) {
                                j8Var.a("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 2:
                k0 k0Var3 = (k0) obj3;
                n10 n10Var2 = (n10) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0Var3.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    hp.s1(k0Var3.a).Y3(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j11 = walletuseraddress2.user_id;
                    if (j11 != 0) {
                        long j12 = user.id;
                        if (j11 == j12) {
                            k0Var3.L.put(Long.valueOf(j12), walletuseraddress2);
                            k0Var3.M.put(walletuseraddress2.address, walletuseraddress2);
                            n10Var2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    n10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                } else {
                    n10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new xt0((k0) obj3, (h0) obj, (org.telegram.ui.ActionBar.s1) obj5, (d) obj4, (String) obj2, 4));
                break;
            case 4:
                k0 k0Var4 = (k0) obj3;
                m mVar = (m) obj4;
                String str6 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactions.transactions.get(0);
                    k0Var4.K.put(str6, wallettransaction2);
                    mVar.a(wallettransaction2);
                    break;
                } else {
                    mVar.a(null);
                    break;
                }
                break;
            case 5:
                q qVar = (q) obj3;
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                h0 h0Var2 = (h0) obj;
                String str9 = (String) obj2;
                if (h0Var2 == null) {
                    k0.j("decrypting transaction comment, failed to get secret phrase");
                    qVar.a(null, str9 != null ? str9 : "NULL_ERROR");
                    break;
                } else {
                    try {
                        qVar.a(WalletEngine2.decryptComment(h0Var2, str7, str8), null);
                        break;
                    } catch (Exception e10) {
                        k0.k("failed to decrypt comment", e10);
                        qVar.a(null, e10.getMessage() != null ? e10.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 6:
                k0 k0Var5 = (k0) obj3;
                u10 u10Var = (u10) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                h0 h0Var3 = (h0) obj;
                String str10 = (String) obj2;
                if (str10 == null && h0Var3 != null) {
                    o0 o0Var = k0Var5.c;
                    if (o0Var != null) {
                        if (!TextUtils.equals(o0Var.c, tL_walletState.address)) {
                            u10Var.a("STORAGE_CHANGED");
                            break;
                        } else {
                            k0Var5.c.p(h10.i(k0Var5.a).e(), tL_walletState.public_key, h0Var3, new e51(2, h0Var3.b(), u10Var));
                            break;
                        }
                    } else {
                        u10Var.a("STORAGE_NULL");
                        break;
                    }
                } else {
                    if (str10 == null) {
                        str10 = "LOCAL_STORAGE_ERROR";
                    }
                    u10Var.a(str10);
                    break;
                }
            case 7:
                k0 k0Var6 = (k0) obj3;
                e51 e51Var = (e51) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(k0Var6.a).sendRequestTyped(enablebackup, new c3.b(i12), new ai.q4(27, k0Var6, e51Var));
                    break;
                } else {
                    e51Var.a(str11 != null ? str11 : "NULL_ERROR");
                    break;
                }
            case 8:
                c2 c2Var = (c2) obj3;
                e51 e51Var2 = (e51) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c2Var.getClass();
                Arrays.fill(((z1) obj5).b, (byte) 0);
                e51Var2.a((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : c2.z(tL_error3, "submitConnectResult"));
                if (c2Var.e < 0) {
                    c2Var.e = c2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new c3.b(i12), new d(c2Var, 4));
                    break;
                }
                break;
            case 9:
                c2 c2Var2 = (c2) obj3;
                y1 y1Var = (y1) obj5;
                mi.c cVar = (mi.c) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                c2Var2.getClass();
                if (!y1Var.n && !c2Var2.j(y1Var) && c2Var2.A(y1Var) && wallettransaction3 != null && wallettransaction3.traceSucceeded && !wallettransaction3.traceIncomplete) {
                    z10 = true;
                }
                y1Var.p = z10;
                cVar.a(wallettransaction3, obj6);
                break;
            case 10:
                u10 u10Var2 = (u10) obj5;
                k0 k0Var7 = (k0) obj3;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj4;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error4 == null || (str2 = tL_error4.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    u10Var2.a(str2);
                    if (tL_error4 != null && (str3 = tL_error4.text) != null) {
                        str = str3;
                    }
                    fc.b0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    u10Var2.a("NO_PROVIDERS");
                    fc.b0("NO_PROVIDERS");
                    break;
                } else {
                    ArrayList<T> arrayList = vector.objects;
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj7 = arrayList.get(i11);
                        i11++;
                        TL_toncenter.onrampProviderInfo onrampproviderinfo2 = (TL_toncenter.onrampProviderInfo) obj7;
                        if (onrampproviderinfo2.supports_base_currencies && (onrampproviderinfo2.crypto_currencies.contains("GRAM") || onrampproviderinfo2.crypto_currencies.contains("gram"))) {
                            onrampproviderinfo = onrampproviderinfo2;
                            if (onrampproviderinfo == null) {
                                TL_toncenter.createOnrampSession createonrampsession = new TL_toncenter.createOnrampSession();
                                createonrampsession.address = k0Var7.t();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = k0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new c3.b(i12), new d(u10Var2, i10));
                                break;
                            } else {
                                u10Var2.a("NO_SUITABLE_PROVIDER");
                                fc.b0("NO_SUITABLE_PROVIDER");
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo == null) {
                    }
                }
                break;
            default:
                final n8 n8Var = (n8) obj5;
                final k0 k0Var8 = (k0) obj3;
                final Long l10 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.s1) obj4).dismiss();
                if (l10 != null) {
                    Activity parentActivity = n8Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(1, parentActivity, n8Var.getResourceProvider());
                        int i15 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(n8Var.getThemedColor(i15), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
                        org.telegram.ui.ActionBar.e6 resourceProvider = n8Var.getResourceProvider();
                        c2Var3.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(c2Var3, h02, null, N, resourceProvider);
                        c2Var3.e(bd.M0(2131742979, null), "", false, false, false);
                        c2Var3.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var3.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (bd.a0 ? 5 : 3) | 16;
                        c2Var3.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var3.setPadding(bd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, n8Var.getResourceProvider());
                        textView.setGravity(17);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i16 = org.telegram.ui.ActionBar.k6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, n8Var.getThemedColor(i16));
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                        org.telegram.ui.ActionBar.e6 resourceProvider2 = n8Var.getResourceProvider();
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.r6.k(textView, d02, N2, null, resourceProvider2);
                        textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setText(l10.longValue() > 0 ? bd.V(null, null, 2131742977, k0.n(l10.longValue(), false), k0Var8.m(l10.longValue(), true)) : bd.M0(2131742978, null));
                        textView.setVisibility(8);
                        c2Var3.setOnClickListener(new hb0(28, c2Var3, textView));
                        LinearLayout e11 = org.telegram.messenger.k5.e(parentActivity, 1);
                        e11.addView(c2Var3, mf.t(-1, -2, 83, 8, 0, 8, 0));
                        e11.addView(textView, mf.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, n8Var.getResourceProvider());
                        String M0 = bd.M0(2131743141, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = bd.M0(2131743142, null);
                        s1Var.H = 6;
                        alertDialog$Builder.o(e11);
                        s1Var.a = org.telegram.messenger.g0.L(312.0f);
                        alertDialog$Builder.h(bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(bd.M0(2131743146, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.Wallet.k8
                            @Override // org.telegram.ui.ActionBar.p1
                            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i17) {
                                org.telegram.ui.Cells.c2 c2Var4 = c2Var3;
                                if (c2Var4.isEnabled()) {
                                    boolean b11 = c2Var4.b();
                                    c2Var4.setEnabled(false);
                                    sf.b h = s1Var2.h(i17, true, true);
                                    h.d();
                                    n8 n8Var2 = n8.this;
                                    k0 k0Var9 = k0Var8;
                                    if (!b11) {
                                        k0Var9.z(new g8(n8Var2, h, k0Var9, 0), false, true);
                                        return;
                                    }
                                    long v = k0Var9.v();
                                    Long l11 = l10;
                                    if (v >= l11.longValue()) {
                                        g8 g8Var = new g8(n8Var2, h, k0Var9, 1);
                                        k0.H("prepare disable backup");
                                        k0Var9.z(new ai.q4(25, k0Var9, g8Var), true, false);
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, n8Var2.getParentActivity(), n8Var2.getResourceProvider());
                                    String M02 = bd.M0(2131743076, null);
                                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder2.a;
                                    s1Var3.S = M02;
                                    s1Var3.U = bd.V(null, null, 2131742976, k0.n(l11.longValue(), false), k0Var9.m(l11.longValue(), true));
                                    alertDialog$Builder2.h(bd.M0(2131743074, null), new u9.j(20));
                                    alertDialog$Builder2.k(bd.M0(2131743000, null), new c3(n8Var2, 6));
                                    alertDialog$Builder2.p();
                                }
                            }
                        });
                        n8Var.showDialog(s1Var);
                        TextView textView2 = (TextView) s1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, s1Var.l1);
                            break;
                        }
                    }
                } else {
                    fc.a0(n8Var).e0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(u10 u10Var, k0 k0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.c = u10Var;
        this.b = k0Var;
        this.d = connectionsManager;
    }

    public /* synthetic */ j(k0 k0Var, Object obj, Object obj2, int i3) {
        this.a = i3;
        this.b = k0Var;
        this.d = obj;
        this.c = obj2;
    }

    public /* synthetic */ j(k0 k0Var, q qVar, String str, String str2) {
        this.a = 5;
        this.b = qVar;
        this.c = str;
        this.d = str2;
    }

    public /* synthetic */ j(n8 n8Var, org.telegram.ui.ActionBar.s1 s1Var, k0 k0Var) {
        this.a = 11;
        this.c = n8Var;
        this.d = s1Var;
        this.b = k0Var;
    }
}
