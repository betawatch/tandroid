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
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.hk;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j70 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j70(Context context, int i10, org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
        this.c = context;
        this.b = i10;
        this.d = k0Var;
        this.e = p6Var;
        this.f = runnable;
    }

    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v47 */
    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.k2 T;
        org.telegram.ui.Wallet.a2 a2Var;
        org.telegram.ui.Wallet.e2 e2Var;
        boolean z10;
        String str;
        final int i10;
        CharSequence V;
        String str2;
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
                gf.e eVar = (gf.e) obj5;
                org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                if (eVar != null) {
                    eVar.b();
                }
                if (user2 != null) {
                    vpVar.U3(user2, false, false);
                    vpVar.U2(user2, 0, true, null);
                }
                launchActivity.m0(i15, user.id, tL_error);
                break;
            case 1:
                ua0 ua0Var = (ua0) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = ua0Var.a;
                ua0Var.h = -1;
                if (!ua0Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
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
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(ua0Var.b).getCurrentTime()) {
                                        if (ua0Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            ua0Var.c();
                                            org.telegram.ui.Wallet.e2.q(ua0Var.a, ua0Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new qa0(ua0Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i17 = this.b;
                        if (i17 < 10) {
                            i2.g1 g1Var = new i2.g1(ua0Var, str3, str4, str5, i17, 17);
                            ua0Var.i = g1Var;
                            org.telegram.messenger.i0.h3(g1Var, 500L);
                            break;
                        } else {
                            ua0Var.c();
                            if (ua0Var.a()) {
                                org.telegram.ui.Components.cc.b0(org.telegram.messenger.cd.L0(2131743019, null));
                                break;
                            }
                        }
                    } else {
                        ua0Var.c();
                        if (ua0Var.a()) {
                            ua0.d().f0(tL_error2, false);
                        }
                    }
                    break;
                } else {
                    ua0Var.c();
                    break;
                }
                break;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj;
                String str6 = (String) obj2;
                if (a2Var2 != null) {
                    int i18 = a2Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = a2Var2.a;
                    String str7 = a2Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || org.telegram.messenger.tz.x || org.telegram.messenger.tz.C || org.telegram.messenger.d20.s0 != i15) {
                            k0Var.g.u(a2Var2);
                            break;
                        }
                    }
                    if (!"signData".equals(str7)) {
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i15);
                        org.telegram.ui.Wallet.e2 e2Var2 = x10.g;
                        org.telegram.ui.Wallet.d2 d2Var = a2Var2.f;
                        boolean equals = "signMessage".equals(str7);
                        final org.telegram.ui.Wallet.y2 y2Var = new org.telegram.ui.Wallet.y2(context, p6Var, new View[0]);
                        y2Var.J0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, p6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                        g9Var.setRoundRadius(org.telegram.messenger.i0.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            a2Var = a2Var2;
                            e2Var = e2Var2;
                            z10 = equals;
                            g9Var.p(org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            a2Var = a2Var2;
                            e2Var = e2Var2;
                            z10 = equals;
                        }
                        linearLayout.addView(g9Var, w7.b6.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = org.telegram.ui.Wallet.e2.v(20, context, org.telegram.messenger.cd.V(null, null, z10 ? 2131743222 : 2131743221, tonconnectsession2.manifest.name), p6Var);
                        v.setTypeface(org.telegram.messenger.i0.o());
                        linearLayout.addView(v, w7.b6.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String K0 = org.telegram.messenger.i0.K0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(K0)) {
                            linearLayout.addView(org.telegram.ui.Wallet.e2.h(context, K0, p6Var), w7.b6.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.l6 l6Var = new org.telegram.ui.Wallet.l6(context, R.drawable.wallet_card_info, 24);
                        l6Var.getCardHolderView().setMaxLines(2);
                        l6Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.c2> list = d2Var.b;
                        long j10 = d2Var.c;
                        l6Var.setCardHolder(org.telegram.ui.Wallet.k8.b0(((org.telegram.ui.Wallet.c2) list.get(0)).a));
                        l6Var.getBalanceView().setText(org.telegram.ui.Wallet.e2.k(j10));
                        l6Var.getUsdBalanceView().setText(x10.m(j10, false));
                        linearLayout.addView(l6Var, w7.b6.o(-1, -2));
                        final int i19 = 0;
                        l6Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i19) {
                                    case 0:
                                        y2 y2Var2 = y2Var;
                                        hk hkVar = y2Var2.i1;
                                        if (1 < y2Var2.j1.size() && 1 != hkVar.getCurrentPosition()) {
                                            for (View view2 : hkVar.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.i0.v1(view2);
                                                }
                                            }
                                            hkVar.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        y2 y2Var3 = y2Var;
                                        hk hkVar2 = y2Var3.i1;
                                        if (y2Var3.j1.size() > 0 && hkVar2.getCurrentPosition() != 0) {
                                            for (View view3 : hkVar2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.i0.v1(view3);
                                                }
                                            }
                                            hkVar2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Wallet.x2 x2Var = new org.telegram.ui.Wallet.x2(context);
                        x2Var.getContent().addView(linearLayout, w7.b6.c(-2.0f, -1));
                        y2Var.I0(x2Var);
                        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                        LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
                        f7.addView(f10, w7.b6.o(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i20 = org.telegram.ui.ActionBar.t6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i20, p6Var), 1, -1);
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i20);
                        imageView.setBackground(h02);
                        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
                        int i21 = org.telegram.ui.ActionBar.t6.G6;
                        org.telegram.ui.ActionBar.a7.t(imageView, i21, p6Var, PorterDuff.Mode.SRC_IN);
                        w7.e6.a(imageView);
                        f10.addView(imageView, w7.b6.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
                        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            str = "signMessage";
                            g9Var2.p(org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            str = "signMessage";
                        }
                        f10.addView(g9Var2, w7.b6.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        f10.addView(linearLayout2, w7.b6.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        org.telegram.ui.ActionBar.a7.V(textView, i21, p6Var);
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, w7.b6.o(-1, -2));
                        textView.setText(org.telegram.messenger.cd.L0(2131743193, null));
                        if (TextUtils.isEmpty(K0)) {
                            i10 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, p6Var);
                            i10 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                            textView2.setText(K0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        y2 y2Var2 = y2Var;
                                        hk hkVar = y2Var2.i1;
                                        if (1 < y2Var2.j1.size() && 1 != hkVar.getCurrentPosition()) {
                                            for (View view2 : hkVar.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.i0.v1(view2);
                                                }
                                            }
                                            hkVar.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        y2 y2Var3 = y2Var;
                                        hk hkVar2 = y2Var3.i1;
                                        if (y2Var3.j1.size() > 0 && hkVar2.getCurrentPosition() != 0) {
                                            for (View view3 : hkVar2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.i0.v1(view3);
                                                }
                                            }
                                            hkVar2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(i10);
                        LinearLayout F = org.telegram.ui.Wallet.e2.F(context, org.telegram.messenger.cd.L0(2131743077, null), p6Var);
                        String C = org.telegram.ui.Wallet.e2.C(((org.telegram.ui.Wallet.c2) list.get(0)).a);
                        SpannableStringBuilder s10 = org.telegram.ui.Wallet.k0.s(j10, i10);
                        if (list.size() > i10) {
                            Integer valueOf = Integer.valueOf(list.size() - i10);
                            Object[] objArr = new Object[2];
                            objArr[0] = C;
                            objArr[i10] = valueOf;
                            V = org.telegram.messenger.cd.V(null, null, 2131743001, objArr);
                        } else {
                            Object[] objArr2 = new Object[i10];
                            objArr2[0] = C;
                            V = org.telegram.messenger.cd.V(null, null, 2131743002, objArr2);
                        }
                        F.addView(org.telegram.ui.Wallet.e2.c(context, s10, V, null, null, p6Var), w7.b6.o(-1, -2));
                        linearLayout3.addView(F, w7.b6.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = org.telegram.ui.Wallet.e2.F(context, org.telegram.messenger.cd.L0(2131743233, null), p6Var);
                        for (org.telegram.ui.Wallet.c2 c2Var : list) {
                            if (c2Var.b == null || c2Var.d != null) {
                                str2 = null;
                                i11 = 2131743007;
                            } else {
                                i11 = 2131743179;
                                str2 = null;
                            }
                            F2.addView(org.telegram.ui.Wallet.e2.c(context, org.telegram.messenger.cd.L0(i11, str2), org.telegram.messenger.cd.V(str2, str2, 2131743002, org.telegram.ui.Wallet.e2.C(c2Var.a)), org.telegram.ui.Wallet.e2.b(-c2Var.e), c2Var.d, p6Var), w7.b6.o(-1, -2));
                        }
                        linearLayout3.addView(F2, w7.b6.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        org.telegram.ui.Components.w60 w60Var = new org.telegram.ui.Components.w60(context, 4);
                        w60Var.setFillViewport(false);
                        w60Var.addView(linearLayout3);
                        f7.addView(w60Var, w7.b6.o(-1, -2));
                        org.telegram.ui.Wallet.x2 x2Var2 = new org.telegram.ui.Wallet.x2(context);
                        x2Var2.getContent().addView(f7, w7.b6.c(-2.0f, -1));
                        y2Var.I0(x2Var2);
                        LinearLayout f11 = org.telegram.messenger.m5.f(context, 1);
                        TextView v10 = org.telegram.ui.Wallet.e2.v(14, context, null, p6Var);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u80(org.telegram.messenger.i0.L(80.0f), v10), 0, spannableStringBuilder.length(), 33);
                        v10.setText(org.telegram.messenger.cd.V(null, null, 2131743146, spannableStringBuilder));
                        v10.setVisibility(z10 ? 8 : 0);
                        org.telegram.ui.ActionBar.a7.V(v10, org.telegram.ui.ActionBar.t6.z6, p6Var);
                        f11.addView(v10, w7.b6.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                        vh.d dVar = new vh.d(context, p6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(org.telegram.messenger.cd.L0(2131743169, null));
                        linearLayout4.addView(dVar, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
                        vh.d i22 = org.telegram.messenger.z20.i(24, context, p6Var, true);
                        i22.setText(org.telegram.messenger.cd.L0(z10 ? 2131743038 : 2131743194, null));
                        i22.setEnabled(false);
                        linearLayout4.addView(i22, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
                        f11.addView(linearLayout4);
                        y2Var.K0(f11);
                        final int i23 = 1;
                        final int i24 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.a2 a2Var3 = a2Var;
                        final org.telegram.ui.Wallet.e2 e2Var3 = e2Var;
                        final org.telegram.ui.Wallet.g1 g1Var2 = new org.telegram.ui.Wallet.g1(a2Var3, zArr2, i22, dVar, e2Var3, y2Var, zArr, p6Var);
                        i22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i24) {
                                    case 0:
                                        g1Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        g1Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i23) {
                                    case 0:
                                        g1Var2.a(Boolean.FALSE);
                                        break;
                                    default:
                                        g1Var2.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.y1 y1Var = new org.telegram.ui.Wallet.y1(zArr, a2Var3, y2Var, i23);
                        long j11 = i18;
                        long j12 = d2Var.a;
                        if (j12 == 0) {
                            j12 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i15).getCurrentTime()) * 1000;
                        a2Var3.r = new org.telegram.ui.Wallet.l(y2Var, 5);
                        final int i25 = 0;
                        y2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.i1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i25) {
                                    case 0:
                                        y1 y1Var2 = (y1) y1Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.i0.r(y1Var2);
                                        e2Var3.u(a2Var3);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        y1 y1Var3 = (y1) y1Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.i0.r(y1Var3);
                                        e2Var3.u(a2Var3);
                                        Runnable runnable3 = runnable;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        y2Var.show();
                        org.telegram.messenger.i0.h3(y1Var, max);
                        bi.d dVar2 = new bi.d(zArr, a2Var3, zArr2, i22, z10, x10, v10, y2Var, p6Var);
                        WalletEngine2 walletEngine2 = e2Var3.b.b;
                        if (!a2Var3.n && !e2Var3.j(a2Var3) && e2Var3.A(a2Var3) && walletEngine2 != null) {
                            if (str.equals(str7)) {
                                walletEngine2.previewSignMessage(d2Var, new org.telegram.ui.Wallet.m(e2Var3, a2Var3, dVar2, 1));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.j(e2Var3, a2Var3, dVar2, 9));
                                break;
                            }
                        } else {
                            dVar2.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.e2 e2Var4 = org.telegram.ui.Wallet.k0.x(i15).g;
                        try {
                            JSONObject jSONObject = new JSONObject(a2Var2.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.y2 y2Var2 = new org.telegram.ui.Wallet.y2(context, p6Var, new View[0]);
                            y2Var2.J0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, p6Var));
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setOrientation(1);
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setGravity(16);
                            ImageView e = org.telegram.messenger.z20.e(context, R.drawable.ic_ab_close);
                            e.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.a7.t(e, org.telegram.ui.ActionBar.t6.G6, p6Var, PorterDuff.Mode.SRC_IN);
                            int i26 = org.telegram.ui.ActionBar.t6.i6;
                            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i26, p6Var), 1, -1);
                            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i26);
                            e.setBackground(h03);
                            org.telegram.ui.ActionBar.a7.k(e, h03, null, N2, p6Var);
                            e.setContentDescription(org.telegram.messenger.cd.L0(2131752041, null));
                            e.setOnClickListener(new rv0(10, a2Var2, y2Var2));
                            linearLayout6.addView(e, w7.b6.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.g9 g9Var3 = new org.telegram.ui.Components.g9(context);
                            g9Var3.setRoundRadius(org.telegram.messenger.i0.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                g9Var3.p(org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout6.addView(g9Var3, w7.b6.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            TextView v11 = org.telegram.ui.Wallet.e2.v(18, context, org.telegram.messenger.cd.L0(2131743037, null), p6Var);
                            v11.setTypeface(org.telegram.messenger.i0.o());
                            v11.setGravity(3);
                            linearLayout7.addView(v11, w7.b6.o(-1, -2));
                            TextView v12 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.i0.K0(tonconnectsession2.manifest.url, false), p6Var);
                            int i27 = org.telegram.ui.ActionBar.t6.z6;
                            org.telegram.ui.ActionBar.a7.V(v12, i27, p6Var);
                            v12.setGravity(3);
                            v12.setSingleLine(true);
                            v12.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout7.addView(v12, w7.b6.o(-1, -2));
                            linearLayout6.addView(linearLayout7, w7.b6.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout5.addView(linearLayout6, w7.b6.o(-1, 56));
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setOrientation(1);
                            linearLayout8.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f));
                            int L = org.telegram.messenger.i0.L(16.0f);
                            int i28 = org.telegram.ui.ActionBar.t6.d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i28, p6Var));
                            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i28);
                            linearLayout8.setBackground(d02);
                            org.telegram.ui.ActionBar.a7.k(linearLayout8, d02, N3, null, p6Var);
                            TextView v13 = org.telegram.ui.Wallet.e2.v(equals2 ? 14 : 16, context, equals2 ? jSONObject.optString("text") : org.telegram.messenger.cd.L0(2131743209, null), p6Var);
                            v13.setGravity(3);
                            v13.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v14 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.cd.L0(2131743036, null), p6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.i0.o());
                                org.telegram.ui.ActionBar.a7.V(v14, org.telegram.ui.ActionBar.t6.L6, p6Var);
                                linearLayout8.addView(v14, w7.b6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v13.setTypeface(Typeface.MONOSPACE);
                                i12 = -1;
                                i13 = -2;
                            } else {
                                LinearLayout linearLayout9 = new LinearLayout(context);
                                linearLayout9.setGravity(16);
                                TextView v15 = org.telegram.ui.Wallet.e2.v(12, context, "!", p6Var);
                                v15.setTypeface(org.telegram.messenger.i0.o());
                                v15.setTextColor(-1);
                                int L2 = org.telegram.messenger.i0.L(8.0f);
                                int i29 = org.telegram.ui.ActionBar.t6.q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i29, p6Var));
                                org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i29);
                                v15.setBackground(d03);
                                org.telegram.ui.ActionBar.a7.k(v15, d03, N4, null, p6Var);
                                linearLayout9.addView(v15, w7.b6.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v16 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.cd.L0(2131743210, null), p6Var);
                                v16.setGravity(3);
                                v16.setTypeface(org.telegram.messenger.i0.o());
                                i12 = -1;
                                i13 = -2;
                                linearLayout9.addView(v16, w7.b6.o(-1, -2));
                                linearLayout8.addView(linearLayout9, w7.b6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout8.addView(v13, w7.b6.o(i12, i13));
                            if (equals2) {
                                v13.setOnClickListener(new org.telegram.ui.Wallet.j1(jSONObject, y2Var2, p6Var, 0));
                            }
                            org.telegram.ui.Components.w60 w60Var2 = new org.telegram.ui.Components.w60(context, 3);
                            w60Var2.addView(linearLayout8);
                            linearLayout5.addView(w60Var2, w7.b6.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.x2 x2Var3 = new org.telegram.ui.Wallet.x2(context);
                            x2Var3.getContent().addView(linearLayout5, w7.b6.c(-2.0f, -1));
                            y2Var2.I0(x2Var3);
                            LinearLayout f12 = org.telegram.messenger.m5.f(context, 1);
                            if (equals2) {
                                TextView v17 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.cd.L0(2131743055, null), p6Var);
                                v17.setGravity(3);
                                org.telegram.ui.ActionBar.a7.V(v17, i27, p6Var);
                                f12.addView(v17, w7.b6.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                            vh.d dVar3 = new vh.d(context, p6Var, true);
                            dVar3.setRoundRadius(24);
                            dVar3.e();
                            dVar3.setText(org.telegram.messenger.cd.L0(2131752589, null));
                            vh.d i30 = org.telegram.messenger.z20.i(24, context, p6Var, true);
                            i30.setText(org.telegram.messenger.cd.L0(2131743038, null));
                            i30.setEnabled(false);
                            linearLayout10.addView(dVar3, w7.b6.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout10.addView(i30, w7.b6.m(1.0f, 0, 44, 6, 0, 0));
                            f12.addView(linearLayout10);
                            y2Var2.K0(f12);
                            y2Var2.y0 = new i0(a2Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(w60Var2, a2Var2, i30, 3);
                            final int i31 = 0;
                            w60Var2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.k1(gVar, 0));
                            w60Var2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.l1(gVar, 0));
                            final org.telegram.ui.Wallet.m1 m1Var = new org.telegram.ui.Wallet.m1(i30, dVar3, e2Var4, a2Var2, y2Var2, p6Var, gVar);
                            i30.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i31) {
                                        case 0:
                                            m1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            m1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i32 = 1;
                            dVar3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            m1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            m1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final org.telegram.ui.Wallet.y1 y1Var2 = new org.telegram.ui.Wallet.y1(zArr3, a2Var2, y2Var2, i31);
                            a2Var2.r = new org.telegram.ui.Wallet.l(y2Var2, 5);
                            final int i33 = 1;
                            y2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.i1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i33) {
                                        case 0:
                                            y1 y1Var22 = (y1) y1Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.i0.r(y1Var22);
                                            e2Var4.u(a2Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            y1 y1Var3 = (y1) y1Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.i0.r(y1Var3);
                                            e2Var4.u(a2Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            y2Var2.show();
                            org.telegram.messenger.i0.h3(y1Var2, Math.max(0L, i18 - e2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e7) {
                            e2Var4.u(a2Var2);
                            org.telegram.ui.Components.cc.b0(org.telegram.ui.Wallet.e2.i("display signing data", e7));
                            return;
                        }
                    }
                } else if (str6 != null) {
                    org.telegram.ui.Components.cc.b0(str6);
                    break;
                }
                break;
            default:
                vh.d dVar4 = (vh.d) obj6;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj5;
                View view = (View) obj4;
                bh.d dVar5 = (bh.d) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i15).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                        StringBuilder m10 = i0.a.m("wear-auth: sending /token account=", i15, " dcId=", currentDatacenterId, " isTest=");
                        m10.append(isTestBackend);
                        org.telegram.messenger.f8.b(m10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = se1.c(dVar5, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str8 = (String) dVar5.c;
                            com.google.android.gms.common.api.internal.u0 u0Var = v0Var.h;
                            b8.e eVar2 = new b8.e(u0Var, str8, "/tg-wear-auth/token", c10);
                            u0Var.b.d(0, eVar2);
                            n6.l.m(eVar2, y8.h0.a).addOnSuccessListener(new ep0(27, dVar5, dVar4)).addOnFailureListener(new qe1(dVar4, 1));
                            z2Var.dismiss();
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                            new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0(e10.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.s(z2Var.E, z2Var.I0, tL_error3, false);
                    break;
                } else {
                    new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ j70(LaunchActivity launchActivity, gf.e eVar, org.telegram.messenger.vp vpVar, int i10, TLRPC.User user) {
        this.c = launchActivity;
        this.d = eVar;
        this.e = vpVar;
        this.b = i10;
        this.f = user;
    }

    public /* synthetic */ j70(ua0 ua0Var, String str, String str2, String str3, int i10) {
        this.c = ua0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    public /* synthetic */ j70(vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, int i10, View view, bh.d dVar2) {
        this.c = dVar;
        this.d = z2Var;
        this.b = i10;
        this.e = view;
        this.f = dVar2;
    }
}
