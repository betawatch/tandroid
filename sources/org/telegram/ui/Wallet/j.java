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
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a31;
import org.telegram.ui.eu0;
import org.telegram.ui.ig0;
import org.telegram.ui.ne;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements p10 {
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

    /* JADX WARN: Removed duplicated region for block: B:65:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0233  */
    @Override // org.telegram.messenger.p10
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
                v0 v0Var = (v0) obj3;
                String str4 = (String) obj5;
                p10 p10Var = (p10) obj4;
                TL_wallet.userAddresses useraddresses = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i12 = v0Var.a;
                if (useraddresses != null && useraddresses.addresses.size() > 0) {
                    mp.u1(i12).f4(useraddresses.users, false);
                    tr.a0(i12).m1(useraddresses.users, null, true, true);
                    TL_wallet.walletUserAddress walletuseraddress = useraddresses.addresses.get(0);
                    long j3 = walletuseraddress.user_id;
                    if (j3 != 0) {
                        v0Var.O.put(Long.valueOf(j3), walletuseraddress);
                    }
                    v0Var.P.put(walletuseraddress.address, walletuseraddress);
                    p10Var.a(walletuseraddress, tL_error == null ? null : tL_error.text);
                    break;
                } else {
                    v0Var.k0(str4, new o(v0Var, p10Var, str4, i11));
                    break;
                }
                break;
            case 1:
                v0 v0Var2 = (v0) obj3;
                p10 p10Var2 = (p10) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                TL_wallet.userAddresses useraddresses2 = (TL_wallet.userAddresses) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                v0Var2.getClass();
                if (useraddresses2 != null && useraddresses2.addresses.size() > 0) {
                    mp.u1(v0Var2.a).f4(useraddresses2.users, false);
                    TL_wallet.walletUserAddress walletuseraddress2 = useraddresses2.addresses.get(0);
                    long j10 = walletuseraddress2.user_id;
                    if (j10 != 0) {
                        long j11 = user.id;
                        if (j10 == j11) {
                            v0Var2.O.put(Long.valueOf(j11), walletuseraddress2);
                            v0Var2.P.put(walletuseraddress2.address, walletuseraddress2);
                            p10Var2.a(walletuseraddress2, null);
                            break;
                        }
                    }
                    p10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                } else {
                    p10Var2.a(null, tL_error2 == null ? null : tL_error2.text);
                    break;
                }
                break;
            case 2:
                v0 v0Var3 = (v0) obj3;
                w10 w10Var = (w10) obj5;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) obj4;
                s0 s0Var = (s0) obj;
                String str5 = (String) obj2;
                if (str5 == null && s0Var != null) {
                    a1 a1Var = v0Var3.c;
                    if (a1Var != null) {
                        if (!TextUtils.equals(a1Var.c, tL_walletState.address)) {
                            w10Var.a("STORAGE_CHANGED");
                            break;
                        } else {
                            v0Var3.c.q(i10.i(v0Var3.a).e(), tL_walletState.public_key, s0Var, new a31(3, s0Var.b(), w10Var));
                            break;
                        }
                    } else {
                        w10Var.a("STORAGE_NULL");
                        break;
                    }
                } else {
                    if (str5 == null) {
                        str5 = "LOCAL_STORAGE_ERROR";
                    }
                    w10Var.a(str5);
                    break;
                }
            case 3:
                v0 v0Var4 = (v0) obj3;
                o oVar = (o) obj4;
                String str6 = (String) obj5;
                TL_wallet.walletTransactions wallettransactions = (TL_wallet.walletTransactions) obj;
                if (wallettransactions != null && !wallettransactions.transactions.isEmpty()) {
                    TL_wallet.walletTransaction wallettransaction = wallettransactions.transactions.get(0);
                    v0Var4.N.put(str6, wallettransaction);
                    oVar.a(wallettransaction);
                    break;
                } else {
                    oVar.a(null);
                    break;
                }
            case 4:
                t tVar = (t) obj3;
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                s0 s0Var2 = (s0) obj;
                String str9 = (String) obj2;
                if (s0Var2 == null) {
                    v0.n("decrypting transaction comment, failed to get secret phrase");
                    tVar.a(null, str9 == null ? "NULL_ERROR" : str9);
                    break;
                } else {
                    try {
                        tVar.a(WalletEngine2.decryptComment(s0Var2, str7, str8), null);
                        break;
                    } catch (Exception e10) {
                        v0.o("failed to decrypt comment", e10);
                        tVar.a(null, e10.getMessage() == null ? "NULL_ERROR" : e10.getMessage());
                        return;
                    }
                }
            case 5:
                v0 v0Var5 = (v0) obj3;
                a31 a31Var = (a31) obj5;
                TL_wallet.enableBackup enablebackup = (TL_wallet.enableBackup) obj4;
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str10 = (String) obj2;
                if (importedWalletProof != null) {
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    enablebackup.proof = walletownershipproof;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    walletownershipproof.signature = importedWalletProof.signature;
                    ConnectionsManager.getInstance(v0Var5.a).sendRequestTyped(enablebackup, new d3.b(1), new f0(i11, v0Var5, a31Var));
                    break;
                } else {
                    a31Var.a(str10 == null ? "NULL_ERROR" : str10);
                    break;
                }
            case 6:
                v0 v0Var6 = (v0) obj3;
                a9 a9Var = (a9) obj5;
                p0 p0Var = (p0) obj4;
                s0 s0Var3 = (s0) obj;
                String str11 = (String) obj2;
                int i13 = v0Var6.a;
                if (s0Var3 == null) {
                    v0.n("disable backup: no current phrase ".concat(str11 == null ? "NULL_ERROR" : str11));
                    a9Var.a(str11 == null ? "NULL_ERROR" : str11);
                    break;
                } else {
                    v0.P("disable backup: ready!");
                    if (v0Var6.b == null) {
                        v0.n("disable backup: no engine");
                        a9Var.a("NULL_ENGINE");
                        break;
                    } else {
                        String y10 = v0Var6.y();
                        byte[] E = v0Var6.E();
                        if (TextUtils.isEmpty(y10)) {
                            v0.n("disable backup: empty address");
                            a9Var.a("NULL_ADDRESS");
                            break;
                        } else if (E == null || E.length <= 0) {
                            v0.n("disable backup: no public key");
                            a9Var.a("NULL_PUBLIC_KEY");
                            break;
                        } else {
                            try {
                                s0 b10 = p0Var.b.b();
                                u0 H = v0Var6.H();
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
                                w7 w7Var = new w7(v0Var6, b10, wallettransaction2, H, 3);
                                TL_wallet.sendTransfer sendtransfer = p0Var.a;
                                wallettransaction2.gasless = sendtransfer.data_gasless != null;
                                wallettransaction2.random_id = sendtransfer.random_id;
                                wallettransaction2.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                                wallettransaction2.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                                v0Var6.p.add(0, wallettransaction2);
                                H.k();
                                H.i();
                                v0Var6.a0();
                                a9Var.a(null);
                                v0.P("disable backup: prepared sendTransfer, sending");
                                ConnectionsManager.getInstance(i13).sendRequestTyped(p0Var.a, new d3.b(1), new ne(v0Var6, w7Var, p0Var, b10, wallettransaction2, 3));
                                break;
                            } catch (IllegalStateException unused) {
                                a9Var.a("CANCELLED");
                                return;
                            }
                        }
                    }
                }
                break;
            case 7:
                org.telegram.messenger.g0.g3(new eu0((v0) obj3, (s0) obj, (org.telegram.ui.ActionBar.t1) obj5, (e) obj4, (String) obj2, 6));
                break;
            case 8:
                m2 m2Var = (m2) obj3;
                a31 a31Var2 = (a31) obj4;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m2Var.getClass();
                Arrays.fill(((j2) obj5).b, (byte) 0);
                a31Var2.a((tL_error3 == null && (bool instanceof TLRPC.TL_boolTrue)) ? null : m2.z(tL_error3, "submitConnectResult"));
                if (m2Var.e < 0) {
                    m2Var.e = m2Var.f.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new d3.b(c10 == true ? 1 : 0), new e(m2Var, 4));
                    break;
                }
                break;
            case 9:
                m2 m2Var2 = (m2) obj3;
                i2 i2Var = (i2) obj5;
                oi.c cVar = (oi.c) obj4;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                Object obj6 = (String) obj2;
                m2Var2.getClass();
                i2Var.p = (i2Var.n || m2Var2.j(i2Var) || !m2Var2.A(i2Var) || wallettransaction3 == null || !wallettransaction3.traceSucceeded || wallettransaction3.traceIncomplete) ? false : true;
                cVar.a(wallettransaction3, obj6);
                break;
            case 10:
                x4 x4Var = (x4) obj5;
                v0 v0Var7 = (v0) obj3;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj4;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (vector == null) {
                    if (tL_error4 == null || (str2 = tL_error4.text) == null) {
                        str2 = "NULL_ERROR";
                    }
                    x4Var.a(str2);
                    if (tL_error4 != null && (str3 = tL_error4.text) != null) {
                        str = str3;
                    }
                    kc.c0(str);
                    break;
                } else if (vector.objects.size() <= 0) {
                    x4Var.a("NO_PROVIDERS");
                    kc.c0("NO_PROVIDERS");
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
                                createonrampsession.address = v0Var7.y();
                                createonrampsession.crypto_currency = "gram";
                                createonrampsession.base_currency = v0Var7.h.g();
                                createonrampsession.provider = onrampproviderinfo.id;
                                connectionsManager.sendRequestTyped(createonrampsession, new d3.b(c11 == true ? 1 : 0), new e(x4Var, i10));
                                break;
                            } else {
                                x4Var.a("NO_SUITABLE_PROVIDER");
                                kc.c0("NO_SUITABLE_PROVIDER");
                                break;
                            }
                        }
                    }
                    if (onrampproviderinfo == null) {
                    }
                }
                break;
            default:
                final e9 e9Var = (e9) obj5;
                final v0 v0Var8 = (v0) obj3;
                final Long l10 = (Long) obj;
                String str12 = (String) obj2;
                ((org.telegram.ui.ActionBar.t1) obj4).dismiss();
                if (l10 != null) {
                    Activity parentActivity = e9Var.getParentActivity();
                    if (parentActivity != null) {
                        final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, parentActivity, e9Var.getResourceProvider());
                        int i14 = org.telegram.ui.ActionBar.n6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(e9Var.getThemedColor(i14), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                        org.telegram.ui.ActionBar.i6 resourceProvider = e9Var.getResourceProvider();
                        d2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, resourceProvider);
                        d2Var.e(gd.N0(2131742698, null), "", false, false, false);
                        d2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        layoutParams.gravity = (gd.a0 ? 5 : 3) | 16;
                        d2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        d2Var.setPadding(gd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                        TextView textView = new TextView(parentActivity);
                        textView.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, e9Var.getResourceProvider());
                        textView.setGravity(17);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int i15 = org.telegram.ui.ActionBar.n6.a7;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, e9Var.getThemedColor(i15));
                        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i15);
                        org.telegram.ui.ActionBar.i6 resourceProvider2 = e9Var.getResourceProvider();
                        textView.setBackground(d02);
                        org.telegram.ui.ActionBar.u6.j(textView, d02, M2, null, resourceProvider2);
                        textView.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setText(l10.longValue() > 0 ? gd.V(null, null, 2131742696, v0.s(l10.longValue(), false), v0Var8.r(l10.longValue(), true)) : gd.N0(2131742697, null));
                        textView.setVisibility(8);
                        d2Var.setOnClickListener(new ig0(22, d2Var, textView));
                        LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, 1);
                        f10.addView(d2Var, c8.na.t(-1, -2, 83, 8, 0, 8, 0));
                        f10.addView(textView, c8.na.k(16.0f, 8.0f, 16.0f, 16.0f, -1, -2));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, e9Var.getResourceProvider());
                        String N0 = gd.N0(2131742880, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = gd.N0(2131742881, null);
                        t1Var.H = 6;
                        alertDialog$Builder.o(f10);
                        t1Var.a = org.telegram.messenger.g0.L(312.0f);
                        alertDialog$Builder.h(gd.N0(2131752577, null), null);
                        alertDialog$Builder.k(gd.N0(2131742885, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Wallet.b9
                            @Override // org.telegram.ui.ActionBar.q1
                            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i16) {
                                org.telegram.ui.Cells.d2 d2Var2 = d2Var;
                                if (d2Var2.isEnabled()) {
                                    boolean b11 = d2Var2.b();
                                    d2Var2.setEnabled(false);
                                    vf.b h = t1Var2.h(i16, true, true);
                                    h.d();
                                    e9 e9Var2 = e9.this;
                                    v0 v0Var9 = v0Var8;
                                    if (!b11) {
                                        v0Var9.F(false, true, false, new z8(e9Var2, h, v0Var9, 0));
                                        return;
                                    }
                                    long A = v0Var9.A();
                                    Long l11 = l10;
                                    if (A >= l11.longValue()) {
                                        z8 z8Var = new z8(e9Var2, h, v0Var9, 1);
                                        v0.P("prepare disable backup");
                                        v0Var9.F(true, false, false, new bi.r6(29, v0Var9, z8Var));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, e9Var2.getParentActivity(), e9Var2.getResourceProvider());
                                    String N02 = gd.N0(2131742814, null);
                                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
                                    t1Var3.S = N02;
                                    t1Var3.U = gd.V(null, null, 2131742695, v0.s(l11.longValue(), false), v0Var9.r(l11.longValue(), true));
                                    alertDialog$Builder2.h(gd.N0(2131742812, null), new ug.x(17));
                                    alertDialog$Builder2.k(gd.N0(2131742719, null), new i3(e9Var2, 6));
                                    alertDialog$Builder2.p();
                                }
                            }
                        });
                        e9Var.showDialog(t1Var);
                        TextView textView2 = (TextView) t1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, t1Var.j1);
                            break;
                        }
                    }
                } else {
                    kc.b0(e9Var).f0(str12 != null ? str12 : "NULL_ERROR", false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(v0 v0Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ j(v0 v0Var, t tVar, String str, String str2) {
        this.a = 4;
        this.b = tVar;
        this.d = str;
        this.c = str2;
    }

    public /* synthetic */ j(x4 x4Var, v0 v0Var, ConnectionsManager connectionsManager) {
        this.a = 10;
        this.d = x4Var;
        this.b = v0Var;
        this.c = connectionsManager;
    }

    public /* synthetic */ j(e9 e9Var, org.telegram.ui.ActionBar.t1 t1Var, v0 v0Var) {
        this.a = 11;
        this.d = e9Var;
        this.c = t1Var;
        this.b = v0Var;
    }
}
