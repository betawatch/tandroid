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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l60(Context context, int i7, org.telegram.ui.Wallet.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        this.c = context;
        this.b = i7;
        this.d = m0Var;
        this.e = f6Var;
        this.f = runnable;
    }

    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v45 */
    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.f2 T;
        org.telegram.ui.Wallet.a2 a2Var;
        org.telegram.ui.Wallet.e2 e2Var;
        boolean z9;
        int i7;
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
        int i16 = 1;
        switch (i14) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                vf.b bVar = (vf.b) obj5;
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str2 = LaunchActivity.B1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    qpVar.X3(user2, false, false);
                    qpVar.W2(user2, 0, true, null);
                }
                launchActivity.m0(i15, user.id, tL_error);
                break;
            case 1:
                p90 p90Var = (p90) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = p90Var.a;
                p90Var.h = -1;
                if (!p90Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 == null) {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str3.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i17);
                                    i17++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str4.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(p90Var.b).getCurrentTime()) {
                                        if (p90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            p90Var.c();
                                            org.telegram.ui.Wallet.e2.q(p90Var.a, p90Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new l90(p90Var, str5, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i18 = this.b;
                        if (i18 < 10) {
                            bi.ub ubVar = new bi.ub((Object) p90Var, str3, str4, str5, i18, 21);
                            p90Var.i = ubVar;
                            org.telegram.messenger.g0.i3(ubVar, 500L);
                            break;
                        } else {
                            p90Var.c();
                            if (p90Var.a()) {
                                org.telegram.ui.Components.hc.b0(org.telegram.messenger.id.M0(2131742996, null));
                                break;
                            }
                        }
                    } else {
                        p90Var.c();
                        if (p90Var.a()) {
                            p90.d().f0(tL_error2, false);
                        }
                    }
                    break;
                } else {
                    p90Var.c();
                    break;
                }
                break;
            case 2:
                Context context = (Context) obj6;
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                final Runnable runnable = (Runnable) obj3;
                final org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj;
                String str6 = (String) obj2;
                if (a2Var2 != null) {
                    int i19 = a2Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = a2Var2.a;
                    String str7 = a2Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.F1 || org.telegram.messenger.iz.x || org.telegram.messenger.iz.C || org.telegram.messenger.p10.s0 != i15) {
                            m0Var.g.u(a2Var2);
                            break;
                        }
                    }
                    if (!"signData".equals(str7)) {
                        org.telegram.ui.Wallet.m0 x10 = org.telegram.ui.Wallet.m0.x(i15);
                        org.telegram.ui.Wallet.e2 e2Var2 = x10.g;
                        org.telegram.ui.Wallet.d2 d2Var = a2Var2.f;
                        boolean equals = "signMessage".equals(str7);
                        final org.telegram.ui.Wallet.y2 y2Var = new org.telegram.ui.Wallet.y2(context, f6Var, new View[0]);
                        y2Var.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, f6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                        l9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            a2Var = a2Var2;
                            e2Var = e2Var2;
                            z9 = equals;
                            l9Var.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            a2Var = a2Var2;
                            e2Var = e2Var2;
                            z9 = equals;
                        }
                        linearLayout.addView(l9Var, c8.ha.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = org.telegram.ui.Wallet.e2.v(20, context, org.telegram.messenger.id.V(null, null, z9 ? 2131743199 : 2131743198, tonconnectsession2.manifest.name), f6Var);
                        v.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout.addView(v, c8.ha.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(K0)) {
                            linearLayout.addView(org.telegram.ui.Wallet.e2.h(context, K0, f6Var), c8.ha.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.g6 g6Var = new org.telegram.ui.Wallet.g6(context, R.drawable.wallet_card_info, 24);
                        g6Var.getCardHolderView().setMaxLines(2);
                        g6Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.c2> list = d2Var.b;
                        long j3 = d2Var.c;
                        g6Var.setCardHolder(org.telegram.ui.Wallet.e8.c0(((org.telegram.ui.Wallet.c2) list.get(0)).a));
                        g6Var.getBalanceView().setText(org.telegram.ui.Wallet.e2.k(j3));
                        g6Var.getUsdBalanceView().setText(x10.m(j3, false));
                        linearLayout.addView(g6Var, c8.ha.o(-1, -2));
                        final int i20 = 0;
                        g6Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i20) {
                                    case 0:
                                        y2 y2Var2 = y2Var;
                                        fi.g1 g1Var = y2Var2.i1;
                                        if (1 < y2Var2.j1.size() && 1 != g1Var.getCurrentPosition()) {
                                            for (View view2 : g1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            g1Var.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        y2 y2Var3 = y2Var;
                                        fi.g1 g1Var2 = y2Var3.i1;
                                        if (y2Var3.j1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : g1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            g1Var2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Wallet.x2 x2Var = new org.telegram.ui.Wallet.x2(context);
                        x2Var.getContent().addView(linearLayout, c8.ha.c(-2.0f, -1));
                        y2Var.I0(x2Var);
                        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
                        f10.addView(f11, c8.ha.o(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i21 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i21, f6Var), 1, -1);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i21);
                        imageView.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, f6Var);
                        int i22 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.t(imageView, i22, f6Var, PorterDuff.Mode.SRC_IN);
                        c8.ka.a(imageView);
                        f11.addView(imageView, c8.ha.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
                        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            i7 = i19;
                            l9Var2.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            i7 = i19;
                        }
                        f11.addView(l9Var2, c8.ha.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        f11.addView(linearLayout2, c8.ha.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.r6.V(textView, i22, f6Var);
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, c8.ha.o(-1, -2));
                        textView.setText(org.telegram.messenger.id.M0(2131743170, null));
                        if (TextUtils.isEmpty(K0)) {
                            i10 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, f6Var);
                            i10 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                            textView2.setText(K0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        y2 y2Var2 = y2Var;
                                        fi.g1 g1Var = y2Var2.i1;
                                        if (1 < y2Var2.j1.size() && 1 != g1Var.getCurrentPosition()) {
                                            for (View view2 : g1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            g1Var.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        y2 y2Var3 = y2Var;
                                        fi.g1 g1Var2 = y2Var3.i1;
                                        if (y2Var3.j1.size() > 0 && g1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : g1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            g1Var2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(i10);
                        LinearLayout F = org.telegram.ui.Wallet.e2.F(context, org.telegram.messenger.id.M0(2131743054, null), f6Var);
                        String C = org.telegram.ui.Wallet.e2.C(((org.telegram.ui.Wallet.c2) list.get(0)).a);
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.m0.s(j3, i10);
                        if (list.size() > i10) {
                            Integer valueOf = Integer.valueOf(list.size() - i10);
                            Object[] objArr = new Object[2];
                            objArr[0] = C;
                            objArr[i10] = valueOf;
                            V = org.telegram.messenger.id.V(null, null, 2131742978, objArr);
                        } else {
                            Object[] objArr2 = new Object[i10];
                            objArr2[0] = C;
                            V = org.telegram.messenger.id.V(null, null, 2131742979, objArr2);
                        }
                        F.addView(org.telegram.ui.Wallet.e2.c(context, s5, V, null, null, f6Var), c8.ha.o(-1, -2));
                        linearLayout3.addView(F, c8.ha.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = org.telegram.ui.Wallet.e2.F(context, org.telegram.messenger.id.M0(2131743210, null), f6Var);
                        for (org.telegram.ui.Wallet.c2 c2Var : list) {
                            if (c2Var.b == null || c2Var.d != null) {
                                str = null;
                                i11 = 2131742984;
                            } else {
                                i11 = 2131743156;
                                str = null;
                            }
                            F2.addView(org.telegram.ui.Wallet.e2.c(context, org.telegram.messenger.id.M0(i11, str), org.telegram.messenger.id.V(str, str, 2131742979, org.telegram.ui.Wallet.e2.C(c2Var.a)), org.telegram.ui.Wallet.e2.b(-c2Var.e), c2Var.d, f6Var), c8.ha.o(-1, -2));
                        }
                        linearLayout3.addView(F2, c8.ha.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        org.telegram.ui.Components.h60 h60Var = new org.telegram.ui.Components.h60(context, 4);
                        h60Var.setFillViewport(false);
                        h60Var.addView(linearLayout3);
                        f10.addView(h60Var, c8.ha.o(-1, -2));
                        org.telegram.ui.Wallet.x2 x2Var2 = new org.telegram.ui.Wallet.x2(context);
                        x2Var2.getContent().addView(f10, c8.ha.c(-2.0f, -1));
                        y2Var.I0(x2Var2);
                        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
                        TextView v10 = org.telegram.ui.Wallet.e2.v(14, context, null, f6Var);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.b80(org.telegram.messenger.g0.L(80.0f), v10), 0, spannableStringBuilder.length(), 33);
                        v10.setText(org.telegram.messenger.id.V(null, null, 2131743123, spannableStringBuilder));
                        v10.setVisibility(z9 ? 8 : 0);
                        org.telegram.ui.ActionBar.r6.V(v10, org.telegram.ui.ActionBar.k6.z6, f6Var);
                        f12.addView(v10, c8.ha.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                        fi.d dVar = new fi.d(context, f6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(org.telegram.messenger.id.M0(2131743146, null));
                        linearLayout4.addView(dVar, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
                        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
                        h.setText(org.telegram.messenger.id.M0(z9 ? 2131743015 : 2131743171, null));
                        h.setEnabled(false);
                        linearLayout4.addView(h, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
                        f12.addView(linearLayout4);
                        y2Var.K0(f12);
                        final int i23 = 1;
                        final int i24 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.a2 a2Var3 = a2Var;
                        final org.telegram.ui.Wallet.e2 e2Var3 = e2Var;
                        final org.telegram.ui.Wallet.g1 g1Var = new org.telegram.ui.Wallet.g1(a2Var3, zArr2, h, dVar, e2Var3, y2Var, zArr, f6Var);
                        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i24) {
                                    case 0:
                                        g1Var.a(Boolean.FALSE);
                                        break;
                                    default:
                                        g1Var.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i23) {
                                    case 0:
                                        g1Var.a(Boolean.FALSE);
                                        break;
                                    default:
                                        g1Var.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.y1 y1Var = new org.telegram.ui.Wallet.y1(zArr, a2Var3, y2Var, i23);
                        long j10 = i7;
                        long j11 = d2Var.a;
                        if (j11 == 0) {
                            j11 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i15).getCurrentTime()) * 1000;
                        a2Var3.r = new org.telegram.ui.Wallet.l(y2Var, 5);
                        final int i25 = 0;
                        y2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.i1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i25) {
                                    case 0:
                                        y1 y1Var2 = (y1) y1Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(y1Var2);
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
                                        org.telegram.messenger.g0.r(y1Var3);
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
                        org.telegram.messenger.g0.i3(y1Var, max);
                        li.c cVar = new li.c(zArr, a2Var3, zArr2, h, z9, x10, v10, y2Var, f6Var);
                        WalletEngine2 walletEngine2 = e2Var3.b.b;
                        if (!a2Var3.n && !e2Var3.j(a2Var3) && e2Var3.A(a2Var3) && walletEngine2 != null) {
                            if ("signMessage".equals(str7)) {
                                walletEngine2.previewSignMessage(d2Var, new org.telegram.ui.Wallet.m(e2Var3, a2Var3, cVar, 1));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.j(e2Var3, a2Var3, cVar, 9));
                                break;
                            }
                        } else {
                            cVar.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.e2 e2Var4 = org.telegram.ui.Wallet.m0.x(i15).g;
                        try {
                            JSONObject jSONObject = new JSONObject(a2Var2.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.y2 y2Var2 = new org.telegram.ui.Wallet.y2(context, f6Var, new View[0]);
                            y2Var2.J0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, f6Var));
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setOrientation(1);
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setGravity(16);
                            ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.ic_ab_close);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.G6, f6Var, PorterDuff.Mode.SRC_IN);
                            int i26 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i26, f6Var), 1, -1);
                            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i26);
                            e10.setBackground(h03);
                            org.telegram.ui.ActionBar.r6.k(e10, h03, null, N2, f6Var);
                            e10.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
                            e10.setOnClickListener(new fk0(16, a2Var2, y2Var2));
                            linearLayout6.addView(e10, c8.ha.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.l9 l9Var3 = new org.telegram.ui.Components.l9(context);
                            l9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                l9Var3.p(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout6.addView(l9Var3, c8.ha.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            TextView v11 = org.telegram.ui.Wallet.e2.v(18, context, org.telegram.messenger.id.M0(2131743014, null), f6Var);
                            v11.setTypeface(org.telegram.messenger.g0.o());
                            v11.setGravity(3);
                            linearLayout7.addView(v11, c8.ha.o(-1, -2));
                            TextView v12 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), f6Var);
                            int i27 = org.telegram.ui.ActionBar.k6.z6;
                            org.telegram.ui.ActionBar.r6.V(v12, i27, f6Var);
                            v12.setGravity(3);
                            v12.setSingleLine(true);
                            v12.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout7.addView(v12, c8.ha.o(-1, -2));
                            linearLayout6.addView(linearLayout7, c8.ha.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout5.addView(linearLayout6, c8.ha.o(-1, 56));
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setOrientation(1);
                            linearLayout8.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i28 = org.telegram.ui.ActionBar.k6.d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i28, f6Var));
                            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i28);
                            linearLayout8.setBackground(d02);
                            org.telegram.ui.ActionBar.r6.k(linearLayout8, d02, N3, null, f6Var);
                            TextView v13 = org.telegram.ui.Wallet.e2.v(equals2 ? 14 : 16, context, equals2 ? jSONObject.optString("text") : org.telegram.messenger.id.M0(2131743186, null), f6Var);
                            v13.setGravity(3);
                            v13.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v14 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.id.M0(2131743013, null), f6Var);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.r6.V(v14, org.telegram.ui.ActionBar.k6.L6, f6Var);
                                linearLayout8.addView(v14, c8.ha.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v13.setTypeface(Typeface.MONOSPACE);
                                i12 = -1;
                                i13 = -2;
                            } else {
                                LinearLayout linearLayout9 = new LinearLayout(context);
                                linearLayout9.setGravity(16);
                                TextView v15 = org.telegram.ui.Wallet.e2.v(12, context, "!", f6Var);
                                v15.setTypeface(org.telegram.messenger.g0.o());
                                v15.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i29 = org.telegram.ui.ActionBar.k6.q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i29, f6Var));
                                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i29);
                                v15.setBackground(d03);
                                org.telegram.ui.ActionBar.r6.k(v15, d03, N4, null, f6Var);
                                linearLayout9.addView(v15, c8.ha.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v16 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.id.M0(2131743187, null), f6Var);
                                v16.setGravity(3);
                                v16.setTypeface(org.telegram.messenger.g0.o());
                                i12 = -1;
                                i13 = -2;
                                linearLayout9.addView(v16, c8.ha.o(-1, -2));
                                linearLayout8.addView(linearLayout9, c8.ha.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout8.addView(v13, c8.ha.o(i12, i13));
                            if (equals2) {
                                v13.setOnClickListener(new org.telegram.ui.Wallet.j1(jSONObject, y2Var2, f6Var, 0));
                            }
                            org.telegram.ui.Components.h60 h60Var2 = new org.telegram.ui.Components.h60(context, 3);
                            h60Var2.addView(linearLayout8);
                            linearLayout5.addView(h60Var2, c8.ha.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.x2 x2Var3 = new org.telegram.ui.Wallet.x2(context);
                            x2Var3.getContent().addView(linearLayout5, c8.ha.c(-2.0f, -1));
                            y2Var2.I0(x2Var3);
                            LinearLayout f13 = org.telegram.messenger.k5.f(context, 1);
                            if (equals2) {
                                TextView v17 = org.telegram.ui.Wallet.e2.v(14, context, org.telegram.messenger.id.M0(2131743032, null), f6Var);
                                v17.setGravity(3);
                                org.telegram.ui.ActionBar.r6.V(v17, i27, f6Var);
                                f13.addView(v17, c8.ha.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            fi.d dVar2 = new fi.d(context, f6Var, true);
                            dVar2.setRoundRadius(24);
                            dVar2.e();
                            dVar2.setText(org.telegram.messenger.id.M0(2131752589, null));
                            fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var, true);
                            h7.setText(org.telegram.messenger.id.M0(2131743015, null));
                            h7.setEnabled(false);
                            linearLayout10.addView(dVar2, c8.ha.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout10.addView(h7, c8.ha.m(1.0f, 0, 44, 6, 0, 0));
                            f13.addView(linearLayout10);
                            y2Var2.K0(f13);
                            y2Var2.y0 = new h0(a2Var2, 2);
                            org.telegram.ui.Wallet.g gVar = new org.telegram.ui.Wallet.g(h60Var2, a2Var2, h7, 3);
                            final int i30 = 0;
                            h60Var2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.k1(gVar, i30));
                            h60Var2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.l1(gVar, i30));
                            final org.telegram.ui.Wallet.m1 m1Var = new org.telegram.ui.Wallet.m1(h7, dVar2, e2Var4, a2Var2, y2Var2, f6Var, gVar);
                            h7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i30) {
                                        case 0:
                                            m1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            m1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i31 = 1;
                            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n1
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
                            final boolean[] zArr3 = {false};
                            final org.telegram.ui.Wallet.y1 y1Var2 = new org.telegram.ui.Wallet.y1(zArr3, a2Var2, y2Var2, i30);
                            a2Var2.r = new org.telegram.ui.Wallet.l(y2Var2, 5);
                            final int i32 = 1;
                            y2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.i1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i32) {
                                        case 0:
                                            y1 y1Var22 = (y1) y1Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(y1Var22);
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
                                            org.telegram.messenger.g0.r(y1Var3);
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
                            org.telegram.messenger.g0.i3(y1Var2, Math.max(0L, i19 - e2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e11) {
                            e2Var4.u(a2Var2);
                            org.telegram.ui.Components.hc.b0(org.telegram.ui.Wallet.e2.i("display signing data", e11));
                            return;
                        }
                    }
                } else if (str6 != null) {
                    org.telegram.ui.Components.hc.b0(str6);
                    break;
                }
                break;
            default:
                fi.d dVar3 = (fi.d) obj6;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i15).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                        StringBuilder o4 = jg.g.o("wear-auth: sending /token account=", i15, " dcId=", currentDatacenterId, " isTest=");
                        o4.append(isTestBackend);
                        org.telegram.messenger.a8.b(o4.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = vc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                            b9.j0 j0Var = new b9.j0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str8 = (String) r7Var.d;
                            com.google.android.gms.common.api.internal.n0 n0Var = j0Var.i;
                            b9.g0 g0Var = new b9.g0(n0Var, str8, "/tg-wear-auth/token", c10);
                            n0Var.b.d(0, g0Var);
                            q6.m.m(g0Var, b9.i0.a).addOnSuccessListener(new lk0(28, r7Var, dVar3)).addOnFailureListener(new tc1(dVar3, i16));
                            v2Var.dismiss();
                            break;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0(e12.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.r(v2Var.E, v2Var.I0, tL_error3, false);
                    break;
                } else {
                    new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ l60(fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, int i7, View view, a8.r7 r7Var) {
        this.c = dVar;
        this.d = v2Var;
        this.b = i7;
        this.e = view;
        this.f = r7Var;
    }

    public /* synthetic */ l60(LaunchActivity launchActivity, vf.b bVar, org.telegram.messenger.qp qpVar, int i7, TLRPC.User user) {
        this.c = launchActivity;
        this.d = bVar;
        this.e = qpVar;
        this.b = i7;
        this.f = user;
    }

    public /* synthetic */ l60(p90 p90Var, String str, String str2, String str3, int i7) {
        this.c = p90Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i7;
    }
}
