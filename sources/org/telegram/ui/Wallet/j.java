package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.c01;
import org.telegram.ui.fk0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements v10 {
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

    /* JADX WARN: Removed duplicated region for block: B:65:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022f  */
    @Override // org.telegram.messenger.v10
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
        boolean z9 = false;
        int i11 = 0;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        int i12 = 1;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj3;
                String str4 = (String) obj5;
                v10 v10Var = (v10) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i13 = m0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    qp.s1(i13).Y3(useraddresses.users, false);
                    yr.a0(i13).m1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j3 = walletuseraddress.user_id;
                    if (j3 != 0) {
                        m0Var.L.put(Long.valueOf(j3), walletuseraddress);
                    }
                    m0Var.M.put(walletuseraddress.address, walletuseraddress);
                    v10Var.a(walletuseraddress, tL_error != null ? tL_error.text : null);
                    break;
                } else {
                    m0Var.b0(str4, new m(m0Var, v10Var, str4, z9 ? 1 : 0));
                    break;
                }
                break;
            case 1:
                m0 m0Var2 = (m0) obj3;
                j8 j8Var = (j8) obj5;
                h0 h0Var = (h0) obj4;
                j0 j0Var = (j0) obj;
                String str5 = (String) obj2;
                int i14 = m0Var2.a;
                if (j0Var == null) {
                    m0.j("disable backup: no current phrase ".concat(str5 == null ? "NULL_ERROR" : str5));
                    j8Var.a(str5 != null ? str5 : "NULL_ERROR");
                    break;
                } else {
                    m0.H("disable backup: ready!");
                    if (m0Var2.b == null) {
                        m0.j("disable backup: no engine");
                        j8Var.a("NULL_ENGINE");
                        break;
                    } else {
                        String t6 = m0Var2.t();
                        byte[] y10 = m0Var2.y();
                        if (TextUtils.isEmpty(t6)) {
                            m0.j("disable backup: empty address");
                            j8Var.a("NULL_ADDRESS");
                            break;
                        } else if (y10 == null || y10.length <= 0) {
                            m0.j("disable backup: no public key");
                            j8Var.a("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                j0 b10 = h0Var.b.b();
                                l0 B = m0Var2.B();
                                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                                wallettransaction.key_change = true;
                                wallettransaction.incoming = false;
                                wallettransaction.pending = true;
                                wallettransaction.comment = null;
                                wallettransaction.comment_encrypted = false;
                                wallettransaction.date = ConnectionsManager.getInstance(i14).getCurrentTime();
                                wallettransaction.amount = 0L;
                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = new TL_wallet.walletTransactionPeerAddress();
                                wallettransactionpeeraddress.address = t6;
                                wallettransaction.peer = wallettransactionpeeraddress;
                                f7 f7Var = new f7(m0Var2, b10, wallettransaction, B, 4);
                                TL_wallet.sendTransfer sendtransfer = h0Var.a;
                                wallettransaction.gasless = sendtransfer.data_gasless != null;
                                wallettransaction.random_id = sendtransfer.random_id;
                                wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                m0Var2.p.add(0, wallettransaction);
                                B.k();
                                B.i();
                                m0Var2.S();
                                j8Var.a(null);
                                m0.H("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i14).sendRequestTyped(h0Var.a, new d3.b(1), new bi.t3(m0Var2, f7Var, h0Var, b10, wallettransaction, 5));
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
                m0 m0Var3 = (m0) obj3;
                v10 v10Var2 = (v10) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m0Var3.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    qp.s1(m0Var3.a).Y3(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j10 = walletuseraddress2.user_id;
                    if (j10 != 0) {
                        long j11 = user.id;
                        if (j10 == j11) {
                            m0Var3.L.put(Long.valueOf(j11), walletuseraddress2);
                            m0Var3.M.put(walletuseraddress2.address, walletuseraddress2);
                            v10Var2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    v10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                } else {
                    v10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new c01((m0) obj3, (j0) obj, (org.telegram.ui.ActionBar.u1) obj5, (d) obj4, (String) obj2, 2));
                break;
            case 4:
                m0 m0Var4 = (m0) obj3;
                m mVar = (m) obj4;
                String str6 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactions.transactions.get(0);
                    m0Var4.K.put(str6, wallettransaction2);
                    mVar.a(wallettransaction2);
                    break;
                } else {
                    mVar.a(null);
                    break;
                }
                break;
            case 5:
                r rVar = (r) obj3;
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                j0 j0Var2 = (j0) obj;
                String str9 = (String) obj2;
                if (j0Var2 == null) {
                    m0.j("decrypting transaction comment, failed to get secret phrase");
                    rVar.a(null, str9 != null ? str9 : "NULL_ERROR");
                    break;
                } else {
                    try {
                        rVar.a(WalletEngine2.decryptComment(j0Var2, str7, str8), null);
                        break;
                    } catch (Exception e10) {
                        m0.k("failed to decrypt comment", e10);
                        rVar.a(null, e10.getMessage() != null ? e10.getMessage() : "NULL_ERROR");
                        return;
                    }
                }
            case 6:
                m0 m0Var5 = (m0) obj3;
                c20 c20Var = (c20) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                j0 j0Var3 = (j0) obj;
                String str10 = (String) obj2;
                if (str10 == null && j0Var3 != null) {
                    q0 q0Var = m0Var5.c;
                    if (q0Var != null) {
                        if (!TextUtils.equals(q0Var.c, tL_walletState.address)) {
                            c20Var.a("STORAGE_CHANGED");
                            break;
                        } else {
                            m0Var5.c.p(p10.i(m0Var5.a).e(), tL_walletState.public_key, j0Var3, new fx(29, j0Var3.b(), c20Var));
                            break;
                        }
                    } else {
                        c20Var.a("STORAGE_NULL");
                        break;
                    }
                } else {
                    if (str10 == null) {
                        str10 = "LOCAL_STORAGE_ERROR";
                    }
                    c20Var.a(str10);
                    break;
                }
            case 7:
                m0 m0Var6 = (m0) obj3;
                t tVar = (t) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str11 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(m0Var6.a).sendRequestTyped(enablebackup, new d3.b(i12), new bi.p5(26, m0Var6, tVar));
                    break;
                } else {
                    tVar.a(str11 != null ? str11 : "NULL_ERROR");
                    break;
                }
            case 8:
                e2 e2Var = (e2) obj3;
                t tVar2 = (t) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                Arrays.fill(((b2) obj5).b, (byte) 0);
                tVar2.a((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : e2.z(tL_error3, "submitConnectResult"));
                if (e2Var.e < 0) {
                    e2Var.e = e2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(i12), new d(e2Var, 4));
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
                if (!a2Var.n && !e2Var2.j(a2Var) && e2Var2.A(a2Var) && wallettransaction3 != null && wallettransaction3.traceSucceeded && !wallettransaction3.traceIncomplete) {
                    z9 = true;
                }
                a2Var.p = z9;
                cVar.a(wallettransaction3, obj6);
                break;
            case 10:
                c20 c20Var2 = (c20) obj5;
                m0 m0Var7 = (m0) obj3;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj4;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error4 == null || (str2 = tL_error4.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    c20Var2.a(str2);
                    if (tL_error4 != null && (str3 = tL_error4.text) != null) {
                        str = str3;
                    }
                    hc.b0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    c20Var2.a("NO_PROVIDERS");
                    hc.b0("NO_PROVIDERS");
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
                                createonrampsession.address = m0Var7.t();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = m0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new d3.b(i12), new d(c20Var2, i10));
                                break;
                            } else {
                                c20Var2.a("NO_SUITABLE_PROVIDER");
                                hc.b0("NO_SUITABLE_PROVIDER");
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
                final m0 m0Var8 = (m0) obj3;
                final Long l10 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (l10 != null) {
                    Activity parentActivity = n8Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, n8Var.getResourceProvider());
                        int i15 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(n8Var.getThemedColor(i15), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
                        org.telegram.ui.ActionBar.f6 resourceProvider = n8Var.getResourceProvider();
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, resourceProvider);
                        c2Var.e(id.M0(2131742972, null), "", false, false, false);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (id.a0 ? 5 : 3) | 16;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.setPadding(id.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), id.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, n8Var.getResourceProvider());
                        textView.setGravity(17);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i16 = org.telegram.ui.ActionBar.k6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, n8Var.getThemedColor(i16));
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                        org.telegram.ui.ActionBar.f6 resourceProvider2 = n8Var.getResourceProvider();
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.r6.k(textView, d02, N2, null, resourceProvider2);
                        textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setText(l10.longValue() > 0 ? id.V(null, null, 2131742970, m0.n(l10.longValue(), false), m0Var8.m(l10.longValue(), true)) : id.M0(2131742971, null));
                        textView.setVisibility(8);
                        c2Var.setOnClickListener(new fk0(22, c2Var, textView));
                        LinearLayout e11 = org.telegram.messenger.k5.e(parentActivity, 1);
                        e11.addView(c2Var, c8.ha.t(-1, -2, 83, 8, 0, 8, 0));
                        e11.addView(textView, c8.ha.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, n8Var.getResourceProvider());
                        String M0 = id.M0(2131743134, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = id.M0(2131743135, null);
                        u1Var.G = 6;
                        alertDialog$Builder.o(e11);
                        u1Var.a = org.telegram.messenger.g0.L(312.0f);
                        alertDialog$Builder.h(id.M0(2131752589, null), null);
                        alertDialog$Builder.k(id.M0(2131743139, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.Wallet.k8
                            @Override // org.telegram.ui.ActionBar.r1
                            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i17) {
                                org.telegram.ui.Cells.c2 c2Var2 = c2Var;
                                if (c2Var2.isEnabled()) {
                                    boolean b11 = c2Var2.b();
                                    c2Var2.setEnabled(false);
                                    vf.b h = u1Var2.h(i17, true, true);
                                    h.d();
                                    n8 n8Var2 = n8.this;
                                    m0 m0Var9 = m0Var8;
                                    if (!b11) {
                                        m0Var9.z(new g8(n8Var2, h, m0Var9, 0), false, true);
                                        return;
                                    }
                                    long v = m0Var9.v();
                                    Long l11 = l10;
                                    if (v >= l11.longValue()) {
                                        g8 g8Var = new g8(n8Var2, h, m0Var9, 1);
                                        m0.H("prepare disable backup");
                                        m0Var9.z(new bi.p5(24, m0Var9, g8Var), true, false);
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, n8Var2.getParentActivity(), n8Var2.getResourceProvider());
                                    String M02 = id.M0(2131743069, null);
                                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                                    u1Var3.R = M02;
                                    u1Var3.T = id.V(null, null, 2131742969, m0.n(l11.longValue(), false), m0Var9.m(l11.longValue(), true));
                                    alertDialog$Builder2.h(id.M0(2131743067, null), new v0.j(15));
                                    alertDialog$Builder2.k(id.M0(2131742993, null), new d3(n8Var2, 6));
                                    alertDialog$Builder2.p();
                                }
                            }
                        });
                        n8Var.showDialog(u1Var);
                        TextView textView2 = (TextView) u1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, u1Var.i1);
                            break;
                        }
                    }
                } else {
                    hc.a0(n8Var).e0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(c20 c20Var, m0 m0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.c = c20Var;
        this.b = m0Var;
        this.d = connectionsManager;
    }

    public /* synthetic */ j(m0 m0Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = m0Var;
        this.d = obj;
        this.c = obj2;
    }

    public /* synthetic */ j(m0 m0Var, r rVar, String str, String str2) {
        this.a = 5;
        this.b = rVar;
        this.c = str;
        this.d = str2;
    }

    public /* synthetic */ j(n8 n8Var, org.telegram.ui.ActionBar.u1 u1Var, m0 m0Var) {
        this.a = 11;
        this.c = n8Var;
        this.d = u1Var;
        this.b = m0Var;
    }
}
