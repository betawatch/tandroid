package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.e20;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.wp;
import org.telegram.ui.e51;
import org.telegram.ui.f60;
import org.telegram.ui.hb0;
import org.telegram.ui.i90;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c2 {
    public final int a;
    public final k0 b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public y1 g;
    public boolean h;

    public c2(k0 k0Var) {
        this.e = -1;
        int i3 = k0Var.a;
        this.a = i3;
        this.b = k0Var;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new c3.b(1), new d(this, 4));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return bd.M0(2131742982, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.messenger.cs, org.telegram.ui.Wallet.n1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y2 D(Context context, final int i3, final x1 x1Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final org.telegram.ui.ActionBar.e6 e6Var, final n60 n60Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        boolean z10;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr;
        String K0;
        String M0;
        f6 f6Var;
        boolean isAttachedToWindow;
        int i10;
        TextView textView;
        k0 k0Var;
        final k0 x10 = k0.x(i3);
        boolean z11 = tL_urlAuthResultRequest != null;
        final TL_wallet.tonConnectSession tonconnectsession = z11 ? null : x1Var.e;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr2 = {null};
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        final ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.ic_ab_close);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        e10.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(e10, h02, null, N, e6Var);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(e10, i12, e6Var, PorterDuff.Mode.SRC_IN);
        pf.a(e10);
        frameLayout.addView(e10, mf.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(38.0f));
        if (z11) {
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.r(tL_urlAuthResultRequest.bot);
            k9Var.e(tL_urlAuthResultRequest.bot, u8Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                z10 = z11;
                inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
                k9Var.p(ac.p(e20.c(webDocument)), "76_76", null, tonconnectsession.manifest);
                frameLayout.addView(k9Var, mf.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
                f10.addView(frameLayout, mf.o(-1, -2));
                TextView textView2 = new TextView(context);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setTextSize(1, 20.0f);
                textView2.setGravity(17);
                if (z10) {
                    TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
                    if (tonconnectmanifest2 != null) {
                        textView2.setText(bd.V(null, null, 2131743170, tonconnectmanifest2.name));
                    } else {
                        textView2.setText(bd.M0(2131743169, null));
                    }
                } else {
                    textView2.setText(bd.V(null, null, 2131743170, l10.p(tL_urlAuthResultRequest.bot)));
                }
                org.telegram.ui.ActionBar.r6.V(textView2, i12, e6Var);
                f10.addView(textView2, mf.t(-2, -2, 49, 36, 16, 36, 0));
                K0 = !z10 ? tL_urlAuthResultRequest.domain : org.telegram.messenger.g0.K0(x1Var.b, false);
                if (!TextUtils.isEmpty(K0)) {
                    f10.addView(h(context, K0, e6Var), mf.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                if (!z10) {
                    x10.g.getClass();
                    if (!w(x1Var)) {
                        M0 = bd.M0(2131743173, null);
                        textView3.setText(M0);
                        org.telegram.ui.ActionBar.r6.V(textView3, i12, e6Var);
                        f10.addView(textView3, mf.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        f10.addView(frameLayout2, mf.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        f6Var = new f6(context, R.drawable.wallet_card_qr, 46);
                        f6Var.l(x10);
                        isAttachedToWindow = f6Var.isAttachedToWindow();
                        i10 = hs.a4;
                        if (isAttachedToWindow || (k0Var = f6Var.a0) == null) {
                            textView = textView3;
                        } else {
                            textView = textView3;
                            int i13 = f6Var.W;
                            if (i13 != i3 || k0Var != x10) {
                                hs.f(i13).n(f6Var, i10);
                            }
                        }
                        f6Var.W = i3;
                        f6Var.a0 = x10;
                        if (f6Var.isAttachedToWindow() && f6Var.a0 != null) {
                            hs.f(i3).c(f6Var, i10);
                        }
                        frameLayout2.addView(f6Var);
                        TextView textView4 = new TextView(context);
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.messenger.k5.m(textView4, 17, null, 2131743172);
                        org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.z6, e6Var);
                        f10.addView(textView4, mf.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                        f10.addView(linearLayout, mf.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final gi.d dVar = new gi.d(context, e6Var, true);
                        dVar.setRoundRadius(24);
                        dVar.e();
                        dVar.setText(bd.M0(2131743189, null));
                        linearLayout.addView(dVar, mf.m(1.0f, 0, 44, 0, 6, 0));
                        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
                        h.setText(bd.M0(2131743174, null));
                        linearLayout.addView(h, mf.m(1.0f, 0, 44, 6, 0, 0));
                        final y2 y2Var = new y2(context, f10, e6Var);
                        y2Var.z0 = new v1(h);
                        final boolean z12 = z10;
                        final kg.t0 t0Var = new kg.t0(z12, h, x10, tonconnectsession, x1Var, textView2, k9Var, textView);
                        final ?? r22 = new cs() { // from class: org.telegram.ui.Wallet.n1
                            @Override // org.telegram.messenger.cs
                            public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                                if (!z12 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession2.id == tonconnectsession.id) {
                                            x1Var.e = tonconnectsession2;
                                        }
                                    }
                                }
                                t0Var.run();
                            }
                        };
                        hs.f(i3).b(r22, i10);
                        t0Var.run();
                        final boolean[] zArr = {false};
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr3 = inputtonconnectoauthsessionArr;
                        y2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.o1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                                hs.f(i3).n(r22, hs.a4);
                                boolean[] zArr2 = zArr;
                                if (zArr2[0]) {
                                    return;
                                }
                                zArr2[0] = true;
                                if (!z12 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr3[0]) == null) {
                                    runnable.run();
                                } else {
                                    n60Var.a(inputtonconnectoauthsession);
                                }
                            }
                        });
                        y2Var.show();
                        e10.setOnClickListener(new p1(y2Var, 0));
                        dVar.setOnClickListener(new hb0(23, h, y2Var));
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr4 = inputtonconnectoauthsessionArr;
                        h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                k0 k0Var2 = x10;
                                c2 c2Var = k0Var2.g;
                                gi.d dVar2 = gi.d.this;
                                if (dVar2.R) {
                                    return;
                                }
                                dVar2.setLoading(true);
                                gi.d dVar3 = dVar;
                                dVar3.setEnabled(false);
                                ImageView imageView = e10;
                                imageView.setEnabled(false);
                                n60 n60Var2 = new n60(dVar2, dVar3, imageView, y2Var, e6Var, t0Var, 4);
                                if (!z12) {
                                    c2Var.getClass();
                                    org.telegram.messenger.g0.h3(new g(c2Var, x1Var, n60Var2, 6));
                                    return;
                                }
                                String t10 = k0Var2.t();
                                byte[] y9 = k0Var2.y();
                                byte[] bArr = y9 == null ? null : (byte[]) y9.clone();
                                s1 s1Var = new s1(0, inputtonconnectoauthsessionArr4, n60Var2);
                                c2Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t10 == null || bArr == null) {
                                    s1Var.a(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = a1.g.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    c2Var.f.sendRequestTyped(tonconnectcreatesession, new c3.b(1), new c1(c2Var, (Object) s1Var, (TLObject) tL_urlAuthResultRequest2, t10, bArr, (Object) put, 3));
                                } catch (JSONException e11) {
                                    s1Var.a(null, c2.i("prepare OAuth request", e11));
                                }
                            }
                        });
                        return y2Var;
                    }
                }
                M0 = bd.M0(2131743171, null);
                textView3.setText(M0);
                org.telegram.ui.ActionBar.r6.V(textView3, i12, e6Var);
                f10.addView(textView3, mf.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                f10.addView(frameLayout22, mf.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                f6Var = new f6(context, R.drawable.wallet_card_qr, 46);
                f6Var.l(x10);
                isAttachedToWindow = f6Var.isAttachedToWindow();
                i10 = hs.a4;
                if (isAttachedToWindow) {
                }
                textView = textView3;
                f6Var.W = i3;
                f6Var.a0 = x10;
                if (f6Var.isAttachedToWindow()) {
                    hs.f(i3).c(f6Var, i10);
                }
                frameLayout22.addView(f6Var);
                TextView textView42 = new TextView(context);
                textView42.setTextSize(1, 14.0f);
                org.telegram.messenger.k5.m(textView42, 17, null, 2131743172);
                org.telegram.ui.ActionBar.r6.V(textView42, org.telegram.ui.ActionBar.k6.z6, e6Var);
                f10.addView(textView42, mf.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                f10.addView(linearLayout2, mf.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final gi.d dVar2 = new gi.d(context, e6Var, true);
                dVar2.setRoundRadius(24);
                dVar2.e();
                dVar2.setText(bd.M0(2131743189, null));
                linearLayout2.addView(dVar2, mf.m(1.0f, 0, 44, 0, 6, 0));
                final gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, true);
                h7.setText(bd.M0(2131743174, null));
                linearLayout2.addView(h7, mf.m(1.0f, 0, 44, 6, 0, 0));
                final y2 y2Var2 = new y2(context, f10, e6Var);
                y2Var2.z0 = new v1(h7);
                final boolean z122 = z10;
                final kg.t0 t0Var2 = new kg.t0(z122, h7, x10, tonconnectsession, x1Var, textView2, k9Var, textView);
                final n1 r222 = new cs() { // from class: org.telegram.ui.Wallet.n1
                    @Override // org.telegram.messenger.cs
                    public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                        if (!z122 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession2.id == tonconnectsession.id) {
                                    x1Var.e = tonconnectsession2;
                                }
                            }
                        }
                        t0Var2.run();
                    }
                };
                hs.f(i3).b(r222, i10);
                t0Var2.run();
                final boolean[] zArr2 = {false};
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr32 = inputtonconnectoauthsessionArr;
                y2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.o1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                        hs.f(i3).n(r222, hs.a4);
                        boolean[] zArr22 = zArr2;
                        if (zArr22[0]) {
                            return;
                        }
                        zArr22[0] = true;
                        if (!z122 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr32[0]) == null) {
                            runnable.run();
                        } else {
                            n60Var.a(inputtonconnectoauthsession);
                        }
                    }
                });
                y2Var2.show();
                e10.setOnClickListener(new p1(y2Var2, 0));
                dVar2.setOnClickListener(new hb0(23, h7, y2Var2));
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr42 = inputtonconnectoauthsessionArr;
                h7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k0 k0Var2 = x10;
                        c2 c2Var = k0Var2.g;
                        gi.d dVar22 = gi.d.this;
                        if (dVar22.R) {
                            return;
                        }
                        dVar22.setLoading(true);
                        gi.d dVar3 = dVar2;
                        dVar3.setEnabled(false);
                        ImageView imageView = e10;
                        imageView.setEnabled(false);
                        n60 n60Var2 = new n60(dVar22, dVar3, imageView, y2Var2, e6Var, t0Var2, 4);
                        if (!z122) {
                            c2Var.getClass();
                            org.telegram.messenger.g0.h3(new g(c2Var, x1Var, n60Var2, 6));
                            return;
                        }
                        String t10 = k0Var2.t();
                        byte[] y9 = k0Var2.y();
                        byte[] bArr = y9 == null ? null : (byte[]) y9.clone();
                        s1 s1Var = new s1(0, inputtonconnectoauthsessionArr42, n60Var2);
                        c2Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t10 == null || bArr == null) {
                            s1Var.a(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = a1.g.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            c2Var.f.sendRequestTyped(tonconnectcreatesession, new c3.b(1), new c1(c2Var, (Object) s1Var, (TLObject) tL_urlAuthResultRequest2, t10, bArr, (Object) put, 3));
                        } catch (JSONException e11) {
                            s1Var.a(null, c2.i("prepare OAuth request", e11));
                        }
                    }
                });
                return y2Var2;
            }
        }
        z10 = z11;
        inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
        frameLayout.addView(k9Var, mf.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
        f10.addView(frameLayout, mf.o(-1, -2));
        TextView textView22 = new TextView(context);
        textView22.setTypeface(org.telegram.messenger.g0.o());
        textView22.setTextSize(1, 20.0f);
        textView22.setGravity(17);
        if (z10) {
        }
        org.telegram.ui.ActionBar.r6.V(textView22, i12, e6Var);
        f10.addView(textView22, mf.t(-2, -2, 49, 36, 16, 36, 0));
        if (!z10) {
        }
        if (!TextUtils.isEmpty(K0)) {
        }
        TextView textView32 = new TextView(context);
        textView32.setTextSize(1, 14.0f);
        textView32.setGravity(17);
        if (!z10) {
        }
        M0 = bd.M0(2131743171, null);
        textView32.setText(M0);
        org.telegram.ui.ActionBar.r6.V(textView32, i12, e6Var);
        f10.addView(textView32, mf.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        f10.addView(frameLayout222, mf.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        f6Var = new f6(context, R.drawable.wallet_card_qr, 46);
        f6Var.l(x10);
        isAttachedToWindow = f6Var.isAttachedToWindow();
        i10 = hs.a4;
        if (isAttachedToWindow) {
        }
        textView = textView32;
        f6Var.W = i3;
        f6Var.a0 = x10;
        if (f6Var.isAttachedToWindow()) {
        }
        frameLayout222.addView(f6Var);
        TextView textView422 = new TextView(context);
        textView422.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView422, 17, null, 2131743172);
        org.telegram.ui.ActionBar.r6.V(textView422, org.telegram.ui.ActionBar.k6.z6, e6Var);
        f10.addView(textView422, mf.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        f10.addView(linearLayout22, mf.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final gi.d dVar22 = new gi.d(context, e6Var, true);
        dVar22.setRoundRadius(24);
        dVar22.e();
        dVar22.setText(bd.M0(2131743189, null));
        linearLayout22.addView(dVar22, mf.m(1.0f, 0, 44, 0, 6, 0));
        final gi.d h72 = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h72.setText(bd.M0(2131743174, null));
        linearLayout22.addView(h72, mf.m(1.0f, 0, 44, 6, 0, 0));
        final y2 y2Var22 = new y2(context, f10, e6Var);
        y2Var22.z0 = new v1(h72);
        final boolean z1222 = z10;
        final kg.t0 t0Var22 = new kg.t0(z1222, h72, x10, tonconnectsession, x1Var, textView22, k9Var, textView);
        final n1 r2222 = new cs() { // from class: org.telegram.ui.Wallet.n1
            @Override // org.telegram.messenger.cs
            public final void didReceivedNotification(int i14, int i15, Object[] objArr) {
                if (!z1222 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            x1Var.e = tonconnectsession2;
                        }
                    }
                }
                t0Var22.run();
            }
        };
        hs.f(i3).b(r2222, i10);
        t0Var22.run();
        final boolean[] zArr22 = {false};
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr322 = inputtonconnectoauthsessionArr;
        y2Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.o1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                hs.f(i3).n(r2222, hs.a4);
                boolean[] zArr222 = zArr22;
                if (zArr222[0]) {
                    return;
                }
                zArr222[0] = true;
                if (!z1222 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr322[0]) == null) {
                    runnable.run();
                } else {
                    n60Var.a(inputtonconnectoauthsession);
                }
            }
        });
        y2Var22.show();
        e10.setOnClickListener(new p1(y2Var22, 0));
        dVar22.setOnClickListener(new hb0(23, h72, y2Var22));
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr422 = inputtonconnectoauthsessionArr;
        h72.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Wallet.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0 k0Var2 = x10;
                c2 c2Var = k0Var2.g;
                gi.d dVar222 = gi.d.this;
                if (dVar222.R) {
                    return;
                }
                dVar222.setLoading(true);
                gi.d dVar3 = dVar22;
                dVar3.setEnabled(false);
                ImageView imageView = e10;
                imageView.setEnabled(false);
                n60 n60Var2 = new n60(dVar222, dVar3, imageView, y2Var22, e6Var, t0Var22, 4);
                if (!z1222) {
                    c2Var.getClass();
                    org.telegram.messenger.g0.h3(new g(c2Var, x1Var, n60Var2, 6));
                    return;
                }
                String t10 = k0Var2.t();
                byte[] y9 = k0Var2.y();
                byte[] bArr = y9 == null ? null : (byte[]) y9.clone();
                s1 s1Var = new s1(0, inputtonconnectoauthsessionArr422, n60Var2);
                c2Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || t10 == null || bArr == null) {
                    s1Var.a(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = a1.g.s(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    c2Var.f.sendRequestTyped(tonconnectcreatesession, new c3.b(1), new c1(c2Var, (Object) s1Var, (TLObject) tL_urlAuthResultRequest2, t10, bArr, (Object) put, 3));
                } catch (JSONException e11) {
                    s1Var.a(null, c2.i("prepare OAuth request", e11));
                }
            }
        });
        return y2Var22;
    }

    public static LinearLayout F(Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(f10, d02, N, null, e6Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
        n4Var.setText(str);
        f10.addView(n4Var, mf.o(-1, -2));
        return f10;
    }

    public static void G(String str, JSONObject jSONObject) {
        H(str, jSONObject);
        switch (x(TeXSymbolParser.TYPE_ATTR, jSONObject)) {
            case "binary":
                String x10 = x("bytes", jSONObject);
                if (!x10.matches("[A-Za-z0-9+/]*={0,2}") || !Base64.encodeToString(Base64.decode(x10, 2), 2).replace("=", "").equals(x10.replace("=", ""))) {
                    throw new IllegalArgumentException("Invalid base64 data");
                }
                return;
            case "cell":
                x("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(x("cell", jSONObject))) {
                    throw new IllegalArgumentException("Invalid data cell");
                }
                return;
            case "text":
                x("text", jSONObject);
                return;
            default:
                throw new IllegalArgumentException("Unknown signing data type");
        }
    }

    public static void H(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(x("network", jSONObject))) {
            throw new IllegalArgumentException("Wrong network");
        }
        if (jSONObject.has("from") && !WalletEngine2.sameTonConnectAddress(x("from", jSONObject), str)) {
            throw new IllegalArgumentException("Wrong signer");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r0.longValue() <= 4294967295L) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I(JSONObject jSONObject, String str, int i3) {
        H(str, jSONObject);
        if (jSONObject.has("valid_until")) {
            Object obj = jSONObject.get("valid_until");
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() == number.longValue()) {
                    if (number.longValue() > i3) {
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
        int i10 = 0;
        long j10 = 0;
        while (i10 < jSONArray.length()) {
            a2 a2Var = new a2(jSONArray.getJSONObject(i10));
            long j11 = a2Var.e;
            long j12 = j10 + j11;
            if (!((j11 ^ j10) < 0) && !((j10 ^ j12) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(a2Var);
            i10++;
            j10 = j12;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ void a(c2 c2Var, TL_wallet.tonConnectSession tonconnectsession, String str, k kVar) {
        if (c2Var.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(c2Var.d, new y0(tonconnectsession, 0));
                c2Var.b.L();
            }
            kVar.a(str);
        }
    }

    public static SpannableStringBuilder b(long j10) {
        String o10 = k0.o(j10, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o10);
        int indexOf = o10.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        wp wpVar = new wp(R.drawable.wallet_gram_small, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout c(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.mini_gram_24);
        imageView.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout.addView(imageView, mf.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity((charSequence2 == null && str == null) ? 16 : 48);
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setSingleLine(charSequence2 != null);
        if (charSequence2 == null) {
            textView.setGravity(16);
        }
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams r5 = charSequence2 == null ? mf.r(-1, org.telegram.messenger.g0.L(24.0f), 16) : mf.o(-1, -2);
        r5.weight = 0.0f;
        linearLayout2.addView(textView, r5);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView g7 = org.telegram.messenger.k5.g(context, 1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.z6, e6Var);
            g7.setSingleLine(true);
            g7.setEllipsize(TextUtils.TruncateAt.END);
            g7.setText(charSequence2);
            linearLayout2.addView(g7, mf.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = new TextView(context);
            org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, false, false, null);
            t4Var.x = false;
            t4Var.w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xl, e6Var));
            textView2.setBackground(t4Var);
            textView2.setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, i3, e6Var);
            textView2.setMaxLines(2);
            textView2.setText(str);
            linearLayout2.addView(textView2, mf.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, mf.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(21);
            textView3.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i3 = org.telegram.ui.ActionBar.k6.ik;
            }
            org.telegram.ui.ActionBar.r6.V(textView3, i3, e6Var);
            linearLayout.addView(textView3, mf.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject g(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i3) {
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
                        G(str, jSONObject2);
                        jSONObject.put("data", jSONObject2);
                    }
                }
                if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                    throw new IllegalArgumentException("Expected one JSON transaction parameter");
                }
                JSONObject jSONObject3 = new JSONObject(jSONArray.getString(0));
                I(jSONObject3, str, i3);
                jSONObject.put("transaction", jSONObject3);
            } else if (jSONArray.length() != 0) {
                throw new IllegalArgumentException("Disconnect takes no parameters");
            }
        } catch (Exception e10) {
            jSONObject.put("errorCode", 1).put("errorMessage", e10.getMessage());
        }
        if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
            jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
        }
        return jSONObject;
    }

    public static TextView h(Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Ci, e6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String i(String str, Exception exc) {
        org.telegram.messenger.a8.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }

    public static SpannableStringBuilder k(long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new wp(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) k0.o(-j10, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) bd.M0(2131749524, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String l(long j10, long j11) {
        StringBuilder t10 = a1.g.t(j10, "tonconnect_reply.", ".");
        t10.append(j11);
        return t10.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            org.telegram.messenger.a8.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if (!"https".equalsIgnoreCase(create.getScheme()) || create.getHost() == null) {
            throw new IllegalArgumentException("Manifest URL must use HTTPS and include a host");
        }
        return create.getHost().toLowerCase(Locale.ROOT);
    }

    public static void q(Context context, int i3, long j10, int i10, org.telegram.ui.ActionBar.e6 e6Var, i90 i90Var) {
        k0 x10 = k0.x(i3);
        c2 c2Var = x10.g;
        f60 f60Var = new f60(context, i3, x10, e6Var, i90Var);
        if (c2Var.h || c2Var.g != null) {
            f60Var.a(null, "A TON Connect request is already open");
            return;
        }
        String string = hp.s1(c2Var.a).e7.getString(l(j10, i10), null);
        if (string == null) {
            c2Var.h = true;
            c2Var.b.m0(new ci.f8(c2Var, j10, f60Var, i10));
            return;
        }
        c2Var.h = true;
        e51 e51Var = new e51(8, c2Var, f60Var);
        try {
            c2Var.E(j10, i10, new JSONObject(string), e51Var);
        } catch (Exception e10) {
            e51Var.a(i("restore response", e10));
        }
    }

    public static z1 r(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i3) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            throw new IllegalArgumentException("Manifest URL changed");
        }
        String n4 = n(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest == null || !n4.equals(n(tonconnectmanifest.url))) {
            throw new IllegalArgumentException("Manifest domain does not match the connection request");
        }
        return s(h0Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n4, str4, tonconnectchallenge, i3);
    }

    public static z1 s(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i3) {
        JSONObject jSONObject;
        String str4;
        int i10;
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
        int i11 = 0;
        while (true) {
            String str8 = "ton_proof";
            String str9 = "ton_addr";
            if (i11 >= jSONArray2.length()) {
                if (!hashSet.contains("ton_addr")) {
                    throw new IllegalArgumentException("Missing ton_addr item");
                }
                if (tonconnectchallenge != null) {
                    put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                }
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new z1(jSONObject2);
                }
                if (tonconnectchallenge.event_id < 0) {
                    throw new IllegalArgumentException("Invalid connect event ID");
                }
                JSONArray jSONArray3 = new JSONArray();
                TL_wallet.walletOwnershipProof walletownershipproof = null;
                int i12 = 0;
                while (i12 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                    String string = jSONObject3.getString("name");
                    if (str9.equals(string)) {
                        jSONArray3.put(jSONObject2.getJSONObject(str7));
                        jSONObject = jSONObject2;
                        str4 = str7;
                        i10 = i12;
                        str5 = str8;
                        str6 = str9;
                    } else if (str8.equals(string)) {
                        String string2 = jSONObject3.getString("payload");
                        str4 = str7;
                        i10 = i12;
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(h0Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i3));
                        str5 = str8;
                        TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                        walletownershipproof2.timestamp = i3;
                        str6 = str9;
                        jSONObject = jSONObject2;
                        walletownershipproof2.signature = Base64.decode(jSONObject4.getString("signature"), 2);
                        jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i3).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject4.getString("signature"))));
                        walletownershipproof = walletownershipproof2;
                    } else {
                        jSONObject = jSONObject2;
                        str4 = str7;
                        i10 = i12;
                        str5 = str8;
                        str6 = str9;
                        jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                    }
                    i12 = i10 + 1;
                    h0Var2 = h0Var;
                    jSONArray2 = jSONArray;
                    str7 = str4;
                    str8 = str5;
                    str9 = str6;
                    jSONObject2 = jSONObject;
                }
                JSONObject jSONObject5 = jSONObject2;
                JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "gramwallet").put("appVersion", org.telegram.messenger.r2.c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", hs.e4)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", hs.e4)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                if (str3 != null) {
                    put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                }
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                z1 z1Var = new z1(jSONObject6);
                z1Var.d = walletownershipproof;
                return z1Var;
            }
            JSONObject jSONObject7 = jSONArray2.getJSONObject(i11);
            int i13 = i11;
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
            i11 = i13 + 1;
        }
    }

    public static z1 t(h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j10) {
        if (j10 < 0 || tonconnectsession.client_id == null) {
            throw new IllegalArgumentException("Invalid disconnect session or event ID");
        }
        return new z1(WalletEngine2.tonConnectCrypto(h0Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j10).put("payload", new JSONObject()))));
    }

    public static TextView v(int i3, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(x1 x1Var) {
        if (x1Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(x1Var.a).getJSONArray("items");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i3).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                i("read proof request", e10);
            }
        }
        return false;
    }

    public static String x(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException(str.concat(" must be a string"));
    }

    public static String z(TLRPC.TL_error tL_error, String str) {
        String str2;
        String o10;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder u10 = a1.g.u("[gram-wallet] TON Connect ", str, ": ");
        if (tL_error == null) {
            o10 = "";
        } else {
            o10 = a1.g.o(tL_error.code, " ", new StringBuilder("code="));
        }
        u10.append(o10);
        u10.append(str2);
        org.telegram.messenger.a8.d(u10.toString());
        return str2;
    }

    public final boolean A(y1 y1Var) {
        if (y1Var.q) {
            return false;
        }
        String str = y1Var.h;
        k0 k0Var = this.b;
        return Objects.equals(str, k0Var.t()) && Arrays.equals(y1Var.g, k0Var.y());
    }

    public final void B(y1 y1Var, h0 h0Var, u10 u10Var) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(y1Var);
            int i3 = y1Var.b;
            TL_wallet.tonConnectSession tonconnectsession = y1Var.a;
            if (A && !j(y1Var)) {
                String string = hp.s1(this.a).e7.getString(l(tonconnectsession.id, i3) + ".transfer", null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(h0Var, y1Var.f, "ton-connect:" + tonconnectsession.id + ":" + i3, new q(this, y1Var, h0Var, u10Var, 7));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new c3.b(1), new ci.g3(this, u10Var, y1Var, h0Var, sendtransfer, 6));
                    return;
                } catch (Exception e10) {
                    u10Var.a(i("restore transfer", e10));
                    return;
                }
            }
        }
        y(y1Var, h0Var, null, 0, "Wallet unavailable or request expired", u10Var);
    }

    public final void E(long j10, int i3, JSONObject jSONObject, u10 u10Var) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j10;
        tonconnectsubmitresponse.msg_id = i3;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new c3.b(1), new ai.f0(this, u10Var, jSONObject, j10, i3));
    }

    public final boolean d(x1 x1Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = x1Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(x1Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = x1Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(x1Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        k0 k0Var = this.b;
        return str.equals(k0Var.t()) && Arrays.equals(bArr, k0Var.y());
    }

    public final void e(int i3, long j10, u10 u10Var) {
        long j11 = i3;
        hp.s1(this.a).e7.edit().remove(l(j10, j11)).remove(l(j10, j11) + ".transfer").apply();
        y1 y1Var = this.g;
        if (y1Var != null && y1Var.a.id == j10 && y1Var.b == i3) {
            y1Var.n = true;
        }
        u10Var.a(null);
    }

    public final void f(y1 y1Var, boolean z10, u10 u10Var) {
        boolean z11 = y1Var.m;
        TL_wallet.tonConnectSession tonconnectsession = y1Var.a;
        if (z11) {
            return;
        }
        if (y1Var.n || j(y1Var) || !A(y1Var) || !(z10 || y1Var.l >= 0 || "disconnect".equals(y1Var.e) || y1Var.p)) {
            u10Var.a("Request expired, was processed, or the wallet changed");
            return;
        }
        y1Var.m = true;
        m mVar = new m(this, y1Var, u10Var, 2);
        String string = hp.s1(this.a).e7.getString(l(tonconnectsession.id, y1Var.b), null);
        if (string == null) {
            this.b.z(new v(this, mVar, y1Var, z10, 1), true, false);
            return;
        }
        try {
            try {
                E(tonconnectsession.id, y1Var.b, new JSONObject(string), mVar);
            } catch (Exception e10) {
                e = e10;
                mVar = mVar;
                mVar.a(i("restore response", e));
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final boolean j(y1 y1Var) {
        long currentTime = this.f.getCurrentTime();
        if (y1Var.c <= currentTime) {
            return true;
        }
        b2 b2Var = y1Var.f;
        if (b2Var == null) {
            return false;
        }
        long j10 = b2Var.a;
        return j10 != 0 && j10 <= currentTime;
    }

    public final void o(int i3, long j10) {
        y1 y1Var = this.g;
        if (y1Var == null || y1Var.a.id != j10 || y1Var.b != i3 || y1Var.m) {
            return;
        }
        y1Var.n = true;
        Runnable runnable = y1Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        y0 y0Var = new y0(tonconnectsession, 1);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, y0Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        y1 y1Var = this.g;
        if (y1Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = y1Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                y1Var.q = true;
                o(y1Var.b, tonconnectsession.id);
            }
        }
        hs.f(this.a).k(hs.a4, this.b, tonconnectsession);
    }

    public final void u(y1 y1Var) {
        y1Var.r = null;
        if (y1Var.m || this.g != y1Var) {
            return;
        }
        this.g = null;
    }

    public final void y(y1 y1Var, h0 h0Var, Object obj, int i3, String str, u10 u10Var) {
        Utilities.e.c(new ai.d3(this, y1Var, i3, obj, str, h0Var, u10Var));
    }
}
