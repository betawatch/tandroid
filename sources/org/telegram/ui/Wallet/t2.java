package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.wf;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.yd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ma1;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t2 {
    public static final ArrayList a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.r(user);
        k9Var.e(user, u8Var);
        linearLayout.addView(k9Var, mf.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = c2.v(20, context, charSequence, e6Var);
        v.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(v, mf.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String n4 = l10.n(user);
        if (TextUtils.isEmpty(n4)) {
            linearLayout.addView(new View(context), mf.o(-1, 12));
            return;
        }
        linearLayout.addView(c2.h(context, "@" + n4, e6Var), mf.t(-2, -2, 1, 36, 6, 36, 12));
    }

    public static void b(x2 x2Var, s2 s2Var) {
        x2Var.d0 = false;
        x2Var.z0 = new org.telegram.ui.i0(s2Var, 3);
        x2Var.setOnDismissListener(new k2(s2Var, 0));
        x2Var.show();
        org.telegram.messenger.g0.i3(new ma1(11, s2Var, x2Var), 700L);
    }

    public static void c(Context context, final int i3, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.e6 e6Var, q2 q2Var) {
        final k0 x10 = k0.x(i3);
        boolean equals = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
        final x2 x2Var = new x2(context, e6Var, new View[0]);
        x2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        int i10 = 1;
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, bd.V(null, null, 2131743206, l10.p(user)), e6Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f10, d02, N, null, e6Var);
        TextView v = c2.v(14, context, bd.M0(equals ? 2131743020 : 2131743194, null), e6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(v, equals ? org.telegram.ui.ActionBar.k6.L6 : org.telegram.ui.ActionBar.k6.q7, e6Var);
        f10.addView(v, mf.k(0.0f, 0.0f, 0.0f, equals ? 12.0f : 4.0f, -1, -2));
        TextView v10 = c2.v(equals ? 14 : 16, context, equals ? jSONObject.optString("text") : bd.M0(2131743193, null), e6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        f10.addView(v10, mf.o(-1, -2));
        p2 p2Var = new p2(context, hs.r5);
        p2Var.addView(f10);
        linearLayout.addView(p2Var, mf.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        w2 w2Var = new w2(context);
        w2Var.getContent().addView(linearLayout, mf.c(-2.0f, -1));
        x2Var.I0(w2Var);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        if (equals) {
            TextView v11 = c2.v(14, context, bd.M0(2131743039, null), e6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.r6.V(v11, org.telegram.ui.ActionBar.k6.z6, e6Var);
            f11.addView(v11, mf.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(bd.M0(2131752589, null));
        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.setText(bd.M0(2131743022, null));
        linearLayout2.addView(dVar, mf.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(h, mf.m(1.0f, 0, 44, 6, 0, 0));
        f11.addView(linearLayout2);
        x2Var.K0(f11);
        final s2 s2Var = new s2(x2Var, q2Var);
        final g gVar = new g(s2Var, h, dVar, 9);
        s2Var.g = gVar;
        dVar.setOnClickListener(new g2(s2Var, i10));
        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final s2 s2Var2 = s2Var;
                if (s2Var2.a() || s2Var2.d) {
                    return;
                }
                s2Var2.d = true;
                final gi.d dVar2 = h;
                dVar2.setLoading(true);
                final g gVar2 = gVar;
                gVar2.run();
                final int i12 = i3;
                final String str2 = str;
                final JSONObject jSONObject2 = jSONObject;
                final TLRPC.User user2 = user;
                final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                final k0 k0Var = x10;
                final x2 x2Var2 = x2Var;
                final byte[] bArr2 = bArr;
                k0Var.z(new n10() { // from class: org.telegram.ui.Wallet.i2
                    @Override // org.telegram.messenger.n10
                    public final void a(Object obj, Object obj2) {
                        s2 s2Var3 = s2Var2;
                        gi.d dVar3 = dVar2;
                        x2 x2Var3 = x2Var2;
                        org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                        g gVar3 = gVar2;
                        k0 k0Var2 = k0Var;
                        String str3 = str2;
                        byte[] bArr3 = bArr2;
                        int i13 = i12;
                        TLRPC.User user3 = user2;
                        JSONObject jSONObject3 = jSONObject2;
                        h0 h0Var = (h0) obj;
                        String str4 = (String) obj2;
                        if (s2Var3.e) {
                            return;
                        }
                        if (h0Var == null || str4 != null) {
                            s2Var3.d = false;
                            dVar3.setLoading(false);
                            if (str4 != null) {
                                fc.c0(str4, x2Var3.F, e6Var3);
                            }
                            gVar3.run();
                            return;
                        }
                        if (str3.equals(k0Var2.t()) && Arrays.equals(bArr3, k0Var2.y())) {
                            Utilities.e.c(new yd(h0Var.b(), str3, bArr3, jSONObject3, "bot" + user3.id, ConnectionsManager.getInstance(i13).getCurrentTime(), s2Var3, k0Var2));
                            return;
                        }
                        fc.b0(bd.M0(2131742969, null));
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
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.messenger.cs, org.telegram.ui.Wallet.e2] */
    public static void d(Context context, final int i3, final TLRPC.User user, final b2 b2Var, final String str, final byte[] bArr, org.telegram.ui.ActionBar.e6 e6Var, q2 q2Var) {
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        final k0 x10 = k0.x(i3);
        char c2 = 0;
        final x2 x2Var = new x2(context, e6Var2, new View[0]);
        x2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, bd.V(null, null, 2131743205, l10.p(user)), e6Var2);
        f6 f6Var = new f6(context, R.drawable.wallet_card_info, 24);
        f6Var.getCardHolderView().setMaxLines(2);
        f6Var.getCardHolderView().setSingleLine(false);
        List<a2> list = b2Var.b;
        f6Var.setCardHolder(e8.c0(((a2) list.get(0)).a));
        org.telegram.ui.Components.h6 balanceView = f6Var.getBalanceView();
        long j10 = b2Var.c;
        balanceView.setText(c2.k(j10));
        f6Var.getUsdBalanceView().setText(x10.m(j10, false));
        linearLayout.addView(f6Var, mf.o(-1, -2));
        LinearLayout F = c2.F(context, bd.M0(2131743217, null), e6Var2);
        for (a2 a2Var : list) {
            String M0 = bd.M0((a2Var.b == null || a2Var.d != null) ? 2131742991 : 2131743163, null);
            Object[] objArr = new Object[1];
            objArr[c2] = c2.C(a2Var.a);
            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(c2.c(context, M0, bd.V(null, null, 2131742986, objArr), c2.b(-a2Var.e), a2Var.d, e6Var3), mf.o(-1, -2));
            F = linearLayout2;
            e6Var2 = e6Var3;
            c2 = 0;
        }
        final org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
        LinearLayout linearLayout3 = F;
        p2 p2Var = new p2(context, hs.P3);
        p2Var.addView(linearLayout3);
        linearLayout.addView(p2Var, mf.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        w2 w2Var = new w2(context);
        w2Var.getContent().addView(linearLayout, mf.c(-2.0f, -1));
        x2Var.I0(w2Var);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView v = c2.v(14, context, null, e6Var4);
        org.telegram.ui.ActionBar.r6.V(v, org.telegram.ui.ActionBar.k6.z6, e6Var4);
        f10.addView(v, mf.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        gi.d dVar = new gi.d(context, e6Var4, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(bd.M0(2131743153, null));
        linearLayout4.addView(dVar, mf.m(1.0f, 0, 44, 0, 6, 0));
        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var4, true);
        h.setText(bd.M0(2131743178, null));
        linearLayout4.addView(h, mf.m(1.0f, 0, 44, 6, 0, 0));
        f10.addView(linearLayout4);
        x2Var.K0(f10);
        final s2 s2Var = new s2(x2Var, q2Var);
        final int[] iArr = {0};
        final e7 e7Var = new e7(s2Var, h, iArr, dVar, 10);
        final Runnable[] runnableArr = {new ai.w1(s2Var, iArr, v, e7Var, x10, b2Var, 24)};
        ?? r02 = new cs() { // from class: org.telegram.ui.Wallet.e2
            @Override // org.telegram.messenger.cs
            public final void didReceivedNotification(int i10, int i11, Object[] objArr2) {
                if (iArr[0] != 2 || x10.v() < b2Var.c) {
                    return;
                }
                runnableArr[0].run();
            }
        };
        hs.f(i3).b(r02, hs.a4);
        s2Var.h = new f2(i3, r02);
        s2Var.g = e7Var;
        dVar.setOnClickListener(new g2(s2Var, 0));
        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final s2 s2Var2 = s2.this;
                if (s2Var2.a() || s2Var2.d) {
                    return;
                }
                int i10 = iArr[0];
                final int i11 = i3;
                final k0 k0Var = x10;
                if (i10 == 2) {
                    k0Var.v();
                    ei.e eVar = new ei.e(22);
                    k0 x11 = k0.x(i11);
                    x11.m0(new rw(i11, eVar, x11));
                    return;
                }
                if (i10 != 1) {
                    return;
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final b2 b2Var2 = b2Var;
                long j11 = b2Var2.a;
                if (j11 != 0 && j11 <= connectionsManager.getCurrentTime()) {
                    fc.b0(bd.M0(2131742968, null));
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
                gi.d dVar2 = h;
                dVar2.setLoading(true);
                e7 e7Var2 = e7Var;
                e7Var2.run();
                final x2 x2Var2 = x2Var;
                final org.telegram.ui.ActionBar.e6 e6Var5 = e6Var4;
                final ci.o2 o2Var = new ci.o2(s2Var2, dVar2, x2Var2, e6Var5, e7Var2, 6);
                final String str2 = str;
                final byte[] bArr2 = bArr;
                final TLRPC.User user2 = user;
                k0Var.z(new n10() { // from class: org.telegram.ui.Wallet.j2
                    @Override // org.telegram.messenger.n10
                    public final void a(Object obj, Object obj2) {
                        final s2 s2Var3 = s2.this;
                        ci.o2 o2Var2 = o2Var;
                        final k0 k0Var2 = k0Var;
                        final String str3 = str2;
                        final byte[] bArr3 = bArr2;
                        final b2 b2Var3 = b2Var2;
                        final TLRPC.User user3 = user2;
                        final int i12 = i11;
                        final x2 x2Var3 = x2Var2;
                        final org.telegram.ui.ActionBar.e6 e6Var6 = e6Var5;
                        h0 h0Var = (h0) obj;
                        String str4 = (String) obj2;
                        if (s2Var3.e) {
                            return;
                        }
                        if (h0Var == null || str4 != null) {
                            o2Var2.a(str4);
                            return;
                        }
                        if (str3.equals(k0Var2.t()) && Arrays.equals(bArr3, k0Var2.y())) {
                            final WalletEngine2 walletEngine2 = k0Var2.b;
                            if (walletEngine2 == null) {
                                o2Var2.a(bd.M0(2131742969, null));
                                return;
                            } else {
                                final h0 b10 = h0Var.b();
                                Utilities.e.c(new Runnable() { // from class: org.telegram.ui.Wallet.l2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final h0 h0Var2 = h0.this;
                                        final String str5 = str3;
                                        final byte[] bArr4 = bArr3;
                                        final byte[] f11 = t2.f(h0Var2, str5, bArr4);
                                        final s2 s2Var4 = s2Var3;
                                        final WalletEngine2 walletEngine22 = walletEngine2;
                                        final b2 b2Var4 = b2Var3;
                                        final TLRPC.User user4 = user3;
                                        final int i13 = i12;
                                        final k0 k0Var3 = k0Var2;
                                        final x2 x2Var4 = x2Var3;
                                        final org.telegram.ui.ActionBar.e6 e6Var7 = e6Var6;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Wallet.m2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final s2 s2Var5 = s2.this;
                                                WalletEngine2 walletEngine23 = walletEngine22;
                                                h0 h0Var3 = h0Var2;
                                                b2 b2Var5 = b2Var4;
                                                TLRPC.User user5 = user4;
                                                final int i14 = i13;
                                                final k0 k0Var4 = k0Var3;
                                                final x2 x2Var5 = x2Var4;
                                                final String str6 = str5;
                                                final byte[] bArr5 = bArr4;
                                                final byte[] bArr6 = f11;
                                                final org.telegram.ui.ActionBar.e6 e6Var8 = e6Var7;
                                                try {
                                                    if (s2Var5.e) {
                                                        return;
                                                    }
                                                    walletEngine23.prepareTonConnectTransfer(h0Var3, b2Var5, "widget:" + user5.id + ":" + Utilities.b.nextLong(), new n10(i14, k0Var4, x2Var5, s2Var5, str6, bArr5, bArr6, e6Var8) { // from class: org.telegram.ui.Wallet.n2
                                                        public final /* synthetic */ int a;
                                                        public final /* synthetic */ k0 b;
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

                                                        @Override // org.telegram.messenger.n10
                                                        public final void a(Object obj3, Object obj4) {
                                                            final TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                                            String str7 = (String) obj4;
                                                            final s2 s2Var6 = this.c;
                                                            if (!s2Var6.e || s2Var6.d) {
                                                                if (sendtransfer != null) {
                                                                    final int i15 = this.a;
                                                                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i15);
                                                                    c3.b bVar = new c3.b(1);
                                                                    final k0 k0Var5 = this.b;
                                                                    final String str8 = this.d;
                                                                    final byte[] bArr7 = this.e;
                                                                    final byte[] bArr8 = this.f;
                                                                    connectionsManager2.sendRequestTyped(sendtransfer, bVar, new n10() { // from class: org.telegram.ui.Wallet.d2
                                                                        /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
                                                                        
                                                                            r1 = new byte[35];
                                                                            b8.wf.c(0, r1);
                                                                            r10 = 0;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:102:0x01b5, code lost:
                                                                        
                                                                            if (r10 >= 267) goto L125;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:103:0x01b7, code lost:
                                                                        
                                                                            r12 = r10 + 4;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:104:0x01bf, code lost:
                                                                        
                                                                            if (b8.wf.a(r12, r6[r3]) == false) goto L127;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
                                                                        
                                                                            b8.wf.c(r12, r1);
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:107:0x01c4, code lost:
                                                                        
                                                                            r10 = r10 + 1;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:110:0x01c7, code lost:
                                                                        
                                                                            b8.wf.c(org.telegram.messenger.hs.z4, r1);
                                                                            b8.wf.c(org.telegram.messenger.hs.A4, r1);
                                                                            r3 = java.security.MessageDigest.getInstance("SHA-256");
                                                                            r3.update(r19);
                                                                            r3.update((byte) 69);
                                                                            r3.update(r1);
                                                                            r3.update((byte) (r4[r0] >> 8));
                                                                            r3.update((byte) r4[r0]);
                                                                            r3.update(r5[r0]);
                                                                            r11 = org.telegram.messenger.Utilities.f(r3.digest()).toLowerCase(java.util.Locale.ROOT);
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:83:0x012f, code lost:
                                                                        
                                                                            r17 = 2;
                                                                            r4 = new int[r13];
                                                                            r5 = new byte[r13][];
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:84:0x0137, code lost:
                                                                        
                                                                            r13 = r13 - 1;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:86:0x013a, code lost:
                                                                        
                                                                            if (r13 < 0) goto L122;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:87:0x013c, code lost:
                                                                        
                                                                            r9 = java.security.MessageDigest.getInstance("SHA-256");
                                                                            r9.update((byte) r10[r13].length);
                                                                            r9.update((byte) r14[r13]);
                                                                            r9.update(r6[r13]);
                                                                            r11 = r10[r13];
                                                                            r12 = r11.length;
                                                                            r15 = 0;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:88:0x0156, code lost:
                                                                        
                                                                            if (r15 >= r12) goto L123;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:89:0x0158, code lost:
                                                                        
                                                                            r18 = r11[r15];
                                                                            r4[r13] = java.lang.Math.max(r4[r13], r4[r18] + 1);
                                                                            r9.update((byte) (r4[r18] >> 8));
                                                                            r9.update((byte) r4[r18]);
                                                                            r15 = r15 + 1;
                                                                            r1 = r1;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:91:0x017d, code lost:
                                                                        
                                                                            r19 = r1;
                                                                            r0 = r10[r13];
                                                                            r1 = r0.length;
                                                                            r11 = 0;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:92:0x0183, code lost:
                                                                        
                                                                            if (r11 >= r1) goto L124;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:93:0x0185, code lost:
                                                                        
                                                                            r9.update(r5[r0[r11]]);
                                                                            r11 = r11 + 1;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:95:0x018f, code lost:
                                                                        
                                                                            r5[r13] = r9.digest();
                                                                            r13 = r13 - 1;
                                                                            r1 = r19;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:97:0x019c, code lost:
                                                                        
                                                                            r19 = r1;
                                                                            r0 = b8.wf.b(r6[r3], r10[r3]);
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:98:0x01a6, code lost:
                                                                        
                                                                            if (r0 >= 0) goto L76;
                                                                         */
                                                                        @Override // org.telegram.messenger.n10
                                                                        /*
                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                        */
                                                                        public final void a(Object obj5, Object obj6) {
                                                                            TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction;
                                                                            int i16;
                                                                            String str9;
                                                                            ByteBuffer wrap;
                                                                            int i17 = i15;
                                                                            k0 k0Var6 = k0Var5;
                                                                            String str10 = str8;
                                                                            byte[] bArr9 = bArr7;
                                                                            byte[] bArr10 = bArr8;
                                                                            TL_wallet.sendTransfer sendtransfer2 = sendtransfer;
                                                                            s2 s2Var7 = s2Var6;
                                                                            TLRPC.Updates updates = (TLRPC.Updates) obj5;
                                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                                                                            if (updates != null) {
                                                                                TLRPC.Update update = updates.update;
                                                                                tL_updateSentWalletTransaction = update instanceof TL_update.TL_updateSentWalletTransaction ? (TL_update.TL_updateSentWalletTransaction) update : null;
                                                                                ArrayList<TLRPC.Update> arrayList = updates.updates;
                                                                                int size = arrayList.size();
                                                                                int i18 = 0;
                                                                                while (i18 < size) {
                                                                                    TLRPC.Update update2 = arrayList.get(i18);
                                                                                    i18++;
                                                                                    TLRPC.Update update3 = update2;
                                                                                    if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                                                                                        tL_updateSentWalletTransaction = (TL_update.TL_updateSentWalletTransaction) update3;
                                                                                    }
                                                                                }
                                                                                Utilities.d.c(new org.telegram.tgnet.g(i17, updates, 2));
                                                                            } else {
                                                                                tL_updateSentWalletTransaction = null;
                                                                            }
                                                                            if (tL_error != null && "WALLET_KEY_MISMATCH".equals(tL_error.text)) {
                                                                                k0Var6.E();
                                                                            }
                                                                            byte b11 = 1;
                                                                            if (tL_updateSentWalletTransaction == null || TextUtils.isEmpty(tL_updateSentWalletTransaction.msg_hash)) {
                                                                                fc.b0(c2.z(tL_error, "widget sendTransfer"));
                                                                                ei.e eVar2 = (tL_error == null || tL_error.code != 400) ? new ei.e(24) : new ei.e(23);
                                                                                s2Var7.d = false;
                                                                                if (!s2Var7.f) {
                                                                                    s2Var7.f = true;
                                                                                    eVar2.a(s2Var7.b);
                                                                                }
                                                                                if (s2Var7.e) {
                                                                                    return;
                                                                                }
                                                                                s2Var7.a.dismiss();
                                                                                return;
                                                                            }
                                                                            TLRPC.TL_widgetQueryTypeSentTransaction tL_widgetQueryTypeSentTransaction = new TLRPC.TL_widgetQueryTypeSentTransaction();
                                                                            TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                                                                            tL_userWallet.address = str10;
                                                                            tL_userWallet.balance = k0Var6.v();
                                                                            if (bArr10 != null) {
                                                                                tL_userWallet.public_key = bArr9;
                                                                                tL_userWallet.state_init = bArr10;
                                                                            }
                                                                            tL_widgetQueryTypeSentTransaction.wallet = tL_userWallet;
                                                                            String str11 = tL_updateSentWalletTransaction.msg_hash;
                                                                            byte[] bArr11 = sendtransfer2.data_normal;
                                                                            try {
                                                                                wrap = ByteBuffer.wrap(bArr11);
                                                                            } catch (RuntimeException | NoSuchAlgorithmException unused) {
                                                                            }
                                                                            if (wrap.getInt() != -1242653582) {
                                                                                str9 = null;
                                                                                i16 = 2;
                                                                            } else {
                                                                                byte b12 = wrap.get();
                                                                                int i19 = b12 & 7;
                                                                                int i20 = wrap.get() & 255;
                                                                                if (i19 >= 1) {
                                                                                    int i21 = 4;
                                                                                    if (i19 <= 4 && i20 >= 1) {
                                                                                        char c10 = '\b';
                                                                                        if (i20 <= 8) {
                                                                                            int d = (int) wf.d(i19, wrap);
                                                                                            long d10 = wf.d(i19, wrap);
                                                                                            wf.d(i19, wrap);
                                                                                            wf.d(i20, wrap);
                                                                                            if (d10 == 1 && d >= 1 && d <= bArr11.length) {
                                                                                                int d11 = (int) wf.d(i19, wrap);
                                                                                                if ((b12 & 128) != 0) {
                                                                                                    wrap.position((i20 * d) + wrap.position());
                                                                                                }
                                                                                                byte[][] bArr12 = new byte[d][];
                                                                                                int[][] iArr2 = new int[d][];
                                                                                                int[] iArr3 = new int[d];
                                                                                                int i22 = 0;
                                                                                                loop1: while (true) {
                                                                                                    if (i22 >= d) {
                                                                                                        break;
                                                                                                    }
                                                                                                    char c11 = c10;
                                                                                                    int i23 = wrap.get() & 255;
                                                                                                    i16 = 2;
                                                                                                    try {
                                                                                                        int i24 = wrap.get() & 255;
                                                                                                        if (i23 > i21) {
                                                                                                            break;
                                                                                                        }
                                                                                                        iArr3[i22] = i24;
                                                                                                        byte[] bArr13 = new byte[(i24 + 1) / 2];
                                                                                                        bArr12[i22] = bArr13;
                                                                                                        wrap.get(bArr13);
                                                                                                        iArr2[i22] = new int[i23];
                                                                                                        int i25 = 0;
                                                                                                        while (i25 < i23) {
                                                                                                            int i26 = i23;
                                                                                                            iArr2[i22][i25] = (int) wf.d(i19, wrap);
                                                                                                            int i27 = iArr2[i22][i25];
                                                                                                            if (i27 <= i22 || i27 >= d) {
                                                                                                                break loop1;
                                                                                                            }
                                                                                                            i25++;
                                                                                                            i23 = i26;
                                                                                                        }
                                                                                                        i22++;
                                                                                                        c10 = c11;
                                                                                                        i21 = 4;
                                                                                                    } catch (RuntimeException | NoSuchAlgorithmException unused2) {
                                                                                                    }
                                                                                                }
                                                                                                str9 = null;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i16 = 2;
                                                                                str9 = null;
                                                                            }
                                                                            if (str9 != null) {
                                                                                str11 = Base64.encodeToString(Utilities.v(str9), i16);
                                                                            }
                                                                            tL_widgetQueryTypeSentTransaction.msg_hash = str11;
                                                                            s2Var7.d = false;
                                                                            if (!s2Var7.f) {
                                                                                s2Var7.f = true;
                                                                                s2Var7.b.d(tL_widgetQueryTypeSentTransaction);
                                                                            }
                                                                            if (s2Var7.e) {
                                                                                return;
                                                                            }
                                                                            s2Var7.a.dismiss();
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                                if (str7 == null) {
                                                                    str7 = bd.M0(2131742996, null);
                                                                }
                                                                fc.b0(str7);
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
                                                    h0Var3.close();
                                                }
                                            }
                                        });
                                    }
                                });
                                return;
                            }
                        }
                        fc.b0(bd.M0(2131742969, null));
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

    public static byte[] f(h0 h0Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(h0Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }
}
