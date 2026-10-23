package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
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
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ae0;
import org.telegram.ui.ei1;
import org.telegram.ui.gi1;
import org.telegram.ui.gx;
import org.telegram.ui.kb0;
import org.telegram.ui.ob0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class ih implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ih(Context context, int i10, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        this.a = 3;
        this.f = context;
        this.b = i10;
        this.c = l0Var;
        this.d = g6Var;
        this.e = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v29 */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.o2 U;
        org.telegram.ui.Wallet.a2 a2Var;
        org.telegram.ui.Wallet.e2 e2Var;
        boolean z10;
        final int i10;
        char c10;
        CharSequence formatSpannable;
        CharSequence charSequence;
        org.telegram.ui.Wallet.l0 l0Var;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i15 = 1;
        switch (i13) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.c2) obj6, (Utilities.Callback2) obj5, (l5.j) obj4, (Context) obj3, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                pf.c cVar = (pf.c) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.E1;
                launchActivity.getClass();
                if (cVar != null) {
                    cVar.b();
                }
                if (user2 != null) {
                    messagesController.putUser(user2, false);
                    messagesController.loadFullUser(user2, 0, true);
                }
                launchActivity.n0(i14, user.id, tL_error);
                break;
            case 2:
                ob0 ob0Var = (ob0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = ob0Var.a;
                ob0Var.h = -1;
                if (!ob0Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 == null) {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i16);
                                    i16++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(ob0Var.b).getCurrentTime()) {
                                        if (ob0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                            ob0Var.c();
                                            org.telegram.ui.Wallet.e2.o(ob0Var.a, ob0Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new kb0(ob0Var, str3, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i17 = this.b;
                        if (i17 < 10) {
                            ai.vb vbVar = new ai.vb((Object) ob0Var, str, str2, str3, i17, 28);
                            ob0Var.i = vbVar;
                            AndroidUtilities.runOnUIThread(vbVar, 500L);
                            break;
                        } else {
                            ob0Var.c();
                            if (ob0Var.a()) {
                                org.telegram.ui.Components.xc.b0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                                break;
                            }
                        }
                    } else {
                        ob0Var.c();
                        if (ob0Var.a()) {
                            ob0.d().f0(tL_error2, false);
                        }
                    }
                    break;
                } else {
                    ob0Var.c();
                    break;
                }
                break;
            case 3:
                Context context = (Context) obj3;
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj6;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj5;
                final Runnable runnable = (Runnable) obj4;
                final org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj;
                String str4 = (String) obj2;
                if (a2Var2 != null) {
                    int i18 = a2Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = a2Var2.a;
                    String str5 = a2Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.H1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i14) {
                            l0Var2.g.s(a2Var2);
                            break;
                        }
                    }
                    if (!"signData".equals(str5)) {
                        org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i14);
                        org.telegram.ui.Wallet.e2 e2Var2 = w9.g;
                        org.telegram.ui.Wallet.d2 d2Var = a2Var2.f;
                        boolean equals = "signMessage".equals(str5);
                        final org.telegram.ui.Wallet.i2 i2Var = new org.telegram.ui.Wallet.i2(context, g6Var, new View[0]);
                        i2Var.t(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, g6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                        w9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            a2Var = a2Var2;
                            e2Var = e2Var2;
                            z10 = equals;
                            w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            a2Var = a2Var2;
                            e2Var = e2Var2;
                            z10 = equals;
                        }
                        linearLayout.addView(w9Var, w7.z5.t(76, 76, 1, 0, 24, 0, 0));
                        TextView t10 = org.telegram.ui.Wallet.e2.t(20, context, LocaleController.formatSpannable(z10 ? R.string.WalletAppRequestsSignature : R.string.WalletAppRequestsTransfer, tonconnectsession2.manifest.name), g6Var);
                        t10.setTypeface(AndroidUtilities.bold());
                        linearLayout.addView(t10, w7.z5.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                        if (!TextUtils.isEmpty(hostAuthority)) {
                            linearLayout.addView(org.telegram.ui.Wallet.e2.g(context, hostAuthority, g6Var), w7.z5.t(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.x5 x5Var = new org.telegram.ui.Wallet.x5(context, R.drawable.wallet_card_info, 24);
                        x5Var.getCardHolderView().setMaxLines(2);
                        x5Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.c2> list = d2Var.b;
                        long j10 = d2Var.c;
                        x5Var.setCardHolder(org.telegram.ui.Wallet.w7.X(((org.telegram.ui.Wallet.c2) list.get(0)).a));
                        org.telegram.ui.Components.q6 balanceView = x5Var.getBalanceView();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        SpannableString spannableString = new SpannableString("GRAM");
                        spannableString.setSpan(new xq(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.n(-j10, true)).append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
                        balanceView.setText(spannableStringBuilder);
                        final int i19 = 0;
                        x5Var.getUsdBalanceView().setText(w9.l(j10, false));
                        linearLayout.addView(x5Var, w7.z5.n(-1, -2));
                        x5Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.i1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i19) {
                                    case 0:
                                        i2 i2Var2 = i2Var;
                                        ei.h1 h1Var = i2Var2.b;
                                        if (1 < i2Var2.c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                        i2 i2Var3 = i2Var;
                                        ei.h1 h1Var2 = i2Var3.b;
                                        if (i2Var3.c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                        org.telegram.ui.Wallet.h2 h2Var = new org.telegram.ui.Wallet.h2(context);
                        h2Var.getContent().addView(linearLayout, w7.z5.c(-2.0f, -1));
                        i2Var.s(h2Var);
                        LinearLayout e = sl.e(context, 1);
                        LinearLayout e7 = sl.e(context, 0);
                        e.addView(e7, w7.z5.n(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i20 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i20, g6Var), 1, -1);
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i20);
                        imageView.setBackground(g02);
                        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
                        int i21 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.t(imageView, i21, g6Var, PorterDuff.Mode.SRC_IN);
                        w7.b6.a(imageView);
                        e7.addView(imageView, w7.z5.p(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
                        w9Var2.setRoundRadius(AndroidUtilities.dp(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            w9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        }
                        e7.addView(w9Var2, w7.z5.t(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        e7.addView(linearLayout2, w7.z5.p(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(AndroidUtilities.bold());
                        org.telegram.ui.ActionBar.r6.W(textView, i21, g6Var);
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, w7.z5.n(-1, -2));
                        textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                        if (TextUtils.isEmpty(hostAuthority)) {
                            i10 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.z6, g6Var);
                            i10 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                            textView2.setText(hostAuthority);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.i1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        i2 i2Var2 = i2Var;
                                        ei.h1 h1Var = i2Var2.b;
                                        if (1 < i2Var2.c.size() && 1 != h1Var.getCurrentPosition()) {
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
                                        i2 i2Var3 = i2Var;
                                        ei.h1 h1Var2 = i2Var3.b;
                                        if (i2Var3.c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
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
                        LinearLayout D = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletPreview), g6Var);
                        String A = org.telegram.ui.Wallet.e2.A(((org.telegram.ui.Wallet.c2) list.get(0)).a);
                        int i22 = R.drawable.mini_gram_24;
                        SpannableStringBuilder r10 = org.telegram.ui.Wallet.l0.r(j10, i10);
                        if (list.size() > i10) {
                            int i23 = R.string.WalletTransferToMultiple;
                            Integer valueOf = Integer.valueOf(list.size() - i10);
                            char c11 = i10;
                            c10 = 2;
                            Object[] objArr = new Object[2];
                            objArr[0] = A;
                            objArr[c11] = valueOf;
                            formatSpannable = LocaleController.formatSpannable(i23, objArr);
                        } else {
                            c10 = 2;
                            int i24 = R.string.WalletTransferTo;
                            Object[] objArr2 = new Object[i10];
                            objArr2[0] = A;
                            formatSpannable = LocaleController.formatSpannable(i24, objArr2);
                        }
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        D.addView(org.telegram.ui.Wallet.e2.b(context, i22, r10, formatSpannable, null, null, g6Var), w7.z5.n(-1, -2));
                        linearLayout3.addView(D, w7.z5.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout D2 = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletActions), g6Var2);
                        for (org.telegram.ui.Wallet.c2 c2Var : list) {
                            int i25 = R.drawable.mini_gram_24;
                            String string = LocaleController.getString((c2Var.b == null || c2Var.d != null) ? R.string.WalletTransfer : R.string.WalletContractCall);
                            CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.e2.A(c2Var.a));
                            String n10 = org.telegram.ui.Wallet.l0.n(-c2Var.e, true);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n10);
                            int indexOf = n10.indexOf(46);
                            if (indexOf >= 0) {
                                charSequence = formatSpannable2;
                                l0Var = w9;
                                spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                            } else {
                                charSequence = formatSpannable2;
                                l0Var = w9;
                            }
                            if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                                spannableStringBuilder2.append((CharSequence) " x");
                            }
                            xq xqVar = new xq(R.drawable.wallet_gram_small, 2);
                            xqVar.recolorDrawable = false;
                            xqVar.setSize(AndroidUtilities.dp(16.0f));
                            spannableStringBuilder2.setSpan(xqVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                            org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                            D2.addView(org.telegram.ui.Wallet.e2.b(context, i25, string, charSequence, spannableStringBuilder2, c2Var.d, g6Var3), w7.z5.n(-1, -2));
                            g6Var2 = g6Var3;
                            w9 = l0Var;
                        }
                        org.telegram.ui.Wallet.l0 l0Var3 = w9;
                        org.telegram.ui.ActionBar.g6 g6Var4 = g6Var2;
                        linearLayout3.addView(D2, w7.z5.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        gx gxVar = new gx(context, 3);
                        gxVar.setFillViewport(false);
                        gxVar.addView(linearLayout3);
                        e.addView(gxVar, w7.z5.n(-1, -2));
                        org.telegram.ui.Wallet.h2 h2Var2 = new org.telegram.ui.Wallet.h2(context);
                        h2Var2.getContent().addView(e, w7.z5.c(-2.0f, -1));
                        i2Var.s(h2Var2);
                        LinearLayout e10 = sl.e(context, 1);
                        TextView t11 = org.telegram.ui.Wallet.e2.t(14, context, null, g6Var4);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                        spannableStringBuilder3.setSpan(new da0(AndroidUtilities.dp(80.0f), t11), 0, spannableStringBuilder3.length(), 33);
                        t11.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                        t11.setVisibility(z10 ? 8 : 0);
                        org.telegram.ui.ActionBar.r6.W(t11, org.telegram.ui.ActionBar.k6.z6, g6Var4);
                        e10.addView(t11, w7.z5.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        ei.d dVar = new ei.d(context, g6Var4, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(LocaleController.getString(R.string.WalletDecline));
                        linearLayout4.addView(dVar, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                        ei.d g10 = sl.g(24, context, g6Var4, true);
                        g10.setText(LocaleController.getString(z10 ? R.string.WalletSign : R.string.WalletConfirm));
                        g10.setEnabled(false);
                        linearLayout4.addView(g10, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                        e10.addView(linearLayout4);
                        i2Var.u(e10);
                        final int i26 = 1;
                        final int i27 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.a2 a2Var3 = a2Var;
                        final org.telegram.ui.Wallet.e2 e2Var3 = e2Var;
                        final org.telegram.ui.Wallet.j1 j1Var = new org.telegram.ui.Wallet.j1(a2Var3, zArr2, g10, dVar, e2Var3, i2Var, zArr, g6Var4);
                        g10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.k1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i27) {
                                    case 0:
                                        j1Var.run(Boolean.FALSE);
                                        break;
                                    default:
                                        j1Var.run(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.k1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i26) {
                                    case 0:
                                        j1Var.run(Boolean.FALSE);
                                        break;
                                    default:
                                        j1Var.run(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.y1 y1Var = new org.telegram.ui.Wallet.y1(zArr, a2Var3, i2Var, i26);
                        long j11 = i18;
                        long j12 = d2Var.a;
                        if (j12 == 0) {
                            j12 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i14).getCurrentTime()) * 1000;
                        a2Var3.r = new org.telegram.ui.Wallet.m(i2Var, 5);
                        final int i28 = 0;
                        i2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.l1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i28) {
                                    case 0:
                                        y1 y1Var2 = (y1) y1Var;
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread(y1Var2);
                                        e2Var3.s(a2Var3);
                                        Runnable runnable2 = runnable;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        y1 y1Var3 = (y1) y1Var;
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread(y1Var3);
                                        e2Var3.s(a2Var3);
                                        Runnable runnable3 = runnable;
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        i2Var.show();
                        AndroidUtilities.runOnUIThread(y1Var, max);
                        ki.c cVar2 = new ki.c(zArr, a2Var3, zArr2, g10, z10, l0Var3, t11, i2Var, g6Var4);
                        WalletEngine2 walletEngine2 = e2Var3.b.b;
                        if (!a2Var3.n && !e2Var3.i(a2Var3) && e2Var3.y(a2Var3) && walletEngine2 != null) {
                            if ("signMessage".equals(str5)) {
                                walletEngine2.previewSignMessage(d2Var, new org.telegram.ui.Wallet.o(e2Var3, a2Var3, cVar2, 1));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.j(e2Var3, a2Var3, cVar2, 9));
                                break;
                            }
                        } else {
                            cVar2.run(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.e2 e2Var4 = org.telegram.ui.Wallet.l0.w(i14).g;
                        try {
                            JSONObject jSONObject = new JSONObject(a2Var2.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.i2 i2Var2 = new org.telegram.ui.Wallet.i2(context, g6Var, new View[0]);
                            i2Var2.t(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, g6Var));
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setOrientation(1);
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setGravity(16);
                            ImageView imageView2 = new ImageView(context);
                            imageView2.setImageResource(R.drawable.ic_ab_close);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.G6, g6Var, PorterDuff.Mode.SRC_IN);
                            int i29 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i29, g6Var), 1, -1);
                            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i29);
                            imageView2.setBackground(g03);
                            org.telegram.ui.ActionBar.r6.k(imageView2, g03, null, O2, g6Var);
                            imageView2.setContentDescription(LocaleController.getString(R.string.Close));
                            imageView2.setOnClickListener(new ae0(23, a2Var2, i2Var2));
                            linearLayout6.addView(imageView2, w7.z5.p(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.w9 w9Var3 = new org.telegram.ui.Components.w9(context);
                            w9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                w9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout6.addView(w9Var3, w7.z5.p(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            TextView t12 = org.telegram.ui.Wallet.e2.t(18, context, LocaleController.getString(R.string.WalletSignData), g6Var);
                            t12.setTypeface(AndroidUtilities.bold());
                            t12.setGravity(3);
                            linearLayout7.addView(t12, w7.z5.n(-1, -2));
                            TextView t13 = org.telegram.ui.Wallet.e2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), g6Var);
                            int i30 = org.telegram.ui.ActionBar.k6.z6;
                            org.telegram.ui.ActionBar.r6.W(t13, i30, g6Var);
                            t13.setGravity(3);
                            t13.setSingleLine(true);
                            t13.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout7.addView(t13, w7.z5.n(-1, -2));
                            linearLayout6.addView(linearLayout7, w7.z5.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout5.addView(linearLayout6, w7.z5.n(-1, 56));
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setOrientation(1);
                            linearLayout8.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                            int dp = AndroidUtilities.dp(16.0f);
                            int i31 = org.telegram.ui.ActionBar.k6.d6;
                            Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i31, g6Var));
                            org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i31);
                            linearLayout8.setBackground(c02);
                            org.telegram.ui.ActionBar.r6.k(linearLayout8, c02, O3, null, g6Var);
                            TextView t14 = org.telegram.ui.Wallet.e2.t(equals2 ? 14 : 16, context, equals2 ? jSONObject.optString("text") : LocaleController.getString(R.string.WalletBinaryDataWarning), g6Var);
                            t14.setGravity(3);
                            t14.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView t15 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletSigningData), g6Var);
                                t15.setGravity(3);
                                t15.setTypeface(AndroidUtilities.bold());
                                org.telegram.ui.ActionBar.r6.W(t15, org.telegram.ui.ActionBar.k6.L6, g6Var);
                                linearLayout8.addView(t15, w7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                t14.setTypeface(Typeface.MONOSPACE);
                                i11 = -1;
                                i12 = -2;
                            } else {
                                LinearLayout linearLayout9 = new LinearLayout(context);
                                linearLayout9.setGravity(16);
                                TextView t16 = org.telegram.ui.Wallet.e2.t(12, context, "!", g6Var);
                                t16.setTypeface(AndroidUtilities.bold());
                                t16.setTextColor(-1);
                                int dp2 = AndroidUtilities.dp(8.0f);
                                int i32 = org.telegram.ui.ActionBar.k6.q7;
                                ShapeDrawable c03 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.w0(i32, g6Var));
                                org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i32);
                                t16.setBackground(c03);
                                org.telegram.ui.ActionBar.r6.k(t16, c03, O4, null, g6Var);
                                linearLayout9.addView(t16, w7.z5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView t17 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), g6Var);
                                t17.setGravity(3);
                                t17.setTypeface(AndroidUtilities.bold());
                                i11 = -1;
                                i12 = -2;
                                linearLayout9.addView(t17, w7.z5.n(-1, -2));
                                linearLayout8.addView(linearLayout9, w7.z5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout8.addView(t14, w7.z5.n(i11, i12));
                            if (equals2) {
                                t14.setOnClickListener(new org.telegram.ui.Wallet.m1(jSONObject, i2Var2, g6Var, 0));
                            }
                            gx gxVar2 = new gx(context, 2);
                            gxVar2.addView(linearLayout8);
                            linearLayout5.addView(gxVar2, w7.z5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.h2 h2Var3 = new org.telegram.ui.Wallet.h2(context);
                            h2Var3.getContent().addView(linearLayout5, w7.z5.c(-2.0f, -1));
                            i2Var2.s(h2Var3);
                            LinearLayout e11 = sl.e(context, 1);
                            if (equals2) {
                                TextView t18 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), g6Var);
                                t18.setGravity(3);
                                org.telegram.ui.ActionBar.r6.W(t18, i30, g6Var);
                                e11.addView(t18, w7.z5.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                            ei.d dVar2 = new ei.d(context, g6Var, true);
                            dVar2.setRoundRadius(24);
                            dVar2.e();
                            dVar2.setText(LocaleController.getString(R.string.Cancel));
                            ei.d dVar3 = new ei.d(context, g6Var, true);
                            dVar3.setRoundRadius(24);
                            dVar3.setText(LocaleController.getString(R.string.WalletSign));
                            dVar3.setEnabled(false);
                            linearLayout10.addView(dVar2, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout10.addView(dVar3, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                            e11.addView(linearLayout10);
                            i2Var2.u(e11);
                            int i33 = 2;
                            i2Var2.setDelegate(new org.telegram.ui.i0(a2Var2, i33));
                            org.telegram.ui.Wallet.h hVar = new org.telegram.ui.Wallet.h(gxVar2, a2Var2, dVar3, i33);
                            final int i34 = 0;
                            gxVar2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.n1(hVar, i34));
                            gxVar2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.o1(hVar, i34));
                            final org.telegram.ui.Wallet.p1 p1Var = new org.telegram.ui.Wallet.p1(dVar3, dVar2, e2Var4, a2Var2, i2Var2, g6Var, hVar);
                            dVar3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i34) {
                                        case 0:
                                            p1Var.run(Boolean.FALSE);
                                            break;
                                        default:
                                            p1Var.run(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i35 = 1;
                            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i35) {
                                        case 0:
                                            p1Var.run(Boolean.FALSE);
                                            break;
                                        default:
                                            p1Var.run(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final boolean[] zArr3 = {false};
                            final org.telegram.ui.Wallet.y1 y1Var2 = new org.telegram.ui.Wallet.y1(zArr3, a2Var2, i2Var2, i34);
                            a2Var2.r = new org.telegram.ui.Wallet.m(i2Var2, 5);
                            final int i36 = 1;
                            i2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.l1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i36) {
                                        case 0:
                                            y1 y1Var22 = (y1) y1Var2;
                                            zArr3[0] = true;
                                            AndroidUtilities.cancelRunOnUIThread(y1Var22);
                                            e2Var4.s(a2Var2);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                break;
                                            }
                                            break;
                                        default:
                                            y1 y1Var3 = (y1) y1Var2;
                                            zArr3[0] = true;
                                            AndroidUtilities.cancelRunOnUIThread(y1Var3);
                                            e2Var4.s(a2Var2);
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            i2Var2.show();
                            AndroidUtilities.runOnUIThread(y1Var2, Math.max(0L, i18 - e2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e12) {
                            e2Var4.s(a2Var2);
                            org.telegram.ui.Components.xc.b0(org.telegram.ui.Wallet.e2.h("display signing data", e12));
                            return;
                        }
                    }
                } else if (str4 != null) {
                    org.telegram.ui.Components.xc.b0(str4);
                    break;
                }
                break;
            default:
                ei.d dVar4 = (ei.d) obj6;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj5;
                View view = (View) obj4;
                com.google.android.gms.internal.cast.z5 z5Var = (com.google.android.gms.internal.cast.z5) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.xc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i14).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                        StringBuilder k10 = com.google.android.gms.internal.play_billing.k3.k("wear-auth: sending /token account=", i14, " dcId=", currentDatacenterId, " isTest=");
                        k10.append(isTestBackend);
                        FileLog.d(k10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c12 = gi1.c(z5Var, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str6 = (String) z5Var.a;
                            com.google.android.gms.common.api.internal.s0 s0Var = v0Var.h;
                            b8.e eVar = new b8.e(s0Var, str6, "/tg-wear-auth/token", c12);
                            s0Var.b.d(0, eVar);
                            n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new org.telegram.ui.Wallet.e8(i15, z5Var, dVar4)).addOnFailureListener(new ei1(dVar4, i15));
                            h3Var.dismiss();
                            break;
                        } catch (Exception e13) {
                            FileLog.e(e13);
                            new org.telegram.ui.Components.xc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).e0(e13.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.b1.s(h3Var.topBulletinContainer, h3Var.getResourcesProvider(), tL_error3, false);
                    break;
                } else {
                    new org.telegram.ui.Components.xc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).e0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ ih(ei.d dVar, org.telegram.ui.ActionBar.h3 h3Var, int i10, View view, com.google.android.gms.internal.cast.z5 z5Var) {
        this.a = 4;
        this.c = dVar;
        this.d = h3Var;
        this.b = i10;
        this.e = view;
        this.f = z5Var;
    }

    public /* synthetic */ ih(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ ih(LaunchActivity launchActivity, pf.c cVar, MessagesController messagesController, int i10, TLRPC.User user) {
        this.a = 1;
        this.c = launchActivity;
        this.d = cVar;
        this.e = messagesController;
        this.b = i10;
        this.f = user;
    }
}
