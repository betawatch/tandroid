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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f60(Context context, int i3, org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.c = context;
        this.b = i3;
        this.d = k0Var;
        this.e = e6Var;
        this.f = runnable;
    }

    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v45 */
    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.d2 T;
        org.telegram.ui.Wallet.y1 y1Var;
        org.telegram.ui.Wallet.c2 c2Var;
        boolean z10;
        int i3;
        final int i10;
        CharSequence V;
        String str;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i14) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                sf.b bVar = (sf.b) obj5;
                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str2 = LaunchActivity.E1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    hpVar.X3(user2, false, false);
                    hpVar.W2(user2, 0, true, null);
                }
                launchActivity.m0(i15, user.id, tL_error);
                break;
            case 1:
                m90 m90Var = (m90) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = m90Var.a;
                m90Var.h = -1;
                if (!m90Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 == null) {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str3.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i16);
                                    i16++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(m90Var.b).getCurrentTime()) {
                                        if (m90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            m90Var.c();
                                            org.telegram.ui.Wallet.c2.q(m90Var.a, m90Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new i90(m90Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i17 = this.b;
                        if (i17 < 10) {
                            ai.p1 p1Var = new ai.p1(m90Var, str3, str4, str5, i17, 23);
                            m90Var.i = p1Var;
                            org.telegram.messenger.g0.i3(p1Var, 500L);
                            break;
                        } else {
                            m90Var.c();
                            if (m90Var.a()) {
                                org.telegram.ui.Components.fc.b0(org.telegram.messenger.bd.M0(2131743003, null));
                                break;
                            }
                        }
                    } else {
                        m90Var.c();
                        if (m90Var.a()) {
                            m90.d().f0(tL_error2, false);
                        }
                    }
                    break;
                } else {
                    m90Var.c();
                    break;
                }
                break;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) obj;
                String str6 = (String) obj2;
                if (y1Var2 != null) {
                    int i18 = y1Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = y1Var2.a;
                    String str7 = y1Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.I1 || org.telegram.messenger.az.x || org.telegram.messenger.az.C || org.telegram.messenger.h10.t0 != i15) {
                            k0Var.g.u(y1Var2);
                            break;
                        }
                    }
                    if (!"signData".equals(str7)) {
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i15);
                        org.telegram.ui.Wallet.c2 c2Var2 = x10.g;
                        org.telegram.ui.Wallet.b2 b2Var = y1Var2.f;
                        boolean equals = "signMessage".equals(str7);
                        final org.telegram.ui.Wallet.x2 x2Var = new org.telegram.ui.Wallet.x2(context, e6Var, new View[0]);
                        x2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            y1Var = y1Var2;
                            c2Var = c2Var2;
                            z10 = equals;
                            k9Var.p(org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            y1Var = y1Var2;
                            c2Var = c2Var2;
                            z10 = equals;
                        }
                        linearLayout.addView(k9Var, b8.mf.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = org.telegram.ui.Wallet.c2.v(20, context, org.telegram.messenger.bd.V(null, null, z10 ? 2131743206 : 2131743205, tonconnectsession2.manifest.name), e6Var);
                        v.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout.addView(v, b8.mf.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(K0)) {
                            linearLayout.addView(org.telegram.ui.Wallet.c2.h(context, K0, e6Var), b8.mf.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.f6 f6Var = new org.telegram.ui.Wallet.f6(context, R.drawable.wallet_card_info, 24);
                        f6Var.getCardHolderView().setMaxLines(2);
                        f6Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.a2> list = b2Var.b;
                        long j10 = b2Var.c;
                        f6Var.setCardHolder(org.telegram.ui.Wallet.e8.c0(((org.telegram.ui.Wallet.a2) list.get(0)).a));
                        f6Var.getBalanceView().setText(org.telegram.ui.Wallet.c2.k(j10));
                        f6Var.getUsdBalanceView().setText(x10.m(j10, false));
                        linearLayout.addView(f6Var, b8.mf.o(-1, -2));
                        final int i19 = 0;
                        f6Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.d1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i19) {
                                    case 0:
                                        x2 x2Var2 = x2Var;
                                        gi.g1 g1Var = x2Var2.j1;
                                        if (1 < x2Var2.k1.size() && 1 != g1Var.getCurrentPosition()) {
                                            for (View view2 : g1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            g1Var.D(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        x2 x2Var3 = x2Var;
                                        gi.g1 g1Var2 = x2Var3.j1;
                                        if (x2Var3.k1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : g1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            g1Var2.D(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Wallet.w2 w2Var = new org.telegram.ui.Wallet.w2(context);
                        w2Var.getContent().addView(linearLayout, b8.mf.c(-2.0f, -1));
                        x2Var.I0(w2Var);
                        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
                        f10.addView(f11, b8.mf.o(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i20 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i20, e6Var), 1, -1);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i20);
                        imageView.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
                        int i21 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.t(imageView, i21, e6Var, PorterDuff.Mode.SRC_IN);
                        b8.pf.a(imageView);
                        f11.addView(imageView, b8.mf.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
                        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            i3 = i18;
                            k9Var2.p(org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            i3 = i18;
                        }
                        f11.addView(k9Var2, b8.mf.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        f11.addView(linearLayout2, b8.mf.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.r6.V(textView, i21, e6Var);
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, b8.mf.o(-1, -2));
                        textView.setText(org.telegram.messenger.bd.M0(2131743177, null));
                        if (TextUtils.isEmpty(K0)) {
                            i10 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, e6Var);
                            i10 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout2.addView(textView2, b8.mf.o(-1, -2));
                            textView2.setText(K0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.d1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        x2 x2Var2 = x2Var;
                                        gi.g1 g1Var = x2Var2.j1;
                                        if (1 < x2Var2.k1.size() && 1 != g1Var.getCurrentPosition()) {
                                            for (View view2 : g1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            g1Var.D(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        x2 x2Var3 = x2Var;
                                        gi.g1 g1Var2 = x2Var3.j1;
                                        if (x2Var3.k1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : g1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            g1Var2.D(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(i10);
                        LinearLayout F = org.telegram.ui.Wallet.c2.F(context, org.telegram.messenger.bd.M0(2131743061, null), e6Var);
                        String C = org.telegram.ui.Wallet.c2.C(((org.telegram.ui.Wallet.a2) list.get(0)).a);
                        SpannableStringBuilder s6 = org.telegram.ui.Wallet.k0.s(j10, i10);
                        if (list.size() > i10) {
                            Integer valueOf = Integer.valueOf(list.size() - i10);
                            Object[] objArr = new Object[2];
                            objArr[0] = C;
                            objArr[i10] = valueOf;
                            V = org.telegram.messenger.bd.V(null, null, 2131742985, objArr);
                        } else {
                            Object[] objArr2 = new Object[i10];
                            objArr2[0] = C;
                            V = org.telegram.messenger.bd.V(null, null, 2131742986, objArr2);
                        }
                        F.addView(org.telegram.ui.Wallet.c2.c(context, s6, V, null, null, e6Var), b8.mf.o(-1, -2));
                        linearLayout3.addView(F, b8.mf.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = org.telegram.ui.Wallet.c2.F(context, org.telegram.messenger.bd.M0(2131743217, null), e6Var);
                        for (org.telegram.ui.Wallet.a2 a2Var : list) {
                            if (a2Var.b == null || a2Var.d != null) {
                                str = null;
                                i11 = 2131742991;
                            } else {
                                i11 = 2131743163;
                                str = null;
                            }
                            F2.addView(org.telegram.ui.Wallet.c2.c(context, org.telegram.messenger.bd.M0(i11, str), org.telegram.messenger.bd.V(str, str, 2131742986, org.telegram.ui.Wallet.c2.C(a2Var.a)), org.telegram.ui.Wallet.c2.b(-a2Var.e), a2Var.d, e6Var), b8.mf.o(-1, -2));
                        }
                        linearLayout3.addView(F2, b8.mf.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        ai.l4 l4Var = new ai.l4(context, 5);
                        l4Var.setFillViewport(false);
                        l4Var.addView(linearLayout3);
                        f10.addView(l4Var, b8.mf.o(-1, -2));
                        org.telegram.ui.Wallet.w2 w2Var2 = new org.telegram.ui.Wallet.w2(context);
                        w2Var2.getContent().addView(f10, b8.mf.c(-2.0f, -1));
                        x2Var.I0(w2Var2);
                        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                        TextView v10 = org.telegram.ui.Wallet.c2.v(14, context, null, e6Var);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x70(org.telegram.messenger.g0.L(80.0f), v10), 0, spannableStringBuilder.length(), 33);
                        v10.setText(org.telegram.messenger.bd.V(null, null, 2131743130, spannableStringBuilder));
                        v10.setVisibility(z10 ? 8 : 0);
                        org.telegram.ui.ActionBar.r6.V(v10, org.telegram.ui.ActionBar.k6.z6, e6Var);
                        f12.addView(v10, b8.mf.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                        gi.d dVar = new gi.d(context, e6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(org.telegram.messenger.bd.M0(2131743153, null));
                        linearLayout4.addView(dVar, b8.mf.m(1.0f, 0, 44, 0, 6, 0));
                        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
                        h.setText(org.telegram.messenger.bd.M0(z10 ? 2131743022 : 2131743178, null));
                        h.setEnabled(false);
                        linearLayout4.addView(h, b8.mf.m(1.0f, 0, 44, 6, 0, 0));
                        f12.addView(linearLayout4);
                        x2Var.K0(f12);
                        final int i22 = 1;
                        final int i23 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.y1 y1Var3 = y1Var;
                        final org.telegram.ui.Wallet.c2 c2Var3 = c2Var;
                        final org.telegram.ui.Wallet.e1 e1Var = new org.telegram.ui.Wallet.e1(y1Var3, zArr2, h, dVar, c2Var3, x2Var, zArr, e6Var);
                        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i23) {
                                    case 0:
                                        e1Var.a(Boolean.FALSE);
                                        break;
                                    default:
                                        e1Var.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        e1Var.a(Boolean.FALSE);
                                        break;
                                    default:
                                        e1Var.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.w1 w1Var = new org.telegram.ui.Wallet.w1(zArr, y1Var3, x2Var, i22);
                        long j11 = i3;
                        long j12 = b2Var.a;
                        if (j12 == 0) {
                            j12 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i15).getCurrentTime()) * 1000;
                        y1Var3.r = new org.telegram.ui.Wallet.l(x2Var, 5);
                        final int i24 = 0;
                        x2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.g1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i24) {
                                    case 0:
                                        w1 w1Var2 = (w1) w1Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(w1Var2);
                                        c2Var3.u(y1Var3);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        w1 w1Var3 = (w1) w1Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(w1Var3);
                                        c2Var3.u(y1Var3);
                                        Runnable runnable3 = runnable;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        x2Var.show();
                        org.telegram.messenger.g0.i3(w1Var, max);
                        mi.c cVar = new mi.c(zArr, y1Var3, zArr2, h, z10, x10, v10, x2Var, e6Var);
                        WalletEngine2 walletEngine2 = c2Var3.b.b;
                        if (!y1Var3.n && !c2Var3.j(y1Var3) && c2Var3.A(y1Var3) && walletEngine2 != null) {
                            if ("signMessage".equals(str7)) {
                                walletEngine2.previewSignMessage(b2Var, new org.telegram.ui.Wallet.m(c2Var3, y1Var3, cVar, 1));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(b2Var, new org.telegram.ui.Wallet.j(c2Var3, y1Var3, cVar, 9));
                                break;
                            }
                        } else {
                            cVar.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.c2 c2Var4 = org.telegram.ui.Wallet.k0.x(i15).g;
                        try {
                            JSONObject jSONObject = new JSONObject(y1Var2.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.x2 x2Var2 = new org.telegram.ui.Wallet.x2(context, e6Var, new View[0]);
                            x2Var2.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var));
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setOrientation(1);
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setGravity(16);
                            ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.ic_ab_close);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.G6, e6Var, PorterDuff.Mode.SRC_IN);
                            int i25 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i25, e6Var), 1, -1);
                            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i25);
                            e10.setBackground(h03);
                            org.telegram.ui.ActionBar.r6.k(e10, h03, null, N2, e6Var);
                            e10.setContentDescription(org.telegram.messenger.bd.M0(2131752041, null));
                            e10.setOnClickListener(new hb0(22, y1Var2, x2Var2));
                            linearLayout6.addView(e10, b8.mf.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.k9 k9Var3 = new org.telegram.ui.Components.k9(context);
                            k9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                k9Var3.p(org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout6.addView(k9Var3, b8.mf.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            TextView v11 = org.telegram.ui.Wallet.c2.v(18, context, org.telegram.messenger.bd.M0(2131743021, null), e6Var);
                            v11.setTypeface(org.telegram.messenger.g0.o());
                            v11.setGravity(3);
                            linearLayout7.addView(v11, b8.mf.o(-1, -2));
                            TextView v12 = org.telegram.ui.Wallet.c2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), e6Var);
                            int i26 = org.telegram.ui.ActionBar.k6.z6;
                            org.telegram.ui.ActionBar.r6.V(v12, i26, e6Var);
                            v12.setGravity(3);
                            v12.setSingleLine(true);
                            v12.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout7.addView(v12, b8.mf.o(-1, -2));
                            linearLayout6.addView(linearLayout7, b8.mf.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout5.addView(linearLayout6, b8.mf.o(-1, 56));
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setOrientation(1);
                            linearLayout8.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i27 = org.telegram.ui.ActionBar.k6.d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i27, e6Var));
                            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i27);
                            linearLayout8.setBackground(d02);
                            org.telegram.ui.ActionBar.r6.k(linearLayout8, d02, N3, null, e6Var);
                            TextView v13 = org.telegram.ui.Wallet.c2.v(equals2 ? 14 : 16, context, equals2 ? jSONObject.optString("text") : org.telegram.messenger.bd.M0(2131743193, null), e6Var);
                            v13.setGravity(3);
                            v13.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v14 = org.telegram.ui.Wallet.c2.v(14, context, org.telegram.messenger.bd.M0(2131743020, null), e6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.r6.V(v14, org.telegram.ui.ActionBar.k6.L6, e6Var);
                                linearLayout8.addView(v14, b8.mf.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v13.setTypeface(Typeface.MONOSPACE);
                                i12 = -1;
                                i13 = -2;
                            } else {
                                LinearLayout linearLayout9 = new LinearLayout(context);
                                linearLayout9.setGravity(16);
                                TextView v15 = org.telegram.ui.Wallet.c2.v(12, context, "!", e6Var);
                                v15.setTypeface(org.telegram.messenger.g0.o());
                                v15.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i28 = org.telegram.ui.ActionBar.k6.q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i28, e6Var));
                                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i28);
                                v15.setBackground(d03);
                                org.telegram.ui.ActionBar.r6.k(v15, d03, N4, null, e6Var);
                                linearLayout9.addView(v15, b8.mf.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v16 = org.telegram.ui.Wallet.c2.v(14, context, org.telegram.messenger.bd.M0(2131743194, null), e6Var);
                                v16.setGravity(3);
                                v16.setTypeface(org.telegram.messenger.g0.o());
                                i12 = -1;
                                i13 = -2;
                                linearLayout9.addView(v16, b8.mf.o(-1, -2));
                                linearLayout8.addView(linearLayout9, b8.mf.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout8.addView(v13, b8.mf.o(i12, i13));
                            if (equals2) {
                                v13.setOnClickListener(new org.telegram.ui.Wallet.h1(jSONObject, x2Var2, e6Var, 0));
                            }
                            ai.l4 l4Var2 = new ai.l4(context, 4);
                            l4Var2.addView(linearLayout8);
                            linearLayout5.addView(l4Var2, b8.mf.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.w2 w2Var3 = new org.telegram.ui.Wallet.w2(context);
                            w2Var3.getContent().addView(linearLayout5, b8.mf.c(-2.0f, -1));
                            x2Var2.I0(w2Var3);
                            LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                            if (equals2) {
                                TextView v17 = org.telegram.ui.Wallet.c2.v(14, context, org.telegram.messenger.bd.M0(2131743039, null), e6Var);
                                v17.setGravity(3);
                                org.telegram.ui.ActionBar.r6.V(v17, i26, e6Var);
                                f13.addView(v17, b8.mf.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            gi.d dVar2 = new gi.d(context, e6Var, true);
                            dVar2.setRoundRadius(24);
                            dVar2.e();
                            dVar2.setText(org.telegram.messenger.bd.M0(2131752589, null));
                            gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, true);
                            h7.setText(org.telegram.messenger.bd.M0(2131743022, null));
                            h7.setEnabled(false);
                            linearLayout10.addView(dVar2, b8.mf.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout10.addView(h7, b8.mf.m(1.0f, 0, 44, 6, 0, 0));
                            f13.addView(linearLayout10);
                            x2Var2.K0(f13);
                            x2Var2.z0 = new i0(y1Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(l4Var2, y1Var2, h7, 3);
                            final int i29 = 0;
                            l4Var2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.i1(gVar, i29));
                            l4Var2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.j1(gVar, i29));
                            final org.telegram.ui.Wallet.k1 k1Var = new org.telegram.ui.Wallet.k1(h7, dVar2, c2Var4, y1Var2, x2Var2, e6Var, gVar);
                            h7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.l1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            k1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            k1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i30 = 1;
                            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.l1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i30) {
                                        case 0:
                                            k1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            k1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final org.telegram.ui.Wallet.w1 w1Var2 = new org.telegram.ui.Wallet.w1(zArr3, y1Var2, x2Var2, i29);
                            y1Var2.r = new org.telegram.ui.Wallet.l(x2Var2, 5);
                            final int i31 = 1;
                            x2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.g1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i31) {
                                        case 0:
                                            w1 w1Var22 = (w1) w1Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(w1Var22);
                                            c2Var4.u(y1Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            w1 w1Var3 = (w1) w1Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(w1Var3);
                                            c2Var4.u(y1Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            x2Var2.show();
                            org.telegram.messenger.g0.i3(w1Var2, Math.max(0L, i18 - c2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e11) {
                            c2Var4.u(y1Var2);
                            org.telegram.ui.Components.fc.b0(org.telegram.ui.Wallet.c2.i("display signing data", e11));
                            return;
                        }
                    }
                } else if (str6 != null) {
                    org.telegram.ui.Components.fc.b0(str6);
                    break;
                }
                break;
            default:
                gi.d dVar3 = (gi.d) obj6;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj5;
                View view = (View) obj4;
                b8.ke keVar = (b8.ke) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i15).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("wear-auth: sending /token account=", i15, " dcId=", currentDatacenterId, " isTest=");
                        m10.append(isTestBackend);
                        org.telegram.messenger.a8.b(m10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c2 = qc1.c(keVar, queryParameter, currentDatacenterId, isTestBackend);
                            a9.j0 j0Var = new a9.j0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str8 = (String) keVar.d;
                            com.google.android.gms.common.api.internal.n0 n0Var = j0Var.i;
                            a9.g0 g0Var = new a9.g0(n0Var, str8, "/tg-wear-auth/token", c2);
                            n0Var.b.d(0, g0Var);
                            p6.m.m(g0Var, a9.i0.a).addOnSuccessListener(new na1(6, keVar, dVar3)).addOnFailureListener(new oc1(dVar3, 1));
                            t2Var.dismiss();
                            break;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0(e12.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.v(t2Var.F, t2Var.J0, tL_error3, false);
                    break;
                } else {
                    new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ f60(gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, int i3, View view, b8.ke keVar) {
        this.c = dVar;
        this.d = t2Var;
        this.b = i3;
        this.e = view;
        this.f = keVar;
    }

    public /* synthetic */ f60(LaunchActivity launchActivity, sf.b bVar, org.telegram.messenger.hp hpVar, int i3, TLRPC.User user) {
        this.c = launchActivity;
        this.d = bVar;
        this.e = hpVar;
        this.b = i3;
        this.f = user;
    }

    public /* synthetic */ f60(m90 m90Var, String str, String str2, String str3, int i3) {
        this.c = m90Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i3;
    }
}
