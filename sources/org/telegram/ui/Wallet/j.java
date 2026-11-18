package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cd0;
import org.telegram.ui.ne;
import org.telegram.ui.p51;
import org.telegram.ui.wt0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0230  */
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i7 = this.a;
        int i10 = 8;
        str = "NULL_ERROR";
        TL_toncenter.onrampProviderInfo onrampproviderinfo = null;
        char c10 = 1;
        char c11 = 1;
        int i11 = 0;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                u0 u0Var = (u0) obj3;
                String str4 = (String) obj5;
                q10 q10Var = (q10) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i12 = u0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    mp.u1(i12).f4(useraddresses.users, false);
                    tr.a0(i12).m1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j3 = walletuseraddress.user_id;
                    if (j3 != 0) {
                        u0Var.O.put(Long.valueOf(j3), walletuseraddress);
                    }
                    u0Var.P.put(walletuseraddress.address, walletuseraddress);
                    q10Var.a(walletuseraddress, tL_error == null ? null : tL_error.text);
                    break;
                } else {
                    u0Var.k0(str4, new o(u0Var, q10Var, str4, i11));
                    break;
                }
                break;
            case 1:
                u0 u0Var2 = (u0) obj3;
                q10 q10Var2 = (q10) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                u0Var2.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    mp.u1(u0Var2.a).f4(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j10 = walletuseraddress2.user_id;
                    if (j10 != 0) {
                        long j11 = user.id;
                        if (j10 == j11) {
                            u0Var2.O.put(Long.valueOf(j11), walletuseraddress2);
                            u0Var2.P.put(walletuseraddress2.address, walletuseraddress2);
                            q10Var2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    q10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                } else {
                    q10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                }
                break;
            case 2:
                u0 u0Var3 = (u0) obj3;
                x10 x10Var = (x10) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                r0 r0Var = (r0) obj;
                String str5 = (String) obj2;
                if (str5 == null && r0Var != null) {
                    z0 z0Var = u0Var3.c;
                    if (z0Var != null) {
                        if (!TextUtils.equals(z0Var.c, tL_walletState.address)) {
                            x10Var.a("STORAGE_CHANGED");
                            break;
                        } else {
                            u0Var3.c.q(j10.i(u0Var3.a).e(), tL_walletState.public_key, r0Var, new p51(2, r0Var.b(), x10Var));
                            break;
                        }
                    } else {
                        x10Var.a("STORAGE_NULL");
                        break;
                    }
                } else {
                    if (str5 == null) {
                        str5 = "LOCAL_STORAGE_ERROR";
                    }
                    x10Var.a(str5);
                    break;
                }
            case 3:
                u0 u0Var4 = (u0) obj3;
                o oVar = (o) obj4;
                String str6 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    u0Var4.N.put(str6, wallettransaction);
                    oVar.a(wallettransaction);
                    break;
                } else {
                    oVar.a(null);
                    break;
                }
            case 4:
                s sVar = (s) obj3;
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                r0 r0Var2 = (r0) obj;
                String str9 = (String) obj2;
                if (r0Var2 == null) {
                    u0.n("decrypting transaction comment, failed to get secret phrase");
                    sVar.a(null, str9 == null ? "NULL_ERROR" : str9);
                    break;
                } else {
                    try {
                        sVar.a(WalletEngine2.decryptComment(r0Var2, str7, str8), null);
                        break;
                    } catch (Exception e10) {
                        u0.o("failed to decrypt comment", e10);
                        sVar.a(null, e10.getMessage() == null ? "NULL_ERROR" : e10.getMessage());
                        return;
                    }
                }
            case 5:
                u0 u0Var5 = (u0) obj3;
                p51 p51Var = (p51) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str10 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(u0Var5.a).sendRequestTyped(enablebackup, new d3.b(1), new e0(i11, u0Var5, p51Var));
                    break;
                } else {
                    p51Var.a(str10 == null ? "NULL_ERROR" : str10);
                    break;
                }
            case 6:
                u0 u0Var6 = (u0) obj3;
                z8 z8Var = (z8) obj5;
                o0 o0Var = (o0) obj4;
                r0 r0Var3 = (r0) obj;
                String str11 = (String) obj2;
                int i13 = u0Var6.a;
                if (r0Var3 == null) {
                    u0.n("disable backup: no current phrase ".concat(str11 == null ? "NULL_ERROR" : str11));
                    z8Var.a(str11 == null ? "NULL_ERROR" : str11);
                    break;
                } else {
                    u0.P("disable backup: ready!");
                    if (u0Var6.b == null) {
                        u0.n("disable backup: no engine");
                        z8Var.a("NULL_ENGINE");
                        break;
                    } else {
                        String y10 = u0Var6.y();
                        byte[] E = u0Var6.E();
                        if (TextUtils.isEmpty(y10)) {
                            u0.n("disable backup: empty address");
                            z8Var.a("NULL_ADDRESS");
                            break;
                        } else if (E == null || E.length <= 0) {
                            u0.n("disable backup: no public key");
                            z8Var.a("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                r0 b10 = o0Var.b.b();
                                t0 H = u0Var6.H();
                                TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                                wallettransaction2.key_change = true;
                                wallettransaction2.incoming = false;
                                wallettransaction2.pending = true;
                                wallettransaction2.comment = null;
                                wallettransaction2.comment_encrypted = false;
                                wallettransaction2.date = ConnectionsManager.getInstance(i13).getCurrentTime();
                                wallettransaction2.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = y10;
                                wallettransaction2.peer = wallettransactionpeeraddress;
                                v7 v7Var = new v7(u0Var6, b10, wallettransaction2, H, 3);
                                TL_wallet.sendTransfer sendtransfer = o0Var.a;
                                wallettransaction2.gasless = sendtransfer.data_gasless != null;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                u0Var6.p.add(0, wallettransaction2);
                                H.k();
                                H.i();
                                u0Var6.a0();
                                z8Var.a(null);
                                u0.P("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i13).sendRequestTyped(o0Var.a, new d3.b(1), new ne(u0Var6, v7Var, o0Var, b10, wallettransaction2, 3));
                                break;
                            } catch (IllegalStateException unused) {
                                z8Var.a("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 7:
                org.telegram.messenger.g0.g3(new wt0((u0) obj3, (r0) obj, (org.telegram.ui.ActionBar.u1) obj5, (e) obj4, (String) obj2, 7));
                break;
            case 8:
                l2 l2Var = (l2) obj3;
                p51 p51Var2 = (p51) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l2Var.getClass();
                Arrays.fill(((i2) obj5).b, (byte) 0);
                p51Var2.a((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : l2.z(tL_error3, "submitConnectResult"));
                if (l2Var.e < 0) {
                    l2Var.e = l2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(c10 == true ? 1 : 0), new e(l2Var, 4));
                    break;
                }
                break;
            case 9:
                l2 l2Var2 = (l2) obj3;
                h2 h2Var = (h2) obj5;
                oi.c cVar = (oi.c) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                l2Var2.getClass();
                h2Var.p = (h2Var.n || l2Var2.j(h2Var) || !l2Var2.A(h2Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                cVar.a(wallettransaction3, obj6);
                break;
            case 10:
                w4 w4Var = (w4) obj5;
                u0 u0Var7 = (u0) obj3;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj4;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error4 == null || (str2 = tL_error4.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    w4Var.a(str2);
                    if (tL_error4 != null && (str3 = tL_error4.text) != null) {
                        str = str3;
                    }
                    lc.c0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    w4Var.a("NO_PROVIDERS");
                    lc.c0("NO_PROVIDERS");
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
                                createonrampsession.address = u0Var7.y();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = u0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new d3.b(c11 == true ? 1 : 0), new e(w4Var, i10));
                                break;
                            } else {
                                w4Var.a("NO_SUITABLE_PROVIDER");
                                lc.c0("NO_SUITABLE_PROVIDER");
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo == null) {
                    }
                }
                break;
            default:
                final d9 d9Var = (d9) obj5;
                final u0 u0Var8 = (u0) obj3;
                final Long l10 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (l10 != null) {
                    Activity parentActivity = d9Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, parentActivity, d9Var.getResourceProvider());
                        int i14 = org.telegram.ui.ActionBar.n6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(d9Var.getThemedColor(i14), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                        org.telegram.ui.ActionBar.i6 resourceProvider = d9Var.getResourceProvider();
                        d2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, resourceProvider);
                        d2Var.e(gd.M0(2131742711, null), "", false, false, false);
                        d2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (gd.a0 ? 5 : 3) | 16;
                        d2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        d2Var.setPadding(gd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, d9Var.getResourceProvider());
                        textView.setGravity(17);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i15 = org.telegram.ui.ActionBar.n6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, d9Var.getThemedColor(i15));
                        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i15);
                        org.telegram.ui.ActionBar.i6 resourceProvider2 = d9Var.getResourceProvider();
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.u6.j(textView, d02, M2, null, resourceProvider2);
                        textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setText(l10.longValue() > 0 ? gd.V(null, null, 2131742709, u0.s(l10.longValue(), false), u0Var8.r(l10.longValue(), true)) : gd.M0(2131742710, null));
                        textView.setVisibility(8);
                        d2Var.setOnClickListener(new cd0(24, d2Var, textView));
                        LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, 1);
                        f10.addView(d2Var, c8.ma.t(-1, -2, 83, 8, 0, 8, 0));
                        f10.addView(textView, c8.ma.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, d9Var.getResourceProvider());
                        String M0 = gd.M0(2131742893, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = M0;
                        u1Var.U = gd.M0(2131742894, null);
                        u1Var.H = 6;
                        alertDialog$Builder.o(f10);
                        u1Var.a = org.telegram.messenger.g0.L(312.0f);
                        alertDialog$Builder.h(gd.M0(2131752578, null), null);
                        alertDialog$Builder.k(gd.M0(2131742898, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Wallet.a9
                            @Override // org.telegram.ui.ActionBar.r1
                            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i16) {
                                org.telegram.ui.Cells.d2 d2Var2 = d2Var;
                                if (d2Var2.isEnabled()) {
                                    boolean b11 = d2Var2.b();
                                    d2Var2.setEnabled(false);
                                    vf.b h = u1Var2.h(i16, true, true);
                                    h.d();
                                    d9 d9Var2 = d9.this;
                                    u0 u0Var9 = u0Var8;
                                    if (!b11) {
                                        u0Var9.F(false, true, false, new y8(d9Var2, h, u0Var9, 0));
                                        return;
                                    }
                                    long A = u0Var9.A();
                                    Long l11 = l10;
                                    if (A >= l11.longValue()) {
                                        y8 y8Var = new y8(d9Var2, h, u0Var9, 1);
                                        u0.P("prepare disable backup");
                                        u0Var9.F(true, false, false, new bi.l6(29, u0Var9, y8Var));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, d9Var2.getParentActivity(), d9Var2.getResourceProvider());
                                    String M02 = gd.M0(2131742827, null);
                                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                                    u1Var3.S = M02;
                                    u1Var3.U = gd.V(null, null, 2131742708, u0.s(l11.longValue(), false), u0Var9.r(l11.longValue(), true));
                                    alertDialog$Builder2.h(gd.M0(2131742825, null), new ug.x(17));
                                    alertDialog$Builder2.k(gd.M0(2131742732, null), new h3(d9Var2, 6));
                                    alertDialog$Builder2.p();
                                }
                            }
                        });
                        d9Var.showDialog(u1Var);
                        TextView textView2 = (TextView) u1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, u1Var.j1);
                            break;
                        }
                    }
                } else {
                    lc.b0(d9Var).f0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(u0 u0Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = u0Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ j(u0 u0Var, s sVar, String str, String str2) {
        this.a = 4;
        this.b = sVar;
        this.d = str;
        this.c = str2;
    }

    public /* synthetic */ j(w4 w4Var, u0 u0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.d = w4Var;
        this.b = u0Var;
        this.c = connectionsManager;
    }

    public /* synthetic */ j(d9 d9Var, org.telegram.ui.ActionBar.u1 u1Var, u0 u0Var) {
        this.a = 11;
        this.d = d9Var;
        this.c = u1Var;
        this.b = u0Var;
    }
}
