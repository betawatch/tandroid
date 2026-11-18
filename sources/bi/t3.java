package bi;

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
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bd0;
import org.telegram.ui.k90;
import org.telegram.ui.r90;
import org.telegram.ui.vc1;
import org.telegram.ui.wc1;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t3(int i7, Runnable runnable, Context context, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar) {
        this.b = i7;
        this.c = runnable;
        this.d = context;
        this.e = i6Var;
        this.f = lcVar;
    }

    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v45 */
    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.h2 T;
        org.telegram.ui.Wallet.l2 l2Var;
        boolean z10;
        String str;
        String str2;
        final int i7;
        CharSequence V;
        String str3;
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
                Runnable runnable = (Runnable) obj6;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                lc lcVar = (lc) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i17 = this.b;
                if (updates != null) {
                    mp.u1(i17).V3(updates, false);
                    if (runnable != null) {
                        runnable.run();
                    }
                    gc Q = f4.g().Q(R.raw.contact_check, 36, gd.M0(2131749602, null));
                    Q.t = true;
                    Q.j();
                    break;
                } else {
                    v4.r(context, i17, i6Var, lcVar, tL_error, null);
                    break;
                }
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                vf.b bVar = (vf.b) obj5;
                mp mpVar = (mp) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str4 = LaunchActivity.C1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (user2 != null) {
                    mpVar.e4(user2, false, false);
                    mpVar.c3(user2, 0, true, null);
                }
                launchActivity.m0(i14, user.id, tL_error2);
                break;
            case 2:
                r90 r90Var = (r90) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = r90Var.a;
                r90Var.h = -1;
                if (!r90Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error3 == null) {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str5.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i18);
                                    i18++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str6.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(r90Var.b).getCurrentTime()) {
                                        if (r90Var.a() && (T = LaunchActivity.T()) != null && T.getContext() != null) {
                                            r90Var.c();
                                            org.telegram.ui.Wallet.l2.q(r90Var.a, r90Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, T.getResourceProvider(), new k90(r90Var, str7, 3));
                                        }
                                    }
                                }
                            }
                        }
                        int i19 = this.b;
                        if (i19 < 10) {
                            ai.g1 g1Var = new ai.g1(r90Var, str5, str6, str7, i19, 23);
                            r90Var.i = g1Var;
                            org.telegram.messenger.g0.h3(g1Var, 500L);
                            break;
                        } else {
                            r90Var.c();
                            if (r90Var.a()) {
                                lc.c0(gd.M0(2131742735, null));
                                break;
                            }
                        }
                    } else {
                        r90Var.c();
                        if (r90Var.a()) {
                            r90.d().g0(tL_error3, false);
                        }
                    }
                    break;
                } else {
                    r90Var.c();
                    break;
                }
                break;
            case 3:
                Context context2 = (Context) obj5;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj3;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj4;
                final Runnable runnable2 = (Runnable) obj6;
                final org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj;
                String str8 = (String) obj2;
                if (h2Var != null) {
                    int i20 = h2Var.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = h2Var.a;
                    String str9 = h2Var.e;
                    if (context2 instanceof Activity) {
                        Activity activity = (Activity) context2;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || bz.x || bz.C || j10.t0 != i14) {
                            u0Var.g.u(h2Var);
                            break;
                        }
                    }
                    if (!"signData".equals(str9)) {
                        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i14);
                        org.telegram.ui.Wallet.l2 l2Var2 = D.g;
                        org.telegram.ui.Wallet.k2 k2Var = h2Var.f;
                        boolean equals = "signMessage".equals(str9);
                        final org.telegram.ui.Wallet.d3 d3Var = new org.telegram.ui.Wallet.d3(context2, i6Var2, new View[0]);
                        d3Var.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var2));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(1);
                        q9 q9Var = new q9(context2);
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            l2Var = l2Var2;
                            z10 = equals;
                            str = str9;
                            q9Var.p(fc.p(h20.c(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            l2Var = l2Var2;
                            z10 = equals;
                            str = str9;
                        }
                        linearLayout.addView(q9Var, ma.t(76, 76, 1, 0, 24, 0, 0));
                        TextView v = org.telegram.ui.Wallet.l2.v(20, context2, gd.V(null, null, z10 ? 2131742958 : 2131742957, tonconnectsession2.manifest.name), i6Var2);
                        v.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout.addView(v, ma.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String K0 = org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false);
                        if (!TextUtils.isEmpty(K0)) {
                            linearLayout.addView(org.telegram.ui.Wallet.l2.h(context2, K0, i6Var2), ma.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.x6 x6Var = new org.telegram.ui.Wallet.x6(context2, R.drawable.wallet_card_info, 24);
                        x6Var.getCardHolderView().setMaxLines(2);
                        x6Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.j2> list = k2Var.b;
                        long j3 = k2Var.c;
                        x6Var.setCardHolder(org.telegram.ui.Wallet.u8.c0(((org.telegram.ui.Wallet.j2) list.get(0)).a));
                        x6Var.getBalanceView().setText(org.telegram.ui.Wallet.l2.k(j3));
                        x6Var.getUsdBalanceView().setText(D.r(j3, false));
                        linearLayout.addView(x6Var, ma.o(-1, -2));
                        final int i21 = 0;
                        x6Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i21) {
                                    case 0:
                                        d3 d3Var2 = d3Var;
                                        hi.i1 i1Var = d3Var2.m1;
                                        if (1 < d3Var2.n1.size() && 1 != i1Var.getCurrentPosition()) {
                                            for (View view2 : i1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            i1Var.A(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        d3 d3Var3 = d3Var;
                                        hi.i1 i1Var2 = d3Var3.m1;
                                        if (d3Var3.n1.size() > 0 && i1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : i1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            i1Var2.A(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Wallet.c3 c3Var = new org.telegram.ui.Wallet.c3(context2);
                        c3Var.getContent().addView(linearLayout, ma.c(-2.0f, -1));
                        d3Var.J0(c3Var);
                        LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                        LinearLayout g11 = org.telegram.messenger.f3.g(context2, 0);
                        g10.addView(g11, ma.o(-1, 56));
                        ImageView imageView = new ImageView(context2);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i22 = org.telegram.ui.ActionBar.n6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i22, i6Var2), 1, -1);
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i22);
                        imageView.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var2);
                        int i23 = org.telegram.ui.ActionBar.n6.G6;
                        org.telegram.ui.ActionBar.u6.s(imageView, i23, i6Var2, PorterDuff.Mode.SRC_IN);
                        ra.a(imageView);
                        g11.addView(imageView, ma.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        q9 q9Var2 = new q9(context2);
                        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            str2 = "signMessage";
                            q9Var2.p(fc.p(h20.c(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            str2 = "signMessage";
                        }
                        g11.addView(q9Var2, ma.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setOrientation(1);
                        g11.addView(linearLayout2, ma.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context2);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        org.telegram.ui.ActionBar.u6.U(textView, i23, i6Var2);
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, ma.o(-1, -2));
                        textView.setText(gd.M0(2131742929, null));
                        if (TextUtils.isEmpty(K0)) {
                            i7 = 1;
                        } else {
                            TextView textView2 = new TextView(context2);
                            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, i6Var2);
                            i7 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout2.addView(textView2, ma.o(-1, -2));
                            textView2.setText(K0);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.n1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        d3 d3Var2 = d3Var;
                                        hi.i1 i1Var = d3Var2.m1;
                                        if (1 < d3Var2.n1.size() && 1 != i1Var.getCurrentPosition()) {
                                            for (View view2 : i1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    org.telegram.messenger.g0.v1(view2);
                                                }
                                            }
                                            i1Var.A(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        d3 d3Var3 = d3Var;
                                        hi.i1 i1Var2 = d3Var3.m1;
                                        if (d3Var3.n1.size() > 0 && i1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : i1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    org.telegram.messenger.g0.v1(view3);
                                                }
                                            }
                                            i1Var2.A(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context2);
                        linearLayout3.setOrientation(i7);
                        LinearLayout F = org.telegram.ui.Wallet.l2.F(context2, gd.M0(2131742793, null), i6Var2);
                        String C = org.telegram.ui.Wallet.l2.C(((org.telegram.ui.Wallet.j2) list.get(0)).a);
                        SpannableStringBuilder x10 = org.telegram.ui.Wallet.u0.x(j3, i7);
                        int i24 = 2131742718;
                        if (list.size() > i7) {
                            Integer valueOf = Integer.valueOf(list.size() - i7);
                            Object[] objArr = new Object[2];
                            objArr[0] = C;
                            objArr[i7] = valueOf;
                            V = gd.V(null, null, 2131742717, objArr);
                        } else {
                            Object[] objArr2 = new Object[i7];
                            objArr2[0] = C;
                            V = gd.V(null, null, 2131742718, objArr2);
                        }
                        String str10 = str;
                        F.addView(org.telegram.ui.Wallet.l2.c(context2, x10, V, null, null, i6Var2), ma.o(-1, -2));
                        linearLayout3.addView(F, ma.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout F2 = org.telegram.ui.Wallet.l2.F(context2, gd.M0(2131742969, null), i6Var2);
                        for (org.telegram.ui.Wallet.j2 j2Var : list) {
                            if (j2Var.b == null || j2Var.d != null) {
                                str3 = null;
                                i10 = 2131742723;
                            } else {
                                i10 = 2131742915;
                                str3 = null;
                            }
                            F2.addView(org.telegram.ui.Wallet.l2.c(context2, gd.M0(i10, str3), gd.V(str3, str3, i24, org.telegram.ui.Wallet.l2.C(j2Var.a)), org.telegram.ui.Wallet.l2.b(-j2Var.e), j2Var.d, i6Var2), ma.o(-1, -2));
                            linearLayout3 = linearLayout3;
                            i24 = 2131742718;
                        }
                        LinearLayout linearLayout4 = linearLayout3;
                        linearLayout4.addView(F2, ma.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        h6 h6Var = new h6(context2, 5);
                        h6Var.setFillViewport(false);
                        h6Var.addView(linearLayout4);
                        g10.addView(h6Var, ma.o(-1, -2));
                        org.telegram.ui.Wallet.c3 c3Var2 = new org.telegram.ui.Wallet.c3(context2);
                        c3Var2.getContent().addView(g10, ma.c(-2.0f, -1));
                        d3Var.J0(c3Var2);
                        LinearLayout g12 = org.telegram.messenger.f3.g(context2, 1);
                        TextView v10 = org.telegram.ui.Wallet.l2.v(14, context2, null, i6Var2);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                        spannableStringBuilder.setSpan(new p80(org.telegram.messenger.g0.L(80.0f), v10), 0, spannableStringBuilder.length(), 33);
                        v10.setText(gd.V(null, null, 2131742881, spannableStringBuilder));
                        v10.setVisibility(z10 ? 8 : 0);
                        org.telegram.ui.ActionBar.u6.U(v10, org.telegram.ui.ActionBar.n6.z6, i6Var2);
                        g12.addView(v10, ma.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout5 = new LinearLayout(context2);
                        linearLayout5.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                        hi.d dVar = new hi.d(context2, i6Var2, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(gd.M0(2131742905, null));
                        linearLayout5.addView(dVar, ma.m(1.0f, 0, 44, 0, 6, 0));
                        hi.d g13 = n10.g(24, context2, i6Var2, true);
                        g13.setText(gd.M0(z10 ? 2131742754 : 2131742930, null));
                        g13.setEnabled(false);
                        linearLayout5.addView(g13, ma.m(1.0f, 0, 44, 6, 0, 0));
                        g12.addView(linearLayout5);
                        d3Var.L0(g12);
                        final int i25 = 1;
                        final int i26 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.l2 l2Var3 = l2Var;
                        final org.telegram.ui.Wallet.o1 o1Var = new org.telegram.ui.Wallet.o1(h2Var, zArr2, g13, dVar, l2Var3, d3Var, zArr, i6Var2);
                        g13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.p1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i26) {
                                    case 0:
                                        o1Var.a(Boolean.FALSE);
                                        break;
                                    default:
                                        o1Var.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.p1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i25) {
                                    case 0:
                                        o1Var.a(Boolean.FALSE);
                                        break;
                                    default:
                                        o1Var.a(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.f2 f2Var = new org.telegram.ui.Wallet.f2(zArr, h2Var, d3Var, i25);
                        long j10 = i20;
                        long j11 = k2Var.a;
                        if (j11 == 0) {
                            j11 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i14).getCurrentTime()) * 1000;
                        h2Var.r = new org.telegram.ui.Wallet.m(d3Var, 4);
                        final int i27 = 0;
                        d3Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.q1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i27) {
                                    case 0:
                                        f2 f2Var2 = (f2) f2Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(f2Var2);
                                        l2Var3.u(h2Var);
                                        Runnable runnable3 = runnable2;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        f2 f2Var3 = (f2) f2Var;
                                        zArr[0] = true;
                                        org.telegram.messenger.g0.r(f2Var3);
                                        l2Var3.u(h2Var);
                                        Runnable runnable4 = runnable2;
                                        if (runnable4 != null) {
                                            runnable4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        d3Var.show();
                        org.telegram.messenger.g0.h3(f2Var, max);
                        oi.c cVar = new oi.c(zArr, h2Var, zArr2, g13, z10, D, v10, d3Var, i6Var2);
                        WalletEngine2 walletEngine2 = l2Var3.b.b;
                        if (!h2Var.n && !l2Var3.j(h2Var) && l2Var3.A(h2Var) && walletEngine2 != null) {
                            if (str2.equals(str10)) {
                                walletEngine2.previewSignMessage(k2Var, new org.telegram.ui.Wallet.o(l2Var3, h2Var, cVar, 2));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(k2Var, new org.telegram.ui.Wallet.j(l2Var3, h2Var, cVar, 9));
                                break;
                            }
                        } else {
                            cVar.a(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.l2 l2Var4 = org.telegram.ui.Wallet.u0.D(i14).g;
                        try {
                            JSONObject jSONObject = new JSONObject(h2Var.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.d3 d3Var2 = new org.telegram.ui.Wallet.d3(context2, i6Var2, new View[0]);
                            d3Var2.K0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var2));
                            LinearLayout linearLayout6 = new LinearLayout(context2);
                            linearLayout6.setOrientation(1);
                            LinearLayout linearLayout7 = new LinearLayout(context2);
                            linearLayout7.setGravity(16);
                            ImageView e10 = n10.e(context2, R.drawable.ic_ab_close);
                            e10.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.G6, i6Var2, PorterDuff.Mode.SRC_IN);
                            int i28 = org.telegram.ui.ActionBar.n6.i6;
                            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i28, i6Var2), 1, -1);
                            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i28);
                            e10.setBackground(h03);
                            org.telegram.ui.ActionBar.u6.j(e10, h03, null, M2, i6Var2);
                            e10.setContentDescription(gd.M0(2131752030, null));
                            e10.setOnClickListener(new bd0(20, h2Var, d3Var2));
                            linearLayout7.addView(e10, ma.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            q9 q9Var3 = new q9(context2);
                            q9Var3.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                q9Var3.p(fc.p(h20.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout7.addView(q9Var3, ma.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout8 = new LinearLayout(context2);
                            linearLayout8.setOrientation(1);
                            TextView v11 = org.telegram.ui.Wallet.l2.v(18, context2, gd.M0(2131742753, null), i6Var2);
                            v11.setTypeface(org.telegram.messenger.g0.o());
                            v11.setGravity(3);
                            linearLayout8.addView(v11, ma.o(-1, -2));
                            TextView v12 = org.telegram.ui.Wallet.l2.v(14, context2, org.telegram.messenger.g0.K0(tonconnectsession2.manifest.url, false), i6Var2);
                            int i29 = org.telegram.ui.ActionBar.n6.z6;
                            org.telegram.ui.ActionBar.u6.U(v12, i29, i6Var2);
                            v12.setGravity(3);
                            v12.setSingleLine(true);
                            v12.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout8.addView(v12, ma.o(-1, -2));
                            linearLayout7.addView(linearLayout8, ma.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout6.addView(linearLayout7, ma.o(-1, 56));
                            LinearLayout linearLayout9 = new LinearLayout(context2);
                            linearLayout9.setOrientation(1);
                            linearLayout9.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int i30 = org.telegram.ui.ActionBar.n6.d6;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i30, i6Var2));
                            org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i30);
                            linearLayout9.setBackground(d02);
                            org.telegram.ui.ActionBar.u6.j(linearLayout9, d02, M3, null, i6Var2);
                            TextView v13 = org.telegram.ui.Wallet.l2.v(equals2 ? 14 : 16, context2, equals2 ? jSONObject.optString("text") : gd.M0(2131742945, null), i6Var2);
                            v13.setGravity(3);
                            v13.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView v14 = org.telegram.ui.Wallet.l2.v(14, context2, gd.M0(2131742752, null), i6Var2);
                                v14.setGravity(3);
                                v14.setTypeface(org.telegram.messenger.g0.o());
                                org.telegram.ui.ActionBar.u6.U(v14, org.telegram.ui.ActionBar.n6.L6, i6Var2);
                                linearLayout9.addView(v14, ma.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v13.setTypeface(Typeface.MONOSPACE);
                                i11 = -1;
                                i12 = -2;
                            } else {
                                LinearLayout linearLayout10 = new LinearLayout(context2);
                                linearLayout10.setGravity(16);
                                TextView v15 = org.telegram.ui.Wallet.l2.v(12, context2, "!", i6Var2);
                                v15.setTypeface(org.telegram.messenger.g0.o());
                                v15.setTextColor(-1);
                                int L2 = org.telegram.messenger.g0.L(8.0f);
                                int i31 = org.telegram.ui.ActionBar.n6.q7;
                                ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i31, i6Var2));
                                org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i31);
                                v15.setBackground(d03);
                                org.telegram.ui.ActionBar.u6.j(v15, d03, M4, null, i6Var2);
                                linearLayout10.addView(v15, ma.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v16 = org.telegram.ui.Wallet.l2.v(14, context2, gd.M0(2131742946, null), i6Var2);
                                v16.setGravity(3);
                                v16.setTypeface(org.telegram.messenger.g0.o());
                                i11 = -1;
                                i12 = -2;
                                linearLayout10.addView(v16, ma.o(-1, -2));
                                linearLayout9.addView(linearLayout10, ma.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout9.addView(v13, ma.o(i11, i12));
                            if (equals2) {
                                v13.setOnClickListener(new org.telegram.ui.Wallet.r1(jSONObject, d3Var2, i6Var2, 0));
                            }
                            h6 h6Var2 = new h6(context2, 4);
                            h6Var2.addView(linearLayout9);
                            linearLayout6.addView(h6Var2, ma.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.c3 c3Var3 = new org.telegram.ui.Wallet.c3(context2);
                            c3Var3.getContent().addView(linearLayout6, ma.c(-2.0f, -1));
                            d3Var2.J0(c3Var3);
                            LinearLayout g14 = org.telegram.messenger.f3.g(context2, 1);
                            if (equals2) {
                                TextView v17 = org.telegram.ui.Wallet.l2.v(14, context2, gd.M0(2131742771, null), i6Var2);
                                v17.setGravity(3);
                                org.telegram.ui.ActionBar.u6.U(v17, i29, i6Var2);
                                g14.addView(v17, ma.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout11 = new LinearLayout(context2);
                            linearLayout11.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                            hi.d dVar2 = new hi.d(context2, i6Var2, true);
                            dVar2.setRoundRadius(24);
                            dVar2.e();
                            dVar2.setText(gd.M0(2131752578, null));
                            hi.d g15 = n10.g(24, context2, i6Var2, true);
                            g15.setText(gd.M0(2131742754, null));
                            g15.setEnabled(false);
                            linearLayout11.addView(dVar2, ma.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout11.addView(g15, ma.m(1.0f, 0, 44, 6, 0, 0));
                            g14.addView(linearLayout11);
                            d3Var2.L0(g14);
                            d3Var2.z0 = new org.telegram.ui.h0(h2Var, 2);
                            org.telegram.ui.Wallet.p pVar = new org.telegram.ui.Wallet.p(h6Var2, h2Var, g15, 4);
                            final int i32 = 0;
                            h6Var2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.s1(pVar, i32));
                            h6Var2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.t1(pVar, i32));
                            final org.telegram.ui.Wallet.u1 u1Var = new org.telegram.ui.Wallet.u1(g15, dVar2, l2Var4, h2Var, d3Var2, i6Var2, pVar);
                            g15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.v1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            u1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            u1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i33 = 1;
                            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.v1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i33) {
                                        case 0:
                                            u1Var.a(Boolean.FALSE);
                                            break;
                                        default:
                                            u1Var.a(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final org.telegram.ui.Wallet.f2 f2Var2 = new org.telegram.ui.Wallet.f2(zArr3, h2Var, d3Var2, i32);
                            h2Var.r = new org.telegram.ui.Wallet.m(d3Var2, 4);
                            final int i34 = 1;
                            d3Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.q1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i34) {
                                        case 0:
                                            f2 f2Var22 = (f2) f2Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(f2Var22);
                                            l2Var4.u(h2Var);
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            f2 f2Var3 = (f2) f2Var2;
                                            zArr3[0] = true;
                                            org.telegram.messenger.g0.r(f2Var3);
                                            l2Var4.u(h2Var);
                                            Runnable runnable4 = runnable2;
                                            if (runnable4 != null) {
                                                runnable4.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            d3Var2.show();
                            org.telegram.messenger.g0.h3(f2Var2, Math.max(0L, i20 - l2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e11) {
                            l2Var4.u(h2Var);
                            lc.c0(org.telegram.ui.Wallet.l2.i("display signing data", e11));
                            return;
                        }
                    }
                } else if (str8 != null) {
                    lc.c0(str8);
                    break;
                }
                break;
            default:
                hi.d dVar3 = (hi.d) obj6;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj5;
                View view = (View) obj4;
                a8.r7 r7Var = (a8.r7) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                dVar3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new lc(x2Var.F, x2Var.J0).f0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i14).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                        StringBuilder n10 = i5.c.n("wear-auth: sending /token account=", i14, " dcId=", currentDatacenterId, " isTest=");
                        n10.append(isTestBackend);
                        org.telegram.messenger.a8.b(n10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = yc1.c(r7Var, queryParameter, currentDatacenterId, isTestBackend);
                            b9.k0 k0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str11 = (String) r7Var.d;
                            com.google.android.gms.common.api.internal.p0 p0Var = k0Var.i;
                            b9.h0 h0Var = new b9.h0(p0Var, str11, "/tg-wear-auth/token", c10);
                            p0Var.b.d(0, h0Var);
                            q6.m.n(h0Var, b9.j0.a).addOnSuccessListener(new wc1(i16, r7Var, dVar3)).addOnFailureListener(new vc1(dVar3, i15));
                            x2Var.dismiss();
                            break;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            new lc(x2Var.F, x2Var.J0).f0(e12.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error4 != null) {
                    org.telegram.ui.Cells.c0.t(x2Var.F, x2Var.J0, tL_error4, false);
                    break;
                } else {
                    new lc(x2Var.F, x2Var.J0).f0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ t3(Context context, int i7, org.telegram.ui.Wallet.u0 u0Var, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        this.d = context;
        this.b = i7;
        this.f = u0Var;
        this.e = i6Var;
        this.c = runnable;
    }

    public /* synthetic */ t3(hi.d dVar, org.telegram.ui.ActionBar.x2 x2Var, int i7, View view, a8.r7 r7Var) {
        this.c = dVar;
        this.d = x2Var;
        this.b = i7;
        this.e = view;
        this.f = r7Var;
    }

    public /* synthetic */ t3(LaunchActivity launchActivity, vf.b bVar, mp mpVar, int i7, TLRPC.User user) {
        this.c = launchActivity;
        this.d = bVar;
        this.e = mpVar;
        this.b = i7;
        this.f = user;
    }

    public /* synthetic */ t3(r90 r90Var, String str, String str2, String str3, int i7) {
        this.c = r90Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i7;
    }
}
