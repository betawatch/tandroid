package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ec0;
import org.telegram.ui.ls0;
import org.telegram.ui.mj1;
import org.telegram.ui.nj1;
import org.telegram.ui.vx;
import org.telegram.ui.vy0;
import org.telegram.ui.zb0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class jh implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jh(Context context, int i10, org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.a = 2;
        this.f = context;
        this.b = i10;
        this.c = k0Var;
        this.d = e6Var;
        this.e = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v32 */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.n2 U;
        org.telegram.ui.Wallet.z1 z1Var;
        org.telegram.ui.Wallet.d2 d2Var;
        boolean z10;
        final int i10;
        char c10;
        CharSequence formatSpannable;
        CharSequence charSequence;
        org.telegram.ui.Wallet.k0 k0Var;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i13) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.b2) obj6, (Utilities.Callback2) obj5, (k6.h) obj4, (Context) obj3, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ec0 ec0Var = (ec0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity = ec0Var.a;
                ec0Var.h = -1;
                if (!ec0Var.j && !launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                    if (tL_error == null) {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i15);
                                    i15++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(ec0Var.b).getCurrentTime()) {
                                        if (ec0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                            ec0Var.c();
                                            org.telegram.ui.Wallet.d2.o(ec0Var.a, ec0Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new zb0(ec0Var, str3, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i16 = this.b;
                        if (i16 < 10) {
                            ei.l3 l3Var = new ei.l3(ec0Var, str, str2, str3, i16, 27);
                            ec0Var.i = l3Var;
                            AndroidUtilities.runOnUIThread(l3Var, 500L);
                            break;
                        } else {
                            ec0Var.c();
                            if (ec0Var.a()) {
                                org.telegram.ui.Components.ad.b0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                                break;
                            }
                        }
                    } else {
                        ec0Var.c();
                        if (ec0Var.a()) {
                            ec0.d().f0(tL_error, false);
                        }
                    }
                    break;
                } else {
                    ec0Var.c();
                    break;
                }
                break;
            case 2:
                Context context = (Context) obj3;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj6;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj5;
                final Runnable runnable = (Runnable) obj4;
                final org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj;
                String str4 = (String) obj2;
                if (z1Var2 != null) {
                    int i17 = z1Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = z1Var2.a;
                    String str5 = z1Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.E1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i14) {
                            k0Var2.g.s(z1Var2);
                            break;
                        }
                    }
                    if (!"signData".equals(str5)) {
                        org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i14);
                        org.telegram.ui.Wallet.d2 d2Var2 = v.g;
                        org.telegram.ui.Wallet.c2 c2Var = z1Var2.f;
                        boolean equals = "signMessage".equals(str5);
                        final org.telegram.ui.Wallet.h2 h2Var = new org.telegram.ui.Wallet.h2(context, e6Var, new View[0]);
                        h2Var.u(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, e6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                        y9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            z1Var = z1Var2;
                            d2Var = d2Var2;
                            z10 = equals;
                            y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            z1Var = z1Var2;
                            d2Var = d2Var2;
                            z10 = equals;
                        }
                        linearLayout.addView(y9Var, w7.x5.t(76, 76, 1, 0, 24, 0, 0));
                        TextView t10 = org.telegram.ui.Wallet.d2.t(20, context, LocaleController.formatSpannable(z10 ? R.string.WalletAppRequestsSignature : R.string.WalletAppRequestsTransfer, tonconnectsession2.manifest.name), e6Var);
                        t10.setTypeface(AndroidUtilities.bold());
                        linearLayout.addView(t10, w7.x5.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                        if (!TextUtils.isEmpty(hostAuthority)) {
                            linearLayout.addView(org.telegram.ui.Wallet.d2.g(context, hostAuthority, e6Var), w7.x5.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.i5 i5Var = new org.telegram.ui.Wallet.i5(R.drawable.wallet_card_info, 24, context, false);
                        i5Var.setEngravingBitmap(null);
                        i5Var.getCardHolderView().setMaxLines(2);
                        i5Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.b2> list = c2Var.b;
                        long j3 = c2Var.c;
                        i5Var.setCardHolder(org.telegram.ui.Wallet.a7.X(((org.telegram.ui.Wallet.b2) list.get(0)).a));
                        org.telegram.ui.Components.r6 balanceView = i5Var.getBalanceView();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        SpannableString spannableString = new SpannableString("GRAM");
                        spannableString.setSpan(new er(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.k0.n(-j3, true)).append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
                        balanceView.setText(spannableStringBuilder);
                        final int i18 = 0;
                        i5Var.getUsdBalanceView().setText(v.l(j3, false));
                        linearLayout.addView(i5Var, w7.x5.n(-1, -2));
                        i5Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i18) {
                                    case 0:
                                        h2 h2Var2 = h2Var;
                                        ci.h1 h1Var = h2Var2.b;
                                        if (1 < h2Var2.c.size() && 1 != h1Var.getCurrentPosition()) {
                                            for (View view2 : h1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    AndroidUtilities.hideKeyboard(view2);
                                                }
                                            }
                                            h1Var.D(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        h2 h2Var3 = h2Var;
                                        ci.h1 h1Var2 = h2Var3.b;
                                        if (h2Var3.c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : h1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    AndroidUtilities.hideKeyboard(view3);
                                                }
                                            }
                                            h1Var2.D(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Wallet.g2 g2Var = new org.telegram.ui.Wallet.g2(context);
                        g2Var.getContent().addView(linearLayout, w7.x5.d(-2.0f, -1));
                        h2Var.t(g2Var);
                        LinearLayout e7 = bi.e(context, 1);
                        LinearLayout e10 = bi.e(context, 0);
                        e7.addView(e10, w7.x5.n(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, -1));
                        int i19 = org.telegram.ui.ActionBar.i6.G6;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i19, e6Var), PorterDuff.Mode.SRC_IN));
                        w7.z5.a(imageView);
                        e10.addView(imageView, w7.x5.p(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
                        y9Var2.setRoundRadius(AndroidUtilities.dp(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            y9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        }
                        e10.addView(y9Var2, w7.x5.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        e10.addView(linearLayout2, w7.x5.p(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i19, e6Var));
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, w7.x5.n(-1, -2));
                        textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                        if (TextUtils.isEmpty(hostAuthority)) {
                            i10 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            i10 = 1;
                            bi.o(org.telegram.ui.ActionBar.i6.z6, e6Var, textView2, 1, 14.0f);
                            linearLayout2.addView(textView2, w7.x5.n(-1, -2));
                            textView2.setText(hostAuthority);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        h2 h2Var2 = h2Var;
                                        ci.h1 h1Var = h2Var2.b;
                                        if (1 < h2Var2.c.size() && 1 != h1Var.getCurrentPosition()) {
                                            for (View view2 : h1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    AndroidUtilities.hideKeyboard(view2);
                                                }
                                            }
                                            h1Var.D(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        h2 h2Var3 = h2Var;
                                        ci.h1 h1Var2 = h2Var3.b;
                                        if (h2Var3.c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : h1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    AndroidUtilities.hideKeyboard(view3);
                                                }
                                            }
                                            h1Var2.D(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(i10);
                        LinearLayout D = org.telegram.ui.Wallet.d2.D(context, LocaleController.getString(R.string.WalletPreview), e6Var);
                        String A = org.telegram.ui.Wallet.d2.A(((org.telegram.ui.Wallet.b2) list.get(0)).a);
                        int i20 = R.drawable.mini_gram_24;
                        SpannableStringBuilder q6 = org.telegram.ui.Wallet.k0.q(j3, i10);
                        if (list.size() > i10) {
                            int i21 = R.string.WalletTransferToMultiple;
                            Integer valueOf = Integer.valueOf(list.size() - i10);
                            char c11 = i10;
                            c10 = 2;
                            Object[] objArr = new Object[2];
                            objArr[0] = A;
                            objArr[c11] = valueOf;
                            formatSpannable = LocaleController.formatSpannable(i21, objArr);
                        } else {
                            c10 = 2;
                            int i22 = R.string.WalletTransferTo;
                            Object[] objArr2 = new Object[i10];
                            objArr2[0] = A;
                            formatSpannable = LocaleController.formatSpannable(i22, objArr2);
                        }
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        D.addView(org.telegram.ui.Wallet.d2.b(context, i20, q6, formatSpannable, null, null, e6Var), w7.x5.n(-1, -2));
                        linearLayout3.addView(D, w7.x5.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout D2 = org.telegram.ui.Wallet.d2.D(context, LocaleController.getString(R.string.WalletActions), e6Var2);
                        for (org.telegram.ui.Wallet.b2 b2Var : list) {
                            int i23 = R.drawable.mini_gram_24;
                            String string = LocaleController.getString((b2Var.b == null || b2Var.d != null) ? R.string.WalletTransfer : R.string.WalletContractCall);
                            CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.d2.A(b2Var.a));
                            String n10 = org.telegram.ui.Wallet.k0.n(-b2Var.e, true);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                            int indexOf = n10.indexOf(46);
                            if (indexOf >= 0) {
                                charSequence = formatSpannable2;
                                k0Var = v;
                                spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                            } else {
                                charSequence = formatSpannable2;
                                k0Var = v;
                            }
                            if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                                spannableStringBuilder2.append((CharSequence) " x");
                            }
                            er erVar = new er(R.drawable.wallet_gram_small, 2);
                            erVar.recolorDrawable = false;
                            erVar.setSize(AndroidUtilities.dp(16.0f));
                            spannableStringBuilder2.setSpan(erVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                            D2.addView(org.telegram.ui.Wallet.d2.b(context, i23, string, charSequence, spannableStringBuilder2, b2Var.d, e6Var3), w7.x5.n(-1, -2));
                            e6Var2 = e6Var3;
                            v = k0Var;
                        }
                        org.telegram.ui.Wallet.k0 k0Var3 = v;
                        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
                        linearLayout3.addView(D2, w7.x5.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        vx vxVar = new vx(context, 3);
                        vxVar.setFillViewport(false);
                        vxVar.addView(linearLayout3);
                        e7.addView(vxVar, w7.x5.n(-1, -2));
                        org.telegram.ui.Wallet.g2 g2Var2 = new org.telegram.ui.Wallet.g2(context);
                        g2Var2.getContent().addView(e7, w7.x5.d(-2.0f, -1));
                        h2Var.t(g2Var2);
                        LinearLayout e11 = bi.e(context, 1);
                        TextView t11 = org.telegram.ui.Wallet.d2.t(14, context, null, e6Var4);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                        spannableStringBuilder3.setSpan(new ja0(AndroidUtilities.dp(80.0f), t11), 0, spannableStringBuilder3.length(), 33);
                        t11.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                        t11.setVisibility(z10 ? 8 : 0);
                        t11.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var4));
                        e11.addView(t11, w7.x5.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        ci.d dVar = new ci.d(context, e6Var4, true);
                        dVar.setRoundRadius(24);
                        dVar.d();
                        dVar.setText(LocaleController.getString(R.string.WalletDecline));
                        linearLayout4.addView(dVar, w7.x5.m(1.0f, 0, 44, 0, 6, 0));
                        ci.d f7 = bi.f(24, context, e6Var4, true);
                        f7.setText(LocaleController.getString(z10 ? R.string.WalletSign : R.string.WalletConfirm));
                        f7.setEnabled(false);
                        linearLayout4.addView(f7, w7.x5.m(1.0f, 0, 44, 6, 0, 0));
                        e11.addView(linearLayout4);
                        h2Var.v(e11);
                        final int i24 = 1;
                        final int i25 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.z1 z1Var3 = z1Var;
                        final org.telegram.ui.Wallet.d2 d2Var3 = d2Var;
                        final org.telegram.ui.Wallet.i1 i1Var = new org.telegram.ui.Wallet.i1(z1Var3, zArr2, f7, dVar, d2Var3, h2Var, zArr, e6Var4);
                        f7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.j1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i25) {
                                    case 0:
                                        i1Var.run(Boolean.FALSE);
                                        break;
                                    default:
                                        i1Var.run(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.j1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i24) {
                                    case 0:
                                        i1Var.run(Boolean.FALSE);
                                        break;
                                    default:
                                        i1Var.run(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.x1 x1Var = new org.telegram.ui.Wallet.x1(zArr, z1Var3, h2Var, i24);
                        long j10 = i17;
                        long j11 = c2Var.a;
                        if (j11 == 0) {
                            j11 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j10, j11) - ConnectionsManager.getInstance(i14).getCurrentTime()) * 1000;
                        z1Var3.r = new org.telegram.ui.Wallet.m(h2Var, 4);
                        final int i26 = 0;
                        h2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.k1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i26) {
                                    case 0:
                                        x1 x1Var2 = (x1) x1Var;
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread(x1Var2);
                                        d2Var3.s(z1Var3);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        x1 x1Var3 = (x1) x1Var;
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread(x1Var3);
                                        d2Var3.s(z1Var3);
                                        Runnable runnable3 = runnable;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        h2Var.show();
                        AndroidUtilities.runOnUIThread(x1Var, max);
                        ii.c cVar = new ii.c(zArr, z1Var3, zArr2, f7, z10, k0Var3, t11, h2Var, e6Var4);
                        WalletEngine2 walletEngine2 = d2Var3.b.b;
                        if (!z1Var3.n && !d2Var3.i(z1Var3) && d2Var3.y(z1Var3) && walletEngine2 != null) {
                            if ("signMessage".equals(str5)) {
                                walletEngine2.previewSignMessage(c2Var, new org.telegram.ui.Wallet.o(d2Var3, z1Var3, cVar, 1));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(c2Var, new org.telegram.ui.Wallet.i(d2Var3, z1Var3, cVar, 9));
                                break;
                            }
                        } else {
                            cVar.run(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.d2 d2Var4 = org.telegram.ui.Wallet.k0.v(i14).g;
                        try {
                            JSONObject jSONObject = new JSONObject(z1Var2.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.h2 h2Var2 = new org.telegram.ui.Wallet.h2(context, e6Var, new View[0]);
                            h2Var2.u(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, e6Var));
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setOrientation(1);
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setGravity(16);
                            ImageView imageView2 = new ImageView(context);
                            imageView2.setImageResource(R.drawable.ic_ab_close);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
                            imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, -1));
                            imageView2.setContentDescription(LocaleController.getString(R.string.Close));
                            imageView2.setOnClickListener(new vy0(12, z1Var2, h2Var2));
                            linearLayout6.addView(imageView2, w7.x5.p(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.y9 y9Var3 = new org.telegram.ui.Components.y9(context);
                            y9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                y9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout6.addView(y9Var3, w7.x5.p(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            TextView t12 = org.telegram.ui.Wallet.d2.t(18, context, LocaleController.getString(R.string.WalletSignData), e6Var);
                            t12.setTypeface(AndroidUtilities.bold());
                            t12.setGravity(3);
                            linearLayout7.addView(t12, w7.x5.n(-1, -2));
                            TextView t13 = org.telegram.ui.Wallet.d2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), e6Var);
                            int i27 = org.telegram.ui.ActionBar.i6.z6;
                            t13.setTextColor(org.telegram.ui.ActionBar.i6.w0(i27, e6Var));
                            t13.setGravity(3);
                            t13.setSingleLine(true);
                            t13.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout7.addView(t13, w7.x5.n(-1, -2));
                            linearLayout6.addView(linearLayout7, w7.x5.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout5.addView(linearLayout6, w7.x5.n(-1, 56));
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setOrientation(1);
                            linearLayout8.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                            linearLayout8.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var)));
                            TextView t14 = org.telegram.ui.Wallet.d2.t(equals2 ? 14 : 16, context, equals2 ? jSONObject.optString("text") : LocaleController.getString(R.string.WalletBinaryDataWarning), e6Var);
                            t14.setGravity(3);
                            t14.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView t15 = org.telegram.ui.Wallet.d2.t(14, context, LocaleController.getString(R.string.WalletSigningData), e6Var);
                                t15.setGravity(3);
                                t15.setTypeface(AndroidUtilities.bold());
                                t15.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L6, e6Var));
                                linearLayout8.addView(t15, w7.x5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                t14.setTypeface(Typeface.MONOSPACE);
                                i11 = -1;
                                i12 = -2;
                            } else {
                                LinearLayout linearLayout9 = new LinearLayout(context);
                                linearLayout9.setGravity(16);
                                TextView t16 = org.telegram.ui.Wallet.d2.t(12, context, "!", e6Var);
                                t16.setTypeface(AndroidUtilities.bold());
                                t16.setTextColor(-1);
                                t16.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, e6Var)));
                                linearLayout9.addView(t16, w7.x5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView t17 = org.telegram.ui.Wallet.d2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), e6Var);
                                t17.setGravity(3);
                                t17.setTypeface(AndroidUtilities.bold());
                                i11 = -1;
                                i12 = -2;
                                linearLayout9.addView(t17, w7.x5.n(-1, -2));
                                linearLayout8.addView(linearLayout9, w7.x5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout8.addView(t14, w7.x5.n(i11, i12));
                            if (equals2) {
                                t14.setOnClickListener(new org.telegram.ui.Wallet.l1(jSONObject, h2Var2, e6Var, 0));
                            }
                            vx vxVar2 = new vx(context, 2);
                            vxVar2.addView(linearLayout8);
                            linearLayout5.addView(vxVar2, w7.x5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.g2 g2Var3 = new org.telegram.ui.Wallet.g2(context);
                            g2Var3.getContent().addView(linearLayout5, w7.x5.d(-2.0f, -1));
                            h2Var2.t(g2Var3);
                            LinearLayout e12 = bi.e(context, 1);
                            if (equals2) {
                                TextView t18 = org.telegram.ui.Wallet.d2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), e6Var);
                                t18.setGravity(3);
                                t18.setTextColor(org.telegram.ui.ActionBar.i6.w0(i27, e6Var));
                                e12.addView(t18, w7.x5.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                            ci.d dVar2 = new ci.d(context, e6Var, true);
                            dVar2.setRoundRadius(24);
                            dVar2.d();
                            dVar2.setText(LocaleController.getString(R.string.Cancel));
                            ci.d dVar3 = new ci.d(context, e6Var, true);
                            dVar3.setRoundRadius(24);
                            dVar3.setText(LocaleController.getString(R.string.WalletSign));
                            dVar3.setEnabled(false);
                            linearLayout10.addView(dVar2, w7.x5.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout10.addView(dVar3, w7.x5.m(1.0f, 0, 44, 6, 0, 0));
                            e12.addView(linearLayout10);
                            h2Var2.v(e12);
                            h2Var2.setDelegate(new org.telegram.ui.h0(z1Var2, 2));
                            org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(vxVar2, z1Var2, dVar3, 2);
                            final int i28 = 0;
                            vxVar2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.m1(kVar, 0));
                            vxVar2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.n1(kVar, 0));
                            final org.telegram.ui.Wallet.o1 o1Var = new org.telegram.ui.Wallet.o1(dVar3, dVar2, d2Var4, z1Var2, h2Var2, e6Var, kVar);
                            dVar3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.p1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i28) {
                                        case 0:
                                            o1Var.run(Boolean.FALSE);
                                            break;
                                        default:
                                            o1Var.run(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i29 = 1;
                            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.p1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            o1Var.run(Boolean.FALSE);
                                            break;
                                        default:
                                            o1Var.run(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final org.telegram.ui.Wallet.x1 x1Var2 = new org.telegram.ui.Wallet.x1(zArr3, z1Var2, h2Var2, i28);
                            z1Var2.r = new org.telegram.ui.Wallet.m(h2Var2, 4);
                            final int i30 = 1;
                            h2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.k1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i30) {
                                        case 0:
                                            x1 x1Var22 = (x1) x1Var2;
                                            zArr3[0] = true;
                                            AndroidUtilities.cancelRunOnUIThread(x1Var22);
                                            d2Var4.s(z1Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            x1 x1Var3 = (x1) x1Var2;
                                            zArr3[0] = true;
                                            AndroidUtilities.cancelRunOnUIThread(x1Var3);
                                            d2Var4.s(z1Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            h2Var2.show();
                            AndroidUtilities.runOnUIThread(x1Var2, Math.max(0L, i17 - d2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e13) {
                            d2Var4.s(z1Var2);
                            org.telegram.ui.Components.ad.b0(org.telegram.ui.Wallet.d2.h("display signing data", e13));
                            return;
                        }
                    }
                } else if (str4 != null) {
                    org.telegram.ui.Components.ad.b0(str4);
                    break;
                }
                break;
            default:
                ci.d dVar4 = (ci.d) obj6;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                View view = (View) obj4;
                ci.u5 u5Var = (ci.u5) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i14).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                        StringBuilder k10 = hg.c.k("wear-auth: sending /token account=", i14, " dcId=", currentDatacenterId, " isTest=");
                        k10.append(isTestBackend);
                        FileLog.d(k10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c12 = nj1.c(u5Var, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.u0 u0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str6 = (String) u5Var.c;
                            com.google.android.gms.common.api.internal.t0 t0Var = u0Var.h;
                            b8.e eVar = new b8.e(t0Var, str6, "/tg-wear-auth/token", c12);
                            t0Var.b.d(0, eVar);
                            n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new ls0(25, u5Var, dVar4)).addOnFailureListener(new mj1(dVar4, 1));
                            f3Var.dismiss();
                            break;
                        } catch (Exception e14) {
                            FileLog.e(e14);
                            new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0(e14.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error2 != null) {
                    org.telegram.ui.Cells.c1.p(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error2, false);
                    break;
                } else {
                    new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ jh(ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i10, View view, ci.u5 u5Var) {
        this.a = 3;
        this.c = dVar;
        this.d = f3Var;
        this.b = i10;
        this.e = view;
        this.f = u5Var;
    }

    public /* synthetic */ jh(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }
}
