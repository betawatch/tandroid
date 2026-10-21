package org.telegram.ui.Wallet;

import ai.xb;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.gh;
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.cf0;
import org.telegram.ui.eb0;
import org.telegram.ui.l80;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class f2 {
    public final int a;
    public final m0 b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public b2 g;
    public boolean h;

    public f2(m0 m0Var) {
        this.e = -1;
        int i10 = m0Var.a;
        this.a = i10;
        this.b = m0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new org.telegram.messenger.a(), new d(this, 4));
    }

    public static String A(String str) {
        if (TextUtils.isEmpty(str)) {
            return LocaleController.getString(R.string.WalletUnknownAddress);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.messenger.NotificationCenter$NotificationCenterDelegate, org.telegram.ui.Wallet.e1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k2 B(Context context, final int i10, final a2 a2Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final org.telegram.ui.ActionBar.d6 d6Var, final l80 l80Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        ImageView imageView;
        boolean z10;
        String hostAuthority;
        String string;
        x5 x5Var;
        m0 m0Var;
        int i11;
        final m0 w9 = m0.w(i10);
        boolean z11 = tL_urlAuthResultRequest != null;
        final TL_wallet.tonConnectSession tonconnectsession = z11 ? null : a2Var.e;
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
        LinearLayout e = mk.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), 1, -1));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), PorterDuff.Mode.SRC_IN));
        w7.b6.a(imageView2);
        frameLayout.addView(imageView2, w7.z5.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
        if (z11) {
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            h9Var.r(tL_urlAuthResultRequest.bot);
            w9Var.e(tL_urlAuthResultRequest.bot, h9Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                imageView = imageView2;
                z10 = z11;
                w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession.manifest);
                frameLayout.addView(w9Var, w7.z5.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
                e.addView(frameLayout, w7.z5.n(-1, -2));
                TextView textView = new TextView(context);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                if (z10) {
                    TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
                    if (tonconnectmanifest2 != null) {
                        textView.setText(LocaleController.formatSpannable(R.string.WalletConnectToApp, tonconnectmanifest2.name));
                    } else {
                        textView.setText(LocaleController.getString(R.string.WalletConnectToDApp));
                    }
                } else {
                    textView.setText(LocaleController.formatSpannable(R.string.WalletConnectToApp, UserObject.getUserName(tL_urlAuthResultRequest.bot)));
                }
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
                e.addView(textView, w7.z5.t(-2, -2, 49, 36, 16, 36, 0));
                hostAuthority = !z10 ? tL_urlAuthResultRequest.domain : AndroidUtilities.getHostAuthority(a2Var.b);
                if (!TextUtils.isEmpty(hostAuthority)) {
                    e.addView(g(context, hostAuthority, d6Var), w7.z5.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                if (!z10) {
                    w9.g.getClass();
                    if (!u(a2Var)) {
                        string = LocaleController.getString(R.string.WalletConnectInfo);
                        textView2.setText(string);
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
                        e.addView(textView2, w7.z5.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        e.addView(frameLayout2, w7.z5.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        x5Var = new x5(context, R.drawable.wallet_card_qr, 46);
                        x5Var.l(w9);
                        if (x5Var.isAttachedToWindow() && (m0Var = x5Var.W) != null && ((i11 = x5Var.V) != i10 || m0Var != w9)) {
                            NotificationCenter.getInstance(i11).removeObserver(x5Var, NotificationCenter.walletUpdate);
                        }
                        x5Var.V = i10;
                        x5Var.W = w9;
                        if (x5Var.isAttachedToWindow() && x5Var.W != null) {
                            NotificationCenter.getInstance(i10).addObserver(x5Var, NotificationCenter.walletUpdate);
                        }
                        frameLayout2.addView(x5Var);
                        TextView textView3 = new TextView(context);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setText(LocaleController.getString(R.string.WalletConnectPermissionInfo));
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
                        e.addView(textView3, w7.z5.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                        e.addView(linearLayout, w7.z5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final ei.d dVar = new ei.d(context, d6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.d();
                        dVar.setText(LocaleController.getString(R.string.WalletCancel));
                        linearLayout.addView(dVar, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                        final ei.d f7 = mk.f(24, context, d6Var, true);
                        f7.setText(LocaleController.getString(R.string.WalletConnect));
                        linearLayout.addView(f7, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                        final k2 k2Var = new k2(context, e, d6Var);
                        k2Var.setDelegate(new y1(f7));
                        final ImageView imageView3 = imageView;
                        final boolean z12 = z10;
                        final hg.x0 x0Var = new hg.x0(z12, f7, w9, tonconnectsession, a2Var, textView, w9Var, textView2);
                        final ?? r42 = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.e1
                            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                            public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                                if (!z12 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession2.id == tonconnectsession.id) {
                                            a2Var.e = tonconnectsession2;
                                        }
                                    }
                                }
                                x0Var.run();
                            }
                        };
                        NotificationCenter.getInstance(i10).addObserver(r42, NotificationCenter.walletUpdate);
                        x0Var.run();
                        final boolean[] zArr = {false};
                        final boolean z13 = z10;
                        k2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.f1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                                NotificationCenter.getInstance(i10).removeObserver(r42, NotificationCenter.walletUpdate);
                                boolean[] zArr2 = zArr;
                                if (zArr2[0]) {
                                    return;
                                }
                                zArr2[0] = true;
                                if (!z13 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0]) == null) {
                                    runnable.run();
                                } else {
                                    l80Var.run(inputtonconnectoauthsession);
                                }
                            }
                        });
                        k2Var.show();
                        imageView3.setOnClickListener(new g1(k2Var, 0));
                        dVar.setOnClickListener(new cf0(21, f7, k2Var));
                        f7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                m0 m0Var2 = w9;
                                f2 f2Var = m0Var2.g;
                                ei.d dVar2 = ei.d.this;
                                if (dVar2.N) {
                                    return;
                                }
                                dVar2.setLoading(true);
                                ei.d dVar3 = dVar;
                                dVar3.setEnabled(false);
                                ImageView imageView4 = imageView3;
                                imageView4.setEnabled(false);
                                l80 l80Var2 = new l80(dVar2, dVar3, imageView4, k2Var, d6Var, x0Var, 3);
                                if (!z13) {
                                    f2Var.getClass();
                                    AndroidUtilities.runOnUIThread(new h(f2Var, a2Var, l80Var2, 3));
                                    return;
                                }
                                String s10 = m0Var2.s();
                                byte[] x10 = m0Var2.x();
                                byte[] bArr = x10 == null ? null : (byte[]) x10.clone();
                                s1 s1Var = new s1(0, inputtonconnectoauthsessionArr, l80Var2);
                                f2Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || s10 == null || bArr == null) {
                                    s1Var.run(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = a1.g.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    f2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new i1(f2Var, s1Var, tL_urlAuthResultRequest2, s10, bArr, put, 2));
                                } catch (JSONException e7) {
                                    s1Var.run(null, f2.h("prepare OAuth request", e7));
                                }
                            }
                        });
                        return k2Var;
                    }
                }
                string = LocaleController.getString(R.string.WalletConnectProofInfo);
                textView2.setText(string);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
                e.addView(textView2, w7.z5.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                e.addView(frameLayout22, w7.z5.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                x5Var = new x5(context, R.drawable.wallet_card_qr, 46);
                x5Var.l(w9);
                if (x5Var.isAttachedToWindow()) {
                    NotificationCenter.getInstance(i11).removeObserver(x5Var, NotificationCenter.walletUpdate);
                }
                x5Var.V = i10;
                x5Var.W = w9;
                if (x5Var.isAttachedToWindow()) {
                    NotificationCenter.getInstance(i10).addObserver(x5Var, NotificationCenter.walletUpdate);
                }
                frameLayout22.addView(x5Var);
                TextView textView32 = new TextView(context);
                textView32.setTextSize(1, 14.0f);
                textView32.setGravity(17);
                textView32.setText(LocaleController.getString(R.string.WalletConnectPermissionInfo));
                textView32.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
                e.addView(textView32, w7.z5.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                e.addView(linearLayout2, w7.z5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final ei.d dVar2 = new ei.d(context, d6Var, true);
                dVar2.setRoundRadius(24);
                dVar2.d();
                dVar2.setText(LocaleController.getString(R.string.WalletCancel));
                linearLayout2.addView(dVar2, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
                final ei.d f72 = mk.f(24, context, d6Var, true);
                f72.setText(LocaleController.getString(R.string.WalletConnect));
                linearLayout2.addView(f72, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
                final k2 k2Var2 = new k2(context, e, d6Var);
                k2Var2.setDelegate(new y1(f72));
                final ImageView imageView32 = imageView;
                final boolean z122 = z10;
                final hg.x0 x0Var2 = new hg.x0(z122, f72, w9, tonconnectsession, a2Var, textView, w9Var, textView2);
                final e1 r422 = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.e1
                    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                    public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                        if (!z122 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession2.id == tonconnectsession.id) {
                                    a2Var.e = tonconnectsession2;
                                }
                            }
                        }
                        x0Var2.run();
                    }
                };
                NotificationCenter.getInstance(i10).addObserver(r422, NotificationCenter.walletUpdate);
                x0Var2.run();
                final boolean[] zArr2 = {false};
                final boolean z132 = z10;
                k2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.f1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                        NotificationCenter.getInstance(i10).removeObserver(r422, NotificationCenter.walletUpdate);
                        boolean[] zArr22 = zArr2;
                        if (zArr22[0]) {
                            return;
                        }
                        zArr22[0] = true;
                        if (!z132 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0]) == null) {
                            runnable.run();
                        } else {
                            l80Var.run(inputtonconnectoauthsession);
                        }
                    }
                });
                k2Var2.show();
                imageView32.setOnClickListener(new g1(k2Var2, 0));
                dVar2.setOnClickListener(new cf0(21, f72, k2Var2));
                f72.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m0 m0Var2 = w9;
                        f2 f2Var = m0Var2.g;
                        ei.d dVar22 = ei.d.this;
                        if (dVar22.N) {
                            return;
                        }
                        dVar22.setLoading(true);
                        ei.d dVar3 = dVar2;
                        dVar3.setEnabled(false);
                        ImageView imageView4 = imageView32;
                        imageView4.setEnabled(false);
                        l80 l80Var2 = new l80(dVar22, dVar3, imageView4, k2Var2, d6Var, x0Var2, 3);
                        if (!z132) {
                            f2Var.getClass();
                            AndroidUtilities.runOnUIThread(new h(f2Var, a2Var, l80Var2, 3));
                            return;
                        }
                        String s10 = m0Var2.s();
                        byte[] x10 = m0Var2.x();
                        byte[] bArr = x10 == null ? null : (byte[]) x10.clone();
                        s1 s1Var = new s1(0, inputtonconnectoauthsessionArr, l80Var2);
                        f2Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || s10 == null || bArr == null) {
                            s1Var.run(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = a1.g.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            f2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new i1(f2Var, s1Var, tL_urlAuthResultRequest2, s10, bArr, put, 2));
                        } catch (JSONException e7) {
                            s1Var.run(null, f2.h("prepare OAuth request", e7));
                        }
                    }
                });
                return k2Var2;
            }
        }
        imageView = imageView2;
        z10 = z11;
        frameLayout.addView(w9Var, w7.z5.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
        e.addView(frameLayout, w7.z5.n(-1, -2));
        TextView textView4 = new TextView(context);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        if (z10) {
        }
        textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        e.addView(textView4, w7.z5.t(-2, -2, 49, 36, 16, 36, 0));
        if (!z10) {
        }
        if (!TextUtils.isEmpty(hostAuthority)) {
        }
        TextView textView22 = new TextView(context);
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        if (!z10) {
        }
        string = LocaleController.getString(R.string.WalletConnectProofInfo);
        textView22.setText(string);
        textView22.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        e.addView(textView22, w7.z5.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        e.addView(frameLayout222, w7.z5.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        x5Var = new x5(context, R.drawable.wallet_card_qr, 46);
        x5Var.l(w9);
        if (x5Var.isAttachedToWindow()) {
        }
        x5Var.V = i10;
        x5Var.W = w9;
        if (x5Var.isAttachedToWindow()) {
        }
        frameLayout222.addView(x5Var);
        TextView textView322 = new TextView(context);
        textView322.setTextSize(1, 14.0f);
        textView322.setGravity(17);
        textView322.setText(LocaleController.getString(R.string.WalletConnectPermissionInfo));
        textView322.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        e.addView(textView322, w7.z5.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        e.addView(linearLayout22, w7.z5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final ei.d dVar22 = new ei.d(context, d6Var, true);
        dVar22.setRoundRadius(24);
        dVar22.d();
        dVar22.setText(LocaleController.getString(R.string.WalletCancel));
        linearLayout22.addView(dVar22, w7.z5.m(1.0f, 0, 44, 0, 6, 0));
        final ei.d f722 = mk.f(24, context, d6Var, true);
        f722.setText(LocaleController.getString(R.string.WalletConnect));
        linearLayout22.addView(f722, w7.z5.m(1.0f, 0, 44, 6, 0, 0));
        final k2 k2Var22 = new k2(context, e, d6Var);
        k2Var22.setDelegate(new y1(f722));
        final ImageView imageView322 = imageView;
        final boolean z1222 = z10;
        final hg.x0 x0Var22 = new hg.x0(z1222, f722, w9, tonconnectsession, a2Var, textView4, w9Var, textView22);
        final e1 r4222 = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.e1
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                if (!z1222 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            a2Var.e = tonconnectsession2;
                        }
                    }
                }
                x0Var22.run();
            }
        };
        NotificationCenter.getInstance(i10).addObserver(r4222, NotificationCenter.walletUpdate);
        x0Var22.run();
        final boolean[] zArr22 = {false};
        final boolean z1322 = z10;
        k2Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.f1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                NotificationCenter.getInstance(i10).removeObserver(r4222, NotificationCenter.walletUpdate);
                boolean[] zArr222 = zArr22;
                if (zArr222[0]) {
                    return;
                }
                zArr222[0] = true;
                if (!z1322 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0]) == null) {
                    runnable.run();
                } else {
                    l80Var.run(inputtonconnectoauthsession);
                }
            }
        });
        k2Var22.show();
        imageView322.setOnClickListener(new g1(k2Var22, 0));
        dVar22.setOnClickListener(new cf0(21, f722, k2Var22));
        f722.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m0 m0Var2 = w9;
                f2 f2Var = m0Var2.g;
                ei.d dVar222 = ei.d.this;
                if (dVar222.N) {
                    return;
                }
                dVar222.setLoading(true);
                ei.d dVar3 = dVar22;
                dVar3.setEnabled(false);
                ImageView imageView4 = imageView322;
                imageView4.setEnabled(false);
                l80 l80Var2 = new l80(dVar222, dVar3, imageView4, k2Var22, d6Var, x0Var22, 3);
                if (!z1322) {
                    f2Var.getClass();
                    AndroidUtilities.runOnUIThread(new h(f2Var, a2Var, l80Var2, 3));
                    return;
                }
                String s10 = m0Var2.s();
                byte[] x10 = m0Var2.x();
                byte[] bArr = x10 == null ? null : (byte[]) x10.clone();
                s1 s1Var = new s1(0, inputtonconnectoauthsessionArr, l80Var2);
                f2Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || s10 == null || bArr == null) {
                    s1Var.run(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = a1.g.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    f2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new i1(f2Var, s1Var, tL_urlAuthResultRequest2, s10, bArr, put, 2));
                } catch (JSONException e7) {
                    s1Var.run(null, f2.h("prepare OAuth request", e7));
                }
            }
        });
        return k2Var22;
    }

    public static LinearLayout D(Context context, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        LinearLayout e = mk.e(context, 1);
        e.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var)));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, d6Var);
        l4Var.setText(str);
        e.addView(l4Var, w7.z5.n(-1, -2));
        return e;
    }

    public static void E(String str, JSONObject jSONObject) {
        F(str, jSONObject);
        switch (v(TeXSymbolParser.TYPE_ATTR, jSONObject)) {
            case "binary":
                String v = v("bytes", jSONObject);
                if (!v.matches("[A-Za-z0-9+/]*={0,2}") || !Base64.encodeToString(Base64.decode(v, 2), 2).replace("=", "").equals(v.replace("=", ""))) {
                    throw new IllegalArgumentException("Invalid base64 data");
                }
                return;
            case "cell":
                v("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(v("cell", jSONObject))) {
                    throw new IllegalArgumentException("Invalid data cell");
                }
                return;
            case "text":
                v("text", jSONObject);
                return;
            default:
                throw new IllegalArgumentException("Unknown signing data type");
        }
    }

    public static void F(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(v("network", jSONObject))) {
            throw new IllegalArgumentException("Wrong network");
        }
        if (jSONObject.has("from") && !WalletEngine2.sameTonConnectAddress(v("from", jSONObject), str)) {
            throw new IllegalArgumentException("Wrong signer");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r0.longValue() <= 4294967295L) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G(JSONObject jSONObject, String str, int i10) {
        F(str, jSONObject);
        if (jSONObject.has("valid_until")) {
            Object obj = jSONObject.get("valid_until");
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() == number.longValue()) {
                    if (number.longValue() > i10) {
                    }
                }
            }
            throw new IllegalArgumentException("Invalid or expired transaction");
        }
        if (jSONObject.has("items")) {
            throw new IllegalArgumentException("Structured transactions are not supported");
        }
        long optLong = jSONObject.optLong("valid_until", 0L);
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        long j10 = 0;
        while (i11 < jSONArray.length()) {
            d2 d2Var = new d2(jSONArray.getJSONObject(i11));
            long j11 = d2Var.e;
            long j12 = j10 + j11;
            if (!((j11 ^ j10) < 0) && !((j10 ^ j12) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(d2Var);
            i11++;
            j10 = j12;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ void a(f2 f2Var, TL_wallet.tonConnectSession tonconnectsession, String str, l lVar) {
        if (f2Var.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(f2Var.d, new b1(tonconnectsession, 0));
                f2Var.b.J();
            }
            lVar.run(str);
        }
    }

    public static LinearLayout b(Context context, int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(i10);
        imageView.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        linearLayout.addView(imageView, w7.z5.p(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity((charSequence2 == null && str == null) ? 16 : 48);
        TextView textView = new TextView(context);
        mk.k(16.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView.setSingleLine(charSequence2 != null);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams q6 = charSequence2 == null ? w7.z5.q(-1, AndroidUtilities.dp(24.0f), 16) : w7.z5.n(-1, -2);
        q6.weight = 0.0f;
        linearLayout2.addView(textView, q6);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView f7 = org.telegram.messenger.g0.f(context, 1, 14.0f);
            f7.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
            f7.setSingleLine(true);
            f7.setEllipsize(TextUtils.TruncateAt.END);
            f7.setText(charSequence2);
            linearLayout2.addView(f7, w7.z5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, false, false, null);
            f5Var.x = false;
            f5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.jl, d6Var));
            textView2.setBackground(f5Var);
            textView2.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, w7.z5.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, w7.z5.o(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            textView3.setTextColor(spannableStringBuilder.toString().startsWith("+") ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, d6Var) : org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
            linearLayout.addView(textView3, w7.z5.p(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject f(j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i10) {
        if (tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Missing registered session key");
        }
        JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(j0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
        Object obj = jSONObject.get("id");
        if (!(obj instanceof String) || !((String) obj).matches("[\\x20-\\x7e]{1,100}")) {
            throw new IllegalArgumentException("Request ID must contain 1–100 printable ASCII characters");
        }
        try {
            String string = jSONObject.getString("method");
            JSONArray jSONArray = jSONObject.getJSONArray("params");
            if (!"disconnect".equals(string)) {
                if (!"sendTransaction".equals(string) && !"signMessage".equals(string)) {
                    if (!"signData".equals(string)) {
                        jSONObject.put("errorCode", 400).put("errorMessage", "Method is not supported");
                    } else {
                        if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                            throw new IllegalArgumentException("Expected one JSON data parameter");
                        }
                        JSONObject jSONObject2 = new JSONObject(jSONArray.getString(0));
                        E(str, jSONObject2);
                        jSONObject.put("data", jSONObject2);
                    }
                }
                if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                    throw new IllegalArgumentException("Expected one JSON transaction parameter");
                }
                JSONObject jSONObject3 = new JSONObject(jSONArray.getString(0));
                G(jSONObject3, str, i10);
                jSONObject.put("transaction", jSONObject3);
            } else if (jSONArray.length() != 0) {
                throw new IllegalArgumentException("Disconnect takes no parameters");
            }
        } catch (Exception e) {
            jSONObject.put("errorCode", 1).put("errorMessage", e.getMessage());
        }
        if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
            jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
        }
        return jSONObject;
    }

    public static TextView g(Context context, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        TextView textView = new TextView(context);
        mk.k(14.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String h(String str, Exception exc) {
        FileLog.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }

    public static String j(long j10, long j11) {
        StringBuilder t10 = a1.g.t(j10, "tonconnect_reply.", ".");
        t10.append(j11);
        return t10.toString();
    }

    public static void k(String str, String str2) {
        if (str2 != null) {
            FileLog.e("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String l(String str) {
        URI create = URI.create(str);
        if (!"https".equalsIgnoreCase(create.getScheme()) || create.getHost() == null) {
            throw new IllegalArgumentException("Manifest URL must use HTTPS and include a host");
        }
        return create.getHost().toLowerCase(Locale.ROOT);
    }

    public static void o(Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.d6 d6Var, eb0 eb0Var) {
        m0 w9 = m0.w(i10);
        f2 f2Var = w9.g;
        gh ghVar = new gh(context, i10, w9, d6Var, eb0Var);
        if (f2Var.h || f2Var.g != null) {
            ghVar.run(null, "A TON Connect request is already open");
            return;
        }
        String string = MessagesController.getMainSettings(f2Var.a).getString(j(j10, i11), null);
        if (string == null) {
            f2Var.h = true;
            f2Var.b.j0(new xb(f2Var, j10, ghVar, i11, 17));
            return;
        }
        f2Var.h = true;
        x xVar = new x(1, f2Var, ghVar);
        try {
            f2Var.C(j10, i11, new JSONObject(string), xVar);
        } catch (Exception e) {
            xVar.run(h("restore response", e));
        }
    }

    public static c2 p(j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            throw new IllegalArgumentException("Manifest URL changed");
        }
        String l4 = l(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest == null || !l4.equals(l(tonconnectmanifest.url))) {
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        return q(j0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), l4, str4, tonconnectchallenge, i10);
    }

    public static c2 q(j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject;
        String str4;
        int i11;
        String str5;
        String str6;
        j0 j0Var2 = j0Var;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.length() == 0) {
            throw new IllegalArgumentException("Empty connect request");
        }
        String str7 = "account";
        JSONObject put = new JSONObject().put("account", tonconnectchallenge != null);
        HashSet hashSet = new HashSet();
        int i12 = 0;
        while (true) {
            String str8 = "ton_proof";
            String str9 = "ton_addr";
            if (i12 >= jSONArray2.length()) {
                if (!hashSet.contains("ton_addr")) {
                    throw new IllegalArgumentException("Missing ton_addr item");
                }
                if (tonconnectchallenge != null) {
                    put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                }
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(j0Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new c2(jSONObject2);
                }
                if (tonconnectchallenge.event_id < 0) {
                    throw new IllegalArgumentException("Invalid connect event ID");
                }
                JSONArray jSONArray3 = new JSONArray();
                TL_wallet.walletOwnershipProof walletownershipproof = null;
                int i13 = 0;
                while (i13 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i13);
                    String string = jSONObject3.getString("name");
                    if (str9.equals(string)) {
                        jSONArray3.put(jSONObject2.getJSONObject(str7));
                        jSONObject = jSONObject2;
                        str4 = str7;
                        i11 = i13;
                        str5 = str8;
                        str6 = str9;
                    } else if (str8.equals(string)) {
                        String string2 = jSONObject3.getString("payload");
                        str4 = str7;
                        i11 = i13;
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(j0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i10));
                        str5 = str8;
                        TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                        walletownershipproof2.timestamp = i10;
                        str6 = str9;
                        jSONObject = jSONObject2;
                        walletownershipproof2.signature = Base64.decode(jSONObject4.getString("signature"), 2);
                        jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i10).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject4.getString("signature"))));
                        walletownershipproof = walletownershipproof2;
                    } else {
                        jSONObject = jSONObject2;
                        str4 = str7;
                        i11 = i13;
                        str5 = str8;
                        str6 = str9;
                        jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                    }
                    i13 = i11 + 1;
                    j0Var2 = j0Var;
                    jSONArray2 = jSONArray;
                    str7 = str4;
                    str8 = str5;
                    str9 = str6;
                    jSONObject2 = jSONObject;
                }
                JSONObject jSONObject5 = jSONObject2;
                JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", BuildVars.BUILD_VERSION_STRING).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", 255)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", 255)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                if (str3 != null) {
                    put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                }
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(j0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                c2 c2Var = new c2(jSONObject6);
                c2Var.d = walletownershipproof;
                return c2Var;
            }
            JSONObject jSONObject7 = jSONArray2.getJSONObject(i12);
            int i14 = i12;
            if (!hashSet.add(jSONObject7.getString("name"))) {
                throw new IllegalArgumentException("Duplicate connect item");
            }
            if ("ton_addr".equals(jSONObject7.getString("name")) && jSONObject7.has("network") && !"-239".equals(jSONObject7.getString("network"))) {
                throw new IllegalArgumentException("Requested network does not match the wallet network");
            }
            if ("ton_proof".equals(jSONObject7.getString("name"))) {
                if (str2.replaceFirst("\\.$", "").equals("telegram.org")) {
                    throw new IllegalArgumentException("The telegram.org proof domain is reserved for wallet import");
                }
                jSONObject7.getString("payload");
            }
            i12 = i14 + 1;
        }
    }

    public static c2 r(j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j10) {
        if (j10 < 0 || tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Invalid disconnect session or event ID");
        }
        return new c2(WalletEngine2.tonConnectCrypto(j0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j10).put("payload", new JSONObject()))));
    }

    public static TextView t(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.d6 d6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i10);
        org.telegram.ui.Cells.c1.q(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 17);
        return textView;
    }

    public static boolean u(a2 a2Var) {
        if (a2Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(a2Var.a).getJSONArray("items");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i10).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                h("read proof request", e);
            }
        }
        return false;
    }

    public static String v(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException(str.concat(" must be a string"));
    }

    public static String x(TLRPC.TL_error tL_error, String str) {
        String str2;
        String n10;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder v = a1.g.v("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            n10 = "";
        } else {
            n10 = a1.g.n(tL_error.code, " ", new StringBuilder("code="));
        }
        v.append(n10);
        v.append(str2);
        FileLog.e(v.toString());
        return str2;
    }

    public final void C(long j10, int i10, JSONObject jSONObject, Utilities.Callback callback) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j10;
        tonconnectsubmitresponse.msg_id = i10;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new org.telegram.messenger.a(), new org.telegram.ui.Components.a3(this, callback, jSONObject, j10, i10));
    }

    public final boolean c(a2 a2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = a2Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(a2Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = a2Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(a2Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        m0 m0Var = this.b;
        return str.equals(m0Var.s()) && Arrays.equals(bArr, m0Var.x());
    }

    public final void d(long j10, int i10, Utilities.Callback callback) {
        long j11 = i10;
        MessagesController.getMainSettings(this.a).edit().remove(j(j10, j11)).remove(j(j10, j11) + ".transfer").apply();
        b2 b2Var = this.g;
        if (b2Var != null && b2Var.a.id == j10 && b2Var.b == i10) {
            b2Var.n = true;
        }
        callback.run(null);
    }

    public final void e(b2 b2Var, boolean z10, Utilities.Callback callback) {
        boolean z11 = b2Var.m;
        TL_wallet.tonConnectSession tonconnectsession = b2Var.a;
        if (z11) {
            return;
        }
        if (b2Var.n || i(b2Var) || !y(b2Var) || !(z10 || b2Var.l >= 0 || "disconnect".equals(b2Var.e) || b2Var.p)) {
            callback.run("Request expired, was processed, or the wallet changed");
            return;
        }
        b2Var.m = true;
        p pVar = new p(this, b2Var, callback, 2);
        String string = MessagesController.getMainSettings(this.a).getString(j(tonconnectsession.id, b2Var.b), null);
        if (string == null) {
            this.b.y(new w(this, pVar, b2Var, z10, 1), true, false);
            return;
        }
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            C(tonconnectsession.id, b2Var.b, new JSONObject(string), pVar);
        } catch (Exception e7) {
            e = e7;
            pVar = pVar;
            pVar.run(h("restore response", e));
        }
    }

    public final boolean i(b2 b2Var) {
        long currentTime = this.f.getCurrentTime();
        if (b2Var.c <= currentTime) {
            return true;
        }
        e2 e2Var = b2Var.f;
        if (e2Var == null) {
            return false;
        }
        long j10 = e2Var.a;
        return j10 != 0 && j10 <= currentTime;
    }

    public final void m(int i10, long j10) {
        b2 b2Var = this.g;
        if (b2Var == null || b2Var.a.id != j10 || b2Var.b != i10 || b2Var.m) {
            return;
        }
        b2Var.n = true;
        Runnable runnable = b2Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void n(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        b1 b1Var = new b1(tonconnectsession, 1);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, b1Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        b2 b2Var = this.g;
        if (b2Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = b2Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                b2Var.q = true;
                m(b2Var.b, tonconnectsession.id);
            }
        }
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this.b, tonconnectsession);
    }

    public final void s(b2 b2Var) {
        b2Var.r = null;
        if (b2Var.m || this.g != b2Var) {
            return;
        }
        this.g = null;
    }

    public final void w(b2 b2Var, j0 j0Var, Object obj, int i10, String str, Utilities.Callback callback) {
        Utilities.globalQueue.postRunnable(new hg.d1(this, b2Var, i10, obj, str, j0Var, callback));
    }

    public final boolean y(b2 b2Var) {
        if (b2Var.q) {
            return false;
        }
        String str = b2Var.h;
        m0 m0Var = this.b;
        return Objects.equals(str, m0Var.s()) && Arrays.equals(b2Var.g, m0Var.x());
    }

    public final void z(b2 b2Var, j0 j0Var, Utilities.Callback callback) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean y3 = y(b2Var);
            int i10 = b2Var.b;
            TL_wallet.tonConnectSession tonconnectsession = b2Var.a;
            if (y3 && !i(b2Var)) {
                String string = MessagesController.getMainSettings(this.a).getString(j(tonconnectsession.id, i10) + ".transfer", null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(j0Var, b2Var.f, "ton-connect:" + tonconnectsession.id + ":" + i10, new q(this, b2Var, j0Var, callback, 7));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new org.telegram.messenger.a(), new ai.x3(this, callback, b2Var, j0Var, sendtransfer, 6));
                    return;
                } catch (Exception e) {
                    callback.run(h("restore transfer", e));
                    return;
                }
            }
        }
        w(b2Var, j0Var, null, 0, "Wallet unavailable or request expired", callback);
    }
}
