package org.telegram.ui.Wallet;

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
import org.telegram.messenger.bi;
import org.telegram.messenger.jh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.df;
import org.telegram.ui.e90;
import org.telegram.ui.ft;
import org.telegram.ui.vy0;
import org.telegram.ui.zb0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d2 {
    public final int a;
    public final k0 b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public z1 g;
    public boolean h;

    public d2(k0 k0Var) {
        this.e = -1;
        int i10 = k0Var.a;
        this.a = i10;
        this.b = k0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new org.telegram.messenger.a(), new d(this, 5));
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
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.messenger.NotificationCenter$NotificationCenterDelegate, org.telegram.ui.Wallet.c1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i2 B(Context context, final int i10, final y1 y1Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final org.telegram.ui.ActionBar.e6 e6Var, final e90 e90Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        ImageView imageView;
        boolean z10;
        String hostAuthority;
        String string;
        i5 i5Var;
        k0 k0Var;
        int i11;
        final k0 v = k0.v(i10);
        boolean z11 = tL_urlAuthResultRequest != null;
        final TL_wallet.tonConnectSession tonconnectsession = z11 ? null : y1Var.e;
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
        LinearLayout e7 = bi.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, -1));
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), PorterDuff.Mode.SRC_IN));
        w7.z5.a(imageView2);
        frameLayout.addView(imageView2, w7.x5.a(48.0f, 4.0f, 0.0f, 0.0f, 0.0f, 48, 51));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(38.0f));
        if (z11) {
            j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
            j9Var.r(tL_urlAuthResultRequest.bot);
            y9Var.e(tL_urlAuthResultRequest.bot, j9Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                imageView = imageView2;
                z10 = z11;
                y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession.manifest);
                frameLayout.addView(y9Var, w7.x5.a(76.0f, 0.0f, 32.0f, 0.0f, 0.0f, 76, 49));
                e7.addView(frameLayout, w7.x5.n(-1, -2));
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
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
                e7.addView(textView, w7.x5.t(-2, -2, 49, 36, 16, 36, 0));
                hostAuthority = !z10 ? tL_urlAuthResultRequest.domain : AndroidUtilities.getHostAuthority(y1Var.b);
                if (!TextUtils.isEmpty(hostAuthority)) {
                    e7.addView(g(context, hostAuthority, e6Var), w7.x5.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                if (!z10) {
                    v.g.getClass();
                    if (!u(y1Var)) {
                        string = LocaleController.getString(R.string.WalletConnectInfo);
                        textView2.setText(string);
                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
                        e7.addView(textView2, w7.x5.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        e7.addView(frameLayout2, w7.x5.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        i5Var = new i5(context, false);
                        i5Var.g(v);
                        if (i5Var.isAttachedToWindow() && (k0Var = i5Var.U) != null && ((i11 = i5Var.T) != i10 || k0Var != v)) {
                            NotificationCenter.getInstance(i11).removeObserver(i5Var, NotificationCenter.walletUpdate);
                        }
                        i5Var.T = i10;
                        i5Var.U = v;
                        if (i5Var.isAttachedToWindow() && i5Var.U != null) {
                            NotificationCenter.getInstance(i10).addObserver(i5Var, NotificationCenter.walletUpdate);
                        }
                        frameLayout2.addView(i5Var);
                        TextView textView3 = new TextView(context);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setText(LocaleController.getString(R.string.WalletConnectPermissionInfo));
                        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
                        e7.addView(textView3, w7.x5.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                        e7.addView(linearLayout, w7.x5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final ci.d dVar = new ci.d(context, e6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.d();
                        dVar.setText(LocaleController.getString(R.string.WalletCancel));
                        linearLayout.addView(dVar, w7.x5.m(1.0f, 0, 44, 0, 6, 0));
                        final ci.d f7 = bi.f(24, context, e6Var, true);
                        f7.setText(LocaleController.getString(R.string.WalletConnect));
                        linearLayout.addView(f7, w7.x5.m(1.0f, 0, 44, 6, 0, 0));
                        final i2 i2Var = new i2(context, e7, e6Var);
                        i2Var.setDelegate(new w1(f7));
                        final ImageView imageView3 = imageView;
                        final boolean z12 = z10;
                        final gg.x0 x0Var = new gg.x0(z12, f7, v, tonconnectsession, y1Var, textView, y9Var, textView2);
                        final ?? r42 = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.c1
                            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                            public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                                if (!z12 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession2.id == tonconnectsession.id) {
                                            y1Var.e = tonconnectsession2;
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
                        i2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.d1
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
                                    e90Var.run(inputtonconnectoauthsession);
                                }
                            }
                        });
                        i2Var.show();
                        imageView3.setOnClickListener(new e1(i2Var, 0));
                        dVar.setOnClickListener(new vy0(11, f7, i2Var));
                        f7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                k0 k0Var2 = v;
                                d2 d2Var = k0Var2.g;
                                ci.d dVar2 = ci.d.this;
                                if (dVar2.N) {
                                    return;
                                }
                                dVar2.setLoading(true);
                                ci.d dVar3 = dVar;
                                dVar3.setEnabled(false);
                                ImageView imageView4 = imageView3;
                                imageView4.setEnabled(false);
                                e90 e90Var2 = new e90(dVar2, dVar3, imageView4, i2Var, e6Var, x0Var, 3);
                                if (!z13) {
                                    d2Var.getClass();
                                    AndroidUtilities.runOnUIThread(new k(d2Var, y1Var, e90Var2, 3));
                                    return;
                                }
                                String r10 = k0Var2.r();
                                byte[] w10 = k0Var2.w();
                                byte[] bArr = w10 == null ? null : (byte[]) w10.clone();
                                ai.m0 m0Var = new ai.m0(25, inputtonconnectoauthsessionArr, e90Var2);
                                d2Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || r10 == null || bArr == null) {
                                    m0Var.run(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = a1.g.t(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    d2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new g1(d2Var, m0Var, tL_urlAuthResultRequest2, r10, bArr, put, 2));
                                } catch (JSONException e10) {
                                    m0Var.run(null, d2.h("prepare OAuth request", e10));
                                }
                            }
                        });
                        return i2Var;
                    }
                }
                string = LocaleController.getString(R.string.WalletConnectProofInfo);
                textView2.setText(string);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
                e7.addView(textView2, w7.x5.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                e7.addView(frameLayout22, w7.x5.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                i5Var = new i5(context, false);
                i5Var.g(v);
                if (i5Var.isAttachedToWindow()) {
                    NotificationCenter.getInstance(i11).removeObserver(i5Var, NotificationCenter.walletUpdate);
                }
                i5Var.T = i10;
                i5Var.U = v;
                if (i5Var.isAttachedToWindow()) {
                    NotificationCenter.getInstance(i10).addObserver(i5Var, NotificationCenter.walletUpdate);
                }
                frameLayout22.addView(i5Var);
                TextView textView32 = new TextView(context);
                textView32.setTextSize(1, 14.0f);
                textView32.setGravity(17);
                textView32.setText(LocaleController.getString(R.string.WalletConnectPermissionInfo));
                textView32.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
                e7.addView(textView32, w7.x5.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                e7.addView(linearLayout2, w7.x5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final ci.d dVar2 = new ci.d(context, e6Var, true);
                dVar2.setRoundRadius(24);
                dVar2.d();
                dVar2.setText(LocaleController.getString(R.string.WalletCancel));
                linearLayout2.addView(dVar2, w7.x5.m(1.0f, 0, 44, 0, 6, 0));
                final ci.d f72 = bi.f(24, context, e6Var, true);
                f72.setText(LocaleController.getString(R.string.WalletConnect));
                linearLayout2.addView(f72, w7.x5.m(1.0f, 0, 44, 6, 0, 0));
                final i2 i2Var2 = new i2(context, e7, e6Var);
                i2Var2.setDelegate(new w1(f72));
                final ImageView imageView32 = imageView;
                final boolean z122 = z10;
                final gg.x0 x0Var2 = new gg.x0(z122, f72, v, tonconnectsession, y1Var, textView, y9Var, textView2);
                final c1 r422 = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.c1
                    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                    public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                        if (!z122 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession2.id == tonconnectsession.id) {
                                    y1Var.e = tonconnectsession2;
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
                i2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.d1
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
                            e90Var.run(inputtonconnectoauthsession);
                        }
                    }
                });
                i2Var2.show();
                imageView32.setOnClickListener(new e1(i2Var2, 0));
                dVar2.setOnClickListener(new vy0(11, f72, i2Var2));
                f72.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k0 k0Var2 = v;
                        d2 d2Var = k0Var2.g;
                        ci.d dVar22 = ci.d.this;
                        if (dVar22.N) {
                            return;
                        }
                        dVar22.setLoading(true);
                        ci.d dVar3 = dVar2;
                        dVar3.setEnabled(false);
                        ImageView imageView4 = imageView32;
                        imageView4.setEnabled(false);
                        e90 e90Var2 = new e90(dVar22, dVar3, imageView4, i2Var2, e6Var, x0Var2, 3);
                        if (!z132) {
                            d2Var.getClass();
                            AndroidUtilities.runOnUIThread(new k(d2Var, y1Var, e90Var2, 3));
                            return;
                        }
                        String r10 = k0Var2.r();
                        byte[] w10 = k0Var2.w();
                        byte[] bArr = w10 == null ? null : (byte[]) w10.clone();
                        ai.m0 m0Var = new ai.m0(25, inputtonconnectoauthsessionArr, e90Var2);
                        d2Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || r10 == null || bArr == null) {
                            m0Var.run(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = a1.g.t(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            d2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new g1(d2Var, m0Var, tL_urlAuthResultRequest2, r10, bArr, put, 2));
                        } catch (JSONException e10) {
                            m0Var.run(null, d2.h("prepare OAuth request", e10));
                        }
                    }
                });
                return i2Var2;
            }
        }
        imageView = imageView2;
        z10 = z11;
        frameLayout.addView(y9Var, w7.x5.a(76.0f, 0.0f, 32.0f, 0.0f, 0.0f, 76, 49));
        e7.addView(frameLayout, w7.x5.n(-1, -2));
        TextView textView4 = new TextView(context);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        if (z10) {
        }
        textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        e7.addView(textView4, w7.x5.t(-2, -2, 49, 36, 16, 36, 0));
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
        textView22.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        e7.addView(textView22, w7.x5.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        e7.addView(frameLayout222, w7.x5.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        i5Var = new i5(context, false);
        i5Var.g(v);
        if (i5Var.isAttachedToWindow()) {
        }
        i5Var.T = i10;
        i5Var.U = v;
        if (i5Var.isAttachedToWindow()) {
        }
        frameLayout222.addView(i5Var);
        TextView textView322 = new TextView(context);
        textView322.setTextSize(1, 14.0f);
        textView322.setGravity(17);
        textView322.setText(LocaleController.getString(R.string.WalletConnectPermissionInfo));
        textView322.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        e7.addView(textView322, w7.x5.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        e7.addView(linearLayout22, w7.x5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final ci.d dVar22 = new ci.d(context, e6Var, true);
        dVar22.setRoundRadius(24);
        dVar22.d();
        dVar22.setText(LocaleController.getString(R.string.WalletCancel));
        linearLayout22.addView(dVar22, w7.x5.m(1.0f, 0, 44, 0, 6, 0));
        final ci.d f722 = bi.f(24, context, e6Var, true);
        f722.setText(LocaleController.getString(R.string.WalletConnect));
        linearLayout22.addView(f722, w7.x5.m(1.0f, 0, 44, 6, 0, 0));
        final i2 i2Var22 = new i2(context, e7, e6Var);
        i2Var22.setDelegate(new w1(f722));
        final ImageView imageView322 = imageView;
        final boolean z1222 = z10;
        final gg.x0 x0Var22 = new gg.x0(z1222, f722, v, tonconnectsession, y1Var, textView4, y9Var, textView22);
        final c1 r4222 = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.c1
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i13, int i14, Object[] objArr) {
                if (!z1222 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            y1Var.e = tonconnectsession2;
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
        i2Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.d1
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
                    e90Var.run(inputtonconnectoauthsession);
                }
            }
        });
        i2Var22.show();
        imageView322.setOnClickListener(new e1(i2Var22, 0));
        dVar22.setOnClickListener(new vy0(11, f722, i2Var22));
        f722.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0 k0Var2 = v;
                d2 d2Var = k0Var2.g;
                ci.d dVar222 = ci.d.this;
                if (dVar222.N) {
                    return;
                }
                dVar222.setLoading(true);
                ci.d dVar3 = dVar22;
                dVar3.setEnabled(false);
                ImageView imageView4 = imageView322;
                imageView4.setEnabled(false);
                e90 e90Var2 = new e90(dVar222, dVar3, imageView4, i2Var22, e6Var, x0Var22, 3);
                if (!z1322) {
                    d2Var.getClass();
                    AndroidUtilities.runOnUIThread(new k(d2Var, y1Var, e90Var2, 3));
                    return;
                }
                String r10 = k0Var2.r();
                byte[] w10 = k0Var2.w();
                byte[] bArr = w10 == null ? null : (byte[]) w10.clone();
                ai.m0 m0Var = new ai.m0(25, inputtonconnectoauthsessionArr, e90Var2);
                d2Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || r10 == null || bArr == null) {
                    m0Var.run(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = a1.g.t(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    d2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new g1(d2Var, m0Var, tL_urlAuthResultRequest2, r10, bArr, put, 2));
                } catch (JSONException e10) {
                    m0Var.run(null, d2.h("prepare OAuth request", e10));
                }
            }
        });
        return i2Var22;
    }

    public static LinearLayout D(Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout e7 = bi.e(context, 1);
        e7.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var)));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, e6Var);
        m4Var.setText(str);
        e7.addView(m4Var, w7.x5.n(-1, -2));
        return e7;
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
        long j3 = 0;
        while (i11 < jSONArray.length()) {
            b2 b2Var = new b2(jSONArray.getJSONObject(i11));
            long j10 = b2Var.e;
            long j11 = j3 + j10;
            if (!((j10 ^ j3) < 0) && !((j3 ^ j11) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(b2Var);
            i11++;
            j3 = j11;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ void a(d2 d2Var, TL_wallet.tonConnectSession tonconnectsession, String str, j jVar) {
        if (d2Var.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(d2Var.d, new a1(tonconnectsession, 0));
                d2Var.b.I();
            }
            jVar.run(str);
        }
    }

    public static LinearLayout b(Context context, int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.e6 e6Var) {
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
        linearLayout.addView(imageView, w7.x5.p(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity((charSequence2 == null && str == null) ? 16 : 48);
        TextView textView = new TextView(context);
        bi.k(16.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        textView.setSingleLine(charSequence2 != null);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams q6 = charSequence2 == null ? w7.x5.q(-1, AndroidUtilities.dp(24.0f), 16) : w7.x5.n(-1, -2);
        q6.weight = 0.0f;
        linearLayout2.addView(textView, q6);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView f7 = org.telegram.messenger.q.f(context, 1, 14.0f);
            f7.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
            f7.setSingleLine(true);
            f7.setEllipsize(TextUtils.TruncateAt.END);
            f7.setText(charSequence2);
            linearLayout2.addView(f7, w7.x5.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, false, false, null);
            f5Var.x = false;
            f5Var.w = Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.jl, e6Var));
            textView2.setBackground(f5Var);
            textView2.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, w7.x5.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, w7.x5.o(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            textView3.setTextColor(spannableStringBuilder.toString().startsWith("+") ? org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uj, e6Var) : org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
            linearLayout.addView(textView3, w7.x5.p(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject f(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i10) {
        if (tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Missing registered session key");
        }
        JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
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
        } catch (Exception e7) {
            jSONObject.put("errorCode", 1).put("errorMessage", e7.getMessage());
        }
        if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
            jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
        }
        return jSONObject;
    }

    public static TextView g(Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        bi.k(14.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var));
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

    public static String j(long j3, long j10) {
        StringBuilder u10 = a1.g.u(j3, "tonconnect_reply.", ".");
        u10.append(j10);
        return u10.toString();
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

    public static void o(Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var, zb0 zb0Var) {
        k0 v = k0.v(i10);
        d2 d2Var = v.g;
        jh jhVar = new jh(context, i10, v, e6Var, zb0Var);
        if (d2Var.h || d2Var.g != null) {
            jhVar.run(null, "A TON Connect request is already open");
            return;
        }
        String string = MessagesController.getMainSettings(d2Var.a).getString(j(j3, i11), null);
        if (string == null) {
            d2Var.h = true;
            d2Var.b.h0(new org.telegram.messenger.h7(d2Var, j3, jhVar, i11, 16));
            return;
        }
        d2Var.h = true;
        ft ftVar = new ft(24, d2Var, jhVar);
        try {
            d2Var.C(j3, i11, new JSONObject(string), ftVar);
        } catch (Exception e7) {
            ftVar.run(h("restore response", e7));
        }
    }

    public static a2 p(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            throw new IllegalArgumentException("Manifest URL changed");
        }
        String l4 = l(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest == null || !l4.equals(l(tonconnectmanifest.url))) {
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        return q(h0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), l4, str4, tonconnectchallenge, i10);
    }

    public static a2 q(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i10) {
        JSONObject jSONObject;
        String str4;
        int i11;
        String str5;
        String str6;
        h0 h0Var2 = h0Var;
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
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new a2(jSONObject2);
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
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i10));
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
                    h0Var2 = h0Var;
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
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                a2 a2Var = new a2(jSONObject6);
                a2Var.d = walletownershipproof;
                return a2Var;
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

    public static a2 r(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j3) {
        if (j3 < 0 || tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Invalid disconnect session or event ID");
        }
        return new a2(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j3).put("payload", new JSONObject()))));
    }

    public static TextView t(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i10);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView.setGravity(17);
        return textView;
    }

    public static boolean u(y1 y1Var) {
        if (y1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(y1Var.a).getJSONArray("items");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i10).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e7) {
                h("read proof request", e7);
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
        String o9;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder w10 = a1.g.w("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            o9 = "";
        } else {
            o9 = a1.g.o(tL_error.code, " ", new StringBuilder("code="));
        }
        w10.append(o9);
        w10.append(str2);
        FileLog.e(w10.toString());
        return str2;
    }

    public final void C(long j3, int i10, JSONObject jSONObject, Utilities.Callback callback) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j3;
        tonconnectsubmitresponse.msg_id = i10;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new org.telegram.messenger.a(), new org.telegram.ui.Components.b3(this, callback, jSONObject, j3, i10));
    }

    public final boolean c(y1 y1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = y1Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(y1Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = y1Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(y1Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        k0 k0Var = this.b;
        return str.equals(k0Var.r()) && Arrays.equals(bArr, k0Var.w());
    }

    public final void d(long j3, int i10, Utilities.Callback callback) {
        long j10 = i10;
        MessagesController.getMainSettings(this.a).edit().remove(j(j3, j10)).remove(j(j3, j10) + ".transfer").apply();
        z1 z1Var = this.g;
        if (z1Var != null && z1Var.a.id == j3 && z1Var.b == i10) {
            z1Var.n = true;
        }
        callback.run(null);
    }

    public final void e(z1 z1Var, boolean z10, Utilities.Callback callback) {
        boolean z11 = z1Var.m;
        TL_wallet.tonConnectSession tonconnectsession = z1Var.a;
        if (z11) {
            return;
        }
        if (z1Var.n || i(z1Var) || !y(z1Var) || !(z10 || z1Var.l >= 0 || "disconnect".equals(z1Var.e) || z1Var.p)) {
            callback.run("Request expired, was processed, or the wallet changed");
            return;
        }
        z1Var.m = true;
        o oVar = new o(this, z1Var, callback, 2);
        String string = MessagesController.getMainSettings(this.a).getString(j(tonconnectsession.id, z1Var.b), null);
        if (string == null) {
            this.b.x(new v(this, oVar, z1Var, z10, 1), true, false);
            return;
        }
        try {
        } catch (Exception e7) {
            e = e7;
        }
        try {
            C(tonconnectsession.id, z1Var.b, new JSONObject(string), oVar);
        } catch (Exception e10) {
            e = e10;
            oVar = oVar;
            oVar.run(h("restore response", e));
        }
    }

    public final boolean i(z1 z1Var) {
        long currentTime = this.f.getCurrentTime();
        if (z1Var.c <= currentTime) {
            return true;
        }
        c2 c2Var = z1Var.f;
        if (c2Var == null) {
            return false;
        }
        long j3 = c2Var.a;
        return j3 != 0 && j3 <= currentTime;
    }

    public final void m(int i10, long j3) {
        z1 z1Var = this.g;
        if (z1Var == null || z1Var.a.id != j3 || z1Var.b != i10 || z1Var.m) {
            return;
        }
        z1Var.n = true;
        Runnable runnable = z1Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void n(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        a1 a1Var = new a1(tonconnectsession, 1);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, a1Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        z1 z1Var = this.g;
        if (z1Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = z1Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                z1Var.q = true;
                m(z1Var.b, tonconnectsession.id);
            }
        }
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.walletUpdate, this.b, tonconnectsession);
    }

    public final void s(z1 z1Var) {
        z1Var.r = null;
        if (z1Var.m || this.g != z1Var) {
            return;
        }
        this.g = null;
    }

    public final void w(z1 z1Var, h0 h0Var, Object obj, int i10, String str, Utilities.Callback callback) {
        Utilities.globalQueue.postRunnable(new gg.d1(this, z1Var, i10, obj, str, h0Var, callback));
    }

    public final boolean y(z1 z1Var) {
        if (z1Var.q) {
            return false;
        }
        String str = z1Var.h;
        k0 k0Var = this.b;
        return Objects.equals(str, k0Var.r()) && Arrays.equals(z1Var.g, k0Var.w());
    }

    public final void z(z1 z1Var, h0 h0Var, Utilities.Callback callback) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean y3 = y(z1Var);
            int i10 = z1Var.b;
            TL_wallet.tonConnectSession tonconnectsession = z1Var.a;
            if (y3 && !i(z1Var)) {
                String string = MessagesController.getMainSettings(this.a).getString(j(tonconnectsession.id, i10) + ".transfer", null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(h0Var, z1Var.f, "ton-connect:" + tonconnectsession.id + ":" + i10, new n(this, z1Var, h0Var, callback, 7));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new org.telegram.messenger.a(), new df(this, callback, z1Var, h0Var, sendtransfer, 5));
                    return;
                } catch (Exception e7) {
                    callback.run(h("restore transfer", e7));
                    return;
                }
            }
        }
        w(z1Var, h0Var, null, 0, "Wallet unavailable or request expired", callback);
    }
}
