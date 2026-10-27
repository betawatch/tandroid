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
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bh1;
import org.telegram.ui.dx;
import org.telegram.ui.ii1;
import org.telegram.ui.jb0;
import org.telegram.ui.ki1;
import org.telegram.ui.ob0;
import org.telegram.ui.zd0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kh(Context context, int i10, org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        this.a = 3;
        this.f = context;
        this.b = i10;
        this.c = l0Var;
        this.d = u6Var;
        this.e = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v34 */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        org.telegram.ui.ActionBar.r2 U;
        org.telegram.ui.Wallet.e2 e2Var;
        int i10;
        boolean z10;
        Object obj3;
        final int i11;
        char c10;
        CharSequence formatSpannable;
        org.telegram.ui.Wallet.l0 l0Var;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = 5;
        int i16 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        int i17 = 1;
        switch (i14) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.e2) obj7, (Utilities.Callback2) obj6, (s4.o0) obj5, (Context) obj4, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                qf.c cVar = (qf.c) obj6;
                MessagesController messagesController = (MessagesController) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                if (cVar != null) {
                    cVar.b();
                }
                if (user2 != null) {
                    messagesController.putUser(user2, false);
                    messagesController.loadFullUser(user2, 0, true);
                }
                launchActivity.n0(i16, user.id, tL_error);
                break;
            case 2:
                ob0 ob0Var = (ob0) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = ob0Var.a;
                ob0Var.h = -1;
                if (!ob0Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 == null) {
                        if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str.equals(tonconnectsession.dapp_client_id)) {
                            ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                            int size = arrayList.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size) {
                                    TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i18);
                                    i18++;
                                    TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                    if (str2.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(ob0Var.b).getCurrentTime()) {
                                        if (ob0Var.a() && (U = LaunchActivity.U()) != null && U.getContext() != null) {
                                            ob0Var.c();
                                            org.telegram.ui.Wallet.e2.o(ob0Var.a, ob0Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, U.getResourceProvider(), new jb0(ob0Var, str3, 0));
                                        }
                                    }
                                }
                            }
                        }
                        int i19 = this.b;
                        if (i19 < 10) {
                            bi.sb sbVar = new bi.sb((Object) ob0Var, str, str2, str3, i19, 28);
                            ob0Var.i = sbVar;
                            AndroidUtilities.runOnUIThread(sbVar, 500L);
                            break;
                        } else {
                            ob0Var.c();
                            if (ob0Var.a()) {
                                org.telegram.ui.Components.wc.c0(LocaleController.getString(R.string.WalletTonConnectRequestUnavailable));
                                break;
                            }
                        }
                    } else {
                        ob0Var.c();
                        if (ob0Var.a()) {
                            ob0.d().g0(tL_error2, false);
                        }
                    }
                    break;
                } else {
                    ob0Var.c();
                    break;
                }
                break;
            case 3:
                Context context = (Context) obj4;
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj7;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj6;
                final Runnable runnable = (Runnable) obj5;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                String str4 = (String) obj2;
                if (a2Var != null) {
                    int i20 = a2Var.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = a2Var.a;
                    String str5 = a2Var.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != i16) {
                            l0Var2.g.s(a2Var);
                            break;
                        }
                    }
                    if (!"signData".equals(str5)) {
                        org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i16);
                        org.telegram.ui.Wallet.e2 e2Var2 = x9.g;
                        org.telegram.ui.Wallet.d2 d2Var = a2Var.f;
                        boolean equals = "signMessage".equals(str5);
                        final org.telegram.ui.Wallet.i2 i2Var = new org.telegram.ui.Wallet.i2(context, u6Var, new View[0]);
                        i2Var.s(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, u6Var));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                        y9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
                        TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                        if (webDocument != null) {
                            e2Var = e2Var2;
                            z10 = equals;
                            i10 = i16;
                            y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession2.manifest);
                        } else {
                            e2Var = e2Var2;
                            i10 = i16;
                            z10 = equals;
                        }
                        linearLayout.addView(y9Var, kb1.x(76, 76, 1, 0, 24, 0, 0));
                        TextView t10 = org.telegram.ui.Wallet.e2.t(20, context, LocaleController.formatSpannable(z10 ? R.string.WalletAppRequestsSignature : R.string.WalletAppRequestsTransfer, tonconnectsession2.manifest.name), u6Var);
                        t10.setTypeface(AndroidUtilities.bold());
                        linearLayout.addView(t10, kb1.o(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                        String hostAuthority = AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url);
                        if (!TextUtils.isEmpty(hostAuthority)) {
                            linearLayout.addView(org.telegram.ui.Wallet.e2.g(context, hostAuthority, u6Var), kb1.x(-2, -2, 1, 36, 6, 36, 12));
                        }
                        org.telegram.ui.Wallet.w5 w5Var = new org.telegram.ui.Wallet.w5(context, R.drawable.wallet_card_info, 24);
                        w5Var.getCardHolderView().setMaxLines(2);
                        w5Var.getCardHolderView().setSingleLine(false);
                        List<org.telegram.ui.Wallet.c2> list = d2Var.b;
                        long j10 = d2Var.c;
                        w5Var.setCardHolder(org.telegram.ui.Wallet.w7.Y(((org.telegram.ui.Wallet.c2) list.get(0)).a));
                        org.telegram.ui.Components.s6 balanceView = w5Var.getBalanceView();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        SpannableString spannableString = new SpannableString("GRAM");
                        spannableString.setSpan(new zq(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
                        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.o(-j10, true)).append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
                        balanceView.setText(spannableStringBuilder);
                        final int i21 = 0;
                        w5Var.getUsdBalanceView().setText(x9.m(j10, false));
                        linearLayout.addView(w5Var, kb1.r(-1, -2));
                        w5Var.setCardOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.i1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i21) {
                                    case 0:
                                        i2 i2Var2 = i2Var;
                                        fi.h1 h1Var = i2Var2.b;
                                        if (1 < i2Var2.c.size() && 1 != h1Var.getCurrentPosition()) {
                                            for (View view2 : h1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    AndroidUtilities.hideKeyboard(view2);
                                                }
                                            }
                                            h1Var.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        i2 i2Var3 = i2Var;
                                        fi.h1 h1Var2 = i2Var3.b;
                                        if (i2Var3.c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : h1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    AndroidUtilities.hideKeyboard(view3);
                                                }
                                            }
                                            h1Var2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Wallet.h2 h2Var = new org.telegram.ui.Wallet.h2(context);
                        h2Var.getContent().addView(linearLayout, kb1.g(-2.0f, -1));
                        i2Var.r(h2Var);
                        LinearLayout d = wh.d(context, 1);
                        LinearLayout d10 = wh.d(context, 0);
                        d.addView(d10, kb1.r(-1, 56));
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.ic_ab_back);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i22 = org.telegram.ui.ActionBar.y6.i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i22, u6Var), 1, -1);
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i22);
                        imageView.setBackground(g02);
                        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
                        int i23 = org.telegram.ui.ActionBar.y6.G6;
                        org.telegram.ui.ActionBar.f7.t(imageView, i23, u6Var, PorterDuff.Mode.SRC_IN);
                        kb1.b(imageView);
                        d10.addView(imageView, kb1.t(48, 48, 0.0f, 19, 4, 0, 0, 0));
                        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
                        y9Var2.setRoundRadius(AndroidUtilities.dp(22.0f));
                        TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                        if (webDocument2 != null) {
                            obj3 = null;
                            y9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "44_44", null, tonconnectsession2.manifest);
                        } else {
                            obj3 = null;
                        }
                        d10.addView(y9Var2, kb1.x(44, 44, 19, 12, 0, 11, 0));
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        d10.addView(linearLayout2, kb1.t(0, 44, 1.0f, 23, 0, 0, 12, 0));
                        TextView textView = new TextView(context);
                        textView.setTypeface(AndroidUtilities.bold());
                        org.telegram.ui.ActionBar.f7.V(textView, i23, u6Var);
                        textView.setTextSize(1, 18.0f);
                        linearLayout2.addView(textView, kb1.r(-1, -2));
                        textView.setText(LocaleController.getString(R.string.WalletConfirmAction));
                        if (TextUtils.isEmpty(hostAuthority)) {
                            i11 = 1;
                        } else {
                            TextView textView2 = new TextView(context);
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, u6Var);
                            i11 = 1;
                            textView2.setTextSize(1, 14.0f);
                            linearLayout2.addView(textView2, kb1.r(-1, -2));
                            textView2.setText(hostAuthority);
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.i1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i11) {
                                    case 0:
                                        i2 i2Var2 = i2Var;
                                        fi.h1 h1Var = i2Var2.b;
                                        if (1 < i2Var2.c.size() && 1 != h1Var.getCurrentPosition()) {
                                            for (View view2 : h1Var.getViewPages()) {
                                                if (view2 != null) {
                                                    AndroidUtilities.hideKeyboard(view2);
                                                }
                                            }
                                            h1Var.E(1);
                                            break;
                                        }
                                        break;
                                    default:
                                        i2 i2Var3 = i2Var;
                                        fi.h1 h1Var2 = i2Var3.b;
                                        if (i2Var3.c.size() > 0 && h1Var2.getCurrentPosition() != 0) {
                                            for (View view3 : h1Var2.getViewPages()) {
                                                if (view3 != null) {
                                                    AndroidUtilities.hideKeyboard(view3);
                                                }
                                            }
                                            h1Var2.E(0);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        linearLayout3.setOrientation(i11);
                        LinearLayout D = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletPreview), u6Var);
                        String A = org.telegram.ui.Wallet.e2.A(((org.telegram.ui.Wallet.c2) list.get(0)).a);
                        int i24 = R.drawable.mini_gram_24;
                        SpannableStringBuilder s10 = org.telegram.ui.Wallet.l0.s(j10, i11);
                        if (list.size() > i11) {
                            int i25 = R.string.WalletTransferToMultiple;
                            Integer valueOf = Integer.valueOf(list.size() - i11);
                            char c11 = i11;
                            c10 = 2;
                            Object[] objArr = new Object[2];
                            objArr[0] = A;
                            objArr[c11] = valueOf;
                            formatSpannable = LocaleController.formatSpannable(i25, objArr);
                        } else {
                            c10 = 2;
                            int i26 = R.string.WalletTransferTo;
                            Object[] objArr2 = new Object[i11];
                            objArr2[0] = A;
                            formatSpannable = LocaleController.formatSpannable(i26, objArr2);
                        }
                        D.addView(org.telegram.ui.Wallet.e2.b(context, i24, s10, formatSpannable, null, null, u6Var), kb1.r(-1, -2));
                        linearLayout3.addView(D, kb1.o(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                        LinearLayout D2 = org.telegram.ui.Wallet.e2.D(context, LocaleController.getString(R.string.WalletActions), u6Var);
                        for (org.telegram.ui.Wallet.c2 c2Var : list) {
                            int i27 = R.drawable.mini_gram_24;
                            String string = LocaleController.getString((c2Var.b == null || c2Var.d != null) ? R.string.WalletTransfer : R.string.WalletContractCall);
                            CharSequence formatSpannable2 = LocaleController.formatSpannable(R.string.WalletTransferTo, org.telegram.ui.Wallet.e2.A(c2Var.a));
                            String o10 = org.telegram.ui.Wallet.l0.o(-c2Var.e, true);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(o10);
                            int indexOf = o10.indexOf(46);
                            if (indexOf >= 0) {
                                l0Var = x9;
                                spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder2.length(), 33);
                            } else {
                                l0Var = x9;
                            }
                            if (spannableStringBuilder2.length() == 0 || spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) != 'x') {
                                spannableStringBuilder2.append((CharSequence) " x");
                            }
                            zq zqVar = new zq(R.drawable.wallet_gram_small, 2);
                            zqVar.recolorDrawable = false;
                            zqVar.setSize(AndroidUtilities.dp(16.0f));
                            spannableStringBuilder2.setSpan(zqVar, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                            D2.addView(org.telegram.ui.Wallet.e2.b(context, i27, string, formatSpannable2, spannableStringBuilder2, c2Var.d, u6Var), kb1.r(-1, -2));
                            x9 = l0Var;
                        }
                        org.telegram.ui.Wallet.l0 l0Var3 = x9;
                        linearLayout3.addView(D2, kb1.o(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                        dx dxVar = new dx(context, 3);
                        dxVar.setFillViewport(false);
                        dxVar.addView(linearLayout3);
                        d.addView(dxVar, kb1.r(-1, -2));
                        org.telegram.ui.Wallet.h2 h2Var2 = new org.telegram.ui.Wallet.h2(context);
                        h2Var2.getContent().addView(d, kb1.g(-2.0f, -1));
                        i2Var.r(h2Var2);
                        LinearLayout d11 = wh.d(context, 1);
                        TextView t11 = org.telegram.ui.Wallet.e2.t(14, context, null, u6Var);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" ");
                        spannableStringBuilder3.setSpan(new fa0(AndroidUtilities.dp(80.0f), t11), 0, spannableStringBuilder3.length(), 33);
                        t11.setText(LocaleController.formatSpannable(R.string.WalletFeeAmount, spannableStringBuilder3));
                        t11.setVisibility(z10 ? 8 : 0);
                        org.telegram.ui.ActionBar.f7.V(t11, org.telegram.ui.ActionBar.y6.z6, u6Var);
                        d11.addView(t11, kb1.o(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        fi.d dVar = new fi.d(context, u6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(LocaleController.getString(R.string.WalletDecline));
                        linearLayout4.addView(dVar, kb1.q(1.0f, 0, 44, 0, 6, 0));
                        fi.d f7 = wh.f(24, context, u6Var, true);
                        f7.setText(LocaleController.getString(z10 ? R.string.WalletSign : R.string.WalletConfirm));
                        f7.setEnabled(false);
                        linearLayout4.addView(f7, kb1.q(1.0f, 0, 44, 6, 0, 0));
                        d11.addView(linearLayout4);
                        i2Var.t(d11);
                        final int i28 = 1;
                        final int i29 = 0;
                        final boolean[] zArr = {false};
                        boolean[] zArr2 = {false};
                        final org.telegram.ui.Wallet.j1 j1Var = new org.telegram.ui.Wallet.j1(a2Var, zArr2, f7, dVar, e2Var, i2Var, zArr, u6Var);
                        f7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.k1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i29) {
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
                                switch (i28) {
                                    case 0:
                                        j1Var.run(Boolean.FALSE);
                                        break;
                                    default:
                                        j1Var.run(Boolean.TRUE);
                                        break;
                                }
                            }
                        });
                        final org.telegram.ui.Wallet.y1 y1Var = new org.telegram.ui.Wallet.y1(zArr, a2Var, i2Var, i28);
                        long j11 = i20;
                        long j12 = d2Var.a;
                        if (j12 == 0) {
                            j12 = Long.MAX_VALUE;
                        }
                        long max = Math.max(0L, Math.min(j11, j12) - ConnectionsManager.getInstance(i10).getCurrentTime()) * 1000;
                        a2Var.r = new org.telegram.ui.Wallet.m(i2Var, 5);
                        final int i30 = 0;
                        final org.telegram.ui.Wallet.e2 e2Var3 = e2Var;
                        i2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.l1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i30) {
                                    case 0:
                                        y1 y1Var2 = (y1) y1Var;
                                        zArr[0] = true;
                                        AndroidUtilities.cancelRunOnUIThread(y1Var2);
                                        e2Var3.s(a2Var);
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
                                        e2Var3.s(a2Var);
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
                        li.c cVar2 = new li.c(zArr, a2Var, zArr2, f7, z10, l0Var3, t11, i2Var, u6Var);
                        WalletEngine2 walletEngine2 = e2Var3.b.b;
                        if (!a2Var.n && !e2Var3.i(a2Var) && e2Var3.y(a2Var) && walletEngine2 != null) {
                            if ("signMessage".equals(str5)) {
                                walletEngine2.previewSignMessage(d2Var, new org.telegram.ui.Wallet.o(e2Var3, a2Var, cVar2, 1));
                                break;
                            } else {
                                walletEngine2.previewTonConnect(d2Var, new org.telegram.ui.Wallet.j(e2Var3, a2Var, cVar2, 9));
                                break;
                            }
                        } else {
                            cVar2.run(null, "Request expired, was processed, or the wallet changed");
                            break;
                        }
                    } else {
                        final org.telegram.ui.Wallet.e2 e2Var4 = org.telegram.ui.Wallet.l0.x(i16).g;
                        try {
                            JSONObject jSONObject = new JSONObject(a2Var.k);
                            boolean equals2 = "text".equals(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
                            org.telegram.ui.Wallet.i2 i2Var2 = new org.telegram.ui.Wallet.i2(context, u6Var, new View[0]);
                            i2Var2.s(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, u6Var));
                            LinearLayout linearLayout5 = new LinearLayout(context);
                            linearLayout5.setOrientation(1);
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setGravity(16);
                            ImageView imageView2 = new ImageView(context);
                            imageView2.setImageResource(R.drawable.ic_ab_close);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.G6, u6Var, PorterDuff.Mode.SRC_IN);
                            int i31 = org.telegram.ui.ActionBar.y6.i6;
                            org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i31, u6Var), 1, -1);
                            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i31);
                            imageView2.setBackground(g03);
                            org.telegram.ui.ActionBar.f7.k(imageView2, g03, null, N2, u6Var);
                            imageView2.setContentDescription(LocaleController.getString(R.string.Close));
                            imageView2.setOnClickListener(new zd0(23, a2Var, i2Var2));
                            linearLayout6.addView(imageView2, kb1.t(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            org.telegram.ui.Components.y9 y9Var3 = new org.telegram.ui.Components.y9(context);
                            y9Var3.setRoundRadius(AndroidUtilities.dp(22.0f));
                            TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                            if (webDocument3 != null) {
                                y9Var3.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout6.addView(y9Var3, kb1.t(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout7 = new LinearLayout(context);
                            linearLayout7.setOrientation(1);
                            TextView t12 = org.telegram.ui.Wallet.e2.t(18, context, LocaleController.getString(R.string.WalletSignData), u6Var);
                            t12.setTypeface(AndroidUtilities.bold());
                            t12.setGravity(3);
                            linearLayout7.addView(t12, kb1.r(-1, -2));
                            TextView t13 = org.telegram.ui.Wallet.e2.t(14, context, AndroidUtilities.getHostAuthority(tonconnectsession2.manifest.url), u6Var);
                            int i32 = org.telegram.ui.ActionBar.y6.z6;
                            org.telegram.ui.ActionBar.f7.V(t13, i32, u6Var);
                            t13.setGravity(3);
                            t13.setSingleLine(true);
                            t13.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout7.addView(t13, kb1.r(-1, -2));
                            linearLayout6.addView(linearLayout7, kb1.q(1.0f, 0, -2, 0, 16, 0));
                            linearLayout5.addView(linearLayout6, kb1.r(-1, 56));
                            LinearLayout linearLayout8 = new LinearLayout(context);
                            linearLayout8.setOrientation(1);
                            linearLayout8.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                            int dp = AndroidUtilities.dp(16.0f);
                            int i33 = org.telegram.ui.ActionBar.y6.d6;
                            Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i33, u6Var));
                            org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i33);
                            linearLayout8.setBackground(c02);
                            org.telegram.ui.ActionBar.f7.k(linearLayout8, c02, N3, null, u6Var);
                            TextView t14 = org.telegram.ui.Wallet.e2.t(equals2 ? 14 : 16, context, equals2 ? jSONObject.optString("text") : LocaleController.getString(R.string.WalletBinaryDataWarning), u6Var);
                            t14.setGravity(3);
                            t14.setTextIsSelectable(equals2);
                            if (equals2) {
                                TextView t15 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletSigningData), u6Var);
                                t15.setGravity(3);
                                t15.setTypeface(AndroidUtilities.bold());
                                org.telegram.ui.ActionBar.f7.V(t15, org.telegram.ui.ActionBar.y6.L6, u6Var);
                                linearLayout8.addView(t15, kb1.o(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                t14.setTypeface(Typeface.MONOSPACE);
                                i12 = -1;
                                i13 = -2;
                            } else {
                                LinearLayout linearLayout9 = new LinearLayout(context);
                                linearLayout9.setGravity(16);
                                TextView t16 = org.telegram.ui.Wallet.e2.t(12, context, "!", u6Var);
                                t16.setTypeface(AndroidUtilities.bold());
                                t16.setTextColor(-1);
                                int dp2 = AndroidUtilities.dp(8.0f);
                                int i34 = org.telegram.ui.ActionBar.y6.q7;
                                ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.w0(i34, u6Var));
                                org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i34);
                                t16.setBackground(c03);
                                org.telegram.ui.ActionBar.f7.k(t16, c03, N4, null, u6Var);
                                linearLayout9.addView(t16, kb1.t(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView t17 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletBinaryData), u6Var);
                                t17.setGravity(3);
                                t17.setTypeface(AndroidUtilities.bold());
                                i12 = -1;
                                i13 = -2;
                                linearLayout9.addView(t17, kb1.r(-1, -2));
                                linearLayout8.addView(linearLayout9, kb1.o(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout8.addView(t14, kb1.r(i12, i13));
                            if (equals2) {
                                t14.setOnClickListener(new org.telegram.ui.Wallet.m1(jSONObject, i2Var2, u6Var, 0));
                            }
                            dx dxVar2 = new dx(context, 2);
                            dxVar2.addView(linearLayout8);
                            linearLayout5.addView(dxVar2, kb1.o(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            org.telegram.ui.Wallet.h2 h2Var3 = new org.telegram.ui.Wallet.h2(context);
                            h2Var3.getContent().addView(linearLayout5, kb1.g(-2.0f, -1));
                            i2Var2.r(h2Var3);
                            LinearLayout d12 = wh.d(context, 1);
                            if (equals2) {
                                TextView t18 = org.telegram.ui.Wallet.e2.t(14, context, LocaleController.getString(R.string.WalletReviewSigningData), u6Var);
                                t18.setGravity(3);
                                org.telegram.ui.ActionBar.f7.V(t18, i32, u6Var);
                                d12.addView(t18, kb1.o(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout10 = new LinearLayout(context);
                            linearLayout10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                            fi.d dVar2 = new fi.d(context, u6Var, true);
                            dVar2.setRoundRadius(24);
                            dVar2.e();
                            dVar2.setText(LocaleController.getString(R.string.Cancel));
                            fi.d dVar3 = new fi.d(context, u6Var, true);
                            dVar3.setRoundRadius(24);
                            dVar3.setText(LocaleController.getString(R.string.WalletSign));
                            dVar3.setEnabled(false);
                            linearLayout10.addView(dVar2, kb1.q(1.0f, 0, 44, 0, 6, 0));
                            linearLayout10.addView(dVar3, kb1.q(1.0f, 0, 44, 6, 0, 0));
                            d12.addView(linearLayout10);
                            i2Var2.t(d12);
                            int i35 = 2;
                            i2Var2.setDelegate(new org.telegram.ui.h0(a2Var, i35));
                            org.telegram.ui.Wallet.h hVar = new org.telegram.ui.Wallet.h(dxVar2, a2Var, dVar3, i35);
                            final int i36 = 0;
                            dxVar2.getViewTreeObserver().addOnScrollChangedListener(new org.telegram.ui.Wallet.n1(hVar, i36));
                            dxVar2.getViewTreeObserver().addOnGlobalLayoutListener(new org.telegram.ui.Wallet.o1(hVar, i36));
                            final org.telegram.ui.Wallet.p1 p1Var = new org.telegram.ui.Wallet.p1(dVar3, dVar2, e2Var4, a2Var, i2Var2, u6Var, hVar);
                            dVar3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i36) {
                                        case 0:
                                            p1Var.run(Boolean.FALSE);
                                            break;
                                        default:
                                            p1Var.run(Boolean.TRUE);
                                            break;
                                    }
                                }
                            });
                            final int i37 = 1;
                            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i37) {
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
                            final org.telegram.ui.Wallet.y1 y1Var2 = new org.telegram.ui.Wallet.y1(zArr3, a2Var, i2Var2, i36);
                            a2Var.r = new org.telegram.ui.Wallet.m(i2Var2, 5);
                            final int i38 = 1;
                            i2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.l1
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i38) {
                                        case 0:
                                            y1 y1Var22 = (y1) y1Var2;
                                            zArr3[0] = true;
                                            AndroidUtilities.cancelRunOnUIThread(y1Var22);
                                            e2Var4.s(a2Var);
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
                                            e2Var4.s(a2Var);
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
                            AndroidUtilities.runOnUIThread(y1Var2, Math.max(0L, i20 - e2Var4.f.getCurrentTime()) * 1000);
                            break;
                        } catch (JSONException e) {
                            e2Var4.s(a2Var);
                            org.telegram.ui.Components.wc.c0(org.telegram.ui.Wallet.e2.h("display signing data", e));
                            return;
                        }
                    }
                } else if (str4 != null) {
                    org.telegram.ui.Components.wc.c0(str4);
                    break;
                }
                break;
            default:
                fi.d dVar4 = (fi.d) obj7;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj6;
                View view = (View) obj5;
                a8.me meVar = (a8.me) obj4;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dVar4.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0("NO_TOKEN", false);
                        break;
                    } else {
                        int currentDatacenterId = ConnectionsManager.getInstance(i16).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i16).isTestBackend();
                        StringBuilder n10 = c3.h0.n("wear-auth: sending /token account=", i16, " dcId=", currentDatacenterId, " isTest=");
                        n10.append(isTestBackend);
                        FileLog.d(n10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c12 = ki1.c(meVar, queryParameter, currentDatacenterId, isTestBackend);
                            a6.a aVar = new a6.a(applicationContext, com.google.android.gms.common.api.i.c);
                            String str6 = (String) meVar.c;
                            com.google.android.gms.common.api.internal.s0 s0Var = aVar.h;
                            c8.e eVar = new c8.e(s0Var, str6, "/tg-wear-auth/token", c12);
                            s0Var.b.d(0, eVar);
                            o6.l.n(eVar, z8.k0.a).addOnSuccessListener(new bh1(i15, meVar, dVar4)).addOnFailureListener(new ii1(dVar4, i17));
                            k3Var.dismiss();
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0(e10.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error3 != null) {
                    org.telegram.ui.d3.t(k3Var.topBulletinContainer, k3Var.getResourcesProvider(), tL_error3, false);
                    break;
                } else {
                    new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0("NO_TOKEN", false);
                    break;
                }
        }
    }

    public /* synthetic */ kh(fi.d dVar, org.telegram.ui.ActionBar.k3 k3Var, int i10, View view, a8.me meVar) {
        this.a = 4;
        this.c = dVar;
        this.d = k3Var;
        this.b = i10;
        this.e = view;
        this.f = meVar;
    }

    public /* synthetic */ kh(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ kh(LaunchActivity launchActivity, qf.c cVar, MessagesController messagesController, int i10, TLRPC.User user) {
        this.a = 1;
        this.c = launchActivity;
        this.d = cVar;
        this.e = messagesController;
        this.b = i10;
        this.f = user;
    }
}
