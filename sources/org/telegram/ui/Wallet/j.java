package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a90;
import org.telegram.ui.cu0;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    @Override // org.telegram.messenger.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i7 = this.a;
        int i10 = 4;
        int i11 = 8;
        str = "NULL_ERROR";
        TL_toncenter.onrampProviderInfo onrampproviderinfo = null;
        boolean z10 = false;
        int i12 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        int i13 = 1;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) obj3;
                String str4 = (String) obj5;
                s10 s10Var = (s10) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i14 = l0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    np.s1(i14).Y3(useraddresses.users, false);
                    vr.a0(i14).m1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j3 = walletuseraddress.user_id;
                    if (j3 != 0) {
                        l0Var.L.put(Long.valueOf(j3), walletuseraddress);
                    }
                    l0Var.M.put(walletuseraddress.address, walletuseraddress);
                    s10Var.a(walletuseraddress, tL_error != null ? tL_error.text : null);
                    break;
                } else {
                    l0Var.b0(str4, new m(l0Var, s10Var, str4, z10 ? 1 : 0));
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = (l0) obj3;
                l8 l8Var = (l8) obj5;
                g0 g0Var = (g0) obj4;
                i0 i0Var = (i0) obj;
                String str5 = (String) obj2;
                int i15 = l0Var2.a;
                if (i0Var == null) {
                    l0.j("disable backup: no current phrase ".concat(str5 == null ? "NULL_ERROR" : str5));
                    l8Var.a(str5 != null ? str5 : "NULL_ERROR");
                    break;
                } else {
                    l0.H("disable backup: ready!");
                    if (l0Var2.b == null) {
                        l0.j("disable backup: no engine");
                        l8Var.a("NULL_ENGINE");
                        break;
                    } else {
                        String t6 = l0Var2.t();
                        byte[] y10 = l0Var2.y();
                        if (TextUtils.isEmpty(t6)) {
                            l0.j("disable backup: empty address");
                            l8Var.a("NULL_ADDRESS");
                            break;
                        } else if (y10 == null || y10.length <= 0) {
                            l0.j("disable backup: no public key");
                            l8Var.a("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                i0 b10 = g0Var.b.b();
                                k0 B = l0Var2.B();
                                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                                wallettransaction.key_change = true;
                                wallettransaction.incoming = false;
                                wallettransaction.pending = true;
                                wallettransaction.comment = null;
                                wallettransaction.comment_encrypted = false;
                                wallettransaction.date = ConnectionsManager.getInstance(i15).getCurrentTime();
                                wallettransaction.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = t6;
                                wallettransaction.peer = wallettransactionpeeraddress;
                                g7 g7Var = new g7(l0Var2, b10, wallettransaction, B, 4);
                                TL_wallet.sendTransfer sendtransfer = g0Var.a;
                                wallettransaction.gasless = sendtransfer.data_gasless != null;
                                wallettransaction.random_id = sendtransfer.random_id;
                                wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                l0Var2.p.add(0, wallettransaction);
                                B.k();
                                B.i();
                                l0Var2.S();
                                l8Var.a(null);
                                l0.H("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i15).sendRequestTyped(g0Var.a, new d3.b(i13), new di.z2(l0Var2, g7Var, g0Var, b10, wallettransaction, 5));
                                break;
                            } catch (IllegalStateException unused) {
                                l8Var.a("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 2:
                l0 l0Var3 = (l0) obj3;
                s10 s10Var2 = (s10) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0Var3.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    np.s1(l0Var3.a).Y3(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j10 = walletuseraddress2.user_id;
                    if (j10 != 0) {
                        long j11 = user.id;
                        if (j10 == j11) {
                            l0Var3.L.put(Long.valueOf(j11), walletuseraddress2);
                            l0Var3.M.put(walletuseraddress2.address, walletuseraddress2);
                            s10Var2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    s10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                } else {
                    s10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new cu0((l0) obj3, (i0) obj, (org.telegram.ui.ActionBar.t1) obj5, (d) obj4, (String) obj2, 6));
                break;
            case 4:
                l0 l0Var4 = (l0) obj3;
                m mVar = (m) obj4;
                String str6 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactions.transactions.get(0);
                    l0Var4.K.put(str6, wallettransaction2);
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
                i0 i0Var2 = (i0) obj;
                String str9 = (String) obj2;
                if (i0Var2 == null) {
                    l0.j("decrypting transaction comment, failed to get secret phrase");
                    qVar.a(null, str9 != null ? str9 : "NULL_ERROR");
                    break;
                } else {
                    try {
                        qVar.a(WalletEngine2.decryptComment(i0Var2, str7, str8), null);
                        break;
                    } catch (Exception e10) {
                        l0.k("failed to decrypt comment", e10);
                        qVar.a(null, e10.getMessage() != null ? e10.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 6:
                l0 l0Var5 = (l0) obj3;
                z10 z10Var = (z10) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                i0 i0Var3 = (i0) obj;
                String str10 = (String) obj2;
                if (str10 == null && i0Var3 != null) {
                    p0 p0Var = l0Var5.c;
                    if (p0Var != null) {
                        if (!TextUtils.equals(p0Var.c, tL_walletState.address)) {
                            z10Var.a("STORAGE_CHANGED");
                            break;
                        } else {
                            l0Var5.c.p(m10.i(l0Var5.a).e(), tL_walletState.public_key, i0Var3, new x21(4, i0Var3.b(), z10Var));
                            break;
                        }
                    } else {
                        z10Var.a("STORAGE_NULL");
                        break;
                    }
                } else {
                    if (str10 == null) {
                        str10 = "LOCAL_STORAGE_ERROR";
                    }
                    z10Var.a(str10);
                    break;
                }
            case 7:
                l0 l0Var6 = (l0) obj3;
                x21 x21Var = (x21) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(l0Var6.a).sendRequestTyped(enablebackup, new d3.b(i13), new bi.e4(27, l0Var6, x21Var));
                    break;
                } else {
                    x21Var.a(str11 != null ? str11 : "NULL_ERROR");
                    break;
                }
            case 8:
                d2 d2Var = (d2) obj3;
                x21 x21Var2 = (x21) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                Arrays.fill(((a2) obj5).b, (byte) 0);
                x21Var2.a((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : d2.z(tL_error3, "submitConnectResult"));
                if (d2Var.e < 0) {
                    d2Var.e = d2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(i13), new d(d2Var, i10));
                    break;
                }
                break;
            case 9:
                d2 d2Var2 = (d2) obj3;
                z1 z1Var = (z1) obj5;
                oi.c cVar = (oi.c) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                d2Var2.getClass();
                if (!z1Var.n && !d2Var2.j(z1Var) && d2Var2.A(z1Var) && wallettransaction3 != null && wallettransaction3.traceSucceeded && !wallettransaction3.traceIncomplete) {
                    z10 = true;
                }
                z1Var.p = z10;
                cVar.a(wallettransaction3, obj6);
                break;
            case 10:
                z10 z10Var2 = (z10) obj5;
                l0 l0Var7 = (l0) obj3;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj4;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error4 == null || (str2 = tL_error4.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    z10Var2.a(str2);
                    if (tL_error4 != null && (str3 = tL_error4.text) != null) {
                        str = str3;
                    }
                    cc.b0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    z10Var2.a("NO_PROVIDERS");
                    cc.b0("NO_PROVIDERS");
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
                                createonrampsession.address = l0Var7.t();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = l0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new d3.b(i13), new d(z10Var2, i11));
                                break;
                            } else {
                                z10Var2.a("NO_SUITABLE_PROVIDER");
                                cc.b0("NO_SUITABLE_PROVIDER");
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo == null) {
                    }
                }
                break;
            default:
                final p8 p8Var = (p8) obj5;
                final l0 l0Var8 = (l0) obj3;
                final Long l10 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.t1) obj4).dismiss();
                if (l10 != null) {
                    Activity parentActivity = p8Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, p8Var.getResourceProvider());
                        int i16 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(p8Var.getThemedColor(i16), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
                        org.telegram.ui.ActionBar.e6 resourceProvider = p8Var.getResourceProvider();
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.q6.j(c2Var, h02, null, M, resourceProvider);
                        c2Var.e(hd.M0(2131742969, null), "", false, false, false);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (hd.a0 ? 5 : 3) | 16;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.setPadding(hd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, p8Var.getResourceProvider());
                        textView.setGravity(17);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i17 = org.telegram.ui.ActionBar.j6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, p8Var.getThemedColor(i17));
                        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i17);
                        org.telegram.ui.ActionBar.e6 resourceProvider2 = p8Var.getResourceProvider();
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.q6.j(textView, d02, M2, null, resourceProvider2);
                        textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setText(l10.longValue() > 0 ? hd.V(null, null, 2131742967, l0.n(l10.longValue(), false), l0Var8.m(l10.longValue(), true)) : hd.M0(2131742968, null));
                        textView.setVisibility(8);
                        c2Var.setOnClickListener(new a90(29, c2Var, textView));
                        LinearLayout e11 = org.telegram.messenger.k5.e(parentActivity, 1);
                        e11.addView(c2Var, c8.ja.t(-1, -2, 83, 8, 0, 8, 0));
                        e11.addView(textView, c8.ja.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, p8Var.getResourceProvider());
                        String M0 = hd.M0(2131743131, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = hd.M0(2131743132, null);
                        t1Var.H = 6;
                        alertDialog$Builder.o(e11);
                        t1Var.a = org.telegram.messenger.g0.L(312.0f);
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(hd.M0(2131743136, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Wallet.m8
                            @Override // org.telegram.ui.ActionBar.q1
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i18) {
                                org.telegram.ui.Cells.c2 c2Var2 = c2Var;
                                if (c2Var2.isEnabled()) {
                                    boolean b11 = c2Var2.b();
                                    c2Var2.setEnabled(false);
                                    vf.b h = t1Var2.h(i18, true, true);
                                    h.d();
                                    p8 p8Var2 = p8.this;
                                    l0 l0Var9 = l0Var8;
                                    if (!b11) {
                                        l0Var9.z(new h8(p8Var2, h, l0Var9, 0), false, true);
                                        return;
                                    }
                                    long v = l0Var9.v();
                                    Long l11 = l10;
                                    if (v >= l11.longValue()) {
                                        h8 h8Var = new h8(p8Var2, h, l0Var9, 1);
                                        l0.H("prepare disable backup");
                                        l0Var9.z(new bi.e4(25, l0Var9, h8Var), true, false);
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, p8Var2.getParentActivity(), p8Var2.getResourceProvider());
                                    String M02 = hd.M0(2131743066, null);
                                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
                                    t1Var3.S = M02;
                                    t1Var3.U = hd.V(null, null, 2131742966, l0.n(l11.longValue(), false), l0Var9.m(l11.longValue(), true));
                                    alertDialog$Builder2.h(hd.M0(2131743064, null), new ug.x(16));
                                    alertDialog$Builder2.k(hd.M0(2131742990, null), new b3(p8Var2, 6));
                                    alertDialog$Builder2.p();
                                }
                            }
                        });
                        p8Var.showDialog(t1Var);
                        TextView textView2 = (TextView) t1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.q7, t1Var.j1);
                            break;
                        }
                    }
                } else {
                    cc.a0(p8Var).e0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(z10 z10Var, l0 l0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.c = z10Var;
        this.b = l0Var;
        this.d = connectionsManager;
    }

    public /* synthetic */ j(l0 l0Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = l0Var;
        this.d = obj;
        this.c = obj2;
    }

    public /* synthetic */ j(l0 l0Var, q qVar, String str, String str2) {
        this.a = 5;
        this.b = qVar;
        this.c = str;
        this.d = str2;
    }

    public /* synthetic */ j(p8 p8Var, org.telegram.ui.ActionBar.t1 t1Var, l0 l0Var) {
        this.a = 11;
        this.c = p8Var;
        this.d = t1Var;
        this.b = l0Var;
    }
}
