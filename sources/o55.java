// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class o55 {
    public static final ArrayList a = new ArrayList();

    public static void a(Context context, LinearLayout linearLayout, TLRPC.User user, CharSequence charSequence, vnb vnbVar) {
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(38.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        de0Var.f(user, rb0Var);
        linearLayout.addView(de0Var, tre.t(76, 76, 1, 0, 24, 0, 0));
        TextView v = a55.v(context, charSequence, 20, vnbVar);
        v.setTypeface(hl.o());
        linearLayout.addView(v, tre.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
        String p = lbc.p(user);
        if (TextUtils.isEmpty(p)) {
            linearLayout.addView(new View(context), tre.o(-1, 12));
            return;
        }
        linearLayout.addView(a55.g(context, "@" + p, vnbVar), tre.t(-2, -2, 1, 36, 6, 36, 12));
    }

    public static void b(sk7 sk7Var, n55 n55Var) {
        sk7Var.d0 = false;
        sk7Var.z0 = new ut(n55Var, (byte) 2);
        sk7Var.setOnDismissListener(new o1(n55Var, (byte) 22));
        sk7Var.show();
        hl.d3(new se4(n55Var, sk7Var, (byte) 19), 700L);
    }

    public static void c(Context context, final int i, final TLRPC.User user, final JSONObject jSONObject, final String str, final byte[] bArr, final vnb vnbVar, l55 l55Var) {
        String M0;
        int i2;
        final c C = c.C(i);
        boolean equals = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
        final sk7 sk7Var = new sk7(context, vnbVar, new View[0]);
        sk7Var.F0(aob.v0(aob.a7, vnbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, ob6.V(null, null, 2131742847, lbc.r(user)), vnbVar);
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(hl.L(20.0f), hl.L(16.0f), hl.L(20.0f), hl.L(16.0f));
        int L = hl.L(16.0f);
        int i3 = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i3, vnbVar));
        uob M = yob.M(i3);
        j.setBackground(b0);
        yob.j(j, b0, M, null, vnbVar);
        TextView v = a55.v(context, ob6.M0(equals ? 2131742641 : 2131742835, null), 14, vnbVar);
        v.setGravity(3);
        v.setTypeface(hl.o());
        yob.X(v, equals ? aob.L6 : aob.q7, vnbVar);
        j.addView(v, tre.k(0.0f, 0.0f, 0.0f, equals ? 12.0f : 4.0f, -1, -2));
        if (equals) {
            M0 = jSONObject.optString("text");
            i2 = 14;
        } else {
            M0 = ob6.M0(2131742834, null);
            i2 = 16;
        }
        TextView v2 = a55.v(context, M0, i2, vnbVar);
        v2.setGravity(3);
        if (equals) {
            v2.setTypeface(Typeface.MONOSPACE);
        }
        j.addView(v2, tre.o(-1, -2));
        k55 k55Var = new k55(context, jn7.q5);
        k55Var.addView(j);
        linearLayout.addView(k55Var, tre.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
        rk7 rk7Var = new rk7(context);
        rk7Var.getContent().addView(linearLayout, tre.c(-2.0f, -1));
        sk7Var.E0(rk7Var);
        LinearLayout j2 = uh9.j(context, 1);
        if (equals) {
            TextView v3 = a55.v(context, ob6.M0(2131742660, null), 14, vnbVar);
            v3.setGravity(3);
            yob.X(v3, aob.z6, vnbVar);
            j2.addView(v3, tre.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.setRoundRadius(24);
        c51Var.e();
        c51Var.setText(ob6.M0(2131752570, null));
        final c51 i4 = xnb.i(24, vnbVar, context, true);
        i4.setText(ob6.M0(2131742643, null));
        linearLayout2.addView(c51Var, tre.m(1.0f, 0, 44, 0, 6, 0));
        linearLayout2.addView(i4, tre.m(1.0f, 0, 44, 6, 0, 0));
        j2.addView(linearLayout2);
        sk7Var.G0(j2);
        final n55 n55Var = new n55(sk7Var, l55Var);
        final re4 re4Var = new re4(n55Var, i4, c51Var, (byte) 21);
        n55Var.g = re4Var;
        c51Var.setOnClickListener(new d55(n55Var, (byte) 1));
        i4.setOnClickListener(new View.OnClickListener() { // from class: j55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final n55 n55Var2 = n55Var;
                if (n55Var2.a() || n55Var2.d) {
                    return;
                }
                n55Var2.d = true;
                final c51 c51Var2 = i4;
                c51Var2.setLoading(true);
                final re4 re4Var2 = re4Var;
                re4Var2.run();
                final int i5 = i;
                final sk7 sk7Var2 = sk7Var;
                final vnb vnbVar2 = vnbVar;
                final String str2 = str;
                final JSONObject jSONObject2 = jSONObject;
                final TLRPC.User user2 = user;
                final c cVar = C;
                final byte[] bArr2 = bArr;
                cVar.E(true, false, false, new icc() { // from class: f55
                    @Override // icc
                    public final void a(Object obj, Object obj2) {
                        n55 n55Var3 = n55Var2;
                        c51 c51Var3 = c51Var2;
                        sk7 sk7Var3 = sk7Var2;
                        vnb vnbVar3 = vnbVar2;
                        re4 re4Var3 = re4Var2;
                        c cVar2 = cVar;
                        String str3 = str2;
                        byte[] bArr3 = bArr2;
                        int i6 = i5;
                        TLRPC.User user3 = user2;
                        JSONObject jSONObject3 = jSONObject2;
                        c35 c35Var = (c35) obj;
                        String str4 = (String) obj2;
                        if (n55Var3.e) {
                            return;
                        }
                        if (c35Var == null || str4 != null) {
                            n55Var3.d = false;
                            c51Var3.setLoading(false);
                            if (str4 != null) {
                                d31.d0(str4, sk7Var3.F, vnbVar3);
                            }
                            re4Var3.run();
                            return;
                        }
                        if (str3.equals(cVar2.x()) && Arrays.equals(bArr3, cVar2.D())) {
                            Utilities.e.c(new a84(c35Var.b(), str3, bArr3, jSONObject3, "bot" + user3.id, ConnectionsManager.getInstance(i6).getCurrentTime(), n55Var3, cVar2));
                            return;
                        }
                        d31.c0(ob6.M0(2131742590, null));
                        n55Var3.d = false;
                        if (!n55Var3.f) {
                            n55Var3.f = true;
                            n55Var3.b.a();
                        }
                        if (n55Var3.e) {
                            return;
                        }
                        n55Var3.a.dismiss();
                    }
                });
            }
        });
        b(sk7Var, n55Var);
        re4Var.run();
    }

    public static void d(final Context context, final int i, final TLRPC.User user, final z45 z45Var, final String str, final byte[] bArr, final vnb vnbVar, l55 l55Var) {
        final c C = c.C(i);
        char c = 0;
        final sk7 sk7Var = new sk7(context, vnbVar, new View[0]);
        sk7Var.F0(aob.v0(aob.a7, vnbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a(context, linearLayout, user, ob6.V(null, null, 2131742846, lbc.r(user)), vnbVar);
        frc frcVar = new frc(context, R.drawable.wallet_card_info, 24);
        frcVar.getCardHolderView().setMaxLines(2);
        frcVar.getCardHolderView().setSingleLine(false);
        List<y45> list = z45Var.b;
        frcVar.setCardHolder(atc.Z(((y45) list.get(0)).a));
        in balanceView = frcVar.getBalanceView();
        long j = z45Var.c;
        balanceView.setText(a55.j(j));
        frcVar.getUsdBalanceView().setText(C.q(j, false));
        linearLayout.addView(frcVar, tre.o(-1, -2));
        LinearLayout F = a55.F(context, ob6.M0(2131742858, null), vnbVar);
        for (y45 y45Var : list) {
            String M0 = ob6.M0((y45Var.b == null || y45Var.d != null) ? 2131742612 : 2131742804, null);
            Object[] objArr = new Object[1];
            objArr[c] = a55.C(y45Var.a);
            LinearLayout linearLayout2 = F;
            linearLayout2.addView(a55.b(context, M0, ob6.V(null, null, 2131742607, objArr), a55.a(-y45Var.e), y45Var.d, vnbVar), tre.o(-1, -2));
            F = linearLayout2;
            c = 0;
        }
        LinearLayout linearLayout3 = F;
        k55 k55Var = new k55(context, jn7.O3);
        k55Var.addView(linearLayout3);
        linearLayout.addView(k55Var, tre.k(12.0f, 6.0f, 12.0f, 0.0f, -1, -2));
        rk7 rk7Var = new rk7(context);
        rk7Var.getContent().addView(linearLayout, tre.c(-2.0f, -1));
        sk7Var.E0(rk7Var);
        LinearLayout j2 = uh9.j(context, 1);
        TextView v = a55.v(context, null, 14, vnbVar);
        yob.X(v, aob.z6, vnbVar);
        j2.addView(v, tre.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(16.0f));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.setRoundRadius(24);
        c51Var.e();
        c51Var.setText(ob6.M0(2131742794, null));
        linearLayout4.addView(c51Var, tre.m(1.0f, 0, 44, 0, 6, 0));
        final c51 i2 = xnb.i(24, vnbVar, context, true);
        i2.setText(ob6.M0(2131742819, null));
        linearLayout4.addView(i2, tre.m(1.0f, 0, 44, 6, 0, 0));
        j2.addView(linearLayout4);
        sk7Var.G0(j2);
        final n55 n55Var = new n55(sk7Var, l55Var);
        final int[] iArr = {0};
        final ao1 ao1Var = new ao1(n55Var, i2, iArr, c51Var, (byte) 29);
        final Runnable[] runnableArr = {new z87((Object) n55Var, (Object) iArr, (Object) v, (Object) ao1Var, (Object) C, (Object) z45Var, (byte) 14)};
        fn7 fn7Var = new fn7() { // from class: c55
            @Override // fn7
            public final void didReceivedNotification(int i3, int i4, Object[] objArr2) {
                if (iArr[0] != 2 || C.z() < z45Var.c) {
                    return;
                }
                runnableArr[0].run();
            }
        };
        jn7.f(i).a(fn7Var, jn7.d4);
        n55Var.h = new hl3(i, (Object) fn7Var, (byte) 13);
        n55Var.g = ao1Var;
        c51Var.setOnClickListener(new d55(n55Var, (byte) 0));
        i2.setOnClickListener(new View.OnClickListener() { // from class: e55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final n55 n55Var2 = n55.this;
                if (n55Var2.a() || n55Var2.d) {
                    return;
                }
                int i3 = iArr[0];
                final int i4 = i;
                final vnb vnbVar2 = vnbVar;
                if (i3 == 2) {
                    uqc.L0(i4, vnbVar2, context);
                    return;
                }
                if (i3 == 1) {
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i4);
                    final z45 z45Var2 = z45Var;
                    long j3 = z45Var2.a;
                    if (j3 != 0 && j3 <= connectionsManager.getCurrentTime()) {
                        d31.c0(ob6.M0(2131742589, null));
                        n55Var2.d = false;
                        if (!n55Var2.f) {
                            n55Var2.f = true;
                            n55Var2.b.a();
                        }
                        if (n55Var2.e) {
                            return;
                        }
                        n55Var2.a.dismiss();
                        return;
                    }
                    n55Var2.d = true;
                    c51 c51Var2 = i2;
                    c51Var2.setLoading(true);
                    ao1 ao1Var2 = ao1Var;
                    ao1Var2.run();
                    final sk7 sk7Var2 = sk7Var;
                    final hu0 hu0Var = new hu0(n55Var2, c51Var2, sk7Var2, vnbVar2, ao1Var2, (byte) 7);
                    final c cVar = C;
                    final String str2 = str;
                    final byte[] bArr2 = bArr;
                    final TLRPC.User user2 = user;
                    cVar.E(true, false, false, new icc() { // from class: g55
                        @Override // icc
                        public final void a(Object obj, Object obj2) {
                            final n55 n55Var3 = n55.this;
                            hu0 hu0Var2 = hu0Var;
                            final c cVar2 = cVar;
                            final String str3 = str2;
                            final byte[] bArr3 = bArr2;
                            final z45 z45Var3 = z45Var2;
                            final TLRPC.User user3 = user2;
                            final int i5 = i4;
                            final sk7 sk7Var3 = sk7Var2;
                            final vnb vnbVar3 = vnbVar2;
                            c35 c35Var = (c35) obj;
                            String str4 = (String) obj2;
                            if (n55Var3.e) {
                                return;
                            }
                            if (c35Var == null || str4 != null) {
                                hu0Var2.a(str4);
                                return;
                            }
                            if (str3.equals(cVar2.x()) && Arrays.equals(bArr3, cVar2.D())) {
                                final WalletEngine2 walletEngine2 = cVar2.b;
                                if (walletEngine2 == null) {
                                    hu0Var2.a(ob6.M0(2131742590, null));
                                    return;
                                } else {
                                    final c35 b = c35Var.b();
                                    Utilities.e.c(new Runnable() { // from class: h55
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final c35 c35Var2 = c35.this;
                                            final String str5 = str3;
                                            final byte[] bArr4 = bArr3;
                                            final byte[] f = o55.f(c35Var2, str5, bArr4);
                                            final n55 n55Var4 = n55Var3;
                                            final WalletEngine2 walletEngine22 = walletEngine2;
                                            final z45 z45Var4 = z45Var3;
                                            final TLRPC.User user4 = user3;
                                            final int i6 = i5;
                                            final c cVar3 = cVar2;
                                            final sk7 sk7Var4 = sk7Var3;
                                            final vnb vnbVar4 = vnbVar3;
                                            hl.c3(new Runnable() { // from class: i55
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    n55 n55Var5 = n55.this;
                                                    WalletEngine2 walletEngine23 = walletEngine22;
                                                    c35 c35Var3 = c35Var2;
                                                    z45 z45Var5 = z45Var4;
                                                    TLRPC.User user5 = user4;
                                                    int i7 = i6;
                                                    c cVar4 = cVar3;
                                                    sk7 sk7Var5 = sk7Var4;
                                                    String str6 = str5;
                                                    byte[] bArr5 = bArr4;
                                                    byte[] bArr6 = f;
                                                    vnb vnbVar5 = vnbVar4;
                                                    try {
                                                        if (!n55Var5.e) {
                                                            walletEngine23.prepareTonConnectTransfer(c35Var3, z45Var5, "widget:" + user5.id + ":" + Utilities.b.nextLong(), new b55(i7, cVar4, sk7Var5, n55Var5, str6, bArr5, bArr6, vnbVar5));
                                                        }
                                                    } finally {
                                                        c35Var3.close();
                                                    }
                                                }
                                            });
                                        }
                                    });
                                    return;
                                }
                            }
                            d31.c0(ob6.M0(2131742590, null));
                            n55Var3.d = false;
                            if (!n55Var3.f) {
                                n55Var3.f = true;
                                n55Var3.b.a();
                            }
                            if (n55Var3.e) {
                                return;
                            }
                            n55Var3.a.dismiss();
                        }
                    });
                }
            }
        });
        b(sk7Var, n55Var);
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

    public static byte[] f(c35 c35Var, String str, byte[] bArr) {
        try {
            return Base64.decode(WalletEngine2.tonConnectCrypto(c35Var, e(), str, bArr, new JSONObject().put("account", true)).getJSONObject("account").getString("walletStateInit"), 2);
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }
}
