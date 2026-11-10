package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ee;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.h10;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract class t2 {
    public static final ArrayList a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.r(user);
        k9Var.e(user, v8Var);
        linearLayout.addView(k9Var, c8.ha.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = d2.v(20, context, charSequence, h6Var);
        v.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(v, c8.ha.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String n10 = t10.n(user);
        if (TextUtils.isEmpty(n10)) {
            linearLayout.addView(new View(context), c8.ha.o(-1, 12));
            return;
        }
        linearLayout.addView(d2.h(context, "@" + n10, h6Var), c8.ha.t(-2, -2, 1, 36, 6, 36, 12));
    }

    public static void b(x2 x2Var, s2 s2Var) {
        x2Var.c0 = false;
        x2Var.y0 = new org.telegram.ui.h0(s2Var, 3);
        x2Var.setOnDismissListener(new k2(s2Var, 0));
        x2Var.show();
        org.telegram.messenger.g0.i3(new sb1(8, s2Var, x2Var), 700L);
    }

    public static void c(Context context, final int i7, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.h6 h6Var, q2 q2Var) {
        final l0 x10 = l0.x(i7);
        boolean equals = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
        final x2 x2Var = new x2(context, h6Var, new View[0]);
        x2Var.J0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, h6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, id.V(null, null, 2131743196, t10.p(user)), h6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.m6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(f10, d02, M, null, h6Var);
        TextView v = d2.v(14, context, id.M0(equals ? 2131743010 : 2131743184, null), h6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(v, equals ? org.telegram.ui.ActionBar.m6.L6 : org.telegram.ui.ActionBar.m6.q7, h6Var);
        f10.addView(v, c8.ha.k(0.0f, 0.0f, 0.0f, equals ? 12.0f : 4.0f, -1, -2));
        TextView v10 = d2.v(equals ? 14 : 16, context, equals ? jSONObject.optString("text") : id.M0(2131743183, null), h6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        f10.addView(v10, c8.ha.o(-1, -2));
        p2 p2Var = new p2(context, qs.r5);
        p2Var.addView(f10);
        linearLayout.addView(p2Var, c8.ha.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        w2 w2Var = new w2(context);
        w2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
        x2Var.I0(w2Var);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        if (equals) {
            TextView v11 = d2.v(14, context, id.M0(2131743029, null), h6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.t6.U(v11, org.telegram.ui.ActionBar.m6.z6, h6Var);
            f11.addView(v11, c8.ha.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        fi.d dVar = new fi.d(context, h6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(id.M0(2131752589, null));
        final fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        h.setText(id.M0(2131743012, null));
        linearLayout2.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
        f11.addView(linearLayout2);
        x2Var.K0(f11);
        final s2 s2Var = new s2(x2Var, q2Var);
        final g gVar = new g(s2Var, h, dVar, 9);
        s2Var.g = gVar;
        dVar.setOnClickListener(new g2(s2Var, 1));
        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final s2 s2Var2 = s2Var;
                if (s2Var2.a() || s2Var2.d) {
                    return;
                }
                s2Var2.d = true;
                final fi.d dVar2 = h;
                dVar2.setLoading(true);
                final g gVar2 = gVar;
                gVar2.run();
                final int i11 = i7;
                final String str2 = str;
                final JSONObject jSONObject2 = jSONObject;
                final TLRPC.User user2 = user;
                final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                final l0 l0Var = x10;
                final x2 x2Var2 = x2Var;
                final byte[] bArr2 = bArr;
                l0Var.z(new v10() { // from class: org.telegram.ui.Wallet.i2
                    @Override // org.telegram.messenger.v10
                    public final void a(Object obj, Object obj2) {
                        s2 s2Var3 = s2Var2;
                        fi.d dVar3 = dVar2;
                        x2 x2Var3 = x2Var2;
                        org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                        g gVar3 = gVar2;
                        l0 l0Var2 = l0Var;
                        String str3 = str2;
                        byte[] bArr3 = bArr2;
                        int i12 = i11;
                        TLRPC.User user3 = user2;
                        JSONObject jSONObject3 = jSONObject2;
                        i0 i0Var = (i0) obj;
                        String str4 = (String) obj2;
                        if (s2Var3.e) {
                            return;
                        }
                        if (i0Var == null || str4 != null) {
                            s2Var3.d = false;
                            dVar3.setLoading(false);
                            if (str4 != null) {
                                gc.c0(str4, x2Var3.E, h6Var3);
                            }
                            gVar3.run();
                            return;
                        }
                        if (str3.equals(l0Var2.t()) && Arrays.equals(bArr3, l0Var2.y())) {
                            Utilities.e.c(new ee(i0Var.b(), str3, bArr3, jSONObject3, "bot" + user3.id, ConnectionsManager.getInstance(i12).getCurrentTime(), s2Var3, l0Var2));
                            return;
                        }
                        gc.b0(id.M0(2131742959, null));
                        s2Var3.d = false;
                        if (!s2Var3.f) {
                            s2Var3.f = true;
                            s2Var3.b.a();
                        }
                        if (s2Var3.e) {
                            return;
                        }
                        s2Var3.a.dismiss();
                    }
                }, true, false);
            }
        });
        b(x2Var, s2Var);
        gVar.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.messenger.ls, org.telegram.ui.Wallet.e2] */
    public static void d(Context context, final int i7, final TLRPC.User user, final c2 c2Var, final String str, final byte[] bArr, org.telegram.ui.ActionBar.h6 h6Var, q2 q2Var) {
        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
        final l0 x10 = l0.x(i7);
        char c10 = 0;
        final x2 x2Var = new x2(context, h6Var2, new View[0]);
        x2Var.J0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, h6Var2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, id.V(null, null, 2131743195, t10.p(user)), h6Var2);
        i6 i6Var = new i6(context, R.drawable.wallet_card_info, 24);
        i6Var.getCardHolderView().setMaxLines(2);
        i6Var.getCardHolderView().setSingleLine(false);
        List<b2> list = c2Var.b;
        i6Var.setCardHolder(g8.c0(((b2) list.get(0)).a));
        org.telegram.ui.Components.i6 balanceView = i6Var.getBalanceView();
        long j3 = c2Var.c;
        balanceView.setText(d2.k(j3));
        i6Var.getUsdBalanceView().setText(x10.m(j3, false));
        linearLayout.addView(i6Var, c8.ha.o(-1, -2));
        LinearLayout F = d2.F(context, id.M0(2131743207, null), h6Var2);
        for (b2 b2Var : list) {
            String M0 = id.M0((b2Var.b == null || b2Var.d != null) ? 2131742981 : 2131743153, null);
            Object[] objArr = new Object[1];
            objArr[c10] = d2.C(b2Var.a);
            org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(d2.c(context, M0, id.V(null, null, 2131742976, objArr), d2.b(-b2Var.e), b2Var.d, h6Var3), c8.ha.o(-1, -2));
            F = linearLayout2;
            h6Var2 = h6Var3;
            c10 = 0;
        }
        final org.telegram.ui.ActionBar.h6 h6Var4 = h6Var2;
        LinearLayout linearLayout3 = F;
        p2 p2Var = new p2(context, qs.P3);
        p2Var.addView(linearLayout3);
        linearLayout.addView(p2Var, c8.ha.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        w2 w2Var = new w2(context);
        w2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
        x2Var.I0(w2Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView v = d2.v(14, context, null, h6Var4);
        org.telegram.ui.ActionBar.t6.U(v, org.telegram.ui.ActionBar.m6.z6, h6Var4);
        f10.addView(v, c8.ha.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        fi.d dVar = new fi.d(context, h6Var4, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(id.M0(2131743143, null));
        linearLayout4.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
        final fi.d h = org.telegram.messenger.k5.h(24, context, h6Var4, true);
        h.setText(id.M0(2131743168, null));
        linearLayout4.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
        f10.addView(linearLayout4);
        x2Var.K0(f10);
        final s2 s2Var = new s2(x2Var, q2Var);
        final int[] iArr = {0};
        final h7 h7Var = new h7(s2Var, h, iArr, dVar, 10);
        final Runnable[] runnableArr = {new bi.a3(s2Var, iArr, v, h7Var, x10, c2Var, 23)};
        ?? r02 = new ls() { // from class: org.telegram.ui.Wallet.e2
            @Override // org.telegram.messenger.ls
            public final void didReceivedNotification(int i10, int i11, Object[] objArr2) {
                if (iArr[0] != 2 || x10.v() < c2Var.c) {
                    return;
                }
                runnableArr[0].run();
            }
        };
        qs.f(i7).b(r02, qs.a4);
        s2Var.h = new f2(i7, r02);
        s2Var.g = h7Var;
        dVar.setOnClickListener(new g2(s2Var, 0));
        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final s2 s2Var2 = s2.this;
                if (s2Var2.a() || s2Var2.d) {
                    return;
                }
                int i10 = iArr[0];
                final int i11 = i7;
                final l0 l0Var = x10;
                if (i10 == 2) {
                    l0Var.v();
                    di.e eVar = new di.e(25);
                    l0 x11 = l0.x(i11);
                    x11.m0(new h10(i11, eVar, x11));
                    return;
                }
                if (i10 != 1) {
                    return;
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final c2 c2Var2 = c2Var;
                long j10 = c2Var2.a;
                if (j10 != 0 && j10 <= connectionsManager.getCurrentTime()) {
                    gc.b0(id.M0(2131742958, null));
                    s2Var2.d = false;
                    if (!s2Var2.f) {
                        s2Var2.f = true;
                        s2Var2.b.a();
                    }
                    if (s2Var2.e) {
                        return;
                    }
                    s2Var2.a.dismiss();
                    return;
                }
                s2Var2.d = true;
                fi.d dVar2 = h;
                dVar2.setLoading(true);
                h7 h7Var2 = h7Var;
                h7Var2.run();
                final x2 x2Var2 = x2Var;
                final org.telegram.ui.ActionBar.h6 h6Var5 = h6Var4;
                final bi.z2 z2Var = new bi.z2(s2Var2, dVar2, x2Var2, h6Var5, h7Var2, 6);
                final String str2 = str;
                final byte[] bArr2 = bArr;
                final TLRPC.User user2 = user;
                l0Var.z(new v10() { // from class: org.telegram.ui.Wallet.j2
                    @Override // org.telegram.messenger.v10
                    public final void a(Object obj, Object obj2) {
                        final s2 s2Var3 = s2.this;
                        bi.z2 z2Var2 = z2Var;
                        final l0 l0Var2 = l0Var;
                        final String str3 = str2;
                        final byte[] bArr3 = bArr2;
                        final c2 c2Var3 = c2Var2;
                        final TLRPC.User user3 = user2;
                        final int i12 = i11;
                        final x2 x2Var3 = x2Var2;
                        final org.telegram.ui.ActionBar.h6 h6Var6 = h6Var5;
                        i0 i0Var = (i0) obj;
                        String str4 = (String) obj2;
                        if (s2Var3.e) {
                            return;
                        }
                        if (i0Var == null || str4 != null) {
                            z2Var2.a(str4);
                            return;
                        }
                        if (str3.equals(l0Var2.t()) && Arrays.equals(bArr3, l0Var2.y())) {
                            final WalletEngine2 walletEngine2 = l0Var2.b;
                            if (walletEngine2 == null) {
                                z2Var2.a(id.M0(2131742959, null));
                                return;
                            } else {
                                final i0 b10 = i0Var.b();
                                Utilities.e.c(new Runnable() { // from class: org.telegram.ui.Wallet.l2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final i0 i0Var2 = i0.this;
                                        final String str5 = str3;
                                        final byte[] bArr4 = bArr3;
                                        final byte[] f11 = t2.f(i0Var2, str5, bArr4);
                                        final s2 s2Var4 = s2Var3;
                                        final WalletEngine2 walletEngine22 = walletEngine2;
                                        final c2 c2Var4 = c2Var3;
                                        final TLRPC.User user4 = user3;
                                        final int i13 = i12;
                                        final l0 l0Var3 = l0Var2;
                                        final x2 x2Var4 = x2Var3;
                                        final org.telegram.ui.ActionBar.h6 h6Var7 = h6Var6;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Wallet.m2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final s2 s2Var5 = s2.this;
                                                WalletEngine2 walletEngine23 = walletEngine22;
                                                i0 i0Var3 = i0Var2;
                                                c2 c2Var5 = c2Var4;
                                                TLRPC.User user5 = user4;
                                                final int i14 = i13;
                                                final l0 l0Var4 = l0Var3;
                                                final x2 x2Var5 = x2Var4;
                                                final String str6 = str5;
                                                final byte[] bArr5 = bArr4;
                                                final byte[] bArr6 = f11;
                                                final org.telegram.ui.ActionBar.h6 h6Var8 = h6Var7;
                                                try {
                                                    if (s2Var5.e) {
                                                        return;
                                                    }
                                                    walletEngine23.prepareTonConnectTransfer(i0Var3, c2Var5, "widget:" + user5.id + ":" + Utilities.b.nextLong(), new v10(i14, l0Var4, x2Var5, s2Var5, str6, bArr5, bArr6, h6Var8) { // from class: org.telegram.ui.Wallet.n2
                                                        public final /* synthetic */ int a;
                                                        public final /* synthetic */ l0 b;
                                                        public final /* synthetic */ s2 c;
                                                        public final /* synthetic */ String d;
                                                        public final /* synthetic */ byte[] e;
                                                        public final /* synthetic */ byte[] f;

                                                        {
                                                            this.c = s2Var5;
                                                            this.d = str6;
                                                            this.e = bArr5;
                                                            this.f = bArr6;
                                                        }

                                                        @Override // org.telegram.messenger.v10
                                                        public final void a(Object obj3, Object obj4) {
                                                            TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                                            String str7 = (String) obj4;
                                                            s2 s2Var6 = this.c;
                                                            if (!s2Var6.e || s2Var6.d) {
                                                                if (sendtransfer != null) {
                                                                    int i15 = this.a;
                                                                    ConnectionsManager.getInstance(i15).sendRequestTyped(sendtransfer, new d3.b(1), new org.telegram.messenger.f9(i15, this.b, this.d, this.e, this.f, sendtransfer, s2Var6));
                                                                    return;
                                                                }
                                                                if (str7 == null) {
                                                                    str7 = id.M0(2131742986, null);
                                                                }
                                                                gc.b0(str7);
                                                                s2Var6.d = false;
                                                                if (!s2Var6.f) {
                                                                    s2Var6.f = true;
                                                                    s2Var6.b.a();
                                                                }
                                                                if (s2Var6.e) {
                                                                    return;
                                                                }
                                                                s2Var6.a.dismiss();
                                                            }
                                                        }
                                                    });
                                                } finally {
                                                    i0Var3.close();
                                                }
                                            }
                                        });
                                    }
                                });
                                return;
                            }
                        }
                        gc.b0(id.M0(2131742959, null));
                        s2Var3.d = false;
                        if (!s2Var3.f) {
                            s2Var3.f = true;
                            s2Var3.b.a();
                        }
                        if (s2Var3.e) {
                            return;
                        }
                        s2Var3.a.dismiss();
                    }
                }, true, false);
            }
        });
        b(x2Var, s2Var);
        runnableArr[0].run();
    }

    public static TL_wallet.tonConnectSession e() {
        TL_wallet.tonConnectSession tonconnectsession = new TL_wallet.tonConnectSession();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = Utilities.b;
        secureRandom.nextBytes(bArr);
        tonconnectsession.dapp_client_id = Utilities.f(bArr).toLowerCase(Locale.ROOT);
        byte[] bArr2 = new byte[32];
        tonconnectsession.nonce = bArr2;
        secureRandom.nextBytes(bArr2);
        return tonconnectsession;
    }

    public static byte[] f(i0 i0Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(i0Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }
}
