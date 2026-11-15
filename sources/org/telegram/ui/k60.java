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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k60(Context context, int i7, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.c = context;
        this.b = i7;
        this.d = l0Var;
        this.e = e6Var;
        this.f = runnable;
    }

    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v18 */
    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.e2 T;
        org.telegram.ui.Wallet.z1 z1Var;
        org.telegram.ui.Wallet.d2 d2Var;
        boolean z10;
        int i7;
        final int i10;
        CharSequence V;
        String str;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = this.b;
        int i16 = 2;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i17 = 1;
        switch (i14) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                vf.b bVar = (vf.b) obj5;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str2 = LaunchActivity.C1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    npVar.X3(user2, false, false);
                    npVar.W2(user2, 0, true, null);
                }
                launchActivity.m0(i15, user.id, tL_error);
                break;
            case 1:
                q90 q90Var = (q90) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = q90Var.a;
                q90Var.h = -1;
                if (!q90Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 == null) {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str3.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i18);
                                    i18++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(q90Var.b).getCurrentTime()) {
                                        if (q90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            q90Var.c();
                                            org.telegram.ui.Wallet.d2.q(q90Var.a, q90Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new m90(q90Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i19 = this.b;
                        if (i19 < 10) {
                            ai.f1 f1Var = new ai.f1(q90Var, str3, str4, str5, i19, 23);
                            q90Var.i = f1Var;
                            org.telegram.messenger.g0.i3(f1Var, 500L);
                            break;
                        } else {
                            q90Var.c();
                            if (q90Var.a()) {
                                org.telegram.ui.Components.cc.b0(org.telegram.messenger.hd.M0(2131742993, null));
                                break;
                            }
                        }
                    } else {
                        q90Var.c();
                        if (q90Var.a()) {
                            q90.d().f0(tL_error2, false);
                        }
                    }
                    break;
                } else {
                    q90Var.c();
                    break;
                }
                break;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj;
                String str6 = (String) obj2;
                if (z1Var2 != null) {
                    int i20 = z1Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = z1Var2.a;
                    String str7 = z1Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || org.telegram.messenger.gz.x || org.telegram.messenger.gz.C || org.telegram.messenger.m10.t0 != i15) {
                            l0Var.g.u(z1Var2);
                            break;
                        }
                    }
                    if (!"signData".equals(str7)) {
                        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i15);
                        org.telegram.ui.Wallet.d2 d2Var2 = x10.g;
                        org.telegram.ui.Wallet.c2 c2Var = z1Var2.f;
                        boolean equals = "signMessage".equals(str7);
                        final org.telegram.ui.Wallet.w2 w2Var = new org.telegram.ui.Wallet.w2(context, e6Var, new View[0]);
                        w2Var.J0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, e6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                        i9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            z1Var = z1Var2;
                            d2Var = d2Var2;
                            z10 = equals;
                            i9Var.p(org.telegram.messenger.gc.p(org.telegram.messenger.k20.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            z1Var = z1Var2;
                            d2Var = d2Var2;
                            z10 = equals;
                        }
                        linearLayout.addView(i9Var, c8.ja.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = org.telegram.ui.Wallet.d2.v(20, context, org.telegram.messenger.hd.V(null, null, z10 ? 2131743196 : 2131743195, tonconnectsession2.manifest.name), e6Var);
                        v.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout.addView(v, c8.ja.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(K0)) {
                            linearLayout.addView(org.telegram.ui.Wallet.d2.h(context, K0, e6Var), c8.ja.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.h6 h6Var = new org.telegram.ui.Wallet.h6(context, R.drawable.wallet_card_info, 24);
                        h6Var.getCardHolderView().setMaxLines(2);
                        h6Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.b2> list = c2Var.b;
                        long j3 = c2Var.c;
                        h6Var.setCardHolder(org.telegram.ui.Wallet.f8.c0(((org.telegram.ui.Wallet.b2) list.get(0)).a));
                        h6Var.getBalanceView().setText(org.telegram.ui.Wallet.d2.k(j3));
                        h6Var.getUsdBalanceView().setText(x10.m(j3, false));
                        linearLayout.addView(h6Var, c8.ja.o(-1, -2));
                        final int i21 = 0;
                        h6Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.e1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i21) {
                                    case 0:
                                        w2 w2Var2 = w2Var;
                                        hi.i1 i1Var = w2Var2.m1;
                                        if (1 < w2Var2.n1.size() && 1 != i1Var.getCurrentPosition()) {
                                            for (View view2 : i1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            i1Var.C(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        w2 w2Var3 = w2Var;
                                        hi.i1 i1Var2 = w2Var3.m1;
                                        if (w2Var3.n1.size() > 0 && i1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : i1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            i1Var2.C(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Wallet.v2 v2Var = new org.telegram.ui.Wallet.v2(context);
                        v2Var.getContent().addView(linearLayout, c8.ja.c(-2.0f, -1));
                        w2Var.I0(v2Var);
                        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
                        f10.addView(f11, c8.ja.o(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i22 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i22, e6Var), 1, -1);
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i22);
                        imageView.setBackground(h02);
                        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var);
                        int i23 = org.telegram.ui.ActionBar.j6.G6;
                        org.telegram.ui.ActionBar.q6.s(imageView, i23, e6Var, PorterDuff.Mode.SRC_IN);
                        c8.na.a(imageView);
                        f11.addView(imageView, c8.ja.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
                        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            i7 = i20;
                            i9Var2.p(org.telegram.messenger.gc.p(org.telegram.messenger.k20.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            i7 = i20;
                        }
                        f11.addView(i9Var2, c8.ja.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        f11.addView(linearLayout2, c8.ja.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.q6.U(textView, i23, e6Var);
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, c8.ja.o(-1, -2));
                        textView.setText(org.telegram.messenger.hd.M0(2131743167, null));
                        if (TextUtils.isEmpty(K0)) {
                            i10 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.z6, e6Var);
                            i10 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                            textView2.setText(K0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.e1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        w2 w2Var2 = w2Var;
                                        hi.i1 i1Var = w2Var2.m1;
                                        if (1 < w2Var2.n1.size() && 1 != i1Var.getCurrentPosition()) {
                                            for (View view2 : i1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            i1Var.C(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        w2 w2Var3 = w2Var;
                                        hi.i1 i1Var2 = w2Var3.m1;
                                        if (w2Var3.n1.size() > 0 && i1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : i1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            i1Var2.C(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(i10);
                        LinearLayout F = org.telegram.ui.Wallet.d2.F(context, org.telegram.messenger.hd.M0(2131743051, null), e6Var);
                        String C = org.telegram.ui.Wallet.d2.C(((org.telegram.ui.Wallet.b2) list.get(0)).a);
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.l0.s(j3, i10);
                        if (list.size() > i10) {
                            Integer valueOf = Integer.valueOf(list.size() - i10);
                            Object[] objArr = new Object[2];
                            objArr[0] = C;
                            objArr[i10] = valueOf;
                            V = org.telegram.messenger.hd.V(null, null, 2131742975, objArr);
                        } else {
                            Object[] objArr2 = new Object[i10];
                            objArr2[0] = C;
                            V = org.telegram.messenger.hd.V(null, null, 2131742976, objArr2);
                        }
                        F.addView(org.telegram.ui.Wallet.d2.c(context, s5, V, null, null, e6Var), c8.ja.o(-1, -2));
                        linearLayout3.addView(F, c8.ja.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = org.telegram.ui.Wallet.d2.F(context, org.telegram.messenger.hd.M0(2131743207, null), e6Var);
                        for (org.telegram.ui.Wallet.b2 b2Var : list) {
                            if (b2Var.b == null || b2Var.d != null) {
                                str = null;
                                i11 = 2131742981;
                            } else {
                                i11 = 2131743153;
                                str = null;
                            }
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            F2.addView(org.telegram.ui.Wallet.d2.c(context, org.telegram.messenger.hd.M0(i11, str), org.telegram.messenger.hd.V(str, str, 2131742976, org.telegram.ui.Wallet.d2.C(b2Var.a)), org.telegram.ui.Wallet.d2.b(-b2Var.e), b2Var.d, e6Var2), c8.ja.o(-1, -2));
                            e6Var = e6Var2;
                        }
                        org.telegram.ui.ActionBar.e6 e6Var3 = e6Var;
                        linearLayout3.addView(F2, c8.ja.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        bi.z3 z3Var = new bi.z3(context, 5);
                        z3Var.setFillViewport(false);
                        z3Var.addView(linearLayout3);
                        f10.addView(z3Var, c8.ja.o(-1, -2));
                        org.telegram.ui.Wallet.v2 v2Var2 = new org.telegram.ui.Wallet.v2(context);
                        v2Var2.getContent().addView(f10, c8.ja.c(-2.0f, -1));
                        w2Var.I0(v2Var2);
                        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                        TextView v10 = org.telegram.ui.Wallet.d2.v(14, context, null, e6Var3);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.e80(org.telegram.messenger.g0.L(80.0f), v10), 0, spannableStringBuilder.length(), 33);
                        v10.setText(org.telegram.messenger.hd.V(null, null, 2131743120, spannableStringBuilder));
                        v10.setVisibility(z10 ? 8 : 0);
                        org.telegram.ui.ActionBar.q6.U(v10, org.telegram.ui.ActionBar.j6.z6, e6Var3);
                        f12.addView(v10, c8.ja.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                        hi.d dVar = new hi.d(context, e6Var3, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(org.telegram.messenger.hd.M0(2131743143, null));
                        linearLayout4.addView(dVar, c8.ja.m(1.0f, 0, 44, 0, 6, 0));
                        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var3, true);
                        g10.setText(org.telegram.messenger.hd.M0(z10 ? 2131743012 : 2131743168, null));
                        g10.setEnabled(false);
                        linearLayout4.addView(g10, c8.ja.m(1.0f, 0, 44, 6, 0, 0));
                        f12.addView(linearLayout4);
                        w2Var.K0(f12);
                        final int i24 = 1;
                        final int i25 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.z1 z1Var3 = z1Var;
                        final org.telegram.ui.Wallet.d2 d2Var3 = d2Var;
                        final org.telegram.ui.Wallet.f1 f1Var2 = new org.telegram.ui.Wallet.f1(z1Var3, zArr2, g10, dVar, d2Var3, w2Var, zArr, e6Var3);
                        g10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.g1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i25) {
                                    case 0:
                                        f1Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        f1Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.g1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i24) {
                                    case 0:
                                        f1Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        f1Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.x1 x1Var = new org.telegram.ui.Wallet.x1(zArr, z1Var3, w2Var, i24);
                        long j10 = i7;
                        long j11 = c2Var.a;
                        if (j11 == 0) {
                            j11 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i15).getCurrentTime()) * 1000;
                        z1Var3.r = new org.telegram.ui.Wallet.l(w2Var, 5);
                        final int i26 = 0;
                        w2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.h1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i26) {
                                    case 0:
                                        x1 x1Var2 = (x1) x1Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(x1Var2);
                                        d2Var3.u(z1Var3);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        x1 x1Var3 = (x1) x1Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(x1Var3);
                                        d2Var3.u(z1Var3);
                                        Runnable runnable3 = runnable;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        w2Var.show();
                        org.telegram.messenger.g0.i3(x1Var, max);
                        oi.c cVar = new oi.c(zArr, z1Var3, zArr2, g10, z10, x10, v10, w2Var, e6Var3);
                        WalletEngine2 walletEngine2 = d2Var3.b.b;
                        if (!z1Var3.n && !d2Var3.j(z1Var3) && d2Var3.A(z1Var3) && walletEngine2 != null) {
                            if ("signMessage".equals(str7)) {
                                walletEngine2.previewSignMessage(c2Var, new org.telegram.ui.Wallet.m(d2Var3, z1Var3, cVar, 1));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(c2Var, new org.telegram.ui.Wallet.j(d2Var3, z1Var3, cVar, 9));
                                break;
                            }
                        } else {
                            cVar.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.d2 d2Var4 = org.telegram.ui.Wallet.l0.x(i15).g;
                        try {
                            JSONObject jSONObject = new JSONObject(z1Var2.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.w2 w2Var2 = new org.telegram.ui.Wallet.w2(context, e6Var, new View[0]);
                            w2Var2.J0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, e6Var));
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setOrientation(1);
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setGravity(16);
                            ImageView e10 = org.telegram.messenger.i20.e(context, R.drawable.ic_ab_close);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.q6.s(e10, org.telegram.ui.ActionBar.j6.G6, e6Var, PorterDuff.Mode.SRC_IN);
                            int i27 = org.telegram.ui.ActionBar.j6.i6;
                            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i27, e6Var), 1, -1);
                            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i27);
                            e10.setBackground(h03);
                            org.telegram.ui.ActionBar.q6.j(e10, h03, null, M2, e6Var);
                            e10.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
                            e10.setOnClickListener(new a90(24, z1Var2, w2Var2));
                            linearLayout6.addView(e10, c8.ja.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.i9 i9Var3 = new org.telegram.ui.Components.i9(context);
                            i9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                i9Var3.p(org.telegram.messenger.gc.p(org.telegram.messenger.k20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout6.addView(i9Var3, c8.ja.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            TextView v11 = org.telegram.ui.Wallet.d2.v(18, context, org.telegram.messenger.hd.M0(2131743011, null), e6Var);
                            v11.setTypeface(org.telegram.messenger.g0.o());
                            v11.setGravity(3);
                            linearLayout7.addView(v11, c8.ja.o(-1, -2));
                            TextView v12 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), e6Var);
                            int i28 = org.telegram.ui.ActionBar.j6.z6;
                            org.telegram.ui.ActionBar.q6.U(v12, i28, e6Var);
                            v12.setGravity(3);
                            v12.setSingleLine(true);
                            v12.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout7.addView(v12, c8.ja.o(-1, -2));
                            linearLayout6.addView(linearLayout7, c8.ja.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout5.addView(linearLayout6, c8.ja.o(-1, 56));
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setOrientation(1);
                            linearLayout8.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i29 = org.telegram.ui.ActionBar.j6.d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i29, e6Var));
                            org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i29);
                            linearLayout8.setBackground(d02);
                            org.telegram.ui.ActionBar.q6.j(linearLayout8, d02, M3, null, e6Var);
                            TextView v13 = org.telegram.ui.Wallet.d2.v(equals2 ? 14 : 16, context, equals2 ? jSONObject.optString("text") : org.telegram.messenger.hd.M0(2131743183, null), e6Var);
                            v13.setGravity(3);
                            v13.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v14 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.hd.M0(2131743010, null), e6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.q6.U(v14, org.telegram.ui.ActionBar.j6.L6, e6Var);
                                linearLayout8.addView(v14, c8.ja.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v13.setTypeface(Typeface.MONOSPACE);
                                i12 = -1;
                                i13 = -2;
                            } else {
                                LinearLayout linearLayout9 = new LinearLayout(context);
                                linearLayout9.setGravity(16);
                                TextView v15 = org.telegram.ui.Wallet.d2.v(12, context, "!", e6Var);
                                v15.setTypeface(org.telegram.messenger.g0.o());
                                v15.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i30 = org.telegram.ui.ActionBar.j6.q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(L2, org.telegram.ui.ActionBar.j6.w0(i30, e6Var));
                                org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i30);
                                v15.setBackground(d03);
                                org.telegram.ui.ActionBar.q6.j(v15, d03, M4, null, e6Var);
                                linearLayout9.addView(v15, c8.ja.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v16 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.hd.M0(2131743184, null), e6Var);
                                v16.setGravity(3);
                                v16.setTypeface(org.telegram.messenger.g0.o());
                                i12 = -1;
                                i13 = -2;
                                linearLayout9.addView(v16, c8.ja.o(-1, -2));
                                linearLayout8.addView(linearLayout9, c8.ja.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout8.addView(v13, c8.ja.o(i12, i13));
                            if (equals2) {
                                v13.setOnClickListener(new org.telegram.ui.Wallet.i1(jSONObject, w2Var2, e6Var, 0));
                            }
                            bi.z3 z3Var2 = new bi.z3(context, 4);
                            z3Var2.addView(linearLayout8);
                            linearLayout5.addView(z3Var2, c8.ja.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.v2 v2Var3 = new org.telegram.ui.Wallet.v2(context);
                            v2Var3.getContent().addView(linearLayout5, c8.ja.c(-2.0f, -1));
                            w2Var2.I0(v2Var3);
                            LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                            if (equals2) {
                                TextView v17 = org.telegram.ui.Wallet.d2.v(14, context, org.telegram.messenger.hd.M0(2131743029, null), e6Var);
                                v17.setGravity(3);
                                org.telegram.ui.ActionBar.q6.U(v17, i28, e6Var);
                                f13.addView(v17, c8.ja.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            hi.d dVar2 = new hi.d(context, e6Var, true);
                            dVar2.setRoundRadius(24);
                            dVar2.e();
                            dVar2.setText(org.telegram.messenger.hd.M0(2131752589, null));
                            hi.d g11 = org.telegram.messenger.i20.g(24, context, e6Var, true);
                            g11.setText(org.telegram.messenger.hd.M0(2131743012, null));
                            g11.setEnabled(false);
                            linearLayout10.addView(dVar2, c8.ja.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout10.addView(g11, c8.ja.m(1.0f, 0, 44, 6, 0, 0));
                            f13.addView(linearLayout10);
                            w2Var2.K0(f13);
                            w2Var2.z0 = new h0(z1Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(z3Var2, z1Var2, g11, 3);
                            final int i31 = 0;
                            z3Var2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.j1(gVar, i31));
                            z3Var2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.k1(gVar, i31));
                            final org.telegram.ui.Wallet.l1 l1Var = new org.telegram.ui.Wallet.l1(g11, dVar2, d2Var4, z1Var2, w2Var2, e6Var, gVar);
                            g11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i31) {
                                        case 0:
                                            l1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            l1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i32 = 1;
                            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.m1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            l1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            l1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final org.telegram.ui.Wallet.x1 x1Var2 = new org.telegram.ui.Wallet.x1(zArr3, z1Var2, w2Var2, i31);
                            z1Var2.r = new org.telegram.ui.Wallet.l(w2Var2, 5);
                            final int i33 = 1;
                            w2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.h1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i33) {
                                        case 0:
                                            x1 x1Var22 = (x1) x1Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(x1Var22);
                                            d2Var4.u(z1Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            x1 x1Var3 = (x1) x1Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(x1Var3);
                                            d2Var4.u(z1Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            w2Var2.show();
                            org.telegram.messenger.g0.i3(x1Var2, Math.max(0L, i20 - d2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e11) {
                            d2Var4.u(z1Var2);
                            org.telegram.ui.Components.cc.b0(org.telegram.ui.Wallet.d2.i("display signing data", e11));
                            return;
                        }
                    }
                } else if (str6 != null) {
                    org.telegram.ui.Components.cc.b0(str6);
                    break;
                }
                break;
            default:
                hi.d dVar3 = (hi.d) obj6;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.cc(u2Var.F, u2Var.J0).e0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i15).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                        StringBuilder n10 = i5.c.n("wear-auth: sending /token account=", i15, " dcId=", currentDatacenterId, " isTest=");
                        n10.append(isTestBackend);
                        org.telegram.messenger.a8.b(n10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = vc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                            b9.k0 k0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str8 = (String) r7Var.d;
                            com.google.android.gms.common.api.internal.p0 p0Var = k0Var.i;
                            b9.h0 h0Var = new b9.h0(p0Var, str8, "/tg-wear-auth/token", c10);
                            p0Var.b.d(0, h0Var);
                            q6.m.m(h0Var, b9.j0.a).addOnSuccessListener(new org.telegram.ui.Wallet.k8(i16, r7Var, dVar3)).addOnFailureListener(new tc1(dVar3, i17));
                            u2Var.dismiss();
                            break;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            new org.telegram.ui.Components.cc(u2Var.F, u2Var.J0).e0(e12.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.y0.q(u2Var.F, u2Var.J0, tL_error3, false);
                    break;
                } else {
                    new org.telegram.ui.Components.cc(u2Var.F, u2Var.J0).e0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ k60(hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, int i7, View view, a8.r7 r7Var) {
        this.c = dVar;
        this.d = u2Var;
        this.b = i7;
        this.e = view;
        this.f = r7Var;
    }

    public /* synthetic */ k60(LaunchActivity launchActivity, vf.b bVar, org.telegram.messenger.np npVar, int i7, TLRPC.User user) {
        this.c = launchActivity;
        this.d = bVar;
        this.e = npVar;
        this.b = i7;
        this.f = user;
    }

    public /* synthetic */ k60(q90 q90Var, String str, String str2, String str3, int i7) {
        this.c = q90Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i7;
    }
}
