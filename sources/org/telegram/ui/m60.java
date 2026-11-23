package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m60(Context context, int i7, org.telegram.ui.Wallet.v0 v0Var, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        this.c = context;
        this.b = i7;
        this.d = v0Var;
        this.e = i6Var;
        this.f = runnable;
    }

    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v47 */
    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.g2 T;
        org.telegram.ui.Wallet.i2 i2Var;
        org.telegram.ui.Wallet.m2 m2Var;
        boolean z10;
        String str;
        final int i7;
        CharSequence V;
        String str2;
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i15 = 1;
        int i16 = 0;
        switch (i13) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                vf.b bVar = (vf.b) obj5;
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str3 = LaunchActivity.C1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    mpVar.e4(user2, false, false);
                    mpVar.c3(user2, 0, true, null);
                }
                launchActivity.m0(i14, user.id, tL_error);
                break;
            case 1:
                r90 r90Var = (r90) obj6;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                String str6 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = r90Var.a;
                r90Var.h = -1;
                if (!r90Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 == null) {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str4.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i17);
                                    i17++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str5.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(r90Var.b).getCurrentTime()) {
                                        if (r90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            r90Var.c();
                                            org.telegram.ui.Wallet.m2.q(r90Var.a, r90Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new k90(r90Var, str6, 3));
                                        }
                                    }
                                }
                            }
                        }
                        int i18 = this.b;
                        if (i18 < 10) {
                            ai.d1 d1Var = new ai.d1(r90Var, str4, str5, str6, i18, 23);
                            r90Var.i = d1Var;
                            org.telegram.messenger.g0.h3(d1Var, 500L);
                            break;
                        } else {
                            r90Var.c();
                            if (r90Var.a()) {
                                org.telegram.ui.Components.kc.c0(org.telegram.messenger.gd.N0(2131742722, null));
                                break;
                            }
                        }
                    } else {
                        r90Var.c();
                        if (r90Var.a()) {
                            r90.d().g0(tL_error2, false);
                        }
                    }
                    break;
                } else {
                    r90Var.c();
                    break;
                }
                break;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.i2 i2Var2 = (org.telegram.ui.Wallet.i2) obj;
                String str7 = (String) obj2;
                if (i2Var2 != null) {
                    int i19 = i2Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = i2Var2.a;
                    String str8 = i2Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || org.telegram.messenger.bz.x || org.telegram.messenger.bz.C || org.telegram.messenger.i10.t0 != i14) {
                            v0Var.g.u(i2Var2);
                            break;
                        }
                    }
                    if (!"signData".equals(str8)) {
                        org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i14);
                        org.telegram.ui.Wallet.m2 m2Var2 = D.g;
                        org.telegram.ui.Wallet.l2 l2Var = i2Var2.f;
                        boolean equals = "signMessage".equals(str8);
                        final org.telegram.ui.Wallet.e3 e3Var = new org.telegram.ui.Wallet.e3(context, i6Var, new View[0]);
                        e3Var.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                        p9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            i2Var = i2Var2;
                            m2Var = m2Var2;
                            z10 = equals;
                            p9Var.p(org.telegram.messenger.fc.p(org.telegram.messenger.g20.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            i2Var = i2Var2;
                            m2Var = m2Var2;
                            z10 = equals;
                        }
                        linearLayout.addView(p9Var, c8.na.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = org.telegram.ui.Wallet.m2.v(20, context, org.telegram.messenger.gd.V(null, null, z10 ? 2131742945 : 2131742944, tonconnectsession2.manifest.name), i6Var);
                        v.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout.addView(v, c8.na.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(K0)) {
                            linearLayout.addView(org.telegram.ui.Wallet.m2.h(context, K0, i6Var), c8.na.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.y6 y6Var = new org.telegram.ui.Wallet.y6(context, R.drawable.wallet_card_info, 24);
                        y6Var.getCardHolderView().setMaxLines(2);
                        y6Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.k2> list = l2Var.b;
                        long j3 = l2Var.c;
                        y6Var.setCardHolder(org.telegram.ui.Wallet.v8.c0(((org.telegram.ui.Wallet.k2) list.get(0)).a));
                        y6Var.getBalanceView().setText(org.telegram.ui.Wallet.m2.k(j3));
                        y6Var.getUsdBalanceView().setText(D.r(j3, false));
                        linearLayout.addView(y6Var, c8.na.o(-1, -2));
                        final int i20 = 0;
                        y6Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i20) {
                                    case 0:
                                        e3 e3Var2 = e3Var;
                                        hi.q1 q1Var = e3Var2.m1;
                                        if (1 < e3Var2.n1.size() && 1 != q1Var.getCurrentPosition()) {
                                            for (View view2 : q1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            q1Var.C(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        e3 e3Var3 = e3Var;
                                        hi.q1 q1Var2 = e3Var3.m1;
                                        if (e3Var3.n1.size() > 0 && q1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : q1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            q1Var2.C(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Wallet.d3 d3Var = new org.telegram.ui.Wallet.d3(context);
                        d3Var.getContent().addView(linearLayout, c8.na.c(-2.0f, -1));
                        e3Var.J0(d3Var);
                        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
                        g10.addView(g11, c8.na.o(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i21 = org.telegram.ui.ActionBar.n6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i21, i6Var), 1, -1);
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i21);
                        imageView.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var);
                        int i22 = org.telegram.ui.ActionBar.n6.G6;
                        org.telegram.ui.ActionBar.u6.s(imageView, i22, i6Var, PorterDuff.Mode.SRC_IN);
                        c8.sa.a(imageView);
                        g11.addView(imageView, c8.na.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
                        p9Var2.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            str = "signMessage";
                            p9Var2.p(org.telegram.messenger.fc.p(org.telegram.messenger.g20.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            str = "signMessage";
                        }
                        g11.addView(p9Var2, c8.na.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        g11.addView(linearLayout2, c8.na.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.u6.U(textView, i22, i6Var);
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, c8.na.o(-1, -2));
                        textView.setText(org.telegram.messenger.gd.N0(2131742916, null));
                        if (TextUtils.isEmpty(K0)) {
                            i7 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, i6Var);
                            i7 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout2.addView(textView2, c8.na.o(-1, -2));
                            textView2.setText(K0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.o1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        e3 e3Var2 = e3Var;
                                        hi.q1 q1Var = e3Var2.m1;
                                        if (1 < e3Var2.n1.size() && 1 != q1Var.getCurrentPosition()) {
                                            for (View view2 : q1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            q1Var.C(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        e3 e3Var3 = e3Var;
                                        hi.q1 q1Var2 = e3Var3.m1;
                                        if (e3Var3.n1.size() > 0 && q1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : q1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            q1Var2.C(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(i7);
                        LinearLayout F = org.telegram.ui.Wallet.m2.F(context, org.telegram.messenger.gd.N0(2131742780, null), i6Var);
                        String C = org.telegram.ui.Wallet.m2.C(((org.telegram.ui.Wallet.k2) list.get(0)).a);
                        SpannableStringBuilder x10 = org.telegram.ui.Wallet.v0.x(j3, i7);
                        if (list.size() > i7) {
                            Integer valueOf = Integer.valueOf(list.size() - i7);
                            Object[] objArr = new Object[2];
                            objArr[0] = C;
                            objArr[i7] = valueOf;
                            V = org.telegram.messenger.gd.V(null, null, 2131742704, objArr);
                        } else {
                            Object[] objArr2 = new Object[i7];
                            objArr2[0] = C;
                            V = org.telegram.messenger.gd.V(null, null, 2131742705, objArr2);
                        }
                        F.addView(org.telegram.ui.Wallet.m2.c(context, x10, V, null, null, i6Var), c8.na.o(-1, -2));
                        linearLayout3.addView(F, c8.na.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = org.telegram.ui.Wallet.m2.F(context, org.telegram.messenger.gd.N0(2131742956, null), i6Var);
                        for (org.telegram.ui.Wallet.k2 k2Var : list) {
                            if (k2Var.b == null || k2Var.d != null) {
                                str2 = null;
                                i10 = 2131742710;
                            } else {
                                i10 = 2131742902;
                                str2 = null;
                            }
                            F2.addView(org.telegram.ui.Wallet.m2.c(context, org.telegram.messenger.gd.N0(i10, str2), org.telegram.messenger.gd.V(str2, str2, 2131742705, org.telegram.ui.Wallet.m2.C(k2Var.a)), org.telegram.ui.Wallet.m2.b(-k2Var.e), k2Var.d, i6Var), c8.na.o(-1, -2));
                        }
                        linearLayout3.addView(F2, c8.na.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        bi.m6 m6Var = new bi.m6(context, 5);
                        m6Var.setFillViewport(false);
                        m6Var.addView(linearLayout3);
                        g10.addView(m6Var, c8.na.o(-1, -2));
                        org.telegram.ui.Wallet.d3 d3Var2 = new org.telegram.ui.Wallet.d3(context);
                        d3Var2.getContent().addView(g10, c8.na.c(-2.0f, -1));
                        e3Var.J0(d3Var2);
                        LinearLayout g12 = org.telegram.messenger.f3.g(context, 1);
                        TextView v10 = org.telegram.ui.Wallet.m2.v(14, context, null, i6Var);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o80(org.telegram.messenger.g0.L(80.0f), v10), 0, spannableStringBuilder.length(), 33);
                        v10.setText(org.telegram.messenger.gd.V(null, null, 2131742868, spannableStringBuilder));
                        v10.setVisibility(z10 ? 8 : 0);
                        org.telegram.ui.ActionBar.u6.U(v10, org.telegram.ui.ActionBar.n6.z6, i6Var);
                        g12.addView(v10, c8.na.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                        hi.e eVar = new hi.e(context, i6Var, true);
                        eVar.setRoundRadius(24);
                        eVar.e();
                        eVar.setText(org.telegram.messenger.gd.N0(2131742892, null));
                        linearLayout4.addView(eVar, c8.na.m(1.0f, 0, 44, 0, 6, 0));
                        hi.e g13 = org.telegram.messenger.m10.g(24, context, i6Var, true);
                        g13.setText(org.telegram.messenger.gd.N0(z10 ? 2131742741 : 2131742917, null));
                        g13.setEnabled(false);
                        linearLayout4.addView(g13, c8.na.m(1.0f, 0, 44, 6, 0, 0));
                        g12.addView(linearLayout4);
                        e3Var.L0(g12);
                        final int i23 = 1;
                        final int i24 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.i2 i2Var3 = i2Var;
                        final org.telegram.ui.Wallet.m2 m2Var3 = m2Var;
                        final org.telegram.ui.Wallet.p1 p1Var = new org.telegram.ui.Wallet.p1(i2Var3, zArr2, g13, eVar, m2Var3, e3Var, zArr, i6Var);
                        g13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i24) {
                                    case 0:
                                        p1Var.a(Boolean.FALSE);
                                        break;
                                    default:
                                        p1Var.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        eVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i23) {
                                    case 0:
                                        p1Var.a(Boolean.FALSE);
                                        break;
                                    default:
                                        p1Var.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.g2 g2Var = new org.telegram.ui.Wallet.g2(zArr, i2Var3, e3Var, i23);
                        long j10 = i19;
                        long j11 = l2Var.a;
                        if (j11 == 0) {
                            j11 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i14).getCurrentTime()) * 1000;
                        i2Var3.r = new org.telegram.ui.Wallet.m(e3Var, 4);
                        final int i25 = 0;
                        e3Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.r1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i25) {
                                    case 0:
                                        g2 g2Var2 = (g2) g2Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(g2Var2);
                                        m2Var3.u(i2Var3);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        g2 g2Var3 = (g2) g2Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(g2Var3);
                                        m2Var3.u(i2Var3);
                                        Runnable runnable3 = runnable;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        e3Var.show();
                        org.telegram.messenger.g0.h3(g2Var, max);
                        oi.c cVar = new oi.c(zArr, i2Var3, zArr2, g13, z10, D, v10, e3Var, i6Var);
                        WalletEngine2 walletEngine2 = m2Var3.b.b;
                        if (!i2Var3.n && !m2Var3.j(i2Var3) && m2Var3.A(i2Var3) && walletEngine2 != null) {
                            if (str.equals(str8)) {
                                walletEngine2.previewSignMessage(l2Var, new org.telegram.ui.Wallet.o(m2Var3, i2Var3, cVar, 2));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(l2Var, new org.telegram.ui.Wallet.j(m2Var3, i2Var3, cVar, 9));
                                break;
                            }
                        } else {
                            cVar.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.m2 m2Var4 = org.telegram.ui.Wallet.v0.D(i14).g;
                        try {
                            JSONObject jSONObject = new JSONObject(i2Var2.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.e3 e3Var2 = new org.telegram.ui.Wallet.e3(context, i6Var, new View[0]);
                            e3Var2.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var));
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setOrientation(1);
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setGravity(16);
                            ImageView e10 = org.telegram.messenger.m10.e(context, R.drawable.ic_ab_close);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.G6, i6Var, PorterDuff.Mode.SRC_IN);
                            int i26 = org.telegram.ui.ActionBar.n6.i6;
                            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i26, i6Var), 1, -1);
                            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i26);
                            e10.setBackground(h03);
                            org.telegram.ui.ActionBar.u6.j(e10, h03, null, M2, i6Var);
                            e10.setContentDescription(org.telegram.messenger.gd.N0(2131752029, null));
                            e10.setOnClickListener(new ig0(18, i2Var2, e3Var2));
                            linearLayout6.addView(e10, c8.na.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.p9 p9Var3 = new org.telegram.ui.Components.p9(context);
                            p9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                p9Var3.p(org.telegram.messenger.fc.p(org.telegram.messenger.g20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout6.addView(p9Var3, c8.na.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            TextView v11 = org.telegram.ui.Wallet.m2.v(18, context, org.telegram.messenger.gd.N0(2131742740, null), i6Var);
                            v11.setTypeface(org.telegram.messenger.g0.o());
                            v11.setGravity(3);
                            linearLayout7.addView(v11, c8.na.o(-1, -2));
                            TextView v12 = org.telegram.ui.Wallet.m2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), i6Var);
                            int i27 = org.telegram.ui.ActionBar.n6.z6;
                            org.telegram.ui.ActionBar.u6.U(v12, i27, i6Var);
                            v12.setGravity(3);
                            v12.setSingleLine(true);
                            v12.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout7.addView(v12, c8.na.o(-1, -2));
                            linearLayout6.addView(linearLayout7, c8.na.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout5.addView(linearLayout6, c8.na.o(-1, 56));
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setOrientation(1);
                            linearLayout8.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i28 = org.telegram.ui.ActionBar.n6.d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i28, i6Var));
                            org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i28);
                            linearLayout8.setBackground(d02);
                            org.telegram.ui.ActionBar.u6.j(linearLayout8, d02, M3, null, i6Var);
                            TextView v13 = org.telegram.ui.Wallet.m2.v(equals2 ? 14 : 16, context, equals2 ? jSONObject.optString("text") : org.telegram.messenger.gd.N0(2131742932, null), i6Var);
                            v13.setGravity(3);
                            v13.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v14 = org.telegram.ui.Wallet.m2.v(14, context, org.telegram.messenger.gd.N0(2131742739, null), i6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.u6.U(v14, org.telegram.ui.ActionBar.n6.L6, i6Var);
                                linearLayout8.addView(v14, c8.na.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v13.setTypeface(Typeface.MONOSPACE);
                                i11 = -1;
                                i12 = -2;
                            } else {
                                LinearLayout linearLayout9 = new LinearLayout(context);
                                linearLayout9.setGravity(16);
                                TextView v15 = org.telegram.ui.Wallet.m2.v(12, context, "!", i6Var);
                                v15.setTypeface(org.telegram.messenger.g0.o());
                                v15.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i29 = org.telegram.ui.ActionBar.n6.q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i29, i6Var));
                                org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i29);
                                v15.setBackground(d03);
                                org.telegram.ui.ActionBar.u6.j(v15, d03, M4, null, i6Var);
                                linearLayout9.addView(v15, c8.na.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v16 = org.telegram.ui.Wallet.m2.v(14, context, org.telegram.messenger.gd.N0(2131742933, null), i6Var);
                                v16.setGravity(3);
                                v16.setTypeface(org.telegram.messenger.g0.o());
                                i11 = -1;
                                i12 = -2;
                                linearLayout9.addView(v16, c8.na.o(-1, -2));
                                linearLayout8.addView(linearLayout9, c8.na.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout8.addView(v13, c8.na.o(i11, i12));
                            if (equals2) {
                                v13.setOnClickListener(new org.telegram.ui.Wallet.s1(jSONObject, e3Var2, i6Var, 0));
                            }
                            bi.m6 m6Var2 = new bi.m6(context, 4);
                            m6Var2.addView(linearLayout8);
                            linearLayout5.addView(m6Var2, c8.na.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.d3 d3Var3 = new org.telegram.ui.Wallet.d3(context);
                            d3Var3.getContent().addView(linearLayout5, c8.na.c(-2.0f, -1));
                            e3Var2.J0(d3Var3);
                            LinearLayout g14 = org.telegram.messenger.f3.g(context, 1);
                            if (equals2) {
                                TextView v17 = org.telegram.ui.Wallet.m2.v(14, context, org.telegram.messenger.gd.N0(2131742758, null), i6Var);
                                v17.setGravity(3);
                                org.telegram.ui.ActionBar.u6.U(v17, i27, i6Var);
                                g14.addView(v17, c8.na.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            hi.e eVar2 = new hi.e(context, i6Var, true);
                            eVar2.setRoundRadius(24);
                            eVar2.e();
                            eVar2.setText(org.telegram.messenger.gd.N0(2131752577, null));
                            hi.e g15 = org.telegram.messenger.m10.g(24, context, i6Var, true);
                            g15.setText(org.telegram.messenger.gd.N0(2131742741, null));
                            g15.setEnabled(false);
                            linearLayout10.addView(eVar2, c8.na.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout10.addView(g15, c8.na.m(1.0f, 0, 44, 6, 0, 0));
                            g14.addView(linearLayout10);
                            e3Var2.L0(g14);
                            e3Var2.z0 = new h0(i2Var2, 2);
                            int i30 = 4;
                            org.telegram.ui.Wallet.p pVar = new org.telegram.ui.Wallet.p(m6Var2, i2Var2, g15, i30);
                            final int i31 = 0;
                            m6Var2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.t1(pVar, i31));
                            m6Var2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.u1(pVar, i31));
                            final org.telegram.ui.Wallet.v1 v1Var = new org.telegram.ui.Wallet.v1(g15, eVar2, m2Var4, i2Var2, e3Var2, i6Var, pVar);
                            g15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.w1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i31) {
                                        case 0:
                                            v1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            v1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i32 = 1;
                            eVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.w1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            v1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            v1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final org.telegram.ui.Wallet.g2 g2Var2 = new org.telegram.ui.Wallet.g2(zArr3, i2Var2, e3Var2, i31);
                            i2Var2.r = new org.telegram.ui.Wallet.m(e3Var2, i30);
                            final int i33 = 1;
                            e3Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.r1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i33) {
                                        case 0:
                                            g2 g2Var22 = (g2) g2Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(g2Var22);
                                            m2Var4.u(i2Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            g2 g2Var3 = (g2) g2Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(g2Var3);
                                            m2Var4.u(i2Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            e3Var2.show();
                            org.telegram.messenger.g0.h3(g2Var2, Math.max(0L, i19 - m2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e11) {
                            m2Var4.u(i2Var2);
                            org.telegram.ui.Components.kc.c0(org.telegram.ui.Wallet.m2.i("display signing data", e11));
                            return;
                        }
                    }
                } else if (str7 != null) {
                    org.telegram.ui.Components.kc.c0(str7);
                    break;
                }
                break;
            default:
                hi.e eVar3 = (hi.e) obj6;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                eVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.kc(w2Var.F, w2Var.J0).f0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i14).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                        StringBuilder n10 = i5.c.n("wear-auth: sending /token account=", i14, " dcId=", currentDatacenterId, " isTest=");
                        n10.append(isTestBackend);
                        org.telegram.messenger.a8.b(n10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = wc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                            b9.j0 j0Var = new b9.j0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str9 = (String) r7Var.d;
                            com.google.android.gms.common.api.internal.o0 o0Var = j0Var.i;
                            b9.g0 g0Var = new b9.g0(o0Var, str9, "/tg-wear-auth/token", c10);
                            o0Var.b.d(0, g0Var);
                            q6.m.n(g0Var, b9.i0.a).addOnSuccessListener(new uc1(i16, r7Var, eVar3)).addOnFailureListener(new tc1(eVar3, i15));
                            w2Var.dismiss();
                            break;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            new org.telegram.ui.Components.kc(w2Var.F, w2Var.J0).f0(e12.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.c0.t(w2Var.F, w2Var.J0, tL_error3, false);
                    break;
                } else {
                    new org.telegram.ui.Components.kc(w2Var.F, w2Var.J0).f0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ m60(hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, int i7, View view, a8.r7 r7Var) {
        this.c = eVar;
        this.d = w2Var;
        this.b = i7;
        this.e = view;
        this.f = r7Var;
    }

    public /* synthetic */ m60(LaunchActivity launchActivity, vf.b bVar, org.telegram.messenger.mp mpVar, int i7, TLRPC.User user) {
        this.c = launchActivity;
        this.d = bVar;
        this.e = mpVar;
        this.b = i7;
        this.f = user;
    }

    public /* synthetic */ m60(r90 r90Var, String str, String str2, String str3, int i7) {
        this.c = r90Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i7;
    }
}
