package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ce;
import org.telegram.messenger.h20;
import org.telegram.messenger.j20;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.qq;
import org.telegram.ui.t11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class u2 {
    public static final ArrayList a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(38.0f));
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.r(user);
        g9Var.e(user, r8Var);
        linearLayout.addView(g9Var, w7.b6.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = e2.v(20, context, charSequence, p6Var);
        v.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(v, w7.b6.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String n10 = h20.n(user);
        if (TextUtils.isEmpty(n10)) {
            linearLayout.addView(new View(context), w7.b6.o(-1, 12));
            return;
        }
        linearLayout.addView(e2.h(context, "@" + n10, p6Var), w7.b6.t(-2, -2, 1, 36, 6, 36, 12));
    }

    public static void b(y2 y2Var, t2 t2Var) {
        y2Var.c0 = false;
        y2Var.y0 = new org.telegram.ui.i0(t2Var, 3);
        y2Var.setOnDismissListener(new l2(t2Var, 0));
        y2Var.show();
        org.telegram.messenger.i0.h3(new t11(29, t2Var, y2Var), 700L);
    }

    public static void c(Context context, final int i10, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final org.telegram.ui.ActionBar.p6 p6Var, r2 r2Var) {
        final k0 x10 = k0.x(i10);
        boolean equals = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
        final y2 y2Var = new y2(context, p6Var, new View[0]);
        y2Var.J0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, p6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        int i11 = 1;
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, cd.V(null, null, 2131743222, h20.p(user)), p6Var);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f));
        int L = org.telegram.messenger.i0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.t6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        f7.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(f7, d02, N, null, p6Var);
        TextView v = e2.v(14, context, cd.L0(equals ? 2131743036 : 2131743210, null), p6Var);
        v.setGravity(3);
        v.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.V(v, equals ? org.telegram.ui.ActionBar.t6.L6 : org.telegram.ui.ActionBar.t6.q7, p6Var);
        f7.addView(v, w7.b6.k(0.0f, 0.0f, 0.0f, equals ? 12.0f : 4.0f, -1, -2));
        TextView v10 = e2.v(equals ? 14 : 16, context, equals ? jSONObject.optString("text") : cd.L0(2131743209, null), p6Var);
        v10.setGravity(3);
        if (equals) {
            v10.setTypeface(Typeface.MONOSPACE);
        }
        f7.addView(v10, w7.b6.o(-1, -2));
        q2 q2Var = new q2(context, zs.r5);
        q2Var.addView(f7);
        linearLayout.addView(q2Var, w7.b6.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        x2 x2Var = new x2(context);
        x2Var.getContent().addView(linearLayout, w7.b6.c(-2.0f, -1));
        y2Var.I0(x2Var);
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
        if (equals) {
            TextView v11 = e2.v(14, context, cd.L0(2131743055, null), p6Var);
            v11.setGravity(3);
            org.telegram.ui.ActionBar.a7.V(v11, org.telegram.ui.ActionBar.t6.z6, p6Var);
            f10.addView(v11, w7.b6.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(cd.L0(2131752589, null));
        final vh.d i13 = z20.i(24, context, p6Var, true);
        i13.setText(cd.L0(2131743038, null));
        linearLayout2.addView(dVar, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(i13, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
        f10.addView(linearLayout2);
        y2Var.K0(f10);
        final t2 t2Var = new t2(y2Var, r2Var);
        final g gVar = new g(t2Var, i13, dVar, 9);
        t2Var.g = gVar;
        dVar.setOnClickListener(new h2(t2Var, i11));
        i13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final t2 t2Var2 = t2Var;
                if (t2Var2.a() || t2Var2.d) {
                    return;
                }
                t2Var2.d = true;
                final vh.d dVar2 = i13;
                dVar2.setLoading(true);
                final g gVar2 = gVar;
                gVar2.run();
                final int i14 = i10;
                final String str2 = str;
                final JSONObject jSONObject2 = jSONObject;
                final TLRPC.User user2 = user;
                final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                final k0 k0Var = x10;
                final y2 y2Var2 = y2Var;
                final byte[] bArr2 = bArr;
                k0Var.z(new j20() { // from class: org.telegram.ui.Wallet.j2
                    @Override // org.telegram.messenger.j20
                    public final void a(Object obj, Object obj2) {
                        t2 t2Var3 = t2Var2;
                        vh.d dVar3 = dVar2;
                        y2 y2Var3 = y2Var2;
                        org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                        g gVar3 = gVar2;
                        k0 k0Var2 = k0Var;
                        String str3 = str2;
                        byte[] bArr3 = bArr2;
                        int i15 = i14;
                        TLRPC.User user3 = user2;
                        JSONObject jSONObject3 = jSONObject2;
                        h0 h0Var = (h0) obj;
                        String str4 = (String) obj2;
                        if (t2Var3.e) {
                            return;
                        }
                        if (h0Var == null || str4 != null) {
                            t2Var3.d = false;
                            dVar3.setLoading(false);
                            if (str4 != null) {
                                cc.c0(str4, y2Var3.E, p6Var3);
                            }
                            gVar3.run();
                            return;
                        }
                        if (str3.equals(k0Var2.t()) && Arrays.equals(bArr3, k0Var2.y())) {
                            Utilities.e.c(new ce(h0Var.b(), str3, bArr3, jSONObject3, "bot" + user3.id, ConnectionsManager.getInstance(i15).getCurrentTime(), t2Var3, k0Var2));
                            return;
                        }
                        cc.b0(cd.L0(2131742985, null));
                        t2Var3.d = false;
                        if (!t2Var3.f) {
                            t2Var3.f = true;
                            t2Var3.b.a();
                        }
                        if (t2Var3.e) {
                            return;
                        }
                        t2Var3.a.dismiss();
                    }
                }, true, false);
            }
        });
        b(y2Var, t2Var);
        gVar.run();
    }

    public static void d(Context context, final int i10, final TLRPC.User user, final d2 d2Var, final String str, final byte[] bArr, org.telegram.ui.ActionBar.p6 p6Var, r2 r2Var) {
        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        final k0 x10 = k0.x(i10);
        char c10 = 0;
        final y2 y2Var = new y2(context, p6Var2, new View[0]);
        y2Var.J0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, p6Var2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, cd.V(null, null, 2131743221, h20.p(user)), p6Var2);
        l6 l6Var = new l6(context, R.drawable.wallet_card_info, 24);
        l6Var.getCardHolderView().setMaxLines(2);
        l6Var.getCardHolderView().setSingleLine(false);
        List<c2> list = d2Var.b;
        l6Var.setCardHolder(k8.b0(((c2) list.get(0)).a));
        org.telegram.ui.Components.f6 balanceView = l6Var.getBalanceView();
        long j10 = d2Var.c;
        balanceView.setText(e2.k(j10));
        l6Var.getUsdBalanceView().setText(x10.m(j10, false));
        linearLayout.addView(l6Var, w7.b6.o(-1, -2));
        LinearLayout F = e2.F(context, cd.L0(2131743233, null), p6Var2);
        for (c2 c2Var : list) {
            String L0 = cd.L0((c2Var.b == null || c2Var.d != null) ? 2131743007 : 2131743179, null);
            Object[] objArr = new Object[1];
            objArr[c10] = e2.C(c2Var.a);
            org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(e2.c(context, L0, cd.V(null, null, 2131743002, objArr), e2.b(-c2Var.e), c2Var.d, p6Var3), w7.b6.o(-1, -2));
            F = linearLayout2;
            p6Var2 = p6Var3;
            c10 = 0;
        }
        final org.telegram.ui.ActionBar.p6 p6Var4 = p6Var2;
        LinearLayout linearLayout3 = F;
        q2 q2Var = new q2(context, zs.P3);
        q2Var.addView(linearLayout3);
        linearLayout.addView(q2Var, w7.b6.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        x2 x2Var = new x2(context);
        x2Var.getContent().addView(linearLayout, w7.b6.c(-2.0f, -1));
        y2Var.I0(x2Var);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView v = e2.v(14, context, null, p6Var4);
        org.telegram.ui.ActionBar.a7.V(v, org.telegram.ui.ActionBar.t6.z6, p6Var4);
        f7.addView(v, w7.b6.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        vh.d dVar = new vh.d(context, p6Var4, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setText(cd.L0(2131743169, null));
        linearLayout4.addView(dVar, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
        final vh.d i11 = z20.i(24, context, p6Var4, true);
        i11.setText(cd.L0(2131743194, null));
        linearLayout4.addView(i11, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
        f7.addView(linearLayout4);
        y2Var.K0(f7);
        final t2 t2Var = new t2(y2Var, r2Var);
        final int[] iArr = {0};
        final k7 k7Var = new k7(t2Var, i11, iArr, dVar, 10);
        final Runnable[] runnableArr = {new org.telegram.ui.v8(t2Var, iArr, v, k7Var, x10, d2Var, 13)};
        us usVar = new us() { // from class: org.telegram.ui.Wallet.g2
            @Override // org.telegram.messenger.us
            public final void didReceivedNotification(int i12, int i13, Object[] objArr2) {
                if (iArr[0] != 2 || x10.v() < d2Var.c) {
                    return;
                }
                runnableArr[0].run();
            }
        };
        zs.f(i10).b(usVar, zs.a4);
        t2Var.h = new qq(i10, usVar, 25);
        t2Var.g = k7Var;
        dVar.setOnClickListener(new h2(t2Var, 0));
        i11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final t2 t2Var2 = t2.this;
                if (t2Var2.a() || t2Var2.d) {
                    return;
                }
                int i12 = iArr[0];
                final int i13 = i10;
                final k0 k0Var = x10;
                if (i12 == 2) {
                    k0Var.v();
                    ag.z0 z0Var = new ag.z0(21);
                    k0 x11 = k0.x(i13);
                    x11.m0(new x0(i13, z0Var, x11));
                    return;
                }
                if (i12 != 1) {
                    return;
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                final d2 d2Var2 = d2Var;
                long j11 = d2Var2.a;
                if (j11 != 0 && j11 <= connectionsManager.getCurrentTime()) {
                    cc.b0(cd.L0(2131742984, null));
                    t2Var2.d = false;
                    if (!t2Var2.f) {
                        t2Var2.f = true;
                        t2Var2.b.a();
                    }
                    if (t2Var2.e) {
                        return;
                    }
                    t2Var2.a.dismiss();
                    return;
                }
                t2Var2.d = true;
                vh.d dVar2 = i11;
                dVar2.setLoading(true);
                k7 k7Var2 = k7Var;
                k7Var2.run();
                final y2 y2Var2 = y2Var;
                final org.telegram.ui.ActionBar.p6 p6Var5 = p6Var4;
                final org.telegram.ui.pa paVar = new org.telegram.ui.pa(t2Var2, dVar2, y2Var2, p6Var5, k7Var2, 5);
                final String str2 = str;
                final byte[] bArr2 = bArr;
                final TLRPC.User user2 = user;
                k0Var.z(new j20() { // from class: org.telegram.ui.Wallet.k2
                    @Override // org.telegram.messenger.j20
                    public final void a(Object obj, Object obj2) {
                        final t2 t2Var3 = t2.this;
                        org.telegram.ui.pa paVar2 = paVar;
                        final k0 k0Var2 = k0Var;
                        final String str3 = str2;
                        final byte[] bArr3 = bArr2;
                        final d2 d2Var3 = d2Var2;
                        final TLRPC.User user3 = user2;
                        final int i14 = i13;
                        final y2 y2Var3 = y2Var2;
                        final org.telegram.ui.ActionBar.p6 p6Var6 = p6Var5;
                        h0 h0Var = (h0) obj;
                        String str4 = (String) obj2;
                        if (t2Var3.e) {
                            return;
                        }
                        if (h0Var == null || str4 != null) {
                            paVar2.a(str4);
                            return;
                        }
                        if (str3.equals(k0Var2.t()) && Arrays.equals(bArr3, k0Var2.y())) {
                            final WalletEngine2 walletEngine2 = k0Var2.b;
                            if (walletEngine2 == null) {
                                paVar2.a(cd.L0(2131742985, null));
                                return;
                            } else {
                                final h0 b10 = h0Var.b();
                                Utilities.e.c(new Runnable() { // from class: org.telegram.ui.Wallet.m2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final h0 h0Var2 = h0.this;
                                        final String str5 = str3;
                                        final byte[] bArr4 = bArr3;
                                        final byte[] f10 = u2.f(h0Var2, str5, bArr4);
                                        final t2 t2Var4 = t2Var3;
                                        final WalletEngine2 walletEngine22 = walletEngine2;
                                        final d2 d2Var4 = d2Var3;
                                        final TLRPC.User user4 = user3;
                                        final int i15 = i14;
                                        final k0 k0Var3 = k0Var2;
                                        final y2 y2Var4 = y2Var3;
                                        final org.telegram.ui.ActionBar.p6 p6Var7 = p6Var6;
                                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Wallet.n2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final t2 t2Var5 = t2.this;
                                                WalletEngine2 walletEngine23 = walletEngine22;
                                                h0 h0Var3 = h0Var2;
                                                d2 d2Var5 = d2Var4;
                                                TLRPC.User user5 = user4;
                                                final int i16 = i15;
                                                final k0 k0Var4 = k0Var3;
                                                final y2 y2Var5 = y2Var4;
                                                final String str6 = str5;
                                                final byte[] bArr5 = bArr4;
                                                final byte[] bArr6 = f10;
                                                final org.telegram.ui.ActionBar.p6 p6Var8 = p6Var7;
                                                try {
                                                    if (t2Var5.e) {
                                                        return;
                                                    }
                                                    walletEngine23.prepareTonConnectTransfer(h0Var3, d2Var5, "widget:" + user5.id + ":" + Utilities.b.nextLong(), new j20(i16, k0Var4, y2Var5, t2Var5, str6, bArr5, bArr6, p6Var8) { // from class: org.telegram.ui.Wallet.o2
                                                        public final /* synthetic */ int a;
                                                        public final /* synthetic */ k0 b;
                                                        public final /* synthetic */ t2 c;
                                                        public final /* synthetic */ String d;
                                                        public final /* synthetic */ byte[] e;
                                                        public final /* synthetic */ byte[] f;

                                                        {
                                                            this.c = t2Var5;
                                                            this.d = str6;
                                                            this.e = bArr5;
                                                            this.f = bArr6;
                                                        }

                                                        @Override // org.telegram.messenger.j20
                                                        public final void a(Object obj3, Object obj4) {
                                                            final TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj3;
                                                            String str7 = (String) obj4;
                                                            final t2 t2Var6 = this.c;
                                                            if (!t2Var6.e || t2Var6.d) {
                                                                if (sendtransfer != null) {
                                                                    final int i17 = this.a;
                                                                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i17);
                                                                    a3.b bVar = new a3.b(1);
                                                                    final k0 k0Var5 = this.b;
                                                                    final String str8 = this.d;
                                                                    final byte[] bArr7 = this.e;
                                                                    final byte[] bArr8 = this.f;
                                                                    connectionsManager2.sendRequestTyped(sendtransfer, bVar, new j20() { // from class: org.telegram.ui.Wallet.f2
                                                                        /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
                                                                        
                                                                            r1 = new byte[35];
                                                                            w7.l6.c(0, r1);
                                                                            r10 = 0;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:102:0x01b5, code lost:
                                                                        
                                                                            if (r10 >= 267) goto L125;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:103:0x01b7, code lost:
                                                                        
                                                                            r12 = r10 + 4;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:104:0x01bf, code lost:
                                                                        
                                                                            if (w7.l6.a(r12, r6[r3]) == false) goto L127;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
                                                                        
                                                                            w7.l6.c(r12, r1);
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:107:0x01c4, code lost:
                                                                        
                                                                            r10 = r10 + 1;
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:110:0x01c7, code lost:
                                                                        
                                                                            w7.l6.c(org.telegram.messenger.zs.z4, r1);
                                                                            w7.l6.c(org.telegram.messenger.zs.A4, r1);
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
                                                                            r0 = w7.l6.b(r6[r3], r10[r3]);
                                                                         */
                                                                        /* JADX WARN: Code restructure failed: missing block: B:98:0x01a6, code lost:
                                                                        
                                                                            if (r0 >= 0) goto L76;
                                                                         */
                                                                        @Override // org.telegram.messenger.j20
                                                                        /*
                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                        */
                                                                        public final void a(Object obj5, Object obj6) {
                                                                            TL_update.TL_updateSentWalletTransaction tL_updateSentWalletTransaction;
                                                                            int i18;
                                                                            String str9;
                                                                            ByteBuffer wrap;
                                                                            int i19 = i17;
                                                                            k0 k0Var6 = k0Var5;
                                                                            String str10 = str8;
                                                                            byte[] bArr9 = bArr7;
                                                                            byte[] bArr10 = bArr8;
                                                                            TL_wallet.sendTransfer sendtransfer2 = sendtransfer;
                                                                            t2 t2Var7 = t2Var6;
                                                                            TLRPC.Updates updates = (TLRPC.Updates) obj5;
                                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                                                                            if (updates != null) {
                                                                                TLRPC.Update update = updates.update;
                                                                                tL_updateSentWalletTransaction = update instanceof TL_update.TL_updateSentWalletTransaction ? (TL_update.TL_updateSentWalletTransaction) update : null;
                                                                                ArrayList<TLRPC.Update> arrayList = updates.updates;
                                                                                int size = arrayList.size();
                                                                                int i20 = 0;
                                                                                while (i20 < size) {
                                                                                    TLRPC.Update update2 = arrayList.get(i20);
                                                                                    i20++;
                                                                                    TLRPC.Update update3 = update2;
                                                                                    if (update3 instanceof TL_update.TL_updateSentWalletTransaction) {
                                                                                        tL_updateSentWalletTransaction = (TL_update.TL_updateSentWalletTransaction) update3;
                                                                                    }
                                                                                }
                                                                                Utilities.d.c(new org.telegram.tgnet.h(i19, updates, 2));
                                                                            } else {
                                                                                tL_updateSentWalletTransaction = null;
                                                                            }
                                                                            if (tL_error != null && "WALLET_KEY_MISMATCH".equals(tL_error.text)) {
                                                                                k0Var6.E();
                                                                            }
                                                                            byte b11 = 1;
                                                                            if (tL_updateSentWalletTransaction == null || TextUtils.isEmpty(tL_updateSentWalletTransaction.msg_hash)) {
                                                                                cc.b0(e2.z(tL_error, "widget sendTransfer"));
                                                                                ag.z0 z0Var2 = (tL_error == null || tL_error.code != 400) ? new ag.z0(23) : new ag.z0(22);
                                                                                t2Var7.d = false;
                                                                                if (!t2Var7.f) {
                                                                                    t2Var7.f = true;
                                                                                    z0Var2.a(t2Var7.b);
                                                                                }
                                                                                if (t2Var7.e) {
                                                                                    return;
                                                                                }
                                                                                t2Var7.a.dismiss();
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
                                                                                i18 = 2;
                                                                            } else {
                                                                                byte b12 = wrap.get();
                                                                                int i21 = b12 & 7;
                                                                                int i22 = wrap.get() & 255;
                                                                                if (i21 >= 1) {
                                                                                    int i23 = 4;
                                                                                    if (i21 <= 4 && i22 >= 1) {
                                                                                        char c11 = '\b';
                                                                                        if (i22 <= 8) {
                                                                                            int d = (int) w7.l6.d(i21, wrap);
                                                                                            long d10 = w7.l6.d(i21, wrap);
                                                                                            w7.l6.d(i21, wrap);
                                                                                            w7.l6.d(i22, wrap);
                                                                                            if (d10 == 1 && d >= 1 && d <= bArr11.length) {
                                                                                                int d11 = (int) w7.l6.d(i21, wrap);
                                                                                                if ((b12 & 128) != 0) {
                                                                                                    wrap.position((i22 * d) + wrap.position());
                                                                                                }
                                                                                                byte[][] bArr12 = new byte[d][];
                                                                                                int[][] iArr2 = new int[d][];
                                                                                                int[] iArr3 = new int[d];
                                                                                                int i24 = 0;
                                                                                                loop1: while (true) {
                                                                                                    if (i24 >= d) {
                                                                                                        break;
                                                                                                    }
                                                                                                    char c12 = c11;
                                                                                                    int i25 = wrap.get() & 255;
                                                                                                    i18 = 2;
                                                                                                    try {
                                                                                                        int i26 = wrap.get() & 255;
                                                                                                        if (i25 > i23) {
                                                                                                            break;
                                                                                                        }
                                                                                                        iArr3[i24] = i26;
                                                                                                        byte[] bArr13 = new byte[(i26 + 1) / 2];
                                                                                                        bArr12[i24] = bArr13;
                                                                                                        wrap.get(bArr13);
                                                                                                        iArr2[i24] = new int[i25];
                                                                                                        int i27 = 0;
                                                                                                        while (i27 < i25) {
                                                                                                            int i28 = i25;
                                                                                                            iArr2[i24][i27] = (int) w7.l6.d(i21, wrap);
                                                                                                            int i29 = iArr2[i24][i27];
                                                                                                            if (i29 <= i24 || i29 >= d) {
                                                                                                                break loop1;
                                                                                                            }
                                                                                                            i27++;
                                                                                                            i25 = i28;
                                                                                                        }
                                                                                                        i24++;
                                                                                                        c11 = c12;
                                                                                                        i23 = 4;
                                                                                                    } catch (RuntimeException | NoSuchAlgorithmException unused2) {
                                                                                                    }
                                                                                                }
                                                                                                str9 = null;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i18 = 2;
                                                                                str9 = null;
                                                                            }
                                                                            if (str9 != null) {
                                                                                str11 = Base64.encodeToString(Utilities.v(str9), i18);
                                                                            }
                                                                            tL_widgetQueryTypeSentTransaction.msg_hash = str11;
                                                                            t2Var7.d = false;
                                                                            if (!t2Var7.f) {
                                                                                t2Var7.f = true;
                                                                                t2Var7.b.d(tL_widgetQueryTypeSentTransaction);
                                                                            }
                                                                            if (t2Var7.e) {
                                                                                return;
                                                                            }
                                                                            t2Var7.a.dismiss();
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                                if (str7 == null) {
                                                                    str7 = cd.L0(2131743012, null);
                                                                }
                                                                cc.b0(str7);
                                                                t2Var6.d = false;
                                                                if (!t2Var6.f) {
                                                                    t2Var6.f = true;
                                                                    t2Var6.b.a();
                                                                }
                                                                if (t2Var6.e) {
                                                                    return;
                                                                }
                                                                t2Var6.a.dismiss();
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
                        cc.b0(cd.L0(2131742985, null));
                        t2Var3.d = false;
                        if (!t2Var3.f) {
                            t2Var3.f = true;
                            t2Var3.b.a();
                        }
                        if (t2Var3.e) {
                            return;
                        }
                        t2Var3.a.dismiss();
                    }
                }, true, false);
            }
        });
        b(y2Var, t2Var);
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }
}
