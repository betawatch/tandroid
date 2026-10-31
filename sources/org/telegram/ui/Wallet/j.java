package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.af;
import org.telegram.ui.f11;
import org.telegram.ui.m90;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022f  */
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i10 = this.a;
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
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj3;
                String str4 = (String) obj5;
                j20 j20Var = (j20) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i14 = k0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    vp.r1(i14).V3(useraddresses.users, false);
                    hs.a0(i14).m1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j10 = walletuseraddress.user_id;
                    if (j10 != 0) {
                        k0Var.L.put(Long.valueOf(j10), walletuseraddress);
                    }
                    k0Var.M.put(walletuseraddress.address, walletuseraddress);
                    j20Var.a(walletuseraddress, tL_error != null ? tL_error.text : null);
                    break;
                } else {
                    k0Var.b0(str4, new m(k0Var, j20Var, str4, z10 ? 1 : 0));
                    break;
                }
                break;
            case 1:
                k0 k0Var2 = (k0) obj3;
                p8 p8Var = (p8) obj5;
                f0 f0Var = (f0) obj4;
                h0 h0Var = (h0) obj;
                String str5 = (String) obj2;
                int i15 = k0Var2.a;
                if (h0Var == null) {
                    k0.j("disable backup: no current phrase ".concat(str5 == null ? "NULL_ERROR" : str5));
                    p8Var.a(str5 != null ? str5 : "NULL_ERROR");
                    break;
                } else {
                    k0.H("disable backup: ready!");
                    if (k0Var2.b == null) {
                        k0.j("disable backup: no engine");
                        p8Var.a("NULL_ENGINE");
                        break;
                    } else {
                        String t10 = k0Var2.t();
                        byte[] y3 = k0Var2.y();
                        if (TextUtils.isEmpty(t10)) {
                            k0.j("disable backup: empty address");
                            p8Var.a("NULL_ADDRESS");
                            break;
                        } else if (y3 == null || y3.length <= 0) {
                            k0.j("disable backup: no public key");
                            p8Var.a("NULL_PUBLIC_KEY");
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
                                wallettransaction.date = ConnectionsManager.getInstance(i15).getCurrentTime();
                                wallettransaction.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = t10;
                                wallettransaction.peer = wallettransactionpeeraddress;
                                k7 k7Var = new k7(k0Var2, b10, wallettransaction, B, 4);
                                TL_wallet.sendTransfer sendtransfer = f0Var.a;
                                wallettransaction.gasless = sendtransfer.data_gasless != null;
                                wallettransaction.random_id = sendtransfer.random_id;
                                wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                k0Var2.p.add(0, wallettransaction);
                                B.k();
                                B.i();
                                k0Var2.S();
                                p8Var.a(null);
                                k0.H("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i15).sendRequestTyped(f0Var.a, new a3.b(i13), new af(k0Var2, k7Var, f0Var, b10, wallettransaction, 4));
                                break;
                            } catch (IllegalStateException unused) {
                                p8Var.a("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 2:
                k0 k0Var3 = (k0) obj3;
                j20 j20Var2 = (j20) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0Var3.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    vp.r1(k0Var3.a).V3(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j11 = walletuseraddress2.user_id;
                    if (j11 != 0) {
                        long j12 = user.id;
                        if (j11 == j12) {
                            k0Var3.L.put(Long.valueOf(j12), walletuseraddress2);
                            k0Var3.M.put(walletuseraddress2.address, walletuseraddress2);
                            j20Var2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    j20Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                } else {
                    j20Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.i0.g3(new m90((k0) obj3, (h0) obj, (org.telegram.ui.ActionBar.x1) obj5, (d) obj4, (String) obj2, 22));
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
                    } catch (Exception e) {
                        k0.k("failed to decrypt comment", e);
                        qVar.a(null, e.getMessage() != null ? e.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 6:
                k0 k0Var5 = (k0) obj3;
                q20 q20Var = (q20) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                h0 h0Var3 = (h0) obj;
                String str10 = (String) obj2;
                if (str10 == null && h0Var3 != null) {
                    p0 p0Var = k0Var5.c;
                    if (p0Var != null) {
                        if (!TextUtils.equals(p0Var.c, tL_walletState.address)) {
                            q20Var.a("STORAGE_CHANGED");
                            break;
                        } else {
                            k0Var5.c.p(d20.i(k0Var5.a).e(), tL_walletState.public_key, h0Var3, new f11(r3, h0Var3.b(), q20Var));
                            break;
                        }
                    } else {
                        q20Var.a("STORAGE_NULL");
                        break;
                    }
                } else {
                    if (str10 == null) {
                        str10 = "LOCAL_STORAGE_ERROR";
                    }
                    q20Var.a(str10);
                    break;
                }
            case 7:
                k0 k0Var6 = (k0) obj3;
                f11 f11Var = (f11) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(k0Var6.a).sendRequestTyped(enablebackup, new a3.b(i13), new ih.s(20, k0Var6, f11Var));
                    break;
                } else {
                    f11Var.a(str11 != null ? str11 : "NULL_ERROR");
                    break;
                }
            case 8:
                e2 e2Var = (e2) obj3;
                f11 f11Var2 = (f11) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                Arrays.fill(((b2) obj5).b, (byte) 0);
                f11Var2.a((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : e2.z(tL_error3, "submitConnectResult"));
                if (e2Var.e < 0) {
                    e2Var.e = e2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new a3.b(i13), new d(e2Var, 4));
                    break;
                }
                break;
            case 9:
                e2 e2Var2 = (e2) obj3;
                a2 a2Var = (a2) obj5;
                bi.d dVar = (bi.d) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                e2Var2.getClass();
                if (!a2Var.n && !e2Var2.j(a2Var) && e2Var2.A(a2Var) && wallettransaction3 != null && wallettransaction3.traceSucceeded && !wallettransaction3.traceIncomplete) {
                    z10 = true;
                }
                a2Var.p = z10;
                dVar.a(wallettransaction3, obj6);
                break;
            case 10:
                q20 q20Var2 = (q20) obj5;
                k0 k0Var7 = (k0) obj3;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj4;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error4 == null || (str2 = tL_error4.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    q20Var2.a(str2);
                    if (tL_error4 != null && (str3 = tL_error4.text) != null) {
                        str = str3;
                    }
                    cc.b0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    q20Var2.a("NO_PROVIDERS");
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
                                createonrampsession.address = k0Var7.t();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = k0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new a3.b(i13), new d(q20Var2, i11));
                                break;
                            } else {
                                q20Var2.a("NO_SUITABLE_PROVIDER");
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
                final t8 t8Var = (t8) obj5;
                final k0 k0Var8 = (k0) obj3;
                final Long l4 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.x1) obj4).dismiss();
                if (l4 != null) {
                    Activity parentActivity = t8Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, t8Var.getResourceProvider());
                        int i16 = org.telegram.ui.ActionBar.t6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(t8Var.getThemedColor(i16), 7, org.telegram.messenger.i0.L(12.0f));
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
                        org.telegram.ui.ActionBar.p6 resourceProvider = t8Var.getResourceProvider();
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, resourceProvider);
                        c2Var.e(cd.L0(2131742995, null), "", false, false, false);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        int i17 = 16;
                        layoutParams.gravity = (cd.X ? 5 : 3) | 16;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.setPadding(cd.X ? org.telegram.messenger.i0.L(4.0f) : 0, org.telegram.messenger.i0.L(12.0f), cd.X ? 0 : org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, t8Var.getResourceProvider());
                        textView.setGravity(17);
                        int L = org.telegram.messenger.i0.L(10.0f);
                        int i18 = org.telegram.ui.ActionBar.t6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, t8Var.getThemedColor(i18));
                        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i18);
                        org.telegram.ui.ActionBar.p6 resourceProvider2 = t8Var.getResourceProvider();
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.a7.k(textView, d02, N2, null, resourceProvider2);
                        textView.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
                        textView.setText(l4.longValue() > 0 ? cd.V(null, null, 2131742993, k0.n(l4.longValue(), false), k0Var8.m(l4.longValue(), true)) : cd.L0(2131742994, null));
                        textView.setVisibility(8);
                        c2Var.setOnClickListener(new rv0(i17, c2Var, textView));
                        LinearLayout e7 = org.telegram.messenger.m5.e(parentActivity, 1);
                        e7.addView(c2Var, w7.b6.t(-1, -2, 83, 8, 0, 8, 0));
                        e7.addView(textView, w7.b6.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, t8Var.getResourceProvider());
                        String L0 = cd.L0(2131743157, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = cd.L0(2131743158, null);
                        x1Var.G = 6;
                        alertDialog$Builder.o(e7);
                        x1Var.a = org.telegram.messenger.i0.L(312.0f);
                        alertDialog$Builder.h(cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(cd.L0(2131743162, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.Wallet.q8
                            @Override // org.telegram.ui.ActionBar.u1
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i19) {
                                org.telegram.ui.Cells.c2 c2Var2 = c2Var;
                                if (c2Var2.isEnabled()) {
                                    boolean b11 = c2Var2.b();
                                    c2Var2.setEnabled(false);
                                    gf.e h = x1Var2.h(i19, true, true);
                                    h.d();
                                    t8 t8Var2 = t8.this;
                                    k0 k0Var9 = k0Var8;
                                    if (!b11) {
                                        k0Var9.z(new m8(t8Var2, h, k0Var9, 0), false, true);
                                        return;
                                    }
                                    long v = k0Var9.v();
                                    Long l10 = l4;
                                    if (v >= l10.longValue()) {
                                        m8 m8Var = new m8(t8Var2, h, k0Var9, 1);
                                        k0.H("prepare disable backup");
                                        k0Var9.z(new ih.s(18, k0Var9, m8Var), true, false);
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, t8Var2.getParentActivity(), t8Var2.getResourceProvider());
                                    String L02 = cd.L0(2131743092, null);
                                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.a;
                                    x1Var3.R = L02;
                                    x1Var3.T = cd.V(null, null, 2131742992, k0.n(l10.longValue(), false), k0Var9.m(l10.longValue(), true));
                                    alertDialog$Builder2.h(cd.L0(2131743090, null), new m4.v0(13));
                                    alertDialog$Builder2.k(cd.L0(2131743016, null), new d3(t8Var2, 6));
                                    alertDialog$Builder2.p();
                                }
                            }
                        });
                        t8Var.showDialog(x1Var);
                        TextView textView2 = (TextView) x1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, x1Var.k1);
                            break;
                        }
                    }
                } else {
                    cc.a0(t8Var).e0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(q20 q20Var, k0 k0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.c = q20Var;
        this.b = k0Var;
        this.d = connectionsManager;
    }

    public /* synthetic */ j(k0 k0Var, Object obj, Object obj2, int i10) {
        this.a = i10;
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

    public /* synthetic */ j(t8 t8Var, org.telegram.ui.ActionBar.x1 x1Var, k0 k0Var) {
        this.a = 11;
        this.c = t8Var;
        this.d = x1Var;
        this.b = k0Var;
    }
}
